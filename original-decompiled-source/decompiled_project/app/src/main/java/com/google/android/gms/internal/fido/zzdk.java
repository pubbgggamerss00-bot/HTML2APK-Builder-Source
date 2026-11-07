package com.google.android.gms.internal.fido;

import v5.b;

/* loaded from: classes2.dex */
public class zzdk {
    private final String zza;
    private final Class zzb;
    private final boolean zzc;

    public zzdk(String str, Class cls, boolean z10) {
        this(str, cls, z10, true);
    }

    public static zzdk zza(String str, Class cls) {
        return new zzdk(str, cls, false, false);
    }

    public final String toString() {
        Class cls = this.zzb;
        String name = getClass().getName();
        String name2 = cls.getName();
        StringBuilder sbA = b.a(name, "/");
        sbA.append(this.zza);
        sbA.append("[");
        sbA.append(name2);
        sbA.append("]");
        return sbA.toString();
    }

    public final boolean zzb() {
        return this.zzc;
    }

    private zzdk(String str, Class cls, boolean z10, boolean z11) {
        zzfk.zzb(str);
        this.zza = str;
        this.zzb = cls;
        this.zzc = z10;
        System.identityHashCode(this);
        for (int i10 = 0; i10 < 5; i10++) {
        }
    }
}
