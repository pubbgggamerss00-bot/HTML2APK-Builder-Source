package u8;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class i0 implements eh.a<pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d1 f29475a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k8.d f29476b;

    public i0(d1 d1Var, k8.d dVar) {
        this.f29475a = d1Var;
        this.f29476b = dVar;
    }

    @Override // eh.a
    public final pg.f0 invoke() {
        Object value;
        k8.i iVar;
        LinkedHashMap linkedHashMapK;
        k8.h hVar = this.f29475a.f29418b;
        hVar.getClass();
        k8.d dVar = this.f29476b;
        String str = dVar.f16072a;
        sh.z0 z0Var = hVar.f16096c;
        k8.i iVar2 = (k8.i) z0Var.getValue();
        if (dVar.f16080i <= iVar2.f16127h) {
            Integer num = iVar2.f16130k.get(str);
            int iIntValue = num != null ? num.intValue() : 0;
            long jPow = (long) (Math.pow(1.15d, iIntValue) * dVar.f16076e);
            if (iVar2.f16120a >= jPow) {
                do {
                    value = z0Var.getValue();
                    iVar = (k8.i) value;
                    linkedHashMapK = qg.k0.k(iVar.f16130k);
                    linkedHashMapK.put(str, Integer.valueOf(iIntValue + 1));
                } while (!z0Var.a(value, k8.i.a(iVar, iVar.f16120a - jPow, 0L, 0, 0L, 0, 0L, 0, 0, 0L, linkedHashMapK, null, null, null, null, 64510)));
                hVar.b(5);
                hVar.j();
            }
        }
        return pg.f0.f21461a;
    }
}
