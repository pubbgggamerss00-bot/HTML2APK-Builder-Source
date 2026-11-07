package com.google.android.gms.common.api.internal;

/* loaded from: classes2.dex */
public final class g0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5983a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f5984b;

    public g0(j0 j0Var, int i10) {
        this.f5984b = j0Var;
        this.f5983a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5984b.h(this.f5983a);
    }
}
