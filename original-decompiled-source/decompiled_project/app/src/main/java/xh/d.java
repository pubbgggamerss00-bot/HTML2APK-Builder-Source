package xh;

import eh.q;
import pg.f0;
import xh.k;

/* loaded from: classes2.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f33574a;

    /* renamed from: b, reason: collision with root package name */
    public final q<Object, j<?>, Object, f0> f33575b;

    /* renamed from: c, reason: collision with root package name */
    public final k.a f33576c = k.a.f33605a;

    public d(Object obj, q qVar) {
        this.f33574a = obj;
        this.f33575b = qVar;
    }

    @Override // xh.g
    public final q<Object, j<?>, Object, f0> a() {
        return this.f33575b;
    }

    @Override // xh.g
    public final Object b() {
        return this.f33574a;
    }

    @Override // xh.g
    public final q<j<?>, Object, Object, q<Throwable, Object, tg.h, f0>> c() {
        return null;
    }

    @Override // xh.g
    public final q<Object, Object, Object, Object> d() {
        return this.f33576c;
    }
}
