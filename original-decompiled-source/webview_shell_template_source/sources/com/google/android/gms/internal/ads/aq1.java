package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.math.RoundingMode;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class aq1 {

    /* renamed from: a, reason: collision with root package name */
    public static final wp1 f2828a;

    static {
        new xp1("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new xp1("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new zp1("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new zp1("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        f2828a = new wp1(new vp1("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public abstract int a(byte[] bArr, CharSequence charSequence);

    public abstract void b(StringBuilder sb, byte[] bArr, int i6);

    public abstract CharSequence c(CharSequence charSequence);

    public final String d(int i6, byte[] bArr) {
        sl1.g(0, i6, bArr.length);
        vp1 vp1Var = ((zp1) this).f11556b;
        int i7 = vp1Var.f9919f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb = new StringBuilder(vp1Var.f9918e * iq1.b(i6, i7));
        try {
            b(sb, bArr, i6);
            return sb.toString();
        } catch (IOException e6) {
            throw new AssertionError(e6);
        }
    }

    public final byte[] e(String str) {
        try {
            int length = (int) (((((zp1) this).f11556b.f9917d * r6.length()) + 7) / 8);
            byte[] bArr = new byte[length];
            int iA = a(bArr, c(str));
            if (iA == length) {
                return bArr;
            }
            byte[] bArr2 = new byte[iA];
            System.arraycopy(bArr, 0, bArr2, 0, iA);
            return bArr2;
        } catch (yp1 e6) {
            throw new IllegalArgumentException(e6);
        }
    }
}
