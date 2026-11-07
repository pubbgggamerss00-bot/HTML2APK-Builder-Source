package com.google.android.gms.internal.auth;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.common.api.l;
import da.f;

/* loaded from: classes2.dex */
final class zzac extends d {
    final /* synthetic */ boolean zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzac(zzal zzalVar, a aVar, h hVar, boolean z10) {
        super((a<?>) aVar, hVar);
        this.zza = z10;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final l createFailedResult(Status status) {
        return new zzaj(status);
    }

    @Override // com.google.android.gms.common.api.internal.d
    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) throws RemoteException {
        ((f) ((zzam) bVar).getService()).B(this.zza);
        setResult((zzac) new zzaj(Status.f5905e));
    }

    @Override // com.google.android.gms.common.api.internal.d, com.google.android.gms.common.api.internal.e
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        setResult((zzac) obj);
    }
}
