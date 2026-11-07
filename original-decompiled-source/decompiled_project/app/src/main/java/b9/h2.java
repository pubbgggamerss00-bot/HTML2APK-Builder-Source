package b9;

import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class h2 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3871a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3872b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3873c;

    public /* synthetic */ h2(int i10, Object obj, Object obj2) {
        this.f3871a = i10;
        this.f3872b = obj;
        this.f3873c = obj2;
    }

    @Override // eh.a
    public final Object invoke() {
        Object next;
        h8.u uVar;
        Object value;
        k8.i iVar;
        switch (this.f3871a) {
            case 0:
                ((j0) this.f3872b).f3895b.invoke(Integer.valueOf(((y2) this.f3873c).f4160d.g() + 1));
                break;
            case 1:
                t8.m3 m3Var = (t8.m3) this.f3872b;
                int i10 = ((t8.y3) this.f3873c).f28581a;
                sh.z0 z0Var = m3Var.f28312g;
                Long l10 = ((t8.b3) z0Var.getValue()).f28112b;
                if (l10 != null) {
                    long jLongValue = l10.longValue();
                    Iterator<T> it = ((t8.b3) z0Var.getValue()).f28111a.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            if (((t8.y3) next).f28581a == i10) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    t8.y3 y3Var = (t8.y3) next;
                    if (y3Var != null && (uVar = y3Var.f28596p) != null) {
                        ph.h.c(androidx.lifecycle.x0.a(m3Var), null, null, new t8.n3(m3Var, jLongValue, uVar, i10, null), 3);
                    }
                }
                break;
            default:
                u8.d1 d1Var = (u8.d1) this.f3872b;
                x0.n1 n1Var = (x0.n1) this.f3873c;
                k8.h hVar = d1Var.f29418b;
                sh.z0 z0Var2 = hVar.f16096c;
                sh.z0 z0Var3 = hVar.f16112s;
                long j10 = 0;
                if (((Boolean) z0Var3.getValue()).booleanValue()) {
                    long jMax = Math.max(250L, (long) (hVar.c((k8.i) z0Var2.getValue()) * 180.0d));
                    z0Var3.j(null, Boolean.FALSE);
                    hVar.f16119z = 0L;
                    do {
                        value = z0Var2.getValue();
                        iVar = (k8.i) value;
                    } while (!z0Var2.a(value, k8.i.a(iVar, iVar.f16120a + jMax, 0L, 0, iVar.f16123d + jMax, 0, 0L, iVar.f16126g + 1, 0, 0L, null, null, null, null, null, 65462)));
                    hVar.b(5);
                    hVar.j();
                    j10 = jMax;
                }
                n1Var.setValue(Long.valueOf(j10));
                break;
        }
        return pg.f0.f21461a;
    }
}
