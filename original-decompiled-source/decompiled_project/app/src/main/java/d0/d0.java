package d0;

/* loaded from: classes.dex */
public final class d0 extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f7081a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7082b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7083c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(int i10, g0 g0Var, Object obj) {
        super(2);
        this.f7081a = g0Var;
        this.f7082b = i10;
        this.f7083c = obj;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        if (jVar2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            this.f7081a.h(this.f7082b, this.f7083c, jVar2);
        } else {
            jVar2.v();
        }
        return pg.f0.f21461a;
    }
}
