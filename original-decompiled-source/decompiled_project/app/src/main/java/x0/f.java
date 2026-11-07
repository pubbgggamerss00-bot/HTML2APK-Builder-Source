package x0;

import tg.h;

/* loaded from: classes.dex */
public final class f implements h.a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f31671a = new a();

    public static final class a implements h.b<f> {
    }

    @Override // tg.h
    public final <R> R fold(R r10, eh.p<? super R, ? super h.a, ? extends R> pVar) {
        return pVar.invoke(r10, this);
    }

    @Override // tg.h
    public final <E extends h.a> E get(h.b<E> bVar) {
        return (E) h.a.C0291a.a(this, bVar);
    }

    @Override // tg.h.a
    public final h.b<?> getKey() {
        return f31671a;
    }

    @Override // tg.h
    public final tg.h minusKey(h.b<?> bVar) {
        return h.a.C0291a.b(this, bVar);
    }

    @Override // tg.h
    public final tg.h plus(tg.h hVar) {
        return h.a.C0291a.c(this, hVar);
    }
}
