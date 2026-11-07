package u8;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class k0 implements eh.a<pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d1 f29483a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k8.d f29484b;

    public k0(d1 d1Var, k8.d dVar) {
        this.f29483a = d1Var;
        this.f29484b = dVar;
    }

    @Override // eh.a
    public final pg.f0 invoke() {
        Object value;
        k8.i iVar;
        LinkedHashMap linkedHashMapK;
        k8.h hVar = this.f29483a.f29418b;
        hVar.getClass();
        sh.z0 z0Var = hVar.f16096c;
        k8.i iVar2 = (k8.i) z0Var.getValue();
        Map<String, Integer> map = iVar2.f16130k;
        String str = this.f29484b.f16072a;
        Integer num = map.get(str);
        if ((num != null ? num.intValue() : 0) > 0) {
            long jE = hVar.e(str);
            if (iVar2.f16121b >= jE) {
                do {
                    value = z0Var.getValue();
                    iVar = (k8.i) value;
                    linkedHashMapK = qg.k0.k(iVar.f16131l);
                    Integer num2 = iVar.f16131l.get(str);
                    linkedHashMapK.put(str, Integer.valueOf((num2 != null ? num2.intValue() : 1) + 1));
                } while (!z0Var.a(value, k8.i.a(iVar, 0L, iVar.f16121b - jE, 0, 0L, 0, 0L, 0, 0, 0L, null, linkedHashMapK, null, null, null, 63485)));
                hVar.b(3);
                hVar.j();
            }
        }
        return pg.f0.f21461a;
    }
}
