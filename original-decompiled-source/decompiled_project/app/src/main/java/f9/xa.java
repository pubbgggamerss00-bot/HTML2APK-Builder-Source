package f9;

import com.basitce.htmltoapk.data.local.entity.KeystoreEntity;
import java.util.List;
import x0.j;

/* loaded from: classes.dex */
public final class xa implements eh.q<z.r, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh.l<Long, pg.f0> f10942a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List<KeystoreEntity> f10943b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f10944c;

    /* JADX WARN: Multi-variable type inference failed */
    public xa(eh.l<? super Long, pg.f0> lVar, List<KeystoreEntity> list, x0.n1<Boolean> n1Var) {
        this.f10942a = lVar;
        this.f10943b = list;
        this.f10944c = n1Var;
    }

    @Override // eh.q
    public final pg.f0 b(z.r rVar, x0.j jVar, Integer num) {
        z.r AppExposedDropdownMenu = rVar;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(AppExposedDropdownMenu, "$this$AppExposedDropdownMenu");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            f1.b bVar = e.O;
            jVar2.L(529252531);
            final eh.l<Long, pg.f0> lVar = this.f10942a;
            boolean zK = jVar2.K(lVar);
            Object objG = jVar2.g();
            Object obj = j.a.f31715a;
            final x0.n1<Boolean> n1Var = this.f10944c;
            if (zK || objG == obj) {
                objG = new v1(lVar, n1Var);
                jVar2.C(objG);
            }
            jVar2.B();
            q8.g.b(bVar, (eh.a) objG, null, jVar2, 6, 4);
            for (final KeystoreEntity keystoreEntity : this.f10943b) {
                f1.b bVarB = f1.c.b(1482687276, new wa(keystoreEntity), jVar2);
                jVar2.L(-1775342317);
                boolean zK2 = jVar2.K(lVar) | jVar2.K(keystoreEntity);
                Object objG2 = jVar2.g();
                if (zK2 || objG2 == obj) {
                    objG2 = new eh.a() { // from class: f9.va
                        @Override // eh.a
                        public final Object invoke() {
                            lVar.invoke(Long.valueOf(keystoreEntity.getId()));
                            n1Var.setValue(Boolean.FALSE);
                            return pg.f0.f21461a;
                        }
                    };
                    jVar2.C(objG2);
                }
                jVar2.B();
                q8.g.b(bVarB, (eh.a) objG2, null, jVar2, 6, 4);
            }
        }
        return pg.f0.f21461a;
    }
}
