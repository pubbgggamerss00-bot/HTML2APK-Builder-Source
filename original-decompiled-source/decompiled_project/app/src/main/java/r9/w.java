package r9;

/* loaded from: classes.dex */
public final class w implements t9.b<u> {

    /* renamed from: a, reason: collision with root package name */
    public final w9.d f23320a;

    /* renamed from: b, reason: collision with root package name */
    public final x9.r f23321b;

    /* renamed from: c, reason: collision with root package name */
    public final x9.v f23322c;

    public w(w9.d dVar, x9.r rVar, x9.v vVar) {
        this.f23320a = dVar;
        this.f23321b = rVar;
        this.f23322c = vVar;
    }

    @Override // og.a
    public final Object get() {
        return new u(new aa.c(), new aa.b(), (w9.e) this.f23320a.get(), (x9.q) this.f23321b.get(), (x9.u) this.f23322c.get());
    }
}
