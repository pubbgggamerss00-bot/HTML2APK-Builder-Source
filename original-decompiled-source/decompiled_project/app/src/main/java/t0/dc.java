package t0;

import androidx.compose.material3.MinimumInteractiveModifier;
import androidx.compose.ui.d;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import c2.s0;
import com.android.apksig.internal.apk.v4.V4Signature;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import x0.j;

/* loaded from: classes.dex */
public final class dc {

    /* renamed from: a, reason: collision with root package name */
    public static final float f25690a = v0.f0.f30277d;

    /* renamed from: b, reason: collision with root package name */
    public static final float f25691b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f25692c;

    /* renamed from: d, reason: collision with root package name */
    public static final float f25693d;

    /* renamed from: e, reason: collision with root package name */
    public static final float f25694e;

    static {
        float f10 = v0.f0.f30276c;
        f25691b = f10;
        f25692c = f3.i.a(f10, v0.f0.f30275b);
        f25693d = v0.f0.f30274a;
        f25694e = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(float f10, eh.l lVar, androidx.compose.ui.d dVar, boolean z10, jh.d dVar2, int i10, jb jbVar, x.m mVar, x0.j jVar, int i11, int i12) {
        androidx.compose.ui.d dVar3;
        int i13;
        boolean z11;
        int i14;
        int i15;
        int i16;
        jb jbVarC;
        int i17;
        Object objG;
        x.m mVar2;
        androidx.compose.ui.d dVar4;
        int i18;
        jb jbVar2;
        x0.k kVar;
        boolean z12;
        jb jbVar3;
        x.m mVar3;
        int i19;
        x0.h2 h2VarV;
        x0.k kVarP = jVar.p(-202044027);
        int i20 = (kVarP.h(f10) ? 4 : 2) | i11;
        if ((i11 & 48) == 0) {
            i20 |= kVarP.l(lVar) ? 32 : 16;
        }
        int i21 = i12 & 4;
        if (i21 != 0) {
            i20 |= 384;
        } else {
            if ((i11 & 384) == 0) {
                dVar3 = dVar;
                i20 |= kVarP.K(dVar3) ? 256 : 128;
            }
            i13 = i12 & 8;
            if (i13 == 0) {
                i14 = i20 | 3072;
                z11 = z10;
            } else {
                z11 = z10;
                i14 = i20 | (kVarP.c(z11) ? 2048 : 1024);
            }
            int i22 = i14 | (!kVarP.K(dVar2) ? 16384 : 8192);
            i15 = i12 & 32;
            if (i15 == 0) {
                i22 |= 196608;
            } else {
                if ((196608 & i11) == 0) {
                    i16 = i10;
                    i22 |= kVarP.i(i16) ? 131072 : 65536;
                }
                int i23 = i22 | 1572864;
                if ((i12 & 128) == 0) {
                    jbVarC = jbVar;
                    int i24 = kVarP.K(jbVarC) ? 8388608 : 4194304;
                    i17 = i23 | i24 | 100663296;
                    if ((38347923 & i17) == 38347922 || !kVarP.s()) {
                        kVarP.r0();
                        if ((i11 & 1) != 0 || kVarP.a0()) {
                            androidx.compose.ui.d dVar5 = i21 == 0 ? d.a.f1143b : dVar3;
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if (i15 != 0) {
                                i16 = 0;
                            }
                            if ((i12 & 128) != 0) {
                                rb rbVar = rb.f26896a;
                                i17 &= -29360129;
                                jbVarC = rb.c(kVarP);
                            }
                            objG = kVarP.g();
                            if (objG == j.a.f31715a) {
                                objG = new x.n();
                                kVarP.C(objG);
                            }
                            mVar2 = (x.m) objG;
                            dVar4 = dVar5;
                            i18 = i16;
                            jbVar2 = jbVarC;
                        } else {
                            kVarP.v();
                            if ((i12 & 128) != 0) {
                                i17 &= -29360129;
                            }
                            dVar4 = dVar3;
                            i18 = i16;
                            jbVar2 = jbVarC;
                            mVar2 = mVar;
                        }
                        boolean z13 = z11;
                        kVarP.U();
                        kVar = kVarP;
                        x.m mVar4 = mVar2;
                        b(f10, lVar, dVar4, z13, jbVar2, mVar4, i18, f1.c.b(308249025, new tb(mVar2, jbVar2, z13), kVarP), f1.c.b(-1843234110, new ub(jbVar2, z13), kVarP), dVar2, kVar, (i17 & 14) | 905969664 | (i17 & 112) | (i17 & 896) | (i17 & V4Signature.MAX_SIGNING_INFOS_SIZE) | 24576 | ((i17 >> 6) & 458752) | 1572864 | (29360128 & (i17 << 6)), (i17 >> 12) & 14);
                        dVar3 = dVar4;
                        z12 = z13;
                        jbVar3 = jbVar2;
                        mVar3 = mVar4;
                        i19 = i18;
                    } else {
                        kVarP.v();
                        kVar = kVarP;
                        z12 = z11;
                        i19 = i16;
                        jbVar3 = jbVarC;
                        mVar3 = mVar;
                    }
                    h2VarV = kVar.V();
                    if (h2VarV == null) {
                        h2VarV.f31703d = new vb(f10, lVar, dVar3, z12, dVar2, i19, jbVar3, mVar3, i11, i12);
                        return;
                    }
                    return;
                }
                jbVarC = jbVar;
                i17 = i23 | i24 | 100663296;
                if ((38347923 & i17) == 38347922) {
                    kVarP.r0();
                    if ((i11 & 1) != 0) {
                        if (i21 == 0) {
                        }
                        if (i13 != 0) {
                        }
                        if (i15 != 0) {
                        }
                        if ((i12 & 128) != 0) {
                        }
                        objG = kVarP.g();
                        if (objG == j.a.f31715a) {
                        }
                        mVar2 = (x.m) objG;
                        dVar4 = dVar5;
                        i18 = i16;
                        jbVar2 = jbVarC;
                        boolean z132 = z11;
                        kVarP.U();
                        kVar = kVarP;
                        x.m mVar42 = mVar2;
                        b(f10, lVar, dVar4, z132, jbVar2, mVar42, i18, f1.c.b(308249025, new tb(mVar2, jbVar2, z132), kVarP), f1.c.b(-1843234110, new ub(jbVar2, z132), kVarP), dVar2, kVar, (i17 & 14) | 905969664 | (i17 & 112) | (i17 & 896) | (i17 & V4Signature.MAX_SIGNING_INFOS_SIZE) | 24576 | ((i17 >> 6) & 458752) | 1572864 | (29360128 & (i17 << 6)), (i17 >> 12) & 14);
                        dVar3 = dVar4;
                        z12 = z132;
                        jbVar3 = jbVar2;
                        mVar3 = mVar42;
                        i19 = i18;
                    }
                }
                h2VarV = kVar.V();
                if (h2VarV == null) {
                }
            }
            i16 = i10;
            int i232 = i22 | 1572864;
            if ((i12 & 128) == 0) {
            }
            i17 = i232 | i24 | 100663296;
            if ((38347923 & i17) == 38347922) {
            }
            h2VarV = kVar.V();
            if (h2VarV == null) {
            }
        }
        dVar3 = dVar;
        i13 = i12 & 8;
        if (i13 == 0) {
        }
        int i222 = i14 | (!kVarP.K(dVar2) ? 16384 : 8192);
        i15 = i12 & 32;
        if (i15 == 0) {
        }
        i16 = i10;
        int i2322 = i222 | 1572864;
        if ((i12 & 128) == 0) {
        }
        i17 = i2322 | i24 | 100663296;
        if ((38347923 & i17) == 38347922) {
        }
        h2VarV = kVar.V();
        if (h2VarV == null) {
        }
    }

    public static final void b(float f10, eh.l lVar, androidx.compose.ui.d dVar, boolean z10, jb jbVar, x.m mVar, int i10, f1.b bVar, f1.b bVar2, jh.d dVar2, x0.j jVar, int i11, int i12) {
        int i13;
        jb jbVar2;
        x.m mVar2;
        f1.b bVar3;
        int i14;
        x0.k kVar;
        x0.k kVarP = jVar.p(1191170377);
        if ((i11 & 6) == 0) {
            i13 = (kVarP.h(f10) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= kVarP.l(lVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= kVarP.K(dVar) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= kVarP.c(z10) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i13 |= kVarP.l(null) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            jbVar2 = jbVar;
            i13 |= kVarP.K(jbVar2) ? 131072 : 65536;
        } else {
            jbVar2 = jbVar;
        }
        if ((1572864 & i11) == 0) {
            mVar2 = mVar;
            i13 |= kVarP.K(mVar2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        } else {
            mVar2 = mVar;
        }
        if ((12582912 & i11) == 0) {
            i13 |= kVarP.i(i10) ? 8388608 : 4194304;
        }
        if ((100663296 & i11) == 0) {
            bVar3 = bVar;
            i13 |= kVarP.l(bVar3) ? 67108864 : 33554432;
        } else {
            bVar3 = bVar;
        }
        if ((805306368 & i11) == 0) {
            i13 |= kVarP.l(bVar2) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if ((i12 & 6) == 0) {
            i14 = i12 | (kVarP.K(dVar2) ? 4 : 2);
        } else {
            i14 = i12;
        }
        if ((i13 & 306783379) == 306783378 && (i14 & 3) == 2 && kVarP.s()) {
            kVarP.v();
            kVar = kVarP;
        } else {
            kVarP.r0();
            if ((i11 & 1) != 0 && !kVarP.a0()) {
                kVarP.v();
            }
            kVarP.U();
            boolean z11 = ((29360128 & i13) == 8388608) | ((((i14 & 14) ^ 6) > 4 && kVarP.K(dVar2)) || (i14 & 6) == 4);
            Object objG = kVarP.g();
            if (z11 || objG == j.a.f31715a) {
                objG = new hc(f10, i10, dVar2);
                kVarP.C(objG);
            }
            hc hcVar = (hc) objG;
            hcVar.getClass();
            hcVar.f26019d = lVar;
            hcVar.d(f10);
            int i15 = ((i13 >> 3) & 1008) | ((i13 >> 6) & 57344);
            int i16 = i13 >> 9;
            kVar = kVarP;
            c(hcVar, dVar, z10, null, mVar2, bVar3, bVar2, kVar, i15 | (458752 & i16) | (i16 & 3670016));
        }
        x0.h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new wb(f10, lVar, dVar, z10, jbVar2, mVar, i10, bVar, bVar2, dVar2, i11, i12);
        }
    }

    public static final void c(hc hcVar, androidx.compose.ui.d dVar, boolean z10, jb jbVar, x.m mVar, f1.b bVar, f1.b bVar2, x0.j jVar, int i10) {
        int i11;
        boolean z11;
        f1.b bVar3;
        f1.b bVar4;
        jb jbVarC;
        int i12;
        jb jbVar2;
        x0.k kVarP = jVar.p(-1303883986);
        if ((i10 & 6) == 0) {
            i11 = (kVarP.l(hcVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= kVarP.K(dVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            z11 = z10;
            i11 |= kVarP.c(z10) ? 256 : 128;
        } else {
            z11 = z10;
        }
        if ((i10 & 3072) == 0) {
            i11 |= 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= kVarP.K(mVar) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            bVar3 = bVar;
            i11 |= kVarP.l(bVar3) ? 131072 : 65536;
        } else {
            bVar3 = bVar;
        }
        if ((1572864 & i10) == 0) {
            bVar4 = bVar2;
            i11 |= kVarP.l(bVar4) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        } else {
            bVar4 = bVar2;
        }
        if ((599187 & i11) == 599186 && kVarP.s()) {
            kVarP.v();
            jbVar2 = jbVar;
        } else {
            kVarP.r0();
            if ((i10 & 1) == 0 || kVarP.a0()) {
                rb rbVar = rb.f26896a;
                jbVarC = rb.c(kVarP);
                i12 = i11 & (-7169);
            } else {
                kVarP.v();
                i12 = i11 & (-7169);
                jbVarC = jbVar;
            }
            kVarP.U();
            if (hcVar.f26016a < 0) {
                throw new IllegalArgumentException("steps should be >= 0");
            }
            int i13 = i12 >> 3;
            d(dVar, hcVar, z11, mVar, bVar3, bVar4, kVarP, (i12 & 896) | (i13 & 14) | ((i12 << 3) & 112) | (i13 & V4Signature.MAX_SIGNING_INFOS_SIZE) | (57344 & i13) | (i13 & 458752));
            jbVar2 = jbVarC;
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new sb(hcVar, dVar, z10, jbVar2, mVar, bVar, bVar2, i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(androidx.compose.ui.d dVar, hc hcVar, boolean z10, x.m mVar, f1.b bVar, f1.b bVar2, x0.j jVar, int i10) {
        int i11;
        androidx.compose.ui.d suspendPointerInputElement;
        hc hcVar2 = hcVar;
        x0.k kVarP = jVar.p(1390990089);
        if ((i10 & 6) == 0) {
            i11 = (kVarP.K(dVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= kVarP.l(hcVar2) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= kVarP.c(z10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= kVarP.K(mVar) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= kVarP.l(bVar) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= kVarP.l(bVar2) ? 131072 : 65536;
        }
        int i12 = i11;
        if ((74899 & i12) == 74898 && kVarP.s()) {
            kVarP.v();
        } else {
            hcVar2.f26022g = kVarP.f(j2.j2.f14785n) == f3.r.f8829b;
            d.a aVar = d.a.f1143b;
            if (z10) {
                cc ccVar = new cc(hcVar2, null);
                c2.r rVar = c2.s0.f4692a;
                suspendPointerInputElement = new SuspendPointerInputElement(hcVar2, mVar, new s0.a(ccVar), 4);
            } else {
                suspendPointerInputElement = aVar;
            }
            v.t0 t0Var = v.t0.f30084b;
            boolean z11 = hcVar2.f26022g;
            boolean zBooleanValue = ((Boolean) hcVar2.f26025j.getValue()).booleanValue();
            boolean zL = kVarP.l(hcVar2);
            Object objG = kVarP.g();
            androidx.compose.ui.d dVar2 = suspendPointerInputElement;
            j.a.C0321a c0321a = j.a.f31715a;
            if (zL || objG == c0321a) {
                objG = new zb(hcVar2, null);
                kVarP.C(objG);
            }
            androidx.compose.ui.d dVarA = v.x.a(aVar, hcVar2, t0Var, z10, mVar, zBooleanValue, (eh.q) objG, z11, 32);
            hcVar2 = hcVar2;
            x0.s3 s3Var = w4.f27281a;
            androidx.compose.ui.d dVarH = q2.q.a(androidx.compose.foundation.layout.g.l(dVar.h(MinimumInteractiveModifier.f1120b), f25691b, f25690a, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 12), false, new bc(z10, hcVar2)).h(u0.i.f29022b);
            float floatValue = hcVar2.f26018c.getFloatValue();
            jh.d dVar3 = hcVar2.f26017b;
            androidx.compose.ui.d dVarH2 = androidx.compose.foundation.c.a(q2.q.a(dVarH, true, new t.p1(floatValue, hcVar2.f26016a, new jh.d(Float.valueOf(dVar3.f15742a).floatValue(), Float.valueOf(dVar3.f15743b).floatValue()))), z10, mVar).h(dVar2).h(dVarA);
            boolean zL2 = kVarP.l(hcVar2);
            Object objG2 = kVarP.g();
            if (zL2 || objG2 == c0321a) {
                objG2 = new xb(hcVar2);
                kVarP.C(objG2);
            }
            g2.l0 l0Var = (g2.l0) objG2;
            int i13 = kVarP.P;
            x0.a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarH2, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar2 = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar2);
            } else {
                kVarP.z();
            }
            g.a.b bVar3 = g.a.f13867f;
            ph.v1.j(bVar3, l0Var, kVarP);
            g.a.d dVar4 = g.a.f13866e;
            ph.v1.j(dVar4, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i13))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i13, kVarP, i13, c0128a);
            }
            g.a.c cVar = g.a.f13865d;
            ph.v1.j(cVar, dVarC, kVarP);
            androidx.compose.ui.d dVarV = androidx.compose.foundation.layout.g.v(androidx.compose.ui.layout.a.b(aVar, kb.f26288a));
            boolean zL3 = kVarP.l(hcVar2);
            Object objG3 = kVarP.g();
            if (zL3 || objG3 == c0321a) {
                objG3 = new i0.n2(hcVar2, 1);
                kVarP.C(objG3);
            }
            androidx.compose.ui.d dVarA2 = androidx.compose.ui.layout.d.a(dVarV, (eh.l) objG3);
            j1.f fVar = d.a.f14602a;
            g2.l0 l0VarD = z.g.d(fVar, false);
            int i14 = kVarP.P;
            x0.a2 a2VarP2 = kVarP.P();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarA2, kVarP);
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar2);
            } else {
                kVarP.z();
            }
            ph.v1.j(bVar3, l0VarD, kVarP);
            ph.v1.j(dVar4, a2VarP2, kVarP);
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i14))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i14, kVarP, i14, c0128a);
            }
            ph.v1.j(cVar, dVarC2, kVarP);
            int i15 = (i12 >> 3) & 14;
            bVar.b(hcVar2, kVarP, Integer.valueOf(((i12 >> 9) & 112) | i15));
            kVarP.T(true);
            androidx.compose.ui.d dVarB = androidx.compose.ui.layout.a.b(aVar, kb.f26289b);
            g2.l0 l0VarD2 = z.g.d(fVar, false);
            int i16 = kVarP.P;
            x0.a2 a2VarP3 = kVarP.P();
            androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(dVarB, kVarP);
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar2);
            } else {
                kVarP.z();
            }
            ph.v1.j(bVar3, l0VarD2, kVarP);
            ph.v1.j(dVar4, a2VarP3, kVarP);
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i16))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i16, kVarP, i16, c0128a);
            }
            ph.v1.j(cVar, dVarC3, kVarP);
            bVar2.b(hcVar2, kVarP, Integer.valueOf(((i12 >> 12) & 112) | i15));
            kVarP.T(true);
            kVarP.T(true);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new yb(dVar, hcVar2, z10, mVar, bVar, bVar2, i10);
        }
    }

    public static final float e(float f10, float[] fArr, float f11, float f12) {
        Float fValueOf;
        if (fArr.length == 0) {
            fValueOf = null;
        } else {
            float f13 = fArr[0];
            int length = fArr.length - 1;
            if (length == 0) {
                fValueOf = Float.valueOf(f13);
            } else {
                float fAbs = Math.abs(h3.b.b(f11, f12, f13) - f10);
                jh.f it = new jh.g(1, length, 1).iterator();
                while (it.f15749c) {
                    float f14 = fArr[it.nextInt()];
                    float fAbs2 = Math.abs(h3.b.b(f11, f12, f14) - f10);
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        f13 = f14;
                        fAbs = fAbs2;
                    }
                }
                fValueOf = Float.valueOf(f13);
            }
        }
        return fValueOf != null ? h3.b.b(f11, f12, fValueOf.floatValue()) : f10;
    }
}
