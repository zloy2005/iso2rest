package com.ukrcard.rest2iso.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class InMessage {
    private byte type;
    private String panId;
}
