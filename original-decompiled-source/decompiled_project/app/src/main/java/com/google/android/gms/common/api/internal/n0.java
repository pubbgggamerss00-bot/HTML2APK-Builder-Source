package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.a;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* loaded from: classes2.dex */
public final class n0 extends c0 {

    /* renamed from: b, reason: collision with root package name */
    @NotOnlyInitialized
    public final com.google.android.gms.common.api.g f6024b;

    public n0(com.google.android.gms.common.api.g gVar) {
        this.f6024b = gVar;
    }

    @Override // com.google.android.gms.common.api.h
    public final <A extends a.b, R extends com.google.android.gms.common.api.l, T extends d<R, A>> T a(T t3) {
        return (T) this.f6024b.doRead((com.google.android.gms.common.api.g) t3);
    }

    @Override // com.google.android.gms.common.api.h
    public final <A extends a.b, T extends d<? extends com.google.android.gms.common.api.l, A>> T b(T t3) {
        return (T) this.f6024b.doWrite((com.google.android.gms.common.api.g) t3);
    }

    @Override // com.google.android.gms.common.api.h
    public final Looper c() {
        return this.f6024b.getLooper();
    }

    @Override // com.google.android.gms.common.api.h
    public final void d() {
    }

    @Override // com.google.android.gms.common.api.h
    public final void e() {
    }
}
