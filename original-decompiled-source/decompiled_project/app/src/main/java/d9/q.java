package d9;

import com.basitce.htmltoapk.R;
import g8.s;
import p0.i5;
import pg.f0;
import x0.j;
import x0.n1;
import x0.r3;

/* loaded from: classes.dex */
public final class q implements eh.q<z.r, x0.j, Integer, f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p5.x f7643a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.a<f0> f7644b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r3<g8.s> f7645c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r3<g8.d> f7646d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r3<g8.x> f7647e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n1 f7648f;

    public q(p5.x xVar, eh.a aVar, n1 n1Var, n1 n1Var2, n1 n1Var3, n1 n1Var4) {
        this.f7643a = xVar;
        this.f7644b = aVar;
        this.f7645c = n1Var;
        this.f7646d = n1Var2;
        this.f7647e = n1Var3;
        this.f7648f = n1Var4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.q
    public final f0 b(z.r rVar, x0.j jVar, Integer num) {
        z.r SettingsScreen = rVar;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(SettingsScreen, "$this$SettingsScreen");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            g8.s value = this.f7645c.getValue();
            if (value instanceof s.a) {
                jVar2.L(1198713854);
                m.f((s.a) value, jVar2, 0);
                g8.d value2 = this.f7646d.getValue();
                int i10 = this.f7647e.getValue().f11647a;
                jVar2.L(-792609289);
                p5.x xVar = this.f7643a;
                boolean zL = jVar2.l(xVar);
                Object objG = jVar2.g();
                j.a.C0321a c0321a = j.a.f31715a;
                if (zL || objG == c0321a) {
                    objG = new o(xVar, 0);
                    jVar2.C(objG);
                }
                jVar2.B();
                m.b(value2, i10, (eh.a) objG, jVar2, 0);
                w1.d dVarA = i5.a();
                String strC = f3.q.c(R.string.profile_ai_history, jVar2);
                String strC2 = f3.q.c(R.string.profile_ai_history_summary, jVar2);
                jVar2.L(-792597678);
                boolean zL2 = jVar2.l(xVar);
                Object objG2 = jVar2.g();
                if (zL2 || objG2 == c0321a) {
                    objG2 = new p(xVar, 0);
                    jVar2.C(objG2);
                }
                jVar2.B();
                m.c(dVarA, strC, strC2, (eh.a) objG2, jVar2, 0);
                jVar2.B();
            } else {
                jVar2.L(-792593938);
                m.g(((Boolean) this.f7648f.getValue()).booleanValue(), this.f7644b, jVar2, 0);
                jVar2.B();
            }
        }
        return f0.f21461a;
    }
}
