package com.google.android.gms.internal.p002firebaseauthapi;

import i8.n;

/* loaded from: classes2.dex */
final class zzh extends zzi {
    private final char zza;

    public zzh(char c10) {
        this.zza = c10;
    }

    public final String toString() {
        char c10 = this.zza;
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            cArr[5 - i10] = "0123456789ABCDEF".charAt(c10 & 15);
            c10 = (char) (c10 >> 4);
        }
        return n.d("CharMatcher.is('", String.copyValueOf(cArr), "')");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzf
    public final boolean zza(char c10) {
        return c10 == this.zza;
    }
}
