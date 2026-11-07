package androidx.lifecycle;

import androidx.lifecycle.l;
import ph.v1;

@vg.e(c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", f = "Lifecycle.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class n extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f2328a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f2329b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, tg.e<? super n> eVar) {
        super(2, eVar);
        this.f2329b = oVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        n nVar = new n(this.f2329b, eVar);
        nVar.f2328a = obj;
        return nVar;
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((n) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        ph.i0 i0Var = (ph.i0) this.f2328a;
        o oVar = this.f2329b;
        l lVar = oVar.f2333a;
        if (lVar.b().compareTo(l.b.f2320b) >= 0) {
            lVar.a(oVar);
        } else {
            v1.b(i0Var.getCoroutineContext(), null);
        }
        return pg.f0.f21461a;
    }
}
