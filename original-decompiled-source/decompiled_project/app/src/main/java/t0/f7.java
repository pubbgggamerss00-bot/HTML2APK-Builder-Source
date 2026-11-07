package t0;

/* loaded from: classes.dex */
public final class f7 extends kotlin.jvm.internal.s implements eh.a<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hb f25873a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ph.i0 f25874b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7(hb hbVar, ph.i0 i0Var) {
        super(0);
        this.f25873a = hbVar;
        this.f25874b = i0Var;
    }

    @Override // eh.a
    public final Boolean invoke() {
        hb hbVar = this.f25873a;
        if (hbVar.f26015b.f28944d.invoke(ib.f26110c).booleanValue()) {
            ph.h.c(this.f25874b, null, null, new e7(hbVar, null), 3);
        }
        return Boolean.TRUE;
    }
}
