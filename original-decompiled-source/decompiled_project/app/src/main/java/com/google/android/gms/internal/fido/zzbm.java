package com.google.android.gms.internal.fido;

import j2.y;

/* loaded from: classes2.dex */
public final class zzbm {
    public static int zza(int i10, int i11, String str) {
        String strZza;
        if (i10 >= 0 && i10 < i11) {
            return i10;
        }
        if (i10 < 0) {
            strZza = zzbo.zza("%s (%s) must not be negative", "index", Integer.valueOf(i10));
        } else {
            if (i11 < 0) {
                throw new IllegalArgumentException(y.a(i11, "negative size: "));
            }
            strZza = zzbo.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IndexOutOfBoundsException(strZza);
    }

    public static int zzb(int i10, int i11, String str) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(zzg(i10, i11, "index"));
        }
        return i10;
    }

    public static void zzc(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void zzd(boolean z10, String str, char c10) {
        if (!z10) {
            throw new IllegalArgumentException(zzbo.zza(str, Character.valueOf(c10)));
        }
    }

    public static void zze(int i10, int i11, int i12) {
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            throw new IndexOutOfBoundsException((i10 < 0 || i10 > i12) ? zzg(i10, i12, "start index") : (i11 < 0 || i11 > i12) ? zzg(i11, i12, "end index") : zzbo.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10)));
        }
    }

    public static void zzf(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalStateException((String) obj);
        }
    }

    private static String zzg(int i10, int i11, String str) {
        if (i10 < 0) {
            return zzbo.zza("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return zzbo.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(y.a(i11, "negative size: "));
    }
}
