package l7;

import bh.a;
import g7.h0;
import g7.t;
import g8.w;
import j2.y;
import kotlin.jvm.internal.r;
import l7.k;
import mh.x;
import qg.c;

/* loaded from: classes.dex */
public final class h implements k {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f16748a;

    /* renamed from: b, reason: collision with root package name */
    public final w7.m f16749b;

    public static final class a implements k.a<h0> {
        @Override // l7.k.a
        public final k a(Object obj, w7.m mVar, t tVar) {
            h0 h0Var = (h0) obj;
            if (r.a(h0Var.f11506c, "data")) {
                return new h(h0Var, mVar);
            }
            return null;
        }
    }

    public h(h0 h0Var, w7.m mVar) {
        this.f16748a = h0Var;
        this.f16749b = mVar;
    }

    @Override // l7.k
    public final Object a(tg.e<? super j> eVar) {
        int i10;
        int i11;
        byte[] bArr;
        int i12;
        int i13;
        int i14;
        int[] iArr;
        int i15;
        h0 h0Var = this.f16748a;
        String str = h0Var.f11504a;
        String str2 = h0Var.f11504a;
        int iY = x.y(str, ";base64,", 0, false, 6);
        if (iY == -1) {
            throw new IllegalStateException(("invalid data uri: " + h0Var).toString());
        }
        int iX = x.x(str2, ':', 0, 6);
        if (iX == -1) {
            throw new IllegalStateException(("invalid data uri: " + h0Var).toString());
        }
        String strSubstring = str2.substring(iX + 1, iY);
        r.d(strSubstring, "substring(...)");
        a.C0055a c0055a = bh.a.f4234c;
        int i16 = iY + 8;
        int length = str2.length();
        c0055a.getClass();
        boolean z10 = c0055a.f4236b;
        c.a.a(i16, length, str2.length());
        String strSubstring2 = str2.substring(i16, length);
        r.d(strSubstring2, "substring(...)");
        byte[] bytes = strSubstring2.getBytes(mh.a.f18240d);
        r.d(bytes, "getBytes(...)");
        int length2 = bytes.length;
        c.a.a(0, length2, bytes.length);
        int i17 = -2;
        if (length2 == 0) {
            i11 = 1;
            bArr = bytes;
            i12 = 0;
        } else {
            if (length2 == 1) {
                throw new IllegalArgumentException(y.a(length2, "Input should have at least 2 symbols for Base64 decoding, startIndex: 0, endIndex: "));
            }
            if (z10) {
                i10 = length2;
                int i18 = 0;
                while (true) {
                    if (i18 >= length2) {
                        break;
                    }
                    int i19 = bh.b.f4238a[bytes[i18] & 255];
                    if (i19 < 0) {
                        if (i19 == -2) {
                            i10 -= length2 - i18;
                            break;
                        }
                        i10--;
                    }
                    i18++;
                }
            } else if (bytes[length2 - 1] == 61) {
                i10 = length2 - 1;
                if (bytes[length2 - 2] == 61) {
                    i10 = length2 - 2;
                }
            } else {
                i10 = length2;
            }
            i11 = 1;
            bArr = bytes;
            i12 = (int) ((i10 * 6) / 8);
        }
        byte[] bArr2 = new byte[i12];
        int[] iArr2 = c0055a.f4235a ? bh.b.f4239b : bh.b.f4238a;
        int i20 = -8;
        int i21 = 0;
        int i22 = 0;
        int i23 = 8;
        int i24 = 0;
        int i25 = -8;
        while (true) {
            if (i21 >= length2) {
                i13 = i17;
                i14 = 0;
                break;
            }
            if (i25 != i20 || (i15 = i21 + 3) >= length2) {
                iArr = iArr2;
            } else {
                iArr = iArr2;
                int i26 = i21 + 4;
                int i27 = (iArr[bArr[i21 + 2] & 255] << 6) | (iArr2[bArr[i21] & 255] << 18) | (iArr[bArr[i21 + 1] & 255] << 12) | iArr[bArr[i15] & 255];
                if (i27 >= 0) {
                    bArr2[i24] = (byte) (i27 >> 16);
                    int i28 = i24 + 2;
                    bArr2[i24 + 1] = (byte) (i27 >> 8);
                    i24 += 3;
                    bArr2[i28] = (byte) i27;
                    i21 = i26;
                    iArr2 = iArr;
                }
                i17 = -2;
                i20 = -8;
            }
            int i29 = bArr[i21] & 255;
            int i30 = iArr[i29];
            if (i30 >= 0) {
                i21++;
                i22 = (i22 << 6) | i30;
                int i31 = i25 + 6;
                if (i31 >= 0) {
                    bArr2[i24] = (byte) (i22 >>> i31);
                    i22 &= (i11 << i31) - 1;
                    i25 -= 2;
                    i24++;
                } else {
                    i25 = i31;
                }
                iArr2 = iArr;
                i17 = -2;
                i20 = -8;
                i23 = 8;
            } else if (i30 == -2) {
                if (i25 == -8) {
                    throw new IllegalArgumentException(y.a(i21, "Redundant pad character at index "));
                }
                if (i25 == -6) {
                    a.b[] bVarArr = a.b.f4237a;
                } else if (i25 == -4) {
                    a.b[] bVarArr2 = a.b.f4237a;
                    int i32 = i21 + 1;
                    if (z10) {
                        while (i32 < length2) {
                            if (bh.b.f4238a[bArr[i32] & 255] != -1) {
                                break;
                            }
                            i32++;
                        }
                    }
                    if (i32 == length2 || bArr[i32] != 61) {
                        throw new IllegalArgumentException(y.a(i32, "Missing one pad character at index "));
                    }
                    i21 = i32 + 1;
                    i14 = i11;
                    i13 = -2;
                } else if (i25 != -2) {
                    throw new IllegalStateException("Unreachable");
                }
                i21++;
                i14 = i11;
                i13 = -2;
            } else {
                if (!z10) {
                    StringBuilder sb = new StringBuilder("Invalid symbol '");
                    sb.append((char) i29);
                    sb.append("'(");
                    w.h(i23);
                    String string = Integer.toString(i29, i23);
                    r.d(string, "toString(...)");
                    sb.append(string);
                    sb.append(") at index ");
                    sb.append(i21);
                    throw new IllegalArgumentException(sb.toString());
                }
                i21++;
                iArr2 = iArr;
                i17 = -2;
                i20 = -8;
            }
        }
        if (i25 == i13) {
            throw new IllegalArgumentException("The last unit of input does not have enough bits");
        }
        if (i25 != -8 && i14 == 0) {
            a.b[] bVarArr3 = a.b.f4237a;
            throw new IllegalArgumentException("The padding option is set to PRESENT, but the input is not properly padded");
        }
        if (i22 != 0) {
            throw new IllegalArgumentException("The pad bits must be zeros");
        }
        if (z10) {
            while (i21 < length2) {
                if (bh.b.f4238a[bArr[i21] & 255] != -1) {
                    break;
                }
                i21++;
            }
        }
        if (i21 >= length2) {
            if (i24 != i12) {
                throw new IllegalStateException("Check failed.");
            }
            hi.g gVar = new hi.g();
            gVar.m86write(bArr2);
            return new p(j7.r.b(gVar, this.f16749b.f31406f), strSubstring, j7.f.f15221b);
        }
        int i33 = bArr[i21] & 255;
        StringBuilder sb2 = new StringBuilder("Symbol '");
        sb2.append((char) i33);
        sb2.append("'(");
        w.h(8);
        String string2 = Integer.toString(i33, 8);
        r.d(string2, "toString(...)");
        sb2.append(string2);
        sb2.append(") at index ");
        throw new IllegalArgumentException(x0.a.a(sb2, i21 - 1, " is prohibited after the pad character"));
    }
}
