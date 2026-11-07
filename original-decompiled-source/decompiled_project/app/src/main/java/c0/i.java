package c0;

import d0.o;

/* loaded from: classes.dex */
public final class i implements o.a {

    /* renamed from: a, reason: collision with root package name */
    public final eh.l<Integer, Object> f4393a;

    /* renamed from: b, reason: collision with root package name */
    public final eh.p<x, Integer, c> f4394b;

    /* renamed from: c, reason: collision with root package name */
    public final kotlin.jvm.internal.s f4395c;

    /* renamed from: d, reason: collision with root package name */
    public final f1.b f4396d;

    /* JADX WARN: Multi-variable type inference failed */
    public i(eh.l lVar, eh.p pVar, eh.l lVar2, f1.b bVar) {
        this.f4393a = lVar;
        this.f4394b = pVar;
        this.f4395c = (kotlin.jvm.internal.s) lVar2;
        this.f4396d = bVar;
    }

    @Override // d0.o.a
    public final eh.l<Integer, Object> getKey() {
        return this.f4393a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eh.l<java.lang.Integer, java.lang.Object>, kotlin.jvm.internal.s] */
    @Override // d0.o.a
    public final eh.l<Integer, Object> getType() {
        return this.f4395c;
    }
}
