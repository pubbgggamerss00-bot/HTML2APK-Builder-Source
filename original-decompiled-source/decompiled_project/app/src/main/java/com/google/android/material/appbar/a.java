package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import com.google.android.material.appbar.AppBarLayout;

/* loaded from: classes2.dex */
public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m3.b f6300a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f6301b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout.BaseBehavior f6302c;

    public a(AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout, m3.b bVar) {
        this.f6302c = baseBehavior;
        this.f6300a = bVar;
        this.f6301b = appBarLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f6302c.p(this.f6300a, this.f6301b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
