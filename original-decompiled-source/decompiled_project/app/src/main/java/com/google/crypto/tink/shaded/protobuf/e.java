package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.y;
import java.io.IOException;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jf.dexlib2.analysis.RegisterType;

/* loaded from: classes2.dex */
public final class e {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f6647a;

        /* renamed from: b, reason: collision with root package name */
        public long f6648b;

        /* renamed from: c, reason: collision with root package name */
        public Object f6649c;

        /* renamed from: d, reason: collision with root package name */
        public final o f6650d;

        public a(o oVar) {
            oVar.getClass();
            this.f6650d = oVar;
        }
    }

    public static int a(byte[] bArr, int i10, a aVar) throws z {
        int i11 = i(bArr, i10, aVar);
        int i12 = aVar.f6647a;
        if (i12 < 0) {
            throw z.e();
        }
        if (i12 > bArr.length - i11) {
            throw z.g();
        }
        if (i12 == 0) {
            aVar.f6649c = h.f6665b;
            return i11;
        }
        aVar.f6649c = h.c(i11, i12, bArr);
        return i11 + i12;
    }

    public static int b(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public static long c(byte[] bArr, int i10) {
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    public static int d(g1<?> g1Var, int i10, byte[] bArr, int i11, int i12, y.c<?> cVar, a aVar) throws IOException {
        Object objNewInstance = g1Var.newInstance();
        g1<?> g1Var2 = g1Var;
        byte[] bArr2 = bArr;
        int i13 = i12;
        a aVar2 = aVar;
        int iL = l(objNewInstance, g1Var2, bArr2, i11, i13, aVar2);
        g1Var2.makeImmutable(objNewInstance);
        aVar2.f6649c = objNewInstance;
        cVar.add(objNewInstance);
        while (iL < i13) {
            a aVar3 = aVar2;
            int i14 = i13;
            int i15 = i(bArr2, iL, aVar3);
            if (i10 != aVar3.f6647a) {
                break;
            }
            byte[] bArr3 = bArr2;
            g1<?> g1Var3 = g1Var2;
            Object objNewInstance2 = g1Var3.newInstance();
            iL = l(objNewInstance2, g1Var3, bArr3, i15, i14, aVar3);
            g1Var2 = g1Var3;
            bArr2 = bArr3;
            i13 = i14;
            aVar2 = aVar3;
            g1Var2.makeImmutable(objNewInstance2);
            aVar2.f6649c = objNewInstance2;
            cVar.add(objNewInstance2);
        }
        return iL;
    }

    public static int e(byte[] bArr, int i10, a aVar) throws z {
        int i11 = i(bArr, i10, aVar);
        int i12 = aVar.f6647a;
        if (i12 < 0) {
            throw z.e();
        }
        if (i12 == 0) {
            aVar.f6649c = "";
            return i11;
        }
        aVar.f6649c = new String(bArr, i11, i12, y.f6818a);
        return i11 + i12;
    }

    public static int f(byte[] bArr, int i10, a aVar) throws z {
        int i11 = i(bArr, i10, aVar);
        int i12 = aVar.f6647a;
        if (i12 < 0) {
            throw z.e();
        }
        if (i12 == 0) {
            aVar.f6649c = "";
            return i11;
        }
        aVar.f6649c = s1.f6761a.a(bArr, i11, i12);
        return i11 + i12;
    }

    public static int g(int i10, byte[] bArr, int i11, int i12, o1 o1Var, a aVar) throws z {
        if ((i10 >>> 3) == 0) {
            throw z.a();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iK = k(bArr, i11, aVar);
            o1Var.c(i10, Long.valueOf(aVar.f6648b));
            return iK;
        }
        if (i13 == 1) {
            o1Var.c(i10, Long.valueOf(c(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int i14 = i(bArr, i11, aVar);
            int i15 = aVar.f6647a;
            if (i15 < 0) {
                throw z.e();
            }
            if (i15 > bArr.length - i14) {
                throw z.g();
            }
            if (i15 == 0) {
                o1Var.c(i10, h.f6665b);
            } else {
                o1Var.c(i10, h.c(i14, i15, bArr));
            }
            return i14 + i15;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw z.a();
            }
            o1Var.c(i10, Integer.valueOf(b(bArr, i11)));
            return i11 + 4;
        }
        o1 o1Var2 = new o1();
        int i16 = (i10 & (-8)) | 4;
        int i17 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int i18 = i(bArr, i11, aVar);
            i17 = aVar.f6647a;
            if (i17 == i16) {
                i11 = i18;
                break;
            }
            i11 = g(i17, bArr, i18, i12, o1Var2, aVar);
        }
        if (i11 > i12 || i17 != i16) {
            throw z.f();
        }
        o1Var.c(i10, o1Var2);
        return i11;
    }

    public static int h(int i10, byte[] bArr, int i11, a aVar) {
        int i12 = i10 & CertificateBody.profileType;
        int i13 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            aVar.f6647a = i12 | (b10 << 7);
            return i13;
        }
        int i14 = i12 | ((b10 & Byte.MAX_VALUE) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            aVar.f6647a = i14 | (b11 << RegisterType.DOUBLE_LO);
            return i15;
        }
        int i16 = i14 | ((b11 & Byte.MAX_VALUE) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            aVar.f6647a = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & Byte.MAX_VALUE) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            aVar.f6647a = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                aVar.f6647a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    public static int i(byte[] bArr, int i10, a aVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return h(b10, bArr, i11, aVar);
        }
        aVar.f6647a = b10;
        return i11;
    }

    public static int j(int i10, byte[] bArr, int i11, int i12, y.c<?> cVar, a aVar) {
        x xVar = (x) cVar;
        int i13 = i(bArr, i11, aVar);
        xVar.addInt(aVar.f6647a);
        while (i13 < i12) {
            int i14 = i(bArr, i13, aVar);
            if (i10 != aVar.f6647a) {
                break;
            }
            i13 = i(bArr, i14, aVar);
            xVar.addInt(aVar.f6647a);
        }
        return i13;
    }

    public static int k(byte[] bArr, int i10, a aVar) {
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        if (j10 >= 0) {
            aVar.f6648b = j10;
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
        aVar.f6648b = j11;
        return i12;
    }

    public static int l(Object obj, g1 g1Var, byte[] bArr, int i10, int i11, a aVar) throws IOException {
        int iH = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iH = h(i12, bArr, iH, aVar);
            i12 = aVar.f6647a;
        }
        int i13 = iH;
        if (i12 < 0 || i12 > i11 - i13) {
            throw z.g();
        }
        int i14 = i13 + i12;
        g1Var.c(obj, bArr, i13, i14, aVar);
        aVar.f6649c = obj;
        return i14;
    }

    public static int m(int i10, byte[] bArr, int i11, int i12, a aVar) throws z {
        if ((i10 >>> 3) == 0) {
            throw z.a();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            return k(bArr, i11, aVar);
        }
        if (i13 == 1) {
            return i11 + 8;
        }
        if (i13 == 2) {
            return i(bArr, i11, aVar) + aVar.f6647a;
        }
        if (i13 != 3) {
            if (i13 == 5) {
                return i11 + 4;
            }
            throw z.a();
        }
        int i14 = (i10 & (-8)) | 4;
        int i15 = 0;
        while (i11 < i12) {
            i11 = i(bArr, i11, aVar);
            i15 = aVar.f6647a;
            if (i15 == i14) {
                break;
            }
            i11 = m(i15, bArr, i11, i12, aVar);
        }
        if (i11 > i12 || i15 != i14) {
            throw z.f();
        }
        return i11;
    }
}
