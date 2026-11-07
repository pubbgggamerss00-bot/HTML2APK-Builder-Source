package u8;

import x0.n1;
import x8.d5;

/* loaded from: classes.dex */
public final /* synthetic */ class t0 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29523a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f29524b;

    public /* synthetic */ t0(Object obj, int i10) {
        this.f29523a = i10;
        this.f29524b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        Object value;
        switch (this.f29523a) {
            case 0:
                k8.h hVar = ((d1) this.f29524b).f29418b;
                sh.z0 z0Var = hVar.f16096c;
                if (((k8.i) z0Var.getValue()).f16122c >= 10) {
                    hVar.f16115v = (60 * 1000) + System.currentTimeMillis();
                    do {
                        value = z0Var.getValue();
                    } while (!z0Var.a(value, k8.i.a((k8.i) value, 0L, 0L, r5.f16122c - 10, 0L, 0, 0L, 0, 0, 0L, null, null, null, null, null, 65531)));
                    hVar.j();
                }
                break;
            default:
                d5.a((n1) this.f29524b, false);
                break;
        }
        return pg.f0.f21461a;
    }
}
