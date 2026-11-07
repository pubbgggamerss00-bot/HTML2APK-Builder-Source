package y8;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.d;
import c9.u1;
import com.basitce.htmltoapk.R;
import f9.af;
import f9.ye;
import f9.ze;
import i2.e0;
import i2.g;
import j1.d;
import org.jf.dexlib2.dexbacked.raw.CdexHeaderItem;
import ph.v1;
import q1.y1;
import t0.e2;
import t0.f2;
import t0.ff;
import t0.nf;
import t0.of;
import t0.w9;
import x0.a2;
import x0.j;
import x0.n1;
import x0.s3;
import z.m1;

/* loaded from: classes.dex */
public final class u implements eh.q<z.r, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f34234a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n1<String> f34235b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n1<String> f34236c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n1<String> f34237d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n1<String> f34238e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n1<Boolean> f34239f;

    public u(boolean z10, n1<String> n1Var, n1<String> n1Var2, n1<String> n1Var3, n1<String> n1Var4, n1<Boolean> n1Var5) {
        this.f34234a = z10;
        this.f34235b = n1Var;
        this.f34236c = n1Var2;
        this.f34237d = n1Var3;
        this.f34238e = n1Var4;
        this.f34239f = n1Var5;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03b0  */
    @Override // eh.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pg.f0 b(z.r rVar, x0.j jVar, Integer num) {
        n1<String> n1Var;
        boolean z10;
        Object objG;
        n1<String> n1Var2;
        n1<String> n1Var3;
        x0.j jVar2;
        boolean z11;
        z.r Card = rVar;
        x0.j jVar3 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(Card, "$this$Card");
        if ((iIntValue & 17) == 16 && jVar3.s()) {
            jVar3.v();
        } else {
            d.a aVar = d.a.f1143b;
            androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.f.h(aVar, 16);
            float f10 = 12;
            z.q qVarA = z.o.a(z.b.h(f10), d.a.f14614m, jVar3, 6);
            int iD = jVar3.D();
            a2 a2VarY = jVar3.y();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarH, jVar3);
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
            g.a.b bVar = g.a.f13867f;
            v1.j(bVar, qVarA, jVar3);
            g.a.d dVar = g.a.f13866e;
            v1.j(dVar, a2VarY, jVar3);
            g.a.C0128a c0128a = g.a.f13868g;
            if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD))) {
                l9.i.a(iD, jVar3, iD, c0128a);
            }
            g.a.c cVar = g.a.f13865d;
            v1.j(cVar, dVarC, jVar3);
            n1<String> n1Var4 = this.f34235b;
            String value = n1Var4.getValue();
            androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(aVar, 1.0f);
            n1<String> n1Var5 = this.f34236c;
            boolean z12 = n1Var5.getValue() != null && mh.x.A(n1Var4.getValue());
            jVar3.L(-120343336);
            Object objG2 = jVar3.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (objG2 == c0321a) {
                objG2 = new ye(1, n1Var4, n1Var5);
                jVar3.C(objG2);
            }
            jVar3.B();
            w9.a(value, (eh.l) objG2, dVarD, false, false, null, a.B, null, null, null, null, null, z12, null, null, null, false, 0, 0, null, null, jVar3, 1573296, 0, 8380344);
            n1<String> n1Var6 = this.f34237d;
            String value2 = n1Var6.getValue();
            androidx.compose.ui.d dVarD2 = androidx.compose.foundation.layout.g.d(aVar, 1.0f);
            boolean z13 = n1Var5.getValue() != null && mh.x.A(n1Var6.getValue());
            jVar3.L(-120331973);
            Object objG3 = jVar3.g();
            if (objG3 == c0321a) {
                n1Var = n1Var5;
                objG3 = new ze(1, n1Var6, n1Var);
                jVar3.C(objG3);
            } else {
                n1Var = n1Var5;
            }
            jVar3.B();
            n1<String> n1Var7 = n1Var;
            w9.a(value2, (eh.l) objG3, dVarD2, false, false, null, a.C, null, null, null, null, null, z13, null, null, null, false, 0, 0, null, null, jVar3, 1573296, 0, 8380344);
            n1<String> n1Var8 = this.f34238e;
            String value3 = n1Var8.getValue();
            androidx.compose.ui.d dVarD3 = androidx.compose.foundation.layout.g.d(aVar, 1.0f);
            if (n1Var7.getValue() == null) {
                z10 = false;
                jVar3.L(-120320325);
                objG = jVar3.g();
                if (objG != c0321a) {
                    n1Var2 = n1Var7;
                    objG = new af(1, n1Var8, n1Var2);
                    jVar3.C(objG);
                } else {
                    n1Var2 = n1Var7;
                }
                jVar3.B();
                n1Var3 = n1Var2;
                w9.a(value3, (eh.l) objG, dVarD3, false, false, null, a.D, null, null, null, null, null, z10, null, null, null, false, 0, 0, null, null, jVar3, 1573296, 0, 8380344);
                x0.j jVar4 = jVar3;
                jVar4.L(-120307488);
                if (this.f34234a) {
                    androidx.compose.ui.d dVarD4 = e1.d.d(androidx.compose.foundation.layout.g.d(aVar, 1.0f), h0.f.a(f10));
                    s3 s3Var = f2.f25858a;
                    androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.f.i(androidx.compose.foundation.a.b(dVarD4, q1.b1.c(0.5f, ((e2) jVar4.f(s3Var)).f25772r), y1.f21750a), f10, 8);
                    m1 m1VarA = z.k1.a(z.b.h(f10), d.a.f14612k, jVar4, 54);
                    int iD2 = jVar4.D();
                    a2 a2VarY2 = jVar4.y();
                    androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarI, jVar4);
                    if (jVar4.t() == null) {
                        u1.d();
                        throw null;
                    }
                    jVar4.r();
                    if (jVar4.m()) {
                        jVar4.w(aVar2);
                    } else {
                        jVar4.z();
                    }
                    v1.j(bVar, m1VarA, jVar4);
                    v1.j(dVar, a2VarY2, jVar4);
                    if (jVar4.m() || !kotlin.jvm.internal.r.a(jVar4.g(), Integer.valueOf(iD2))) {
                        l9.i.a(iD2, jVar4, iD2, c0128a);
                    }
                    v1.j(cVar, dVarC2, jVar4);
                    n1<Boolean> n1Var9 = this.f34239f;
                    boolean zBooleanValue = n1Var9.getValue().booleanValue();
                    jVar4.L(1065588651);
                    Object objG4 = jVar4.g();
                    if (objG4 == c0321a) {
                        objG4 = new h9.t(n1Var9, 2);
                        jVar4.C(objG4);
                    }
                    jVar4.B();
                    androidx.compose.material3.a.a(zBooleanValue, (eh.l) objG4, null, false, null, jVar4, 48, CdexHeaderItem.DEBUG_INFO_BASE);
                    String strC = f3.q.c(R.string.keystore_persist_switch, jVar4);
                    t2.l0 l0Var = ((nf) jVar4.f(of.f26647a)).f26548k;
                    long j10 = ((e2) jVar4.f(s3Var)).f25771q;
                    if (!(((double) 1.0f) > 0.0d)) {
                        a0.a.a("invalid weight; must be greater than zero");
                    }
                    ff.b(strC, new LayoutWeightElement(1.0f, true), j10, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, l0Var, jVar4, 0, 0, 65528);
                    jVar4 = jVar4;
                    jVar4.H();
                }
                jVar4.B();
                jVar4.L(-120272834);
                if (n1Var3.getValue() == null) {
                    String value4 = n1Var3.getValue();
                    kotlin.jvm.internal.r.b(value4);
                    x0.j jVar5 = jVar4;
                    ff.b(value4, null, ((e2) jVar4.f(f2.f25858a)).f25777w, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar4.f(of.f26647a)).f26549l, jVar5, 0, 0, 65530);
                    jVar2 = jVar5;
                } else {
                    jVar2 = jVar4;
                }
                jVar2.B();
                jVar2.H();
            } else {
                Integer numG = mh.s.g(n1Var8.getValue());
                if (numG != null) {
                    int iIntValue2 = numG.intValue();
                    z11 = !(1 <= iIntValue2 && iIntValue2 < 101);
                } else {
                    z11 = true;
                }
                if (z11) {
                    z10 = true;
                }
                jVar3.L(-120320325);
                objG = jVar3.g();
                if (objG != c0321a) {
                }
                jVar3.B();
                n1Var3 = n1Var2;
                w9.a(value3, (eh.l) objG, dVarD3, false, false, null, a.D, null, null, null, null, null, z10, null, null, null, false, 0, 0, null, null, jVar3, 1573296, 0, 8380344);
                x0.j jVar42 = jVar3;
                jVar42.L(-120307488);
                if (this.f34234a) {
                }
                jVar42.B();
                jVar42.L(-120272834);
                if (n1Var3.getValue() == null) {
                }
                jVar2.B();
                jVar2.H();
            }
        }
        return pg.f0.f21461a;
    }
}
