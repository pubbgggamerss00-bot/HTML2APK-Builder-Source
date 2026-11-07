package t0;

import androidx.compose.material3.MinimumInteractiveModifier;
import androidx.compose.ui.d;
import j1.d;
import x0.j;

/* loaded from: classes.dex */
public final class ea {

    /* renamed from: a, reason: collision with root package name */
    public static final float f25810a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f25811b = 12;

    /* renamed from: c, reason: collision with root package name */
    public static final float f25812c;

    static {
        float f10 = 2;
        f25810a = f10;
        f25812c = f10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v8 */
    public static final void a(boolean z10, eh.a aVar, androidx.compose.ui.d dVar, boolean z11, ba baVar, x0.j jVar, int i10) {
        int i11;
        ba baVar2;
        boolean z12;
        androidx.compose.ui.d dVar2;
        ba baVar3;
        x0.r3 r3Var;
        x0.r3 r3VarK;
        ba baVar4;
        ?? r92;
        x0.r3 r3Var2;
        x0.r3 r3Var3;
        androidx.compose.ui.d dVarA;
        ba baVar5;
        androidx.compose.ui.d dVar3;
        x0.k kVarP = jVar.p(408580840);
        if ((i10 & 6) == 0) {
            i11 = (kVarP.c(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= kVarP.l(aVar) ? 32 : 16;
        }
        int i12 = i11 | 3456;
        if ((i10 & 24576) == 0) {
            i12 = i11 | 11648;
        }
        if (((196608 | i12) & 74899) == 74898 && kVarP.s()) {
            kVarP.v();
            dVar3 = dVar;
            z12 = z11;
            baVar5 = baVar;
        } else {
            kVarP.r0();
            int i13 = i10 & 1;
            androidx.compose.ui.d dVar4 = d.a.f1143b;
            if (i13 == 0 || kVarP.a0()) {
                e2 e2Var = (e2) kVarP.f(f2.f25858a);
                ba baVar6 = e2Var.f25752a0;
                if (baVar6 == null) {
                    float f10 = v0.b0.f30200a;
                    long jD = f2.d(e2Var, v0.d.f30248m);
                    long jD2 = f2.d(e2Var, v0.d.f30245j);
                    v0.d dVar5 = v0.d.f30244h;
                    baVar2 = new ba(jD, jD2, q1.b1.c(0.38f, f2.d(e2Var, dVar5)), q1.b1.c(0.38f, f2.d(e2Var, dVar5)));
                    e2Var.f25752a0 = baVar2;
                } else {
                    baVar2 = baVar6;
                }
                z12 = true;
                dVar2 = dVar4;
                baVar3 = baVar2;
            } else {
                kVarP.v();
                dVar2 = dVar;
                z12 = z11;
                baVar3 = baVar;
            }
            kVarP.U();
            x0.r3 r3VarA = s.g.a(z10 ? f25811b / 2 : 0, s.m.d(100, 0, null, 6), kVarP, 48);
            baVar3.getClass();
            long j10 = (z12 && z10) ? baVar3.f25537a : (!z12 || z10) ? (z12 || !z10) ? baVar3.f25540d : baVar3.f25539c : baVar3.f25538b;
            if (z12) {
                kVarP.L(350067971);
                r3Var = r3VarA;
                r3VarK = r.g2.a(j10, s.m.d(100, 0, null, 6), null, kVarP, 48, 12);
                kVarP.T(false);
            } else {
                r3Var = r3VarA;
                kVarP.L(350170674);
                r3VarK = bg.b.k(new q1.b1(j10), kVarP);
                kVarP.T(false);
            }
            kVarP.L(1327106656);
            if (aVar != null) {
                r3Var2 = r3VarK;
                baVar4 = baVar3;
                r3Var3 = r3Var;
                r92 = 0;
                dVarA = androidx.compose.foundation.selection.a.a(dVar4, z10, null, ha.a(false, v0.b0.f30201b / 2, 0L, kVarP, 54, 4), z12, new q2.i(3), aVar);
            } else {
                baVar4 = baVar3;
                r92 = 0;
                r3Var2 = r3VarK;
                r3Var3 = r3Var;
                dVarA = dVar4;
            }
            kVarP.T(r92);
            if (aVar != null) {
                x0.s3 s3Var = w4.f27281a;
                dVar4 = MinimumInteractiveModifier.f1120b;
            }
            androidx.compose.ui.d dVarJ = androidx.compose.foundation.layout.g.j(androidx.compose.foundation.layout.f.h(androidx.compose.foundation.layout.g.u(dVar2.h(dVar4).h(dVarA), d.a.f14606e), f25810a), v0.b0.f30200a);
            x0.r3 r3Var4 = r3Var2;
            boolean zK = kVarP.K(r3Var4) | kVarP.K(r3Var3);
            Object objG = kVarP.g();
            if (zK || objG == j.a.f31715a) {
                objG = new ca(r3Var4, r3Var3);
                kVarP.C(objG);
            }
            t.w.a(dVarJ, (eh.l) objG, kVarP, r92);
            baVar5 = baVar4;
            dVar3 = dVar2;
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new da(z10, aVar, dVar3, z12, baVar5, i10);
        }
    }
}
