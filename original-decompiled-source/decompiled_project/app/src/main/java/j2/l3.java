package j2;

import tg.h;

/* loaded from: classes.dex */
public final class l3 implements j1.i {

    /* renamed from: a, reason: collision with root package name */
    public final x0.u1 f14827a = new x0.u1(1.0f);

    @Override // tg.h
    public final <R> R fold(R r10, eh.p<? super R, ? super h.a, ? extends R> pVar) {
        return pVar.invoke(r10, this);
    }

    @Override // tg.h
    public final <E extends h.a> E get(h.b<E> bVar) {
        return (E) h.a.C0291a.a(this, bVar);
    }

    @Override // tg.h
    public final tg.h minusKey(h.b<?> bVar) {
        return h.a.C0291a.b(this, bVar);
    }

    @Override // j1.i
    public final float p() {
        return this.f14827a.getFloatValue();
    }

    @Override // tg.h
    public final tg.h plus(tg.h hVar) {
        return h.a.C0291a.c(this, hVar);
    }
}
