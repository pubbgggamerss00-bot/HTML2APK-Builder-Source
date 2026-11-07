package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
public final class zzij extends zzfi implements zzgm {
    private static final zzij zzb;

    static {
        zzij zzijVar = new zzij();
        zzb = zzijVar;
        zzfi.zzw(zzij.class, zzijVar);
    }

    private zzij() {
    }

    public static zzij zzd() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfi
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        zzii zziiVar = null;
        if (i11 == 2) {
            return zzfi.zzt(zzb, "\u0004\u0000", null);
        }
        if (i11 == 3) {
            return new zzij();
        }
        if (i11 == 4) {
            return new zzih(zziiVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
