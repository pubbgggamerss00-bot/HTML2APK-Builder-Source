package c9;

import java.util.List;
import x8.g5;

/* loaded from: classes.dex */
public final /* synthetic */ class a1 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5055a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5056b;

    public /* synthetic */ a1(Object obj, int i10) {
        this.f5055a = i10;
        this.f5056b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        Object value;
        k8.i iVar;
        int i10 = this.f5055a;
        Object obj = this.f5056b;
        switch (i10) {
            case 0:
                ((s1) obj).o(90);
                return pg.f0.f21461a;
            case 1:
                k8.h hVar = ((u8.d1) obj).f29418b;
                sh.z0 z0Var = hVar.f16110q;
                if (((Boolean) z0Var.getValue()).booleanValue()) {
                    hVar.f16114u = System.currentTimeMillis() + 20000;
                    z0Var.j(null, Boolean.FALSE);
                    hVar.f16118y = 0L;
                    sh.z0 z0Var2 = hVar.f16096c;
                    do {
                        value = z0Var2.getValue();
                        iVar = (k8.i) value;
                    } while (!z0Var2.a(value, k8.i.a(iVar, 0L, 0L, 0, 0L, 0, 0L, iVar.f16126g + 1, 0, 0L, null, null, null, null, null, 65471)));
                    hVar.b(5);
                    hVar.j();
                }
                return pg.f0.f21461a;
            case 2:
                boolean z10 = g5.f32665a;
                ((x0.n1) obj).setValue(Boolean.TRUE);
                return pg.f0.f21461a;
            default:
                return ((kh.j) ((List) obj).get(0)).h();
        }
    }
}
