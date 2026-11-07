package i0;

/* loaded from: classes.dex */
public final class p2 extends kotlin.jvm.internal.s implements eh.a<pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b3 f13501a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(b3 b3Var) {
        super(0);
        this.f13501a = b3Var;
    }

    @Override // eh.a
    public final pg.f0 invoke() {
        this.f13501a.onCancel();
        return pg.f0.f21461a;
    }
}
