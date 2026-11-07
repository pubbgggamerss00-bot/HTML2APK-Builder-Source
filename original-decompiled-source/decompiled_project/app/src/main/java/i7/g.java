package i7;

import eh.p;
import kotlin.jvm.internal.r;
import tg.h;

/* loaded from: classes.dex */
public abstract class g implements tg.h {

    /* renamed from: a, reason: collision with root package name */
    public final tg.h f14191a;

    public g(tg.h hVar) {
        this.f14191a = hVar;
    }

    public abstract e a(g gVar, tg.h hVar);

    public final boolean equals(Object obj) {
        return r.a(this.f14191a, obj);
    }

    @Override // tg.h
    public final <R> R fold(R r10, p<? super R, ? super h.a, ? extends R> pVar) {
        return (R) this.f14191a.fold(r10, pVar);
    }

    @Override // tg.h
    public final <E extends h.a> E get(h.b<E> bVar) {
        return (E) this.f14191a.get(bVar);
    }

    public final int hashCode() {
        return this.f14191a.hashCode();
    }

    @Override // tg.h
    public final tg.h minusKey(h.b<?> bVar) {
        return a(this, this.f14191a.minusKey(bVar));
    }

    @Override // tg.h
    public final tg.h plus(tg.h hVar) {
        return a(this, this.f14191a.plus(hVar));
    }

    public final String toString() {
        return "ForwardingCoroutineContext(delegate=" + this.f14191a + ')';
    }
}
