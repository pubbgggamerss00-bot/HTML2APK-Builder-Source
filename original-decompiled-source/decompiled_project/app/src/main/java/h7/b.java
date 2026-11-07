package h7;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import coil3.compose.internal.ContentPainterElement;
import com.android.apksig.internal.apk.v4.V4Signature;
import h7.e;
import i2.e0;
import i2.g;
import i7.i;
import j1.d;
import j2.d3;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pg.f0;
import ph.v1;
import q1.c1;
import q1.n1;
import w7.f;
import x0.a2;
import x0.h2;
import x0.j;

/* loaded from: classes.dex */
public final class b {
    public static final void a(final i7.c cVar, final String str, final androidx.compose.ui.d dVar, final eh.l<? super e.b, ? extends e.b> lVar, final eh.l<? super e.b, f0> lVar2, final j1.d dVar2, final g2.j jVar, final float f10, final c1 c1Var, final int i10, final boolean z10, x0.j jVar2, final int i11, final int i12) {
        String str2;
        eh.l<? super e.b, ? extends e.b> lVar3;
        eh.l<? super e.b, f0> lVar4;
        j1.d dVar3;
        int i13;
        boolean z11;
        int i14;
        w7.f fVar;
        i iVar;
        x0.k kVarP = jVar2.p(1236588022);
        int i15 = (kVarP.K(cVar) ? 4 : 2) | i11;
        if ((i11 & 48) == 0) {
            str2 = str;
            i15 |= kVarP.K(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i11 & 384) == 0) {
            i15 |= kVarP.K(dVar) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            lVar3 = lVar;
            i15 |= kVarP.l(lVar3) ? 2048 : 1024;
        } else {
            lVar3 = lVar;
        }
        if ((i11 & 24576) == 0) {
            lVar4 = lVar2;
            i15 |= kVarP.l(lVar4) ? 16384 : 8192;
        } else {
            lVar4 = lVar2;
        }
        if ((196608 & i11) == 0) {
            dVar3 = dVar2;
            i15 |= kVarP.K(dVar3) ? 131072 : 65536;
        } else {
            dVar3 = dVar2;
        }
        if ((1572864 & i11) == 0) {
            i15 |= kVarP.K(jVar) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i11) == 0) {
            i15 |= kVarP.h(f10) ? 8388608 : 4194304;
        }
        if ((100663296 & i11) == 0) {
            i15 |= kVarP.K(c1Var) ? 67108864 : 33554432;
        }
        if ((805306368 & i11) == 0) {
            i13 = i10;
            i15 |= kVarP.i(i13) ? PKIFailureInfo.duplicateCertReq : 268435456;
        } else {
            i13 = i10;
        }
        if ((i12 & 6) == 0) {
            z11 = z10;
            i14 = i12 | (kVarP.c(z11) ? 4 : 2);
        } else {
            z11 = z10;
            i14 = i12;
        }
        if ((i15 & 306783379) == 306783378 && (i14 & 3) == 2 && kVarP.s()) {
            kVarP.v();
        } else {
            Object obj = cVar.f14184a;
            int i16 = i7.i.f14196b;
            kVarP.L(-329318062);
            boolean z12 = obj instanceof w7.f;
            Object obj2 = j.a.f31715a;
            if (z12) {
                kVarP.L(-858608894);
                fVar = (w7.f) obj;
                if (fVar.f31346s.f31384g != null) {
                    kVarP.L(-858568842);
                    kVarP.T(false);
                    kVarP.T(false);
                    kVarP.T(false);
                } else {
                    kVarP.L(-858520668);
                    x7.i iVarA = i7.i.a(jVar, kVarP);
                    boolean zK = kVarP.K(fVar) | kVarP.K(iVarA);
                    Object objG = kVarP.g();
                    if (zK || objG == obj2) {
                        f.a aVarA = w7.f.a(fVar);
                        aVarA.f31359l = iVarA;
                        objG = aVarA.a();
                        kVarP.C(objG);
                    }
                    fVar = (w7.f) objG;
                    kVarP.T(false);
                    kVarP.T(false);
                    kVarP.T(false);
                }
            } else {
                kVarP.L(-858262500);
                Context context = (Context) kVarP.f(AndroidCompositionLocals_androidKt.f1281b);
                x7.i iVarA2 = i7.i.a(jVar, kVarP);
                boolean zK2 = kVarP.K(context) | kVarP.K(obj) | kVarP.K(iVarA2);
                Object objG2 = kVarP.g();
                if (zK2 || objG2 == obj2) {
                    f.a aVar = new f.a(context);
                    aVar.f31350c = obj;
                    aVar.f31359l = iVarA2;
                    objG2 = aVar.a();
                    kVarP.C(objG2);
                }
                fVar = (w7.f) objG2;
                kVarP.T(false);
                kVarP.T(false);
            }
            w7.f fVar2 = fVar;
            Object obj3 = fVar2.f31329b;
            if (obj3 instanceof f.a) {
                throw new IllegalArgumentException("Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?");
            }
            if (obj3 instanceof n1) {
                i7.i.b("ImageBitmap");
                throw null;
            }
            if (obj3 instanceof w1.d) {
                i7.i.b("ImageVector");
                throw null;
            }
            if (obj3 instanceof v1.c) {
                i7.i.b("Painter");
                throw null;
            }
            if (fVar2.f31330c != null) {
                throw new IllegalArgumentException("request.target must be null.");
            }
            if (((androidx.lifecycle.l) g7.k.a(fVar2, w7.h.f31395e)) != null) {
                throw new IllegalArgumentException("request.lifecycle must be null.");
            }
            g7.p pVar = cVar.f14186c;
            c cVar2 = cVar.f14185b;
            if (((Boolean) kVarP.f(d3.f14698a)).booleanValue()) {
                kVarP.L(-1358303232);
                i iVar2 = (i) kVarP.f(q.f12341a);
                kVarP.T(false);
                iVar = iVar2;
            } else {
                kVarP.L(-1358245727);
                kVarP.T(false);
                iVar = null;
            }
            androidx.compose.ui.d dVarH = dVar.h(new ContentPainterElement(fVar2, pVar, cVar2, lVar3, lVar4, i13, dVar3, jVar, f10, c1Var, z11, iVar, str2));
            int i17 = kVarP.P;
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarH, kVarP);
            a2 a2VarP = kVarP.P();
            i2.g.f13861o.getClass();
            e0.a aVar2 = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar2);
            } else {
                kVarP.z();
            }
            v1.j(g.a.f13867f, i.a.f14197a, kVarP);
            v1.j(g.a.f13866e, a2VarP, kVarP);
            v1.j(g.a.f13865d, dVarC, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i17))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i17, kVarP, i17, c0128a);
            }
            kVarP.T(true);
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p() { // from class: h7.a
                @Override // eh.p
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    b.a(cVar, str, dVar, lVar, lVar2, dVar2, jVar, f10, c1Var, i10, z10, (x0.j) obj4, f3.i.n(i11 | 1), f3.i.n(i12));
                    return f0.f21461a;
                }
            };
        }
    }

    public static final void b(Object obj, String str, g7.p pVar, androidx.compose.ui.d dVar, g2.j jVar, x0.j jVar2, int i10, int i11, int i12) {
        int i13 = i10 >> 3;
        a(new i7.c(obj, (c) jVar2.f(p.f12340a), pVar), str, dVar, e.f12280z, null, d.a.f14606e, jVar, 1.0f, null, 1, true, jVar2, (i10 & 112) | (i13 & 896) | (i13 & V4Signature.MAX_SIGNING_INFOS_SIZE) | (57344 & i13) | (458752 & i13) | (3670016 & i13) | (29360128 & i13) | (i13 & 234881024) | ((i11 << 27) & 1879048192), (i11 >> 3) & 14);
    }
}
