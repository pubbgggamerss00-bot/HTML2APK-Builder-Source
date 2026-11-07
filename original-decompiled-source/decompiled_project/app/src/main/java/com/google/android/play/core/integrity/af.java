package com.google.android.play.core.integrity;

import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import kc.c0;

/* loaded from: classes2.dex */
final class af extends c0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ byte[] f6491a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Long f6492b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f6493c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ IntegrityTokenRequest f6494d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ aj f6495e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af(aj ajVar, TaskCompletionSource taskCompletionSource, byte[] bArr, Long l10, Parcelable parcelable, TaskCompletionSource taskCompletionSource2, IntegrityTokenRequest integrityTokenRequest) {
        super(taskCompletionSource);
        this.f6495e = ajVar;
        this.f6491a = bArr;
        this.f6492b = l10;
        this.f6493c = taskCompletionSource2;
        this.f6494d = integrityTokenRequest;
    }

    @Override // kc.c0
    public final void a(Exception exc) {
        if (exc instanceof kc.f) {
            super.a(new IntegrityServiceException(-9, exc));
        } else {
            super.a(exc);
        }
    }

    @Override // kc.c0
    public final void b() {
        try {
            aj ajVar = this.f6495e;
            ((kc.w) ajVar.f6505a.f16282n).m(aj.a(ajVar, this.f6491a, this.f6492b, null), new ai(this.f6495e, this.f6493c));
        } catch (RemoteException e10) {
            this.f6495e.f6506b.a(e10, "requestIntegrityToken(%s)", this.f6494d);
            this.f6493c.trySetException(new IntegrityServiceException(-100, e10));
        }
    }
}
