package r;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl;

/* loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.s implements eh.l<x0.l0, x0.k0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h1.u<Object> f22858a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22859b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AnimatedContentTransitionScopeImpl<Object> f22860c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(h1.u<Object> uVar, Object obj, AnimatedContentTransitionScopeImpl<Object> animatedContentTransitionScopeImpl) {
        super(1);
        this.f22858a = uVar;
        this.f22859b = obj;
        this.f22860c = animatedContentTransitionScopeImpl;
    }

    @Override // eh.l
    public final x0.k0 invoke(x0.l0 l0Var) {
        return new i(this.f22858a, this.f22859b, this.f22860c);
    }
}
