package p;

import org.bouncycastle.asn1.eac.CertificateBody;

/* loaded from: classes.dex */
public final class m0<E> extends x0<E> {

    /* renamed from: e, reason: collision with root package name */
    public int f20676e;

    public m0() {
        this((Object) null);
    }

    public final boolean d(E e10) {
        int i10 = this.f20755d;
        this.f20753b[f(e10)] = e10;
        return this.f20755d != i10;
    }

    public final void e() {
        this.f20755d = 0;
        long[] jArr = this.f20752a;
        if (jArr != w0.f20748a) {
            qg.m.n(jArr, -9187201950435737472L);
            long[] jArr2 = this.f20752a;
            int i10 = this.f20754c;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        qg.m.m(this.f20753b, 0, this.f20754c, null);
        this.f20676e = w0.a(this.f20754c) - this.f20755d;
    }

    public final int f(E e10) {
        long j10;
        long j11;
        long j12;
        long[] jArr;
        long[] jArr2;
        int i10;
        Object[] objArr;
        int i11;
        int i12 = -862048943;
        int iHashCode = (e10 != null ? e10.hashCode() : 0) * (-862048943);
        int i13 = iHashCode ^ (iHashCode << 16);
        int i14 = i13 >>> 7;
        int i15 = i13 & CertificateBody.profileType;
        int i16 = this.f20754c;
        int i17 = i14 & i16;
        int i18 = 0;
        while (true) {
            long[] jArr3 = this.f20752a;
            int i19 = i17 >> 3;
            int i20 = (i17 & 7) << 3;
            long j13 = ((jArr3[i19 + 1] << (64 - i20)) & ((-i20) >> 63)) | (jArr3[i19] >>> i20);
            long j14 = i15;
            int i21 = i15;
            long j15 = j13 ^ (j14 * 72340172838076673L);
            long j16 = (~j15) & (j15 - 72340172838076673L) & (-9187201950435737472L);
            while (j16 != 0) {
                int iNumberOfTrailingZeros = (i17 + (Long.numberOfTrailingZeros(j16) >> 3)) & i16;
                int i22 = i12;
                if (kotlin.jvm.internal.r.a(this.f20753b[iNumberOfTrailingZeros], e10)) {
                    return iNumberOfTrailingZeros;
                }
                j16 &= j16 - 1;
                i12 = i22;
            }
            int i23 = i12;
            if ((((~j13) << 6) & j13 & (-9187201950435737472L)) != 0) {
                int iG = g(i14);
                long j17 = 255;
                if (this.f20676e != 0 || ((this.f20752a[iG >> 3] >> ((iG & 7) << 3)) & 255) == 254) {
                    j10 = 255;
                    j11 = j14;
                    j12 = 128;
                } else {
                    int i24 = this.f20754c;
                    if (i24 > 8) {
                        int i25 = 8;
                        if (Long.compareUnsigned(this.f20755d * 32, i24 * 25) <= 0) {
                            long[] jArr4 = this.f20752a;
                            int i26 = this.f20754c;
                            Object[] objArr2 = this.f20753b;
                            int i27 = (i26 + 7) >> 3;
                            int i28 = 0;
                            j12 = 128;
                            while (i28 < i27) {
                                long j18 = j17;
                                long j19 = jArr4[i28] & (-9187201950435737472L);
                                jArr4[i28] = (-72340172838076674L) & ((~j19) + (j19 >>> 7));
                                i28++;
                                i25 = i25;
                                j14 = j14;
                                j17 = j18;
                            }
                            j10 = j17;
                            j11 = j14;
                            int i29 = i25;
                            int iV = qg.o.v(jArr4);
                            int i30 = iV - 1;
                            long j20 = 72057594037927935L;
                            jArr4[i30] = (jArr4[i30] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[iV] = jArr4[0];
                            int i31 = 0;
                            while (i31 != i26) {
                                int i32 = i31 >> 3;
                                int i33 = (i31 & 7) << 3;
                                long j21 = (jArr4[i32] >> i33) & j10;
                                if (j21 != 128 && j21 == 254) {
                                    Object obj = objArr2[i31];
                                    int iHashCode2 = (obj != null ? obj.hashCode() : 0) * i23;
                                    int i34 = (iHashCode2 ^ (iHashCode2 << 16)) >>> 7;
                                    int iG2 = g(i34);
                                    int i35 = i34 & i26;
                                    if (((iG2 - i35) & i26) / i29 == ((i31 - i35) & i26) / i29) {
                                        long j22 = j20;
                                        jArr4[i32] = ((r7 & CertificateBody.profileType) << i33) | ((~(j10 << i33)) & jArr4[i32]);
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j22) | Long.MIN_VALUE;
                                        i31++;
                                        j20 = j22;
                                    } else {
                                        long j23 = j20;
                                        int i36 = iG2 >> 3;
                                        long j24 = jArr4[i36];
                                        int i37 = (iG2 & 7) << 3;
                                        if (((j24 >> i37) & j10) == 128) {
                                            i11 = i29;
                                            i10 = i26;
                                            objArr = objArr2;
                                            jArr4[i36] = ((~(j10 << i37)) & j24) | ((r7 & CertificateBody.profileType) << i37);
                                            jArr4[i32] = (jArr4[i32] & (~(j10 << i33))) | (128 << i33);
                                            objArr[iG2] = objArr[i31];
                                            objArr[i31] = null;
                                        } else {
                                            i10 = i26;
                                            objArr = objArr2;
                                            i11 = i29;
                                            jArr4[i36] = ((r7 & CertificateBody.profileType) << i37) | ((~(j10 << i37)) & j24);
                                            Object obj2 = objArr[iG2];
                                            objArr[iG2] = objArr[i31];
                                            objArr[i31] = obj2;
                                            i31--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j23) | Long.MIN_VALUE;
                                        i31++;
                                        j20 = j23;
                                        i29 = i11;
                                        i26 = i10;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i31++;
                                }
                            }
                            this.f20676e = w0.a(this.f20754c) - this.f20755d;
                        }
                        iG = g(i14);
                    }
                    j10 = 255;
                    j11 = j14;
                    j12 = 128;
                    int iC = w0.c(this.f20754c);
                    long[] jArr5 = this.f20752a;
                    Object[] objArr3 = this.f20753b;
                    int i38 = this.f20754c;
                    h(iC);
                    long[] jArr6 = this.f20752a;
                    Object[] objArr4 = this.f20753b;
                    int i39 = this.f20754c;
                    int i40 = 0;
                    while (i40 < i38) {
                        if (((jArr5[i40 >> 3] >> ((i40 & 7) << 3)) & 255) < 128) {
                            Object obj3 = objArr3[i40];
                            int iHashCode3 = (obj3 != null ? obj3.hashCode() : 0) * i23;
                            int i41 = iHashCode3 ^ (iHashCode3 << 16);
                            int iG3 = g(i41 >>> 7);
                            long j25 = i41 & CertificateBody.profileType;
                            int i42 = iG3 >> 3;
                            int i43 = (iG3 & 7) << 3;
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j26 = (jArr6[i42] & (~(255 << i43))) | (j25 << i43);
                            jArr[i42] = j26;
                            jArr[(((iG3 - 7) & i39) + (i39 & 7)) >> 3] = j26;
                            objArr4[iG3] = obj3;
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i40++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    iG = g(i14);
                }
                this.f20755d++;
                int i44 = this.f20676e;
                long[] jArr7 = this.f20752a;
                int i45 = iG >> 3;
                long j27 = jArr7[i45];
                int i46 = (iG & 7) << 3;
                this.f20676e = i44 - (((j27 >> i46) & j10) == j12 ? 1 : 0);
                int i47 = this.f20754c;
                long j28 = (j27 & (~(j10 << i46))) | (j11 << i46);
                jArr7[i45] = j28;
                jArr7[(((iG - 7) & i47) + (i47 & 7)) >> 3] = j28;
                return iG;
            }
            i18 += 8;
            i17 = (i17 + i18) & i16;
            i15 = i21;
            i12 = i23;
        }
    }

    public final int g(int i10) {
        int i11 = this.f20754c;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f20752a;
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

    public final void h(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, w0.d(i10)) : 0;
        this.f20754c = iMax;
        if (iMax == 0) {
            jArr = w0.f20748a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            qg.m.n(jArr, -9187201950435737472L);
        }
        this.f20752a = jArr;
        int i11 = iMax >> 3;
        long j10 = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        this.f20676e = w0.a(this.f20754c) - this.f20755d;
        this.f20753b = iMax == 0 ? q.a.f21639c : new Object[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0068, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006a, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(E e10) {
        int iNumberOfTrailingZeros;
        int i10 = 0;
        int iHashCode = (e10 != null ? e10.hashCode() : 0) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & CertificateBody.profileType;
        int i13 = this.f20754c;
        int i14 = i11 >>> 7;
        loop0: while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.f20752a;
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
                if (kotlin.jvm.internal.r.a(this.f20753b[iNumberOfTrailingZeros], e10)) {
                    break loop0;
                } else {
                    j12 &= j12 - 1;
                }
            }
            i10 += 8;
            i14 = i15 + i10;
        }
        if (iNumberOfTrailingZeros >= 0) {
            m(iNumberOfTrailingZeros);
        }
    }

    public final void j(E e10) {
        this.f20753b[f(e10)] = e10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(x0<E> elements) {
        kotlin.jvm.internal.r.e(elements, "elements");
        Object[] objArr = elements.f20753b;
        long[] jArr = elements.f20752a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        j(objArr[(i10 << 3) + i12]);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006d, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006f, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean l(E e10) {
        int iNumberOfTrailingZeros;
        int iHashCode = (e10 != null ? e10.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & CertificateBody.profileType;
        int i12 = this.f20754c;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f20752a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (i11 * 72340172838076673L) ^ j10;
            long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j12 == 0) {
                    break;
                }
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                if (kotlin.jvm.internal.r.a(this.f20753b[iNumberOfTrailingZeros], e10)) {
                    break loop0;
                }
                j12 &= j12 - 1;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        boolean z10 = iNumberOfTrailingZeros >= 0;
        if (z10) {
            m(iNumberOfTrailingZeros);
        }
        return z10;
    }

    public final void m(int i10) {
        this.f20755d--;
        long[] jArr = this.f20752a;
        int i11 = this.f20754c;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
        this.f20753b[i10] = null;
    }

    public m0(int i10) {
        if (i10 >= 0) {
            h(w0.e(i10));
        } else {
            q.d.a("Capacity must be a positive value.");
            throw null;
        }
    }

    public /* synthetic */ m0(Object obj) {
        this(6);
    }
}
