package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.a;

/* loaded from: classes2.dex */
public final class l0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pa.a f6014a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f6015b;

    public l0(m0 m0Var, pa.a aVar) {
        this.f6015b = m0Var;
        this.f6014a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.common.internal.j jVar;
        m0 m0Var = this.f6015b;
        a.f fVar = m0Var.f6016a;
        j0 j0Var = (j0) m0Var.f6021f.f5977j.get(m0Var.f6017b);
        if (j0Var == null) {
            return;
        }
        pa.a aVar = this.f6014a;
        if (aVar.f21377b != 0) {
            j0Var.o(aVar, null);
            return;
        }
        m0Var.f6020e = true;
        if (fVar.requiresSignIn()) {
            if (!m0Var.f6020e || (jVar = m0Var.f6018c) == null) {
                return;
            }
            fVar.getRemoteService(jVar, m0Var.f6019d);
            return;
        }
        try {
            fVar.getRemoteService(null, fVar.getScopesForConnectionlessNonSignIn());
        } catch (SecurityException e10) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e10);
            fVar.disconnect("Failed to get service from broker.");
            j0Var.o(new pa.a(10), null);
        }
    }
}
