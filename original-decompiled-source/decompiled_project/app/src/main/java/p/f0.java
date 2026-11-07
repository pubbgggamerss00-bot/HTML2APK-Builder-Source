package p;

import org.bouncycastle.asn1.eac.CertificateBody;

/* loaded from: classes.dex */
public final class f0<K> {

    /* renamed from: a, reason: collision with root package name */
    public long[] f20615a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f20616b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f20617c;

    /* renamed from: d, reason: collision with root package name */
    public int f20618d;

    /* renamed from: e, reason: collision with root package name */
    public int f20619e;

    /* renamed from: f, reason: collision with root package name */
    public int f20620f;

    public f0() {
        this((Object) null);
    }

    public final void a() {
        this.f20619e = 0;
        long[] jArr = this.f20615a;
        if (jArr != w0.f20748a) {
            qg.m.n(jArr, -9187201950435737472L);
            long[] jArr2 = this.f20615a;
            int i10 = this.f20618d;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        qg.m.m(this.f20616b, 0, this.f20618d, null);
        this.f20620f = w0.a(this.f20618d) - this.f20619e;
    }

    public final int b(int i10) {
        int i11 = this.f20618d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f20615a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j10 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j11 = j10 & ((~j10) << 7) & (-9187201950435737472L);
            if (j11 != 0) {
                return (i12 + (Long.numberOfTrailingZeros(j11) >> 3)) & i11;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
    }

    public final int c(K k10) {
        long j10;
        long j11;
        long j12;
        long[] jArr;
        long[] jArr2;
        int i10;
        Object[] objArr;
        int i11 = -862048943;
        int iHashCode = (k10 != null ? k10.hashCode() : 0) * (-862048943);
        int i12 = iHashCode ^ (iHashCode << 16);
        int i13 = i12 >>> 7;
        int i14 = i12 & CertificateBody.profileType;
        int i15 = this.f20618d;
        int i16 = i13 & i15;
        int i17 = 0;
        while (true) {
            long[] jArr3 = this.f20615a;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            long j13 = ((jArr3[i18 + 1] << (64 - i19)) & ((-i19) >> 63)) | (jArr3[i18] >>> i19);
            long j14 = i14;
            int i20 = i14;
            long j15 = j13 ^ (j14 * 72340172838076673L);
            long j16 = (~j15) & (j15 - 72340172838076673L) & (-9187201950435737472L);
            while (j16 != 0) {
                int iNumberOfTrailingZeros = (i16 + (Long.numberOfTrailingZeros(j16) >> 3)) & i15;
                int i21 = i11;
                if (kotlin.jvm.internal.r.a(this.f20616b[iNumberOfTrailingZeros], k10)) {
                    return iNumberOfTrailingZeros;
                }
                j16 &= j16 - 1;
                i11 = i21;
            }
            int i22 = i11;
            if ((((~j13) << 6) & j13 & (-9187201950435737472L)) != 0) {
                int iB = b(i13);
                long j17 = 255;
                if (this.f20620f != 0 || ((this.f20615a[iB >> 3] >> ((iB & 7) << 3)) & 255) == 254) {
                    j10 = 255;
                    j11 = j14;
                    j12 = 128;
                } else {
                    int i23 = this.f20618d;
                    if (i23 > 8) {
                        int i24 = 8;
                        if (Long.compareUnsigned(this.f20619e * 32, i23 * 25) <= 0) {
                            long[] jArr4 = this.f20615a;
                            int i25 = this.f20618d;
                            Object[] objArr2 = this.f20616b;
                            int[] iArr = this.f20617c;
                            j12 = 128;
                            int i26 = (i25 + 7) >> 3;
                            int i27 = 0;
                            while (i27 < i26) {
                                long j18 = j17;
                                long j19 = jArr4[i27] & (-9187201950435737472L);
                                jArr4[i27] = (-72340172838076674L) & ((~j19) + (j19 >>> 7));
                                i27++;
                                i24 = i24;
                                j14 = j14;
                                j17 = j18;
                            }
                            j10 = j17;
                            j11 = j14;
                            int i28 = i24;
                            int iV = qg.o.v(jArr4);
                            int i29 = iV - 1;
                            long j20 = 72057594037927935L;
                            jArr4[i29] = (jArr4[i29] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[iV] = jArr4[0];
                            int i30 = 0;
                            while (i30 != i25) {
                                int i31 = i30 >> 3;
                                int i32 = (i30 & 7) << 3;
                                long j21 = (jArr4[i31] >> i32) & j10;
                                if (j21 != 128 && j21 == 254) {
                                    Object obj = objArr2[i30];
                                    int iHashCode2 = (obj != null ? obj.hashCode() : 0) * i22;
                                    int i33 = (iHashCode2 ^ (iHashCode2 << 16)) >>> 7;
                                    int iB2 = b(i33);
                                    int i34 = i33 & i25;
                                    long j22 = j20;
                                    if (((iB2 - i34) & i25) / 8 == ((i30 - i34) & i25) / i28) {
                                        jArr4[i31] = ((r8 & CertificateBody.profileType) << i32) | (jArr4[i31] & (~(j10 << i32)));
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j22) | Long.MIN_VALUE;
                                        i30++;
                                        i28 = i28;
                                        j20 = j22;
                                    } else {
                                        int i35 = i28;
                                        int i36 = iB2 >> 3;
                                        long j23 = jArr4[i36];
                                        int i37 = (iB2 & 7) << 3;
                                        if (((j23 >> i37) & j10) == 128) {
                                            i10 = i25;
                                            objArr = objArr2;
                                            jArr4[i36] = ((~(j10 << i37)) & j23) | ((r8 & CertificateBody.profileType) << i37);
                                            jArr4[i31] = (jArr4[i31] & (~(j10 << i32))) | (128 << i32);
                                            objArr[iB2] = objArr[i30];
                                            objArr[i30] = null;
                                            iArr[iB2] = iArr[i30];
                                            iArr[i30] = 0;
                                        } else {
                                            i10 = i25;
                                            objArr = objArr2;
                                            jArr4[i36] = ((r8 & CertificateBody.profileType) << i37) | ((~(j10 << i37)) & j23);
                                            Object obj2 = objArr[iB2];
                                            objArr[iB2] = objArr[i30];
                                            objArr[i30] = obj2;
                                            int i38 = iArr[iB2];
                                            iArr[iB2] = iArr[i30];
                                            iArr[i30] = i38;
                                            i30--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j22) | Long.MIN_VALUE;
                                        i30++;
                                        i25 = i10;
                                        i28 = i35;
                                        j20 = j22;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i30++;
                                }
                            }
                            this.f20620f = w0.a(this.f20618d) - this.f20619e;
                        }
                        iB = b(i13);
                    }
                    j10 = 255;
                    j11 = j14;
                    j12 = 128;
                    int iC = w0.c(this.f20618d);
                    long[] jArr5 = this.f20615a;
                    Object[] objArr3 = this.f20616b;
                    int[] iArr2 = this.f20617c;
                    int i39 = this.f20618d;
                    f(iC);
                    long[] jArr6 = this.f20615a;
                    Object[] objArr4 = this.f20616b;
                    int[] iArr3 = this.f20617c;
                    int i40 = this.f20618d;
                    int i41 = 0;
                    while (i41 < i39) {
                        if (((jArr5[i41 >> 3] >> ((i41 & 7) << 3)) & 255) < 128) {
                            Object obj3 = objArr3[i41];
                            int iHashCode3 = (obj3 != null ? obj3.hashCode() : 0) * i22;
                            int i42 = iHashCode3 ^ (iHashCode3 << 16);
                            int iB3 = b(i42 >>> 7);
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j24 = i42 & CertificateBody.profileType;
                            int i43 = iB3 >> 3;
                            int i44 = (iB3 & 7) << 3;
                            long j25 = (jArr[i43] & (~(255 << i44))) | (j24 << i44);
                            jArr[i43] = j25;
                            jArr[(((iB3 - 7) & i40) + (i40 & 7)) >> 3] = j25;
                            objArr4[iB3] = obj3;
                            iArr3[iB3] = iArr2[i41];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i41++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    iB = b(i13);
                }
                this.f20619e++;
                int i45 = this.f20620f;
                long[] jArr7 = this.f20615a;
                int i46 = iB >> 3;
                long j26 = jArr7[i46];
                int i47 = (iB & 7) << 3;
                this.f20620f = i45 - (((j26 >> i47) & j10) == j12 ? 1 : 0);
                int i48 = this.f20618d;
                long j27 = (j26 & (~(j10 << i47))) | (j11 << i47);
                jArr7[i46] = j27;
                jArr7[(((iB - 7) & i48) + (i48 & 7)) >> 3] = j27;
                return ~iB;
            }
            i17 += 8;
            i16 = (i16 + i17) & i15;
            i14 = i20;
            i11 = i22;
        }
    }

    public final int d(Object obj) {
        int i10 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & CertificateBody.profileType;
        int i13 = this.f20618d;
        int i14 = i11 >>> 7;
        while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.f20615a;
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (i12 * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i15) & i13;
                if (kotlin.jvm.internal.r.a(this.f20616b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i10 += 8;
            i14 = i15 + i10;
        }
    }

    public final int e(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return this.f20617c[iD];
        }
        q.d.c("There is no key " + obj + " in the map");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        boolean z12 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        if (f0Var.f20619e != this.f20619e) {
            return false;
        }
        Object[] objArr = this.f20616b;
        int[] iArr = this.f20617c;
        long[] jArr = this.f20615a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i10 = 0;
        loop0: while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                int i12 = 0;
                while (i12 < i11) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj2 = objArr[i13];
                        int i14 = iArr[i13];
                        int iD = f0Var.d(obj2);
                        if (iD < 0) {
                            break loop0;
                        }
                        z11 = z12;
                        if (i14 != f0Var.f20617c[iD]) {
                            break loop0;
                        }
                    } else {
                        z11 = z12;
                    }
                    j10 >>= 8;
                    i12++;
                    z12 = z11;
                }
                z10 = z12;
                if (i11 != 8) {
                    return z10;
                }
            } else {
                z10 = z12;
            }
            if (i10 == length) {
                return z10;
            }
            i10++;
            z12 = z10;
        }
    }

    public final void f(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, w0.d(i10)) : 0;
        this.f20618d = iMax;
        if (iMax == 0) {
            jArr = w0.f20748a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            qg.m.n(jArr, -9187201950435737472L);
        }
        this.f20615a = jArr;
        int i11 = iMax >> 3;
        long j10 = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        this.f20620f = w0.a(this.f20618d) - this.f20619e;
        this.f20616b = new Object[iMax];
        this.f20617c = new int[iMax];
    }

    public final void g(int i10) {
        this.f20619e--;
        long[] jArr = this.f20615a;
        int i11 = this.f20618d;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
        this.f20616b[i10] = null;
    }

    public final void h(int i10, Object obj) {
        int iC = c(obj);
        if (iC < 0) {
            iC = ~iC;
        }
        this.f20616b[iC] = obj;
        this.f20617c[iC] = i10;
    }

    public final int hashCode() {
        Object[] objArr = this.f20616b;
        int[] iArr = this.f20617c;
        long[] jArr = this.f20615a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i10 = 0;
        int iHashCode = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj = objArr[i13];
                        iHashCode += Integer.hashCode(iArr[i13]) ^ (obj != null ? obj.hashCode() : 0);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return iHashCode;
                }
            }
            if (i10 == length) {
                return iHashCode;
            }
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[PHI: r8
      0x006a: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:22:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        if (this.f20619e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.f20616b;
        int[] iArr = this.f20617c;
        long[] jArr = this.f20615a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j10) < 128) {
                            int i14 = (i10 << 3) + i13;
                            Object obj = objArr[i14];
                            int i15 = iArr[i14];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(i15);
                            i11++;
                            if (i11 < this.f20619e) {
                                sb.append(", ");
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        sb.append('}');
        String string = sb.toString();
        kotlin.jvm.internal.r.d(string, "toString(...)");
        return string;
    }

    public f0(int i10) {
        this.f20615a = w0.f20748a;
        this.f20616b = q.a.f21639c;
        this.f20617c = k.f20650a;
        if (i10 >= 0) {
            f(w0.e(i10));
        } else {
            q.d.a("Capacity must be a positive value.");
            throw null;
        }
    }

    public /* synthetic */ f0(Object obj) {
        this(6);
    }
}
