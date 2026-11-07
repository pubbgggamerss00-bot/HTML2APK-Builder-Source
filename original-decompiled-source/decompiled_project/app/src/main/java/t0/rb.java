package t0;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.d;
import com.android.apksig.internal.apk.v4.V4Signature;
import com.yalantis.ucrop.view.CropImageView;
import org.bouncycastle.asn1.cmc.BodyPartID;
import x0.j;

/* loaded from: classes.dex */
public final class rb {

    /* renamed from: a, reason: collision with root package name */
    public static final rb f26896a = new rb();

    /* renamed from: b, reason: collision with root package name */
    public static final float f26897b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f26898c;

    /* renamed from: d, reason: collision with root package name */
    public static final q1.j0 f26899d;

    static {
        float f10 = v0.f0.f30278e;
        f26897b = f10;
        f26898c = f10;
        f26899d = q1.l0.a();
    }

    public static jb c(x0.j jVar) {
        return f((e2) jVar.f(f2.f25858a));
    }

    public static jb d(long j10, long j11, long j12, x0.j jVar) {
        long j13 = q1.b1.f21654h;
        jb jbVarF = f((e2) jVar.f(f2.f25858a));
        long j14 = j10 != 16 ? j10 : jbVarF.f26160a;
        long j15 = j11 != 16 ? j11 : jbVarF.f26161b;
        long j16 = j13 != 16 ? j13 : jbVarF.f26162c;
        long j17 = j12 != 16 ? j12 : jbVarF.f26163d;
        long j18 = j13 != 16 ? j13 : jbVarF.f26164e;
        long j19 = j13 != 16 ? j13 : jbVarF.f26165f;
        long j20 = j13 != 16 ? j13 : jbVarF.f26166g;
        long j21 = j13 != 16 ? j13 : jbVarF.f26167h;
        long j22 = j13 != 16 ? j13 : jbVarF.f26168i;
        if (j13 == 16) {
            j13 = jbVarF.f26169j;
        }
        return new jb(j14, j15, j16, j17, j18, j19, j20, j21, j22, j13);
    }

    public static void e(s1.e eVar, long j10, long j11, long j12, float f10, float f11) {
        long jFloatToRawIntBits = (Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f10) & BodyPartID.bodyIdMax);
        long jFloatToRawIntBits2 = (Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f11) & BodyPartID.bodyIdMax);
        p1.e eVarA = p1.f.a(p1.d.a(p1.c.d(j10), CropImageView.DEFAULT_ASPECT_RATIO), d0.h.a(p1.h.d(j11), p1.h.b(j11)));
        p1.g gVar = new p1.g(eVarA.f21131a, eVarA.f21132b, eVarA.f21133c, eVarA.f21134d, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits2, jFloatToRawIntBits);
        q1.j0 j0Var = f26899d;
        q1.u1.f(j0Var, gVar);
        s1.e.P0(eVar, j0Var, j12, null, 0, 60);
        j0Var.n();
    }

    public static jb f(e2 e2Var) {
        jb jbVar = e2Var.f25754b0;
        if (jbVar != null) {
            return jbVar;
        }
        float f10 = v0.f0.f30274a;
        v0.d dVar = v0.d.f30248m;
        long jD = f2.d(e2Var, dVar);
        long jD2 = f2.d(e2Var, dVar);
        v0.d dVar2 = v0.d.f30252r;
        long jD3 = f2.d(e2Var, dVar2);
        long jD4 = f2.d(e2Var, dVar2);
        long jD5 = f2.d(e2Var, dVar);
        v0.d dVar3 = v0.d.f30244h;
        jb jbVar2 = new jb(jD, jD2, jD3, jD4, jD5, c2.n0.f(q1.b1.c(0.38f, f2.d(e2Var, dVar3)), e2Var.f25770p), q1.b1.c(0.38f, f2.d(e2Var, dVar3)), q1.b1.c(0.12f, f2.d(e2Var, dVar3)), q1.b1.c(0.12f, f2.d(e2Var, dVar3)), q1.b1.c(0.38f, f2.d(e2Var, dVar3)));
        e2Var.f25754b0 = jbVar2;
        return jbVar2;
    }

    public final void a(x.m mVar, androidx.compose.ui.d dVar, jb jbVar, boolean z10, long j10, x0.j jVar, int i10) {
        long j11;
        androidx.compose.ui.d dVar2;
        long jFloatToRawIntBits;
        long j12;
        androidx.compose.ui.d dVar3;
        x0.k kVarP = jVar.p(-290277409);
        int i11 = i10 | (kVarP.K(mVar) ? 4 : 2) | 48 | (kVarP.K(jbVar) ? 256 : 128) | (kVarP.c(z10) ? 2048 : 1024) | 24576;
        if ((74899 & i11) == 74898 && kVarP.s()) {
            kVarP.v();
            dVar3 = dVar;
            j12 = j10;
        } else {
            kVarP.r0();
            if ((i10 & 1) == 0 || kVarP.a0()) {
                j11 = dc.f25692c;
                dVar2 = d.a.f1143b;
            } else {
                kVarP.v();
                dVar2 = dVar;
                j11 = j10;
            }
            kVarP.U();
            Object objG = kVarP.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (objG == c0321a) {
                objG = new h1.u();
                kVarP.C(objG);
            }
            h1.u uVar = (h1.u) objG;
            boolean z11 = (i11 & 14) == 4;
            Object objG2 = kVarP.g();
            if (z11 || objG2 == c0321a) {
                objG2 = new lb(mVar, uVar, null);
                kVarP.C(objG2);
            }
            x0.o0.d((eh.p) objG2, mVar, kVarP);
            if (uVar.isEmpty()) {
                jFloatToRawIntBits = j11;
            } else {
                jFloatToRawIntBits = (Float.floatToRawIntBits(f3.k.b(j11) / 2) << 32) | (Float.floatToRawIntBits(f3.k.a(j11)) & BodyPartID.bodyIdMax);
            }
            FillElement fillElement = androidx.compose.foundation.layout.g.f974a;
            androidx.compose.ui.d dVarA = androidx.compose.foundation.d.a(androidx.compose.foundation.layout.g.o(dVar2, f3.k.b(jFloatToRawIntBits), f3.k.a(jFloatToRawIntBits)), mVar);
            long j13 = z10 ? jbVar.f26160a : jbVar.f26165f;
            float f10 = v0.f0.f30274a;
            p1.d.b(androidx.compose.foundation.a.b(dVarA, j13, ab.a(v0.c0.f30231d, kVarP)), kVarP);
            j12 = j11;
            dVar3 = dVar2;
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new mb(this, mVar, dVar3, jbVar, z10, j12, i10);
        }
    }

    public final void b(hc hcVar, androidx.compose.ui.d dVar, boolean z10, jb jbVar, eh.p pVar, eh.q qVar, float f10, float f11, x0.j jVar, int i10) {
        int i11;
        float f12;
        float f13;
        int i12;
        androidx.compose.ui.d dVar2;
        eh.p pVar2;
        eh.q qVar2;
        eh.q qVar3;
        long j10;
        androidx.compose.ui.d dVar3;
        androidx.compose.ui.d dVar4;
        eh.q qVar4;
        x0.k kVar;
        float f14;
        float f15;
        float f16;
        float f17;
        eh.p pVar3;
        eh.q qVar5;
        androidx.compose.ui.d dVar5;
        x0.k kVarP = jVar.p(49984771);
        if ((i10 & 6) == 0) {
            i11 = (kVarP.l(hcVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        int i13 = i11 | 48;
        if ((i10 & 384) == 0) {
            i13 |= kVarP.c(z10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i13 |= kVarP.K(jbVar) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i13 |= 8192;
        }
        int i14 = i13 | 14352384;
        if ((100663296 & i10) == 0) {
            i14 |= kVarP.K(this) ? 67108864 : 33554432;
        }
        if ((38347923 & i14) == 38347922 && kVarP.s()) {
            kVarP.v();
            dVar5 = dVar;
            pVar3 = pVar;
            qVar5 = qVar;
            f16 = f10;
            f17 = f11;
            kVar = kVarP;
        } else {
            kVarP.r0();
            int i15 = i10 & 1;
            j.a.C0321a c0321a = j.a.f31715a;
            if (i15 == 0 || kVarP.a0()) {
                boolean z11 = ((i14 & 896) == 256) | ((((i14 & V4Signature.MAX_SIGNING_INFOS_SIZE) ^ 3072) > 2048 && kVarP.K(jbVar)) || (i14 & 3072) == 2048);
                Object objG = kVarP.g();
                if (z11 || objG == c0321a) {
                    objG = new nb(jbVar, z10);
                    kVarP.C(objG);
                }
                eh.p pVar4 = (eh.p) objG;
                ob obVar = ob.f26634a;
                f12 = dc.f25693d;
                f13 = dc.f25694e;
                i12 = i14 & (-57345);
                dVar2 = d.a.f1143b;
                pVar2 = pVar4;
                qVar2 = obVar;
            } else {
                kVarP.v();
                pVar2 = pVar;
                qVar2 = qVar;
                f12 = f10;
                f13 = f11;
                i12 = i14 & (-57345);
                dVar2 = dVar;
            }
            kVarP.U();
            int i16 = i12;
            long jA = jbVar.a(z10, false);
            float f18 = f12;
            long jA2 = jbVar.a(z10, true);
            long j11 = z10 ? jbVar.f26164e : jbVar.f26169j;
            if (z10) {
                qVar3 = qVar2;
                j10 = jbVar.f26162c;
            } else {
                qVar3 = qVar2;
                j10 = jbVar.f26167h;
            }
            androidx.compose.ui.d dVar6 = dVar2;
            float f19 = f13;
            androidx.compose.ui.d dVarB = e3.k.b(androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(dVar2, 1.0f), dc.f25690a), kVarP.f(j2.j2.f14785n) == f3.r.f8829b ? 180.0f : CropImageView.DEFAULT_ASPECT_RATIO);
            boolean zL = ((i16 & 3670016) == 1048576) | kVarP.l(hcVar) | kVarP.j(jA) | kVarP.j(jA2) | kVarP.j(j11) | kVarP.j(j10) | ((i16 & 29360128) == 8388608) | kVarP.K(pVar2) | ((i16 & 458752) == 131072);
            Object objG2 = kVarP.g();
            if (zL || objG2 == c0321a) {
                dVar3 = dVar6;
                long j12 = j10;
                dVar4 = dVarB;
                qVar4 = qVar3;
                kVar = kVarP;
                long j13 = j11;
                f14 = f18;
                f15 = f19;
                pb pbVar = new pb(hcVar, jA, jA2, j13, j12, f14, f15, pVar2, qVar4);
                kVar.C(pbVar);
                objG2 = pbVar;
            } else {
                f14 = f18;
                qVar4 = qVar3;
                dVar3 = dVar6;
                f15 = f19;
                kVar = kVarP;
                dVar4 = dVarB;
            }
            t.w.a(dVar4, (eh.l) objG2, kVar, 0);
            f16 = f14;
            f17 = f15;
            pVar3 = pVar2;
            qVar5 = qVar4;
            dVar5 = dVar3;
        }
        x0.h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new qb(this, hcVar, dVar5, z10, jbVar, pVar3, qVar5, f16, f17, i10);
        }
    }
}
