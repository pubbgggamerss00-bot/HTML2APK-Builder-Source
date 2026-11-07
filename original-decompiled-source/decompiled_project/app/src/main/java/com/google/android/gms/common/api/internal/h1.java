package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* loaded from: classes2.dex */
public final class h1 extends k1 {

    /* renamed from: b, reason: collision with root package name */
    public final d f5986b;

    public h1(int i10, d dVar) {
        super(i10);
        this.f5986b = dVar;
    }

    @Override // com.google.android.gms.common.api.internal.k1
    public final void a(Status status) {
        try {
            this.f5986b.setFailedResult(status);
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.k1
    public final void b(Exception exc) {
        try {
            this.f5986b.setFailedResult(new Status(10, k3.b.a(exc.getClass().getSimpleName(), ": ", exc.getLocalizedMessage()), null, null));
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.k1
    public final void c(j0 j0Var) throws DeadObjectException {
        try {
            this.f5986b.run(j0Var.f5993b);
        } catch (RuntimeException e10) {
            b(e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.k1
    public final void d(z zVar, boolean z10) {
        Boolean boolValueOf = Boolean.valueOf(z10);
        Map map = zVar.f6072a;
        d dVar = this.f5986b;
        map.put(dVar, boolValueOf);
        dVar.addStatusListener(new x(zVar, dVar));
    }
}
