package org.bouncycastle.est;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
class HttpUtil {

    public static class Headers extends HashMap<String, String[]> {
        private static final String EMPTY = "";

        private String actualKey(String str) {
            if (containsKey(str)) {
                return str;
            }
            for (String str2 : keySet()) {
                if (str.equalsIgnoreCase(str2)) {
                    return str2;
                }
            }
            return null;
        }

        private String[] copy(String[] strArr) {
            int length = strArr.length;
            String[] strArr2 = new String[length];
            System.arraycopy(strArr, 0, strArr2, 0, length);
            return strArr2;
        }

        private boolean hasHeader(String str) {
            return actualKey(str) != null;
        }

        public void add(String str, String str2) {
            put(str, HttpUtil.append(get(str), str2));
        }

        @Override // java.util.HashMap, java.util.AbstractMap
        public Object clone() {
            Headers headers = new Headers();
            for (Map.Entry<String, String[]> entry : entrySet()) {
                headers.put(entry.getKey(), copy(entry.getValue()));
            }
            return headers;
        }

        public void ensureHeader(String str, String str2) {
            if (containsKey(str)) {
                return;
            }
            set(str, str2);
        }

        public String getFirstValue(String str) {
            String[] values = getValues(str);
            if (values == null || values.length <= 0) {
                return null;
            }
            return values[0];
        }

        public String getFirstValueOrEmpty(String str) {
            String[] values = getValues(str);
            return (values == null || values.length <= 0) ? EMPTY : values[0];
        }

        public String[] getValues(String str) {
            String strActualKey = actualKey(str);
            if (strActualKey == null) {
                return null;
            }
            return get(strActualKey);
        }

        public void set(String str, String str2) {
            put(str, new String[]{str2});
        }
    }

    public static class PartLexer {
        int last = 0;

        /* renamed from: p, reason: collision with root package name */
        int f20109p = 0;
        private final String src;

        public PartLexer(String str) {
            this.src = str;
        }

        private String consumeAlpha() {
            char cCharAt = this.src.charAt(this.f20109p);
            while (this.f20109p < this.src.length() && ((cCharAt >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z'))) {
                int i10 = this.f20109p + 1;
                this.f20109p = i10;
                cCharAt = this.src.charAt(i10);
            }
            String strSubstring = this.src.substring(this.last, this.f20109p);
            this.last = this.f20109p;
            return strSubstring;
        }

        private boolean consumeIf(char c10) {
            if (this.f20109p >= this.src.length() || this.src.charAt(this.f20109p) != c10) {
                return false;
            }
            this.f20109p++;
            return true;
        }

        private String consumeUntil(char c10) {
            while (this.f20109p < this.src.length() && this.src.charAt(this.f20109p) != c10) {
                this.f20109p++;
            }
            String strSubstring = this.src.substring(this.last, this.f20109p);
            this.last = this.f20109p;
            return strSubstring;
        }

        private void discard() {
            this.last = this.f20109p;
        }

        private void skipWhiteSpace() {
            while (this.f20109p < this.src.length() && this.src.charAt(this.f20109p) < '!') {
                this.f20109p++;
            }
            this.last = this.f20109p;
        }

        public Map<String, String> Parse() {
            HashMap map = new HashMap();
            while (this.f20109p < this.src.length()) {
                skipWhiteSpace();
                String strConsumeAlpha = consumeAlpha();
                if (strConsumeAlpha.length() == 0) {
                    throw new IllegalArgumentException("Expecting alpha label.");
                }
                skipWhiteSpace();
                if (!consumeIf('=')) {
                    throw new IllegalArgumentException("Expecting assign: '='");
                }
                skipWhiteSpace();
                if (!consumeIf('\"')) {
                    throw new IllegalArgumentException("Expecting start quote: '\"'");
                }
                discard();
                String strConsumeUntil = consumeUntil('\"');
                discard(1);
                map.put(strConsumeAlpha, strConsumeUntil);
                skipWhiteSpace();
                if (!consumeIf(',')) {
                    break;
                }
                discard();
            }
            return map;
        }

        private void discard(int i10) {
            int i11 = this.f20109p + i10;
            this.f20109p = i11;
            this.last = i11;
        }
    }

    public static String[] append(String[] strArr, String str) {
        if (strArr == null) {
            return new String[]{str};
        }
        int length = strArr.length;
        String[] strArr2 = new String[length + 1];
        System.arraycopy(strArr, 0, strArr2, 0, length);
        strArr2[length] = str;
        return strArr2;
    }

    public static String mergeCSL(String str, Map<String, String> map) {
        StringWriter stringWriter = new StringWriter();
        stringWriter.write(str);
        stringWriter.write(32);
        boolean z10 = false;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (z10) {
                stringWriter.write(44);
            } else {
                z10 = true;
            }
            stringWriter.write(entry.getKey());
            stringWriter.write("=\"");
            stringWriter.write(entry.getValue());
            stringWriter.write(34);
        }
        return stringWriter.toString();
    }

    public static Map<String, String> splitCSL(String str, String str2) {
        String strTrim = str2.trim();
        if (strTrim.startsWith(str)) {
            strTrim = strTrim.substring(str.length());
        }
        return new PartLexer(strTrim).Parse();
    }
}
