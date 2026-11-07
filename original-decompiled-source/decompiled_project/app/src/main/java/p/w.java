package p;

import org.bouncycastle.asn1.eac.CertificateBody;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public long[] f20742a = w0.f20748a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f20743b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f20744c;

    /* renamed from: d, reason: collision with root package name */
    public int f20745d;

    /* renamed from: e, reason: collision with root package name */
    public int f20746e;

    /* renamed from: f, reason: collision with root package name */
    public int f20747f;

    public w() {
        int[] iArr = k.f20650a;
        this.f20743b = iArr;
        this.f20744c = iArr;
        e(w0.e(6));
    }

    public final void a() {
        this.f20746e = 0;
        long[] jArr = this.f20742a;
        if (jArr != w0.f20748a) {
            qg.m.n(jArr, -9187201950435737472L);
            long[] jArr2 = this.f20742a;
            int i10 = this.f20745d;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        this.f20747f = w0.a(this.f20745d) - this.f20746e;
    }

    public final int b(int i10) {
        int i11 = this.f20745d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f20742a;
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

    public final int c(int i10) {
        int iHashCode = Integer.hashCode(i10) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & CertificateBody.profileType;
        int i13 = this.f20745d;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f20742a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (i12 * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i14) & i13;
                if (this.f20743b[iNumberOfTrailingZeros] == i10) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
        }
    }

    public final int d(int i10) {
        int iC = c(i10);
        if (iC >= 0) {
            return this.f20744c[iC];
        }
        return -1;
    }

    public final void e(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, w0.d(i10)) : 0;
        this.f20745d = iMax;
        if (iMax == 0) {
            jArr = w0.f20748a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            qg.m.n(jArr, -9187201950435737472L);
        }
        this.f20742a = jArr;
        int i11 = iMax >> 3;
        long j10 = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        this.f20747f = w0.a(this.f20745d) - this.f20746e;
        this.f20743b = new int[iMax];
        this.f20744c = new int[iMax];
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
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (wVar.f20746e != this.f20746e) {
            return false;
        }
        int[] iArr = this.f20743b;
        int[] iArr2 = this.f20744c;
        long[] jArr = this.f20742a;
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
                        int i14 = iArr[i13];
                        int i15 = iArr2[i13];
                        int iC = wVar.c(i14);
                        if (iC < 0) {
                            break loop0;
                        }
                        z11 = z12;
                        if (i15 != wVar.f20744c[iC]) {
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

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006d, code lost:
    
        r21 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0079, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x007b, code lost:
    
        r2 = b(r4);
        r11 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0083, code lost:
    
        if (r37.f20747f != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0097, code lost:
    
        if (((r37.f20742a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0099, code lost:
    
        r27 = r9;
        r25 = 255;
        r18 = 1;
        r32 = 0;
        r19 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a7, code lost:
    
        r2 = r37.f20745d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a9, code lost:
    
        if (r2 <= 8) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ab, code lost:
    
        r19 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bd, code lost:
    
        if (java.lang.Long.compareUnsigned(r37.f20746e * 32, r2 * 25) > 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00bf, code lost:
    
        r2 = r37.f20742a;
        r3 = r37.f20745d;
        r5 = r37.f20743b;
        r6 = r37.f20744c;
        r13 = (r3 + 7) >> 3;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ce, code lost:
    
        if (r7 >= r13) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d0, code lost:
    
        r8 = r2[r7] & (-9187201950435737472L);
        r2[r7] = (-72340172838076674L) & ((~r8) + (r8 >>> 7));
        r7 = r7 + 1;
        r11 = r11;
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ec, code lost:
    
        r27 = r9;
        r25 = r11;
        r12 = 7;
        r7 = qg.o.v(r2);
        r8 = r7 - 1;
        r2[r8] = (r2[r8] & 72057594037927935L) | (-72057594037927936L);
        r2[r7] = r2[0];
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x010b, code lost:
    
        if (r7 == r3) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x010d, code lost:
    
        r8 = r7 >> 3;
        r11 = (r7 & 7) << 3;
        r9 = (r2[r8] >> r11) & r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x011a, code lost:
    
        if (r9 != 128) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x011c, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0121, code lost:
    
        if (r9 == 254) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0124, code lost:
    
        r9 = java.lang.Integer.hashCode(r5[r7]) * r21;
        r10 = (r9 ^ (r9 << 16)) >>> 7;
        r13 = b(r10);
        r10 = r10 & r3;
        r29 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0145, code lost:
    
        if ((((r13 - r10) & r3) / 8) != (((r7 - r10) & r3) / 8)) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0147, code lost:
    
        r32 = r15;
        r2[r8] = ((r9 & org.bouncycastle.asn1.eac.CertificateBody.profileType) << r11) | (r2[r8] & (~(r25 << r11)));
        r2[r2.length - 1] = (r2[r32] & 72057594037927935L) | Long.MIN_VALUE;
        r7 = r7 + 1;
        r14 = r14;
        r12 = r29;
        r15 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x016c, code lost:
    
        r18 = r14;
        r32 = r15;
        r10 = r13 >> 3;
        r14 = r2[r10];
        r12 = (r13 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x017e, code lost:
    
        if (((r14 >> r12) & r25) != 128) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0180, code lost:
    
        r33 = r5;
        r34 = r6;
        r2[r10] = ((~(r25 << r12)) & r14) | ((r9 & org.bouncycastle.asn1.eac.CertificateBody.profileType) << r12);
        r2[r8] = (r2[r8] & (~(r25 << r11))) | (128 << r11);
        r33[r13] = r33[r7];
        r33[r7] = r32;
        r34[r13] = r34[r7];
        r34[r7] = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01aa, code lost:
    
        r33 = r5;
        r34 = r6;
        r2[r10] = ((r9 & org.bouncycastle.asn1.eac.CertificateBody.profileType) << r12) | ((~(r25 << r12)) & r14);
        r5 = r33[r13];
        r33[r13] = r33[r7];
        r33[r7] = r5;
        r5 = r34[r13];
        r34[r13] = r34[r7];
        r34[r7] = r5;
        r7 = r7 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01cb, code lost:
    
        r2[r2.length - 1] = (r2[r32] & 72057594037927935L) | Long.MIN_VALUE;
        r7 = r7 + 1;
        r14 = r18;
        r12 = r29;
        r15 = r32;
        r5 = r33;
        r6 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01e4, code lost:
    
        r18 = r14;
        r32 = r15;
        r37.f20747f = p.w0.a(r37.f20745d) - r37.f20746e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01f7, code lost:
    
        r27 = r9;
        r25 = 255;
        r18 = 1;
        r32 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0202, code lost:
    
        r19 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0205, code lost:
    
        r2 = p.w0.c(r37.f20745d);
        r3 = r37.f20742a;
        r5 = r37.f20743b;
        r6 = r37.f20744c;
        r7 = r37.f20745d;
        e(r2);
        r2 = r37.f20742a;
        r8 = r37.f20743b;
        r9 = r37.f20744c;
        r10 = r37.f20745d;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0220, code lost:
    
        if (r11 >= r7) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x022f, code lost:
    
        if (((r3[r11 >> 3] >> ((r11 & 7) << 3)) & 255) >= r19) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0231, code lost:
    
        r12 = r5[r11];
        r13 = java.lang.Integer.hashCode(r12) * r21;
        r13 = r13 ^ (r13 << 16);
        r14 = b(r13 >>> 7);
        r15 = r2;
        r1 = r13 & org.bouncycastle.asn1.eac.CertificateBody.profileType;
        r13 = r14 >> 3;
        r16 = (r14 & 7) << 3;
        r1 = (r15[r13] & (~(255 << r16))) | (r1 << r16);
        r15[r13] = r1;
        r15[(((r14 - 7) & r10) + (r10 & 7)) >> 3] = r1;
        r8[r14] = r12;
        r9[r14] = r6[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x026d, code lost:
    
        r15 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x026e, code lost:
    
        r11 = r11 + 1;
        r2 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0274, code lost:
    
        r2 = b(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0278, code lost:
    
        r37.f20746e++;
        r1 = r37.f20747f;
        r3 = r37.f20742a;
        r4 = r2 >> 3;
        r5 = r3[r4];
        r7 = (r2 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0290, code lost:
    
        if (((r5 >> r7) & r25) != r19) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0292, code lost:
    
        r32 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0294, code lost:
    
        r37.f20747f = r1 - r32;
        r1 = r37.f20745d;
        r5 = (r5 & (~(r25 << r7))) | (r27 << r7);
        r3[r4] = r5;
        r3[(((r2 - 7) & r1) + (r1 & 7)) >> 3] = r5;
        r13 = ~r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(int i10, int i11) {
        int i12;
        int iNumberOfTrailingZeros;
        int i13 = i10;
        int i14 = -862048943;
        int iHashCode = Integer.hashCode(i13) * (-862048943);
        int i15 = iHashCode ^ (iHashCode << 16);
        int i16 = i15 >>> 7;
        int i17 = i15 & CertificateBody.profileType;
        int i18 = this.f20745d;
        int i19 = i16 & i18;
        int i20 = 0;
        loop0: while (true) {
            long[] jArr = this.f20742a;
            int i21 = i19 >> 3;
            int i22 = (i19 & 7) << 3;
            int i23 = 1;
            int i24 = i20;
            int i25 = 0;
            long j10 = (((-i22) >> 63) & (jArr[i21 + 1] << (64 - i22))) | (jArr[i21] >>> i22);
            long j11 = i17;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            long j13 = (j12 - 72340172838076673L) & (~j12) & (-9187201950435737472L);
            while (true) {
                if (j13 == 0) {
                    break;
                }
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i19) & i18;
                int i26 = i14;
                if (this.f20743b[iNumberOfTrailingZeros] == i13) {
                    break loop0;
                }
                j13 &= j13 - 1;
                i14 = i26;
            }
            i20 = i24 + 8;
            i19 = (i19 + i20) & i18;
            i13 = i10;
            i14 = i12;
        }
        if (iNumberOfTrailingZeros < 0) {
            iNumberOfTrailingZeros = ~iNumberOfTrailingZeros;
        }
        this.f20743b[iNumberOfTrailingZeros] = i10;
        this.f20744c[iNumberOfTrailingZeros] = i11;
    }

    public final int hashCode() {
        int[] iArr = this.f20743b;
        int[] iArr2 = this.f20744c;
        long[] jArr = this.f20742a;
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
                        int i14 = iArr[i13];
                        iHashCode += Integer.hashCode(iArr2[i13]) ^ Integer.hashCode(i14);
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

    /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[PHI: r8
      0x0066: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:19:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        if (this.f20746e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        int[] iArr = this.f20743b;
        int[] iArr2 = this.f20744c;
        long[] jArr = this.f20742a;
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
                            int i15 = iArr[i14];
                            int i16 = iArr2[i14];
                            sb.append(i15);
                            sb.append("=");
                            sb.append(i16);
                            i11++;
                            if (i11 < this.f20746e) {
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
}
