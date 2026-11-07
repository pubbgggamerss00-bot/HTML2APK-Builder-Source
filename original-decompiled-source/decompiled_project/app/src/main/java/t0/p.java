package t0;

import androidx.compose.ui.d;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jf.dexlib2.dexbacked.raw.HeaderItem;
import x0.j;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final float f26649a = 280;

    /* renamed from: b, reason: collision with root package name */
    public static final float f26650b = 560;

    /* renamed from: c, reason: collision with root package name */
    public static final float f26651c = 8;

    /* renamed from: d, reason: collision with root package name */
    public static final float f26652d = 12;

    /* renamed from: e, reason: collision with root package name */
    public static final z.g1 f26653e;

    /* renamed from: f, reason: collision with root package name */
    public static final z.g1 f26654f;

    /* renamed from: g, reason: collision with root package name */
    public static final z.g1 f26655g;

    /* renamed from: h, reason: collision with root package name */
    public static final z.g1 f26656h;

    static {
        float f10 = 24;
        f26653e = new z.g1(f10, f10, f10, f10);
        float f11 = 16;
        f26654f = androidx.compose.foundation.layout.f.d(CropImageView.DEFAULT_ASPECT_RATIO, f11, 7);
        f26655g = androidx.compose.foundation.layout.f.d(CropImageView.DEFAULT_ASPECT_RATIO, f11, 7);
        f26656h = androidx.compose.foundation.layout.f.d(CropImageView.DEFAULT_ASPECT_RATIO, f10, 7);
    }

    public static final void a(f1.b bVar, androidx.compose.ui.d dVar, eh.p pVar, eh.p pVar2, eh.p pVar3, q1.f2 f2Var, long j10, float f10, long j11, long j12, long j13, long j14, x0.j jVar, int i10) {
        androidx.compose.ui.d dVar2;
        x0.k kVarP = jVar.p(1522575799);
        int i11 = i10 | 48 | (kVarP.l(pVar) ? 256 : 128) | (kVarP.l(pVar2) ? 2048 : 1024) | (kVarP.l(pVar3) ? 16384 : 8192) | (kVarP.K(f2Var) ? 131072 : 65536) | (kVarP.j(j10) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | (kVarP.h(f10) ? 8388608 : 4194304) | (kVarP.j(j11) ? 67108864 : 33554432) | (kVarP.j(j12) ? PKIFailureInfo.duplicateCertReq : 268435456);
        int i12 = (kVarP.j(j13) ? (char) 4 : (char) 2) | (kVarP.j(j14) ? ' ' : (char) 16);
        if ((i11 & 306783379) == 306783378 && (i12 & 19) == 18 && kVarP.s()) {
            kVarP.v();
            dVar2 = dVar;
        } else {
            int i13 = i11 >> 12;
            d.a aVar = d.a.f1143b;
            md.a(aVar, f2Var, j10, 0L, f10, CropImageView.DEFAULT_ASPECT_RATIO, null, f1.c.b(-2126308228, new e(pVar, pVar2, pVar3, j12, j13, j14, j11, bVar), kVarP), kVarP, (i13 & 896) | (i13 & 112) | 12582918 | ((i11 >> 9) & 57344), HeaderItem.DATA_SIZE_OFFSET);
            dVar2 = aVar;
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new f(bVar, dVar2, pVar, pVar2, pVar3, f2Var, j10, f10, j11, j12, j13, j14, i10);
        }
    }

    public static final void b(f1.b bVar, x0.j jVar, int i10) {
        x0.k kVarP = jVar.p(586821353);
        if ((i10 & 147) == 146 && kVarP.s()) {
            kVarP.v();
        } else {
            Object objG = kVarP.g();
            if (objG == j.a.f31715a) {
                objG = new g();
                kVarP.C(objG);
            }
            g2.l0 l0Var = (g2.l0) objG;
            int i11 = kVarP.P;
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
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i11))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i11, kVarP, i11, c0128a);
            }
            ph.v1.j(g.a.f13865d, dVarC, kVarP);
            bVar.invoke(kVarP, 6);
            kVarP.T(true);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new h(bVar, i10);
        }
    }

    public static final void c(eh.a aVar, f1.b bVar, androidx.compose.ui.d dVar, eh.p pVar, eh.p pVar2, eh.p pVar3, eh.p pVar4, q1.f2 f2Var, long j10, long j11, long j12, long j13, float f10, j3.d0 d0Var, x0.j jVar, int i10, int i11) {
        int i12;
        f1.b bVar2;
        eh.p pVar5;
        int i13;
        x0.k kVarP = jVar.p(-919826268);
        if ((i10 & 6) == 0) {
            i12 = (kVarP.l(aVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            bVar2 = bVar;
            i12 |= kVarP.l(bVar2) ? 32 : 16;
        } else {
            bVar2 = bVar;
        }
        if ((i10 & 384) == 0) {
            i12 |= kVarP.K(dVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            pVar5 = pVar;
            i12 |= kVarP.l(pVar5) ? 2048 : 1024;
        } else {
            pVar5 = pVar;
        }
        if ((i10 & 24576) == 0) {
            i12 |= kVarP.l(pVar2) ? 16384 : 8192;
        }
        if ((i10 & 196608) == 0) {
            i12 |= kVarP.l(pVar3) ? 131072 : 65536;
        }
        if ((i10 & 1572864) == 0) {
            i12 |= kVarP.l(pVar4) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((i10 & 12582912) == 0) {
            i12 |= kVarP.K(f2Var) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i12 |= kVarP.j(j10) ? 67108864 : 33554432;
        }
        if ((i10 & 805306368) == 0) {
            i12 |= kVarP.j(j11) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if ((i11 & 6) == 0) {
            i13 = i11 | (kVarP.j(j12) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= kVarP.j(j13) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= kVarP.h(f10) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= kVarP.K(d0Var) ? 2048 : 1024;
        }
        int i14 = i13;
        if ((i12 & 306783379) == 306783378 && (i14 & 1171) == 1170 && kVarP.s()) {
            kVarP.v();
        } else {
            d(aVar, dVar, d0Var, f1.c.b(-1852840226, new k(pVar2, pVar3, pVar4, f2Var, j10, f10, j11, j12, j13, pVar5, bVar2), kVarP), kVarP, (i12 & 14) | 3072 | ((i12 >> 3) & 112) | ((i14 >> 3) & 896), 0);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new l(aVar, bVar, dVar, pVar, pVar2, pVar3, pVar4, f2Var, j10, j11, j12, j13, f10, d0Var, i10, i11);
        }
    }

    public static final void d(eh.a aVar, androidx.compose.ui.d dVar, j3.d0 d0Var, f1.b bVar, x0.j jVar, int i10, int i11) {
        int i12;
        j3.d0 d0Var2;
        x0.k kVarP = jVar.p(-1922902937);
        if ((i10 & 6) == 0) {
            i12 = (kVarP.l(aVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= kVarP.K(dVar) ? 32 : 16;
        }
        int i14 = i11 & 4;
        if (i14 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= kVarP.K(d0Var) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= kVarP.l(bVar) ? 2048 : 1024;
        }
        if ((i12 & 1171) == 1170 && kVarP.s()) {
            kVarP.v();
            d0Var2 = d0Var;
        } else {
            if (i13 != 0) {
                dVar = d.a.f1143b;
            }
            if (i14 != 0) {
                d0Var = new j3.d0(7);
            }
            j3.d0 d0Var3 = d0Var;
            j3.j.a(aVar, d0Var3, f1.c.b(905289008, new n(dVar, bVar), kVarP), kVarP, (i12 & 14) | 384 | ((i12 >> 3) & 112), 0);
            d0Var2 = d0Var3;
        }
        androidx.compose.ui.d dVar2 = dVar;
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new o(aVar, dVar2, d0Var2, bVar, i10, i11);
        }
    }
}
