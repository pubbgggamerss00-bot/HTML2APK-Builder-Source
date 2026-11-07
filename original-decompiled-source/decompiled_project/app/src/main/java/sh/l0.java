package sh;

import ph.l2;

/* loaded from: classes2.dex */
public final class l0<T> implements y0<T>, f, th.r<T> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z0 f25021a;

    public l0(z0 z0Var, l2 l2Var) {
        this.f25021a = z0Var;
    }

    @Override // sh.f
    public final Object b(g<? super T> gVar, tg.e<?> eVar) {
        this.f25021a.b(gVar, eVar);
        return ug.a.f29706a;
    }

    @Override // th.r
    public final f<T> d(tg.h hVar, int i10, rh.a aVar) {
        return (((i10 < 0 || i10 >= 2) && i10 != -2) || aVar != rh.a.f23577b) ? q0.d(this, hVar, i10, aVar) : this;
    }

    @Override // sh.y0
    public final T getValue() {
        return (T) this.f25021a.getValue();
    }
}
