package com.google.android.gms.common.api.internal;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class t1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f6050a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f6051b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u1 f6052c;

    public t1(u1 u1Var, j jVar, String str) {
        this.f6050a = jVar;
        this.f6051b = str;
        this.f6052c = u1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u1 u1Var = this.f6052c;
        int i10 = u1Var.f6064b;
        j jVar = this.f6050a;
        if (i10 > 0) {
            Bundle bundle = u1Var.f6065c;
            jVar.onCreate(bundle != null ? bundle.getBundle(this.f6051b) : null);
        }
        if (u1Var.f6064b >= 2) {
            jVar.onStart();
        }
        if (u1Var.f6064b >= 3) {
            jVar.onResume();
        }
        if (u1Var.f6064b >= 4) {
            jVar.onStop();
        }
        if (u1Var.f6064b >= 5) {
            jVar.onDestroy();
        }
    }
}
