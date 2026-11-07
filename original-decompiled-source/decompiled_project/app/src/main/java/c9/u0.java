package c9;

import f9.fg;

/* loaded from: classes.dex */
public final /* synthetic */ class u0 implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5299a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5300b;

    public /* synthetic */ u0(Object obj, int i10) {
        this.f5299a = i10;
        this.f5300b = obj;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        int i10 = this.f5299a;
        Object obj2 = this.f5300b;
        switch (i10) {
            case 0:
                pg.n it = (pg.n) obj;
                kotlin.jvm.internal.r.e(it, "it");
                int i11 = r0.f5188b;
                ((x0.n1) obj2).setValue(it);
                break;
            default:
                String it2 = (String) obj;
                kotlin.jvm.internal.r.e(it2, "it");
                sh.z0 z0Var = ((fg) obj2).O0;
                z0Var.getClass();
                z0Var.j(null, it2);
                break;
        }
        return pg.f0.f21461a;
    }
}
