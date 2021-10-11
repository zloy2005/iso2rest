package com.ukrcard.rest2iso.endpoint;

import com.ukrcard.rest2iso.model.InMessage;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RestEndpoint {

    @PostMapping("/iso")
    public InMessage In(@RequestBody InMessage message) {
        return null;
    }


}
