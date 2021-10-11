package com.ukrcard.rest2iso.service;

import com.imohsenb.ISO8583.builders.ISOMessageBuilder;
import com.imohsenb.ISO8583.entities.ISOMessage;
import com.imohsenb.ISO8583.enums.FIELDS;
import com.imohsenb.ISO8583.exceptions.ISOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@Service
public class MessageServiceImpl implements MessageService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MessageServiceImpl.class);

    private static final String URL  = "http://";

    @Autowired
    RestTemplate restTemplate;

    @Override
    public void processMessage(byte[] message) {
        try {
            LOGGER.info("iso msg->{}", new String(message));
            ISOMessage msg = ISOMessageBuilder.Unpacker().setMessage(message).build();

            // filer by msg type msg.getMti()

            InMessage inMessage = new InMessage();
            inMessage.setMessageType(msg.getMti());
            inMessage.setPan(msg.getStringField(FIELDS.F2_PAN));

            HttpHeaders httpHeaders = new HttpHeaders();
            httpHeaders.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
            HttpEntity<InMessage> request = new HttpEntity<>(inMessage, httpHeaders);

            ResponseEntity<OutMessage> post = restTemplate.exchange(URL, HttpMethod.POST, request, OutMessage.class);
            // post.getStatusCode()

        } catch (ISOException e) {
            LOGGER.error("fail to unpack iso message", e);
        }

    }



}