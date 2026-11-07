package t0;

import androidx.compose.ui.d;
import i2.e0;
import i2.g;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import x0.j;

/* loaded from: classes.dex */
public final class h5 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f25983a = 8;

    /* renamed from: b, reason: collision with root package name */
    public static final float f25984b = 12;

    /* renamed from: c, reason: collision with root package name */
    public static final float f25985c;

    /* renamed from: d, reason: collision with root package name */
    public static final float f25986d;

    /* renamed from: e, reason: collision with root package name */
    public static final float f25987e;

    static {
        float f10 = 16;
        f25985c = f10;
        f25986d = f10;
        f25987e = f10;
    }

    public static final void a(f1.b bVar, androidx.compose.ui.d dVar, eh.p pVar, x4 x4Var, float f10, float f11, x0.j jVar, int i10) {
        float f12;
        float f13;
        f1.b bVar2;
        float f14;
        float f15;
        x0.k kVarP = jVar.p(-1647707763);
        if (((i10 | (kVarP.K(dVar) ? 32 : 16) | 200064 | (kVarP.K(x4Var) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | 113246208) & 38347923) == 38347922 && kVarP.s()) {
            kVarP.v();
            bVar2 = bVar;
            f14 = f10;
            f15 = f11;
        } else {
            kVarP.r0();
            if ((i10 & 1) == 0 || kVarP.a0()) {
                f12 = y4.f27459a;
                f13 = f12;
            } else {
                kVarP.v();
                f12 = f10;
                f13 = f11;
            }
            kVarP.U();
            bVar2 = bVar;
            f1.b bVarB = f1.c.b(-403249643, new c5(x4Var, bVar2), kVarP);
            kVarP.L(1640970492);
            kVarP.T(false);
            kVarP.L(1640980724);
            kVarP.T(false);
            kVarP.L(1640990750);
            f1.b bVarB2 = pVar == null ? null : f1.c.b(1400509200, new d5(x4Var, pVar), kVarP);
            kVarP.T(false);
            kVarP.L(1641004177);
            kVarP.T(false);
            androidx.compose.ui.d dVarH = q2.q.a(d.a.f1143b, true, z4.f27517a).h(dVar);
            float f16 = y4.f27459a;
            md.a(dVarH, ab.a(v0.r.f30459b, kVarP), x4Var.f27370a, x4Var.f27371b, f12, f13, null, f1.c.b(1502590376, new a5(bVarB2, null, bVarB, null, null), kVarP), kVarP, 12804096, 64);
            f14 = f12;
            f15 = f13;
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new b5(bVar2, dVar, pVar, x4Var, f14, f15, i10);
        }
    }

    public static final void b(eh.p pVar, eh.p pVar2, f1.b bVar, eh.p pVar3, eh.p pVar4, x0.j jVar, int i10) {
        int i11;
        x0.k kVarP = jVar.p(2052297037);
        if ((i10 & 6) == 0) {
            i11 = (kVarP.l(pVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= kVarP.l(pVar2) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= kVarP.l(bVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= kVarP.l(pVar3) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= kVarP.l(pVar4) ? 16384 : 8192;
        }
        if ((i11 & 9363) == 9362 && kVarP.s()) {
            kVarP.v();
        } else {
            Object objG = kVarP.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (objG == c0321a) {
                objG = new i5();
                kVarP.C(objG);
            }
            i5 i5Var = (i5) objG;
            f1.b bVar2 = new f1.b(-1953651383, true, new g2.a0(qg.p.j(bVar, pVar3 == null ? i2.f26055a : pVar3, pVar4 == null ? i2.f26056b : pVar4, pVar == null ? i2.f26057c : pVar, pVar2 == null ? i2.f26058d : pVar2)));
            Object objG2 = kVarP.g();
            if (objG2 == c0321a) {
                objG2 = new g2.v0(i5Var);
                kVarP.C(objG2);
            }
            g2.l0 l0Var = (g2.l0) objG2;
            int i12 = kVarP.P;
            x0.a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(d.a.f1143b, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar);
            } else {
                kVarP.z();
            }
            ph.v1.j(g.a.f13867f, l0Var, kVarP);
            ph.v1.j(g.a.f13866e, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i12))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i12, kVarP, i12, c0128a);
            }
            ph.v1.j(g.a.f13865d, dVarC, kVarP);
            bVar2.invoke(kVarP, 0);
            kVarP.T(true);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new e5(pVar, pVar2, bVar, pVar3, pVar4, i10);
        }
    }

    public static final void c(long j10, v0.o0 o0Var, eh.p pVar, x0.j jVar, int i10) {
        int i11;
        long j11;
        eh.p pVar2;
        x0.k kVarP = jVar.p(1133967795);
        if ((i10 & 6) == 0) {
            i11 = (kVarP.j(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= kVarP.K(o0Var) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= kVarP.l(pVar) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && kVarP.s()) {
            kVarP.v();
            j11 = j10;
            pVar2 = pVar;
        } else {
            j11 = j10;
            u0.v0.a(j11, of.a(o0Var, kVarP), pVar, kVarP, i11 & 910);
            pVar2 = pVar;
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new f5(j11, o0Var, pVar2, i10);
        }
    }

    public static final int d(g2.q qVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10) {
        int iMax = Math.max(Math.max(f3.b.j(j10), qVar.b1(i15 == 1 ? v0.r.f30470m : i15 == 2 ? v0.r.f30476s : v0.r.f30473p)), Math.max(i10, Math.max(i12 + i13 + i14, i11)) + i16);
        int iH = f3.b.h(j10);
        return iMax > iH ? iH : iMax;
    }
}
