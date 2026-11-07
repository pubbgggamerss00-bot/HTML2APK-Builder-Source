package t0;

/* loaded from: classes.dex */
public final class r3 extends kotlin.jvm.internal.s implements eh.l<q2.d0, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l3 f26847a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j2.z4 f26848b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(boolean z10, String str, String str2, String str3, l3 l3Var, j2.z4 z4Var) {
        super(1);
        this.f26847a = l3Var;
        this.f26848b = z4Var;
    }

    @Override // eh.l
    public final pg.f0 invoke(q2.d0 d0Var) {
        q2.d0 d0Var2 = d0Var;
        q2.a0.e(d0Var2, 6);
        d0Var2.c(q2.k.f21774b, new q2.a(null, new q3(this.f26847a, this.f26848b)));
        return pg.f0.f21461a;
    }
}
