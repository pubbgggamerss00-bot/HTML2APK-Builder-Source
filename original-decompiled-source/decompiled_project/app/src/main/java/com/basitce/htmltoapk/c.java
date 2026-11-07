package com.basitce.htmltoapk;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.g;
import androidx.compose.ui.d;
import c9.u1;
import com.yalantis.ucrop.view.CropImageView;
import d0.h;
import eh.l;
import eh.p;
import g2.l0;
import i2.e0;
import i2.g;
import j1.d;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.r;
import l9.i;
import pg.f0;
import pg.n;
import ph.v1;
import q8.p2;
import qg.x;
import sh.z0;
import t0.e2;
import t0.f2;
import t0.md;
import t0.tc;
import t0.uc;
import t8.s0;
import x0.a2;
import x0.j;
import x0.n1;
import x0.r3;

/* loaded from: classes.dex */
public final class c implements p<j, Integer, f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainActivity f5663a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r3<Boolean> f5664b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r3<Boolean> f5665c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r3<Integer> f5666d;

    public c(MainActivity mainActivity, n1 n1Var, n1 n1Var2, n1 n1Var3) {
        this.f5663a = mainActivity;
        this.f5664b = n1Var;
        this.f5665c = n1Var2;
        this.f5666d = n1Var3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.p
    public final f0 invoke(j jVar, Integer num) {
        j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            jVar2.L(-1480708243);
            Object objG = jVar2.g();
            Object obj = j.a.f31715a;
            if (objG == obj) {
                objG = new uc();
                jVar2.C(objG);
            }
            uc hostState = (uc) objG;
            jVar2.B();
            uc ucVar = p2.f22362a;
            r.e(hostState, "hostState");
            p2.f22362a = hostState;
            FillElement fillElement = g.f976c;
            l0 l0VarD = z.g.d(d.a.f14602a, false);
            int iD = jVar2.D();
            a2 a2VarY = jVar2.y();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(fillElement, jVar2);
            i2.g.f13861o.getClass();
            e0.a aVar = g.a.f13863b;
            if (jVar2.t() == null) {
                u1.d();
                throw null;
            }
            jVar2.r();
            if (jVar2.m()) {
                jVar2.w(aVar);
            } else {
                jVar2.z();
            }
            v1.j(g.a.f13867f, l0VarD, jVar2);
            v1.j(g.a.f13866e, a2VarY, jVar2);
            g.a.C0128a c0128a = g.a.f13868g;
            if (jVar2.m() || !r.a(jVar2.g(), Integer.valueOf(iD))) {
                i.a(iD, jVar2, iD, c0128a);
            }
            v1.j(g.a.f13865d, dVarC, jVar2);
            long j10 = ((e2) jVar2.f(f2.f25858a)).f25768n;
            r3<Boolean> r3Var = this.f5664b;
            r3<Boolean> r3Var2 = this.f5665c;
            MainActivity mainActivity = this.f5663a;
            md.a(fillElement, null, j10, 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, f1.c.b(587749369, new b(r3Var, r3Var2, mainActivity, this.f5666d), jVar2), jVar2, 12582918, 122);
            final h8.a backgroundAi = mainActivity.getBackgroundAi();
            jVar2.L(-2037880515);
            if (backgroundAi != null) {
                n nVar = (n) x.D((List) bg.b.b(backgroundAi.f12350i, jVar2).getValue());
                jVar2.L(-2037876507);
                if (nVar != null) {
                    final long jLongValue = ((Number) nVar.f21469a).longValue();
                    h8.j jVar3 = (h8.j) nVar.f21470b;
                    jVar2.q(769047545, Long.valueOf(jLongValue));
                    jVar2.L(769050801);
                    boolean zL = jVar2.l(backgroundAi) | jVar2.j(jLongValue);
                    Object objG2 = jVar2.g();
                    if (zL || objG2 == obj) {
                        objG2 = new l() { // from class: f8.o
                            @Override // eh.l
                            public final Object invoke(Object obj2) {
                                Bitmap it = (Bitmap) obj2;
                                kotlin.jvm.internal.r.e(it, "it");
                                h8.a aVar2 = backgroundAi;
                                SharedPreferences.Editor editorEdit = aVar2.f12346e.edit();
                                long j11 = jLongValue;
                                editorEdit.remove(String.valueOf(j11)).commit();
                                z0 z0Var = aVar2.f12349h;
                                ArrayList arrayListE = aVar2.e();
                                z0Var.getClass();
                                z0Var.j(null, arrayListE);
                                ph.h.c(aVar2.f12347f, null, null, new h8.d(aVar2, j11, it, null), 3);
                                return f0.f21461a;
                            }
                        };
                        jVar2.C(objG2);
                    }
                    jVar2.B();
                    s0.a(jVar3, (l) objG2, jVar2, 0);
                    jVar2.F();
                    f0 f0Var = f0.f21461a;
                }
                jVar2.B();
            }
            jVar2.B();
            tc.b(hostState, h.f(androidx.compose.foundation.layout.b.f961a.b(d.a.f1143b, d.a.f14609h)), null, jVar2, 6);
            jVar2.H();
        }
        return f0.f21461a;
    }
}
