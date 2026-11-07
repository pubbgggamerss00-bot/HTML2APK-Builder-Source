package xh;

import eh.q;
import pg.f0;

/* loaded from: classes2.dex */
public final class f<Q> implements e<Q> {

    /* renamed from: a, reason: collision with root package name */
    public final Object f33577a;

    /* renamed from: b, reason: collision with root package name */
    public final q<Object, j<?>, Object, f0> f33578b;

    /* renamed from: c, reason: collision with root package name */
    public final q<Object, Object, Object, Object> f33579c;

    /* renamed from: d, reason: collision with root package name */
    public final q<j<?>, Object, Object, q<Throwable, Object, tg.h, f0>> f33580d;

    public f(Object obj, q qVar, q qVar2, rh.b bVar) {
        this.f33577a = obj;
        this.f33578b = qVar;
        this.f33579c = qVar2;
        this.f33580d = bVar;
    }

    @Override // xh.g
    public final q<Object, j<?>, Object, f0> a() {
        return this.f33578b;
    }

    @Override // xh.g
    public final Object b() {
        return this.f33577a;
    }

    @Override // xh.g
    public final q<j<?>, Object, Object, q<Throwable, Object, tg.h, f0>> c() {
        return this.f33580d;
    }

    @Override // xh.g
    public final q<Object, Object, Object, Object> d() {
        return this.f33579c;
    }
}
