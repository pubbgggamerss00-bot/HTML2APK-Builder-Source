package t;

import androidx.compose.ui.d;
import g2.g1;
import g2.j;
import i2.e0;
import i2.g;
import j1.d;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import x0.h2;
import x0.j;

/* loaded from: classes.dex */
public final class t0 {

    public static final class a implements g2.l0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f25354a = new a();

        /* renamed from: t.t0$a$a, reason: collision with other inner class name */
        public static final class C0283a extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

            /* renamed from: a, reason: collision with root package name */
            public static final C0283a f25355a = new C0283a(1);

            @Override // eh.l
            public final /* bridge */ /* synthetic */ pg.f0 invoke(g1.a aVar) {
                return pg.f0.f21461a;
            }
        }

        @Override // g2.l0
        public final g2.m0 h(g2.o0 o0Var, List<? extends g2.k0> list, long j10) {
            return o0Var.i0(f3.b.k(j10), f3.b.j(j10), qg.a0.f22708a, C0283a.f25355a);
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ v1.c f25356a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f25357b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.d f25358c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ j1.d f25359d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ g2.j f25360e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ float f25361f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ q1.c1 f25362g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ int f25363h;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ int f25364j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(v1.c cVar, String str, androidx.compose.ui.d dVar, j1.d dVar2, g2.j jVar, float f10, q1.c1 c1Var, int i10, int i11) {
            super(2);
            this.f25356a = cVar;
            this.f25357b = str;
            this.f25358c = dVar;
            this.f25359d = dVar2;
            this.f25360e = jVar;
            this.f25361f = f10;
            this.f25362g = c1Var;
            this.f25363h = i10;
            this.f25364j = i11;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            num.intValue();
            t0.a(this.f25356a, this.f25357b, this.f25358c, this.f25359d, this.f25360e, this.f25361f, this.f25362g, jVar, f3.i.n(this.f25363h | 1), this.f25364j);
            return pg.f0.f21461a;
        }
    }

    public static final class c extends kotlin.jvm.internal.s implements eh.l<q2.d0, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f25365a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(1);
            this.f25365a = str;
        }

        @Override // eh.l
        public final pg.f0 invoke(q2.d0 d0Var) {
            q2.d0 d0Var2 = d0Var;
            q2.a0.d(d0Var2, this.f25365a);
            q2.a0.e(d0Var2, 5);
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x017c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(v1.c cVar, String str, androidx.compose.ui.d dVar, j1.d dVar2, g2.j jVar, float f10, q1.c1 c1Var, x0.j jVar2, int i10, int i11) {
        j1.d dVar3;
        int i12;
        g2.j jVar3;
        int i13;
        int i14;
        int i15;
        q1.c1 c1Var2;
        int i16;
        int i17;
        j1.d dVar4;
        g2.j jVar4;
        float f11;
        h2 h2VarV;
        int i18;
        j1.d dVar5;
        int i19;
        float f12;
        x0.k kVarP = jVar2.p(1142754848);
        int i20 = (kVarP.l(cVar) ? 4 : 2) | i10;
        if ((i10 & 48) == 0) {
            i20 |= kVarP.K(str) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i20 |= kVarP.K(dVar) ? 256 : 128;
        }
        int i21 = i11 & 8;
        if (i21 != 0) {
            i12 = i20 | 3072;
            dVar3 = dVar2;
        } else {
            dVar3 = dVar2;
            i12 = i20 | (kVarP.K(dVar3) ? 2048 : 1024);
        }
        int i22 = i11 & 16;
        if (i22 == 0) {
            if ((i10 & 24576) == 0) {
                jVar3 = jVar;
                i12 |= kVarP.K(jVar3) ? 16384 : 8192;
            }
            i13 = i11 & 32;
            if (i13 == 0) {
                i14 = i12 | 196608;
            } else {
                i14 = i12 | (kVarP.h(f10) ? 131072 : 65536);
            }
            i15 = i11 & 64;
            if (i15 == 0) {
                i16 = i14 | 1572864;
                c1Var2 = c1Var;
            } else {
                c1Var2 = c1Var;
                i16 = i14 | (kVarP.K(c1Var2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted);
            }
            i17 = i16;
            if (kVarP.A(i17 & 1, (599187 & i16) == 599186)) {
                kVarP.v();
                dVar4 = dVar3;
                jVar4 = jVar3;
                f11 = f10;
            } else {
                if (i21 != 0) {
                    dVar5 = d.a.f14606e;
                    i18 = i13;
                } else {
                    i18 = i13;
                    dVar5 = dVar3;
                }
                g2.j jVar5 = i22 != 0 ? j.a.f11398b : jVar3;
                if (i18 != 0) {
                    f12 = 1.0f;
                    i19 = i15;
                } else {
                    i19 = i15;
                    f12 = f10;
                }
                if (i19 != 0) {
                    c1Var2 = null;
                }
                androidx.compose.ui.d dVarA = d.a.f1143b;
                if (str != null) {
                    kVarP.L(1040425059);
                    boolean z10 = (i17 & 112) == 32;
                    Object objG = kVarP.g();
                    if (z10 || objG == j.a.f31715a) {
                        objG = new c(str);
                        kVarP.C(objG);
                    }
                    dVarA = q2.q.a(dVarA, false, (eh.l) objG);
                    kVarP.T(false);
                } else {
                    kVarP.L(1040583841);
                    kVarP.T(false);
                }
                androidx.compose.ui.d dVarA2 = androidx.compose.ui.draw.b.a(e1.d.e(dVar.h(dVarA)), cVar, dVar5, jVar5, f12, c1Var2, 2);
                int i23 = kVarP.P;
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarA2, kVarP);
                x0.a2 a2VarP = kVarP.P();
                i2.g.f13861o.getClass();
                e0.a aVar = g.a.f13863b;
                kVarP.r();
                if (kVarP.O) {
                    kVarP.w(aVar);
                } else {
                    kVarP.z();
                }
                ph.v1.j(g.a.f13867f, a.f25354a, kVarP);
                ph.v1.j(g.a.f13866e, a2VarP, kVarP);
                ph.v1.j(g.a.f13865d, dVarC, kVarP);
                g.a.C0128a c0128a = g.a.f13868g;
                if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i23))) {
                    org.bouncycastle.jcajce.provider.digest.e.a(i23, kVarP, i23, c0128a);
                }
                kVarP.T(true);
                dVar4 = dVar5;
                jVar4 = jVar5;
                f11 = f12;
            }
            q1.c1 c1Var3 = c1Var2;
            h2VarV = kVarP.V();
            if (h2VarV == null) {
                h2VarV.f31703d = new b(cVar, str, dVar, dVar4, jVar4, f11, c1Var3, i10, i11);
                return;
            }
            return;
        }
        i12 |= 24576;
        jVar3 = jVar;
        i13 = i11 & 32;
        if (i13 == 0) {
        }
        i15 = i11 & 64;
        if (i15 == 0) {
        }
        i17 = i16;
        if (kVarP.A(i17 & 1, (599187 & i16) == 599186)) {
        }
        q1.c1 c1Var32 = c1Var2;
        h2VarV = kVarP.V();
        if (h2VarV == null) {
        }
    }

    public static final void b(q1.n1 n1Var, String str, androidx.compose.ui.d dVar, q1.d1 d1Var, x0.j jVar, int i10, int i11) {
        if ((i11 & 64) != 0) {
            d1Var = null;
        }
        q1.d1 d1Var2 = d1Var;
        int i12 = (i11 & 128) != 0 ? 1 : 0;
        boolean zK = jVar.K(n1Var);
        Object objG = jVar.g();
        if (zK || objG == j.a.f31715a) {
            objG = c2.y.a(n1Var, i12);
            jVar.C(objG);
        }
        a((v1.a) objG, str, dVar, d.a.f14606e, j.a.f11398b, 1.0f, d1Var2, jVar, i10 & 4194288, 0);
    }
}
