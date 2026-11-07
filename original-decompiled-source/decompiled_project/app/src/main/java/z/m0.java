package z;

import g2.g1;
import java.util.List;
import java.util.NoSuchElementException;
import org.bouncycastle.asn1.cmc.BodyPartID;
import z.a0;
import z.b;
import z.g0;
import z.v;

/* loaded from: classes.dex */
public final class m0 implements g2.u0, l0 {

    /* renamed from: a, reason: collision with root package name */
    public final b.e f34588a;

    /* renamed from: b, reason: collision with root package name */
    public final b.l f34589b;

    /* renamed from: c, reason: collision with root package name */
    public final float f34590c;

    /* renamed from: d, reason: collision with root package name */
    public final v.e f34591d;

    /* renamed from: e, reason: collision with root package name */
    public final float f34592e;

    /* renamed from: f, reason: collision with root package name */
    public final j0 f34593f;

    public static final class a extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f34594a = new a(1);

        @Override // eh.l
        public final /* bridge */ /* synthetic */ pg.f0 invoke(g1.a aVar) {
            return pg.f0.f21461a;
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f34595a = new b(1);

        @Override // eh.l
        public final /* bridge */ /* synthetic */ pg.f0 invoke(g1.a aVar) {
            return pg.f0.f21461a;
        }
    }

    public m0(b.e eVar, b.l lVar, float f10, v.e eVar2, float f11, j0 j0Var) {
        this.f34588a = eVar;
        this.f34589b = lVar;
        this.f34590c = f10;
        this.f34591d = eVar2;
        this.f34592e = f11;
        this.f34593f = j0Var;
    }

    @Override // g2.u0
    public final int c(g2.q qVar, List<? extends List<? extends g2.p>> list, int i10) {
        List list2 = (List) qg.x.E(1, list);
        g2.p pVar = list2 != null ? (g2.p) qg.x.D(list2) : null;
        List list3 = (List) qg.x.E(2, list);
        this.f34593f.b(pVar, list3 != null ? (g2.p) qg.x.D(list3) : null, f3.c.b(0, i10, 7));
        List list4 = (List) qg.x.D(list);
        if (list4 == null) {
            list4 = qg.z.f22752a;
        }
        int iB1 = qVar.b1(this.f34590c);
        int size = list4.size();
        int i11 = 0;
        int iMax = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < size) {
            int iO = ((g2.p) list4.get(i11)).O(i10) + iB1;
            int i14 = i11 + 1;
            if (i14 - i12 == Integer.MAX_VALUE || i14 == list4.size()) {
                iMax = Math.max(iMax, (i13 + iO) - iB1);
                i13 = 0;
                i12 = i11;
            } else {
                i13 += iO;
            }
            i11 = i14;
        }
        return iMax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return this.f34588a.equals(m0Var.f34588a) && this.f34589b.equals(m0Var.f34589b) && f3.h.a(this.f34590c, m0Var.f34590c) && this.f34591d.equals(m0Var.f34591d) && f3.h.a(this.f34592e, m0Var.f34592e) && kotlin.jvm.internal.r.a(this.f34593f, m0Var.f34593f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0090  */
    @Override // g2.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(g2.q qVar, List<? extends List<? extends g2.p>> list, int i10) {
        int i11;
        int i12;
        int[] iArr;
        List list2;
        int i13;
        long jA;
        g0.a aVar;
        int i14 = i10;
        int i15 = 1;
        List list3 = (List) qg.x.E(1, list);
        g2.p pVar = list3 != null ? (g2.p) qg.x.D(list3) : null;
        List list4 = (List) qg.x.E(2, list);
        int i16 = 0;
        this.f34593f.b(pVar, list4 != null ? (g2.p) qg.x.D(list4) : null, f3.c.b(0, i14, 7));
        List list5 = (List) qg.x.D(list);
        if (list5 == null) {
            list5 = qg.z.f22752a;
        }
        int iB1 = qVar.b1(this.f34590c);
        int iB12 = qVar.b1(this.f34592e);
        if (list5.isEmpty()) {
            return 0;
        }
        int size = list5.size();
        int[] iArr2 = new int[size];
        int size2 = list5.size();
        int[] iArr3 = new int[size2];
        int size3 = list5.size();
        for (int i17 = 0; i17 < size3; i17++) {
            g2.p pVar2 = (g2.p) list5.get(i17);
            int iJ = pVar2.J(i14);
            iArr2[i17] = iJ;
            iArr3[i17] = pVar2.b0(iJ);
        }
        int size4 = list5.size();
        j0 j0Var = this.f34593f;
        int i18 = Integer.MAX_VALUE;
        if (Integer.MAX_VALUE >= size4 || ((aVar = j0Var.f34550a) != g0.a.f34515c && aVar != g0.a.f34516d)) {
            if (Integer.MAX_VALUE >= list5.size()) {
                j0Var.getClass();
                i11 = j0Var.f34550a == g0.a.f34516d ? 1 : 0;
            }
        }
        int iMin = Math.min(Integer.MAX_VALUE - i11, list5.size());
        int i19 = 0;
        for (int i20 = 0; i20 < size; i20++) {
            i19 += iArr2[i20];
        }
        int size5 = ((list5.size() - 1) * iB1) + i19;
        if (size2 == 0) {
            throw new NoSuchElementException();
        }
        int i21 = iArr3[0];
        jh.f it = new jh.g(1, size2 - 1, 1).iterator();
        int i22 = i21;
        while (it.f15749c) {
            int i23 = iArr3[it.nextInt()];
            if (i22 < i23) {
                i22 = i23;
            }
        }
        if (size == 0) {
            throw new NoSuchElementException();
        }
        int i24 = iArr2[0];
        jh.f it2 = new jh.g(1, size - 1, 1).iterator();
        while (it2.f15749c) {
            int i25 = iArr2[it2.nextInt()];
            if (i24 < i25) {
                i24 = i25;
            }
        }
        int i26 = size5;
        while (i24 <= i26 && i22 != i14) {
            int i27 = (i24 + i26) / 2;
            int i28 = f0.f34505a;
            if (list5.isEmpty()) {
                jA = p.g.a(i16, i16);
                list2 = list5;
                iArr = iArr2;
                i12 = iMin;
            } else {
                i12 = iMin;
                a0 a0Var = new a0(j0Var, f3.c.a(i16, i27, i16, i18), iB1, iB12);
                g2.p pVar3 = (g2.p) qg.x.E(i16, list5);
                int i29 = pVar3 != null ? iArr3[i16] : i16;
                int i30 = pVar3 != null ? iArr2[i16] : i16;
                iArr = iArr2;
                int i31 = 0;
                if (a0Var.b(list5.size() > i15 ? i15 : 0, 0, p.g.a(i27, Integer.MAX_VALUE), pVar3 == null ? null : new p.g(p.g.a(i30, i29)), 0, 0, 0, false, false).f34441b) {
                    p.g gVarA = j0Var.a(0, 0, pVar3 != null);
                    jA = p.g.a(gVarA != null ? (int) (gVarA.f20623a & BodyPartID.bodyIdMax) : 0, 0);
                    list2 = list5;
                } else {
                    int size6 = list5.size();
                    int i32 = 0;
                    int i33 = 0;
                    int i34 = 0;
                    int i35 = i27;
                    int i36 = 0;
                    int i37 = 0;
                    while (true) {
                        if (i32 >= size6) {
                            list2 = list5;
                            i13 = i33;
                            break;
                        }
                        int i38 = i35 - i30;
                        i13 = i32 + 1;
                        int iMax = Math.max(i37, i29);
                        g2.p pVar4 = (g2.p) qg.x.E(i13, list5);
                        i29 = pVar4 != null ? iArr3[i13] : 0;
                        int i39 = pVar4 != null ? iArr[i13] + iB1 : 0;
                        list2 = list5;
                        int i40 = i13 - i34;
                        int i41 = i36;
                        a0.b bVarB = a0Var.b(i32 + 2 < list2.size(), i40, p.g.a(i38, Integer.MAX_VALUE), pVar4 == null ? null : new p.g(p.g.a(i39, i29)), i41, i31, iMax, false, false);
                        if (bVarB.f34440a) {
                            int i42 = iMax + iB12 + i31;
                            a0.a aVarA = a0Var.a(bVarB, pVar4 != null, i41, i42, i38, i40);
                            i39 -= iB1;
                            i36 = i41 + 1;
                            if (bVarB.f34441b) {
                                if (aVarA != null) {
                                    long j10 = aVarA.f34438c;
                                    if (!aVarA.f34439d) {
                                        i42 = ((int) (j10 & BodyPartID.bodyIdMax)) + iB12 + i42;
                                    }
                                }
                                i31 = i42;
                            } else {
                                i34 = i13;
                                i35 = i27;
                                i31 = i42;
                                i37 = 0;
                            }
                        } else {
                            i35 = i38;
                            i36 = i41;
                            i37 = iMax;
                        }
                        i30 = i39;
                        i32 = i13;
                        i33 = i32;
                        list5 = list2;
                    }
                    jA = p.g.a(i31 - iB12, i13);
                }
            }
            int i43 = (int) (jA >> 32);
            int i44 = (int) (jA & BodyPartID.bodyIdMax);
            i14 = i10;
            if (i43 > i14 || i44 < i12) {
                i24 = i27 + 1;
                if (i24 > i26) {
                    return i24;
                }
            } else {
                if (i43 >= i14) {
                    return i27;
                }
                i26 = i27 - 1;
            }
            iArr2 = iArr;
            size5 = i27;
            iMin = i12;
            list5 = list2;
            i15 = 1;
            i16 = 0;
            i18 = Integer.MAX_VALUE;
            i22 = i43;
        }
        return size5;
    }

    @Override // g2.u0
    public final int g(g2.q qVar, List<? extends List<? extends g2.p>> list, int i10) {
        List list2 = (List) qg.x.E(1, list);
        g2.p pVar = list2 != null ? (g2.p) qg.x.D(list2) : null;
        List list3 = (List) qg.x.E(2, list);
        this.f34593f.b(pVar, list3 != null ? (g2.p) qg.x.D(list3) : null, f3.c.b(i10, 0, 13));
        List list4 = (List) qg.x.D(list);
        if (list4 == null) {
            list4 = qg.z.f22752a;
        }
        return o(list4, i10, qVar.b1(this.f34590c), qVar.b1(this.f34592e), this.f34593f);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:61:0x01d1
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:195)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:62)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ae  */
    /* JADX WARN: Type inference failed for: r2v38, types: [g2.k0] */
    /* JADX WARN: Type inference failed for: r2v57 */
    /* JADX WARN: Type inference failed for: r2v58 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27, types: [T] */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r8v11, types: [g2.g1[]] */
    @Override // g2.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final g2.m0 h(g2.o0 r50, java.util.List<? extends java.util.List<? extends g2.k0>> r51, long r52) {
        /*
            Method dump skipped, instructions count: 1070
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z.m0.h(g2.o0, java.util.List, long):g2.m0");
    }

    public final int hashCode() {
        return this.f34593f.hashCode() + androidx.datastore.preferences.protobuf.a1.a(Integer.MAX_VALUE, androidx.datastore.preferences.protobuf.a1.a(Integer.MAX_VALUE, r.z1.a(this.f34592e, (this.f34591d.hashCode() + r.z1.a(this.f34590c, (this.f34589b.hashCode() + ((this.f34588a.hashCode() + (Boolean.hashCode(true) * 31)) * 31)) * 31, 31)) * 31, 31), 31), 31);
    }

    @Override // g2.u0
    public final int i(g2.q qVar, List<? extends List<? extends g2.p>> list, int i10) {
        List list2 = (List) qg.x.E(1, list);
        g2.p pVar = list2 != null ? (g2.p) qg.x.D(list2) : null;
        List list3 = (List) qg.x.E(2, list);
        this.f34593f.b(pVar, list3 != null ? (g2.p) qg.x.D(list3) : null, f3.c.b(i10, 0, 13));
        List list4 = (List) qg.x.D(list);
        if (list4 == null) {
            list4 = qg.z.f22752a;
        }
        return o(list4, i10, qVar.b1(this.f34590c), qVar.b1(this.f34592e), this.f34593f);
    }

    @Override // z.l0
    public final v k() {
        return this.f34591d;
    }

    @Override // z.l0
    public final b.e l() {
        return this.f34588a;
    }

    @Override // z.l0
    public final b.l m() {
        return this.f34589b;
    }

    @Override // z.l0
    public final boolean n() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int o(List list, int i10, int i11, int i12, j0 j0Var) {
        int i13;
        long jA;
        int i14 = 0;
        if (list.isEmpty()) {
            jA = p.g.a(0, 0);
        } else {
            int i15 = Integer.MAX_VALUE;
            a0 a0Var = new a0(j0Var, f3.c.a(0, i10, 0, Integer.MAX_VALUE), i11, i12);
            g2.p pVar = (g2.p) qg.x.E(0, list);
            int iB0 = pVar != null ? pVar.b0(i10) : 0;
            int iJ = pVar != null ? pVar.J(iB0) : 0;
            boolean z10 = true;
            if (list.size() > 1) {
                i13 = 1;
            } else {
                i13 = 1;
                z10 = false;
            }
            int i16 = 0;
            if (a0Var.b(z10, 0, p.g.a(i10, Integer.MAX_VALUE), pVar == null ? null : new p.g(p.g.a(iJ, iB0)), 0, 0, 0, false, false).f34441b) {
                p.g gVarA = j0Var.a(0, 0, pVar != null ? i13 : 0);
                jA = p.g.a(gVarA != null ? (int) (gVarA.f20623a & BodyPartID.bodyIdMax) : 0, 0);
            } else {
                int size = list.size();
                int i17 = i10;
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                int i21 = 0;
                int i22 = 0;
                while (true) {
                    if (i18 >= size) {
                        break;
                    }
                    int i23 = i17 - iJ;
                    int i24 = i18 + 1;
                    int iMax = Math.max(i22, iB0);
                    g2.p pVar2 = (g2.p) qg.x.E(i24, list);
                    int iB02 = pVar2 != null ? pVar2.b0(i10) : i14;
                    int iJ2 = pVar2 != null ? pVar2.J(iB02) + i11 : i14;
                    int i25 = i24 - i20;
                    boolean z11 = i18 + 2 < list.size() ? i13 : i14;
                    int i26 = i21;
                    int i27 = iB02;
                    int i28 = iJ2;
                    a0.b bVarB = a0Var.b(z11, i25, p.g.a(i23, i15), pVar2 == null ? null : new p.g(p.g.a(iJ2, iB02)), i26, i16, iMax, false, false);
                    if (bVarB.f34440a) {
                        int i29 = iMax + i12 + i16;
                        a0.a aVarA = a0Var.a(bVarB, pVar2 != null, i26, i29, i23, i25);
                        int i30 = i28 - i11;
                        i21 = i26 + 1;
                        if (bVarB.f34441b) {
                            if (aVarA != null) {
                                long j10 = aVarA.f34438c;
                                if (!aVarA.f34439d) {
                                    i29 += ((int) (j10 & BodyPartID.bodyIdMax)) + i12;
                                }
                            }
                            i16 = i29;
                            i19 = i24;
                        } else {
                            i20 = i24;
                            i16 = i29;
                            iJ = i30;
                            i22 = 0;
                            i17 = i10;
                        }
                    } else {
                        iJ = i28;
                        i17 = i23;
                        i21 = i26;
                        i22 = iMax;
                    }
                    i18 = i24;
                    i19 = i18;
                    iB0 = i27;
                    i15 = Integer.MAX_VALUE;
                    i14 = 0;
                    i13 = 1;
                }
                jA = p.g.a(i16 - i12, i19);
            }
        }
        return (int) (jA >> 32);
    }

    public final String toString() {
        return "FlowMeasurePolicy(isHorizontal=true, horizontalArrangement=" + this.f34588a + ", verticalArrangement=" + this.f34589b + ", mainAxisSpacing=" + ((Object) f3.h.b(this.f34590c)) + ", crossAxisAlignment=" + this.f34591d + ", crossAxisArrangementSpacing=" + ((Object) f3.h.b(this.f34592e)) + ", maxItemsInMainAxis=2147483647, maxLines=2147483647, overflow=" + this.f34593f + ')';
    }
}
