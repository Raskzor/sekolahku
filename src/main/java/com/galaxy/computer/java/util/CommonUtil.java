package com.galaxy.computer.java.util;

import java.util.Collection;

/**
 * @author Computer Galaxy
 */
public class CommonUtil {

    private CommonUtil(){}

    public static boolean isNotEmptyOrNull(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof String) {
            return !((String) obj).trim().isEmpty();
        } else if (obj instanceof Collection) {
            return !((Collection<?>) obj).isEmpty();
        }
        return true;
    }

    public static boolean isEmptyOrNull(Object obj) {
        if (obj == null) {
            return true;
        }
        if (obj instanceof String) {
            return ((String) obj).trim().isEmpty();
        } else if (obj instanceof Collection) {
            return ((Collection<?>) obj).isEmpty();
        }
        return false;
    }
}
