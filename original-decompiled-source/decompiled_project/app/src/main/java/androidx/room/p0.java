package androidx.room;

import java.util.concurrent.atomic.AtomicInteger;
import tg.h;

/* loaded from: classes.dex */
public final class p0 implements h.a {

    /* renamed from: c, reason: collision with root package name */
    public static final a f3043c = new a();

    /* renamed from: a, reason: collision with root package name */
    public final tg.f f3044a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f3045b = new AtomicInteger(0);

    public static final class a implements h.b<p0> {
    }

    public p0(tg.f fVar) {
        this.f3044a = fVar;
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
    public final h.b<p0> getKey() {
        return f3043c;
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
