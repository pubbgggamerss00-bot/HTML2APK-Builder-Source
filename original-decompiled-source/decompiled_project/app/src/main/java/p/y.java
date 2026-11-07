package p;

import org.bouncycastle.asn1.eac.CertificateBody;

/* loaded from: classes.dex */
public final class y<V> extends i<V> {

    /* renamed from: f, reason: collision with root package name */
    public int f20757f;

    public y(int i10) {
        this.f20643a = w0.f20748a;
        this.f20644b = k.f20650a;
        this.f20645c = q.a.f21639c;
        if (i10 >= 0) {
            f(w0.e(i10));
        } else {
            q.d.a("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void c() {
        this.f20647e = 0;
        long[] jArr = this.f20643a;
        if (jArr != w0.f20748a) {
            qg.m.n(jArr, -9187201950435737472L);
            long[] jArr2 = this.f20643a;
            int i10 = this.f20646d;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        qg.m.m(this.f20645c, 0, this.f20646d, null);
        this.f20757f = w0.a(this.f20646d) - this.f20647e;
    }

    public final int d(int i10) {
        long j10;
        long j11;
        int i11;
        long j12;
        long[] jArr;
        long[] jArr2;
        int[] iArr;
        Object[] objArr;
        int i12;
        int i13 = -862048943;
        int iHashCode = Integer.hashCode(i10) * (-862048943);
        int i14 = iHashCode ^ (iHashCode << 16);
        int i15 = i14 >>> 7;
        int i16 = i14 & CertificateBody.profileType;
        int i17 = this.f20646d;
        int i18 = i15 & i17;
        int i19 = 0;
        while (true) {
            long[] jArr3 = this.f20643a;
            int i20 = i18 >> 3;
            int i21 = (i18 & 7) << 3;
            int i22 = 1;
            long j13 = ((jArr3[i20 + 1] << (64 - i21)) & ((-i21) >> 63)) | (jArr3[i20] >>> i21);
            long j14 = i16;
            int i23 = i19;
            int i24 = 0;
            long j15 = j13 ^ (j14 * 72340172838076673L);
            long j16 = (~j15) & (j15 - 72340172838076673L) & (-9187201950435737472L);
            while (j16 != 0) {
                int iNumberOfTrailingZeros = (i18 + (Long.numberOfTrailingZeros(j16) >> 3)) & i17;
                int i25 = i13;
                int i26 = i24;
                if (this.f20644b[iNumberOfTrailingZeros] == i10) {
                    return iNumberOfTrailingZeros;
                }
                j16 &= j16 - 1;
                i13 = i25;
                i24 = i26;
            }
            int i27 = i13;
            int i28 = i24;
            if ((((~j13) << 6) & j13 & (-9187201950435737472L)) != 0) {
                int iE = e(i15);
                long j17 = 255;
                if (this.f20757f != 0 || ((this.f20643a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    j10 = 255;
                    j11 = j14;
                    i11 = 1;
                    j12 = 128;
                } else {
                    int i29 = this.f20646d;
                    if (i29 > 8) {
                        j12 = 128;
                        if (Long.compareUnsigned(this.f20647e * 32, i29 * 25) <= 0) {
                            long[] jArr4 = this.f20643a;
                            int i30 = this.f20646d;
                            int[] iArr2 = this.f20644b;
                            Object[] objArr2 = this.f20645c;
                            int i31 = (i30 + 7) >> 3;
                            int i32 = i28;
                            while (i32 < i31) {
                                long j18 = j17;
                                long j19 = jArr4[i32] & (-9187201950435737472L);
                                jArr4[i32] = (-72340172838076674L) & ((~j19) + (j19 >>> 7));
                                i32++;
                                j14 = j14;
                                j17 = j18;
                            }
                            j10 = j17;
                            j11 = j14;
                            int iV = qg.o.v(jArr4);
                            int i33 = iV - 1;
                            long j20 = 72057594037927935L;
                            jArr4[i33] = (jArr4[i33] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[iV] = jArr4[i28];
                            int i34 = i28;
                            while (i34 != i30) {
                                int i35 = i34 >> 3;
                                int i36 = (i34 & 7) << 3;
                                long j21 = (jArr4[i35] >> i36) & j10;
                                if (j21 != 128 && j21 == 254) {
                                    int iHashCode2 = Integer.hashCode(iArr2[i34]) * i27;
                                    int i37 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i38 = i37 >>> 7;
                                    int iE2 = e(i38);
                                    int i39 = i38 & i30;
                                    if (((iE2 - i39) & i30) / 8 == ((i34 - i39) & i30) / 8) {
                                        long j22 = j20;
                                        jArr4[i35] = ((i37 & CertificateBody.profileType) << i36) | ((~(j10 << i36)) & jArr4[i35]);
                                        jArr4[jArr4.length - i22] = (jArr4[i28] & j22) | Long.MIN_VALUE;
                                        i34++;
                                        j20 = j22;
                                    } else {
                                        long j23 = j20;
                                        int i40 = iE2 >> 3;
                                        long j24 = jArr4[i40];
                                        int i41 = (iE2 & 7) << 3;
                                        if (((j24 >> i41) & j10) == 128) {
                                            i12 = i22;
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            jArr4[i40] = ((~(j10 << i41)) & j24) | ((i37 & CertificateBody.profileType) << i41);
                                            jArr4[i35] = (jArr4[i35] & (~(j10 << i36))) | (128 << i36);
                                            iArr[iE2] = iArr[i34];
                                            iArr[i34] = i28;
                                            objArr[iE2] = objArr[i34];
                                            objArr[i34] = null;
                                        } else {
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            i12 = i22;
                                            jArr4[i40] = ((i37 & CertificateBody.profileType) << i41) | ((~(j10 << i41)) & j24);
                                            int i42 = iArr[iE2];
                                            iArr[iE2] = iArr[i34];
                                            iArr[i34] = i42;
                                            Object obj = objArr[iE2];
                                            objArr[iE2] = objArr[i34];
                                            objArr[i34] = obj;
                                            i34--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[i28] & j23) | Long.MIN_VALUE;
                                        i34++;
                                        j20 = j23;
                                        i22 = i12;
                                        iArr2 = iArr;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i34++;
                                }
                            }
                            i11 = i22;
                            this.f20757f = w0.a(this.f20646d) - this.f20647e;
                        }
                        iE = e(i15);
                    } else {
                        j12 = 128;
                    }
                    j10 = 255;
                    j11 = j14;
                    i11 = 1;
                    int iC = w0.c(this.f20646d);
                    long[] jArr5 = this.f20643a;
                    int[] iArr3 = this.f20644b;
                    Object[] objArr3 = this.f20645c;
                    int i43 = this.f20646d;
                    f(iC);
                    long[] jArr6 = this.f20643a;
                    int[] iArr4 = this.f20644b;
                    Object[] objArr4 = this.f20645c;
                    int i44 = this.f20646d;
                    int i45 = i28;
                    while (i45 < i43) {
                        if (((jArr5[i45 >> 3] >> ((i45 & 7) << 3)) & 255) < j12) {
                            int i46 = iArr3[i45];
                            int iHashCode3 = Integer.hashCode(i46) * i27;
                            int i47 = iHashCode3 ^ (iHashCode3 << 16);
                            int iE3 = e(i47 >>> 7);
                            long j25 = i47 & CertificateBody.profileType;
                            int i48 = iE3 >> 3;
                            int i49 = (iE3 & 7) << 3;
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j26 = (jArr6[i48] & (~(255 << i49))) | (j25 << i49);
                            jArr[i48] = j26;
                            jArr[(((iE3 - 7) & i44) + (i44 & 7)) >> 3] = j26;
                            iArr4[iE3] = i46;
                            objArr4[iE3] = objArr3[i45];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i45++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    iE = e(i15);
                }
                this.f20647e++;
                int i50 = this.f20757f;
                long[] jArr7 = this.f20643a;
                int i51 = iE >> 3;
                long j27 = jArr7[i51];
                int i52 = (iE & 7) << 3;
                if (((j27 >> i52) & j10) != j12) {
                    i11 = i28;
                }
                this.f20757f = i50 - i11;
                int i53 = this.f20646d;
                long j28 = (j27 & (~(j10 << i52))) | (j11 << i52);
                jArr7[i51] = j28;
                jArr7[(((iE - 7) & i53) + (i53 & 7)) >> 3] = j28;
                return iE;
            }
            i19 = i23 + 8;
            i18 = (i18 + i19) & i17;
            i13 = i27;
        }
    }

    public final int e(int i10) {
        int i11 = this.f20646d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f20643a;
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
        this.f20646d = iMax;
        if (iMax == 0) {
            jArr = w0.f20748a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            qg.m.n(jArr, -9187201950435737472L);
        }
        this.f20643a = jArr;
        int i11 = iMax >> 3;
        long j10 = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        this.f20757f = w0.a(this.f20646d) - this.f20647e;
        this.f20644b = new int[iMax];
        this.f20645c = new Object[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0060, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0062, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V g(int i10) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i10) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & CertificateBody.profileType;
        int i13 = this.f20646d;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.f20643a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (i12 * 72340172838076673L) ^ j10;
            long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j12 == 0) {
                    break;
                }
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i14) & i13;
                if (this.f20644b[iNumberOfTrailingZeros] == i10) {
                    break loop0;
                }
                j12 &= j12 - 1;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
        }
        if (iNumberOfTrailingZeros < 0) {
            return null;
        }
        this.f20647e--;
        long[] jArr2 = this.f20643a;
        int i18 = this.f20646d;
        int i19 = iNumberOfTrailingZeros >> 3;
        int i20 = (iNumberOfTrailingZeros & 7) << 3;
        long j13 = (jArr2[i19] & (~(255 << i20))) | (254 << i20);
        jArr2[i19] = j13;
        jArr2[(((iNumberOfTrailingZeros - 7) & i18) + (i18 & 7)) >> 3] = j13;
        Object[] objArr = this.f20645c;
        V v10 = (V) objArr[iNumberOfTrailingZeros];
        objArr[iNumberOfTrailingZeros] = null;
        return v10;
    }

    public final void h(int i10, V v10) {
        int iD = d(i10);
        this.f20644b[iD] = i10;
        this.f20645c[iD] = v10;
    }

    public /* synthetic */ y() {
        this(6);
    }
}
