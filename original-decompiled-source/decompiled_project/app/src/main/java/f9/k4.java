package f9;

import java.util.List;
import l9.w;

/* loaded from: classes.dex */
public final /* synthetic */ class k4 implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9915a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9916b;

    public /* synthetic */ k4(w.a aVar) {
        this.f9916b = aVar;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f9915a) {
            case 0:
                w.a aVar = (w.a) this.f9916b;
                b0.j0 LazyColumn = (b0.j0) obj;
                kotlin.jvm.internal.r.e(LazyColumn, "$this$LazyColumn");
                List<String> list = aVar.f16909a;
                LazyColumn.d(list.size(), null, new m4(l4.f9975a, list), new f1.b(-632812321, true, new n4(list)));
                List<String> list2 = aVar.f16910b;
                LazyColumn.d(list2.size(), null, new p4(o4.f10165a, list2), new f1.b(-632812321, true, new q4(list2)));
                return pg.f0.f21461a;
            default:
                p5.b1 b1Var = (p5.b1) this.f9916b;
                p5.s backStackEntry = (p5.s) obj;
                kotlin.jvm.internal.r.e(backStackEntry, "backStackEntry");
                s5.c cVar = backStackEntry.f21275h;
                p5.k0 k0Var = backStackEntry.f21269b;
                if (k0Var == null) {
                    k0Var = null;
                }
                if (k0Var != null) {
                    cVar.a();
                    p5.k0 k0VarC = b1Var.c(k0Var);
                    if (k0VarC != null) {
                        return k0VarC.equals(k0Var) ? backStackEntry : b1Var.b().c(k0VarC, k0VarC.c(cVar.a()));
                    }
                }
                return null;
        }
    }

    public /* synthetic */ k4(p5.b1 b1Var, p5.u0 u0Var) {
        this.f9916b = b1Var;
    }
}
