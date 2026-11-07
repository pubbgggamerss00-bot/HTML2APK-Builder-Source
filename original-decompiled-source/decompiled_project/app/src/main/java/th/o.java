package th;

import tg.h;

/* loaded from: classes2.dex */
public final class o implements tg.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tg.h f28840a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f28841b;

    public o(Throwable th2, tg.h hVar) {
        this.f28840a = hVar;
        this.f28841b = th2;
    }

    @Override // tg.h
    public final <R> R fold(R r10, eh.p<? super R, ? super h.a, ? extends R> pVar) {
        return (R) this.f28840a.fold(r10, pVar);
    }

    @Override // tg.h
    public final <E extends h.a> E get(h.b<E> bVar) {
        return (E) this.f28840a.get(bVar);
    }

    @Override // tg.h
    public final tg.h minusKey(h.b<?> bVar) {
        return this.f28840a.minusKey(bVar);
    }

    @Override // tg.h
    public final tg.h plus(tg.h hVar) {
        return this.f28840a.plus(hVar);
    }
}
