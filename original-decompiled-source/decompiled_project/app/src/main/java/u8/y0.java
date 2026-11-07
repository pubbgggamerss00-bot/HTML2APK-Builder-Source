package u8;

import x0.n1;

/* loaded from: classes.dex */
public final /* synthetic */ class y0 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29625a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f29626b;

    public /* synthetic */ y0(Object obj, int i10) {
        this.f29625a = i10;
        this.f29626b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        Object value;
        switch (this.f29625a) {
            case 0:
                k8.h hVar = ((d1) this.f29626b).f29418b;
                sh.z0 z0Var = hVar.f16096c;
                if (!((k8.i) z0Var.getValue()).f16135p && ((k8.i) z0Var.getValue()).f16122c >= 50) {
                    do {
                        value = z0Var.getValue();
                    } while (!z0Var.a(value, k8.i.a((k8.i) value, 0L, 0L, r5.f16122c - 50, 0L, 0, 0L, 0, 0, 0L, null, null, null, null, null, 32763)));
                    hVar.j();
                }
                break;
            default:
                ((n1) this.f29626b).setValue(Boolean.FALSE);
                break;
        }
        return pg.f0.f21461a;
    }
}
