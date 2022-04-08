package com.studentmedicalfacilitator.Exception;

public class BusinessException extends RuntimeException {

    public BusinessException(){};

    public BusinessException(String exception) {
        super(exception);
    }
}
