package org.example.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum MessageCodes {
    NOT_FOUND_FILE(1L, "\n----------------------------------------------------------------" +
            "\nThe file format is wrong! Please, use the .txt format!\n" +
            "Try It again or just enter 'exit' to leave the app\n" +
            "----------------------------------------------------------------\n\n"),
    INVALID_TEXT_FORMAT(2L, "Error: invalid markdown ");

    private final Long codeID;
    private final String message;

}
