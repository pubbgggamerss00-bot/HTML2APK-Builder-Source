package p;

import org.bouncycastle.asn1.eac.CertificateBody;

/* loaded from: classes.dex */
public final class e0<K> {

    /* renamed from: a, reason: collision with root package name */
    public long[] f20604a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f20605b;

    /* renamed from: c, reason: collision with root package name */
    public float[] f20606c;

    /* renamed from: d, reason: collision with root package name */
    public int f20607d;

    /* renamed from: e, reason: collision with root package name */
    public int f20608e;

    /* renamed from: f, reason: collision with root package name */
    public int f20609f;

    public e0() {
        this((Object) null);
    }

    public final void a() {
        this.f20608e = 0;
        long[] jArr = this.f20604a;
        if (jArr != w0.f20748a) {
            qg.m.n(jArr, -9187201950435737472L);
            long[] jArr2 = this.f20604a;
            int i10 = this.f20607d;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        qg.m.m(this.f20605b, 0, this.f20607d, null);
        this.f20609f = w0.a(this.f20607d) - this.f20608e;
    }

    public final int b(int i10) {
        int i11 = this.f20607d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f20604a;
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

    public final int c(Object obj) {
        int i10 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & CertificateBody.profileType;
        int i13 = this.f20607d;
        int i14 = i11 >>> 7;
        while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.f20604a;
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (i12 * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i15) & i13;
                if (kotlin.jvm.internal.r.a(this.f20605b[iNumberOfTrailingZeros], obj)) {
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

    public final void d(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, w0.d(i10)) : 0;
        this.f20607d = iMax;
        if (iMax == 0) {
            jArr = w0.f20748a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            qg.m.n(jArr, -9187201950435737472L);
        }
        this.f20604a = jArr;
        int i11 = iMax >> 3;
        long j10 = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        this.f20609f = w0.a(this.f20607d) - this.f20608e;
        this.f20605b = new Object[iMax];
        this.f20606c = new float[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0077, code lost:
    
        r20 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0082, code lost:
    
        if (((((~r9) << 6) & r9) & (-9187201950435737472L)) == 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0084, code lost:
    
        r2 = b(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008c, code lost:
    
        if (r37.f20609f != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a0, code lost:
    
        if (((r37.f20604a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a2, code lost:
    
        r23 = 255;
        r27 = r11;
        r18 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ac, code lost:
    
        r2 = r37.f20607d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ae, code lost:
    
        if (r2 <= 8) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b0, code lost:
    
        r18 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c4, code lost:
    
        if (java.lang.Long.compareUnsigned(r37.f20608e * 32, r2 * 25) > 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c6, code lost:
    
        r2 = r37.f20604a;
        r3 = r37.f20607d;
        r4 = r37.f20605b;
        r6 = r37.f20606c;
        r7 = (r3 + 7) >> 3;
        r23 = 255;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d5, code lost:
    
        if (r8 >= r7) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d7, code lost:
    
        r10 = r2[r8] & r13;
        r2[r8] = (-72340172838076674L) & ((~r10) + (r10 >>> 7));
        r8 = r8 + 1;
        r11 = r11;
        r13 = -9187201950435737472L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f3, code lost:
    
        r27 = r11;
        r9 = 7;
        r7 = qg.o.v(r2);
        r8 = r7 - 1;
        r12 = 72057594037927935L;
        r2[r8] = (r2[r8] & 72057594037927935L) | (-72057594037927936L);
        r2[r7] = r2[0];
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x010f, code lost:
    
        if (r7 == r3) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0111, code lost:
    
        r8 = r7 >> 3;
        r14 = (r7 & 7) << 3;
        r10 = (r2[r8] >> r14) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x011e, code lost:
    
        if (r10 != 128) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0120, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0125, code lost:
    
        if (r10 == 254) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0128, code lost:
    
        r10 = r4[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x012a, code lost:
    
        if (r10 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x012c, code lost:
    
        r10 = r10.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0131, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0132, code lost:
    
        r10 = r10 * r20;
        r11 = (r10 ^ (r10 << 16)) >>> 7;
        r25 = b(r11);
        r11 = r11 & r3;
        r29 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x014d, code lost:
    
        if ((((r25 - r11) & r3) / 8) != (((r7 - r11) & r3) / 8)) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x014f, code lost:
    
        r32 = r12;
        r2[r8] = ((r10 & org.bouncycastle.asn1.eac.CertificateBody.profileType) << r14) | (r2[r8] & (~(255 << r14)));
        r2[r2.length - 1] = (r2[0] & r32) | Long.MIN_VALUE;
        r7 = r7 + 1;
        r9 = r29;
        r12 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0171, code lost:
    
        r32 = r12;
        r9 = r25 >> 3;
        r11 = r2[r9];
        r13 = (r25 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0181, code lost:
    
        if (((r11 >> r13) & 255) != 128) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0183, code lost:
    
        r26 = r3;
        r34 = r4;
        r2[r9] = ((~(255 << r13)) & r11) | ((r10 & org.bouncycastle.asn1.eac.CertificateBody.profileType) << r13);
        r2[r8] = (r2[r8] & (~(255 << r14))) | (128 << r14);
        r34[r25] = r34[r7];
        r34[r7] = null;
        r6[r25] = r6[r7];
        r6[r7] = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01af, code lost:
    
        r26 = r3;
        r34 = r4;
        r2[r9] = ((~(255 << r13)) & r11) | ((r10 & org.bouncycastle.asn1.eac.CertificateBody.profileType) << r13);
        r3 = r34[r25];
        r34[r25] = r34[r7];
        r34[r7] = r3;
        r3 = r6[r25];
        r6[r25] = r6[r7];
        r6[r7] = r3;
        r7 = r7 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01d3, code lost:
    
        r2[r2.length - 1] = (r2[0] & r32) | Long.MIN_VALUE;
        r7 = r7 + 1;
        r3 = r26;
        r9 = r29;
        r12 = r32;
        r4 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01ea, code lost:
    
        r37.f20609f = p.w0.a(r37.f20607d) - r37.f20608e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01f9, code lost:
    
        r23 = 255;
        r27 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0200, code lost:
    
        r18 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0203, code lost:
    
        r2 = p.w0.c(r37.f20607d);
        r3 = r37.f20604a;
        r4 = r37.f20605b;
        r6 = r37.f20606c;
        r7 = r37.f20607d;
        d(r2);
        r2 = r37.f20604a;
        r8 = r37.f20605b;
        r9 = r37.f20606c;
        r10 = r37.f20607d;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x021d, code lost:
    
        if (r11 >= r7) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x022c, code lost:
    
        if (((r3[r11 >> 3] >> ((r11 & 7) << 3)) & 255) >= r18) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x022e, code lost:
    
        r12 = r4[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0230, code lost:
    
        if (r12 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0232, code lost:
    
        r13 = r12.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0237, code lost:
    
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0238, code lost:
    
        r13 = r13 * r20;
        r13 = r13 ^ (r13 << 16);
        r14 = b(r13 >>> 7);
        r17 = r2;
        r1 = r13 & org.bouncycastle.asn1.eac.CertificateBody.profileType;
        r13 = r14 >> 3;
        r21 = (r14 & 7) << 3;
        r1 = (r17[r13] & (~(255 << r21))) | (r1 << r21);
        r17[r13] = r1;
        r17[(((r14 - 7) & r10) + (r10 & 7)) >> 3] = r1;
        r8[r14] = r12;
        r9[r14] = r6[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x026f, code lost:
    
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0271, code lost:
    
        r11 = r11 + 1;
        r2 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0278, code lost:
    
        r2 = b(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x027c, code lost:
    
        r37.f20608e++;
        r1 = r37.f20609f;
        r3 = r37.f20604a;
        r4 = r2 >> 3;
        r5 = r3[r4];
        r7 = (r2 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0294, code lost:
    
        if (((r5 >> r7) & r23) != r18) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0296, code lost:
    
        r15 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0298, code lost:
    
        r37.f20609f = r1 - r15;
        r1 = r37.f20607d;
        r5 = (r5 & (~(r23 << r7))) | (r27 << r7);
        r3[r4] = r5;
        r3[(((r2 - 7) & r1) + (r1 & 7)) >> 3] = r5;
        r1 = ~r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(K k10, float f10) {
        int i10;
        int i11;
        K k11 = k10;
        int i12 = -862048943;
        int iHashCode = (k11 != null ? k11.hashCode() : 0) * (-862048943);
        int i13 = iHashCode ^ (iHashCode << 16);
        int i14 = i13 >>> 7;
        int i15 = i13 & CertificateBody.profileType;
        int i16 = this.f20607d;
        int i17 = i14 & i16;
        int i18 = 0;
        loop0: while (true) {
            long[] jArr = this.f20604a;
            int i19 = i17 >> 3;
            int i20 = (i17 & 7) << 3;
            long j10 = ((jArr[i19 + 1] << (64 - i20)) & ((-i20) >> 63)) | (jArr[i19] >>> i20);
            long j11 = i15;
            int i21 = i15;
            int i22 = 0;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            long j13 = -9187201950435737472L;
            long j14 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j14 == 0) {
                    break;
                }
                int iNumberOfTrailingZeros = (i17 + (Long.numberOfTrailingZeros(j14) >> 3)) & i16;
                int i23 = i12;
                if (kotlin.jvm.internal.r.a(this.f20605b[iNumberOfTrailingZeros], k11)) {
                    i11 = iNumberOfTrailingZeros;
                    break loop0;
                } else {
                    j14 &= j14 - 1;
                    i12 = i23;
                }
            }
            i18 += 8;
            i17 = (i17 + i18) & i16;
            k11 = k10;
            i15 = i21;
            i12 = i10;
        }
        if (i11 < 0) {
            i11 = ~i11;
        }
        this.f20605b[i11] = k10;
        this.f20606c[i11] = f10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
    
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
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        if (e0Var.f20608e != this.f20608e) {
            return false;
        }
        Object[] objArr = this.f20605b;
        float[] fArr = this.f20606c;
        long[] jArr = this.f20604a;
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
                        float f10 = fArr[i13];
                        int iC = e0Var.c(obj2);
                        if (iC < 0) {
                            break loop0;
                        }
                        z11 = z12;
                        if (f10 != e0Var.f20606c[iC]) {
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

    public final int hashCode() {
        Object[] objArr = this.f20605b;
        float[] fArr = this.f20606c;
        long[] jArr = this.f20604a;
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
                        iHashCode += Float.hashCode(fArr[i13]) ^ (obj != null ? obj.hashCode() : 0);
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
        if (this.f20608e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.f20605b;
        float[] fArr = this.f20606c;
        long[] jArr = this.f20604a;
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
                            float f10 = fArr[i14];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(f10);
                            i11++;
                            if (i11 < this.f20608e) {
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

    public e0(int i10) {
        this.f20604a = w0.f20748a;
        this.f20605b = q.a.f21639c;
        this.f20606c = e.f20603a;
        if (i10 >= 0) {
            d(w0.e(i10));
        } else {
            q.d.a("Capacity must be a positive value.");
            throw null;
        }
    }

    public /* synthetic */ e0(Object obj) {
        this(6);
    }
}
