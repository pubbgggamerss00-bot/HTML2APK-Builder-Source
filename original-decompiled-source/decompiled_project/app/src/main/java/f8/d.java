package f8;

/* loaded from: classes.dex */
public final class d extends k {

    /* renamed from: a, reason: collision with root package name */
    public final e f8875a;

    /* renamed from: b, reason: collision with root package name */
    public final d f8876b = this;

    /* renamed from: c, reason: collision with root package name */
    public final ng.c<eg.a> f8877c = ng.a.a(new a());

    public static final class a<T> implements ng.c<T> {
        @Override // og.a
        public final T get() {
            return (T) new ig.e();
        }
    }

    public d(e eVar) {
        this.f8875a = eVar;
    }

    @Override // jg.c.InterfaceC0152c
    public final eg.a a() {
        return this.f8877c.get();
    }

    @Override // jg.a.InterfaceC0151a
    public final f8.a b() {
        return new f8.a(this.f8875a, this.f8876b);
    }
}
