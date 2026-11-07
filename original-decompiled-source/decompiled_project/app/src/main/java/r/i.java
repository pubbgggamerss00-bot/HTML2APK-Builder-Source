package r;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl;

/* loaded from: classes.dex */
public final class i implements x0.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h1.u f22848a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22849b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AnimatedContentTransitionScopeImpl f22850c;

    public i(h1.u uVar, Object obj, AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
        this.f22848a = uVar;
        this.f22849b = obj;
        this.f22850c = animatedContentTransitionScopeImpl;
    }

    @Override // x0.k0
    public final void a() {
        h1.u uVar = this.f22848a;
        Object obj = this.f22849b;
        uVar.remove(obj);
        this.f22850c.f729e.j(obj);
    }
}
