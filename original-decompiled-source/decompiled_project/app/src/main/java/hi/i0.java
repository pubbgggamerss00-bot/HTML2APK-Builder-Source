package hi;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes2.dex */
public final class i0 extends j {

    /* renamed from: e, reason: collision with root package name */
    public final transient byte[][] f13073e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int[] f13074f;

    public i0(byte[][] bArr, int[] iArr) {
        super(j.f13075d.f13076a);
        this.f13073e = bArr;
        this.f13074f = iArr;
    }

    @Override // hi.j
    public final String a() {
        throw null;
    }

    @Override // hi.j
    public final j c(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.f13073e;
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int[] iArr = this.f13074f;
            int i12 = iArr[length + i10];
            int i13 = iArr[i10];
            messageDigest.update(bArr[i10], i12, i13 - i11);
            i10++;
            i11 = i13;
        }
        byte[] bArrDigest = messageDigest.digest();
        kotlin.jvm.internal.r.b(bArrDigest);
        return new j(bArrDigest);
    }

    @Override // hi.j
    public final int d() {
        return this.f13074f[this.f13073e.length - 1];
    }

    @Override // hi.j
    public final String e() {
        return t().e();
    }

    @Override // hi.j
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (jVar.d() == d() && l(0, jVar, d())) {
                return true;
            }
        }
        return false;
    }

    @Override // hi.j
    public final int f(int i10, byte[] other) {
        kotlin.jvm.internal.r.e(other, "other");
        return t().f(i10, other);
    }

    @Override // hi.j
    public final byte[] h() {
        return s();
    }

    @Override // hi.j
    public final int hashCode() {
        int i10 = this.f13077b;
        if (i10 != 0) {
            return i10;
        }
        byte[][] bArr = this.f13073e;
        int length = bArr.length;
        int i11 = 0;
        int i12 = 1;
        int i13 = 0;
        while (i11 < length) {
            int[] iArr = this.f13074f;
            int i14 = iArr[length + i11];
            int i15 = iArr[i11];
            byte[] bArr2 = bArr[i11];
            int i16 = (i15 - i13) + i14;
            while (i14 < i16) {
                i12 = (i12 * 31) + bArr2[i14];
                i14++;
            }
            i11++;
            i13 = i15;
        }
        this.f13077b = i12;
        return i12;
    }

    @Override // hi.j
    public final byte i(int i10) {
        byte[][] bArr = this.f13073e;
        int length = bArr.length - 1;
        int[] iArr = this.f13074f;
        b.b(iArr[length], i10, 1L);
        int iB = c6.f.b(this, i10);
        return bArr[iB][(i10 - (iB == 0 ? 0 : iArr[iB - 1])) + iArr[bArr.length + iB]];
    }

    @Override // hi.j
    public final int j(int i10, byte[] other) {
        kotlin.jvm.internal.r.e(other, "other");
        return t().j(i10, other);
    }

    @Override // hi.j
    public final boolean l(int i10, j other, int i11) {
        kotlin.jvm.internal.r.e(other, "other");
        if (i10 >= 0 && i10 <= d() - i11) {
            int i12 = i11 + i10;
            int iB = c6.f.b(this, i10);
            int i13 = 0;
            while (i10 < i12) {
                int[] iArr = this.f13074f;
                int i14 = iB == 0 ? 0 : iArr[iB - 1];
                int i15 = iArr[iB] - i14;
                byte[][] bArr = this.f13073e;
                int i16 = iArr[bArr.length + iB];
                int iMin = Math.min(i12, i15 + i14) - i10;
                if (other.m(i13, bArr[iB], (i10 - i14) + i16, iMin)) {
                    i13 += iMin;
                    i10 += iMin;
                    iB++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // hi.j
    public final boolean m(int i10, byte[] other, int i11, int i12) {
        kotlin.jvm.internal.r.e(other, "other");
        if (i10 < 0 || i10 > d() - i12 || i11 < 0 || i11 > other.length - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iB = c6.f.b(this, i10);
        while (i10 < i13) {
            int[] iArr = this.f13074f;
            int i14 = iB == 0 ? 0 : iArr[iB - 1];
            int i15 = iArr[iB] - i14;
            byte[][] bArr = this.f13073e;
            int i16 = iArr[bArr.length + iB];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!b.a((i10 - i14) + i16, bArr[iB], i11, other, iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iB++;
        }
        return true;
    }

    @Override // hi.j
    public final j n(int i10, int i11) {
        int iC = b.c(this, i11);
        if (i10 < 0) {
            throw new IllegalArgumentException(ad.b.b(i10, "beginIndex=", " < 0").toString());
        }
        if (iC > d()) {
            StringBuilder sbB = p.i0.b(iC, "endIndex=", " > length(");
            sbB.append(d());
            sbB.append(')');
            throw new IllegalArgumentException(sbB.toString().toString());
        }
        int i12 = iC - i10;
        if (i12 < 0) {
            throw new IllegalArgumentException(e1.c.a(iC, i10, "endIndex=", " < beginIndex=").toString());
        }
        if (i10 == 0 && iC == d()) {
            return this;
        }
        if (i10 == iC) {
            return j.f13075d;
        }
        int iB = c6.f.b(this, i10);
        int iB2 = c6.f.b(this, iC - 1);
        byte[][] bArr = this.f13073e;
        byte[][] bArr2 = (byte[][]) qg.m.k(bArr, iB, iB2 + 1);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.f13074f;
        if (iB <= iB2) {
            int i13 = iB;
            int i14 = 0;
            while (true) {
                iArr[i14] = Math.min(iArr2[i13] - i10, i12);
                int i15 = i14 + 1;
                iArr[i14 + bArr2.length] = iArr2[bArr.length + i13];
                if (i13 == iB2) {
                    break;
                }
                i13++;
                i14 = i15;
            }
        }
        int i16 = iB != 0 ? iArr2[iB - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i10 - i16) + iArr[length];
        return new i0(bArr2, iArr);
    }

    @Override // hi.j
    public final j p() {
        return t().p();
    }

    @Override // hi.j
    public final void r(g gVar, int i10) {
        int iB = c6.f.b(this, 0);
        int i11 = 0;
        while (i11 < i10) {
            int[] iArr = this.f13074f;
            int i12 = iB == 0 ? 0 : iArr[iB - 1];
            int i13 = iArr[iB] - i12;
            byte[][] bArr = this.f13073e;
            int i14 = iArr[bArr.length + iB];
            int iMin = Math.min(i10, i13 + i12) - i11;
            int i15 = (i11 - i12) + i14;
            g0 g0Var = new g0(bArr[iB], i15, i15 + iMin, true, false);
            g0 g0Var2 = gVar.f13060a;
            if (g0Var2 == null) {
                g0Var.f13069g = g0Var;
                g0Var.f13068f = g0Var;
                gVar.f13060a = g0Var;
            } else {
                g0 g0Var3 = g0Var2.f13069g;
                kotlin.jvm.internal.r.b(g0Var3);
                g0Var3.b(g0Var);
            }
            i11 += iMin;
            iB++;
        }
        gVar.f13061b += i10;
    }

    public final byte[] s() {
        byte[] bArr = new byte[d()];
        byte[][] bArr2 = this.f13073e;
        int length = bArr2.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int[] iArr = this.f13074f;
            int i13 = iArr[length + i10];
            int i14 = iArr[i10];
            int i15 = i14 - i11;
            qg.m.c(i12, bArr2[i10], i13, bArr, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    public final j t() {
        return new j(s());
    }

    @Override // hi.j
    public final String toString() {
        return t().toString();
    }
}
