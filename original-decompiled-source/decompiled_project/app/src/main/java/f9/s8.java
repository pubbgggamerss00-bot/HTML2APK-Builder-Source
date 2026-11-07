package f9;

import java.util.Iterator;
import java.util.List;
import x0.j;

/* loaded from: classes.dex */
public final class s8 implements eh.q<z.r, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List<pg.n<String, String>> f10496a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.l<String, pg.f0> f10497b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f10498c;

    public s8(eh.l lVar, List list, x0.n1 n1Var) {
        this.f10496a = list;
        this.f10497b = lVar;
        this.f10498c = n1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.q
    public final pg.f0 b(z.r rVar, x0.j jVar, Integer num) {
        z.r AppExposedDropdownMenu = rVar;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(AppExposedDropdownMenu, "$this$AppExposedDropdownMenu");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            Iterator<T> it = this.f10496a.iterator();
            while (it.hasNext()) {
                pg.n nVar = (pg.n) it.next();
                final String str = (String) nVar.f21469a;
                f1.b bVarB = f1.c.b(800651971, new r8((String) nVar.f21470b), jVar2);
                jVar2.L(-2115491280);
                final eh.l<String, pg.f0> lVar = this.f10497b;
                boolean zK = jVar2.K(lVar) | jVar2.K(str);
                Object objG = jVar2.g();
                if (zK || objG == j.a.f31715a) {
                    final x0.n1<Boolean> n1Var = this.f10498c;
                    objG = new eh.a() { // from class: f9.q8
                        @Override // eh.a
                        public final Object invoke() {
                            lVar.invoke(str);
                            n1Var.setValue(Boolean.FALSE);
                            return pg.f0.f21461a;
                        }
                    };
                    jVar2.C(objG);
                }
                jVar2.B();
                q8.g.b(bVarB, (eh.a) objG, null, jVar2, 6, 4);
            }
        }
        return pg.f0.f21461a;
    }
}
