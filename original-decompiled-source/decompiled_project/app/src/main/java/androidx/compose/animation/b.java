package androidx.compose.animation;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.ui.d;
import c2.g0;
import eh.l;
import eh.p;
import f3.r;
import h1.c0;
import h1.u;
import i2.e0;
import i2.g;
import j1.d;
import j1.f;
import j2.j2;
import java.util.ListIterator;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p.l0;
import p.w0;
import ph.v1;
import qg.o;
import r.n0;
import s.c2;
import s.p2;
import s.y1;
import x0.a2;
import x0.h2;
import x0.j;
import x0.k;
import x0.n1;
import x0.x1;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final long f762a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f763b = 0;

    static {
        long j10 = PKIFailureInfo.systemUnavail;
        f762a = (j10 & BodyPartID.bodyIdMax) | (j10 << 32);
    }

    public static final void a(Object obj, androidx.compose.ui.d dVar, l lVar, j1.d dVar2, String str, l lVar2, f1.b bVar, j jVar, int i10) {
        androidx.compose.ui.d dVar3;
        l lVar3;
        j1.d dVar4;
        l lVar4;
        k kVarP = jVar.p(2132720749);
        int i11 = i10 | (kVarP.K(obj) ? 4 : 2) | 200112;
        if (kVarP.A(i11 & 1, (599187 & i11) != 599186)) {
            r.b bVar2 = r.b.f22783a;
            lVar4 = r.c.f22788a;
            y1 y1VarE = c2.e(obj, str, kVarP, (i11 & 14) | 48, 0);
            d.a aVar = d.a.f1143b;
            f fVar = d.a.f14602a;
            b(y1VarE, aVar, bVar2, fVar, lVar4, bVar, kVarP, 224688);
            dVar3 = aVar;
            lVar3 = bVar2;
            dVar4 = fVar;
        } else {
            kVarP.v();
            dVar3 = dVar;
            lVar3 = lVar;
            dVar4 = dVar2;
            lVar4 = lVar2;
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new r.d(obj, dVar3, lVar3, dVar4, str, lVar4, bVar, i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(y1 y1Var, androidx.compose.ui.d dVar, l lVar, j1.d dVar2, l lVar2, f1.b bVar, j jVar, int i10) {
        int i11;
        k kVar;
        l lVar3;
        AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl;
        u uVar;
        AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl2;
        y1.a aVarB;
        boolean z10;
        y1 y1Var2 = y1Var;
        l lVar4 = lVar;
        k kVarP = jVar.p(-114689412);
        if ((i10 & 6) == 0) {
            i11 = (kVarP.K(y1Var2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= kVarP.K(dVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= kVarP.l(lVar4) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= kVarP.K(dVar2) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= kVarP.l(lVar2) ? 16384 : 8192;
        }
        f1.b bVar2 = bVar;
        if ((196608 & i10) == 0) {
            i11 |= kVarP.l(bVar2) ? 131072 : 65536;
        }
        if (kVarP.A(i11 & 1, (74899 & i11) != 74898)) {
            r rVar = (r) kVarP.f(j2.f14785n);
            int i12 = i11 & 14;
            boolean z11 = i12 == 4;
            Object objG = kVarP.g();
            Object obj = j.a.f31715a;
            if (z11 || objG == obj) {
                objG = new AnimatedContentTransitionScopeImpl(y1Var2, dVar2, rVar);
                kVarP.C(objG);
            }
            AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl3 = (AnimatedContentTransitionScopeImpl) objG;
            boolean z12 = i12 == 4;
            Object objG2 = kVarP.g();
            Object obj2 = objG2;
            if (z12 || objG2 == obj) {
                Object[] objArr = {y1Var2.f24001a.V()};
                u uVar2 = new u();
                uVar2.addAll(o.B(objArr));
                kVarP.C(uVar2);
                obj2 = uVar2;
            }
            u uVar3 = (u) obj2;
            boolean z13 = i12 == 4;
            Object objG3 = kVarP.g();
            if (z13 || objG3 == obj) {
                objG3 = w0.b();
                kVarP.C(objG3);
            }
            l0 l0Var = (l0) objG3;
            g0 g0Var = y1Var2.f24001a;
            x1 x1Var = y1Var2.f24004d;
            if (!uVar3.contains(g0Var.V())) {
                uVar3.clear();
                uVar3.add(g0Var.V());
            }
            if (kotlin.jvm.internal.r.a(g0Var.V(), x1Var.getValue())) {
                if (uVar3.size() != 1 || !kotlin.jvm.internal.r.a(uVar3.get(0), g0Var.V())) {
                    uVar3.clear();
                    uVar3.add(g0Var.V());
                }
                if (l0Var.f20741e != 1 || l0Var.b(g0Var.V())) {
                    l0Var.f();
                }
                animatedContentTransitionScopeImpl3.f726b = dVar2;
                animatedContentTransitionScopeImpl3.f727c = rVar;
            }
            if (!kotlin.jvm.internal.r.a(g0Var.V(), x1Var.getValue()) && !uVar3.contains(x1Var.getValue())) {
                ListIterator listIterator = uVar3.listIterator();
                int i13 = 0;
                while (true) {
                    c0 c0Var = (c0) listIterator;
                    ListIterator listIterator2 = listIterator;
                    if (!c0Var.hasNext()) {
                        i13 = -1;
                        break;
                    } else {
                        if (kotlin.jvm.internal.r.a(lVar2.invoke(c0Var.next()), lVar2.invoke(x1Var.getValue()))) {
                            break;
                        }
                        i13++;
                        listIterator = listIterator2;
                    }
                }
                if (i13 == -1) {
                    uVar3.add(x1Var.getValue());
                } else {
                    uVar3.set(i13, x1Var.getValue());
                }
            }
            if (l0Var.b(x1Var.getValue()) && l0Var.b(g0Var.V())) {
                kVarP.L(919489879);
                kVarP.T(false);
                lVar3 = lVar4;
                animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl3;
            } else {
                kVarP.L(916905750);
                l0Var.f();
                int size = uVar3.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj3 = uVar3.get(i14);
                    int i15 = i14;
                    AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl4 = animatedContentTransitionScopeImpl3;
                    l0Var.l(obj3, f1.c.b(885640742, new a(y1Var2, obj3, lVar4, animatedContentTransitionScopeImpl4, uVar3, bVar2), kVarP));
                    bVar2 = bVar;
                    lVar4 = lVar4;
                    animatedContentTransitionScopeImpl3 = animatedContentTransitionScopeImpl4;
                    i14 = i15 + 1;
                    y1Var2 = y1Var;
                }
                lVar3 = lVar4;
                animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl3;
                kVarP.T(false);
            }
            boolean zK = kVarP.K(y1Var.f()) | kVarP.K(animatedContentTransitionScopeImpl);
            Object objG4 = kVarP.g();
            if (zK || objG4 == obj) {
                objG4 = (n0) lVar3.invoke(animatedContentTransitionScopeImpl);
                kVarP.C(objG4);
            }
            n0 n0Var = (n0) objG4;
            y1<S> y1Var3 = animatedContentTransitionScopeImpl.f725a;
            boolean zK2 = kVarP.K(animatedContentTransitionScopeImpl);
            Object objG5 = kVarP.g();
            if (zK2 || objG5 == obj) {
                objG5 = bg.b.h(Boolean.FALSE);
                kVarP.C(objG5);
            }
            n1 n1Var = (n1) objG5;
            n1 n1VarK = bg.b.k(n0Var.f22891d, kVarP);
            if (kotlin.jvm.internal.r.a(y1Var3.f24001a.V(), y1Var3.f24004d.getValue())) {
                n1Var.setValue(Boolean.FALSE);
            } else if (n1VarK.getValue() != 0) {
                n1Var.setValue(Boolean.TRUE);
            }
            boolean zBooleanValue = ((Boolean) n1Var.getValue()).booleanValue();
            androidx.compose.ui.d dVarE = d.a.f1143b;
            if (zBooleanValue) {
                kVarP.L(249676467);
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl5 = animatedContentTransitionScopeImpl;
                uVar = uVar3;
                animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl5;
                kVar = kVarP;
                aVarB = c2.b(animatedContentTransitionScopeImpl5.f725a, p2.f23875h, null, kVar, 0, 2);
                boolean zK3 = kVar.K(aVarB);
                Object objG6 = kVar.g();
                if (zK3 || objG6 == obj) {
                    r.j2 j2Var = (r.j2) n1VarK.getValue();
                    if (j2Var == null || j2Var.a()) {
                        dVarE = e1.d.e(dVarE);
                    }
                    kVar.C(dVarE);
                    objG6 = dVarE;
                }
                dVarE = (androidx.compose.ui.d) objG6;
                kVar.T(false);
            } else {
                uVar = uVar3;
                kVar = kVarP;
                animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                kVar.L(249942509);
                kVar.T(false);
                aVarB = null;
                animatedContentTransitionScopeImpl2.f730f = null;
            }
            androidx.compose.ui.d dVarH = dVar.h(dVarE.h(new AnimatedContentTransitionScopeImpl.SizeModifierElement(aVarB, n1VarK, animatedContentTransitionScopeImpl2)));
            Object objG7 = kVar.g();
            if (objG7 == obj) {
                objG7 = new c(animatedContentTransitionScopeImpl2);
                kVar.C(objG7);
            }
            c cVar = (c) objG7;
            int i16 = kVar.P;
            a2 a2VarP = kVar.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarH, kVar);
            g.f13861o.getClass();
            e0.a aVar = g.a.f13863b;
            kVar.r();
            if (kVar.O) {
                kVar.w(aVar);
            } else {
                kVar.z();
            }
            v1.j(g.a.f13867f, cVar, kVar);
            v1.j(g.a.f13866e, a2VarP, kVar);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVar.O || !kotlin.jvm.internal.r.a(kVar.g(), Integer.valueOf(i16))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i16, kVar, i16, c0128a);
            }
            v1.j(g.a.f13865d, dVarC, kVar);
            kVar.L(-1490874326);
            int size2 = uVar.size();
            int i17 = 0;
            while (i17 < size2) {
                u uVar4 = uVar;
                Object obj4 = uVar4.get(i17);
                kVar.q(1908442329, lVar2.invoke(obj4));
                p pVar = (p) l0Var.d(obj4);
                if (pVar == null) {
                    kVar.L(-967793488);
                    z10 = false;
                } else {
                    z10 = false;
                    kVar.L(1908443505);
                    pVar.invoke(kVar, 0);
                }
                kVar.T(z10);
                kVar.T(z10);
                i17++;
                uVar = uVar4;
            }
            kVar.T(false);
            kVar.T(true);
        } else {
            kVar = kVarP;
            kVar.v();
        }
        h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new r.l(y1Var, dVar, lVar, dVar2, lVar2, bVar, i10);
        }
    }
}
