package com.google.android.play.core.integrity;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class bf extends bm {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f6546a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f6547b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bn f6548c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf(bn bnVar, TaskCompletionSource taskCompletionSource, int i10, long j10, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.f6548c = bnVar;
        this.f6546a = j10;
        this.f6547b = taskCompletionSource2;
    }

    @Override // kc.c0
    public final void b() {
        if (bn.k(this.f6548c)) {
            a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.f6548c;
            ((kc.r) bnVar.f6568a.f16282n).C(bn.b(bnVar, this.f6546a, 0), new bl(this.f6548c, this.f6547b));
        } catch (RemoteException e10) {
            this.f6548c.f6569b.a(e10, "warmUpIntegrityToken(%s)", Long.valueOf(this.f6546a));
            this.f6547b.trySetException(new StandardIntegrityException(-100, e10));
        }
    }
}
