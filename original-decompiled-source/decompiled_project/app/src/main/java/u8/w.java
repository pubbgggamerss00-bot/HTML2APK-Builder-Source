package u8;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class w implements eh.a<pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d1 f29531a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k8.a f29532b;

    public w(d1 d1Var, k8.a aVar) {
        this.f29531a = d1Var;
        this.f29532b = aVar;
    }

    @Override // eh.a
    public final pg.f0 invoke() {
        Object value;
        k8.i iVar;
        LinkedHashMap linkedHashMapK;
        k8.h hVar = this.f29531a.f29418b;
        hVar.getClass();
        k8.a aVar = this.f29532b;
        String str = aVar.f16056a;
        sh.z0 z0Var = hVar.f16096c;
        k8.i iVar2 = (k8.i) z0Var.getValue();
        if (aVar.f16066k <= iVar2.f16127h) {
            Integer num = iVar2.f16133n.get(str);
            int iIntValue = num != null ? num.intValue() : 0;
            long jPow = (long) (Math.pow(1.25d, iIntValue) * aVar.f16060e);
            if (iVar2.f16120a >= jPow) {
                do {
                    value = z0Var.getValue();
                    iVar = (k8.i) value;
                    linkedHashMapK = qg.k0.k(iVar.f16133n);
                    linkedHashMapK.put(str, Integer.valueOf(iIntValue + 1));
                } while (!z0Var.a(value, k8.i.a(iVar, iVar.f16120a - jPow, 0L, 0, 0L, 0, 0L, 0, 0, 0L, null, null, null, linkedHashMapK, null, 57342)));
                hVar.b(6);
                hVar.j();
            }
        }
        return pg.f0.f21461a;
    }
}
