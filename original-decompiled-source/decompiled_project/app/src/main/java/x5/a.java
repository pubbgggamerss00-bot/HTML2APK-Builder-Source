package x5;

import eh.p;
import kotlin.jvm.internal.r;
import tg.h;

/* loaded from: classes.dex */
public final class a implements h.a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0323a f32077b = new C0323a();

    /* renamed from: a, reason: collision with root package name */
    public final i f32078a;

    /* renamed from: x5.a$a, reason: collision with other inner class name */
    public static final class C0323a implements h.b<a> {
    }

    public a(i connectionWrapper) {
        r.e(connectionWrapper, "connectionWrapper");
        this.f32078a = connectionWrapper;
    }

    @Override // tg.h
    public final <R> R fold(R r10, p<? super R, ? super h.a, ? extends R> pVar) {
        return pVar.invoke(r10, this);
    }

    @Override // tg.h
    public final <E extends h.a> E get(h.b<E> bVar) {
        return (E) h.a.C0291a.a(this, bVar);
    }

    @Override // tg.h.a
    public final h.b<a> getKey() {
        return f32077b;
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
