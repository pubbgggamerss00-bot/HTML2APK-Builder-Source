package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import hb.k0;

/* loaded from: classes2.dex */
final class zzad extends zzae {
    final /* synthetic */ k0 zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzad(zzaf zzafVar, h hVar, k0 k0Var) {
        super(hVar);
        this.zza = k0Var;
    }

    @Override // com.google.android.gms.common.api.internal.d
    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) throws RemoteException {
        ((zzaz) bVar).zzw(this.zza, this);
    }
}
