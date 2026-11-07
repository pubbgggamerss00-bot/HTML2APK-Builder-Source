package j9;

import android.view.View;
import androidx.compose.foundation.layout.FillElement;
import j2.j2;
import j9.x1;
import java.util.List;
import java.util.WeakHashMap;
import t0.e2;
import t0.f2;
import x0.j;
import x0.r3;
import z.b;
import z.x1;

/* loaded from: classes.dex */
public final class u1 implements eh.q<z.n, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f15551a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r3<List<x1.a>> f15552b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q8.d0 f15553c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f15554d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p5.x f15555e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x1 f15556f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r3<Boolean> f15557g;

    public u1(float f10, long j10, x1 x1Var, p5.x xVar, q8.d0 d0Var, r3 r3Var, r3 r3Var2) {
        this.f15551a = f10;
        this.f15552b = r3Var;
        this.f15553c = d0Var;
        this.f15554d = j10;
        this.f15555e = xVar;
        this.f15556f = x1Var;
        this.f15557g = r3Var2;
    }

    @Override // eh.q
    public final pg.f0 b(z.n nVar, x0.j jVar, Integer num) {
        z.n BoxWithConstraints = nVar;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((iIntValue & 6) == 0) {
            iIntValue |= jVar2.K(BoxWithConstraints) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && jVar2.s()) {
            jVar2.v();
        } else {
            f3.d dVar = (f3.d) jVar2.f(j2.f14779h);
            jVar2.L(772812439);
            WeakHashMap<View, z.x1> weakHashMap = z.x1.f34666v;
            float fU = dVar.u(x1.a.c(jVar2).f34672f.e().f23164b);
            jVar2.B();
            float f10 = 24;
            float fN0 = dVar.N0(fU + f10);
            float fD = BoxWithConstraints.d();
            float f11 = this.f15551a;
            final float f12 = ((fD - f11) - fU) * 0.5f;
            FillElement fillElement = androidx.compose.foundation.layout.g.f976c;
            z.g1 g1VarD = androidx.compose.foundation.layout.f.d(fU, f10 + f11, 5);
            b.i iVarH = z.b.h(12);
            jVar2.L(772831516);
            boolean zH = jVar2.h(f12) | jVar2.K(this.f15552b) | jVar2.K(this.f15553c) | jVar2.j(this.f15554d) | jVar2.l(this.f15555e);
            final x1 x1Var = this.f15556f;
            boolean zL = zH | jVar2.l(x1Var) | jVar2.K(this.f15557g);
            Object objG = jVar2.g();
            if (zL || objG == j.a.f31715a) {
                final long j10 = this.f15554d;
                final p5.x xVar = this.f15555e;
                final q8.d0 d0Var = this.f15553c;
                final r3<List<x1.a>> r3Var = this.f15552b;
                final r3<Boolean> r3Var2 = this.f15557g;
                eh.l lVar = new eh.l() { // from class: j9.j1
                    @Override // eh.l
                    public final Object invoke(Object obj) {
                        b0.j0 LazyColumn = (b0.j0) obj;
                        kotlin.jvm.internal.r.e(LazyColumn, "$this$LazyColumn");
                        float f13 = f12;
                        q8.d0 d0Var2 = d0Var;
                        long j11 = j10;
                        p5.x xVar2 = xVar;
                        b0.j0.b(LazyColumn, "showcase", new f1.b(-1963407706, true, new n1(f13, d0Var2, j11, xVar2, r3Var)), 2);
                        b0.j0.b(LazyColumn, "native_heading", f.f15360a, 2);
                        x1 x1Var2 = x1Var;
                        List<String> list = x1Var2.f15633p;
                        LazyColumn.d(list.size(), new r1(new k1(0), list), new s1(q1.f15502a, list), new f1.b(-632812321, true, new t1(list, x1Var2, d0Var2, j11, xVar2, r3Var2)));
                        b0.j0.b(LazyColumn, null, f.f15361b, 3);
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(lVar);
                objG = lVar;
            }
            jVar2.B();
            b0.d.a(fillElement, null, g1VarD, iVarH, null, null, false, null, (eh.l) objG, jVar2, 24582, 490);
            z.g.a(q8.b1.a(BoxWithConstraints.e(), ((e2) jVar2.f(f2.f25858a)).f25768n, fN0, 8), jVar2, 0);
        }
        return pg.f0.f21461a;
    }
}
