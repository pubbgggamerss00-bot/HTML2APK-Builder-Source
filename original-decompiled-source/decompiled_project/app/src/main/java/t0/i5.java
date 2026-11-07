package t0;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class i5 implements g2.u0 {

    public /* synthetic */ class a extends kotlin.jvm.internal.p implements eh.p<g2.p, Integer, Integer> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f26068a = new a(2, g2.p.class, "maxIntrinsicHeight", "maxIntrinsicHeight(I)I", 0);

        @Override // eh.p
        public final Integer invoke(g2.p pVar, Integer num) {
            return Integer.valueOf(pVar.z(num.intValue()));
        }
    }

    public /* synthetic */ class b extends kotlin.jvm.internal.p implements eh.p<g2.p, Integer, Integer> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f26069a = new b(2, g2.p.class, "maxIntrinsicWidth", "maxIntrinsicWidth(I)I", 0);

        @Override // eh.p
        public final Integer invoke(g2.p pVar, Integer num) {
            return Integer.valueOf(pVar.O(num.intValue()));
        }
    }

    public /* synthetic */ class c extends kotlin.jvm.internal.p implements eh.p<g2.p, Integer, Integer> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f26070a = new c(2, g2.p.class, "minIntrinsicHeight", "minIntrinsicHeight(I)I", 0);

        @Override // eh.p
        public final Integer invoke(g2.p pVar, Integer num) {
            return Integer.valueOf(pVar.b0(num.intValue()));
        }
    }

    public /* synthetic */ class d extends kotlin.jvm.internal.p implements eh.p<g2.p, Integer, Integer> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f26071a = new d(2, g2.p.class, "minIntrinsicWidth", "minIntrinsicWidth(I)I", 0);

        @Override // eh.p
        public final Integer invoke(g2.p pVar, Integer num) {
            return Integer.valueOf(pVar.J(num.intValue()));
        }
    }

    public static int a(g2.q qVar, ArrayList arrayList, int i10, eh.p pVar) {
        int iIntValue;
        int iIntValue2;
        int i11 = i10;
        List list = (List) arrayList.get(0);
        int i12 = 1;
        List list2 = (List) arrayList.get(1);
        List list3 = (List) arrayList.get(2);
        List list4 = (List) arrayList.get(3);
        List list5 = (List) arrayList.get(4);
        int iB1 = qVar.b1(h5.f25985c + h5.f25986d);
        if (i11 != Integer.MAX_VALUE) {
            i11 -= iB1;
        }
        g2.p pVar2 = (g2.p) qg.x.D(list4);
        if (pVar2 != null) {
            iIntValue = ((Number) pVar.invoke(pVar2, Integer.valueOf(i11))).intValue();
            int iO = pVar2.O(Integer.MAX_VALUE);
            if (i11 != Integer.MAX_VALUE) {
                i11 -= iO;
            }
        } else {
            iIntValue = 0;
        }
        g2.p pVar3 = (g2.p) qg.x.D(list5);
        if (pVar3 != null) {
            iIntValue2 = ((Number) pVar.invoke(pVar3, Integer.valueOf(i11))).intValue();
            int iO2 = pVar3.O(Integer.MAX_VALUE);
            if (i11 != Integer.MAX_VALUE) {
                i11 -= iO2;
            }
        } else {
            iIntValue2 = 0;
        }
        g2.p pVar4 = (g2.p) qg.x.D(list2);
        int iIntValue3 = pVar4 != null ? ((Number) pVar.invoke(pVar4, Integer.valueOf(i11))).intValue() : 0;
        g2.p pVar5 = (g2.p) qg.x.D(list);
        int iIntValue4 = pVar5 != null ? ((Number) pVar.invoke(pVar5, Integer.valueOf(i11))).intValue() : 0;
        g2.p pVar6 = (g2.p) qg.x.D(list3);
        int iIntValue5 = pVar6 != null ? ((Number) pVar.invoke(pVar6, Integer.valueOf(i11))).intValue() : 0;
        boolean z10 = iIntValue5 > qVar.T0(f3.u.c(30));
        boolean z11 = iIntValue3 > 0;
        boolean z12 = iIntValue5 > 0;
        if ((z11 && z12) || z10) {
            i12 = 3;
        } else if (z11 || z12) {
            i12 = 2;
        }
        return h5.d(qVar, iIntValue, iIntValue2, iIntValue4, iIntValue3, iIntValue5, i12, qVar.b1((i12 == 3 ? h5.f25984b : h5.f25983a) * 2), f3.c.b(0, 0, 15));
    }

    public static int b(g2.q qVar, ArrayList arrayList, int i10, eh.p pVar) {
        List list = (List) arrayList.get(0);
        List list2 = (List) arrayList.get(1);
        List list3 = (List) arrayList.get(2);
        List list4 = (List) arrayList.get(3);
        List list5 = (List) arrayList.get(4);
        g2.p pVar2 = (g2.p) qg.x.D(list4);
        int iIntValue = pVar2 != null ? ((Number) pVar.invoke(pVar2, Integer.valueOf(i10))).intValue() : 0;
        g2.p pVar3 = (g2.p) qg.x.D(list5);
        int iIntValue2 = pVar3 != null ? ((Number) pVar.invoke(pVar3, Integer.valueOf(i10))).intValue() : 0;
        g2.p pVar4 = (g2.p) qg.x.D(list);
        int iIntValue3 = pVar4 != null ? ((Number) pVar.invoke(pVar4, Integer.valueOf(i10))).intValue() : 0;
        g2.p pVar5 = (g2.p) qg.x.D(list2);
        int iIntValue4 = pVar5 != null ? ((Number) pVar.invoke(pVar5, Integer.valueOf(i10))).intValue() : 0;
        g2.p pVar6 = (g2.p) qg.x.D(list3);
        int iIntValue5 = pVar6 != null ? ((Number) pVar.invoke(pVar6, Integer.valueOf(i10))).intValue() : 0;
        int iB1 = qVar.b1(h5.f25985c + h5.f25986d);
        long jB = f3.c.b(0, 0, 15);
        return f3.b.e(jB) ? f3.b.i(jB) : m.a.a(iB1, iIntValue, Math.max(iIntValue3, Math.max(iIntValue4, iIntValue5)), iIntValue2);
    }

    @Override // g2.u0
    public final int c(g2.q qVar, List<? extends List<? extends g2.p>> list, int i10) {
        return b(qVar, (ArrayList) list, i10, b.f26069a);
    }

    @Override // g2.u0
    public final int f(g2.q qVar, List<? extends List<? extends g2.p>> list, int i10) {
        return b(qVar, (ArrayList) list, i10, d.f26071a);
    }

    @Override // g2.u0
    public final int g(g2.q qVar, List<? extends List<? extends g2.p>> list, int i10) {
        return a(qVar, (ArrayList) list, i10, c.f26070a);
    }

    @Override // g2.u0
    public final g2.m0 h(g2.o0 o0Var, List<? extends List<? extends g2.k0>> list, long j10) {
        List list2;
        List list3;
        g2.g1 g1VarP;
        int i10;
        g2.g1 g1VarP2;
        float f10;
        g2.g1 g1VarP3;
        int i11;
        int i12;
        ArrayList arrayList = (ArrayList) list;
        List list4 = (List) arrayList.get(0);
        List list5 = (List) arrayList.get(1);
        List list6 = (List) arrayList.get(2);
        List list7 = (List) arrayList.get(3);
        List list8 = (List) arrayList.get(4);
        long jB = f3.b.b(j10, 0, 0, 0, 0, 10);
        float f11 = h5.f25985c;
        float f12 = h5.f25986d;
        int iB1 = o0Var.b1(f11 + f12);
        g2.k0 k0Var = (g2.k0) qg.x.D(list7);
        int iJ = k0Var != null ? k0Var.J(f3.b.h(j10)) : 0;
        g2.k0 k0Var2 = (g2.k0) qg.x.D(list8);
        int iJ2 = k0Var2 != null ? k0Var2.J(f3.b.h(j10)) : 0;
        int i13 = f3.b.i(jB);
        int i14 = iJ + iJ2 + iB1;
        if (i13 != Integer.MAX_VALUE) {
            i13 -= i14;
        }
        g2.k0 k0Var3 = (g2.k0) qg.x.D(list6);
        float f13 = (((qg.x.D(list5) != null) && (qg.x.D(list6) != null)) || ((k0Var3 != null ? k0Var3.b0(i13) : 0) > o0Var.T0(f3.u.c(30)))) ? h5.f25984b : h5.f25983a;
        float f14 = 2;
        long jI = f3.c.i(-iB1, -o0Var.b1(f13 * f14), jB);
        g2.k0 k0Var4 = (g2.k0) qg.x.D(list7);
        g2.g1 g1VarP4 = k0Var4 != null ? k0Var4.P(jI) : null;
        float f15 = u0.t1.f29148b;
        int i15 = g1VarP4 != null ? g1VarP4.f11382a : 0;
        g2.k0 k0Var5 = (g2.k0) qg.x.D(list8);
        if (k0Var5 != null) {
            list2 = list4;
            list3 = list5;
            g1VarP = k0Var5.P(f3.c.j(-i15, 0, 2, jI));
        } else {
            list2 = list4;
            list3 = list5;
            g1VarP = null;
        }
        int i16 = i15 + (g1VarP != null ? g1VarP.f11382a : 0);
        g2.k0 k0Var6 = (g2.k0) qg.x.D(list2);
        if (k0Var6 != null) {
            i10 = 2;
            g1VarP2 = k0Var6.P(f3.c.j(-i16, 0, 2, jI));
        } else {
            i10 = 2;
            g1VarP2 = null;
        }
        int i17 = g1VarP2 != null ? g1VarP2.f11383b : 0;
        g2.k0 k0Var7 = (g2.k0) qg.x.D(list6);
        if (k0Var7 != null) {
            f10 = f14;
            g1VarP3 = k0Var7.P(f3.c.i(-i16, -i17, jI));
        } else {
            f10 = f14;
            g1VarP3 = null;
        }
        int i18 = i17 + (g1VarP3 != null ? g1VarP3.f11383b : 0);
        boolean z10 = (g1VarP3 == null || g1VarP3.Q(g2.b.f11314a) == g1VarP3.Q(g2.b.f11315b)) ? false : true;
        g2.k0 k0Var8 = (g2.k0) qg.x.D(list3);
        g2.g1 g1VarP5 = k0Var8 != null ? k0Var8.P(f3.c.i(-i16, -i18, jI)) : null;
        boolean z11 = g1VarP5 != null;
        boolean z12 = g1VarP3 != null;
        if ((z11 && z12) || z10) {
            i12 = 3;
            i11 = 3;
        } else if (z11 || z12) {
            i11 = i10;
            i12 = 3;
        } else {
            i12 = 3;
            i11 = 1;
        }
        float f16 = i11 == i12 ? h5.f25984b : h5.f25983a;
        float f17 = f16 * f10;
        int i19 = i11;
        int i20 = f3.b.e(j10) ? f3.b.i(j10) : m.a.a(iB1, g1VarP4 != null ? g1VarP4.f11382a : 0, Math.max(g1VarP2 != null ? g1VarP2.f11382a : 0, Math.max(g1VarP5 != null ? g1VarP5.f11382a : 0, g1VarP3 != null ? g1VarP3.f11382a : 0)), g1VarP != null ? g1VarP.f11382a : 0);
        g2.g1 g1Var = g1VarP2;
        g2.g1 g1Var2 = g1VarP5;
        int iD = h5.d(o0Var, g1VarP4 != null ? g1VarP4.f11383b : 0, g1VarP != null ? g1VarP.f11383b : 0, g1VarP2 != null ? g1VarP2.f11383b : 0, g1VarP5 != null ? g1VarP5.f11383b : 0, g1VarP3 != null ? g1VarP3.f11383b : 0, i19, o0Var.b1(f17), j10);
        return o0Var.i0(i20, iD, qg.a0.f22708a, new g5(g1VarP4, g1VarP, o0Var.b1(f11), i19 == 3, o0Var.b1(f16), g1Var, g1Var2, g1VarP3, iD, i20, o0Var.b1(f12)));
    }

    @Override // g2.u0
    public final int i(g2.q qVar, List<? extends List<? extends g2.p>> list, int i10) {
        return a(qVar, (ArrayList) list, i10, a.f26068a);
    }
}
