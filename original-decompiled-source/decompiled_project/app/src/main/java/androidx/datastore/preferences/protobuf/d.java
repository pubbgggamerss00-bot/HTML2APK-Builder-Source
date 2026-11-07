package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.d0;
import java.io.IOException;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jf.dexlib2.analysis.RegisterType;

/* loaded from: classes.dex */
public final class d {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f2000a;

        /* renamed from: b, reason: collision with root package name */
        public long f2001b;

        /* renamed from: c, reason: collision with root package name */
        public Object f2002c;

        /* renamed from: d, reason: collision with root package name */
        public final t f2003d;

        /* renamed from: e, reason: collision with root package name */
        public int f2004e;

        public a(t tVar) {
            tVar.getClass();
            this.f2003d = tVar;
        }
    }

    public static int a(byte[] bArr, int i10, a aVar) throws e0 {
        int iR = r(bArr, i10, aVar);
        int i11 = aVar.f2000a;
        if (i11 < 0) {
            throw e0.e();
        }
        if (i11 > bArr.length - iR) {
            throw e0.g();
        }
        if (i11 == 0) {
            aVar.f2002c = j.f2038b;
            return iR;
        }
        aVar.f2002c = j.c(iR, i11, bArr);
        return iR + i11;
    }

    public static int b(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public static long c(byte[] bArr, int i10) {
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    public static int d(o1 o1Var, byte[] bArr, int i10, int i11, int i12, a aVar) throws IOException {
        Object objNewInstance = o1Var.newInstance();
        int iU = u(objNewInstance, o1Var, bArr, i10, i11, i12, aVar);
        o1Var.makeImmutable(objNewInstance);
        aVar.f2002c = objNewInstance;
        return iU;
    }

    public static int e(o1 o1Var, byte[] bArr, int i10, int i11, a aVar) throws IOException {
        Object objNewInstance = o1Var.newInstance();
        int iV = v(objNewInstance, o1Var, bArr, i10, i11, aVar);
        o1Var.makeImmutable(objNewInstance);
        aVar.f2002c = objNewInstance;
        return iV;
    }

    public static int f(o1<?> o1Var, int i10, byte[] bArr, int i11, int i12, d0.j<?> jVar, a aVar) throws IOException {
        int iE = e(o1Var, bArr, i11, i12, aVar);
        jVar.add(aVar.f2002c);
        while (iE < i12) {
            int iR = r(bArr, iE, aVar);
            if (i10 != aVar.f2000a) {
                break;
            }
            iE = e(o1Var, bArr, iR, i12, aVar);
            jVar.add(aVar.f2002c);
        }
        return iE;
    }

    public static int g(byte[] bArr, int i10, d0.j<?> jVar, a aVar) throws IOException {
        f fVar = (f) jVar;
        int iR = r(bArr, i10, aVar);
        int i11 = aVar.f2000a + iR;
        while (iR < i11) {
            iR = t(bArr, iR, aVar);
            fVar.addBoolean(aVar.f2001b != 0);
        }
        if (iR == i11) {
            return iR;
        }
        throw e0.g();
    }

    public static int h(byte[] bArr, int i10, d0.j<?> jVar, a aVar) throws IOException {
        q qVar = (q) jVar;
        int iR = r(bArr, i10, aVar);
        int i11 = aVar.f2000a + iR;
        while (iR < i11) {
            qVar.addDouble(Double.longBitsToDouble(c(bArr, iR)));
            iR += 8;
        }
        if (iR == i11) {
            return iR;
        }
        throw e0.g();
    }

    public static int i(byte[] bArr, int i10, d0.j<?> jVar, a aVar) throws IOException {
        c0 c0Var = (c0) jVar;
        int iR = r(bArr, i10, aVar);
        int i11 = aVar.f2000a + iR;
        while (iR < i11) {
            c0Var.addInt(b(bArr, iR));
            iR += 4;
        }
        if (iR == i11) {
            return iR;
        }
        throw e0.g();
    }

    public static int j(byte[] bArr, int i10, d0.j<?> jVar, a aVar) throws IOException {
        n0 n0Var = (n0) jVar;
        int iR = r(bArr, i10, aVar);
        int i11 = aVar.f2000a + iR;
        while (iR < i11) {
            n0Var.addLong(c(bArr, iR));
            iR += 8;
        }
        if (iR == i11) {
            return iR;
        }
        throw e0.g();
    }

    public static int k(byte[] bArr, int i10, d0.j<?> jVar, a aVar) throws IOException {
        a0 a0Var = (a0) jVar;
        int iR = r(bArr, i10, aVar);
        int i11 = aVar.f2000a + iR;
        while (iR < i11) {
            a0Var.addFloat(Float.intBitsToFloat(b(bArr, iR)));
            iR += 4;
        }
        if (iR == i11) {
            return iR;
        }
        throw e0.g();
    }

    public static int l(byte[] bArr, int i10, d0.j<?> jVar, a aVar) throws IOException {
        c0 c0Var = (c0) jVar;
        int iR = r(bArr, i10, aVar);
        int i11 = aVar.f2000a + iR;
        while (iR < i11) {
            iR = r(bArr, iR, aVar);
            c0Var.addInt(k.c(aVar.f2000a));
        }
        if (iR == i11) {
            return iR;
        }
        throw e0.g();
    }

    public static int m(byte[] bArr, int i10, d0.j<?> jVar, a aVar) throws IOException {
        n0 n0Var = (n0) jVar;
        int iR = r(bArr, i10, aVar);
        int i11 = aVar.f2000a + iR;
        while (iR < i11) {
            iR = t(bArr, iR, aVar);
            n0Var.addLong(k.d(aVar.f2001b));
        }
        if (iR == i11) {
            return iR;
        }
        throw e0.g();
    }

    public static int n(byte[] bArr, int i10, d0.j<?> jVar, a aVar) throws IOException {
        c0 c0Var = (c0) jVar;
        int iR = r(bArr, i10, aVar);
        int i11 = aVar.f2000a + iR;
        while (iR < i11) {
            iR = r(bArr, iR, aVar);
            c0Var.addInt(aVar.f2000a);
        }
        if (iR == i11) {
            return iR;
        }
        throw e0.g();
    }

    public static int o(byte[] bArr, int i10, a aVar) throws e0 {
        int iR = r(bArr, i10, aVar);
        int i11 = aVar.f2000a;
        if (i11 < 0) {
            throw e0.e();
        }
        if (i11 == 0) {
            aVar.f2002c = "";
            return iR;
        }
        aVar.f2002c = new String(bArr, iR, i11, d0.f2005a);
        return iR + i11;
    }

    public static int p(int i10, byte[] bArr, int i11, int i12, x1 x1Var, a aVar) throws e0 {
        if ((i10 >>> 3) == 0) {
            throw e0.a();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iT = t(bArr, i11, aVar);
            x1Var.f(i10, Long.valueOf(aVar.f2001b));
            return iT;
        }
        if (i13 == 1) {
            x1Var.f(i10, Long.valueOf(c(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iR = r(bArr, i11, aVar);
            int i14 = aVar.f2000a;
            if (i14 < 0) {
                throw e0.e();
            }
            if (i14 > bArr.length - iR) {
                throw e0.g();
            }
            if (i14 == 0) {
                x1Var.f(i10, j.f2038b);
            } else {
                x1Var.f(i10, j.c(iR, i14, bArr));
            }
            return iR + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw e0.a();
            }
            x1Var.f(i10, Integer.valueOf(b(bArr, i11)));
            return i11 + 4;
        }
        x1 x1Var2 = new x1();
        int i15 = (i10 & (-8)) | 4;
        int i16 = aVar.f2004e + 1;
        aVar.f2004e = i16;
        if (i16 >= 100) {
            throw new e0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i17 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int iR2 = r(bArr, i11, aVar);
            i17 = aVar.f2000a;
            if (i17 == i15) {
                i11 = iR2;
                break;
            }
            i11 = p(i17, bArr, iR2, i12, x1Var2, aVar);
        }
        aVar.f2004e--;
        if (i11 > i12 || i17 != i15) {
            throw e0.f();
        }
        x1Var.f(i10, x1Var2);
        return i11;
    }

    public static int q(int i10, byte[] bArr, int i11, a aVar) {
        int i12 = i10 & CertificateBody.profileType;
        int i13 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            aVar.f2000a = i12 | (b10 << 7);
            return i13;
        }
        int i14 = i12 | ((b10 & Byte.MAX_VALUE) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            aVar.f2000a = i14 | (b11 << RegisterType.DOUBLE_LO);
            return i15;
        }
        int i16 = i14 | ((b11 & Byte.MAX_VALUE) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            aVar.f2000a = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & Byte.MAX_VALUE) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            aVar.f2000a = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                aVar.f2000a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    public static int r(byte[] bArr, int i10, a aVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return q(b10, bArr, i11, aVar);
        }
        aVar.f2000a = b10;
        return i11;
    }

    public static int s(int i10, byte[] bArr, int i11, int i12, d0.j<?> jVar, a aVar) {
        c0 c0Var = (c0) jVar;
        int iR = r(bArr, i11, aVar);
        c0Var.addInt(aVar.f2000a);
        while (iR < i12) {
            int iR2 = r(bArr, iR, aVar);
            if (i10 != aVar.f2000a) {
                break;
            }
            iR = r(bArr, iR2, aVar);
            c0Var.addInt(aVar.f2000a);
        }
        return iR;
    }

    public static int t(byte[] bArr, int i10, a aVar) {
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        if (j10 >= 0) {
            aVar.f2001b = j10;
            return i11;
        }
        int i12 = i10 + 2;
        byte b10 = bArr[i11];
        long j11 = (j10 & 127) | ((b10 & Byte.MAX_VALUE) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            i13 += 7;
            j11 |= (r10 & Byte.MAX_VALUE) << i13;
            b10 = bArr[i12];
            i12 = i14;
        }
        aVar.f2001b = j11;
        return i12;
    }

    public static int u(Object obj, o1 o1Var, byte[] bArr, int i10, int i11, int i12, a aVar) throws IOException {
        b1 b1Var = (b1) o1Var;
        int i13 = aVar.f2004e + 1;
        aVar.f2004e = i13;
        if (i13 >= 100) {
            throw new e0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iC = b1Var.C(obj, bArr, i10, i11, i12, aVar);
        aVar.f2004e--;
        aVar.f2002c = obj;
        return iC;
    }

    public static int v(Object obj, o1 o1Var, byte[] bArr, int i10, int i11, a aVar) throws IOException {
        int iQ = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iQ = q(i12, bArr, iQ, aVar);
            i12 = aVar.f2000a;
        }
        int i13 = iQ;
        if (i12 < 0 || i12 > i11 - i13) {
            throw e0.g();
        }
        int i14 = aVar.f2004e + 1;
        aVar.f2004e = i14;
        if (i14 >= 100) {
            throw new e0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i15 = i13 + i12;
        o1Var.f(obj, bArr, i13, i15, aVar);
        aVar.f2004e--;
        aVar.f2002c = obj;
        return i15;
    }

    public static int w(int i10, byte[] bArr, int i11, int i12, a aVar) throws e0 {
        if ((i10 >>> 3) == 0) {
            throw e0.a();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            return t(bArr, i11, aVar);
        }
        if (i13 == 1) {
            return i11 + 8;
        }
        if (i13 == 2) {
            return r(bArr, i11, aVar) + aVar.f2000a;
        }
        if (i13 != 3) {
            if (i13 == 5) {
                return i11 + 4;
            }
            throw e0.a();
        }
        int i14 = (i10 & (-8)) | 4;
        int i15 = 0;
        while (i11 < i12) {
            i11 = r(bArr, i11, aVar);
            i15 = aVar.f2000a;
            if (i15 == i14) {
                break;
            }
            i11 = w(i15, bArr, i11, i12, aVar);
        }
        if (i11 > i12 || i15 != i14) {
            throw e0.f();
        }
        return i11;
    }
}
