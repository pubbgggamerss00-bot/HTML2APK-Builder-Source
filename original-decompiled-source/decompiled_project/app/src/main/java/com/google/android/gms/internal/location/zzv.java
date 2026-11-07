package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.l;
import com.google.android.gms.common.internal.p;
import hb.g;

/* loaded from: classes2.dex */
final class zzv extends zzx {
    final /* synthetic */ g zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzv(zzz zzzVar, h hVar, g gVar) {
        super(hVar);
        this.zza = gVar;
    }

    @Override // com.google.android.gms.common.api.internal.d
    public final void doExecute(a.b bVar) throws RemoteException {
        g gVar = this.zza;
        String simpleName = g.class.getSimpleName();
        p.g(gVar, "Listener must not be null");
        p.e(simpleName, "Listener type must not be empty");
        ((zzaz) bVar).zzF(new l.a<>(gVar, simpleName), new zzy(this));
    }
}
