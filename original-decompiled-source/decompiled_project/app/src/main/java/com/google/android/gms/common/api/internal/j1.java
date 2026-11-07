package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.l;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public final class j1 extends e1 {

    /* renamed from: c, reason: collision with root package name */
    public final l.a f6005c;

    public j1(l.a aVar, TaskCompletionSource taskCompletionSource) {
        super(4, taskCompletionSource);
        this.f6005c = aVar;
    }

    @Override // com.google.android.gms.common.api.internal.k1
    public final /* bridge */ /* synthetic */ void d(z zVar, boolean z10) {
    }

    @Override // com.google.android.gms.common.api.internal.q0
    public final boolean f(j0 j0Var) {
        if (((v0) j0Var.f5997f.get(this.f6005c)) == null) {
            return false;
        }
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.q0
    public final pa.c[] g(j0 j0Var) {
        if (((v0) j0Var.f5997f.get(this.f6005c)) == null) {
            return null;
        }
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.e1
    public final void h(j0 j0Var) throws RemoteException {
        if (((v0) j0Var.f5997f.remove(this.f6005c)) != null) {
            throw null;
        }
        this.f5955b.trySetResult(Boolean.FALSE);
    }
}
