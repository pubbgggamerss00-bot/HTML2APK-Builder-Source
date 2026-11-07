package uh;

import ph.o2;
import tg.h;

/* loaded from: classes2.dex */
public final class c0<T> implements o2<T> {

    /* renamed from: a, reason: collision with root package name */
    public final T f29724a;

    /* renamed from: b, reason: collision with root package name */
    public final ThreadLocal<T> f29725b;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f29726c;

    public c0(T t3, ThreadLocal<T> threadLocal) {
        this.f29724a = t3;
        this.f29725b = threadLocal;
        this.f29726c = new d0(threadLocal);
    }

    @Override // ph.o2
    public final T N(tg.h hVar) {
        ThreadLocal<T> threadLocal = this.f29725b;
        T t3 = threadLocal.get();
        threadLocal.set(this.f29724a);
        return t3;
    }

    @Override // tg.h
    public final <R> R fold(R r10, eh.p<? super R, ? super h.a, ? extends R> pVar) {
        return pVar.invoke(r10, this);
    }

    @Override // tg.h
    public final <E extends h.a> E get(h.b<E> bVar) {
        if (this.f29726c.equals(bVar)) {
            return this;
        }
        return null;
    }

    @Override // tg.h.a
    public final h.b<?> getKey() {
        return this.f29726c;
    }

    @Override // ph.o2
    public final void k0(Object obj) {
        this.f29725b.set(obj);
    }

    @Override // tg.h
    public final tg.h minusKey(h.b<?> bVar) {
        return this.f29726c.equals(bVar) ? tg.i.f28768a : this;
    }

    @Override // tg.h
    public final tg.h plus(tg.h hVar) {
        return h.a.C0291a.c(this, hVar);
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.f29724a + ", threadLocal = " + this.f29725b + ')';
    }
}
