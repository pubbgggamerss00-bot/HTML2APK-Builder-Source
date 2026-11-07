package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class g0 implements i.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.api.i f6141a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f6142b;

    public g0(com.google.android.gms.common.api.i iVar, TaskCompletionSource taskCompletionSource, c6.b bVar) {
        this.f6141a = iVar;
        this.f6142b = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.i.a
    public final void a(Status status) {
        boolean zD = status.d();
        TaskCompletionSource taskCompletionSource = this.f6142b;
        if (!zD) {
            taskCompletionSource.setException(b3.a.b(status));
            return;
        }
        this.f6141a.await(0L, TimeUnit.MILLISECONDS);
        taskCompletionSource.setResult(null);
    }
}
