package c9;

import t8.v2;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5176a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f5177b;

    public /* synthetic */ q(x0.n1 n1Var, int i10) {
        this.f5176a = i10;
        this.f5177b = n1Var;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f5176a) {
            case 0:
                this.f5177b.setValue(null);
                break;
            default:
                v2.b(this.f5177b, true);
                break;
        }
        return pg.f0.f21461a;
    }
}
