package t0;

/* loaded from: classes.dex */
public final class r6 extends kotlin.jvm.internal.s implements eh.a<pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hb f26866a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ph.i0 f26867b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f26868c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(eh.a aVar, ph.i0 i0Var, hb hbVar) {
        super(0);
        this.f26866a = hbVar;
        this.f26867b = i0Var;
        this.f26868c = aVar;
    }

    @Override // eh.a
    public final pg.f0 invoke() {
        hb hbVar = this.f26866a;
        if (hbVar.f26015b.f28944d.invoke(ib.f26108a).booleanValue()) {
            ph.h.c(this.f26867b, null, null, new p6(hbVar, null), 3).invokeOnCompletion(new q6(hbVar, this.f26868c));
        }
        return pg.f0.f21461a;
    }
}
