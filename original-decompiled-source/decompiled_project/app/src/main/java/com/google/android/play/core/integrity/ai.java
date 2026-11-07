package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import kc.b0;

/* loaded from: classes2.dex */
final class ai extends kc.x {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ aj f6502a;

    /* renamed from: b, reason: collision with root package name */
    private final b0 f6503b = new b0("OnRequestIntegrityTokenCallback");

    /* renamed from: c, reason: collision with root package name */
    private final TaskCompletionSource f6504c;

    public ai(aj ajVar, TaskCompletionSource taskCompletionSource) {
        this.f6502a = ajVar;
        this.f6504c = taskCompletionSource;
    }

    @Override // kc.y
    public final void b(Bundle bundle) {
        this.f6502a.f6505a.d(this.f6504c);
        this.f6503b.b("onRequestIntegrityToken", new Object[0]);
        com.google.android.gms.common.api.b bVarA = this.f6502a.f6509e.a(bundle);
        if (bVarA != null) {
            this.f6504c.trySetException(bVarA);
            return;
        }
        String string = bundle.getString("token");
        if (string == null) {
            this.f6504c.trySetException(new IntegrityServiceException(-100, null));
            return;
        }
        ah ahVar = new ah(this, this.f6502a.f6507c, bundle.getLong("request.token.sid"));
        TaskCompletionSource taskCompletionSource = this.f6504c;
        a aVar = new a();
        aVar.b(string);
        aVar.a(ahVar);
        taskCompletionSource.trySetResult(aVar.c());
    }
}
