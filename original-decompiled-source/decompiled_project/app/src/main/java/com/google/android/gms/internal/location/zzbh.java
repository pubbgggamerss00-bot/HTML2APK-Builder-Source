package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.l;
import hb.c0;
import hb.i;
import hb.j;

/* loaded from: classes2.dex */
final class zzbh extends c0<j> {
    final /* synthetic */ i zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbh(zzbi zzbiVar, h hVar, i iVar, String str) {
        super(hVar);
        this.zza = iVar;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ l createFailedResult(Status status) {
        return new j(status, null);
    }

    @Override // com.google.android.gms.common.api.internal.d
    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) throws RemoteException {
        ((zzaz) bVar).zzL(this.zza, this, null);
    }
}
