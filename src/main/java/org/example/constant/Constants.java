package org.example.constant;

import lombok.experimental.UtilityClass;

@UtilityClass
public class Constants {

    // REGEX
    public static String FILE_TYPE = "\\S\\.txt";

    // BOLD TEXT
    public static String BOLD_TEXT_START = "(\\s|\\.|\\,)\\*\\*((?:\\w)|\\,|\\.)";
    public static String BOLD_TEXT_END = "((?:\\w)|\\,|\\.)\\*\\*(\\s|\\.|\\,)";

    // ITALIC TEXT
    public static String ITALIC_TEXT_START = "(\\s|\\.|\\,)\\_((?:\\w)|\\,|\\.|\\*)";
    public static String ITALIC_TEXT_END = "((?:\\w)|\\,|\\.|\\*)\\_(\\s|\\.|\\,)";

    // MONO TEXT
    public static String MONO_TEXT_START = "(\\s|\\.|\\,)\\`((?:\\w)|\\,|\\.)";
    public static String MONO_TEXT_END = "((?:\\w)|\\,|\\.)\\`(\\s|\\.|\\,)";

    // PRE TEXT
    public static String PRE_TEXT_START = "(\\s|\\.|\\,)\\`\\`\\`((?:\\w)|`|\\*|\\.|\\,)";
    public static String PRE_TEXT_END = "((?:\\w)|`|\\*|\\.|\\,)\\`\\`\\`(\\s|\\.|\\,)";

    public static String PRE = "<pre>(.*?)</pre>";

    // PARAGRAPH TEXT

    public static String P_TEXT = "(.*?)(?:\\R\\R|\\R$|$)";

    // KEY WORDS
    public static String EXIT = "exit";

}
