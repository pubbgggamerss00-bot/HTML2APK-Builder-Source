package org.jf.dexlib2;

import java.util.HashMap;
import org.jf.util.ExceptionWithContext;

/* loaded from: classes3.dex */
public class VerificationError {
    public static final int CLASS_CHANGE_ERROR = 8;
    public static final int GENERIC = 1;
    public static final int ILLEGAL_CLASS_ACCESS = 5;
    public static final int ILLEGAL_FIELD_ACCESS = 6;
    public static final int ILLEGAL_METHOD_ACCESS = 7;
    public static final int INSTANTIATION_ERROR = 9;
    public static final int NO_SUCH_CLASS = 2;
    public static final int NO_SUCH_FIELD = 3;
    public static final int NO_SUCH_METHOD = 4;
    private static final HashMap<String, Integer> verificationErrorNames;

    static {
        HashMap<String, Integer> map = new HashMap<>();
        verificationErrorNames = map;
        map.put("generic-error", 1);
        map.put("no-such-class", 2);
        map.put("no-such-field", 3);
        map.put("no-such-method", 4);
        map.put("illegal-class-access", 5);
        map.put("illegal-field-access", 6);
        map.put("illegal-method-access", 7);
        map.put("class-change-error", 8);
        map.put("instantiation-error", 9);
    }

    public static int getVerificationError(String str) {
        Integer num = verificationErrorNames.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new ExceptionWithContext("Invalid verification error: %s", str);
    }

    public static String getVerificationErrorName(int i10) {
        switch (i10) {
            case 1:
                return "generic-error";
            case 2:
                return "no-such-class";
            case 3:
                return "no-such-field";
            case 4:
                return "no-such-method";
            case 5:
                return "illegal-class-access";
            case 6:
                return "illegal-field-access";
            case 7:
                return "illegal-method-access";
            case 8:
                return "class-change-error";
            case 9:
                return "instantiation-error";
            default:
                return null;
        }
    }

    public static boolean isValidVerificationError(int i10) {
        return i10 > 0 && i10 < 10;
    }
}
