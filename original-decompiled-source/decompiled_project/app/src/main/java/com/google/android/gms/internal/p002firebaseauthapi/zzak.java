package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
public class zzak<E> {
    public static int zza(int i10, int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
        }
        if (i11 <= i10) {
            return i10;
        }
        int iHighestOneBit = i10 + (i10 >> 1) + 1;
        if (iHighestOneBit < i11) {
            iHighestOneBit = Integer.highestOneBit(i11 - 1) << 1;
        }
        if (iHighestOneBit < 0) {
            return Integer.MAX_VALUE;
        }
        return iHighestOneBit;
    }
}
