package u8;

import x0.n1;

/* loaded from: classes.dex */
public final /* synthetic */ class u0 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29526a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f29527b;

    public /* synthetic */ u0(Object obj, int i10) {
        this.f29526a = i10;
        this.f29527b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        Object value;
        switch (this.f29526a) {
            case 0:
                k8.h hVar = ((d1) this.f29527b).f29418b;
                sh.z0 z0Var = hVar.f16096c;
                if (((k8.i) z0Var.getValue()).f16122c >= 20) {
                    hVar.f16116w = (60 * 1000) + System.currentTimeMillis();
                    do {
                        value = z0Var.getValue();
                    } while (!z0Var.a(value, k8.i.a((k8.i) value, 0L, 0L, r5.f16122c - 20, 0L, 0, 0L, 0, 0, 0L, null, null, null, null, null, 65531)));
                    hVar.j();
                }
                break;
            default:
                ((n1) this.f29527b).setValue(Boolean.FALSE);
                break;
        }
        return pg.f0.f21461a;
    }
}
