package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class c1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.api.l f5950a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1 f5951b;

    public c1(f1 f1Var, com.google.android.gms.common.api.l lVar) {
        this.f5951b = f1Var;
        this.f5950a = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.common.api.l lVar = this.f5950a;
        f1 f1Var = this.f5951b;
        d1 d1Var = f1Var.f5962f;
        WeakReference weakReference = f1Var.f5961e;
        try {
            try {
                BasePendingResult.zaa.set(Boolean.TRUE);
                com.google.android.gms.common.internal.p.f(null);
                throw null;
            } catch (RuntimeException e10) {
                d1Var.sendMessage(d1Var.obtainMessage(1, e10));
                BasePendingResult.zaa.set(Boolean.FALSE);
                f1.d(lVar);
                com.google.android.gms.common.api.h hVar = (com.google.android.gms.common.api.h) weakReference.get();
                if (hVar != null) {
                    hVar.e();
                }
            }
        } catch (Throwable th2) {
            BasePendingResult.zaa.set(Boolean.FALSE);
            f1.d(lVar);
            com.google.android.gms.common.api.h hVar2 = (com.google.android.gms.common.api.h) weakReference.get();
            if (hVar2 != null) {
                hVar2.e();
            }
            throw th2;
        }
    }
}
