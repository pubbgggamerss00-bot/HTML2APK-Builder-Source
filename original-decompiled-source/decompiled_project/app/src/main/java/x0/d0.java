package x0;

/* loaded from: classes.dex */
public final class d0<T> extends e2<T> {

    /* renamed from: b, reason: collision with root package name */
    public final e0<T> f31627b;

    public static final class a extends kotlin.jvm.internal.s implements eh.a<T> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f31628a = new a(0);

        @Override // eh.a
        public final T invoke() {
            q.d("Unexpected call to default provider");
            throw new pg.g();
        }
    }

    public d0(eh.l<? super x, ? extends T> lVar) {
        super(a.f31628a);
        this.f31627b = new e0<>(lVar);
    }

    @Override // x0.e2
    public final f2<T> a(T t3) {
        return new f2<>(this, t3, t3 == null, null, true);
    }

    @Override // x0.e2
    public final v3 b() {
        return this.f31627b;
    }
}
