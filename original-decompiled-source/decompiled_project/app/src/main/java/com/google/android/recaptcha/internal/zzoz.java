package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzoz extends zzpe {
    public zzoz() {
        super(null);
    }

    @Override // com.google.android.recaptcha.internal.zzpe
    public final void zza() {
        if (!zzj()) {
            for (int i10 = 0; i10 < zzc(); i10++) {
                ((zzms) ((zzpa) zzg(i10)).zza()).zzg();
            }
            Iterator it = zzd().iterator();
            while (it.hasNext()) {
                ((zzms) ((Map.Entry) it.next()).getKey()).zzg();
            }
        }
        super.zza();
    }
}
