package p;

import org.bouncycastle.asn1.eac.CertificateBody;

/* loaded from: classes.dex */
public final class c0<V> extends n<V> {

    /* renamed from: f, reason: collision with root package name */
    public int f20581f;

    public c0(int i10) {
        if (i10 >= 0) {
            f(w0.e(i10));
        } else {
            q.d.a("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void c() {
        this.f20681e = 0;
        long[] jArr = this.f20677a;
        if (jArr != w0.f20748a) {
            qg.m.n(jArr, -9187201950435737472L);
            long[] jArr2 = this.f20677a;
            int i10 = this.f20680d;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        qg.m.m(this.f20679c, 0, this.f20680d, null);
        this.f20581f = w0.a(this.f20680d) - this.f20681e;
    }

    public final int d(long j10) {
        long j11;
        long j12;
        int i10;
        int i11;
        long j13;
        long[] jArr;
        long[] jArr2;
        long j14;
        Object[] objArr;
        int i12;
        long[] jArr3;
        int i13 = -862048943;
        int iHashCode = Long.hashCode(j10) * (-862048943);
        int i14 = iHashCode ^ (iHashCode << 16);
        int i15 = i14 >>> 7;
        int i16 = i14 & CertificateBody.profileType;
        int i17 = this.f20680d;
        int i18 = i15 & i17;
        int i19 = 0;
        while (true) {
            long[] jArr4 = this.f20677a;
            int i20 = i18 >> 3;
            int i21 = (i18 & 7) << 3;
            int i22 = 1;
            long j15 = ((jArr4[i20 + 1] << (64 - i21)) & ((-i21) >> 63)) | (jArr4[i20] >>> i21);
            long j16 = i16;
            int i23 = i19;
            int i24 = 0;
            long j17 = j15 ^ (j16 * 72340172838076673L);
            long j18 = (~j17) & (j17 - 72340172838076673L) & (-9187201950435737472L);
            while (j18 != 0) {
                int iNumberOfTrailingZeros = (i18 + (Long.numberOfTrailingZeros(j18) >> 3)) & i17;
                int i25 = i13;
                if (this.f20678b[iNumberOfTrailingZeros] == j10) {
                    return iNumberOfTrailingZeros;
                }
                j18 &= j18 - 1;
                i13 = i25;
            }
            int i26 = i13;
            if ((((~j15) << 6) & j15 & (-9187201950435737472L)) != 0) {
                int iE = e(i15);
                if (this.f20581f != 0 || ((this.f20677a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    j11 = 255;
                    j12 = j16;
                    i10 = 0;
                    i11 = 1;
                    j13 = 128;
                } else {
                    int i27 = this.f20680d;
                    if (i27 > 8) {
                        j13 = 128;
                        if (Long.compareUnsigned(this.f20681e * 32, i27 * 25) <= 0) {
                            long[] jArr5 = this.f20677a;
                            int i28 = this.f20680d;
                            long[] jArr6 = this.f20678b;
                            Object[] objArr2 = this.f20679c;
                            int i29 = (i28 + 7) >> 3;
                            j11 = 255;
                            int i30 = 0;
                            while (i30 < i29) {
                                long j19 = jArr5[i30] & (-9187201950435737472L);
                                jArr5[i30] = (-72340172838076674L) & ((~j19) + (j19 >>> 7));
                                i30++;
                                i22 = i22;
                                i24 = i24;
                                j16 = j16;
                            }
                            j12 = j16;
                            i10 = i24;
                            int i31 = i22;
                            char c10 = 7;
                            int iV = qg.o.v(jArr5);
                            int i32 = iV - 1;
                            long j20 = 72057594037927935L;
                            jArr5[i32] = (jArr5[i32] & 72057594037927935L) | (-72057594037927936L);
                            jArr5[iV] = jArr5[i10];
                            int i33 = i10;
                            while (i33 != i28) {
                                int i34 = i33 >> 3;
                                int i35 = (i33 & 7) << 3;
                                long j21 = (jArr5[i34] >> i35) & 255;
                                if (j21 != 128 && j21 == 254) {
                                    int iHashCode2 = Long.hashCode(jArr6[i33]) * i26;
                                    int i36 = (iHashCode2 ^ (iHashCode2 << 16)) >>> 7;
                                    int iE2 = e(i36);
                                    int i37 = i36 & i28;
                                    char c11 = c10;
                                    if (((iE2 - i37) & i28) / 8 == ((i33 - i37) & i28) / 8) {
                                        int i38 = i31;
                                        j14 = j20;
                                        jArr5[i34] = ((r9 & CertificateBody.profileType) << i35) | (jArr5[i34] & (~(255 << i35)));
                                        jArr5[jArr5.length - i38] = (jArr5[i10] & j14) | Long.MIN_VALUE;
                                        i33++;
                                        i31 = i38;
                                        c10 = c11;
                                    } else {
                                        int i39 = i31;
                                        j14 = j20;
                                        int i40 = iE2 >> 3;
                                        long j22 = jArr5[i40];
                                        int i41 = (iE2 & 7) << 3;
                                        if (((j22 >> i41) & 255) == 128) {
                                            i12 = i39;
                                            jArr3 = jArr6;
                                            objArr = objArr2;
                                            jArr5[i40] = (j22 & (~(255 << i41))) | ((r9 & CertificateBody.profileType) << i41);
                                            jArr5[i34] = (jArr5[i34] & (~(255 << i35))) | (128 << i35);
                                            jArr3[iE2] = jArr3[i33];
                                            jArr3[i33] = 0;
                                            objArr[iE2] = objArr[i33];
                                            objArr[i33] = null;
                                        } else {
                                            objArr = objArr2;
                                            i12 = i39;
                                            jArr3 = jArr6;
                                            jArr5[i40] = ((r9 & CertificateBody.profileType) << i41) | (j22 & (~(255 << i41)));
                                            long j23 = jArr3[iE2];
                                            jArr3[iE2] = jArr3[i33];
                                            jArr3[i33] = j23;
                                            Object obj = objArr[iE2];
                                            objArr[iE2] = objArr[i33];
                                            objArr[i33] = obj;
                                            i33--;
                                        }
                                        jArr5[jArr5.length - 1] = (jArr5[i10] & j14) | Long.MIN_VALUE;
                                        i33++;
                                        jArr6 = jArr3;
                                        i31 = i12;
                                        c10 = c11;
                                        objArr2 = objArr;
                                    }
                                    j20 = j14;
                                } else {
                                    i33++;
                                }
                            }
                            i11 = i31;
                            this.f20581f = w0.a(this.f20680d) - this.f20681e;
                        }
                        iE = e(i15);
                    } else {
                        j13 = 128;
                    }
                    j11 = 255;
                    j12 = j16;
                    i10 = 0;
                    i11 = 1;
                    int iC = w0.c(this.f20680d);
                    long[] jArr7 = this.f20677a;
                    long[] jArr8 = this.f20678b;
                    Object[] objArr3 = this.f20679c;
                    int i42 = this.f20680d;
                    f(iC);
                    long[] jArr9 = this.f20677a;
                    long[] jArr10 = this.f20678b;
                    Object[] objArr4 = this.f20679c;
                    int i43 = this.f20680d;
                    int i44 = 0;
                    while (i44 < i42) {
                        if (((jArr7[i44 >> 3] >> ((i44 & 7) << 3)) & 255) < j13) {
                            long j24 = jArr8[i44];
                            int iHashCode3 = Long.hashCode(j24) * i26;
                            int i45 = iHashCode3 ^ (iHashCode3 << 16);
                            int iE3 = e(i45 >>> 7);
                            jArr = jArr9;
                            jArr2 = jArr7;
                            long j25 = i45 & CertificateBody.profileType;
                            int i46 = iE3 >> 3;
                            int i47 = (iE3 & 7) << 3;
                            long j26 = (jArr[i46] & (~(255 << i47))) | (j25 << i47);
                            jArr[i46] = j26;
                            jArr[(((iE3 - 7) & i43) + (i43 & 7)) >> 3] = j26;
                            jArr10[iE3] = j24;
                            objArr4[iE3] = objArr3[i44];
                        } else {
                            jArr = jArr9;
                            jArr2 = jArr7;
                        }
                        i44++;
                        jArr7 = jArr2;
                        jArr9 = jArr;
                    }
                    iE = e(i15);
                }
                this.f20681e++;
                int i48 = this.f20581f;
                long[] jArr11 = this.f20677a;
                int i49 = iE >> 3;
                long j27 = jArr11[i49];
                int i50 = (iE & 7) << 3;
                if (((j27 >> i50) & j11) != j13) {
                    i11 = i10;
                }
                this.f20581f = i48 - i11;
                int i51 = this.f20680d;
                long j28 = (j27 & (~(j11 << i50))) | (j12 << i50);
                jArr11[i49] = j28;
                jArr11[(((iE - 7) & i51) + (i51 & 7)) >> 3] = j28;
                return iE;
            }
            i19 = i23 + 8;
            i18 = (i18 + i19) & i17;
            i13 = i26;
        }
    }

    public final int e(int i10) {
        int i11 = this.f20680d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f20677a;
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

    public final void f(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, w0.d(i10)) : 0;
        this.f20680d = iMax;
        if (iMax == 0) {
            jArr = w0.f20748a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            qg.m.n(jArr, -9187201950435737472L);
        }
        this.f20677a = jArr;
        int i11 = iMax >> 3;
        long j10 = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        this.f20581f = w0.a(this.f20680d) - this.f20681e;
        this.f20678b = new long[iMax];
        this.f20679c = new Object[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0062, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0064, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V g(long j10) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(j10) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & CertificateBody.profileType;
        int i12 = this.f20680d;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f20677a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j11 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j12 = (i11 * 72340172838076673L) ^ j11;
            long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j13 == 0) {
                    break;
                }
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i13) & i12;
                if (this.f20678b[iNumberOfTrailingZeros] == j10) {
                    break loop0;
                }
                j13 &= j13 - 1;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        if (iNumberOfTrailingZeros < 0) {
            return null;
        }
        this.f20681e--;
        long[] jArr2 = this.f20677a;
        int i17 = this.f20680d;
        int i18 = iNumberOfTrailingZeros >> 3;
        int i19 = (iNumberOfTrailingZeros & 7) << 3;
        long j14 = (jArr2[i18] & (~(255 << i19))) | (254 << i19);
        jArr2[i18] = j14;
        jArr2[(((iNumberOfTrailingZeros - 7) & i17) + (i17 & 7)) >> 3] = j14;
        Object[] objArr = this.f20679c;
        V v10 = (V) objArr[iNumberOfTrailingZeros];
        objArr[iNumberOfTrailingZeros] = null;
        return v10;
    }

    public final void h(Object obj, long j10) {
        int iD = d(j10);
        this.f20678b[iD] = j10;
        this.f20679c[iD] = obj;
    }

    public /* synthetic */ c0() {
        this(6);
    }
}
