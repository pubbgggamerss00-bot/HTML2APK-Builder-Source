package p;

import org.bouncycastle.asn1.eac.CertificateBody;

/* loaded from: classes.dex */
public final class l0<K, V> extends v0<K, V> {

    /* renamed from: f, reason: collision with root package name */
    public int f20674f;

    public l0() {
        this((Object) null);
    }

    public final void f() {
        this.f20741e = 0;
        long[] jArr = this.f20737a;
        if (jArr != w0.f20748a) {
            qg.m.n(jArr, -9187201950435737472L);
            long[] jArr2 = this.f20737a;
            int i10 = this.f20740d;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        qg.m.m(this.f20739c, 0, this.f20740d, null);
        qg.m.m(this.f20738b, 0, this.f20740d, null);
        this.f20674f = w0.a(this.f20740d) - this.f20741e;
    }

    public final int g(int i10) {
        int i11 = this.f20740d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f20737a;
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

    public final int h(K k10) {
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
        int i15 = this.f20740d;
        int i16 = i13 & i15;
        int i17 = 0;
        while (true) {
            long[] jArr3 = this.f20737a;
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
                if (kotlin.jvm.internal.r.a(this.f20738b[iNumberOfTrailingZeros], k10)) {
                    return iNumberOfTrailingZeros;
                }
                j16 &= j16 - 1;
                i11 = i21;
            }
            int i22 = i11;
            if ((((~j13) << 6) & j13 & (-9187201950435737472L)) != 0) {
                int iG = g(i13);
                long j17 = 255;
                if (this.f20674f != 0 || ((this.f20737a[iG >> 3] >> ((iG & 7) << 3)) & 255) == 254) {
                    j10 = 255;
                    j11 = j14;
                    j12 = 128;
                } else {
                    int i23 = this.f20740d;
                    if (i23 > 8) {
                        int i24 = 8;
                        if (Long.compareUnsigned(this.f20741e * 32, i23 * 25) <= 0) {
                            long[] jArr4 = this.f20737a;
                            int i25 = this.f20740d;
                            Object[] objArr2 = this.f20738b;
                            Object[] objArr3 = this.f20739c;
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
                            jArr4[i29] = (jArr4[i29] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[iV] = jArr4[0];
                            int i30 = 0;
                            while (i30 != i25) {
                                int i31 = i30 >> 3;
                                int i32 = (i30 & 7) << 3;
                                long j20 = (jArr4[i31] >> i32) & j10;
                                if (j20 != 128 && j20 == 254) {
                                    Object obj = objArr2[i30];
                                    int iHashCode2 = (obj != null ? obj.hashCode() : 0) * i22;
                                    int i33 = (iHashCode2 ^ (iHashCode2 << 16)) >>> 7;
                                    int iG2 = g(i33);
                                    int i34 = i33 & i25;
                                    if (((iG2 - i34) & i25) / i28 == ((i30 - i34) & i25) / i28) {
                                        jArr4[i31] = ((r8 & CertificateBody.profileType) << i32) | (jArr4[i31] & (~(j10 << i32)));
                                        jArr4[jArr4.length - 1] = jArr4[0];
                                        i30++;
                                        i28 = i28;
                                    } else {
                                        int i35 = i28;
                                        int i36 = iG2 >> 3;
                                        long j21 = jArr4[i36];
                                        int i37 = (iG2 & 7) << 3;
                                        if (((j21 >> i37) & j10) == 128) {
                                            i10 = i25;
                                            objArr = objArr2;
                                            jArr4[i36] = ((~(j10 << i37)) & j21) | ((r8 & CertificateBody.profileType) << i37);
                                            jArr4[i31] = (jArr4[i31] & (~(j10 << i32))) | (128 << i32);
                                            objArr[iG2] = objArr[i30];
                                            objArr[i30] = null;
                                            objArr3[iG2] = objArr3[i30];
                                            objArr3[i30] = null;
                                        } else {
                                            i10 = i25;
                                            objArr = objArr2;
                                            jArr4[i36] = ((r8 & CertificateBody.profileType) << i37) | ((~(j10 << i37)) & j21);
                                            Object obj2 = objArr[iG2];
                                            objArr[iG2] = objArr[i30];
                                            objArr[i30] = obj2;
                                            Object obj3 = objArr3[iG2];
                                            objArr3[iG2] = objArr3[i30];
                                            objArr3[i30] = obj3;
                                            i30--;
                                        }
                                        jArr4[jArr4.length - 1] = jArr4[0];
                                        i30++;
                                        i28 = i35;
                                        i25 = i10;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i30++;
                                }
                            }
                            this.f20674f = w0.a(this.f20740d) - this.f20741e;
                        }
                        iG = g(i13);
                    }
                    j10 = 255;
                    j11 = j14;
                    j12 = 128;
                    int iC = w0.c(this.f20740d);
                    long[] jArr5 = this.f20737a;
                    Object[] objArr4 = this.f20738b;
                    Object[] objArr5 = this.f20739c;
                    int i38 = this.f20740d;
                    i(iC);
                    long[] jArr6 = this.f20737a;
                    Object[] objArr6 = this.f20738b;
                    Object[] objArr7 = this.f20739c;
                    int i39 = this.f20740d;
                    int i40 = 0;
                    while (i40 < i38) {
                        if (((jArr5[i40 >> 3] >> ((i40 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr4[i40];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i22;
                            int i41 = iHashCode3 ^ (iHashCode3 << 16);
                            int iG3 = g(i41 >>> 7);
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j22 = i41 & CertificateBody.profileType;
                            int i42 = iG3 >> 3;
                            int i43 = (iG3 & 7) << 3;
                            long j23 = (jArr[i42] & (~(255 << i43))) | (j22 << i43);
                            jArr[i42] = j23;
                            jArr[(((iG3 - 7) & i39) + (i39 & 7)) >> 3] = j23;
                            objArr6[iG3] = obj4;
                            objArr7[iG3] = objArr5[i40];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i40++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    iG = g(i13);
                }
                this.f20741e++;
                int i44 = this.f20674f;
                long[] jArr7 = this.f20737a;
                int i45 = iG >> 3;
                long j24 = jArr7[i45];
                int i46 = (iG & 7) << 3;
                this.f20674f = i44 - (((j24 >> i46) & j10) == j12 ? 1 : 0);
                int i47 = this.f20740d;
                long j25 = (j24 & (~(j10 << i46))) | (j11 << i46);
                jArr7[i45] = j25;
                jArr7[(((iG - 7) & i47) + (i47 & 7)) >> 3] = j25;
                return ~iG;
            }
            i17 += 8;
            i16 = (i16 + i17) & i15;
            i14 = i20;
            i11 = i22;
        }
    }

    public final void i(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, w0.d(i10)) : 0;
        this.f20740d = iMax;
        if (iMax == 0) {
            jArr = w0.f20748a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            qg.m.n(jArr, -9187201950435737472L);
            int i11 = iMax >> 3;
            long j10 = 255 << ((iMax & 7) << 3);
            jArr[i11] = (jArr[i11] & (~j10)) | j10;
        }
        this.f20737a = jArr;
        this.f20674f = w0.a(this.f20740d) - this.f20741e;
        Object[] objArr = q.a.f21639c;
        this.f20738b = iMax == 0 ? objArr : new Object[iMax];
        if (iMax != 0) {
            objArr = new Object[iMax];
        }
        this.f20739c = objArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0068, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006a, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V j(K k10) {
        int iNumberOfTrailingZeros;
        int i10 = 0;
        int iHashCode = (k10 != null ? k10.hashCode() : 0) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & CertificateBody.profileType;
        int i13 = this.f20740d;
        int i14 = i11 >>> 7;
        loop0: while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.f20737a;
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (i12 * 72340172838076673L) ^ j10;
            long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j12 == 0) {
                    break;
                }
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i15) & i13;
                if (kotlin.jvm.internal.r.a(this.f20738b[iNumberOfTrailingZeros], k10)) {
                    break loop0;
                }
                j12 &= j12 - 1;
            }
            i10 += 8;
            i14 = i15 + i10;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return k(iNumberOfTrailingZeros);
        }
        return null;
    }

    public final V k(int i10) {
        this.f20741e--;
        long[] jArr = this.f20737a;
        int i11 = this.f20740d;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
        this.f20738b[i10] = null;
        Object[] objArr = this.f20739c;
        V v10 = (V) objArr[i10];
        objArr[i10] = null;
        return v10;
    }

    public final void l(K k10, V v10) {
        int iH = h(k10);
        if (iH < 0) {
            iH = ~iH;
        }
        this.f20738b[iH] = k10;
        this.f20739c[iH] = v10;
    }

    public l0(int i10) {
        this.f20737a = w0.f20748a;
        Object[] objArr = q.a.f21639c;
        this.f20738b = objArr;
        this.f20739c = objArr;
        if (i10 >= 0) {
            i(w0.e(i10));
        } else {
            q.d.a("Capacity must be a positive value.");
            throw null;
        }
    }

    public /* synthetic */ l0(Object obj) {
        this(6);
    }
}
