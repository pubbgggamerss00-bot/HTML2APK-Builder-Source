package f9;

/* loaded from: classes.dex */
public final class f4 implements eh.a<pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh.p<String, Integer, pg.f0> f9527a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f9528b;

    /* JADX WARN: Multi-variable type inference failed */
    public f4(eh.p<? super String, ? super Integer, pg.f0> pVar, b bVar) {
        this.f9527a = pVar;
        this.f9528b = bVar;
    }

    @Override // eh.a
    public final pg.f0 invoke() {
        String str = this.f9528b.f8990c;
        this.f9527a.invoke(str, Integer.valueOf(str.length()));
        return pg.f0.f21461a;
    }
}
