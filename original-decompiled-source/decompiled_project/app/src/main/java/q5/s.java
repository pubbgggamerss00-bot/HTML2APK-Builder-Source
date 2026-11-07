package q5;

import java.util.List;
import p5.c1;

/* loaded from: classes.dex */
public final class s {
    public static void a(p5.p0 p0Var, String str, List list, s8.x xVar, f1.b bVar, int i10) {
        if ((i10 & 2) != 0) {
            list = qg.z.f22752a;
        }
        if ((i10 & 8) != 0) {
            xVar = null;
        }
        c1 c1Var = p0Var.f21254g;
        c1Var.getClass();
        f fVar = new f((e) c1Var.b(c1.a.a(e.class)), str, bVar);
        for (p5.n nVar : list) {
            fVar.f21247d.put(nVar.f21250a, nVar.f21251b);
        }
        fVar.f21958i = xVar;
        fVar.f21959j = xVar;
        p0Var.f21256i.add(fVar.a());
    }
}
