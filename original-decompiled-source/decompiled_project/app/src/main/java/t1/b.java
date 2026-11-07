package t1;

import q1.u1;
import s1.a;

/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.s implements eh.l<s1.e, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f27630a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar) {
        super(1);
        this.f27630a = dVar;
    }

    @Override // eh.l
    public final pg.f0 invoke(s1.e eVar) {
        s1.e eVar2 = eVar;
        d dVar = this.f27630a;
        u1 u1Var = dVar.f27645l;
        if (dVar.f27647n && dVar.f27656w && u1Var != null) {
            a.b bVarQ0 = eVar2.Q0();
            long jD = bVarQ0.d();
            bVarQ0.a().d();
            try {
                bVarQ0.f24180a.a(u1Var);
                dVar.c(eVar2);
            } finally {
                t.r.a(bVarQ0, jD);
            }
        } else {
            dVar.c(eVar2);
        }
        return pg.f0.f21461a;
    }
}
