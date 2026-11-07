package z;

import androidx.compose.ui.d;
import com.android.apksig.internal.apk.v4.V4Signature;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;
import j1.f;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import x0.j;
import z.b;
import z.v;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f34505a = 0;

    static {
        int i10 = v.f34644a;
        new v.e();
        new v.c(d.a.f14614m);
    }

    public static final void a(androidx.compose.ui.d dVar, b.e eVar, b.l lVar, d.c cVar, int i10, int i11, f1.b bVar, x0.j jVar, int i12, int i13) {
        androidx.compose.ui.d dVar2;
        int i14;
        d.c cVar2;
        int i15;
        int i16;
        x0.k kVarP = jVar.p(-2070229740);
        int i17 = i13 & 1;
        if (i17 != 0) {
            i14 = i12 | 6;
            dVar2 = dVar;
        } else if ((i12 & 6) == 0) {
            dVar2 = dVar;
            i14 = i12 | (kVarP.K(dVar2) ? 4 : 2);
        } else {
            dVar2 = dVar;
            i14 = i12;
        }
        int i18 = i14 | 224256;
        if (kVarP.A(i18 & 1, (599187 & i18) != 599186)) {
            if (i17 != 0) {
                dVar2 = d.a.f1143b;
            }
            b(dVar2, eVar, lVar, n0.f34598b, bVar, kVarP, (i18 & 14) | 14380464);
            i15 = Integer.MAX_VALUE;
            i16 = Integer.MAX_VALUE;
            cVar2 = d.a.f14611j;
        } else {
            kVarP.v();
            cVar2 = cVar;
            i15 = i10;
            i16 = i11;
        }
        androidx.compose.ui.d dVar3 = dVar2;
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new c0(dVar3, eVar, lVar, cVar2, i15, i16, bVar, i12, i13);
        }
    }

    @pg.d
    public static final void b(androidx.compose.ui.d dVar, b.e eVar, b.l lVar, n0 n0Var, f1.b bVar, x0.j jVar, int i10) {
        int i11;
        int i12;
        x0.k kVarP = jVar.p(-218661582);
        if ((i10 & 6) == 0) {
            i11 = (kVarP.K(dVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= kVarP.K(eVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= kVarP.K(lVar) ? 256 : 128;
        }
        int i13 = i10 & 3072;
        f.b bVar2 = d.a.f14611j;
        if (i13 == 0) {
            i11 |= kVarP.K(bVar2) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= kVarP.i(Integer.MAX_VALUE) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= kVarP.i(Integer.MAX_VALUE) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= kVarP.K(n0Var) ? 1048576 : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i10) == 0) {
            i11 |= kVarP.l(bVar) ? 8388608 : 4194304;
        }
        int i14 = i11;
        if (kVarP.A(i14 & 1, (i14 & 4793491) != 4793490)) {
            int i15 = i14 & 3670016;
            boolean z10 = i15 == 1048576;
            Object objG = kVarP.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (z10 || objG == c0321a) {
                objG = new j0(n0Var.f34512a);
                kVarP.C(objG);
            }
            j0 j0Var = (j0) objG;
            int i16 = i14 >> 3;
            boolean zK = ((((i16 & 14) ^ 6) > 4 && kVarP.K(eVar)) || (i16 & 6) == 4) | ((((i16 & 112) ^ 48) > 32 && kVarP.K(lVar)) || (i16 & 48) == 32) | ((((i16 & 896) ^ 384) > 256 && kVarP.K(bVar2)) || (i16 & 384) == 256) | ((((i16 & V4Signature.MAX_SIGNING_INFOS_SIZE) ^ 3072) > 2048 && kVarP.i(Integer.MAX_VALUE)) || (i16 & 3072) == 2048) | ((((57344 & i16) ^ 24576) > 16384 && kVarP.i(Integer.MAX_VALUE)) || (i16 & 24576) == 16384) | kVarP.K(j0Var);
            Object objG2 = kVarP.g();
            if (zK || objG2 == c0321a) {
                float fA = eVar.a();
                int i17 = v.f34644a;
                i12 = i15;
                m0 m0Var = new m0(eVar, lVar, fA, new v.e(), lVar.a(), j0Var);
                kVarP.C(m0Var);
                objG2 = m0Var;
            } else {
                i12 = i15;
            }
            m0 m0Var2 = (m0) objG2;
            boolean z11 = (i12 == 1048576) | ((i14 & 29360128) == 8388608) | ((i14 & 458752) == 131072);
            Object objG3 = kVarP.g();
            Object obj = objG3;
            if (z11 || objG3 == c0321a) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new f1.b(702094978, true, new d0(bVar)));
                n0Var.getClass();
                n0Var.f34512a.ordinal();
                kVarP.C(arrayList);
                obj = arrayList;
            }
            f1.b bVar3 = new f1.b(-1953651383, true, new g2.a0((List) obj));
            boolean zK2 = kVarP.K(m0Var2);
            Object objG4 = kVarP.g();
            if (zK2 || objG4 == c0321a) {
                objG4 = new g2.v0(m0Var2);
                kVarP.C(objG4);
            }
            g2.l0 l0Var = (g2.l0) objG4;
            int i18 = kVarP.P;
            x0.a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVar, kVarP);
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
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i18))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i18, kVarP, i18, c0128a);
            }
            ph.v1.j(g.a.f13865d, dVarC, kVarP);
            bVar3.invoke(kVarP, 0);
            kVarP.T(true);
        } else {
            kVarP.v();
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new b0(dVar, eVar, lVar, n0Var, bVar, i10);
        }
    }

    public static final long c(g2.k0 k0Var, m0 m0Var, long j10, eh.l lVar) {
        if (b8.n.d(b8.n.c(k0Var)) != CropImageView.DEFAULT_ASPECT_RATIO) {
            int iJ = k0Var.J(Integer.MAX_VALUE);
            return p.g.a(iJ, k0Var.b0(iJ));
        }
        b8.n.c(k0Var);
        g2.g1 g1VarP = k0Var.P(j10);
        lVar.invoke(g1VarP);
        return p.g.a(m0Var.j(g1VarP), m0Var.b(g1VarP));
    }
}
