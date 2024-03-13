package org.example.util;

import lombok.experimental.UtilityClass;
import org.example.constant.Constants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@UtilityClass
public class FileUtility {

    public static Matcher getMatcherFromPattern(String content, String regex, int pattern) {
        Pattern prePattern = Pattern.compile(regex, pattern);
        return prePattern.matcher(content);
    }

    public static Matcher getMatcherFromPattern(String content, String regex) {
        Pattern prePattern = Pattern.compile(regex);
        return prePattern.matcher(content);
    }

}
