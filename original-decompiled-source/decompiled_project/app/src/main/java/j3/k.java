package j3;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import i0.b4;
import i2.e0;
import i2.g;
import j2.j2;
import java.util.UUID;
import ph.v1;
import x0.a2;
import x0.h2;
import x0.j;
import x0.k;
import x0.n1;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final x0.m0 f15087a = new x0.m0(a.f15088a);

    public static final class a extends kotlin.jvm.internal.s implements eh.a<String> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f15088a = new a(0);

        @Override // eh.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "DEFAULT_TEST_TAG";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x022f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(o0 o0Var, eh.a aVar, p0 p0Var, f1.b bVar, x0.j jVar, int i10, int i11) {
        int i12;
        eh.a aVar2;
        int i13;
        x0.k kVar;
        eh.a aVar3;
        h2 h2VarV;
        Object obj;
        x0.k kVar2;
        String str;
        eh.a aVar4;
        Object obj2;
        boolean z10;
        eh.a aVar5;
        g0 g0Var;
        Object mVar;
        f3.r rVar;
        String str2;
        int i14;
        boolean zL;
        Object objG;
        boolean z11;
        Object objG2;
        boolean zL2;
        Object objG3;
        boolean zL3;
        Object objG4;
        boolean zL4;
        Object objG5;
        int i15;
        g.a.C0128a c0128a;
        o0 o0Var2 = o0Var;
        x0.k kVarP = jVar.p(-830247068);
        if ((i10 & 6) == 0) {
            i12 = (kVarP.K(o0Var2) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i16 = i11 & 2;
        if (i16 == 0) {
            if ((i10 & 48) == 0) {
                aVar2 = aVar;
                i12 |= kVarP.l(aVar2) ? 32 : 16;
            }
            if ((i10 & 384) == 0) {
                i12 |= kVarP.K(p0Var) ? 256 : 128;
            }
            if ((i10 & 3072) == 0) {
                i12 |= kVarP.l(bVar) ? 2048 : 1024;
            }
            i13 = i12;
            if (kVarP.A(i13 & 1, (i13 & 1171) == 1170)) {
                kVar = kVarP;
                kVar.v();
                aVar3 = aVar2;
            } else {
                eh.a aVar6 = i16 != 0 ? null : aVar2;
                View view = (View) kVarP.f(AndroidCompositionLocals_androidKt.f1285f);
                f3.d dVar = (f3.d) kVarP.f(j2.f14779h);
                String str3 = (String) kVarP.f(f15087a);
                f3.r rVar2 = (f3.r) kVarP.f(j2.f14785n);
                k.b bVarE = kVarP.E();
                n1 n1VarK = bg.b.k(bVar, kVarP);
                UUID uuid = (UUID) b0.a0.d(new Object[0], null, t.f15123a, kVarP, 3072, 6);
                Object objG6 = kVarP.g();
                Object obj3 = j.a.f31715a;
                if (objG6 == obj3) {
                    obj = obj3;
                    x0.k kVar3 = kVarP;
                    g0 g0Var2 = new g0(aVar6, p0Var, str3, view, dVar, o0Var, uuid);
                    str = str3;
                    aVar4 = aVar6;
                    o0Var2 = o0Var;
                    g0Var2.k(bVarE, new f1.b(1302892335, true, new w(g0Var2, n1VarK)));
                    kVar3.C(g0Var2);
                    objG6 = g0Var2;
                    kVar2 = kVar3;
                } else {
                    obj = obj3;
                    kVar2 = kVarP;
                    str = str3;
                    aVar4 = aVar6;
                    o0Var2 = o0Var;
                }
                g0 g0Var3 = (g0) objG6;
                int i17 = i13 & 112;
                int i18 = i13 & 896;
                boolean zL5 = kVar2.l(g0Var3) | (i17 == 32) | (i18 == 256) | kVar2.K(str) | kVar2.K(rVar2);
                Object objG7 = kVar2.g();
                if (zL5) {
                    obj2 = obj;
                } else {
                    obj2 = obj;
                    if (objG7 != obj2) {
                        g0Var = g0Var3;
                        i14 = i13;
                        aVar5 = aVar4;
                        str2 = str;
                        rVar = rVar2;
                        x0.k kVar4 = kVar2;
                        mVar = objG7;
                        kVar = kVar4;
                        z10 = false;
                    }
                    x0.o0.a(g0Var, (eh.l) mVar, kVar);
                    zL = (i17 != 32 ? true : z10) | kVar.l(g0Var) | (i18 != 256 ? true : z10) | kVar.K(str2) | kVar.K(rVar);
                    objG = kVar.g();
                    if (!zL || objG == obj2) {
                        Object nVar = new n(g0Var, aVar5, p0Var, str2, rVar);
                        kVar.C(nVar);
                        objG = nVar;
                    }
                    kVar.u((eh.a) objG);
                    boolean zL6 = kVar.l(g0Var);
                    if ((i14 & 14) == 4) {
                        z10 = true;
                    }
                    z11 = zL6 | z10;
                    objG2 = kVar.g();
                    if (!z11 || objG2 == obj2) {
                        objG2 = new p(g0Var, o0Var2);
                        kVar.C(objG2);
                    }
                    x0.o0.a(o0Var2, (eh.l) objG2, kVar);
                    zL2 = kVar.l(g0Var);
                    objG3 = kVar.g();
                    if (!zL2 || objG3 == obj2) {
                        objG3 = new q(g0Var, null);
                        kVar.C(objG3);
                    }
                    x0.o0.d((eh.p) objG3, g0Var, kVar);
                    zL3 = kVar.l(g0Var);
                    objG4 = kVar.g();
                    if (!zL3 || objG4 == obj2) {
                        objG4 = new b4(g0Var, 1);
                        kVar.C(objG4);
                    }
                    androidx.compose.ui.d dVarA = androidx.compose.ui.layout.c.a(d.a.f1143b, (eh.l) objG4);
                    zL4 = kVar.l(g0Var) | kVar.K(rVar);
                    objG5 = kVar.g();
                    if (!zL4 || objG5 == obj2) {
                        objG5 = new r(g0Var, rVar);
                        kVar.C(objG5);
                    }
                    g2.l0 l0Var = (g2.l0) objG5;
                    i15 = kVar.P;
                    a2 a2VarP = kVar.P();
                    androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarA, kVar);
                    i2.g.f13861o.getClass();
                    e0.a aVar7 = g.a.f13863b;
                    kVar.r();
                    if (kVar.O) {
                        kVar.z();
                    } else {
                        kVar.w(aVar7);
                    }
                    v1.j(g.a.f13867f, l0Var, kVar);
                    v1.j(g.a.f13866e, a2VarP, kVar);
                    c0128a = g.a.f13868g;
                    if (!kVar.O || !kotlin.jvm.internal.r.a(kVar.g(), Integer.valueOf(i15))) {
                        org.bouncycastle.jcajce.provider.digest.e.a(i15, kVar, i15, c0128a);
                    }
                    v1.j(g.a.f13865d, dVarC, kVar);
                    kVar.T(true);
                    aVar3 = aVar5;
                }
                kVar = kVar2;
                g0Var = g0Var3;
                i14 = i13;
                String str4 = str;
                z10 = false;
                aVar5 = aVar4;
                mVar = new m(g0Var, aVar5, p0Var, str4, rVar2);
                str2 = str4;
                rVar = rVar2;
                kVar.C(mVar);
                x0.o0.a(g0Var, (eh.l) mVar, kVar);
                zL = (i17 != 32 ? true : z10) | kVar.l(g0Var) | (i18 != 256 ? true : z10) | kVar.K(str2) | kVar.K(rVar);
                objG = kVar.g();
                if (!zL) {
                    Object nVar2 = new n(g0Var, aVar5, p0Var, str2, rVar);
                    kVar.C(nVar2);
                    objG = nVar2;
                    kVar.u((eh.a) objG);
                    boolean zL62 = kVar.l(g0Var);
                    if ((i14 & 14) == 4) {
                    }
                    z11 = zL62 | z10;
                    objG2 = kVar.g();
                    if (!z11) {
                        objG2 = new p(g0Var, o0Var2);
                        kVar.C(objG2);
                        x0.o0.a(o0Var2, (eh.l) objG2, kVar);
                        zL2 = kVar.l(g0Var);
                        objG3 = kVar.g();
                        if (!zL2) {
                            objG3 = new q(g0Var, null);
                            kVar.C(objG3);
                            x0.o0.d((eh.p) objG3, g0Var, kVar);
                            zL3 = kVar.l(g0Var);
                            objG4 = kVar.g();
                            if (!zL3) {
                                objG4 = new b4(g0Var, 1);
                                kVar.C(objG4);
                                androidx.compose.ui.d dVarA2 = androidx.compose.ui.layout.c.a(d.a.f1143b, (eh.l) objG4);
                                zL4 = kVar.l(g0Var) | kVar.K(rVar);
                                objG5 = kVar.g();
                                if (!zL4) {
                                    objG5 = new r(g0Var, rVar);
                                    kVar.C(objG5);
                                    g2.l0 l0Var2 = (g2.l0) objG5;
                                    i15 = kVar.P;
                                    a2 a2VarP2 = kVar.P();
                                    androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarA2, kVar);
                                    i2.g.f13861o.getClass();
                                    e0.a aVar72 = g.a.f13863b;
                                    kVar.r();
                                    if (kVar.O) {
                                    }
                                    v1.j(g.a.f13867f, l0Var2, kVar);
                                    v1.j(g.a.f13866e, a2VarP2, kVar);
                                    c0128a = g.a.f13868g;
                                    if (!kVar.O) {
                                        org.bouncycastle.jcajce.provider.digest.e.a(i15, kVar, i15, c0128a);
                                        v1.j(g.a.f13865d, dVarC2, kVar);
                                        kVar.T(true);
                                        aVar3 = aVar5;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            h2VarV = kVar.V();
            if (h2VarV == null) {
                h2VarV.f31703d = new s(o0Var2, aVar3, p0Var, bVar, i10, i11);
                return;
            }
            return;
        }
        i12 |= 48;
        aVar2 = aVar;
        if ((i10 & 384) == 0) {
        }
        if ((i10 & 3072) == 0) {
        }
        i13 = i12;
        if (kVarP.A(i13 & 1, (i13 & 1171) == 1170)) {
        }
        h2VarV = kVar.V();
        if (h2VarV == null) {
        }
    }

    public static final boolean b(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }
}
