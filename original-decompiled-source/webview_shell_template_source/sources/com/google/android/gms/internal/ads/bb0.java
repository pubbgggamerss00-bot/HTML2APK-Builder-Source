package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class bb0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ r50 s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ eb0 f3027t;

    public bb0(eb0 eb0Var, r50 r50Var) {
        this.s = r50Var;
        this.f3027t = eb0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f3027t.v(view, this.s, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
