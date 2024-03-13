package org.example.filework;

import org.example.constant.Constants;
import org.example.enums.MessageCodes;
import org.example.exception.InvalidFileFormatException;
import org.example.exception.InvalidTextFormatException;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Input {
    private static Scanner scanner = new Scanner(System.in);

    public static void markdownPath() throws InvalidTextFormatException {
        String filePath = "";

        System.out.println("*** The file format - .txt ***");
        System.out.print("Enter the file path: ");
        filePath = scanner.next();

        Pattern pattern = Pattern.compile(Constants.FILE_TYPE);
        Matcher matcher = pattern.matcher(filePath);

        if (filePath.equalsIgnoreCase(Constants.EXIT))
            System.exit(1);

        try {
            if (matcher.find()) {
                FileProceed.fileProcessing(filePath);

            } else
                throw new InvalidFileFormatException(MessageCodes.NOT_FOUND_FILE);
        } catch (InvalidFileFormatException e) {
            markdownPath();
        } catch (InvalidTextFormatException e) {
            throw new InvalidTextFormatException(MessageCodes.INVALID_TEXT_FORMAT);
        }

    }
}
