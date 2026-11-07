package b0;

import d0.o;

/* loaded from: classes.dex */
public final class i implements o.a {

    /* renamed from: a, reason: collision with root package name */
    public final eh.l<Integer, Object> f3366a;

    /* renamed from: b, reason: collision with root package name */
    public final eh.l<Integer, Object> f3367b;

    /* renamed from: c, reason: collision with root package name */
    public final f1.b f3368c;

    public i(eh.l lVar, eh.l lVar2, f1.b bVar) {
        this.f3366a = lVar;
        this.f3367b = lVar2;
        this.f3368c = bVar;
    }

    @Override // d0.o.a
    public final eh.l<Integer, Object> getKey() {
        return this.f3366a;
    }

    @Override // d0.o.a
    public final eh.l<Integer, Object> getType() {
        return this.f3367b;
    }
}
