package tg;

import eh.p;
import tg.h;

/* loaded from: classes2.dex */
public abstract class a implements h.a {

    /* renamed from: a, reason: collision with root package name */
    public final h.b<?> f28762a;

    public a(h.b<?> bVar) {
        this.f28762a = bVar;
    }

    @Override // tg.h
    public final <R> R fold(R r10, p<? super R, ? super h.a, ? extends R> pVar) {
        return pVar.invoke(r10, this);
    }

    @Override // tg.h
    public <E extends h.a> E get(h.b<E> bVar) {
        return (E) h.a.C0291a.a(this, bVar);
    }

    @Override // tg.h.a
    public final h.b<?> getKey() {
        return this.f28762a;
    }

    @Override // tg.h
    public h minusKey(h.b<?> bVar) {
        return h.a.C0291a.b(this, bVar);
    }

    @Override // tg.h
    public final h plus(h hVar) {
        return h.a.C0291a.c(this, hVar);
    }
}
