package u0;

import androidx.lifecycle.l;

/* loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.s implements eh.l<x0.l0, x0.k0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.t f28962a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.l<l.a, pg.f0> f28963b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f28964c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(androidx.lifecycle.t tVar, eh.l<? super l.a, pg.f0> lVar, eh.a<pg.f0> aVar) {
        super(1);
        this.f28962a = tVar;
        this.f28963b = lVar;
        this.f28964c = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.lifecycle.s, u0.a] */
    @Override // eh.l
    public final x0.k0 invoke(x0.l0 l0Var) {
        final eh.l<l.a, pg.f0> lVar = this.f28963b;
        ?? r42 = new androidx.lifecycle.r() { // from class: u0.a
            @Override // androidx.lifecycle.r
            public final void l(androidx.lifecycle.t tVar, l.a aVar) {
                lVar.invoke(aVar);
            }
        };
        androidx.lifecycle.t tVar = this.f28962a;
        tVar.getLifecycle().a(r42);
        return new b(this.f28964c, tVar, r42);
    }
}
