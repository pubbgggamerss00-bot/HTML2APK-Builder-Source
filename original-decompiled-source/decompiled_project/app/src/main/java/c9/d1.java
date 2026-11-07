package c9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class d1 extends kotlin.jvm.internal.p implements eh.a<pg.f0> {
    @Override // eh.a
    public final pg.f0 invoke() {
        List listC;
        s1 s1Var = (s1) this.receiver;
        s1Var.getClass();
        HashSet hashSet = new HashSet();
        List<b> listJ = s1Var.j();
        ArrayList arrayList = new ArrayList();
        for (b bVar : listJ) {
            if (s1Var.k().contains(Long.valueOf(bVar.f5057a))) {
                long j10 = s1Var.f5293y;
                s1Var.f5293y = 1 + j10;
                b bVarA = b.a(bVar, j10, 0, null, 126);
                hashSet.add(Long.valueOf(bVarA.f5057a));
                pg.f0 f0Var = pg.f0.f21461a;
                listC = qg.p.j(bVar, bVarA);
            } else {
                listC = c0.g0.c(bVar);
            }
            qg.t.p(listC, arrayList);
        }
        s1Var.h(arrayList);
        s1Var.f5277i.setValue(hashSet);
        s1Var.f5279k.setValue((Long) qg.x.C(hashSet));
        return pg.f0.f21461a;
    }
}
