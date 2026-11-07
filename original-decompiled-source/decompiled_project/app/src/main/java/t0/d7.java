package t0;

/* loaded from: classes.dex */
public final class d7 extends kotlin.jvm.internal.s implements eh.a<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hb f25669a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ph.i0 f25670b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hb f25671c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7(hb hbVar, ph.i0 i0Var, hb hbVar2) {
        super(0);
        this.f25669a = hbVar;
        this.f25670b = i0Var;
        this.f25671c = hbVar2;
    }

    @Override // eh.a
    public final Boolean invoke() {
        if (this.f25669a.f26015b.f28944d.invoke(ib.f26109b).booleanValue()) {
            ph.h.c(this.f25670b, null, null, new c7(this.f25671c, null), 3);
        }
        return Boolean.TRUE;
    }
}
