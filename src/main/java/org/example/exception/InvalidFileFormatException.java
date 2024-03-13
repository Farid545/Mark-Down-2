package org.example.exception;

import org.example.enums.MessageCodes;

public class InvalidFileFormatException extends Exception {
    public InvalidFileFormatException(MessageCodes error) {
        super(error.getMessage());
        System.out.println(error.getMessage());
    }
}
