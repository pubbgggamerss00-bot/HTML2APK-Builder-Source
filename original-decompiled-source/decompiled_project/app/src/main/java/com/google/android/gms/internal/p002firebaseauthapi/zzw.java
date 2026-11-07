package com.google.android.gms.internal.p002firebaseauthapi;

import j2.y;

/* loaded from: classes2.dex */
public final class zzw {
    public static int zza(int i10, int i11) {
        String strZza;
        if (i10 >= 0 && i10 < i11) {
            return i10;
        }
        if (i10 < 0) {
            strZza = zzae.zza("%s (%s) must not be negative", "index", Integer.valueOf(i10));
        } else {
            if (i11 < 0) {
                throw new IllegalArgumentException(y.a(i11, "negative size: "));
            }
            strZza = zzae.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IndexOutOfBoundsException(strZza);
    }

    public static int zzb(int i10, int i11) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(zzb(i10, i11, "index"));
        }
        return i10;
    }

    private static String zzb(int i10, int i11, String str) {
        if (i10 < 0) {
            return zzae.zza("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return zzae.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(y.a(i11, "negative size: "));
    }

    public static int zza(int i10, int i11, String str) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(zzb(i10, i11, str));
        }
        return i10;
    }

    public static <T> T zza(T t3) {
        t3.getClass();
        return t3;
    }

    public static void zza(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(zzr.zza(obj));
        }
    }

    public static void zza(int i10, int i11, int i12) {
        String strZzb;
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            if (i10 < 0 || i10 > i12) {
                strZzb = zzb(i10, i12, "start index");
            } else if (i11 >= 0 && i11 <= i12) {
                strZzb = zzae.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            } else {
                strZzb = zzb(i11, i12, "end index");
            }
            throw new IndexOutOfBoundsException(strZzb);
        }
    }
}
