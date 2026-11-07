package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import kc.b0;

/* loaded from: classes2.dex */
final class bk extends bi {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bn f6562c;

    /* renamed from: d, reason: collision with root package name */
    private final b0 f6563d;

    /* renamed from: e, reason: collision with root package name */
    private final long f6564e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk(bn bnVar, TaskCompletionSource taskCompletionSource, long j10) {
        super(bnVar, taskCompletionSource);
        this.f6562c = bnVar;
        this.f6563d = new b0("OnRequestIntegrityTokenCallback");
        this.f6564e = j10;
    }

    @Override // com.google.android.play.core.integrity.bi, kc.t
    public final void c(Bundle bundle) throws RemoteException {
        super.c(bundle);
        this.f6563d.b("onRequestExpressIntegrityToken", new Object[0]);
        com.google.android.gms.common.api.b bVarA = this.f6562c.f6573f.a(bundle);
        if (bVarA != null) {
            this.f6559a.trySetException(bVarA);
            return;
        }
        bj bjVar = new bj(this, this.f6562c.f6570c, bundle.getLong("request.token.sid"));
        TaskCompletionSource taskCompletionSource = this.f6559a;
        b bVar = new b();
        bVar.b(bundle.getString("token"));
        bVar.a(bjVar);
        taskCompletionSource.trySetResult(bVar.c());
    }
}
