package x0;

/* loaded from: classes.dex */
public final class f2<T> {

    /* renamed from: a, reason: collision with root package name */
    public final e2 f31672a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f31673b;

    /* renamed from: c, reason: collision with root package name */
    public final i3<T> f31674c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f31675d;

    /* renamed from: e, reason: collision with root package name */
    public final T f31676e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f31677f = true;

    /* JADX WARN: Multi-variable type inference failed */
    public f2(e2 e2Var, Object obj, boolean z10, i3 i3Var, boolean z11) {
        this.f31672a = e2Var;
        this.f31673b = z10;
        this.f31674c = i3Var;
        this.f31675d = z11;
        this.f31676e = obj;
    }

    public final T a() {
        if (this.f31673b) {
            return null;
        }
        T t3 = this.f31676e;
        if (t3 != null) {
            return t3;
        }
        q.d("Unexpected form of a provided value");
        throw new pg.g();
    }
}
