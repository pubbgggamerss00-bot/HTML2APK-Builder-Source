package x9;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class v implements t9.b<u> {

    /* renamed from: a, reason: collision with root package name */
    public final og.a<Executor> f33528a;

    /* renamed from: b, reason: collision with root package name */
    public final og.a<y9.d> f33529b;

    /* renamed from: c, reason: collision with root package name */
    public final w9.g f33530c;

    /* renamed from: d, reason: collision with root package name */
    public final og.a<z9.b> f33531d;

    public v(og.a aVar, og.a aVar2, w9.g gVar, og.a aVar3) {
        this.f33528a = aVar;
        this.f33529b = aVar2;
        this.f33530c = gVar;
        this.f33531d = aVar3;
    }

    @Override // og.a
    public final Object get() {
        return new u(this.f33528a.get(), this.f33529b.get(), (w) this.f33530c.get(), this.f33531d.get());
    }
}
