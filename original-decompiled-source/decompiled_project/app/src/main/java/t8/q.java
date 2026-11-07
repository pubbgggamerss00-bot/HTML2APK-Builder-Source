package t8;

import androidx.compose.ui.d;
import com.basitce.htmltoapk.R;
import com.yalantis.ucrop.view.CropImageView;
import g8.s;
import i2.e0;
import i2.g;
import j1.d;
import j1.f;
import java.util.ArrayList;
import t0.cf;
import t0.df;
import t0.ff;
import t0.k4;
import t0.k9;
import t0.nf;
import t0.of;
import t0.s4;
import t0.w9;
import x0.j;
import z.b;

/* loaded from: classes.dex */
public final class q implements eh.q<z.f1, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Long f28390a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f28391b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f28392c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f28393d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f28394e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f28395f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f28396g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ eh.p<String, String, pg.f0> f28397h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ x0.n1<String> f28398j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f28399k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x0.r3<Boolean> f28400l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String[] f28401m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ x0.r3<g8.x> f28402n;

    public q(Long l10, eh.a aVar, x0.n1 n1Var, boolean z10, boolean z11, boolean z12, x0.n1 n1Var2, eh.p pVar, x0.n1 n1Var3, x0.n1 n1Var4, x0.n1 n1Var5, String[] strArr, x0.n1 n1Var6) {
        this.f28390a = l10;
        this.f28391b = aVar;
        this.f28392c = n1Var;
        this.f28393d = z10;
        this.f28394e = z11;
        this.f28395f = z12;
        this.f28396g = n1Var2;
        this.f28397h = pVar;
        this.f28398j = n1Var3;
        this.f28399k = n1Var4;
        this.f28400l = n1Var5;
        this.f28401m = strArr;
        this.f28402n = n1Var6;
    }

    /* JADX WARN: Removed duplicated region for block: B:208:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0823  */
    @Override // eh.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pg.f0 b(z.f1 f1Var, x0.j jVar, Integer num) {
        x0.n1 n1Var;
        g.a.b bVar;
        float f10;
        float f11;
        g.a.c cVar;
        boolean z10;
        f.a aVar;
        g.a.d dVar;
        d.a aVar2;
        eh.a<pg.f0> aVar3;
        j.a.C0321a c0321a;
        e0.a aVar4;
        x0.n1<Boolean> n1Var2;
        g.a.C0128a c0128a;
        b.k kVar;
        g.a.C0128a c0128a2;
        long j10;
        long j11;
        j.a.C0321a c0321a2;
        final String[] strArr;
        boolean zL;
        Object objG;
        String strD;
        x0.s3 s3Var;
        long j12;
        x0.j jVar2;
        boolean z11;
        z.f1 padding = f1Var;
        x0.j jVar3 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(padding, "padding");
        if ((iIntValue & 6) == 0) {
            iIntValue |= jVar3.K(padding) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && jVar3.s()) {
            jVar3.v();
        } else {
            float f12 = 20;
            androidx.compose.ui.d dVarJ = androidx.compose.foundation.layout.f.j(ph.m0.e(d0.h.e(androidx.compose.foundation.layout.f.g(androidx.compose.foundation.layout.g.f976c, padding)), ph.m0.c(jVar3), true), f12, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            b.k kVar2 = z.b.f34446c;
            f.a aVar5 = d.a.f14615n;
            z.q qVarA = z.o.a(kVar2, aVar5, jVar3, 48);
            int iD = jVar3.D();
            x0.a2 a2VarY = jVar3.y();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarJ, jVar3);
            i2.g.f13861o.getClass();
            e0.a aVar6 = g.a.f13863b;
            if (jVar3.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar3.r();
            if (jVar3.m()) {
                jVar3.w(aVar6);
            } else {
                jVar3.z();
            }
            g.a.b bVar2 = g.a.f13867f;
            ph.v1.j(bVar2, qVarA, jVar3);
            g.a.d dVar2 = g.a.f13866e;
            ph.v1.j(dVar2, a2VarY, jVar3);
            g.a.C0128a c0128a3 = g.a.f13868g;
            if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD))) {
                l9.i.a(iD, jVar3, iD, c0128a3);
            }
            g.a.c cVar2 = g.a.f13865d;
            ph.v1.j(cVar2, dVarC, jVar3);
            d.a aVar7 = d.a.f1143b;
            androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(androidx.compose.foundation.layout.g.s(aVar7, CropImageView.DEFAULT_ASPECT_RATIO, 560, 1), 1.0f);
            float f13 = 16;
            z.q qVarA2 = z.o.a(z.b.h(f13), d.a.f14614m, jVar3, 6);
            int iD2 = jVar3.D();
            x0.a2 a2VarY2 = jVar3.y();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarD, jVar3);
            if (jVar3.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar3.r();
            if (jVar3.m()) {
                jVar3.w(aVar6);
            } else {
                jVar3.z();
            }
            ph.v1.j(bVar2, qVarA2, jVar3);
            ph.v1.j(dVar2, a2VarY2, jVar3);
            if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD2))) {
                l9.i.a(iD2, jVar3, iD2, c0128a3);
            }
            ph.v1.j(cVar2, dVarC2, jVar3);
            p1.d.b(androidx.compose.foundation.layout.g.f(aVar7, 4), jVar3);
            x0.n1 n1Var3 = this.f28399k;
            g8.s sVar = (g8.s) n1Var3.getValue();
            boolean z12 = sVar instanceof s.a;
            j.a.C0321a c0321a3 = j.a.f31715a;
            eh.a<pg.f0> aVar8 = this.f28391b;
            x0.n1<Boolean> n1Var4 = this.f28392c;
            if (z12) {
                jVar3.L(-161068886);
                w.c(this.f28390a, aVar8, jVar3, 0);
                jVar3.B();
                n1Var = n1Var3;
                f11 = f12;
                z10 = false;
                cVar = cVar2;
                aVar3 = aVar8;
                n1Var2 = n1Var4;
                aVar = aVar5;
                aVar2 = aVar7;
                dVar = dVar2;
                c0321a = c0321a3;
                c0128a = c0128a3;
                aVar4 = aVar6;
                bVar = bVar2;
                f10 = f13;
                kVar = kVar2;
            } else if (kotlin.jvm.internal.r.a(sVar, s.b.f11628a)) {
                jVar3.L(-161066142);
                boolean zBooleanValue = this.f28400l.getValue().booleanValue();
                jVar3.L(-161064903);
                boolean zK = jVar3.K(n1Var4);
                n1Var = n1Var3;
                Object objG2 = jVar3.g();
                if (zK || objG2 == c0321a3) {
                    objG2 = new g7.b(n1Var4, 2);
                    jVar3.C(objG2);
                }
                jVar3.B();
                w.d(zBooleanValue, (eh.a) objG2, jVar3, 0);
                jVar3.B();
                z10 = false;
                cVar = cVar2;
                aVar3 = aVar8;
                n1Var2 = n1Var4;
                aVar = aVar5;
                aVar2 = aVar7;
                dVar = dVar2;
                c0321a = c0321a3;
                c0128a = c0128a3;
                aVar4 = aVar6;
                bVar = bVar2;
                f10 = f13;
                kVar = kVar2;
                f11 = f12;
            } else {
                n1Var = n1Var3;
                if (!kotlin.jvm.internal.r.a(sVar, s.c.f11629a)) {
                    jVar3.L(-161070493);
                    jVar3.B();
                    throw new pg.l();
                }
                jVar3.L(-697967722);
                bVar = bVar2;
                f10 = f13;
                f11 = f12;
                cVar = cVar2;
                z10 = false;
                aVar = aVar5;
                dVar = dVar2;
                aVar2 = aVar7;
                aVar3 = aVar8;
                c0321a = c0321a3;
                aVar4 = aVar6;
                n1Var2 = n1Var4;
                c0128a = c0128a3;
                kVar = kVar2;
                ff.b(f3.q.c(R.string.ai_create_unavailable, jVar3), null, ((t0.e2) jVar3.f(t0.f2.f25858a)).f25777w, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar3.f(of.f26647a)).f26548k, jVar3, 0, 0, 65530);
                jVar3 = jVar3;
                jVar3.B();
            }
            String strC = f3.q.c(R.string.ai_create_heading, jVar3);
            x0.s3 s3Var2 = of.f26647a;
            t2.l0 l0Var = ((nf) jVar3.f(s3Var2)).f26544g;
            x2.p pVar = x2.p.f32033f;
            x0.s3 s3Var3 = t0.f2.f25858a;
            x0.j jVar4 = jVar3;
            ff.b(strC, null, ((t0.e2) jVar3.f(s3Var3)).f25769o, 0L, pVar, null, 0L, null, 0L, 0, false, 0, 0, l0Var, jVar4, 196608, 0, 65498);
            g2.l0 l0VarD = z.g.d(d.a.f14602a, z10);
            int iD3 = jVar4.D();
            x0.a2 a2VarY3 = jVar4.y();
            d.a aVar9 = aVar2;
            androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(aVar9, jVar4);
            if (jVar4.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar4.r();
            if (jVar4.m()) {
                jVar4.w(aVar4);
            } else {
                jVar4.z();
            }
            g.a.b bVar3 = bVar;
            ph.v1.j(bVar3, l0VarD, jVar4);
            g.a.d dVar3 = dVar;
            ph.v1.j(dVar3, a2VarY3, jVar4);
            if (jVar4.m() || !kotlin.jvm.internal.r.a(jVar4.g(), Integer.valueOf(iD3))) {
                c0128a2 = c0128a;
                l9.i.a(iD3, jVar4, iD3, c0128a2);
            } else {
                c0128a2 = c0128a;
            }
            g.a.c cVar3 = cVar;
            ph.v1.j(cVar3, dVarC3, jVar4);
            final x0.n1<String> n1Var5 = this.f28398j;
            String value = n1Var5.getValue();
            androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.g.h(androidx.compose.foundation.layout.g.d(aVar9, 1.0f), 220, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            h0.e eVarA = h0.f.a(f11);
            k9 k9Var = k9.f26240a;
            long j13 = k9.d.f16192n;
            long j14 = ((t0.e2) jVar4.f(s3Var3)).f25770p;
            long j15 = ((t0.e2) jVar4.f(s3Var3)).f25770p;
            long j16 = q1.b1.f21654h;
            df dfVarD = k9.d((t0.e2) jVar4.f(s3Var3), jVar4);
            if (j16 != 16) {
                j10 = j15;
                j11 = j16;
            } else {
                j10 = j15;
                j11 = dfVarD.f25705a;
            }
            long j17 = j16 != 16 ? j16 : dfVarD.f25706b;
            long j18 = j16 != 16 ? j16 : dfVarD.f25707c;
            long j19 = j16 != 16 ? j16 : dfVarD.f25708d;
            if (j14 == 16) {
                j14 = dfVarD.f25709e;
            }
            long j20 = j14;
            long j21 = j10 != 16 ? j10 : dfVarD.f25710f;
            long j22 = j16 != 16 ? j16 : dfVarD.f25711g;
            long j23 = j16 != 16 ? j16 : dfVarD.f25712h;
            long j24 = j13 != 16 ? j13 : dfVarD.f25713i;
            long j25 = j16 != 16 ? j16 : dfVarD.f25714j;
            new cf(dfVarD);
            df dfVar = new df(j11, j17, j18, j19, j20, j21, j22, j23, j24, j25, dfVarD.f25715k, j13 != 16 ? j13 : dfVarD.f25716l, j16 != 16 ? j16 : dfVarD.f25717m, j16 != 16 ? j16 : dfVarD.f25718n, j16 != 16 ? j16 : dfVarD.f25719o, j16 != 16 ? j16 : dfVarD.f25720p, j16 != 16 ? j16 : dfVarD.f25721q, j16 != 16 ? j16 : dfVarD.f25722r, j16 != 16 ? j16 : dfVarD.f25723s, j16 != 16 ? j16 : dfVarD.f25724t, j16 != 16 ? j16 : dfVarD.f25725u, j16 != 16 ? j16 : dfVarD.f25726v, j16 != 16 ? j16 : dfVarD.f25727w, j16 != 16 ? j16 : dfVarD.f25728x, j16 != 16 ? j16 : dfVarD.f25729y, j16 != 16 ? j16 : dfVarD.f25730z, j16 != 16 ? j16 : dfVarD.A, j16 != 16 ? j16 : dfVarD.B, j16 != 16 ? j16 : dfVarD.C, j16 != 16 ? j16 : dfVarD.D, j16 != 16 ? j16 : dfVarD.E, j16 != 16 ? j16 : dfVarD.F, j16 != 16 ? j16 : dfVarD.G, j16 != 16 ? j16 : dfVarD.H, j16 != 16 ? j16 : dfVarD.I, j16 != 16 ? j16 : dfVarD.J, j16 != 16 ? j16 : dfVarD.K, j16 != 16 ? j16 : dfVarD.L, j16 != 16 ? j16 : dfVarD.M, j16 != 16 ? j16 : dfVarD.N, j16 != 16 ? j16 : dfVarD.O, j16 != 16 ? j16 : dfVarD.P, j16 != 16 ? j16 : dfVarD.Q);
            jVar4.L(268419594);
            boolean zK2 = jVar4.K(n1Var5);
            Object objG3 = jVar4.g();
            if (zK2) {
                c0321a2 = c0321a;
            } else {
                c0321a2 = c0321a;
                if (objG3 == c0321a2) {
                }
                jVar4.B();
                e0.a aVar10 = aVar4;
                g.a.C0128a c0128a4 = c0128a2;
                j.a.C0321a c0321a4 = c0321a2;
                w9.a(value, (eh.l) objG3, dVarH, false, false, null, null, a4.f28090c, null, null, null, f1.c.b(-174883517, new o(n1Var5), jVar4), false, null, null, null, false, 0, 8, eVarA, dfVar, jVar4, 12583296, 805306752, 1568632);
                jVar4.L(268458998);
                boolean zK3 = jVar4.K(n1Var5);
                strArr = this.f28401m;
                zL = zK3 | jVar4.l(strArr);
                objG = jVar4.g();
                if (!zL || objG == c0321a4) {
                    objG = new eh.a() { // from class: t8.m
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // eh.a
                        public final Object invoke() {
                            ArrayList arrayList = new ArrayList();
                            String[] strArr2 = strArr;
                            int length = strArr2.length;
                            int i10 = 0;
                            while (true) {
                                x0.n1 n1Var6 = n1Var5;
                                if (i10 >= length) {
                                    String str = (String) qg.x.Q(arrayList, hh.c.f13027a);
                                    int i11 = w.f28523b;
                                    n1Var6.setValue(str);
                                    return pg.f0.f21461a;
                                }
                                String str2 = strArr2[i10];
                                int i12 = w.f28523b;
                                if (!kotlin.jvm.internal.r.a(str2, (String) n1Var6.getValue())) {
                                    arrayList.add(str2);
                                }
                                i10++;
                            }
                        }
                    };
                    jVar4.C(objG);
                }
                jVar4.B();
                s4.b((eh.a) objG, androidx.compose.foundation.layout.g.n(androidx.compose.foundation.layout.f.l(androidx.compose.foundation.layout.b.f961a.b(aVar9, d.a.f14610i), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 10, 34, 3), 48), false, null, k4.b(q1.b1.c(0.18f, j13), j13, jVar4, 0), a4.f28091d, jVar4, 1572864, 44);
                jVar4.H();
                androidx.compose.ui.d dVarD2 = androidx.compose.foundation.layout.g.d(aVar9, 1.0f);
                z.q qVarA3 = z.o.a(kVar, aVar, jVar4, 48);
                int iD4 = jVar4.D();
                x0.a2 a2VarY4 = jVar4.y();
                androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(dVarD2, jVar4);
                if (jVar4.t() != null) {
                    c9.u1.d();
                    throw null;
                }
                jVar4.r();
                if (jVar4.m()) {
                    jVar4.w(aVar10);
                } else {
                    jVar4.z();
                }
                ph.v1.j(bVar3, qVarA3, jVar4);
                ph.v1.j(dVar3, a2VarY4, jVar4);
                if (jVar4.m() || !kotlin.jvm.internal.r.a(jVar4.g(), Integer.valueOf(iD4))) {
                    l9.i.a(iD4, jVar4, iD4, c0128a4);
                }
                ph.v1.j(cVar3, dVarC4, jVar4);
                final boolean z13 = this.f28393d;
                final boolean z14 = this.f28395f;
                if (z13) {
                    strD = com.google.crypto.tink.shaded.protobuf.t0.b(jVar4, 268484529, R.string.ai_create_low_balance, jVar4);
                } else if (z14) {
                    strD = com.google.crypto.tink.shaded.protobuf.t0.b(jVar4, 268487280, R.string.ai_create_free_first, jVar4);
                } else {
                    jVar4.L(268489925);
                    strD = f3.q.d(R.string.ai_create_estimate, new Object[]{Integer.valueOf(this.f28402n.getValue().f11647a)}, jVar4);
                    jVar4.B();
                }
                t2.l0 l0Var2 = ((nf) jVar4.f(s3Var2)).f26546i;
                if (z13) {
                    jVar4.L(268499176);
                    s3Var = s3Var3;
                    j12 = ((t0.e2) jVar4.f(s3Var)).f25777w;
                } else {
                    s3Var = s3Var3;
                    jVar4.L(268500367);
                    j12 = ((t0.e2) jVar4.f(s3Var)).f25769o;
                }
                jVar4.B();
                x0.s3 s3Var4 = s3Var;
                ff.b(strD, null, j12, 0L, pVar, null, 0L, null, 0L, 0, false, 0, 0, l0Var2, jVar4, 196608, 0, 65498);
                jVar4.L(268502429);
                if (z13) {
                    jVar2 = jVar4;
                } else {
                    String strC2 = f3.q.c(z14 ? R.string.ai_create_free_first_note : R.string.ai_create_estimate_note, jVar4);
                    t2.l0 l0Var3 = ((nf) jVar4.f(s3Var2)).f26549l;
                    long j26 = ((t0.e2) jVar4.f(s3Var4)).f25773s;
                    jVar2 = jVar4;
                    ff.b(strC2, null, j26, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, l0Var3, jVar2, 0, 0, 65530);
                }
                jVar2.B();
                jVar2.H();
                boolean z15 = ((g8.s) n1Var.getValue()) instanceof s.c;
                final boolean z16 = this.f28394e;
                boolean z17 = (z15 || (!z13 && z16 && mh.x.A(n1Var5.getValue()))) ? false : true;
                androidx.compose.ui.d dVarF = androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(aVar9, 1.0f), 56);
                h0.e eVarA2 = h0.f.a(f10);
                z.g1 g1Var = t0.m0.f26400a;
                x0.j jVar5 = jVar2;
                t0.l0 l0VarA = t0.m0.a(j13, w.f28522a, 0L, jVar5, 12);
                jVar5.L(-160945626);
                final x0.n1<Boolean> n1Var6 = n1Var2;
                final eh.a<pg.f0> aVar11 = aVar3;
                boolean zC = jVar5.c(z16) | jVar5.K(n1Var6) | jVar5.c(z13) | jVar5.K(aVar11) | jVar5.c(z14);
                final x0.n1<Boolean> n1Var7 = this.f28396g;
                boolean zK4 = zC | jVar5.K(n1Var7);
                final eh.p<String, String, pg.f0> pVar2 = this.f28397h;
                boolean zK5 = zK4 | jVar5.K(pVar2) | jVar5.K(n1Var5);
                boolean z18 = z17;
                Object objG4 = jVar5.g();
                if (zK5 || objG4 == c0321a4) {
                    objG4 = new eh.a() { // from class: t8.n
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // eh.a
                        public final Object invoke() {
                            if (!z16) {
                                int i10 = w.f28523b;
                                n1Var6.setValue(Boolean.TRUE);
                            } else if (z13) {
                                aVar11.invoke();
                            } else if (z14) {
                                int i11 = w.f28523b;
                                n1Var7.setValue(Boolean.TRUE);
                            } else {
                                int i12 = w.f28523b;
                                pVar2.invoke((String) n1Var5.getValue(), "chat");
                            }
                            return pg.f0.f21461a;
                        }
                    };
                    z11 = z16;
                    jVar5.C(objG4);
                } else {
                    z11 = z16;
                }
                jVar5.B();
                t0.x0.a((eh.a) objG4, dVarF, z18, eVarA2, l0VarA, null, null, null, f1.c.b(-1836456416, new p(z11, z13), jVar5), jVar5, 805306416, 480);
                p1.d.b(androidx.compose.foundation.layout.g.f(d0.h.f(aVar9), 24), jVar5);
                jVar5.H();
                jVar5.H();
            }
            objG3 = new eh.l() { // from class: t8.l
                @Override // eh.l
                public final Object invoke(Object obj) {
                    String it = (String) obj;
                    kotlin.jvm.internal.r.e(it, "it");
                    String strB0 = mh.y.b0(4000, it);
                    int i10 = w.f28523b;
                    n1Var5.setValue(strB0);
                    return pg.f0.f21461a;
                }
            };
            jVar4.C(objG3);
            jVar4.B();
            e0.a aVar102 = aVar4;
            g.a.C0128a c0128a42 = c0128a2;
            j.a.C0321a c0321a42 = c0321a2;
            w9.a(value, (eh.l) objG3, dVarH, false, false, null, null, a4.f28090c, null, null, null, f1.c.b(-174883517, new o(n1Var5), jVar4), false, null, null, null, false, 0, 8, eVarA, dfVar, jVar4, 12583296, 805306752, 1568632);
            jVar4.L(268458998);
            boolean zK32 = jVar4.K(n1Var5);
            strArr = this.f28401m;
            zL = zK32 | jVar4.l(strArr);
            objG = jVar4.g();
            if (!zL) {
                objG = new eh.a() { // from class: t8.m
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // eh.a
                    public final Object invoke() {
                        ArrayList arrayList = new ArrayList();
                        String[] strArr2 = strArr;
                        int length = strArr2.length;
                        int i10 = 0;
                        while (true) {
                            x0.n1 n1Var62 = n1Var5;
                            if (i10 >= length) {
                                String str = (String) qg.x.Q(arrayList, hh.c.f13027a);
                                int i11 = w.f28523b;
                                n1Var62.setValue(str);
                                return pg.f0.f21461a;
                            }
                            String str2 = strArr2[i10];
                            int i12 = w.f28523b;
                            if (!kotlin.jvm.internal.r.a(str2, (String) n1Var62.getValue())) {
                                arrayList.add(str2);
                            }
                            i10++;
                        }
                    }
                };
                jVar4.C(objG);
                jVar4.B();
                s4.b((eh.a) objG, androidx.compose.foundation.layout.g.n(androidx.compose.foundation.layout.f.l(androidx.compose.foundation.layout.b.f961a.b(aVar9, d.a.f14610i), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 10, 34, 3), 48), false, null, k4.b(q1.b1.c(0.18f, j13), j13, jVar4, 0), a4.f28091d, jVar4, 1572864, 44);
                jVar4.H();
                androidx.compose.ui.d dVarD22 = androidx.compose.foundation.layout.g.d(aVar9, 1.0f);
                z.q qVarA32 = z.o.a(kVar, aVar, jVar4, 48);
                int iD42 = jVar4.D();
                x0.a2 a2VarY42 = jVar4.y();
                androidx.compose.ui.d dVarC42 = androidx.compose.ui.c.c(dVarD22, jVar4);
                if (jVar4.t() != null) {
                }
            }
        }
        return pg.f0.f21461a;
    }
}
