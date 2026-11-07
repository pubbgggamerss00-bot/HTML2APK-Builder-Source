package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import kc.b0;

/* loaded from: classes2.dex */
final class bl extends bi {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bn f6565c;

    /* renamed from: d, reason: collision with root package name */
    private final b0 f6566d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super(bnVar, taskCompletionSource);
        this.f6565c = bnVar;
        this.f6566d = new b0("OnWarmUpIntegrityTokenCallback");
    }

    @Override // com.google.android.play.core.integrity.bi, kc.t
    public final void e(Bundle bundle) throws RemoteException {
        super.e(bundle);
        this.f6566d.b("onWarmUpExpressIntegrityToken", new Object[0]);
        com.google.android.gms.common.api.b bVarA = this.f6565c.f6573f.a(bundle);
        if (bVarA != null) {
            this.f6559a.trySetException(bVarA);
        } else {
            this.f6559a.trySetResult(Long.valueOf(bundle.getLong("warm.up.sid")));
        }
    }
}
