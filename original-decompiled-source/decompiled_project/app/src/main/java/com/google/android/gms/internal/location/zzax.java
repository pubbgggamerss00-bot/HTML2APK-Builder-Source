package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.e;

/* loaded from: classes2.dex */
final class zzax extends zzaj {
    private e<Status> zza;

    public zzax(e<Status> eVar) {
        this.zza = eVar;
    }

    private final void zze(int i10) {
        if (this.zza == null) {
            Log.wtf("LocationClientImpl", "onRemoveGeofencesResult called multiple times", new Exception());
            return;
        }
        if ((i10 < 0 || i10 > 1) && (i10 < 1000 || i10 >= 1006)) {
            i10 = 1;
        }
        if (i10 == 1) {
            i10 = 13;
        }
        this.zza.setResult(new Status(i10, null, null, null));
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.location.zzak
    public final void zzb(int i10, String[] strArr) {
        Log.wtf("LocationClientImpl", "Unexpected call to onAddGeofencesResult", new Exception());
    }

    @Override // com.google.android.gms.internal.location.zzak
    public final void zzc(int i10, String[] strArr) {
        zze(i10);
    }

    @Override // com.google.android.gms.internal.location.zzak
    public final void zzd(int i10, PendingIntent pendingIntent) {
        zze(i10);
    }
}
