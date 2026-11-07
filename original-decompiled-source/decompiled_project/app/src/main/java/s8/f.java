package s8;

import android.view.View;
import androidx.compose.ui.d;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import q8.t2;
import t0.f2;
import t0.s8;
import x0.j;
import z.x1;

/* loaded from: classes.dex */
public final class f implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p5.s0 f24657a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f24658b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f24659c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f24660d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f24661e;

    public f(p5.s0 s0Var, boolean z10, long j10, float f10, boolean z11) {
        this.f24657a = s0Var;
        this.f24658b = z10;
        this.f24659c = j10;
        this.f24660d = f10;
        this.f24661e = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        List<pg.t<e2, w1.d, w1.d>> list;
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            p5.s0 s0Var = this.f24657a;
            p5.s sVar = (p5.s) bg.b.a(new sh.k0(s0Var.f21304b.f24504z), null, null, jVar2, 48, 2).getValue();
            p5.k0 k0Var = sVar != null ? sVar.f21269b : null;
            if (!this.f24658b && ((list = b2.f24610a) == null || !list.isEmpty())) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((e2) ((pg.t) it.next()).f21479a).f24627a.equals(k0Var != null ? k0Var.f21235b.f24512e : null)) {
                        d.a aVar = d.a.f1143b;
                        androidx.compose.ui.d dVarA = q8.b1.a(androidx.compose.foundation.layout.g.d(aVar, 1.0f), this.f24659c, this.f24660d, 12);
                        WeakHashMap<View, z.x1> weakHashMap = z.x1.f34666v;
                        float f10 = 32;
                        float f11 = 16;
                        androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.f.i(z.y1.a(dVarA, x1.a.c(jVar2).f34671e), f10, f11);
                        g2.l0 l0VarD = z.g.d(d.a.f14606e, false);
                        int iD = jVar2.D();
                        x0.a2 a2VarY = jVar2.y();
                        androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarI, jVar2);
                        i2.g.f13861o.getClass();
                        e0.a aVar2 = g.a.f13863b;
                        if (jVar2.t() == null) {
                            c9.u1.d();
                            throw null;
                        }
                        jVar2.r();
                        if (jVar2.m()) {
                            jVar2.w(aVar2);
                        } else {
                            jVar2.z();
                        }
                        ph.v1.j(g.a.f13867f, l0VarD, jVar2);
                        ph.v1.j(g.a.f13866e, a2VarY, jVar2);
                        g.a.C0128a c0128a = g.a.f13868g;
                        if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                            l9.i.a(iD, jVar2, iD, c0128a);
                        }
                        ph.v1.j(g.a.f13865d, dVarC, jVar2);
                        s8.a(e1.d.d(n1.q.a(androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(aVar, 1.0f), 64), f11, h0.f.a(f10)), h0.f.a(f10)), q1.b1.c(0.95f, ((t0.e2) jVar2.f(f2.f25858a)).f25770p), 0L, 0, null, f1.c.b(-91146261, new e(k0Var, s0Var), jVar2), jVar2, 199680);
                        jVar2.L(-984222538);
                        if (this.f24661e) {
                            androidx.compose.ui.d dVarC2 = androidx.compose.foundation.layout.e.c(androidx.compose.foundation.layout.b.f961a.b(androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(aVar, 1.0f), 46), d.a.f14602a), CropImageView.DEFAULT_ASPECT_RATIO, -38, 1);
                            jVar2.L(-984210225);
                            boolean zL = jVar2.l(s0Var);
                            Object objG = jVar2.g();
                            if (zL || objG == j.a.f31715a) {
                                objG = new j9.w0(s0Var, 2);
                                jVar2.C(objG);
                            }
                            jVar2.B();
                            t2.b(dVarC2, false, (eh.a) objG, jVar2, 0, 14);
                        }
                        jVar2.B();
                        jVar2.H();
                    }
                }
            }
        }
        return pg.f0.f21461a;
    }
}
