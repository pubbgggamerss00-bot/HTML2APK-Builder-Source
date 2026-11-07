package org.jf.dexlib2;

import org.jf.util.ExceptionWithContext;

/* loaded from: classes3.dex */
public final class AnnotationVisibility {
    public static final int BUILD = 0;
    private static String[] NAMES = {"build", "runtime", "system"};
    public static final int RUNTIME = 1;
    public static final int SYSTEM = 2;

    private AnnotationVisibility() {
    }

    public static String getVisibility(int i10) {
        if (i10 >= 0) {
            String[] strArr = NAMES;
            if (i10 < strArr.length) {
                return strArr[i10];
            }
        }
        throw new ExceptionWithContext("Invalid annotation visibility %d", Integer.valueOf(i10));
    }

    public static int getVisibility(String str) {
        String lowerCase = str.toLowerCase();
        if (lowerCase.equals("build")) {
            return 0;
        }
        if (lowerCase.equals("runtime")) {
            return 1;
        }
        if (lowerCase.equals("system")) {
            return 2;
        }
        throw new ExceptionWithContext("Invalid annotation visibility: %s", lowerCase);
    }
}
