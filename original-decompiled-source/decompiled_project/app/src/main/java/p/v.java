package p;

import org.bouncycastle.asn1.eac.CertificateBody;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public long[] f20734a;

    /* renamed from: b, reason: collision with root package name */
    public float[] f20735b;

    /* renamed from: c, reason: collision with root package name */
    public int f20736c;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b6, code lost:
    
        r27 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c4, code lost:
    
        if (((r12 & ((~r12) << 6)) & r23) == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c6, code lost:
    
        r13 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v5, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z10;
        int i10;
        boolean z11;
        ?? r19;
        int i11;
        long j10;
        int iNumberOfTrailingZeros;
        boolean z12 = true;
        if (obj == this) {
            return true;
        }
        int i12 = 0;
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        float[] fArr = this.f20735b;
        long[] jArr = this.f20734a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i13 = 0;
        while (true) {
            long j11 = jArr[i13];
            long j12 = -9187201950435737472L;
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8;
                int i15 = 8 - ((~(i13 - length)) >>> 31);
                int i16 = i12;
                while (i16 < i15) {
                    if ((j11 & 255) < 128) {
                        float f10 = fArr[(i13 << 3) + i16];
                        int iHashCode = Float.hashCode(f10) * (-862048943);
                        int i17 = iHashCode ^ (iHashCode << 16);
                        z11 = z12;
                        int i18 = i17 & CertificateBody.profileType;
                        r19 = i12;
                        int i19 = vVar.f20736c;
                        int i20 = (i17 >>> 7) & i19;
                        int i21 = r19 == true ? 1 : 0;
                        while (true) {
                            long[] jArr2 = vVar.f20734a;
                            int i22 = i20 >> 3;
                            j10 = j12;
                            int i23 = (i20 & 7) << 3;
                            long j13 = (jArr2[i22] >>> i23) | ((jArr2[i22 + 1] << (64 - i23)) & ((-i23) >> 63));
                            int i24 = i14;
                            long j14 = j13 ^ (i18 * 72340172838076673L);
                            long j15 = (j14 - 72340172838076673L) & (~j14) & j10;
                            while (true) {
                                if (j15 == 0) {
                                    break;
                                }
                                iNumberOfTrailingZeros = (i20 + (Long.numberOfTrailingZeros(j15) >> 3)) & i19;
                                i11 = i24;
                                if (vVar.f20735b[iNumberOfTrailingZeros] == f10) {
                                    break;
                                }
                                j15 &= j15 - 1;
                                i24 = i11;
                            }
                            i21 += 8;
                            i20 = (i20 + i21) & i19;
                            j12 = j10;
                            i14 = i11;
                        }
                        if (!(iNumberOfTrailingZeros >= 0 ? z11 : r19 == true ? 1 : 0)) {
                            return r19;
                        }
                    } else {
                        z11 = z12;
                        r19 = i12;
                        i11 = i14;
                        j10 = j12;
                    }
                    j11 >>= i11;
                    i16++;
                    z12 = z11;
                    i12 = r19;
                    j12 = j10;
                    i14 = i11;
                }
                z10 = z12;
                i10 = i12;
                if (i15 != i14) {
                    return z10;
                }
            } else {
                z10 = z12;
                i10 = i12;
            }
            if (i13 == length) {
                return z10;
            }
            i13++;
            z12 = z10;
            i12 = i10;
        }
    }

    public final int hashCode() {
        float[] fArr = this.f20735b;
        long[] jArr = this.f20734a;
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
                        iHashCode = Float.hashCode(fArr[(i10 << 3) + i12]) + iHashCode;
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

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d A[PHI: r7
      0x005d: PHI (r7v2 int) = (r7v1 int), (r7v3 int) binds: [B:6:0x0026, B:18:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        float[] fArr = this.f20735b;
        long[] jArr = this.f20734a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            int i11 = 0;
            loop0: while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j10) < 128) {
                            float f10 = fArr[(i10 << 3) + i13];
                            if (i11 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i11 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            sb.append(f10);
                            i11++;
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
            sb.append((CharSequence) "]");
        } else {
            sb.append((CharSequence) "]");
        }
        String string = sb.toString();
        kotlin.jvm.internal.r.d(string, "toString(...)");
        return string;
    }
}
