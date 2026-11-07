package com.google.android.gms.internal.play_billing;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzgy extends zzhd {
    public zzgy() {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhd
    public final void zza() {
        if (!zzj()) {
            for (int i10 = 0; i10 < zzc(); i10++) {
                Map.Entry entryZzg = zzg(i10);
                if (((zzey) ((zzgz) entryZzg).zza()).zze()) {
                    entryZzg.setValue(Collections.unmodifiableList((List) entryZzg.getValue()));
                }
            }
            for (Map.Entry entry : zzd()) {
                if (((zzey) entry.getKey()).zze()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}
