package com.google.android.gms.internal.p002firebaseauthapi;

import org.jf.dexlib2.analysis.RegisterType;

/* loaded from: classes2.dex */
final class zzans {
    private static boolean zza(byte b10) {
        return b10 > -65;
    }

    public static /* synthetic */ void zza(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) throws zzalf {
        if (!zza(b11)) {
            if ((((b11 + 112) + (b10 << 28)) >> 30) == 0 && !zza(b12) && !zza(b13)) {
                int i11 = ((b10 & 7) << 18) | ((b11 & 63) << 12) | ((b12 & 63) << 6) | (b13 & 63);
                cArr[i10] = (char) ((i11 >>> 10) + 55232);
                cArr[i10 + 1] = (char) ((i11 & 1023) + 56320);
                return;
            }
        }
        throw zzalf.zzd();
    }

    public static /* synthetic */ void zza(byte b10, char[] cArr, int i10) {
        cArr[i10] = (char) b10;
    }

    public static /* synthetic */ void zza(byte b10, byte b11, byte b12, char[] cArr, int i10) throws zzalf {
        if (!zza(b11) && ((b10 != -32 || b11 >= -96) && ((b10 != -19 || b11 < -96) && !zza(b12)))) {
            cArr[i10] = (char) (((b10 & RegisterType.DOUBLE_HI) << 12) | ((b11 & 63) << 6) | (b12 & 63));
            return;
        }
        throw zzalf.zzd();
    }

    public static /* synthetic */ void zza(byte b10, byte b11, char[] cArr, int i10) throws zzalf {
        if (b10 >= -62 && !zza(b11)) {
            cArr[i10] = (char) (((b10 & 31) << 6) | (b11 & 63));
            return;
        }
        throw zzalf.zzd();
    }
}
