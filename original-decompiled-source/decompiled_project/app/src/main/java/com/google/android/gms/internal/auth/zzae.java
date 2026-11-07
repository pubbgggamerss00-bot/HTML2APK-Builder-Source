package com.google.android.gms.internal.auth;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.common.api.l;
import da.f;

/* loaded from: classes2.dex */
final class zzae extends d {
    final /* synthetic */ String zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzae(zzal zzalVar, a aVar, h hVar, String str) {
        super((a<?>) aVar, hVar);
        this.zza = str;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ l createFailedResult(Status status) {
        return new zzai(status, null);
    }

    @Override // com.google.android.gms.common.api.internal.d
    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) throws RemoteException {
        ((f) ((zzam) bVar).getService()).g(new zzad(this), this.zza);
    }

    @Override // com.google.android.gms.common.api.internal.d, com.google.android.gms.common.api.internal.e
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        setResult((zzae) obj);
    }
}
