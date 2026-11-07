package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class zp1 extends aq1 {

    /* renamed from: b, reason: collision with root package name */
    public final vp1 f11556b;

    /* renamed from: c, reason: collision with root package name */
    public final Character f11557c;

    /* renamed from: d, reason: collision with root package name */
    public volatile aq1 f11558d;

    public zp1(vp1 vp1Var, Character ch) {
        this.f11556b = vp1Var;
        boolean z6 = true;
        if (ch != null) {
            byte[] bArr = vp1Var.f9920g;
            if (bArr.length > 61 && bArr[61] != -1) {
                z6 = false;
            }
        }
        if (!z6) {
            throw new IllegalArgumentException(dm1.a("Padding character %s was already in alphabet", ch));
        }
        this.f11557c = ch;
    }

    @Override // com.google.android.gms.internal.ads.aq1
    public int a(byte[] bArr, CharSequence charSequence) throws yp1 {
        int i6;
        CharSequence charSequenceC = c(charSequence);
        int length = charSequenceC.length();
        vp1 vp1Var = this.f11556b;
        int i7 = vp1Var.f9918e;
        int i8 = vp1Var.f9918e;
        if (!vp1Var.h[length % i7]) {
            throw new yp1(androidx.camera.camera2.internal.compat.workaround.c.d(charSequenceC.length(), "Invalid input length "));
        }
        int i9 = 0;
        for (int i10 = 0; i10 < charSequenceC.length(); i10 += i8) {
            long jA = 0;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                i6 = vp1Var.f9917d;
                if (i11 >= i8) {
                    break;
                }
                jA <<= i6;
                if (i10 + i11 < charSequenceC.length()) {
                    jA |= vp1Var.a(charSequenceC.charAt(i12 + i10));
                    i12++;
                }
                i11++;
            }
            int i13 = vp1Var.f9919f;
            int i14 = i12 * i6;
            int i15 = (i13 - 1) * 8;
            while (i15 >= (i13 * 8) - i14) {
                bArr[i9] = (byte) ((jA >>> i15) & 255);
                i15 -= 8;
                i9++;
            }
        }
        return i9;
    }

    @Override // com.google.android.gms.internal.ads.aq1
    public void b(StringBuilder sb, byte[] bArr, int i6) {
        int i7 = 0;
        sl1.g(0, i6, bArr.length);
        while (i7 < i6) {
            vp1 vp1Var = this.f11556b;
            h(sb, bArr, i7, Math.min(vp1Var.f9919f, i6 - i7));
            i7 += vp1Var.f9919f;
        }
    }

    @Override // com.google.android.gms.internal.ads.aq1
    public final CharSequence c(CharSequence charSequence) {
        if (this.f11557c == null) {
            return charSequence;
        }
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zp1) {
            zp1 zp1Var = (zp1) obj;
            if (this.f11556b.equals(zp1Var.f11556b) && Objects.equals(this.f11557c, zp1Var.f11557c)) {
                return true;
            }
        }
        return false;
    }

    public aq1 f(vp1 vp1Var, Character ch) {
        return new zp1(vp1Var, ch);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v14 */
    public final aq1 g() {
        vp1 vp1Var;
        boolean z6;
        aq1 aq1VarF = this.f11558d;
        if (aq1VarF == null) {
            vp1 vp1Var2 = this.f11556b;
            char[] cArr = vp1Var2.f9915b;
            int i6 = 0;
            while (true) {
                if (i6 >= cArr.length) {
                    vp1Var = vp1Var2;
                    break;
                }
                if (rj1.r(cArr[i6])) {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= cArr.length) {
                            z6 = false;
                            break;
                        }
                        char c7 = cArr[i7];
                        if (c7 >= 'a' && c7 <= 'z') {
                            z6 = true;
                            break;
                        }
                        i7++;
                    }
                    sl1.h("Cannot call lowerCase() on a mixed-case alphabet", !z6);
                    char[] cArr2 = new char[cArr.length];
                    for (int i8 = 0; i8 < cArr.length; i8++) {
                        char c8 = cArr[i8];
                        if (rj1.r(c8)) {
                            c8 ^= 32;
                        }
                        cArr2[i8] = (char) c8;
                    }
                    vp1Var = new vp1(vp1Var2.f9914a.concat(".lowerCase()"), cArr2);
                    byte[] bArr = vp1Var.f9920g;
                    if (vp1Var2.f9921i && !vp1Var.f9921i) {
                        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                        for (int i9 = 65; i9 <= 90; i9++) {
                            int i10 = i9 | 32;
                            byte b7 = bArr[i9];
                            byte b8 = bArr[i10];
                            if (b7 == -1) {
                                bArrCopyOf[i9] = b8;
                            } else {
                                char c9 = (char) i9;
                                char c10 = (char) i10;
                                if (b8 != -1) {
                                    throw new IllegalStateException(dm1.a("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c9), Character.valueOf(c10)));
                                }
                                bArrCopyOf[i10] = b7;
                            }
                        }
                        vp1Var = new vp1(vp1Var.f9914a.concat(".ignoreCase()"), vp1Var.f9915b, bArrCopyOf, true);
                    }
                } else {
                    i6++;
                }
            }
            aq1VarF = vp1Var == vp1Var2 ? this : f(vp1Var, this.f11557c);
            this.f11558d = aq1VarF;
        }
        return aq1VarF;
    }

    public final void h(StringBuilder sb, byte[] bArr, int i6, int i7) {
        sl1.g(i6, i6 + i7, bArr.length);
        vp1 vp1Var = this.f11556b;
        int i8 = vp1Var.f9919f;
        int i9 = vp1Var.f9917d;
        int i10 = 0;
        sl1.d(i7 <= i8);
        long j6 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            j6 = (j6 | (bArr[i6 + i11] & 255)) << 8;
        }
        int i12 = (i7 + 1) * 8;
        while (i10 < i7 * 8) {
            sb.append(vp1Var.f9915b[((int) (j6 >>> ((i12 - i9) - i10))) & vp1Var.f9916c]);
            i10 += i9;
        }
        if (this.f11557c != null) {
            while (i10 < vp1Var.f9919f * 8) {
                sb.append('=');
                i10 += i9;
            }
        }
    }

    public final int hashCode() {
        return this.f11556b.hashCode() ^ Objects.hashCode(this.f11557c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        vp1 vp1Var = this.f11556b;
        sb.append(vp1Var);
        if (8 % vp1Var.f9917d != 0) {
            Character ch = this.f11557c;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public zp1(String str, String str2) {
        this(new vp1(str, str2.toCharArray()), (Character) '=');
    }
}
