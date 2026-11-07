package s4;

/* loaded from: classes.dex */
public final class d0 extends kotlin.jvm.internal.s implements eh.l<Throwable, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m<Object> f24213a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(m<Object> mVar) {
        super(1);
        this.f24213a = mVar;
    }

    @Override // eh.l
    public final pg.f0 invoke(Throwable th2) {
        Throwable th3 = th2;
        m<Object> mVar = this.f24213a;
        if (th3 != null) {
            mVar.f24311h.b(new t0(th3));
        }
        if (mVar.f24313j.f21477b != pg.b0.f21449a) {
            ((j1) mVar.f24313j.getValue()).close();
        }
        return pg.f0.f21461a;
    }
}
