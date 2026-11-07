package com.google.android.recaptcha.internal;

import org.jf.dexlib2.analysis.RegisterType;

/* loaded from: classes2.dex */
public abstract class zzjv {
    private static final char[] zza = "0123456789abcdef".toCharArray();
    public static final /* synthetic */ int zzb = 0;

    public final boolean equals(Object obj) {
        if (obj instanceof zzjv) {
            zzjv zzjvVar = (zzjv) obj;
            if (zzb() == zzjvVar.zzb() && zzc(zzjvVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (zzb() >= 32) {
            return zza();
        }
        byte[] bArrZze = zze();
        int i10 = bArrZze[0] & 255;
        for (int i11 = 1; i11 < bArrZze.length; i11++) {
            i10 |= (bArrZze[i11] & 255) << (i11 * 8);
        }
        return i10;
    }

    public final String toString() {
        byte[] bArrZze = zze();
        int length = bArrZze.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b10 : bArrZze) {
            char[] cArr = zza;
            sb.append(cArr[(b10 >> 4) & 15]);
            sb.append(cArr[b10 & RegisterType.DOUBLE_HI]);
        }
        return sb.toString();
    }

    public abstract int zza();

    public abstract int zzb();

    public abstract boolean zzc(zzjv zzjvVar);

    public abstract byte[] zzd();

    public byte[] zze() {
        throw null;
    }
}
