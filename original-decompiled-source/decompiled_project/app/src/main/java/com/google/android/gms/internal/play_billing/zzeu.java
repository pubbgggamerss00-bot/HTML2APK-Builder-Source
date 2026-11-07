package com.google.android.gms.internal.play_billing;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzeu {
    static final zzeu zza = new zzeu(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile zzeu zzd;
    private final Map zze;

    public zzeu() {
        this.zze = new HashMap();
    }

    public static zzeu zza() {
        zzeu zzeuVar = zzd;
        if (zzeuVar != null) {
            return zzeuVar;
        }
        synchronized (zzeu.class) {
            try {
                zzeu zzeuVar2 = zzd;
                if (zzeuVar2 != null) {
                    return zzeuVar2;
                }
                int i10 = zzgs.zza;
                zzeu zzeuVarZzb = zzfc.zzb(zzeu.class);
                zzd = zzeuVarZzb;
                return zzeuVarZzb;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final zzfh zzb(zzgl zzglVar, int i10) {
        return (zzfh) this.zze.get(new zzet(zzglVar, i10));
    }

    public zzeu(boolean z10) {
        this.zze = Collections.EMPTY_MAP;
    }
}
