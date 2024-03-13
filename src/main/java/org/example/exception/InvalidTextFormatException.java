package org.example.exception;

import org.example.enums.MessageCodes;

public class InvalidTextFormatException extends Exception {
    public InvalidTextFormatException(MessageCodes error) {
        super(error.getMessage());
        System.out.println(error.getMessage());
        System.exit(1);
    }
}
