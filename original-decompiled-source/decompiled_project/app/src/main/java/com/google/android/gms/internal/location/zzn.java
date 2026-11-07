package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.l;
import com.google.android.gms.common.internal.p;
import hb.f;

/* loaded from: classes2.dex */
final class zzn extends zzx {
    final /* synthetic */ f zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzn(zzz zzzVar, h hVar, f fVar) {
        super(hVar);
        this.zza = fVar;
    }

    @Override // com.google.android.gms.common.api.internal.d
    public final void doExecute(a.b bVar) throws RemoteException {
        f fVar = this.zza;
        String simpleName = f.class.getSimpleName();
        p.g(fVar, "Listener must not be null");
        p.e(simpleName, "Listener type must not be empty");
        ((zzaz) bVar).zzH(new l.a<>(fVar, simpleName), new zzy(this));
    }
}
