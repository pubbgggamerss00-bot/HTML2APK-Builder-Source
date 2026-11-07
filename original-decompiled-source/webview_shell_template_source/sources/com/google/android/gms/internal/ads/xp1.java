package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class xp1 extends zp1 {
    public xp1(vp1 vp1Var, Character ch) {
        super(vp1Var, ch);
        sl1.d(vp1Var.f9915b.length == 64);
    }

    @Override // com.google.android.gms.internal.ads.zp1, com.google.android.gms.internal.ads.aq1
    public final int a(byte[] bArr, CharSequence charSequence) throws yp1 {
        CharSequence charSequenceC = c(charSequence);
        int length = charSequenceC.length();
        vp1 vp1Var = this.f11556b;
        if (!vp1Var.h[length % vp1Var.f9918e]) {
            throw new yp1(androidx.camera.camera2.internal.compat.workaround.c.d(charSequenceC.length(), "Invalid input length "));
        }
        int i6 = 0;
        int i7 = 0;
        while (i6 < charSequenceC.length()) {
            int i8 = i7 + 1;
            int iA = (vp1Var.a(charSequenceC.charAt(i6 + 1)) << 12) | (vp1Var.a(charSequenceC.charAt(i6)) << 18);
            bArr[i7] = (byte) (iA >>> 16);
            int i9 = i6 + 2;
            if (i9 < charSequenceC.length()) {
                int i10 = i6 + 3;
                int iA2 = iA | (vp1Var.a(charSequenceC.charAt(i9)) << 6);
                int i11 = i7 + 2;
                bArr[i8] = (byte) ((iA2 >>> 8) & 255);
                if (i10 < charSequenceC.length()) {
                    i6 += 4;
                    i7 += 3;
                    bArr[i11] = (byte) ((iA2 | vp1Var.a(charSequenceC.charAt(i10))) & 255);
                } else {
                    i7 = i11;
                    i6 = i10;
                }
            } else {
                i6 = i9;
                i7 = i8;
            }
        }
        return i7;
    }

    @Override // com.google.android.gms.internal.ads.zp1, com.google.android.gms.internal.ads.aq1
    public final void b(StringBuilder sb, byte[] bArr, int i6) {
        int i7 = 0;
        sl1.g(0, i6, bArr.length);
        for (int i8 = i6; i8 >= 3; i8 -= 3) {
            int i9 = ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7] & 255) << 16) | (bArr[i7 + 2] & 255);
            vp1 vp1Var = this.f11556b;
            char[] cArr = vp1Var.f9915b;
            char[] cArr2 = vp1Var.f9915b;
            sb.append(cArr[i9 >>> 18]);
            sb.append(cArr2[(i9 >>> 12) & 63]);
            sb.append(cArr2[(i9 >>> 6) & 63]);
            sb.append(cArr2[i9 & 63]);
            i7 += 3;
        }
        if (i7 < i6) {
            h(sb, bArr, i7, i6 - i7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zp1
    public final aq1 f(vp1 vp1Var, Character ch) {
        return new xp1(vp1Var, ch);
    }

    public xp1(String str, String str2) {
        this(new vp1(str, str2.toCharArray()), (Character) '=');
    }
}
