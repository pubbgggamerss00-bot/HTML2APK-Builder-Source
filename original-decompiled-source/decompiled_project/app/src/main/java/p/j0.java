package p;

import java.util.Arrays;
import java.util.Collection;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.eac.CertificateBody;

/* loaded from: classes.dex */
public final class j0<E> extends s0<E> {

    /* renamed from: h, reason: collision with root package name */
    public int f20649h;

    public j0(int i10) {
        this.f20712a = w0.f20748a;
        this.f20713b = q.a.f21639c;
        this.f20714c = a1.f20567a;
        this.f20715d = Integer.MAX_VALUE;
        this.f20716e = Integer.MAX_VALUE;
        if (i10 >= 0) {
            f(w0.e(i10));
        } else {
            q.d.a("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean b(E e10) {
        int i10 = this.f20718g;
        int iD = d(e10);
        this.f20713b[iD] = e10;
        long[] jArr = this.f20714c;
        int i11 = this.f20715d;
        jArr[iD] = (i11 & 2147483647L) | 4611686016279904256L;
        if (i11 != Integer.MAX_VALUE) {
            jArr[i11] = ((iD & 2147483647L) << 31) | (jArr[i11] & (-4611686016279904257L));
        }
        this.f20715d = iD;
        if (this.f20716e == Integer.MAX_VALUE) {
            this.f20716e = iD;
        }
        return this.f20718g != i10;
    }

    public final void c() {
        this.f20718g = 0;
        long[] jArr = this.f20712a;
        if (jArr != w0.f20748a) {
            qg.m.n(jArr, -9187201950435737472L);
            long[] jArr2 = this.f20712a;
            int i10 = this.f20717f;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        qg.m.m(this.f20713b, 0, this.f20717f, null);
        qg.m.n(this.f20714c, 4611686018427387903L);
        this.f20715d = Integer.MAX_VALUE;
        this.f20716e = Integer.MAX_VALUE;
        this.f20649h = w0.a(this.f20717f) - this.f20718g;
    }

    public final int d(E e10) {
        int i10;
        long j10;
        long j11;
        long j12;
        char c10;
        long[] jArr;
        long[] jArr2;
        long j13;
        int i11 = -862048943;
        int iHashCode = (e10 != null ? e10.hashCode() : 0) * (-862048943);
        int i12 = iHashCode ^ (iHashCode << 16);
        int i13 = i12 >>> 7;
        int i14 = i12 & CertificateBody.profileType;
        int i15 = this.f20717f;
        int i16 = i13 & i15;
        int i17 = 0;
        while (true) {
            long[] jArr3 = this.f20712a;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            long j14 = ((jArr3[i18 + 1] << (64 - i19)) & ((-i19) >> 63)) | (jArr3[i18] >>> i19);
            long j15 = i14;
            long j16 = j14 ^ (j15 * 72340172838076673L);
            long j17 = (j16 - 72340172838076673L) & (~j16) & (-9187201950435737472L);
            while (j17 != 0) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j17) >> 3) + i16) & i15;
                int i20 = i11;
                if (kotlin.jvm.internal.r.a(this.f20713b[iNumberOfTrailingZeros], e10)) {
                    return iNumberOfTrailingZeros;
                }
                j17 &= j17 - 1;
                i11 = i20;
            }
            int i21 = i11;
            if ((j14 & ((~j14) << 6) & (-9187201950435737472L)) != 0) {
                int iE = e(i13);
                long j18 = 255;
                if (this.f20649h != 0 || ((this.f20712a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    i10 = 0;
                    j10 = j15;
                    j11 = 255;
                    j12 = 128;
                } else {
                    int i22 = this.f20717f;
                    if (i22 > 8) {
                        c10 = 31;
                        j12 = 128;
                        if (Long.compareUnsigned(this.f20718g * 32, i22 * 25) <= 0) {
                            long[] jArr4 = this.f20712a;
                            if (jArr4 == null) {
                                i10 = 0;
                                j10 = j15;
                                j11 = 255;
                            } else {
                                int i23 = this.f20717f;
                                Object[] objArr = this.f20713b;
                                long[] jArr5 = this.f20714c;
                                long[] jArr6 = new long[i23];
                                Arrays.fill(jArr6, 0, i23, 9223372034707292159L);
                                i10 = 0;
                                int i24 = (i23 + 7) >> 3;
                                int i25 = 0;
                                while (i25 < i24) {
                                    long j19 = j18;
                                    long j20 = jArr4[i25] & (-9187201950435737472L);
                                    int i26 = i25;
                                    jArr4[i26] = ((~j20) + (j20 >>> 7)) & (-72340172838076674L);
                                    i25 = i26 + 1;
                                    j18 = j19;
                                }
                                j11 = j18;
                                int length = jArr4.length;
                                int i27 = length - 1;
                                int i28 = length - 2;
                                jArr4[i28] = (jArr4[i28] & 72057594037927935L) | (-72057594037927936L);
                                jArr4[i27] = jArr4[0];
                                int i29 = 0;
                                while (i29 != i23) {
                                    int i30 = i29 >> 3;
                                    int i31 = (i29 & 7) << 3;
                                    long j21 = (jArr4[i30] >> i31) & j11;
                                    if (j21 != 128 && j21 == 254) {
                                        Object obj = objArr[i29];
                                        int iHashCode2 = (obj != null ? obj.hashCode() : 0) * i21;
                                        int i32 = (iHashCode2 ^ (iHashCode2 << 16)) >>> 7;
                                        int iE2 = e(i32);
                                        int i33 = i32 & i23;
                                        if (((iE2 - i33) & i23) / 8 == ((i29 - i33) & i23) / 8) {
                                            int i34 = i23;
                                            Object[] objArr2 = objArr;
                                            jArr4[i30] = (jArr4[i30] & (~(j11 << i31))) | ((r17 & CertificateBody.profileType) << i31);
                                            if (jArr6[i29] == 9223372034707292159L) {
                                                long j22 = i29;
                                                jArr6[i29] = j22 | (j22 << 32);
                                            }
                                            jArr4[jArr4.length - 1] = jArr4[0];
                                            i29++;
                                            i23 = i34;
                                            objArr = objArr2;
                                        } else {
                                            int i35 = i23;
                                            Object[] objArr3 = objArr;
                                            int i36 = iE2 >> 3;
                                            long j23 = jArr4[i36];
                                            int i37 = (iE2 & 7) << 3;
                                            if (((j23 >> i37) & j11) == 128) {
                                                jArr4[i36] = (j23 & (~(j11 << i37))) | ((r17 & CertificateBody.profileType) << i37);
                                                jArr4[i30] = (jArr4[i30] & (~(j11 << i31))) | (128 << i31);
                                                objArr3[iE2] = objArr3[i29];
                                                objArr3[i29] = null;
                                                jArr5[iE2] = jArr5[i29];
                                                jArr5[i29] = 4611686018427387903L;
                                                int i38 = (int) ((jArr6[i29] >> 32) & BodyPartID.bodyIdMax);
                                                int i39 = Integer.MAX_VALUE;
                                                if (i38 != Integer.MAX_VALUE) {
                                                    j13 = j15;
                                                    jArr6[i38] = iE2 | (jArr6[i38] & (-4294967296L));
                                                    jArr6[i29] = (jArr6[i29] & BodyPartID.bodyIdMax) | (-4294967296L);
                                                    i39 = Integer.MAX_VALUE;
                                                } else {
                                                    j13 = j15;
                                                    jArr6[i29] = (Integer.MAX_VALUE << 32) | iE2;
                                                }
                                                jArr6[iE2] = (i29 << 32) | i39;
                                            } else {
                                                j13 = j15;
                                                jArr4[i36] = ((r17 & CertificateBody.profileType) << i37) | (j23 & (~(j11 << i37)));
                                                Object obj2 = objArr3[iE2];
                                                objArr3[iE2] = objArr3[i29];
                                                objArr3[i29] = obj2;
                                                long j24 = jArr5[iE2];
                                                jArr5[iE2] = jArr5[i29];
                                                jArr5[i29] = j24;
                                                int i40 = (int) ((jArr6[i29] >> 32) & BodyPartID.bodyIdMax);
                                                if (i40 != Integer.MAX_VALUE) {
                                                    long j25 = iE2;
                                                    jArr6[i40] = (jArr6[i40] & (-4294967296L)) | j25;
                                                    jArr6[i29] = (jArr6[i29] & BodyPartID.bodyIdMax) | (j25 << 32);
                                                } else {
                                                    long j26 = iE2;
                                                    jArr6[i29] = j26 | (j26 << 32);
                                                    i40 = i29;
                                                }
                                                jArr6[iE2] = (i40 << 32) | i29;
                                                i29--;
                                            }
                                            jArr4[jArr4.length - 1] = jArr4[0];
                                            i29++;
                                            i23 = i35;
                                            objArr = objArr3;
                                            j15 = j13;
                                        }
                                    } else {
                                        i29++;
                                    }
                                }
                                j10 = j15;
                                this.f20649h = w0.a(this.f20717f) - this.f20718g;
                                long[] jArr7 = this.f20714c;
                                int length2 = jArr7.length;
                                for (int i41 = 0; i41 < length2; i41++) {
                                    long j27 = jArr7[i41];
                                    jArr7[i41] = (((j27 & (-4611686018427387904L)) | (((int) ((j27 >> 31) & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr6[r4] & BodyPartID.bodyIdMax))) << 31) | (((int) (j27 & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr6[r6] & BodyPartID.bodyIdMax));
                                }
                                int i42 = this.f20715d;
                                if (i42 != Integer.MAX_VALUE) {
                                    this.f20715d = (int) (jArr6[i42] & BodyPartID.bodyIdMax);
                                }
                                int i43 = this.f20716e;
                                if (i43 != Integer.MAX_VALUE) {
                                    this.f20716e = (int) (jArr6[i43] & BodyPartID.bodyIdMax);
                                }
                            }
                        }
                        iE = e(i13);
                    } else {
                        c10 = 31;
                        j12 = 128;
                    }
                    i10 = 0;
                    j10 = j15;
                    j11 = 255;
                    int iC = w0.c(this.f20717f);
                    long[] jArr8 = this.f20712a;
                    Object[] objArr4 = this.f20713b;
                    long[] jArr9 = this.f20714c;
                    int i44 = this.f20717f;
                    int[] iArr = new int[i44];
                    f(iC);
                    long[] jArr10 = this.f20712a;
                    Object[] objArr5 = this.f20713b;
                    long[] jArr11 = this.f20714c;
                    int i45 = this.f20717f;
                    int i46 = 0;
                    while (i46 < i44) {
                        if (((jArr8[i46 >> 3] >> ((i46 & 7) << 3)) & 255) < j12) {
                            Object obj3 = objArr4[i46];
                            int iHashCode3 = (obj3 != null ? obj3.hashCode() : 0) * i21;
                            int i47 = iHashCode3 ^ (iHashCode3 << 16);
                            int iE3 = e(i47 >>> 7);
                            jArr = jArr10;
                            jArr2 = jArr8;
                            long j28 = i47 & CertificateBody.profileType;
                            int i48 = iE3 >> 3;
                            int i49 = (iE3 & 7) << 3;
                            long j29 = (jArr[i48] & (~(255 << i49))) | (j28 << i49);
                            jArr[i48] = j29;
                            jArr[(((iE3 - 7) & i45) + (i45 & 7)) >> 3] = j29;
                            objArr5[iE3] = obj3;
                            jArr11[iE3] = jArr9[i46];
                            iArr[i46] = iE3;
                        } else {
                            jArr = jArr10;
                            jArr2 = jArr8;
                        }
                        i46++;
                        jArr8 = jArr2;
                        jArr10 = jArr;
                    }
                    long[] jArr12 = this.f20714c;
                    int length3 = jArr12.length;
                    for (int i50 = 0; i50 < length3; i50++) {
                        long j30 = jArr12[i50];
                        jArr12[i50] = (((j30 & (-4611686018427387904L)) | (((int) ((j30 >> c10) & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[r4])) << c10) | (((int) (j30 & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[r6]);
                    }
                    int i51 = this.f20715d;
                    if (i51 != Integer.MAX_VALUE) {
                        this.f20715d = iArr[i51];
                    }
                    int i52 = this.f20716e;
                    if (i52 != Integer.MAX_VALUE) {
                        this.f20716e = iArr[i52];
                    }
                    iE = e(i13);
                }
                this.f20718g++;
                int i53 = this.f20649h;
                long[] jArr13 = this.f20712a;
                int i54 = iE >> 3;
                long j31 = jArr13[i54];
                int i55 = (iE & 7) << 3;
                if (((j31 >> i55) & j11) == j12) {
                    i10 = 1;
                }
                this.f20649h = i53 - i10;
                int i56 = this.f20717f;
                long j32 = (j31 & (~(j11 << i55))) | (j10 << i55);
                jArr13[i54] = j32;
                jArr13[(((iE - 7) & i56) + (i56 & 7)) >> 3] = j32;
                return iE;
            }
            i17 += 8;
            i16 = (i16 + i17) & i15;
            i11 = i21;
        }
    }

    public final int e(int i10) {
        int i11 = this.f20717f;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f20712a;
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
        long[] jArr2;
        int iMax = i10 > 0 ? Math.max(7, w0.d(i10)) : 0;
        this.f20717f = iMax;
        if (iMax == 0) {
            jArr = w0.f20748a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            qg.m.n(jArr, -9187201950435737472L);
        }
        this.f20712a = jArr;
        int i11 = iMax >> 3;
        long j10 = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        this.f20649h = w0.a(this.f20717f) - this.f20718g;
        this.f20713b = iMax == 0 ? q.a.f21639c : new Object[iMax];
        if (iMax == 0) {
            jArr2 = a1.f20567a;
        } else {
            jArr2 = new long[iMax];
            qg.m.n(jArr2, 4611686018427387903L);
        }
        this.f20714c = jArr2;
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
    public final boolean g(E e10) {
        int iNumberOfTrailingZeros;
        int iHashCode = (e10 != null ? e10.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & CertificateBody.profileType;
        int i12 = this.f20717f;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f20712a;
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
                if (kotlin.jvm.internal.r.a(this.f20713b[iNumberOfTrailingZeros], e10)) {
                    break loop0;
                }
                j12 &= j12 - 1;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        boolean z10 = iNumberOfTrailingZeros >= 0;
        if (z10) {
            h(iNumberOfTrailingZeros);
        }
        return z10;
    }

    public final void h(int i10) {
        this.f20718g--;
        long[] jArr = this.f20712a;
        int i11 = this.f20717f;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
        this.f20713b[i10] = null;
        long[] jArr2 = this.f20714c;
        long j11 = jArr2[i10];
        int i14 = (int) ((j11 >> 31) & 2147483647L);
        int i15 = (int) (j11 & 2147483647L);
        if (i14 != Integer.MAX_VALUE) {
            jArr2[i14] = (jArr2[i14] & (-2147483648L)) | (i15 & 2147483647L);
        } else {
            this.f20715d = i15;
        }
        if (i15 != Integer.MAX_VALUE) {
            jArr2[i15] = ((i14 & 2147483647L) << 31) | (jArr2[i15] & (-4611686016279904257L));
        } else {
            this.f20716e = i14;
        }
        jArr2[i10] = 4611686018427387903L;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(Collection<? extends E> elements) {
        kotlin.jvm.internal.r.e(elements, "elements");
        Object[] objArr = this.f20713b;
        int i10 = this.f20718g;
        long[] jArr = this.f20712a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j10) < 128) {
                            int i14 = (i11 << 3) + i13;
                            if (!qg.x.w(elements, objArr[i14])) {
                                h(i14);
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                }
            }
        }
        return i10 != this.f20718g;
    }
}
