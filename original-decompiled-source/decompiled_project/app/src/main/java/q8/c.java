package q8;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.d;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;
import java.util.List;
import org.bouncycastle.asn1.cmc.BodyPartID;
import q1.u0;
import q1.y1;
import s.l0;
import x0.j;
import x0.r3;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final x0.u1 f22133a = new x0.u1(0.15f);

    /* renamed from: b, reason: collision with root package name */
    public static final x0.u1 f22134b = new x0.u1(0.25f);

    /* renamed from: c, reason: collision with root package name */
    public static final x0.u1 f22135c = new x0.u1(0.9f);

    /* renamed from: d, reason: collision with root package name */
    public static final x0.u1 f22136d = new x0.u1(0.7f);

    /* renamed from: e, reason: collision with root package name */
    public static final x0.u1 f22137e = new x0.u1(0.6f);

    /* renamed from: f, reason: collision with root package name */
    public static final x0.u1 f22138f = new x0.u1(0.45f);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02bd  */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v38 */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, x0.j, x0.k] */
    /* JADX WARN: Type inference failed for: r2v15, types: [f1.b] */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(androidx.compose.ui.d dVar, f1.b bVar, x0.j jVar, final int i10) {
        long jC;
        long jC2;
        long jC3;
        long jC4;
        pg.t tVar;
        pg.t tVar2;
        boolean z10;
        long j10;
        ?? r72;
        int i11;
        int i12;
        long j11;
        long j12;
        long j13;
        int i13;
        ?? r10;
        r3 r3Var;
        r3 r3Var2;
        r3 r3Var3;
        r3 r3Var4;
        r3 r3Var5;
        r3 r3Var6;
        boolean z11;
        g.a.b bVar2;
        g.a.C0128a c0128a;
        g.a.c cVar;
        ?? r102;
        androidx.compose.ui.d dVarB;
        int i14;
        final androidx.compose.ui.d dVar2;
        final f1.b bVar3;
        Float fValueOf = Float.valueOf(0.26f);
        Float fValueOf2 = Float.valueOf(0.32f);
        Float fValueOf3 = Float.valueOf(0.1f);
        Float fValueOf4 = Float.valueOf(0.18f);
        Float fValueOf5 = Float.valueOf(0.22f);
        Float fValueOf6 = Float.valueOf(CropImageView.DEFAULT_ASPECT_RATIO);
        ?? P = jVar.p(878356425);
        if (((i10 | 6) & 19) == 18 && P.s()) {
            P.v();
            dVar2 = dVar;
            bVar3 = bVar;
        } else {
            k9.e eVar = (k9.e) P.f(k9.c.f16178b);
            P.L(41119934);
            if (eVar == k9.e.f16205a) {
                jC = ((t0.e2) P.f(t0.f2.f25858a)).f25768n;
            } else if (eVar == k9.e.f16206b) {
                jC = c2.n0.c(4292932350L);
            } else if (eVar == k9.e.f16207c) {
                jC = c2.n0.c(4294763756L);
            } else if (eVar == k9.e.f16208d) {
                jC = c2.n0.c(4293457385L);
            } else if (eVar == k9.e.f16209e) {
                jC = c2.n0.c(4279044884L);
            } else {
                if (eVar != k9.e.f16210f && eVar != k9.e.f16211g) {
                    throw new pg.l();
                }
                jC = c2.n0.c(4278190080L);
            }
            P.T(false);
            switch (eVar.ordinal()) {
                case 0:
                    jC2 = c2.n0.c(4278217567L);
                    break;
                case 1:
                    jC2 = c2.n0.c(4278356177L);
                    break;
                case 2:
                    jC2 = c2.n0.c(4293943954L);
                    break;
                case 3:
                    jC2 = c2.n0.c(4279286145L);
                    break;
                case 4:
                    jC2 = c2.n0.c(4278248908L);
                    break;
                case 5:
                    jC2 = q1.b1.f21653g;
                    break;
                case 6:
                    jC2 = q1.b1.f21653g;
                    break;
                default:
                    throw new pg.l();
            }
            long j14 = jC2;
            switch (eVar.ordinal()) {
                case 0:
                    jC3 = c2.n0.c(4284960932L);
                    break;
                case 1:
                    jC3 = c2.n0.c(4281908728L);
                    break;
                case 2:
                    jC3 = c2.n0.c(4293467747L);
                    break;
                case 3:
                    jC3 = c2.n0.c(4278556265L);
                    break;
                case 4:
                    jC3 = c2.n0.c(4289956095L);
                    break;
                case 5:
                    jC3 = q1.b1.f21653g;
                    break;
                case 6:
                    jC3 = q1.b1.f21653g;
                    break;
                default:
                    throw new pg.l();
            }
            long j15 = jC3;
            switch (eVar.ordinal()) {
                case 0:
                    jC4 = c2.n0.c(4288168033L);
                    break;
                case 1:
                    jC4 = c2.n0.c(4278234305L);
                    break;
                case 2:
                    jC4 = c2.n0.c(4294934699L);
                    break;
                case 3:
                    jC4 = c2.n0.c(4283096704L);
                    break;
                case 4:
                    jC4 = c2.n0.c(4294934699L);
                    break;
                case 5:
                    jC4 = q1.b1.f21653g;
                    break;
                case 6:
                    jC4 = q1.b1.f21653g;
                    break;
                default:
                    throw new pg.l();
            }
            long j16 = jC4;
            switch (eVar.ordinal()) {
                case 0:
                    tVar = new pg.t(fValueOf3, Float.valueOf(0.08f), Float.valueOf(0.06f));
                    final float fFloatValue = ((Number) tVar.f21479a).floatValue();
                    final float fFloatValue2 = ((Number) tVar.f21480b).floatValue();
                    final float fFloatValue3 = ((Number) tVar.f21481c).floatValue();
                    boolean z12 = fFloatValue > CropImageView.DEFAULT_ASPECT_RATIO || fFloatValue2 > CropImageView.DEFAULT_ASPECT_RATIO || fFloatValue3 > CropImageView.DEFAULT_ASPECT_RATIO;
                    P.L(41229127);
                    P.L(41229221);
                    z10 = (z12 || x1.a(P)) ? false : true;
                    P.T(false);
                    if (z10) {
                        j10 = jC;
                        r72 = 0;
                        i11 = 4;
                        i12 = 2;
                        j11 = j14;
                        j12 = j15;
                        j13 = j16;
                        i13 = 5;
                        r10 = 0;
                    } else {
                        P.L(-891045038);
                        s.l0 l0VarC = s.p0.c("bg", P, 0);
                        i11 = 4;
                        r72 = 0;
                        i12 = 2;
                        j10 = jC;
                        j11 = j14;
                        j12 = j15;
                        j13 = j16;
                        i13 = 5;
                        List listJ = qg.p.j(b(l0VarC, -0.2f, 1.2f, 25000, "orb1x", P, 3504), b(l0VarC, 0.1f, 0.9f, 18000, "orb1y", P, 3510), b(l0VarC, 1.2f, -0.2f, 22000, "orb2x", P, 3462), b(l0VarC, 0.8f, 0.2f, 20000, "orb2y", P, 3510), b(l0VarC, 0.5f, 0.8f, 15000, "orb3x", P, 3510), b(l0VarC, -0.1f, 1.1f, 17000, "orb3y", P, 3504));
                        P.T(false);
                        r10 = listJ;
                    }
                    P.T(r72);
                    if (r10 != 0 || (r3Var = (r3) r10.get(r72)) == null) {
                        r3Var = f22133a;
                    }
                    if (r10 != 0 || (r3Var2 = (r3) r10.get(1)) == null) {
                        r3Var2 = f22134b;
                    }
                    if (r10 != 0 || (r3Var3 = (r3) r10.get(i12)) == null) {
                        r3Var3 = f22135c;
                    }
                    if (r10 != 0 || (r3Var4 = (r3) r10.get(3)) == null) {
                        r3Var4 = f22136d;
                    }
                    if (r10 != 0 || (r3Var5 = (r3) r10.get(i11)) == null) {
                        r3Var5 = f22137e;
                    }
                    if (r10 != 0 || (r3Var6 = (r3) r10.get(i13)) == null) {
                        r3Var6 = f22138f;
                    }
                    FillElement fillElement = androidx.compose.foundation.layout.g.f976c;
                    j1.f fVar = d.a.f14602a;
                    z11 = z12;
                    g2.l0 l0VarD = z.g.d(fVar, r72);
                    int i15 = P.P;
                    x0.a2 a2VarP = P.P();
                    androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(fillElement, P);
                    i2.g.f13861o.getClass();
                    e0.a aVar = g.a.f13863b;
                    P.r();
                    if (P.O) {
                        P.z();
                    } else {
                        P.w(aVar);
                    }
                    g.a.b bVar4 = g.a.f13867f;
                    ph.v1.j(bVar4, l0VarD, P);
                    g.a.d dVar3 = g.a.f13866e;
                    ph.v1.j(dVar3, a2VarP, P);
                    g.a.C0128a c0128a2 = g.a.f13868g;
                    if (P.O) {
                        bVar2 = bVar4;
                        if (!kotlin.jvm.internal.r.a(P.g(), Integer.valueOf(i15))) {
                        }
                        g.a.c cVar2 = g.a.f13865d;
                        ph.v1.j(cVar2, dVarC, P);
                        P.L(-232322706);
                        y1.a aVar2 = q1.y1.f21750a;
                        if (z11) {
                            c0128a = c0128a2;
                            cVar = cVar2;
                            androidx.compose.ui.d dVarB2 = androidx.compose.foundation.a.b(fillElement, j10, aVar2);
                            P.L(-232318519);
                            boolean zH = P.h(fFloatValue3) | P.K(r3Var) | P.K(r3Var2) | P.K(r3Var3) | P.K(r3Var4) | P.K(r3Var5) | P.K(r3Var6) | P.j(j11) | P.h(fFloatValue) | P.j(j12) | P.h(fFloatValue2) | P.j(j13);
                            Object objG = P.g();
                            if (zH || objG == j.a.f31715a) {
                                final r3 r3Var7 = r3Var3;
                                final r3 r3Var8 = r3Var4;
                                final r3 r3Var9 = r3Var6;
                                final r3 r3Var10 = r3Var;
                                final r3 r3Var11 = r3Var2;
                                final r3 r3Var12 = r3Var5;
                                final long j17 = j11;
                                final long j18 = j12;
                                final long j19 = j13;
                                objG = new eh.l() { // from class: q8.a
                                    @Override // eh.l
                                    public final Object invoke(Object obj) {
                                        s1.e drawBehind = (s1.e) obj;
                                        kotlin.jvm.internal.r.e(drawBehind, "$this$drawBehind");
                                        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawBehind.i() >> 32));
                                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawBehind.i() & BodyPartID.bodyIdMax));
                                        float fFloatValue4 = ((Number) r3Var10.getValue()).floatValue();
                                        float fFloatValue5 = ((Number) r3Var11.getValue()).floatValue();
                                        float fFloatValue6 = ((Number) r3Var7.getValue()).floatValue();
                                        float fFloatValue7 = ((Number) r3Var8.getValue()).floatValue();
                                        float fFloatValue8 = ((Number) r3Var12.getValue()).floatValue();
                                        float fFloatValue9 = ((Number) r3Var9.getValue()).floatValue();
                                        float f10 = fFloatValue;
                                        long j20 = j17;
                                        List listJ2 = qg.p.j(new q1.b1(q1.b1.c(f10, j20)), new q1.b1(q1.b1.c(CropImageView.DEFAULT_ASPECT_RATIO, j20)));
                                        float f11 = fFloatValue4 * fIntBitsToFloat;
                                        float f12 = fFloatValue5 * fIntBitsToFloat2;
                                        long jFloatToRawIntBits = (Float.floatToRawIntBits(f12) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f11) << 32);
                                        float f13 = 0.55f * fIntBitsToFloat;
                                        drawBehind.x0(u0.a.c(listJ2, jFloatToRawIntBits, f13, 8), f13, (Float.floatToRawIntBits(f12) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f11) << 32), s1.h.f24186a);
                                        float f14 = fFloatValue2;
                                        long j21 = j18;
                                        float f15 = fFloatValue6 * fIntBitsToFloat;
                                        float f16 = fFloatValue7 * fIntBitsToFloat2;
                                        float f17 = 0.6f * fIntBitsToFloat;
                                        drawBehind.x0(u0.a.c(qg.p.j(new q1.b1(q1.b1.c(f14, j21)), new q1.b1(q1.b1.c(CropImageView.DEFAULT_ASPECT_RATIO, j21))), (Float.floatToRawIntBits(f15) << 32) | (Float.floatToRawIntBits(f16) & BodyPartID.bodyIdMax), f17, 8), f17, (Float.floatToRawIntBits(f15) << 32) | (Float.floatToRawIntBits(f16) & BodyPartID.bodyIdMax), s1.h.f24186a);
                                        float f18 = fFloatValue3;
                                        long j22 = j19;
                                        float f19 = fFloatValue8 * fIntBitsToFloat;
                                        float f20 = fFloatValue9 * fIntBitsToFloat2;
                                        float f21 = fIntBitsToFloat * 0.45f;
                                        drawBehind.x0(u0.a.c(qg.p.j(new q1.b1(q1.b1.c(f18, j22)), new q1.b1(q1.b1.c(CropImageView.DEFAULT_ASPECT_RATIO, j22))), (Float.floatToRawIntBits(f19) << 32) | (Float.floatToRawIntBits(f20) & BodyPartID.bodyIdMax), f21, 8), f21, (Float.floatToRawIntBits(f19) << 32) | (Float.floatToRawIntBits(f20) & BodyPartID.bodyIdMax), s1.h.f24186a);
                                        return pg.f0.f21461a;
                                    }
                                };
                                P.C(objG);
                            }
                            r102 = 0;
                            P.T(false);
                            androidx.compose.ui.d dVarA = androidx.compose.ui.draw.a.a(dVarB2, (eh.l) objG);
                            float f10 = 80;
                            float f11 = 0;
                            if (Float.compare(f10, f11) > 0) {
                                Float.compare(f10, f11);
                            }
                            dVarB = androidx.compose.ui.graphics.a.a(dVarA, new n1.a(f10, f10, 0, true));
                        } else {
                            c0128a = c0128a2;
                            cVar = cVar2;
                            r102 = 0;
                            dVarB = androidx.compose.foundation.a.b(fillElement, j10, aVar2);
                        }
                        P.T(r102);
                        z.g.a(dVarB, P, r102);
                        g2.l0 l0VarD2 = z.g.d(fVar, r102);
                        i14 = P.P;
                        x0.a2 a2VarP2 = P.P();
                        androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(fillElement, P);
                        P.r();
                        if (P.O) {
                            P.w(aVar);
                        } else {
                            P.z();
                        }
                        ph.v1.j(bVar2, l0VarD2, P);
                        ph.v1.j(dVar3, a2VarP2, P);
                        if (P.O || !kotlin.jvm.internal.r.a(P.g(), Integer.valueOf(i14))) {
                            org.bouncycastle.jcajce.provider.digest.e.a(i14, P, i14, c0128a);
                        }
                        ph.v1.j(cVar, dVarC2, P);
                        ?? r22 = bVar;
                        r22.b(androidx.compose.foundation.layout.b.f961a, P, 54);
                        P.T(true);
                        P.T(true);
                        dVar2 = d.a.f1143b;
                        bVar3 = r22;
                        break;
                    } else {
                        bVar2 = bVar4;
                    }
                    org.bouncycastle.jcajce.provider.digest.e.a(i15, P, i15, c0128a2);
                    g.a.c cVar22 = g.a.f13865d;
                    ph.v1.j(cVar22, dVarC, P);
                    P.L(-232322706);
                    y1.a aVar22 = q1.y1.f21750a;
                    if (z11) {
                    }
                    P.T(r102);
                    z.g.a(dVarB, P, r102);
                    g2.l0 l0VarD22 = z.g.d(fVar, r102);
                    i14 = P.P;
                    x0.a2 a2VarP22 = P.P();
                    androidx.compose.ui.d dVarC22 = androidx.compose.ui.c.c(fillElement, P);
                    P.r();
                    if (P.O) {
                    }
                    ph.v1.j(bVar2, l0VarD22, P);
                    ph.v1.j(dVar3, a2VarP22, P);
                    if (P.O) {
                        org.bouncycastle.jcajce.provider.digest.e.a(i14, P, i14, c0128a);
                        ph.v1.j(cVar, dVarC22, P);
                        ?? r222 = bVar;
                        r222.b(androidx.compose.foundation.layout.b.f961a, P, 54);
                        P.T(true);
                        P.T(true);
                        dVar2 = d.a.f1143b;
                        bVar3 = r222;
                    }
                    break;
                case 1:
                    tVar = new pg.t(Float.valueOf(0.28f), fValueOf5, fValueOf4);
                    final float fFloatValue4 = ((Number) tVar.f21479a).floatValue();
                    final float fFloatValue22 = ((Number) tVar.f21480b).floatValue();
                    final float fFloatValue32 = ((Number) tVar.f21481c).floatValue();
                    if (fFloatValue4 > CropImageView.DEFAULT_ASPECT_RATIO) {
                        P.L(41229127);
                        P.L(41229221);
                        if (z12) {
                            P.T(false);
                            if (z10) {
                            }
                            P.T(r72);
                            if (r10 != 0) {
                                r3Var = f22133a;
                                if (r10 != 0) {
                                    r3Var2 = f22134b;
                                    if (r10 != 0) {
                                        r3Var3 = f22135c;
                                        if (r10 != 0) {
                                            r3Var4 = f22136d;
                                            if (r10 != 0) {
                                                r3Var5 = f22137e;
                                                if (r10 != 0) {
                                                    r3Var6 = f22138f;
                                                    FillElement fillElement2 = androidx.compose.foundation.layout.g.f976c;
                                                    j1.f fVar2 = d.a.f14602a;
                                                    z11 = z12;
                                                    g2.l0 l0VarD3 = z.g.d(fVar2, r72);
                                                    int i152 = P.P;
                                                    x0.a2 a2VarP3 = P.P();
                                                    androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(fillElement2, P);
                                                    i2.g.f13861o.getClass();
                                                    e0.a aVar3 = g.a.f13863b;
                                                    P.r();
                                                    if (P.O) {
                                                    }
                                                    g.a.b bVar42 = g.a.f13867f;
                                                    ph.v1.j(bVar42, l0VarD3, P);
                                                    g.a.d dVar32 = g.a.f13866e;
                                                    ph.v1.j(dVar32, a2VarP3, P);
                                                    g.a.C0128a c0128a22 = g.a.f13868g;
                                                    if (P.O) {
                                                    }
                                                    org.bouncycastle.jcajce.provider.digest.e.a(i152, P, i152, c0128a22);
                                                    g.a.c cVar222 = g.a.f13865d;
                                                    ph.v1.j(cVar222, dVarC3, P);
                                                    P.L(-232322706);
                                                    y1.a aVar222 = q1.y1.f21750a;
                                                    if (z11) {
                                                    }
                                                    P.T(r102);
                                                    z.g.a(dVarB, P, r102);
                                                    g2.l0 l0VarD222 = z.g.d(fVar2, r102);
                                                    i14 = P.P;
                                                    x0.a2 a2VarP222 = P.P();
                                                    androidx.compose.ui.d dVarC222 = androidx.compose.ui.c.c(fillElement2, P);
                                                    P.r();
                                                    if (P.O) {
                                                    }
                                                    ph.v1.j(bVar2, l0VarD222, P);
                                                    ph.v1.j(dVar32, a2VarP222, P);
                                                    if (P.O) {
                                                    }
                                                    break;
                                                }
                                                break;
                                            }
                                            break;
                                        }
                                        break;
                                    }
                                    break;
                                }
                                break;
                            }
                            break;
                        }
                        break;
                    }
                    break;
                case 2:
                    tVar2 = new pg.t(fValueOf2, fValueOf, fValueOf5);
                    tVar = tVar2;
                    final float fFloatValue42 = ((Number) tVar.f21479a).floatValue();
                    final float fFloatValue222 = ((Number) tVar.f21480b).floatValue();
                    final float fFloatValue322 = ((Number) tVar.f21481c).floatValue();
                    if (fFloatValue42 > CropImageView.DEFAULT_ASPECT_RATIO) {
                    }
                    break;
                case 3:
                    tVar2 = new pg.t(fValueOf2, fValueOf, fValueOf5);
                    tVar = tVar2;
                    final float fFloatValue422 = ((Number) tVar.f21479a).floatValue();
                    final float fFloatValue2222 = ((Number) tVar.f21480b).floatValue();
                    final float fFloatValue3222 = ((Number) tVar.f21481c).floatValue();
                    if (fFloatValue422 > CropImageView.DEFAULT_ASPECT_RATIO) {
                    }
                    break;
                case 4:
                    tVar = new pg.t(fValueOf4, Float.valueOf(0.14f), fValueOf3);
                    final float fFloatValue4222 = ((Number) tVar.f21479a).floatValue();
                    final float fFloatValue22222 = ((Number) tVar.f21480b).floatValue();
                    final float fFloatValue32222 = ((Number) tVar.f21481c).floatValue();
                    if (fFloatValue4222 > CropImageView.DEFAULT_ASPECT_RATIO) {
                    }
                    break;
                case 5:
                    tVar = new pg.t(fValueOf6, fValueOf6, fValueOf6);
                    final float fFloatValue42222 = ((Number) tVar.f21479a).floatValue();
                    final float fFloatValue222222 = ((Number) tVar.f21480b).floatValue();
                    final float fFloatValue322222 = ((Number) tVar.f21481c).floatValue();
                    if (fFloatValue42222 > CropImageView.DEFAULT_ASPECT_RATIO) {
                    }
                    break;
                case 6:
                    tVar = new pg.t(fValueOf6, fValueOf6, fValueOf6);
                    final float fFloatValue422222 = ((Number) tVar.f21479a).floatValue();
                    final float fFloatValue2222222 = ((Number) tVar.f21480b).floatValue();
                    final float fFloatValue3222222 = ((Number) tVar.f21481c).floatValue();
                    if (fFloatValue422222 > CropImageView.DEFAULT_ASPECT_RATIO) {
                    }
                    break;
                default:
                    throw new pg.l();
            }
        }
        x0.h2 h2VarV = P.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(bVar3, i10) { // from class: q8.b

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ f1.b f22110b;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(49);
                    c.a(this.f22109a, this.f22110b, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final l0.a b(s.l0 l0Var, float f10, float f11, int i10, String str, x0.j jVar, int i11) {
        jVar.L(-1285051034);
        int i12 = i11 << 3;
        l0.a aVarA = s.p0.a(l0Var, f10, f11, s.m.a(s.m.d(i10, 0, s.d0.f23706d, 2), s.y0.f23999b, 4), str, jVar, (i12 & 896) | (i12 & 112) | 8 | 28672, 0);
        jVar.B();
        return aVarA;
    }
}
