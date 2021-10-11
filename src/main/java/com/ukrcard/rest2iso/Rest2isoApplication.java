package com.ukrcard.rest2iso;

import com.imohsenb.ISO8583.builders.ISOMessageBuilder;
import com.imohsenb.ISO8583.entities.ISOMessage;
import com.imohsenb.ISO8583.enums.FIELDS;
import com.imohsenb.ISO8583.enums.MESSAGE_FUNCTION;
import com.imohsenb.ISO8583.enums.MESSAGE_ORIGIN;
import com.imohsenb.ISO8583.enums.VERSION;
import com.imohsenb.ISO8583.exceptions.ISOException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Rest2isoApplication {

    public static void main(String[] args) {
//        ISOMessage isoMessage;
//
//        {
//            try {
//                isoMessage = ISOMessageBuilder.Packer(VERSION.V1993)
//                        .networkManagement()
//                        .mti(MESSAGE_FUNCTION.Request, MESSAGE_ORIGIN.Other)
//                        .processCode("920000")
//                        .setField(FIELDS.F11_STAN,  "1")
//                        .setField(FIELDS.F12_LocalTime,  "023120")
//                        .setField(FIELDS.F13_LocalDate,  "0332")
//                        .setField(FIELDS.F24_NII_FunctionCode,  "333")
//                        .setHeader("1002230000")
//                        .build();
//                System.out.println(isoMessage.toString());
//
//                ISOMessage outMsg = ISOMessageBuilder.Unpacker().setMessage(isoMessage.toString()).build();
//                System.out.println(outMsg.getMti());
//            } catch (ISOException e) {
//                e.printStackTrace();
//            }
//        }

          SpringApplication.run(Rest2isoApplication.class, args);
    }


}
