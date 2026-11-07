package com.google.android.play.core.integrity;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class bg extends bm {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f6549a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f6550b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f6551c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f6552d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ bn f6553e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg(bn bnVar, TaskCompletionSource taskCompletionSource, int i10, String str, long j10, long j11, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.f6553e = bnVar;
        this.f6549a = str;
        this.f6550b = j10;
        this.f6551c = j11;
        this.f6552d = taskCompletionSource2;
    }

    @Override // kc.c0
    public final void b() {
        if (bn.k(this.f6553e)) {
            a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.f6553e;
            ((kc.r) bnVar.f6568a.f16282n).G(bn.a(bnVar, this.f6549a, this.f6550b, this.f6551c, 0), new bk(this.f6553e, this.f6552d, this.f6550b));
        } catch (RemoteException e10) {
            this.f6553e.f6569b.a(e10, "requestExpressIntegrityToken(%s, %s)", this.f6549a, Long.valueOf(this.f6550b));
            this.f6552d.trySetException(new StandardIntegrityException(-100, e10));
        }
    }
}
