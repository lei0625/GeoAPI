package com.lei.entity;

/**
 * @author lei
 * @create 2022-07-07-7:37 PM
 */
public class SDKError {
   public String type;

    @Override
    public String toString() {
        return "SDKError{" +
                "type='" + type + '\'' +
                '}';
    }

    public enum ErrorType {
        NULL_INPUT,
        WRONG_TYPE,
        LAT_ABSENT,
        LON_ABSENT,
        TIME_ABSENT,
        EXT_ABSENT
    }
}
