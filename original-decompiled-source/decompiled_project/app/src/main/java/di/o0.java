package di;

/* loaded from: classes2.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f8063a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f8064b;

    static {
        String[] strArr = new String[93];
        for (int i10 = 0; i10 < 32; i10++) {
            strArr[i10] = "\\u" + b(i10 >> 12) + b(i10 >> 8) + b(i10 >> 4) + b(i10);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f8063a = strArr;
        byte[] bArr = new byte[93];
        for (int i11 = 0; i11 < 32; i11++) {
            bArr[i11] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        f8064b = bArr;
    }

    public static final void a(StringBuilder sb, String value) {
        kotlin.jvm.internal.r.e(value, "value");
        sb.append('\"');
        int length = value.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = value.charAt(i11);
            String[] strArr = f8063a;
            if (cCharAt < strArr.length && strArr[cCharAt] != null) {
                sb.append((CharSequence) value, i10, i11);
                sb.append(strArr[cCharAt]);
                i10 = i11 + 1;
            }
        }
        if (i10 != 0) {
            sb.append((CharSequence) value, i10, value.length());
        } else {
            sb.append(value);
        }
        sb.append('\"');
    }

    public static final char b(int i10) {
        int i11 = i10 & 15;
        return (char) (i11 < 10 ? i11 + 48 : i11 + 87);
    }
}
