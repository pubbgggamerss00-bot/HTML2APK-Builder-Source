package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
public abstract class zzf {
    public int zza(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        zzw.zza(i10, length, "index");
        while (i10 < length) {
            if (zza(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public abstract boolean zza(char c10);
}
