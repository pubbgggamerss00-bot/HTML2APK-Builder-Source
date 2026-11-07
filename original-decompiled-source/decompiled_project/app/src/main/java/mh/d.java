package mh;

import p.i0;
import qg.c;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f18250a;

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f18251b;

    static {
        int[] iArr = new int[256];
        int i10 = 0;
        for (int i11 = 0; i11 < 256; i11++) {
            iArr[i11] = "0123456789abcdef".charAt(i11 & 15) | ("0123456789abcdef".charAt(i11 >> 4) << '\b');
        }
        f18250a = iArr;
        int[] iArr2 = new int[256];
        for (int i12 = 0; i12 < 256; i12++) {
            iArr2[i12] = "0123456789ABCDEF".charAt(i12 & 15) | ("0123456789ABCDEF".charAt(i12 >> 4) << '\b');
        }
        int[] iArr3 = new int[256];
        for (int i13 = 0; i13 < 256; i13++) {
            iArr3[i13] = -1;
        }
        int i14 = 0;
        int i15 = 0;
        while (i14 < "0123456789abcdef".length()) {
            iArr3["0123456789abcdef".charAt(i14)] = i15;
            i14++;
            i15++;
        }
        int i16 = 0;
        int i17 = 0;
        while (i16 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i16)] = i17;
            i16++;
            i17++;
        }
        long[] jArr = new long[256];
        for (int i18 = 0; i18 < 256; i18++) {
            jArr[i18] = -1;
        }
        int i19 = 0;
        int i20 = 0;
        while (i19 < "0123456789abcdef".length()) {
            jArr["0123456789abcdef".charAt(i19)] = i20;
            i19++;
            i20++;
        }
        int i21 = 0;
        while (i10 < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i10)] = i21;
            i10++;
            i21++;
        }
        f18251b = jArr;
    }

    public static final void a(int i10, int i11, String str) {
        int i12 = i11 - i10;
        if (i12 < 1) {
            String strSubstring = str.substring(i10, i11);
            kotlin.jvm.internal.r.d(strSubstring, "substring(...)");
            throw new NumberFormatException("Expected at least 1 hexadecimal digits at index " + i10 + ", but was \"" + strSubstring + "\" of length " + i12);
        }
        if (i12 > 16) {
            int i13 = (i12 + i10) - 16;
            while (i10 < i13) {
                if (str.charAt(i10) != '0') {
                    StringBuilder sbB = i0.b(i10, "Expected the hexadecimal digit '0' at index ", ", but was '");
                    sbB.append(str.charAt(i10));
                    sbB.append("'.\nThe result won't fit the type being parsed.");
                    throw new NumberFormatException(sbB.toString());
                }
                i10++;
            }
        }
    }

    public static long b(int i10, int i11, String str) {
        e format = e.f18252d;
        kotlin.jvm.internal.r.e(format, "format");
        c.a.a(i10, i11, str.length());
        if (format.f18255c.f18258a) {
            a(i10, i11, str);
            return c(i10, i11, str);
        }
        if (i11 - i10 > 0) {
            a(i10, i11, str);
            return c(i10, i11, str);
        }
        String strSubstring = str.substring(i10, i11);
        kotlin.jvm.internal.r.d(strSubstring, "substring(...)");
        throw new NumberFormatException("Expected a hexadecimal number with prefix \"\" and suffix \"\", but was ".concat(strSubstring));
    }

    public static final long c(int i10, int i11, String str) {
        long j10 = 0;
        while (i10 < i11) {
            long j11 = j10 << 4;
            char cCharAt = str.charAt(i10);
            if ((cCharAt >>> '\b') == 0) {
                long j12 = f18251b[cCharAt];
                if (j12 >= 0) {
                    j10 = j11 | j12;
                    i10++;
                }
            }
            StringBuilder sbB = i0.b(i10, "Expected a hexadecimal digit at index ", ", but was ");
            sbB.append(str.charAt(i10));
            throw new NumberFormatException(sbB.toString());
        }
        return j10;
    }
}
