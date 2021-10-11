package com.ukrcard.rest2iso.service;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class InMessage {
    @JsonProperty("message_type")
    String messageType;
    @JsonProperty("pan")
    String pan;
}
