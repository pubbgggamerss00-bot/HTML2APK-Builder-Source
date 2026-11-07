package w9;

import java.util.concurrent.Executor;
import x9.w;

/* loaded from: classes.dex */
public final class d implements t9.b<c> {

    /* renamed from: a, reason: collision with root package name */
    public final og.a<Executor> f31471a;

    /* renamed from: b, reason: collision with root package name */
    public final og.a<s9.e> f31472b;

    /* renamed from: c, reason: collision with root package name */
    public final g f31473c;

    /* renamed from: d, reason: collision with root package name */
    public final og.a<y9.d> f31474d;

    /* renamed from: e, reason: collision with root package name */
    public final og.a<z9.b> f31475e;

    public d(og.a aVar, og.a aVar2, g gVar, og.a aVar3, og.a aVar4) {
        this.f31471a = aVar;
        this.f31472b = aVar2;
        this.f31473c = gVar;
        this.f31474d = aVar3;
        this.f31475e = aVar4;
    }

    @Override // og.a
    public final Object get() {
        return new c(this.f31471a.get(), this.f31472b.get(), (w) this.f31473c.get(), this.f31474d.get(), this.f31475e.get());
    }
}
