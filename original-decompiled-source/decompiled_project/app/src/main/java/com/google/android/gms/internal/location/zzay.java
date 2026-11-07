package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.internal.p;
import hb.j;

/* loaded from: classes2.dex */
final class zzay extends zzan {
    private e<j> zza;

    public zzay(e<j> eVar) {
        p.a("listener can't be null.", eVar != null);
        this.zza = eVar;
    }

    @Override // com.google.android.gms.internal.location.zzao
    public final void zzb(j jVar) throws RemoteException {
        this.zza.setResult(jVar);
        this.zza = null;
    }
}
