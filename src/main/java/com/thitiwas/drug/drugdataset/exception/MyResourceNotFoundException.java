package com.thitiwas.drug.drugdataset.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class MyResourceNotFoundException extends RuntimeException {
    public MyResourceNotFoundException() {
    }

    public MyResourceNotFoundException(String message) {
        super(message);
    }

    public MyResourceNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyResourceNotFoundException(Throwable cause) {
        super(cause);
    }

    public MyResourceNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
