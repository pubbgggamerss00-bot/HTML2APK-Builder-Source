package u0;

import androidx.compose.ui.d;
import com.android.apksig.internal.apk.v4.V4Signature;
import com.yalantis.ucrop.view.CropImageView;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import s.c2;
import s.n2;
import s.o2;
import s.p2;
import s.y1;
import t0.df;
import t0.nf;
import t0.of;
import t0.w9;
import x0.h2;
import x0.j;
import x0.r3;
import x0.u3;
import y2.v;

/* loaded from: classes.dex */
public final class t1 {

    /* renamed from: b, reason: collision with root package name */
    public static final float f29148b;

    /* renamed from: g, reason: collision with root package name */
    public static final float f29153g;

    /* renamed from: h, reason: collision with root package name */
    public static final float f29154h;

    /* renamed from: i, reason: collision with root package name */
    public static final androidx.compose.ui.d f29155i;

    /* renamed from: a, reason: collision with root package name */
    public static final long f29147a = f3.c.a(0, 0, 0, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final float f29149c = 12;

    /* renamed from: d, reason: collision with root package name */
    public static final float f29150d = 4;

    /* renamed from: e, reason: collision with root package name */
    public static final float f29151e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final float f29152f = 24;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29156a;

        static {
            int[] iArr = new int[x1.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[h0.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f29156a = iArr2;
        }
    }

    static {
        float f10 = 16;
        f29148b = f10;
        f29153g = f10;
        f29154h = f10;
        float f11 = 48;
        f29155i = androidx.compose.foundation.layout.g.a(d.a.f1143b, f11, f11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x043d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x064a  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0654  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x067e  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0681  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0695  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x06ab  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x06e0  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x070c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(String str, eh.p pVar, y2.q0 q0Var, eh.p pVar2, eh.p pVar3, eh.p pVar4, eh.p pVar5, eh.p pVar6, eh.p pVar7, eh.p pVar8, boolean z10, boolean z11, boolean z12, x.l lVar, z.f1 f1Var, df dfVar, eh.p pVar9, x0.j jVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        String str2;
        long j10;
        float f10;
        int iOrdinal;
        float f11;
        int iOrdinal2;
        float f12;
        int iOrdinal3;
        float f13;
        int iOrdinal4;
        x0.x1 x1Var;
        float f14;
        int iOrdinal5;
        int[] iArr;
        r1.c cVarG;
        boolean zK;
        Object objG;
        h0 h0Var;
        boolean z13;
        long j11;
        r1.c cVarG2;
        boolean zK2;
        Object objG2;
        j.a.C0321a c0321a;
        boolean z14;
        y1.d dVar;
        t2.l0 l0Var;
        t2.l0 l0Var2;
        float f15;
        f1.b bVarB;
        Object objG3;
        u3 u3Var;
        u3 u3Var2;
        f1.b bVarB2;
        Object objG4;
        y1.d dVar2;
        f1.b bVarB3;
        eh.p pVar10;
        f1.b bVarB4;
        Object objA;
        x0.n1 n1Var;
        eh.p pVar11;
        boolean zH;
        Object objG5;
        x0.k kVarP = jVar.p(1514469103);
        if ((i10 & 6) == 0) {
            i12 = (kVarP.K(x1.f29178a) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i15 = i12;
        if ((i10 & 48) == 0) {
            i13 = i15 | (kVarP.K(str) ? 32 : 16);
        } else {
            i13 = i15;
        }
        if ((i10 & 384) == 0) {
            i13 |= kVarP.l(pVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i13 |= kVarP.K(q0Var) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i13 |= kVarP.l(pVar2) ? 16384 : 8192;
        }
        if ((i10 & 196608) == 0) {
            i13 |= kVarP.l(pVar3) ? 131072 : 65536;
        }
        int i16 = i10 & 1572864;
        int i17 = PKIFailureInfo.signerNotTrusted;
        if (i16 == 0) {
            i13 |= kVarP.l(pVar4) ? 1048576 : 524288;
        }
        if ((i10 & 12582912) == 0) {
            i13 |= kVarP.l(pVar5) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i13 |= kVarP.l(pVar6) ? 67108864 : 33554432;
        }
        if ((i10 & 805306368) == 0) {
            i13 |= kVarP.l(pVar7) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        int i18 = i13;
        if ((i11 & 6) == 0) {
            i14 = i11 | (kVarP.l(pVar8) ? 4 : 2);
        } else {
            i14 = i11;
        }
        if ((i11 & 48) == 0) {
            i14 |= kVarP.c(z10) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i14 |= kVarP.c(z11) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i14 |= kVarP.c(z12) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i14 |= kVarP.K(lVar) ? 16384 : 8192;
        }
        if ((i11 & 196608) == 0) {
            i14 |= kVarP.K(f1Var) ? 131072 : 65536;
        }
        df dfVar2 = dfVar;
        if ((i11 & 1572864) == 0) {
            if (kVarP.K(dfVar2)) {
                i17 = 1048576;
            }
            i14 |= i17;
        }
        if ((i11 & 12582912) == 0) {
            i14 |= kVarP.l(pVar9) ? 8388608 : 4194304;
        }
        int i19 = i14;
        if ((i18 & 306783379) == 306783378 && (i19 & 4793491) == 4793490 && kVarP.s()) {
            kVarP.v();
            pVar11 = pVar9;
            pVar10 = pVar8;
        } else {
            boolean z15 = ((i18 & V4Signature.MAX_SIGNING_INFOS_SIZE) == 2048) | ((i18 & 112) == 32);
            Object objG6 = kVarP.g();
            j.a.C0321a c0321a2 = j.a.f31715a;
            if (z15 || objG6 == c0321a2) {
                t2.b bVar = new t2.b(6, str, null);
                ((y2.p0) q0Var).getClass();
                y2.o0 o0Var = new y2.o0(bVar, v.a.f33769a);
                kVarP.C(o0Var);
                objG6 = o0Var;
            }
            String str3 = ((y2.o0) objG6).f33759a.f27761b;
            boolean zBooleanValue = ((Boolean) x.h.a(lVar, kVarP, (i19 >> 12) & 14).getValue()).booleanValue();
            h0 h0Var2 = zBooleanValue ? h0.f29014a : str3.length() == 0 ? h0.f29015b : h0.f29016c;
            if (z11) {
                str2 = str3;
                j10 = z12 ? dfVar2.A : zBooleanValue ? dfVar2.f25728x : dfVar2.f25729y;
            } else {
                str2 = str3;
                j10 = dfVar2.f25730z;
            }
            nf nfVar = (nf) kVarP.f(of.f26647a);
            t2.l0 l0Var3 = nfVar.f26547j;
            t2.l0 l0Var4 = nfVar.f26549l;
            long jB = l0Var3.b();
            long j12 = q1.b1.f21654h;
            boolean z16 = (q1.b1.d(jB, j12) && !q1.b1.d(l0Var4.b(), j12)) || (!q1.b1.d(l0Var3.b(), j12) && q1.b1.d(l0Var4.b(), j12));
            long jB2 = l0Var4.b();
            if (z16 && jB2 == 16) {
                jB2 = j10;
            }
            long jB3 = l0Var3.b();
            long j13 = (z16 && jB3 == 16) ? j10 : jB3;
            boolean z17 = pVar2 != null;
            long j14 = jB2;
            s.y1 y1VarE = c2.e(h0Var2, "TextFieldInputState", kVarP, 48, 0);
            c2.g0 g0Var = y1VarE.f24001a;
            x0.x1 x1Var2 = y1VarE.f24004d;
            o2 o2Var = p2.f23868a;
            h0 h0Var3 = (h0) g0Var.V();
            kVarP.L(-2036730335);
            int iOrdinal6 = h0Var3.ordinal();
            float f16 = CropImageView.DEFAULT_ASPECT_RATIO;
            if (iOrdinal6 == 0) {
                f10 = 1.0f;
                kVarP.T(false);
                Float fValueOf = Float.valueOf(f10);
                h0 h0Var4 = (h0) x1Var2.getValue();
                kVarP.L(-2036730335);
                iOrdinal = h0Var4.ordinal();
                if (iOrdinal == 0) {
                    f11 = 1.0f;
                    kVarP.T(false);
                    y1.d dVarC = c2.c(y1VarE, fValueOf, Float.valueOf(f11), p1.f29114a.b(y1VarE.f(), kVarP, 0), o2Var, kVarP, 196608);
                    h0 h0Var5 = (h0) g0Var.V();
                    kVarP.L(1435837472);
                    iOrdinal2 = h0Var5.ordinal();
                    if (iOrdinal2 == 0) {
                        f12 = 1.0f;
                        kVarP.T(false);
                        Float fValueOf2 = Float.valueOf(f12);
                        h0 h0Var6 = (h0) x1Var2.getValue();
                        kVarP.L(1435837472);
                        iOrdinal3 = h0Var6.ordinal();
                        if (iOrdinal3 == 0) {
                            f13 = 1.0f;
                            kVarP.T(false);
                            y1.d dVarC2 = c2.c(y1VarE, fValueOf2, Float.valueOf(f13), r1.f29131a.b(y1VarE.f(), kVarP, 0), o2Var, kVarP, 196608);
                            h0 h0Var7 = (h0) g0Var.V();
                            kVarP.L(1128033978);
                            iOrdinal4 = h0Var7.ordinal();
                            if (iOrdinal4 != 0) {
                                x1Var = x1Var2;
                                if (iOrdinal4 == 1) {
                                    if (z17) {
                                        f14 = 0.0f;
                                    }
                                    kVarP.T(false);
                                    Float fValueOf3 = Float.valueOf(f14);
                                    h0 h0Var8 = (h0) x1Var.getValue();
                                    kVarP.L(1128033978);
                                    iOrdinal5 = h0Var8.ordinal();
                                    if (iOrdinal5 == 0) {
                                        f16 = 1.0f;
                                        kVarP.T(false);
                                        y1.d dVarC3 = c2.c(y1VarE, fValueOf3, Float.valueOf(f16), s1.f29136a.b(y1VarE.f(), kVarP, 0), o2Var, kVarP, 196608);
                                        h0 h0Var9 = (h0) x1Var.getValue();
                                        kVarP.L(-107432127);
                                        iArr = a.f29156a;
                                        long j15 = iArr[h0Var9.ordinal()] == 1 ? j14 : j13;
                                        kVarP.T(false);
                                        cVarG = q1.b1.g(j15);
                                        zK = kVarP.K(cVarG);
                                        objG = kVarP.g();
                                        if (zK || objG == c0321a2) {
                                            objG = (n2) r.m0.f22884a.invoke(cVarG);
                                            kVarP.C(objG);
                                        }
                                        n2 n2Var = (n2) objG;
                                        h0Var = (h0) g0Var.V();
                                        kVarP.L(-107432127);
                                        if (iArr[h0Var.ordinal()] != 1) {
                                            z13 = z16;
                                            j11 = j14;
                                        } else {
                                            z13 = z16;
                                            j11 = j13;
                                        }
                                        kVarP.T(false);
                                        q1.b1 b1Var = new q1.b1(j11);
                                        h0 h0Var10 = (h0) x1Var.getValue();
                                        kVarP.L(-107432127);
                                        long j16 = iArr[h0Var10.ordinal()] != 1 ? j14 : j13;
                                        kVarP.T(false);
                                        y1.d dVarC4 = c2.c(y1VarE, b1Var, new q1.b1(j16), q1.f29122a.b(y1VarE.f(), kVarP, 0), n2Var, kVarP, 196608);
                                        kVarP.L(1023351670);
                                        kVarP.T(false);
                                        cVarG2 = q1.b1.g(j10);
                                        zK2 = kVarP.K(cVarG2);
                                        objG2 = kVarP.g();
                                        if (!zK2 || objG2 == c0321a2) {
                                            objG2 = (n2) r.m0.f22884a.invoke(cVarG2);
                                            kVarP.C(objG2);
                                        }
                                        n2 n2Var2 = (n2) objG2;
                                        kVarP.L(1023351670);
                                        kVarP.T(false);
                                        q1.b1 b1Var2 = new q1.b1(j10);
                                        kVarP.L(1023351670);
                                        kVarP.T(false);
                                        y1.d dVarC5 = c2.c(y1VarE, b1Var2, new q1.b1(j10), o1.f29089a.b(y1VarE.f(), kVarP, 0), n2Var2, kVarP, 196608);
                                        float fFloatValue = ((Number) dVarC.f24031k.getValue()).floatValue();
                                        kVarP.L(-156998101);
                                        if (pVar2 != null) {
                                            dfVar2 = dfVar;
                                            c0321a = c0321a2;
                                            f15 = fFloatValue;
                                            z14 = false;
                                            l0Var2 = l0Var4;
                                            l0Var = l0Var3;
                                            dVar = dVarC3;
                                            bVarB = null;
                                        } else {
                                            dfVar2 = dfVar;
                                            c0321a = c0321a2;
                                            z14 = false;
                                            dVar = dVarC3;
                                            z0 z0Var = new z0(l0Var3, l0Var4, fFloatValue, dVarC5, pVar2, z13, dVarC4);
                                            l0Var = l0Var3;
                                            l0Var2 = l0Var4;
                                            f15 = fFloatValue;
                                            bVarB = f1.c.b(-1236585568, z0Var, kVarP);
                                        }
                                        kVarP.T(z14);
                                        long j17 = z11 ? dfVar2.D : z12 ? dfVar2.E : zBooleanValue ? dfVar2.B : dfVar2.C;
                                        objG3 = kVarP.g();
                                        u3Var = u3.f31923a;
                                        if (objG3 == c0321a) {
                                            objG3 = bg.b.e(new j1(dVarC2), u3Var);
                                            kVarP.C(objG3);
                                        }
                                        r3 r3Var = (r3) objG3;
                                        kVarP.L(-156965270);
                                        if (pVar3 == null && str2.length() == 0 && ((Boolean) r3Var.getValue()).booleanValue()) {
                                            u3Var2 = u3Var;
                                            bVarB2 = f1.c.b(-660524084, new c1(dVarC2, j17, l0Var, pVar3), kVarP);
                                        } else {
                                            u3Var2 = u3Var;
                                            bVarB2 = null;
                                        }
                                        kVarP.T(z14);
                                        long j18 = z11 ? dfVar2.L : z12 ? dfVar2.M : zBooleanValue ? dfVar2.J : dfVar2.K;
                                        objG4 = kVarP.g();
                                        if (objG4 == c0321a) {
                                            objG4 = bg.b.e(new k1(dVar), u3Var2);
                                            kVarP.C(objG4);
                                        }
                                        r3 r3Var2 = (r3) objG4;
                                        kVarP.L(-156940524);
                                        if (pVar6 == null && ((Boolean) r3Var2.getValue()).booleanValue()) {
                                            dVar2 = dVar;
                                            bVarB3 = f1.c.b(274398694, new e1(dVar2, j18, l0Var, pVar6), kVarP);
                                        } else {
                                            dVar2 = dVar;
                                            bVarB3 = null;
                                        }
                                        kVarP.T(z14);
                                        long j19 = z11 ? dfVar2.P : z12 ? dfVar2.Q : zBooleanValue ? dfVar2.N : dfVar2.O;
                                        kVarP.L(-156921964);
                                        f1.b bVarB5 = (pVar7 == null && ((Boolean) r3Var2.getValue()).booleanValue()) ? f1.c.b(-1526229403, new g1(dVar2, j19, l0Var, pVar7), kVarP) : null;
                                        kVarP.T(z14);
                                        long j20 = z11 ? dfVar2.f25722r : z12 ? dfVar2.f25723s : zBooleanValue ? dfVar2.f25720p : dfVar2.f25721q;
                                        kVarP.L(-156902962);
                                        f1.b bVarB6 = pVar4 != null ? null : f1.c.b(-130107406, new a1(j20, pVar4), kVarP);
                                        kVarP.T(z14);
                                        long j21 = z11 ? dfVar2.f25726v : z12 ? dfVar2.f25727w : zBooleanValue ? dfVar2.f25724t : dfVar2.f25725u;
                                        kVarP.L(-156893937);
                                        f1.b bVarB7 = pVar5 != null ? null : f1.c.b(2079816678, new i1(j21, pVar5), kVarP);
                                        kVarP.T(z14);
                                        long j22 = z11 ? dfVar2.H : z12 ? dfVar2.I : zBooleanValue ? dfVar2.F : dfVar2.G;
                                        kVarP.L(-156884470);
                                        if (pVar8 != null) {
                                            pVar10 = pVar8;
                                            bVarB4 = null;
                                        } else {
                                            pVar10 = pVar8;
                                            bVarB4 = f1.c.b(1263707005, new h1(j22, l0Var2, pVar10), kVarP);
                                        }
                                        objA = p0.h.a(kVarP, z14, -567018607);
                                        if (objA == c0321a) {
                                            objA = bg.b.h(new p1.h(0L));
                                            kVarP.C(objA);
                                        }
                                        n1Var = (x0.n1) objA;
                                        pVar11 = pVar9;
                                        f1.b bVarB8 = f1.c.b(157291737, new y0(n1Var, f1Var, pVar11), kVarP);
                                        zH = kVarP.h(f15);
                                        objG5 = kVarP.g();
                                        if (!zH || objG5 == c0321a) {
                                            objG5 = new w0(f15, n1Var);
                                            kVarP.C(objG5);
                                        }
                                        w9.c(pVar, bVarB2, bVarB, bVarB6, bVarB7, bVarB3, bVarB5, z10, f15, (eh.l) objG5, bVarB8, bVarB4, f1Var, kVarP, ((i18 >> 3) & 112) | 6 | ((i19 << 21) & 234881024), ((i19 >> 6) & V4Signature.MAX_SIGNING_INFOS_SIZE) | 48);
                                        kVarP = kVarP;
                                        kVarP.T(z14);
                                        pg.f0 f0Var = pg.f0.f21461a;
                                    } else {
                                        if (iOrdinal5 == 1) {
                                            if (!z17) {
                                            }
                                            kVarP.T(false);
                                            y1.d dVarC32 = c2.c(y1VarE, fValueOf3, Float.valueOf(f16), s1.f29136a.b(y1VarE.f(), kVarP, 0), o2Var, kVarP, 196608);
                                            h0 h0Var92 = (h0) x1Var.getValue();
                                            kVarP.L(-107432127);
                                            iArr = a.f29156a;
                                            if (iArr[h0Var92.ordinal()] == 1) {
                                            }
                                            kVarP.T(false);
                                            cVarG = q1.b1.g(j15);
                                            zK = kVarP.K(cVarG);
                                            objG = kVarP.g();
                                            if (zK) {
                                                objG = (n2) r.m0.f22884a.invoke(cVarG);
                                                kVarP.C(objG);
                                                n2 n2Var3 = (n2) objG;
                                                h0Var = (h0) g0Var.V();
                                                kVarP.L(-107432127);
                                                if (iArr[h0Var.ordinal()] != 1) {
                                                }
                                                kVarP.T(false);
                                                q1.b1 b1Var3 = new q1.b1(j11);
                                                h0 h0Var102 = (h0) x1Var.getValue();
                                                kVarP.L(-107432127);
                                                if (iArr[h0Var102.ordinal()] != 1) {
                                                }
                                                kVarP.T(false);
                                                y1.d dVarC42 = c2.c(y1VarE, b1Var3, new q1.b1(j16), q1.f29122a.b(y1VarE.f(), kVarP, 0), n2Var3, kVarP, 196608);
                                                kVarP.L(1023351670);
                                                kVarP.T(false);
                                                cVarG2 = q1.b1.g(j10);
                                                zK2 = kVarP.K(cVarG2);
                                                objG2 = kVarP.g();
                                                if (!zK2) {
                                                    objG2 = (n2) r.m0.f22884a.invoke(cVarG2);
                                                    kVarP.C(objG2);
                                                    n2 n2Var22 = (n2) objG2;
                                                    kVarP.L(1023351670);
                                                    kVarP.T(false);
                                                    q1.b1 b1Var22 = new q1.b1(j10);
                                                    kVarP.L(1023351670);
                                                    kVarP.T(false);
                                                    y1.d dVarC52 = c2.c(y1VarE, b1Var22, new q1.b1(j10), o1.f29089a.b(y1VarE.f(), kVarP, 0), n2Var22, kVarP, 196608);
                                                    float fFloatValue2 = ((Number) dVarC.f24031k.getValue()).floatValue();
                                                    kVarP.L(-156998101);
                                                    if (pVar2 != null) {
                                                    }
                                                    kVarP.T(z14);
                                                    long j172 = z11 ? dfVar2.D : z12 ? dfVar2.E : zBooleanValue ? dfVar2.B : dfVar2.C;
                                                    objG3 = kVarP.g();
                                                    u3Var = u3.f31923a;
                                                    if (objG3 == c0321a) {
                                                    }
                                                    r3 r3Var3 = (r3) objG3;
                                                    kVarP.L(-156965270);
                                                    if (pVar3 == null) {
                                                        u3Var2 = u3Var;
                                                        bVarB2 = null;
                                                        kVarP.T(z14);
                                                        long j182 = z11 ? dfVar2.L : z12 ? dfVar2.M : zBooleanValue ? dfVar2.J : dfVar2.K;
                                                        objG4 = kVarP.g();
                                                        if (objG4 == c0321a) {
                                                        }
                                                        r3 r3Var22 = (r3) objG4;
                                                        kVarP.L(-156940524);
                                                        if (pVar6 == null) {
                                                            dVar2 = dVar;
                                                            bVarB3 = null;
                                                            kVarP.T(z14);
                                                            if (z11) {
                                                            }
                                                            kVarP.L(-156921964);
                                                            if (pVar7 == null) {
                                                                kVarP.T(z14);
                                                                if (z11) {
                                                                }
                                                                kVarP.L(-156902962);
                                                                if (pVar4 != null) {
                                                                }
                                                                kVarP.T(z14);
                                                                if (z11) {
                                                                }
                                                                kVarP.L(-156893937);
                                                                if (pVar5 != null) {
                                                                }
                                                                kVarP.T(z14);
                                                                if (z11) {
                                                                }
                                                                kVarP.L(-156884470);
                                                                if (pVar8 != null) {
                                                                }
                                                                objA = p0.h.a(kVarP, z14, -567018607);
                                                                if (objA == c0321a) {
                                                                }
                                                                n1Var = (x0.n1) objA;
                                                                pVar11 = pVar9;
                                                                f1.b bVarB82 = f1.c.b(157291737, new y0(n1Var, f1Var, pVar11), kVarP);
                                                                zH = kVarP.h(f15);
                                                                objG5 = kVarP.g();
                                                                if (!zH) {
                                                                    objG5 = new w0(f15, n1Var);
                                                                    kVarP.C(objG5);
                                                                    w9.c(pVar, bVarB2, bVarB, bVarB6, bVarB7, bVarB3, bVarB5, z10, f15, (eh.l) objG5, bVarB82, bVarB4, f1Var, kVarP, ((i18 >> 3) & 112) | 6 | ((i19 << 21) & 234881024), ((i19 >> 6) & V4Signature.MAX_SIGNING_INFOS_SIZE) | 48);
                                                                    kVarP = kVarP;
                                                                    kVarP.T(z14);
                                                                    pg.f0 f0Var2 = pg.f0.f21461a;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (iOrdinal5 != 2) {
                                            throw new pg.l();
                                        }
                                        f16 = 1.0f;
                                        kVarP.T(false);
                                        y1.d dVarC322 = c2.c(y1VarE, fValueOf3, Float.valueOf(f16), s1.f29136a.b(y1VarE.f(), kVarP, 0), o2Var, kVarP, 196608);
                                        h0 h0Var922 = (h0) x1Var.getValue();
                                        kVarP.L(-107432127);
                                        iArr = a.f29156a;
                                        if (iArr[h0Var922.ordinal()] == 1) {
                                        }
                                        kVarP.T(false);
                                        cVarG = q1.b1.g(j15);
                                        zK = kVarP.K(cVarG);
                                        objG = kVarP.g();
                                        if (zK) {
                                        }
                                    }
                                } else if (iOrdinal4 != 2) {
                                    throw new pg.l();
                                }
                            } else {
                                x1Var = x1Var2;
                            }
                            f14 = 1.0f;
                            kVarP.T(false);
                            Float fValueOf32 = Float.valueOf(f14);
                            h0 h0Var82 = (h0) x1Var.getValue();
                            kVarP.L(1128033978);
                            iOrdinal5 = h0Var82.ordinal();
                            if (iOrdinal5 == 0) {
                            }
                        } else {
                            if (iOrdinal3 == 1) {
                                if (z17) {
                                }
                                kVarP.T(false);
                                y1.d dVarC22 = c2.c(y1VarE, fValueOf2, Float.valueOf(f13), r1.f29131a.b(y1VarE.f(), kVarP, 0), o2Var, kVarP, 196608);
                                h0 h0Var72 = (h0) g0Var.V();
                                kVarP.L(1128033978);
                                iOrdinal4 = h0Var72.ordinal();
                                if (iOrdinal4 != 0) {
                                }
                                f14 = 1.0f;
                                kVarP.T(false);
                                Float fValueOf322 = Float.valueOf(f14);
                                h0 h0Var822 = (h0) x1Var.getValue();
                                kVarP.L(1128033978);
                                iOrdinal5 = h0Var822.ordinal();
                                if (iOrdinal5 == 0) {
                                }
                            } else if (iOrdinal3 != 2) {
                                throw new pg.l();
                            }
                            f13 = 0.0f;
                            kVarP.T(false);
                            y1.d dVarC222 = c2.c(y1VarE, fValueOf2, Float.valueOf(f13), r1.f29131a.b(y1VarE.f(), kVarP, 0), o2Var, kVarP, 196608);
                            h0 h0Var722 = (h0) g0Var.V();
                            kVarP.L(1128033978);
                            iOrdinal4 = h0Var722.ordinal();
                            if (iOrdinal4 != 0) {
                            }
                            f14 = 1.0f;
                            kVarP.T(false);
                            Float fValueOf3222 = Float.valueOf(f14);
                            h0 h0Var8222 = (h0) x1Var.getValue();
                            kVarP.L(1128033978);
                            iOrdinal5 = h0Var8222.ordinal();
                            if (iOrdinal5 == 0) {
                            }
                        }
                    } else {
                        if (iOrdinal2 == 1) {
                            if (z17) {
                            }
                            kVarP.T(false);
                            Float fValueOf22 = Float.valueOf(f12);
                            h0 h0Var62 = (h0) x1Var2.getValue();
                            kVarP.L(1435837472);
                            iOrdinal3 = h0Var62.ordinal();
                            if (iOrdinal3 == 0) {
                            }
                        } else if (iOrdinal2 != 2) {
                            throw new pg.l();
                        }
                        f12 = 0.0f;
                        kVarP.T(false);
                        Float fValueOf222 = Float.valueOf(f12);
                        h0 h0Var622 = (h0) x1Var2.getValue();
                        kVarP.L(1435837472);
                        iOrdinal3 = h0Var622.ordinal();
                        if (iOrdinal3 == 0) {
                        }
                    }
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new pg.l();
                    }
                    f11 = 1.0f;
                    kVarP.T(false);
                    y1.d dVarC6 = c2.c(y1VarE, fValueOf, Float.valueOf(f11), p1.f29114a.b(y1VarE.f(), kVarP, 0), o2Var, kVarP, 196608);
                    h0 h0Var52 = (h0) g0Var.V();
                    kVarP.L(1435837472);
                    iOrdinal2 = h0Var52.ordinal();
                    if (iOrdinal2 == 0) {
                    }
                } else {
                    f11 = 0.0f;
                    kVarP.T(false);
                    y1.d dVarC62 = c2.c(y1VarE, fValueOf, Float.valueOf(f11), p1.f29114a.b(y1VarE.f(), kVarP, 0), o2Var, kVarP, 196608);
                    h0 h0Var522 = (h0) g0Var.V();
                    kVarP.L(1435837472);
                    iOrdinal2 = h0Var522.ordinal();
                    if (iOrdinal2 == 0) {
                    }
                }
            } else if (iOrdinal6 != 1) {
                if (iOrdinal6 != 2) {
                    throw new pg.l();
                }
                f10 = 1.0f;
                kVarP.T(false);
                Float fValueOf4 = Float.valueOf(f10);
                h0 h0Var42 = (h0) x1Var2.getValue();
                kVarP.L(-2036730335);
                iOrdinal = h0Var42.ordinal();
                if (iOrdinal == 0) {
                }
            } else {
                f10 = 0.0f;
                kVarP.T(false);
                Float fValueOf42 = Float.valueOf(f10);
                h0 h0Var422 = (h0) x1Var2.getValue();
                kVarP.L(-2036730335);
                iOrdinal = h0Var422.ordinal();
                if (iOrdinal == 0) {
                }
            }
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new l1(str, pVar, q0Var, pVar2, pVar3, pVar4, pVar5, pVar6, pVar7, pVar10, z10, z11, z12, lVar, f1Var, dfVar2, pVar11, i10, i11);
        }
    }

    public static final void b(long j10, t2.l0 l0Var, eh.p pVar, x0.j jVar, int i10) {
        int i11;
        long j11;
        t2.l0 l0Var2;
        eh.p pVar2;
        x0.k kVarP = jVar.p(1208685580);
        if ((i10 & 6) == 0) {
            i11 = (kVarP.j(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= kVarP.K(l0Var) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= kVarP.l(pVar) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && kVarP.s()) {
            kVarP.v();
            pVar2 = pVar;
            l0Var2 = l0Var;
            j11 = j10;
        } else {
            v0.a(j10, l0Var, pVar, kVarP, i11 & 1022);
            j11 = j10;
            l0Var2 = l0Var;
            pVar2 = pVar;
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new m1(j11, l0Var2, pVar2, i10);
        }
    }

    public static final void c(long j10, eh.p pVar, x0.j jVar, int i10) {
        int i11;
        x0.k kVarP = jVar.p(660142980);
        if ((i10 & 6) == 0) {
            i11 = (kVarP.j(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= kVarP.l(pVar) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && kVarP.s()) {
            kVarP.v();
        } else {
            x0.y.a(com.android.aapt.a.b(j10, t0.p2.f26666a), pVar, kVarP, (i11 & 112) | 8);
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new n1(j10, pVar, i10);
        }
    }

    public static final Object d(g2.p pVar) {
        Object objW = pVar.w();
        g2.y yVar = objW instanceof g2.y ? (g2.y) objW : null;
        if (yVar != null) {
            return yVar.T();
        }
        return null;
    }
}
