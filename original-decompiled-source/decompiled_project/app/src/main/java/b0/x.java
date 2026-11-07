package b0;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import com.yalantis.ucrop.view.CropImageView;
import d0.j2;
import d0.q1;
import h1.h;
import j1.d;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.cmc.BodyPartID;
import q1.k1;
import x0.n1;
import z.b;
import z.f1;

/* loaded from: classes.dex */
public final class x extends kotlin.jvm.internal.s implements eh.p<d0.q0, f3.b, f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m0 f3466a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f3467b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1 f3468c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eh.a<o> f3469d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b.l f3470e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b.e f3471f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ph.i0 f3472g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k1 f3473h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j2 f3474j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ d.b f3475k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d.c f3476l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(m0 m0Var, boolean z10, f1 f1Var, kh.g gVar, b.l lVar, b.e eVar, ph.i0 i0Var, k1 k1Var, j2.a.C0077a c0077a, d.b bVar, d.c cVar) {
        super(2);
        this.f3466a = m0Var;
        this.f3467b = z10;
        this.f3468c = f1Var;
        this.f3469d = gVar;
        this.f3470e = lVar;
        this.f3471f = eVar;
        this.f3472g = i0Var;
        this.f3473h = k1Var;
        this.f3474j = c0077a;
        this.f3475k = bVar;
        this.f3476l = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:269:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0637 A[LOOP:15: B:290:0x0635->B:291:0x0637, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:299:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0662  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0673  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x067f  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0751  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x07e0  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0833  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x085a  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0869  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x086b  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x087b  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0890  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x08bf  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x08c4  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x08c8  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x08cd  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x08d5  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x08da  */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r15v14, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v53 */
    /* JADX WARN: Type inference failed for: r6v54, types: [int] */
    /* JADX WARN: Type inference failed for: r6v65 */
    /* JADX WARN: Type inference failed for: r6v66, types: [int] */
    /* JADX WARN: Type inference failed for: r6v94 */
    /* JADX WARN: Type inference failed for: r6v95 */
    @Override // eh.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final f0 invoke(d0.q0 q0Var, f3.b bVar) {
        float fA;
        d0.q0 q0Var2;
        int i10;
        int iMax;
        int i11;
        int i12;
        int i13;
        float f10;
        float f11;
        int i14;
        int i15;
        List arrayList;
        List<Integer> list;
        List list2;
        float f12;
        ArrayList arrayList2;
        d0.q0 q0Var3;
        List arrayList3;
        int size;
        int i16;
        int size2;
        int i17;
        boolean z10;
        g0 g0Var;
        w wVar;
        int i18;
        boolean z11;
        v vVar;
        boolean z12;
        d0.q0 q0Var4;
        int i19;
        float f13;
        boolean z13;
        int i20;
        Integer numValueOf;
        Integer numValueOf2;
        int i21;
        f0 f0Var;
        boolean z14;
        d0.q0 q0Var5;
        int[] iArr;
        int i22;
        d0.q0 q0Var6;
        g0 g0Var2;
        n nVar;
        float f14;
        g0 g0Var3;
        g0 g0Var4;
        g0 g0Var5;
        int i23;
        Object obj;
        int index;
        int iMin;
        g0 g0Var6;
        Object obj2;
        int i24;
        d0.q0 q0Var7 = q0Var;
        long j10 = bVar.f8811a;
        m0 m0Var = this.f3466a;
        m0Var.f3399r.getValue();
        boolean z15 = true;
        boolean z16 = m0Var.f3383b || q0Var7.I0();
        boolean z17 = this.f3467b;
        aa.b.c(j10, z17 ? v.t0.f30083a : v.t0.f30084b);
        f1 f1Var = this.f3468c;
        int iB1 = z17 ? q0Var7.b1(f1Var.b(q0Var7.getLayoutDirection())) : q0Var7.b1(androidx.compose.foundation.layout.f.f(f1Var, q0Var7.getLayoutDirection()));
        int iB12 = z17 ? q0Var7.b1(f1Var.d(q0Var7.getLayoutDirection())) : q0Var7.b1(androidx.compose.foundation.layout.f.e(f1Var, q0Var7.getLayoutDirection()));
        int iB13 = q0Var7.b1(f1Var.c());
        int iB14 = q0Var7.b1(f1Var.a()) + iB13;
        int i25 = iB1 + iB12;
        int i26 = z17 ? iB14 : i25;
        int i27 = z17 ? iB13 : !z17 ? iB1 : iB12;
        int i28 = i26 - i27;
        long jI = f3.c.i(-i25, -iB14, j10);
        o oVarInvoke = this.f3469d.invoke();
        f fVarF = oVarInvoke.f();
        int i29 = f3.b.i(jI);
        int iH = f3.b.h(jI);
        fVarF.f3317a.f(i29);
        fVarF.f3318b.f(iH);
        b.e eVar = this.f3471f;
        b.l lVar = this.f3470e;
        if (z17) {
            if (lVar == null) {
                y.c.b("null verticalArrangement when isVertical == true");
                throw new pg.g();
            }
            fA = lVar.a();
        } else {
            if (eVar == null) {
                y.c.b("null horizontalAlignment when isVertical == false");
                throw new pg.g();
            }
            fA = eVar.a();
        }
        int iB15 = q0Var7.b1(fA);
        int itemCount = oVarInvoke.getItemCount();
        int iH2 = z17 ? f3.b.h(j10) - iB14 : f3.b.i(j10) - i25;
        int i30 = i28;
        int i31 = i27;
        w wVar2 = new w(jI, this.f3467b, oVarInvoke, q0Var7, itemCount, iB15, this.f3475k, this.f3476l, i31, i30, (iB1 << 32) | (iB13 & BodyPartID.bodyIdMax), this.f3466a);
        h1.h hVarA = h.a.a();
        eh.l<Object, pg.f0> lVarE = hVarA != null ? hVarA.e() : null;
        h1.h hVarB = h.a.b(hVarA);
        try {
            int iG = m0Var.g();
            k0 k0Var = m0Var.f3385d;
            int iA = d0.h0.a(iG, oVarInvoke, k0Var.f3375d);
            if (iG != iA) {
                q0Var2 = q0Var7;
                k0Var.f3372a.f(iA);
                k0Var.f3376e.c(iG);
            } else {
                q0Var2 = q0Var7;
            }
            int iH3 = m0Var.h();
            pg.f0 f0Var2 = pg.f0.f21461a;
            h.a.d(hVarA, hVarB, lVarE);
            List<Integer> listA = d0.n.a(oVarInvoke, m0Var.f3398q, m0Var.f3395n);
            float fFloatValue = (q0Var2.I0() || !z16) ? m0Var.f3388g : ((Number) m0Var.f3403v.f7122a.f23843b.getValue()).floatValue();
            LazyLayoutItemAnimator<g0> lazyLayoutItemAnimator = m0Var.f3394m;
            boolean zI0 = q0Var2.I0();
            f0 f0Var3 = m0Var.f3384c;
            List<Integer> list3 = listA;
            n1<pg.f0> n1Var = m0Var.f3402u;
            d0.q0 q0Var8 = q0Var2;
            v vVar2 = new v(q0Var8, j10, i25, iB14);
            if (i31 < 0) {
                y.c.a("invalid beforeContentPadding");
            }
            if (i30 < 0) {
                y.c.a("invalid afterContentPadding");
            }
            boolean z18 = this.f3467b;
            ph.i0 i0Var = this.f3472g;
            k1 k1Var = this.f3473h;
            qg.z zVar = qg.z.f22752a;
            if (itemCount <= 0) {
                int iK = f3.b.k(jI);
                int iJ = f3.b.j(jI);
                lazyLayoutItemAnimator.d(0, iK, iJ, new ArrayList(), oVarInvoke.a(), wVar2, z18, zI0, 1, z16, 0, 0, i0Var, k1Var);
                if (!zI0) {
                    long jB = lazyLayoutItemAnimator.b();
                    if (!f3.p.b(jB, 0L)) {
                        iK = f3.c.g((int) (jB >> 32), jI);
                        iJ = f3.c.f((int) (jB & BodyPartID.bodyIdMax), jI);
                    }
                }
                q0Var5 = q0Var8;
                f0Var = new f0(null, 0, false, CropImageView.DEFAULT_ASPECT_RATIO, (g2.m0) vVar2.b(Integer.valueOf(iK), Integer.valueOf(iJ), b0.f3297a), CropImageView.DEFAULT_ASPECT_RATIO, false, i0Var, q0Var5, wVar2.f3365c, zVar, -i31, iH2 + i30, 0, z18 ? v.t0.f30083a : v.t0.f30084b, i30, iB15);
                z14 = false;
            } else {
                int i32 = iH2;
                if (iA >= itemCount) {
                    iA = itemCount - 1;
                    i10 = 0;
                } else {
                    i10 = iH3;
                }
                int iRound = Math.round(fFloatValue);
                int i33 = i10 - iRound;
                if (iA == 0 && i33 < 0) {
                    iRound += i33;
                    i33 = 0;
                }
                qg.l lVar2 = new qg.l();
                int i34 = iA;
                int i35 = -i31;
                int i36 = i34;
                int i37 = i35 + (iB15 < 0 ? iB15 : 0);
                int i38 = i33 + i37;
                int iMax2 = 0;
                while (i38 < 0 && i36 > 0) {
                    int i39 = i30;
                    int i40 = i36 - 1;
                    qg.z zVar2 = zVar;
                    g0 g0VarC = h0.c(wVar2, i40);
                    i36 = i40;
                    lVar2.add(0, g0VarC);
                    iMax2 = Math.max(iMax2, g0VarC.f3356s);
                    i38 += g0VarC.f3355r;
                    zVar = zVar2;
                    i30 = i39;
                }
                int i41 = i30;
                qg.z zVar3 = zVar;
                if (i38 < i37) {
                    iRound -= i37 - i38;
                    i38 = i37;
                }
                int i42 = iRound;
                int i43 = i38 - i37;
                int i44 = i32 + i41;
                int i45 = iMax2;
                int i46 = i44 < 0 ? 0 : i44;
                int i47 = i43;
                int i48 = -i43;
                int i49 = i36;
                int i50 = 0;
                boolean z19 = false;
                while (i50 < lVar2.f22729c) {
                    if (i48 >= i46) {
                        lVar2.e(i50);
                        z19 = true;
                    } else {
                        i49++;
                        i48 += ((g0) lVar2.get(i50)).f3355r;
                        i50++;
                    }
                }
                int i51 = i48;
                int i52 = i45;
                int i53 = i49;
                boolean z20 = z19;
                while (i53 < itemCount && (i51 < i46 || i51 <= 0 || lVar2.isEmpty())) {
                    int i54 = i46;
                    g0 g0VarC2 = h0.c(wVar2, i53);
                    n1<pg.f0> n1Var2 = n1Var;
                    int i55 = g0VarC2.f3355r;
                    i51 += i55;
                    if (i51 <= i37) {
                        i24 = i37;
                        if (i53 != itemCount - 1) {
                            i47 -= i55;
                            i36 = i53 + 1;
                            z20 = true;
                        }
                        i53++;
                        i46 = i54;
                        i37 = i24;
                        n1Var = n1Var2;
                    } else {
                        i24 = i37;
                    }
                    int iMax3 = Math.max(i52, g0VarC2.f3356s);
                    lVar2.addLast(g0VarC2);
                    i52 = iMax3;
                    i53++;
                    i46 = i54;
                    i37 = i24;
                    n1Var = n1Var2;
                }
                n1<pg.f0> n1Var3 = n1Var;
                if (i51 < i32) {
                    int i56 = i32 - i51;
                    i51 += i56;
                    iMax = i52;
                    int i57 = i47 - i56;
                    while (i57 < i31 && i36 > 0) {
                        int i58 = i36 - 1;
                        int i59 = i56;
                        g0 g0VarC3 = h0.c(wVar2, i58);
                        lVar2.add(0, g0VarC3);
                        iMax = Math.max(iMax, g0VarC3.f3356s);
                        i57 += g0VarC3.f3355r;
                        i36 = i58;
                        i56 = i59;
                    }
                    int i60 = i57;
                    i11 = i42 + i56;
                    if (i60 < 0) {
                        i11 += i60;
                        i51 += i60;
                        i12 = i36;
                        i13 = 0;
                    } else {
                        i12 = i36;
                        i13 = i60;
                    }
                } else {
                    iMax = i52;
                    i11 = i42;
                    i12 = i36;
                    i13 = i47;
                }
                int i61 = iMax;
                float f15 = (Integer.signum(Math.round(fFloatValue)) != Integer.signum(i11) || Math.abs(Math.round(fFloatValue)) < Math.abs(i11)) ? fFloatValue : i11;
                float f16 = fFloatValue - f15;
                float f17 = (!zI0 || i11 <= i42 || f16 > CropImageView.DEFAULT_ASPECT_RATIO) ? 0.0f : (i11 - i42) + f16;
                if (i13 < 0) {
                    y.c.a("negative currentFirstItemScrollOffset");
                }
                int i62 = -i13;
                g0 g0Var7 = (g0) lVar2.first();
                if (i31 > 0 || iB15 < 0) {
                    f10 = 0.0f;
                    int iC = lVar2.c();
                    f11 = f17;
                    int i63 = i13;
                    int i64 = 0;
                    while (i64 < iC) {
                        int i65 = iC;
                        int i66 = ((g0) lVar2.get(i64)).f3355r;
                        if (i63 == 0 || i66 > i63) {
                            break;
                        }
                        i14 = i63;
                        if (i64 == qg.p.i(lVar2)) {
                            break;
                        }
                        i63 = i14 - i66;
                        i64++;
                        g0Var7 = (g0) lVar2.get(i64);
                        iC = i65;
                    }
                    i14 = i63;
                } else {
                    f11 = f17;
                    f10 = 0.0f;
                    i14 = i13;
                }
                g0 g0Var8 = g0Var7;
                int iMax4 = Math.max(0, i12);
                int i67 = i12 - 1;
                if (iMax4 <= i67) {
                    List arrayList4 = null;
                    while (true) {
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        arrayList = arrayList4;
                        i15 = i62;
                        arrayList.add(h0.c(wVar2, i67));
                        if (i67 == iMax4) {
                            break;
                        }
                        i67--;
                        i62 = i15;
                        arrayList4 = arrayList;
                    }
                } else {
                    i15 = i62;
                    arrayList = null;
                }
                int size3 = list3.size() - 1;
                if (size3 >= 0) {
                    while (true) {
                        int i68 = size3 - 1;
                        list = list3;
                        int iIntValue = list.get(size3).intValue();
                        if (iIntValue < iMax4) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(h0.c(wVar2, iIntValue));
                        }
                        if (i68 < 0) {
                            break;
                        }
                        list3 = list;
                        size3 = i68;
                    }
                } else {
                    list = list3;
                }
                if (arrayList == null) {
                    arrayList = zVar3;
                }
                int i69 = i53;
                int iMax5 = i61;
                int i70 = 0;
                for (int size4 = arrayList.size(); i70 < size4; size4 = size4) {
                    iMax5 = Math.max(iMax5, ((g0) arrayList.get(i70)).f3356s);
                    i70++;
                }
                int i71 = itemCount - 1;
                int iMin2 = Math.min(((g0) qg.x.J(lVar2)).f3338a, i71);
                int i72 = iMax5;
                int i73 = ((g0) qg.x.J(lVar2)).f3338a + 1;
                if (i73 <= iMin2) {
                    ArrayList arrayList5 = null;
                    while (true) {
                        if (arrayList5 == null) {
                            arrayList5 = new ArrayList();
                        }
                        f12 = f15;
                        arrayList2 = arrayList5;
                        list2 = arrayList;
                        arrayList2.add(h0.c(wVar2, i73));
                        if (i73 == iMin2) {
                            break;
                        }
                        i73++;
                        arrayList = list2;
                        arrayList5 = arrayList2;
                        f15 = f12;
                    }
                } else {
                    list2 = arrayList;
                    f12 = f15;
                    arrayList2 = null;
                }
                if (!zI0 || f0Var3 == null) {
                    q0Var3 = q0Var8;
                    arrayList3 = arrayList2;
                    if (arrayList3 != null && ((g0) qg.x.J(arrayList3)).f3338a > iMin2) {
                        iMin2 = ((g0) qg.x.J(arrayList3)).f3338a;
                    }
                    size = list.size();
                    for (i16 = 0; i16 < size; i16++) {
                        int iIntValue2 = list.get(i16).intValue();
                        if (iIntValue2 > iMin2) {
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                            }
                            arrayList3.add(h0.c(wVar2, iIntValue2));
                        }
                    }
                    if (arrayList3 == null) {
                        arrayList3 = zVar3;
                    }
                    size2 = arrayList3.size();
                    int iMax6 = i72;
                    for (i17 = 0; i17 < size2; i17++) {
                        iMax6 = Math.max(iMax6, ((g0) arrayList3.get(i17)).f3356s);
                    }
                    boolean z21 = !kotlin.jvm.internal.r.a(g0Var8, lVar2.first()) && list2.isEmpty() && arrayList3.isEmpty();
                    int iG2 = f3.c.g(!z18 ? iMax6 : i51, jI);
                    if (z18) {
                        iMax6 = i51;
                    }
                    int iF = f3.c.f(iMax6, jI);
                    int i74 = !z18 ? iF : iG2;
                    z10 = i51 >= Math.min(i74, i32);
                    if (z10 && i15 != 0) {
                        y.c.c("non-zero itemsScrollOffset");
                    }
                    ?? arrayList6 = new ArrayList(arrayList3.size() + list2.size() + lVar2.c());
                    if (z10) {
                        g0Var = g0Var8;
                        wVar = wVar2;
                        i18 = itemCount;
                        z11 = z21;
                        vVar = vVar2;
                        d0.q0 q0Var9 = q0Var3;
                        z12 = false;
                        int size5 = list2.size();
                        int i75 = i15;
                        int i76 = 0;
                        while (i76 < size5) {
                            int i77 = size5;
                            g0 g0Var9 = (g0) list2.get(i76);
                            i75 -= g0Var9.f3355r;
                            g0Var9.l(i75, iG2, iF);
                            arrayList6.add(g0Var9);
                            i76++;
                            size5 = i77;
                            q0Var9 = q0Var9;
                        }
                        q0Var4 = q0Var9;
                        int iC2 = lVar2.c();
                        int i78 = i15;
                        for (int i79 = 0; i79 < iC2; i79++) {
                            g0 g0Var10 = (g0) lVar2.get(i79);
                            g0Var10.l(i78, iG2, iF);
                            arrayList6.add(g0Var10);
                            i78 += g0Var10.f3355r;
                        }
                        int size6 = arrayList3.size();
                        for (int i80 = 0; i80 < size6; i80++) {
                            g0 g0Var11 = (g0) arrayList3.get(i80);
                            g0Var11.l(i78, iG2, iF);
                            arrayList6.add(g0Var11);
                            i78 += g0Var11.f3355r;
                        }
                    } else {
                        if (!list2.isEmpty() || !arrayList3.isEmpty()) {
                            y.c.a("no extra items");
                        }
                        int iC3 = lVar2.c();
                        int[] iArr2 = new int[iC3];
                        int i81 = 0;
                        while (i81 < iC3) {
                            iArr2[i81] = ((g0) lVar2.get(i81)).f3353p;
                            i81++;
                            g0Var8 = g0Var8;
                        }
                        g0Var = g0Var8;
                        int[] iArr3 = new int[iC3];
                        if (!z18) {
                            d0.q0 q0Var10 = q0Var3;
                            if (eVar == null) {
                                y.c.b("null horizontalArrangement when isVertical == false");
                                throw new pg.g();
                            }
                            iArr = iArr3;
                            i18 = itemCount;
                            i22 = i32;
                            q0Var6 = q0Var10;
                            wVar = wVar2;
                            z11 = z21;
                            vVar = vVar2;
                            z12 = false;
                            eVar.b(q0Var6, i74, iArr2, f3.r.f8828a, iArr);
                        } else {
                            if (lVar == null) {
                                y.c.b("null verticalArrangement when isVertical == true");
                                throw new pg.g();
                            }
                            d0.q0 q0Var11 = q0Var3;
                            lVar.c(q0Var11, i74, iArr2, iArr3);
                            iArr = iArr3;
                            i18 = itemCount;
                            wVar = wVar2;
                            z11 = z21;
                            q0Var6 = q0Var11;
                            vVar = vVar2;
                            z12 = false;
                            i22 = i32;
                        }
                        jh.g gVarU = qg.o.u(iArr);
                        int i82 = gVarU.f15744a;
                        int i83 = gVarU.f15745b;
                        int i84 = gVarU.f15746c;
                        if ((i84 > 0 && i82 <= i83) || (i84 < 0 && i83 <= i82)) {
                            while (true) {
                                int i85 = iArr[i82];
                                int i86 = i84;
                                g0 g0Var12 = (g0) lVar2.get(i82);
                                g0Var12.l(i85, iG2, iF);
                                arrayList6.add(g0Var12);
                                if (i82 == i83) {
                                    break;
                                }
                                i82 += i86;
                                i84 = i86;
                            }
                        }
                        q0Var4 = q0Var6;
                        i32 = i22;
                    }
                    float f18 = f12;
                    w wVar3 = wVar;
                    lazyLayoutItemAnimator.d((int) f18, iG2, iF, arrayList6, oVarInvoke.a(), wVar3, z18, zI0, 1, z16, i14, i51, i0Var, k1Var);
                    if (zI0) {
                        z13 = z18;
                        long jB2 = lazyLayoutItemAnimator.b();
                        i19 = i32;
                        f13 = f18;
                        if (!f3.p.b(jB2, 0L)) {
                            int i87 = z13 ? iF : iG2;
                            iG2 = f3.c.g(Math.max(iG2, (int) (jB2 >> 32)), jI);
                            int iF2 = f3.c.f(Math.max(iF, (int) (jB2 & BodyPartID.bodyIdMax)), jI);
                            int i88 = z13 ? iF2 : iG2;
                            if (i88 != i87) {
                                int size7 = arrayList6.size();
                                for (?? r62 = z12; r62 < size7; r62++) {
                                    g0 g0Var13 = (g0) arrayList6.get(r62);
                                    g0Var13.f3358u = i88;
                                    g0Var13.f3360w = g0Var13.f3345h + i88;
                                }
                            }
                            i20 = iF2;
                        }
                        int i89 = iG2;
                        List listA2 = q1.a(this.f3474j, arrayList6, oVarInvoke.b(), i31, i41, i89, i20, new e0(wVar3));
                        if (z11) {
                            g0 g0Var14 = (g0) qg.x.D(arrayList6);
                            numValueOf = g0Var14 != null ? Integer.valueOf(g0Var14.f3338a) : null;
                            if (z11) {
                                g0 g0Var15 = (g0) lVar2.k();
                                if (g0Var15 != null) {
                                    numValueOf2 = Integer.valueOf(g0Var15.f3338a);
                                    i21 = i69;
                                }
                                i21 = i69;
                                numValueOf2 = null;
                            } else {
                                g0 g0Var16 = (g0) qg.x.K(arrayList6);
                                if (g0Var16 != null) {
                                    numValueOf2 = Integer.valueOf(g0Var16.f3338a);
                                    i21 = i69;
                                }
                                i21 = i69;
                                numValueOf2 = null;
                            }
                            if (i21 >= i18 && i51 <= i19) {
                                z15 = z12;
                            }
                            g2.m0 m0Var2 = (g2.m0) vVar.b(Integer.valueOf(i89), Integer.valueOf(i20), new d0(n1Var3, arrayList6, listA2, zI0));
                            List listA3 = d0.u0.a(numValueOf == null ? numValueOf.intValue() : z12, numValueOf2 == null ? numValueOf2.intValue() : z12, arrayList6, listA2);
                            z14 = z12;
                            q0Var5 = q0Var4;
                            f0Var = new f0(g0Var, i14, z15, f13, m0Var2, f11, z20, i0Var, q0Var5, wVar3.f3365c, listA3, i35, i44, i18, !z13 ? v.t0.f30083a : v.t0.f30084b, i41, iB15);
                        } else {
                            g0 g0Var17 = (g0) lVar2.i();
                            if (g0Var17 != null) {
                                numValueOf = Integer.valueOf(g0Var17.f3338a);
                            }
                            if (z11) {
                            }
                            if (i21 >= i18) {
                                z15 = z12;
                            }
                            g2.m0 m0Var22 = (g2.m0) vVar.b(Integer.valueOf(i89), Integer.valueOf(i20), new d0(n1Var3, arrayList6, listA2, zI0));
                            List listA32 = d0.u0.a(numValueOf == null ? numValueOf.intValue() : z12, numValueOf2 == null ? numValueOf2.intValue() : z12, arrayList6, listA2);
                            z14 = z12;
                            q0Var5 = q0Var4;
                            f0Var = new f0(g0Var, i14, z15, f13, m0Var22, f11, z20, i0Var, q0Var5, wVar3.f3365c, listA32, i35, i44, i18, !z13 ? v.t0.f30083a : v.t0.f30084b, i41, iB15);
                        }
                    } else {
                        i19 = i32;
                        f13 = f18;
                        z13 = z18;
                    }
                    i20 = iF;
                    int i892 = iG2;
                    List listA22 = q1.a(this.f3474j, arrayList6, oVarInvoke.b(), i31, i41, i892, i20, new e0(wVar3));
                    if (z11) {
                    }
                } else {
                    List<g0> list4 = f0Var3.f3329k;
                    if (!list4.isEmpty()) {
                        ArrayList arrayList7 = arrayList2;
                        for (int size8 = list4.size() - 1; -1 < size8; size8--) {
                            if (list4.get(size8).getIndex() > iMin2 && (size8 == 0 || list4.get(size8 - 1).getIndex() <= iMin2)) {
                                g0Var2 = list4.get(size8);
                                break;
                            }
                        }
                        g0Var2 = null;
                        n nVar2 = (n) qg.x.J(list4);
                        if (g0Var2 == null || (index = g0Var2.getIndex()) > (iMin = Math.min(nVar2.getIndex(), i71))) {
                            nVar = nVar2;
                            q0Var3 = q0Var8;
                            arrayList3 = arrayList7;
                        } else {
                            ArrayList arrayList8 = arrayList7;
                            while (true) {
                                nVar = nVar2;
                                if (arrayList8 != null) {
                                    int size9 = arrayList8.size();
                                    q0Var3 = q0Var8;
                                    int i90 = 0;
                                    while (true) {
                                        if (i90 >= size9) {
                                            obj2 = null;
                                            break;
                                        }
                                        obj2 = arrayList8.get(i90);
                                        int i91 = size9;
                                        if (((g0) obj2).f3338a == index) {
                                            break;
                                        }
                                        i90++;
                                        size9 = i91;
                                    }
                                    g0Var6 = (g0) obj2;
                                } else {
                                    q0Var3 = q0Var8;
                                    g0Var6 = null;
                                }
                                if (g0Var6 == null) {
                                    if (arrayList8 == null) {
                                        arrayList8 = new ArrayList();
                                    }
                                    arrayList8.add(h0.c(wVar2, index));
                                }
                                if (index == iMin) {
                                    break;
                                }
                                index++;
                                nVar2 = nVar;
                                q0Var8 = q0Var3;
                            }
                            arrayList3 = arrayList8;
                        }
                        float offset = ((f0Var3.f3331m - nVar.getOffset()) - nVar.getSize()) - f12;
                        if (offset > f10) {
                            int index2 = nVar.getIndex() + 1;
                            int i92 = 0;
                            while (index2 < itemCount && i92 < offset) {
                                if (index2 <= iMin2) {
                                    int iC4 = lVar2.c();
                                    int i93 = 0;
                                    while (true) {
                                        if (i93 >= iC4) {
                                            f14 = offset;
                                            obj = null;
                                            break;
                                        }
                                        obj = lVar2.get(i93);
                                        f14 = offset;
                                        if (((g0) obj).f3338a == index2) {
                                            break;
                                        }
                                        i93++;
                                        offset = f14;
                                    }
                                    g0Var5 = (g0) obj;
                                } else {
                                    f14 = offset;
                                    if (arrayList3 != null) {
                                        int size10 = arrayList3.size();
                                        int i94 = 0;
                                        while (true) {
                                            if (i94 >= size10) {
                                                g0Var4 = 0;
                                                break;
                                            }
                                            g0Var4 = arrayList3.get(i94);
                                            int i95 = size10;
                                            if (((g0) g0Var4).f3338a == index2) {
                                                break;
                                            }
                                            i94++;
                                            size10 = i95;
                                        }
                                        g0Var5 = g0Var4;
                                    } else {
                                        g0Var3 = null;
                                        if (g0Var3 == null) {
                                            index2++;
                                            i23 = g0Var3.f3355r;
                                        } else {
                                            if (arrayList3 == null) {
                                                arrayList3 = new ArrayList();
                                            }
                                            arrayList3.add(h0.c(wVar2, index2));
                                            index2++;
                                            i23 = ((g0) qg.x.J(arrayList3)).f3355r;
                                        }
                                        i92 += i23;
                                        offset = f14;
                                    }
                                }
                                g0Var3 = g0Var5;
                                if (g0Var3 == null) {
                                }
                                i92 += i23;
                                offset = f14;
                            }
                        }
                    }
                    if (arrayList3 != null) {
                        iMin2 = ((g0) qg.x.J(arrayList3)).f3338a;
                    }
                    size = list.size();
                    while (i16 < size) {
                    }
                    if (arrayList3 == null) {
                    }
                    size2 = arrayList3.size();
                    int iMax62 = i72;
                    while (i17 < size2) {
                    }
                    if (kotlin.jvm.internal.r.a(g0Var8, lVar2.first())) {
                        int iG22 = f3.c.g(!z18 ? iMax62 : i51, jI);
                        if (z18) {
                        }
                        int iF3 = f3.c.f(iMax62, jI);
                        if (!z18) {
                        }
                        if (i51 >= Math.min(i74, i32)) {
                        }
                        if (z10) {
                            y.c.c("non-zero itemsScrollOffset");
                        }
                        ?? arrayList62 = new ArrayList(arrayList3.size() + list2.size() + lVar2.c());
                        if (z10) {
                        }
                        float f182 = f12;
                        w wVar32 = wVar;
                        lazyLayoutItemAnimator.d((int) f182, iG22, iF3, arrayList62, oVarInvoke.a(), wVar32, z18, zI0, 1, z16, i14, i51, i0Var, k1Var);
                        if (zI0) {
                        }
                        i20 = iF3;
                        int i8922 = iG22;
                        List listA222 = q1.a(this.f3474j, arrayList62, oVarInvoke.b(), i31, i41, i8922, i20, new e0(wVar32));
                        if (z11) {
                        }
                    }
                }
            }
            m0Var.f(f0Var, q0Var5.I0(), z14);
            return f0Var;
        } catch (Throwable th2) {
            h.a.d(hVarA, hVarB, lVarE);
            throw th2;
        }
    }
}
