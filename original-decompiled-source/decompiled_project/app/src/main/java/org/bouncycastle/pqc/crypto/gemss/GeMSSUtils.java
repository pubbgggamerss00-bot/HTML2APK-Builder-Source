package org.bouncycastle.pqc.crypto.gemss;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public class GeMSSUtils {
    public static long CMP_LT_UINT(long j10, long j11) {
        long j12 = j10 >>> 63;
        long j13 = j11 >>> 63;
        long j14 = j12 ^ j13;
        return ((((j10 & Long.MAX_VALUE) - (j11 & Long.MAX_VALUE)) >>> 63) & (1 ^ j14)) ^ (((j12 - j13) >>> 63) & j14);
    }

    public static int Highest_One(int i10) {
        int i11 = i10 | (i10 >>> 1);
        int i12 = i11 | (i11 >>> 2);
        int i13 = i12 | (i12 >>> 4);
        int i14 = i13 | (i13 >>> 8);
        int i15 = i14 | (i14 >>> 16);
        return i15 ^ (i15 >>> 1);
    }

    public static long NORBITS_UINT(long j10) {
        return (((j10 | (j10 << 32)) >>> 32) - 1) >>> 63;
    }

    public static long ORBITS_UINT(long j10) {
        return (((j10 | (j10 << 32)) >>> 32) + BodyPartID.bodyIdMax) >>> 32;
    }

    public static long XORBITS_UINT(long j10) {
        long j11 = j10 ^ (j10 << 1);
        return (((j11 ^ (j11 << 2)) & (-8608480567731124088L)) * 1229782938247303441L) >>> 63;
    }

    public static long maskUINT(int i10) {
        if (i10 != 0) {
            return (1 << i10) - 1;
        }
        return -1L;
    }
}
