package com.chunjies.office.common.utils;

import java.io.Serializable;

/**
 * {@code @author:} chunjie
 * {@code @date: }2023-09-15 22:26
 **/
public class Result <T> implements Serializable {

    private String traceId;

    private int code;

    private String msg;

    private T data;


}
