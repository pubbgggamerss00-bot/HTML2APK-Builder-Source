package t0;

/* loaded from: classes.dex */
public final class u6 extends kotlin.jvm.internal.s implements eh.l<Float, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ph.i0 f27126a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hb f27127b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f27128c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u6(eh.a aVar, ph.i0 i0Var, hb hbVar) {
        super(1);
        this.f27126a = i0Var;
        this.f27127b = hbVar;
        this.f27128c = aVar;
    }

    @Override // eh.l
    public final pg.f0 invoke(Float f10) {
        float fFloatValue = f10.floatValue();
        hb hbVar = this.f27127b;
        ph.h.c(this.f27126a, null, null, new s6(hbVar, fFloatValue, null), 3).invokeOnCompletion(new t6(hbVar, this.f27128c));
        return pg.f0.f21461a;
    }
}
