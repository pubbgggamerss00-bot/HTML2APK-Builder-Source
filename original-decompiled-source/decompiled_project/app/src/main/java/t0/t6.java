package t0;

/* loaded from: classes.dex */
public final class t6 extends kotlin.jvm.internal.s implements eh.l<Throwable, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hb f27052a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f27053b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6(hb hbVar, eh.a<pg.f0> aVar) {
        super(1);
        this.f27052a = hbVar;
        this.f27053b = aVar;
    }

    @Override // eh.l
    public final pg.f0 invoke(Throwable th2) {
        if (!this.f27052a.c()) {
            this.f27053b.invoke();
        }
        return pg.f0.f21461a;
    }
}
