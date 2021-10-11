package com.imohsenb.ISO8583.interfaces;

import com.imohsenb.ISO8583.entities.ISOMessage;
import com.imohsenb.ISO8583.enums.FIELDS;
import com.imohsenb.ISO8583.exceptions.ISOException;
import com.imohsenb.ISO8583.security.ISOMacGenerator;

/**
 * @author Mohsen Beiranvand
 */
public interface DataElement<T> {

    ISOMessage build() throws ISOException;

    com.imohsenb.ISO8583.interfaces.DataElement<T> generateMac(ISOMacGenerator generator) throws ISOException;

    com.imohsenb.ISO8583.interfaces.DataElement<T> setField(int no, String value) throws ISOException;
    com.imohsenb.ISO8583.interfaces.DataElement<T> setField(FIELDS field, String value) throws ISOException;
    com.imohsenb.ISO8583.interfaces.DataElement<T> setField(int no, byte[] value) throws ISOException;
    com.imohsenb.ISO8583.interfaces.DataElement<T> setField(FIELDS field, byte[] value) throws ISOException;


    com.imohsenb.ISO8583.interfaces.DataElement<T> setHeader(String header);
}
