package c9;

import androidx.compose.ui.d;
import com.basitce.htmltoapk.R;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;
import java.util.Iterator;
import t0.e2;
import t0.ff;
import t0.nf;
import t0.of;
import x0.a2;
import x0.j;

/* loaded from: classes.dex */
public final class x0 implements eh.r<r.n, String, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e2 f5315a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s1 f5316b;

    public x0(s1 s1Var, e2 e2Var) {
        this.f5315a = e2Var;
        this.f5316b = s1Var;
    }

    @Override // eh.r
    public final pg.f0 f(r.n nVar, String str, x0.j jVar, Integer num) {
        x0.j jVar2;
        r.n AnimatedContent = nVar;
        String tool = str;
        x0.j jVar3 = jVar;
        num.intValue();
        kotlin.jvm.internal.r.e(AnimatedContent, "$this$AnimatedContent");
        kotlin.jvm.internal.r.e(tool, "tool");
        d.a aVar = d.a.f1143b;
        androidx.compose.ui.d dVarJ = androidx.compose.foundation.layout.f.j(ph.m0.e(androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(aVar, 1.0f), 52), ph.m0.c(jVar3), false), 16, CropImageView.DEFAULT_ASPECT_RATIO, 2);
        z.m1 m1VarA = z.k1.a(z.b.h(10), d.a.f14612k, jVar3, 54);
        int iD = jVar3.D();
        a2 a2VarY = jVar3.y();
        androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarJ, jVar3);
        i2.g.f13861o.getClass();
        e0.a aVar2 = g.a.f13863b;
        if (jVar3.t() == null) {
            u1.d();
            throw null;
        }
        jVar3.r();
        if (jVar3.m()) {
            jVar3.w(aVar2);
        } else {
            jVar3.z();
        }
        ph.v1.j(g.a.f13867f, m1VarA, jVar3);
        ph.v1.j(g.a.f13866e, a2VarY, jVar3);
        g.a.C0128a c0128a = g.a.f13868g;
        if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD))) {
            l9.i.a(iD, jVar3, iD, c0128a);
        }
        ph.v1.j(g.a.f13865d, dVarC, jVar3);
        if (tool.equals("eraser")) {
            jVar3.L(-1302808108);
            ff.b(f3.q.c(R.string.pdf_edit_eraser_hint, jVar3), null, this.f5315a.f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar3.f(of.f26647a)).f26549l, jVar3, 0, 0, 65530);
            jVar2 = jVar3;
            jVar2.B();
        } else {
            jVar2 = jVar3;
            boolean zEquals = tool.equals("highlighter");
            j.a.C0321a c0321a = j.a.f31715a;
            final s1 s1Var = this.f5316b;
            if (zEquals) {
                jVar2.L(-1302502851);
                jVar2.L(-2120224273);
                Iterator<T> it = s1.B.iterator();
                while (it.hasNext()) {
                    final int iIntValue = ((Number) it.next()).intValue();
                    boolean z10 = s1Var.f5282n.g() == iIntValue;
                    jVar2.L(-618508091);
                    boolean zL = jVar2.l(s1Var) | jVar2.i(iIntValue);
                    Object objG = jVar2.g();
                    if (zL || objG == c0321a) {
                        objG = new eh.a() { // from class: c9.v0
                            @Override // eh.a
                            public final Object invoke() {
                                s1Var.f5282n.f(iIntValue);
                                return pg.f0.f21461a;
                            }
                        };
                        jVar2.C(objG);
                    }
                    jVar2.B();
                    r0.c(iIntValue, 0, (eh.a) objG, jVar2, z10);
                }
                jVar2.B();
                p1.d.b(androidx.compose.foundation.layout.g.r(aVar, 6), jVar2);
                r0.p(s1Var, s1.D.size(), jVar2, 0);
                jVar2.B();
            } else {
                jVar2.L(-1302050096);
                jVar2.L(-2120210017);
                Iterator<T> it2 = s1.A.iterator();
                while (it2.hasNext()) {
                    final int iIntValue2 = ((Number) it2.next()).intValue();
                    boolean z11 = s1Var.f5281m.g() == iIntValue2;
                    jVar2.L(-618494083);
                    boolean zL2 = jVar2.l(s1Var) | jVar2.i(iIntValue2);
                    Object objG2 = jVar2.g();
                    if (zL2 || objG2 == c0321a) {
                        objG2 = new eh.a() { // from class: c9.w0
                            @Override // eh.a
                            public final Object invoke() {
                                s1Var.f5281m.f(iIntValue2);
                                return pg.f0.f21461a;
                            }
                        };
                        jVar2.C(objG2);
                    }
                    jVar2.B();
                    r0.c(iIntValue2, 0, (eh.a) objG2, jVar2, z11);
                }
                jVar2.B();
                if (tool.equals("pen")) {
                    p1.d.b(androidx.compose.foundation.layout.g.r(aVar, 6), jVar2);
                    r0.p(s1Var, s1.C.size(), jVar2, 0);
                }
                jVar2.B();
            }
        }
        jVar2.H();
        return pg.f0.f21461a;
    }
}
