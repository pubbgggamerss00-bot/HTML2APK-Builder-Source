package f9;

import s8.e2;

/* loaded from: classes.dex */
public final /* synthetic */ class lb implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9990a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9991b;

    public /* synthetic */ lb(Object obj, int i10) {
        this.f9990a = i10;
        this.f9991b = obj;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f9990a) {
            case 0:
                fg fgVar = (fg) this.f9991b;
                String it = (String) obj;
                kotlin.jvm.internal.r.e(it, "it");
                sh.z0 z0Var = fgVar.f9586r;
                z0Var.getClass();
                z0Var.j(null, it);
                break;
            default:
                ((p5.s0) this.f9991b).b(new q5.z(1), e2.v.a(e2.v.f24652c, ((Long) obj).longValue(), false, null, 6));
                break;
        }
        return pg.f0.f21461a;
    }
}
