package l9;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class m {
    public static final String a(String name) {
        kotlin.jvm.internal.r.e(name, "name");
        Pattern patternCompile = Pattern.compile("[\\p{Cc}/\\\\:*?\"<>|]+");
        kotlin.jvm.internal.r.d(patternCompile, "compile(...)");
        String strReplaceAll = patternCompile.matcher(name).replaceAll("_");
        kotlin.jvm.internal.r.d(strReplaceAll, "replaceAll(...)");
        String strX = mh.x.X(strReplaceAll, ' ', '.', '_');
        if (mh.x.A(strX)) {
            strX = "App";
        }
        String strB0 = mh.y.b0(100, strX);
        int length = strB0.length();
        while (true) {
            String strSubstring = strB0.substring(0, length);
            kotlin.jvm.internal.r.d(strSubstring, "substring(...)");
            byte[] bytes = strSubstring.getBytes(mh.a.f18238b);
            kotlin.jvm.internal.r.d(bytes, "getBytes(...)");
            if (bytes.length <= 180) {
                break;
            }
            length--;
        }
        if (length > 0 && Character.isHighSurrogate(strB0.charAt(length - 1))) {
            length--;
        }
        String strSubstring2 = strB0.substring(0, length);
        kotlin.jvm.internal.r.d(strSubstring2, "substring(...)");
        return mh.x.A(strSubstring2) ? "App" : strSubstring2;
    }
}
