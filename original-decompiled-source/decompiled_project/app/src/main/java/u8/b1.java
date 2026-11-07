package u8;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class b1 implements eh.a<pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d1 f29399a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k8.m f29400b;

    public b1(d1 d1Var, k8.m mVar) {
        this.f29399a = d1Var;
        this.f29400b = mVar;
    }

    @Override // eh.a
    public final pg.f0 invoke() {
        Object value;
        k8.i iVar;
        LinkedHashMap linkedHashMapK;
        k8.h hVar = this.f29399a.f29418b;
        hVar.getClass();
        k8.m mVar = this.f29400b;
        String str = mVar.f16158a;
        sh.z0 z0Var = hVar.f16096c;
        k8.i iVar2 = (k8.i) z0Var.getValue();
        if (mVar.f16165h <= iVar2.f16127h) {
            Integer num = iVar2.f16132m.get(str);
            int iIntValue = num != null ? num.intValue() : 0;
            long jPow = (long) (Math.pow(1.18d, iIntValue) * mVar.f16162e);
            if (iVar2.f16120a >= jPow) {
                do {
                    value = z0Var.getValue();
                    iVar = (k8.i) value;
                    linkedHashMapK = qg.k0.k(iVar.f16132m);
                    linkedHashMapK.put(str, Integer.valueOf(iIntValue + 1));
                } while (!z0Var.a(value, k8.i.a(iVar, iVar.f16120a - jPow, 0L, 0, 0L, 0, 0L, 0, 0, 0L, null, null, linkedHashMapK, null, null, 61438)));
                hVar.b(8);
                hVar.j();
            }
        }
        return pg.f0.f21461a;
    }
}
