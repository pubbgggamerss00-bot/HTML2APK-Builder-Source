package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdRequest;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class wp1 extends zp1 {

    /* renamed from: e, reason: collision with root package name */
    public final char[] f10250e;

    public wp1(vp1 vp1Var) {
        super(vp1Var, (Character) null);
        this.f10250e = new char[AdRequest.MAX_CONTENT_URL_LENGTH];
        char[] cArr = vp1Var.f9915b;
        sl1.d(cArr.length == 16);
        for (int i6 = 0; i6 < 256; i6++) {
            char[] cArr2 = this.f10250e;
            cArr2[i6] = cArr[i6 >>> 4];
            cArr2[i6 | 256] = cArr[i6 & 15];
        }
    }

    @Override // com.google.android.gms.internal.ads.zp1, com.google.android.gms.internal.ads.aq1
    public final int a(byte[] bArr, CharSequence charSequence) throws yp1 {
        if (charSequence.length() % 2 == 1) {
            throw new yp1(androidx.camera.camera2.internal.compat.workaround.c.d(charSequence.length(), "Invalid input length "));
        }
        int i6 = 0;
        int i7 = 0;
        while (i6 < charSequence.length()) {
            char cCharAt = charSequence.charAt(i6);
            vp1 vp1Var = this.f11556b;
            bArr[i7] = (byte) ((vp1Var.a(cCharAt) << 4) | vp1Var.a(charSequence.charAt(i6 + 1)));
            i6 += 2;
            i7++;
        }
        return i7;
    }

    @Override // com.google.android.gms.internal.ads.zp1, com.google.android.gms.internal.ads.aq1
    public final void b(StringBuilder sb, byte[] bArr, int i6) {
        sl1.g(0, i6, bArr.length);
        for (int i7 = 0; i7 < i6; i7++) {
            int i8 = bArr[i7] & 255;
            char[] cArr = this.f10250e;
            sb.append(cArr[i8]);
            sb.append(cArr[i8 | 256]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zp1
    public final aq1 f(vp1 vp1Var, Character ch) {
        return new wp1(vp1Var);
    }
}
