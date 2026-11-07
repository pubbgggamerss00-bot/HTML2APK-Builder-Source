package org.jf.util;

import java.io.IOException;
import java.io.Writer;

/* loaded from: classes3.dex */
public class StringUtils {
    /* JADX WARN: Removed duplicated region for block: B:25:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String escapeString(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder((length * 3) / 2);
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt >= ' ' && cCharAt < 127) {
                if (cCharAt == '\'' || cCharAt == '\"' || cCharAt == '\\') {
                    sb.append('\\');
                }
                sb.append(cCharAt);
            } else if (cCharAt > 127) {
                sb.append("\\u");
                sb.append(Character.forDigit(cCharAt >> '\f', 16));
                sb.append(Character.forDigit((cCharAt >> '\b') & 15, 16));
                sb.append(Character.forDigit((cCharAt >> 4) & 15, 16));
                sb.append(Character.forDigit(cCharAt & 15, 16));
            } else if (cCharAt == '\t') {
                sb.append("\\t");
            } else if (cCharAt == '\n') {
                sb.append("\\n");
            } else if (cCharAt == '\r') {
                sb.append("\\r");
            }
        }
        return sb.toString();
    }

    @Deprecated
    public static void writeEscapedChar(Writer writer, char c10) throws IOException {
        if (c10 >= ' ' && c10 < 127) {
            if (c10 == '\'' || c10 == '\"' || c10 == '\\') {
                writer.write(92);
            }
            writer.write(c10);
            return;
        }
        if (c10 <= 127) {
            if (c10 == '\t') {
                writer.write("\\t");
                return;
            } else if (c10 == '\n') {
                writer.write("\\n");
                return;
            } else if (c10 == '\r') {
                writer.write("\\r");
                return;
            }
        }
        writer.write("\\u");
        writer.write(Character.forDigit(c10 >> '\f', 16));
        writer.write(Character.forDigit((c10 >> '\b') & 15, 16));
        writer.write(Character.forDigit((c10 >> 4) & 15, 16));
        writer.write(Character.forDigit(c10 & 15, 16));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void writeEscapedString(Writer writer, String str) throws IOException {
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt >= ' ' && cCharAt < 127) {
                if (cCharAt == '\'' || cCharAt == '\"' || cCharAt == '\\') {
                    writer.write(92);
                }
                writer.write(cCharAt);
            } else if (cCharAt > 127) {
                writer.write("\\u");
                writer.write(Character.forDigit(cCharAt >> '\f', 16));
                writer.write(Character.forDigit((cCharAt >> '\b') & 15, 16));
                writer.write(Character.forDigit((cCharAt >> 4) & 15, 16));
                writer.write(Character.forDigit(cCharAt & 15, 16));
            } else if (cCharAt == '\t') {
                writer.write("\\t");
            } else if (cCharAt == '\n') {
                writer.write("\\n");
            } else if (cCharAt == '\r') {
                writer.write("\\r");
            }
        }
    }
}
