package p;

import org.bouncycastle.asn1.eac.CertificateBody;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public long[] f20561a = w0.f20748a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f20562b = p.f20700a;

    /* renamed from: c, reason: collision with root package name */
    public int[] f20563c = k.f20650a;

    /* renamed from: d, reason: collision with root package name */
    public int f20564d;

    /* renamed from: e, reason: collision with root package name */
    public int f20565e;

    /* renamed from: f, reason: collision with root package name */
    public int f20566f;

    public a0(int i10) {
        if (i10 >= 0) {
            d(w0.e(i10));
        } else {
            q.d.a("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int a(int i10) {
        int i11 = this.f20564d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f20561a;
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

    public final int b(long j10) {
        int iHashCode = Long.hashCode(j10) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & CertificateBody.profileType;
        int i12 = this.f20564d;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.f20561a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j11 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j12 = (i11 * 72340172838076673L) ^ j11;
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i13) & i12;
                if (this.f20562b[iNumberOfTrailingZeros] == j10) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j11 & ((~j11) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
    }

    public final int c(long j10) {
        int iB = b(j10);
        if (iB >= 0) {
            return this.f20563c[iB];
        }
        q.d.c("Cannot find value for key " + j10);
        throw null;
    }

    public final void d(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, w0.d(i10)) : 0;
        this.f20564d = iMax;
        if (iMax == 0) {
            jArr = w0.f20748a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            qg.m.n(jArr, -9187201950435737472L);
        }
        this.f20561a = jArr;
        int i11 = iMax >> 3;
        long j10 = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        this.f20566f = w0.a(this.f20564d) - this.f20565e;
        this.f20562b = new long[iMax];
        this.f20563c = new int[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006d, code lost:
    
        r19 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0078, code lost:
    
        if (((((~r8) << 6) & r8) & (-9187201950435737472L)) == 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x007a, code lost:
    
        r1 = a(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0082, code lost:
    
        if (r38.f20566f != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0096, code lost:
    
        if (((r38.f20561a[r1 >> 3] >> ((r1 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0098, code lost:
    
        r25 = 255;
        r29 = r10;
        r27 = 0;
        r18 = 1;
        r20 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a6, code lost:
    
        r1 = r38.f20564d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a8, code lost:
    
        if (r1 <= 8) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00aa, code lost:
    
        r20 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bc, code lost:
    
        if (java.lang.Long.compareUnsigned(r38.f20565e * 32, r1 * 25) > 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00be, code lost:
    
        r1 = r38.f20561a;
        r2 = r38.f20564d;
        r4 = r38.f20562b;
        r5 = r38.f20563c;
        r6 = (r2 + 7) >> 3;
        r25 = 255;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00cf, code lost:
    
        if (r7 >= r6) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d1, code lost:
    
        r9 = r1[r7] & (-9187201950435737472L);
        r1[r7] = (-72340172838076674L) & ((~r9) + (r9 >>> 7));
        r7 = r7 + 1;
        r13 = r13;
        r12 = r12;
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ee, code lost:
    
        r29 = r10;
        r27 = r12;
        r11 = r13;
        r8 = 7;
        r6 = qg.o.v(r1);
        r7 = r6 - 1;
        r12 = 72057594037927935L;
        r1[r7] = (r1[r7] & 72057594037927935L) | (-72057594037927936L);
        r1[r6] = r1[r27];
        r6 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x010d, code lost:
    
        if (r6 == r2) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x010f, code lost:
    
        r7 = r6 >> 3;
        r14 = (r6 & 7) << 3;
        r9 = (r1[r7] >> r14) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x011c, code lost:
    
        if (r9 != 128) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x011e, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0123, code lost:
    
        if (r9 == 254) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0126, code lost:
    
        r9 = java.lang.Long.hashCode(r4[r6]) * r19;
        r10 = (r9 ^ (r9 << 16)) >>> 7;
        r15 = a(r10);
        r10 = r10 & r2;
        r28 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0147, code lost:
    
        if ((((r15 - r10) & r2) / 8) != (((r6 - r10) & r2) / 8)) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0149, code lost:
    
        r10 = r11;
        r35 = r12;
        r1[r7] = ((r9 & org.bouncycastle.asn1.eac.CertificateBody.profileType) << r14) | (r1[r7] & (~(255 << r14)));
        r1[r1.length - r10] = (r1[r27] & r35) | Long.MIN_VALUE;
        r6 = r6 + 1;
        r11 = r10;
        r8 = r28;
        r12 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x016c, code lost:
    
        r10 = r11;
        r35 = r12;
        r8 = r15 >> 3;
        r11 = r1[r8];
        r13 = (r15 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x017d, code lost:
    
        if (((r11 >> r13) & 255) != 128) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x017f, code lost:
    
        r18 = r10;
        r12 = r4;
        r37 = r5;
        r1[r8] = (r11 & (~(255 << r13))) | ((r9 & org.bouncycastle.asn1.eac.CertificateBody.profileType) << r13);
        r1[r7] = (r1[r7] & (~(255 << r14))) | (128 << r14);
        r12[r15] = r12[r6];
        r12[r6] = 0;
        r37[r15] = r37[r6];
        r37[r6] = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01ab, code lost:
    
        r37 = r5;
        r18 = r10;
        r12 = r4;
        r1[r8] = ((r9 & org.bouncycastle.asn1.eac.CertificateBody.profileType) << r13) | (r11 & (~(255 << r13)));
        r4 = r12[r15];
        r12[r15] = r12[r6];
        r12[r6] = r4;
        r4 = r37[r15];
        r37[r15] = r37[r6];
        r37[r6] = r4;
        r6 = r6 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01d0, code lost:
    
        r1[r1.length - 1] = (r1[r27] & r35) | Long.MIN_VALUE;
        r6 = r6 + 1;
        r4 = r12;
        r11 = r18;
        r8 = r28;
        r12 = r35;
        r5 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01e8, code lost:
    
        r18 = r11;
        r38.f20566f = p.w0.a(r38.f20564d) - r38.f20565e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01f9, code lost:
    
        r25 = 255;
        r29 = r10;
        r27 = 0;
        r18 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0204, code lost:
    
        r20 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0207, code lost:
    
        r1 = p.w0.c(r38.f20564d);
        r2 = r38.f20561a;
        r4 = r38.f20562b;
        r5 = r38.f20563c;
        r6 = r38.f20564d;
        d(r1);
        r1 = r38.f20561a;
        r7 = r38.f20562b;
        r8 = r38.f20563c;
        r9 = r38.f20564d;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0222, code lost:
    
        if (r10 >= r6) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0231, code lost:
    
        if (((r2[r10 >> 3] >> ((r10 & 7) << 3)) & 255) >= r20) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0233, code lost:
    
        r11 = r4[r10];
        r13 = java.lang.Long.hashCode(r11) * r19;
        r13 = r13 ^ (r13 << 16);
        r14 = a(r13 >>> 7);
        r16 = r1;
        r15 = r2;
        r1 = r13 & org.bouncycastle.asn1.eac.CertificateBody.profileType;
        r13 = r14 >> 3;
        r17 = (r14 & 7) << 3;
        r1 = (r16[r13] & (~(255 << r17))) | (r1 << r17);
        r16[r13] = r1;
        r16[(((r14 - 7) & r9) + (r9 & 7)) >> 3] = r1;
        r7[r14] = r11;
        r8[r14] = r5[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0271, code lost:
    
        r16 = r1;
        r15 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0274, code lost:
    
        r10 = r10 + 1;
        r2 = r15;
        r1 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x027a, code lost:
    
        r1 = a(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x027e, code lost:
    
        r38.f20565e++;
        r2 = r38.f20566f;
        r3 = r38.f20561a;
        r4 = r1 >> 3;
        r5 = r3[r4];
        r7 = (r1 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0296, code lost:
    
        if (((r5 >> r7) & r25) != r20) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0299, code lost:
    
        r18 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x029b, code lost:
    
        r38.f20566f = r2 - r18;
        r2 = r38.f20564d;
        r5 = (r5 & (~(r25 << r7))) | (r29 << r7);
        r3[r4] = r5;
        r3[(((r1 - 7) & r2) + (r2 & 7)) >> 3] = r5;
        r1 = ~r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(int i10, long j10) {
        int i11;
        int i12;
        int i13 = -862048943;
        int iHashCode = Long.hashCode(j10) * (-862048943);
        int i14 = iHashCode ^ (iHashCode << 16);
        int i15 = i14 >>> 7;
        int i16 = i14 & CertificateBody.profileType;
        int i17 = this.f20564d;
        int i18 = i15 & i17;
        int i19 = 0;
        loop0: while (true) {
            long[] jArr = this.f20561a;
            int i20 = i18 >> 3;
            int i21 = (i18 & 7) << 3;
            int i22 = 1;
            long j11 = ((jArr[i20 + 1] << (64 - i21)) & ((-i21) >> 63)) | (jArr[i20] >>> i21);
            long j12 = i16;
            int i23 = i19;
            int i24 = 0;
            long j13 = j11 ^ (j12 * 72340172838076673L);
            long j14 = (~j13) & (j13 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j14 == 0) {
                    break;
                }
                int iNumberOfTrailingZeros = (i18 + (Long.numberOfTrailingZeros(j14) >> 3)) & i17;
                int i25 = i13;
                if (this.f20562b[iNumberOfTrailingZeros] == j10) {
                    i12 = iNumberOfTrailingZeros;
                    break loop0;
                } else {
                    j14 &= j14 - 1;
                    i13 = i25;
                }
            }
            i19 = i23 + 8;
            i18 = (i18 + i19) & i17;
            i13 = i11;
        }
        if (i12 < 0) {
            i12 = ~i12;
        }
        this.f20562b[i12] = j10;
        this.f20563c[i12] = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z10;
        long[] jArr;
        boolean z11;
        long[] jArr2;
        boolean z12 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (a0Var.f20565e != this.f20565e) {
            return false;
        }
        long[] jArr3 = this.f20562b;
        int[] iArr = this.f20563c;
        long[] jArr4 = this.f20561a;
        int length = jArr4.length - 2;
        if (length < 0) {
            return true;
        }
        int i10 = 0;
        loop0: while (true) {
            long j10 = jArr4[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                int i12 = 0;
                while (i12 < i11) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        z11 = z12;
                        jArr2 = jArr3;
                        long j11 = jArr2[i13];
                        int i14 = iArr[i13];
                        int iB = a0Var.b(j11);
                        if (iB < 0 || i14 != a0Var.f20563c[iB]) {
                            break loop0;
                        }
                    } else {
                        z11 = z12;
                        jArr2 = jArr3;
                    }
                    j10 >>= 8;
                    i12++;
                    z12 = z11;
                    jArr3 = jArr2;
                }
                z10 = z12;
                jArr = jArr3;
                if (i11 != 8) {
                    return z10;
                }
            } else {
                z10 = z12;
                jArr = jArr3;
            }
            if (i10 == length) {
                return z10;
            }
            i10++;
            z12 = z10;
            jArr3 = jArr;
        }
    }

    public final int hashCode() {
        long[] jArr = this.f20562b;
        int[] iArr = this.f20563c;
        long[] jArr2 = this.f20561a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i10 = 0;
        int iHashCode = 0;
        while (true) {
            long j10 = jArr2[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        long j11 = jArr[i13];
                        iHashCode += Integer.hashCode(iArr[i13]) ^ Long.hashCode(j11);
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

    public final String toString() {
        int i10;
        int i11;
        if (this.f20565e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        long[] jArr = this.f20562b;
        int[] iArr = this.f20563c;
        long[] jArr2 = this.f20561a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i12 = 0;
            int i13 = 0;
            while (true) {
                long j10 = jArr2[i12];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8 - ((~(i12 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((255 & j10) < 128) {
                            int i16 = (i12 << 3) + i15;
                            i11 = i12;
                            long j11 = jArr[i16];
                            int i17 = iArr[i16];
                            sb.append(j11);
                            sb.append("=");
                            sb.append(i17);
                            i13++;
                            if (i13 < this.f20565e) {
                                sb.append(", ");
                            }
                        } else {
                            i11 = i12;
                        }
                        j10 >>= 8;
                        i15++;
                        i12 = i11;
                    }
                    int i18 = i12;
                    if (i14 != 8) {
                        break;
                    }
                    i10 = i18;
                } else {
                    i10 = i12;
                }
                if (i10 == length) {
                    break;
                }
                i12 = i10 + 1;
            }
        }
        sb.append('}');
        String string = sb.toString();
        kotlin.jvm.internal.r.d(string, "toString(...)");
        return string;
    }
}
