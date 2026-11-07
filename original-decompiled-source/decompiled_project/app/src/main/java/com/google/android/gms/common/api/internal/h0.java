package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;

/* loaded from: classes2.dex */
public final class h0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f5985a;

    public h0(i0 i0Var) {
        this.f5985a = i0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a.f fVar = this.f5985a.f5988a.f5993b;
        fVar.disconnect(fVar.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
