package t0;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class pa extends kotlin.jvm.internal.s implements eh.p<g2.t1, f3.b, g2.m0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f26715a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f26716b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f26717c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f26718d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z.u1 f26719e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f26720f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f1.b f26721g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pa(eh.p pVar, eh.p pVar2, eh.p pVar3, int i10, z.u1 u1Var, eh.p pVar4, f1.b bVar) {
        super(2);
        this.f26715a = pVar;
        this.f26716b = pVar2;
        this.f26717c = pVar3;
        this.f26718d = i10;
        this.f26719e = u1Var;
        this.f26720f = pVar4;
        this.f26721g = bVar;
    }

    @Override // eh.p
    public final g2.m0 invoke(g2.t1 t1Var, f3.b bVar) {
        Object obj;
        z.u1 u1Var;
        Object obj2;
        Object obj3;
        int i10;
        ArrayList arrayList;
        s3 s3Var;
        ArrayList arrayList2;
        Object obj4;
        Integer numValueOf;
        int i11;
        int i12;
        int iB1;
        int iC;
        Object obj5;
        Object obj6;
        int i13;
        int iB12;
        int iB13;
        g2.t1 t1Var2 = t1Var;
        long j10 = bVar.f8811a;
        int i14 = f3.b.i(j10);
        int iH = f3.b.h(j10);
        long jB = f3.b.b(j10, 0, 0, 0, 0, 10);
        List<g2.k0> listF0 = t1Var2.F0(sa.f26968a, this.f26715a);
        ArrayList arrayList3 = new ArrayList(listF0.size());
        int size = listF0.size();
        for (int i15 = 0; i15 < size; i15++) {
            arrayList3.add(listF0.get(i15).P(jB));
        }
        if (arrayList3.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList3.get(0);
            int i16 = ((g2.g1) obj).f11383b;
            int i17 = qg.p.i(arrayList3);
            if (1 <= i17) {
                int i18 = 1;
                while (true) {
                    Object obj7 = arrayList3.get(i18);
                    int i19 = ((g2.g1) obj7).f11383b;
                    if (i16 < i19) {
                        obj = obj7;
                        i16 = i19;
                    }
                    if (i18 == i17) {
                        break;
                    }
                    i18++;
                }
            }
        }
        g2.g1 g1Var = (g2.g1) obj;
        int i20 = g1Var != null ? g1Var.f11383b : 0;
        List<g2.k0> listF02 = t1Var2.F0(sa.f26970c, this.f26716b);
        ArrayList arrayList4 = new ArrayList(listF02.size());
        int size2 = listF02.size();
        int i21 = 0;
        while (true) {
            u1Var = this.f26719e;
            if (i21 >= size2) {
                break;
            }
            arrayList4.add(listF02.get(i21).P(f3.c.i((-u1Var.a(t1Var2, t1Var2.getLayoutDirection())) - u1Var.d(t1Var2, t1Var2.getLayoutDirection()), -u1Var.c(t1Var2), jB)));
            i21++;
        }
        if (arrayList4.isEmpty()) {
            obj2 = null;
        } else {
            obj2 = arrayList4.get(0);
            int i22 = ((g2.g1) obj2).f11383b;
            int i23 = qg.p.i(arrayList4);
            if (1 <= i23) {
                Object obj8 = obj2;
                int i24 = i22;
                int i25 = 1;
                while (true) {
                    Object obj9 = arrayList4.get(i25);
                    int i26 = ((g2.g1) obj9).f11383b;
                    if (i24 < i26) {
                        obj8 = obj9;
                        i24 = i26;
                    }
                    if (i25 == i23) {
                        break;
                    }
                    i25++;
                }
                obj2 = obj8;
            }
        }
        g2.g1 g1Var2 = (g2.g1) obj2;
        int i27 = g1Var2 != null ? g1Var2.f11383b : 0;
        if (arrayList4.isEmpty()) {
            i10 = i27;
            obj3 = null;
        } else {
            obj3 = arrayList4.get(0);
            int i28 = ((g2.g1) obj3).f11382a;
            int i29 = qg.p.i(arrayList4);
            if (1 <= i29) {
                Object obj10 = obj3;
                int i30 = i28;
                int i31 = 1;
                while (true) {
                    Object obj11 = arrayList4.get(i31);
                    i10 = i27;
                    int i32 = ((g2.g1) obj11).f11382a;
                    if (i30 < i32) {
                        i30 = i32;
                        obj10 = obj11;
                    }
                    if (i31 == i29) {
                        break;
                    }
                    i31++;
                    i27 = i10;
                }
                obj3 = obj10;
            } else {
                i10 = i27;
            }
        }
        g2.g1 g1Var3 = (g2.g1) obj3;
        int i33 = g1Var3 != null ? g1Var3.f11382a : 0;
        List<g2.k0> listF03 = t1Var2.F0(sa.f26971d, this.f26717c);
        ArrayList arrayList5 = new ArrayList(listF03.size());
        int size3 = listF03.size();
        int i34 = 0;
        while (i34 < size3) {
            List<g2.k0> list = listF03;
            int i35 = size3;
            g2.g1 g1VarP = listF03.get(i34).P(f3.c.i((-u1Var.a(t1Var2, t1Var2.getLayoutDirection())) - u1Var.d(t1Var2, t1Var2.getLayoutDirection()), -u1Var.c(t1Var2), jB));
            if (g1VarP.f11383b == 0 || g1VarP.f11382a == 0) {
                g1VarP = null;
            }
            if (g1VarP != null) {
                arrayList5.add(g1VarP);
            }
            i34++;
            listF03 = list;
            size3 = i35;
        }
        boolean zIsEmpty = arrayList5.isEmpty();
        int i36 = this.f26718d;
        if (zIsEmpty) {
            arrayList = arrayList3;
            s3Var = null;
        } else {
            if (arrayList5.isEmpty()) {
                arrayList = arrayList3;
                obj5 = null;
            } else {
                obj5 = arrayList5.get(0);
                int i37 = ((g2.g1) obj5).f11382a;
                int i38 = qg.p.i(arrayList5);
                if (1 <= i38) {
                    Object obj12 = obj5;
                    int i39 = i37;
                    int i40 = 1;
                    while (true) {
                        Object obj13 = arrayList5.get(i40);
                        arrayList = arrayList3;
                        int i41 = ((g2.g1) obj13).f11382a;
                        if (i39 < i41) {
                            i39 = i41;
                            obj12 = obj13;
                        }
                        if (i40 == i38) {
                            break;
                        }
                        i40++;
                        arrayList3 = arrayList;
                    }
                    obj5 = obj12;
                } else {
                    arrayList = arrayList3;
                }
            }
            kotlin.jvm.internal.r.b(obj5);
            int i42 = ((g2.g1) obj5).f11382a;
            if (arrayList5.isEmpty()) {
                i13 = i42;
                obj6 = null;
            } else {
                obj6 = arrayList5.get(0);
                int i43 = ((g2.g1) obj6).f11383b;
                int i44 = qg.p.i(arrayList5);
                i13 = i42;
                if (1 <= i44) {
                    int i45 = 1;
                    while (true) {
                        Object obj14 = arrayList5.get(i45);
                        Object obj15 = obj6;
                        int i46 = ((g2.g1) obj14).f11383b;
                        if (i43 < i46) {
                            i43 = i46;
                            obj6 = obj14;
                        } else {
                            obj6 = obj15;
                        }
                        if (i45 == i44) {
                            break;
                        }
                        i45++;
                    }
                }
            }
            kotlin.jvm.internal.r.b(obj6);
            int i47 = ((g2.g1) obj6).f11383b;
            if (i36 != 0) {
                if (i36 != 2 && i36 != 3) {
                    iB12 = (i14 - i13) / 2;
                } else if (t1Var2.getLayoutDirection() == f3.r.f8828a) {
                    iB13 = t1Var2.b1(ra.f26895a);
                    iB12 = (i14 - iB13) - i13;
                } else {
                    iB12 = t1Var2.b1(ra.f26895a);
                }
                s3Var = new s3(iB12, i47);
            } else if (t1Var2.getLayoutDirection() == f3.r.f8828a) {
                iB12 = t1Var2.b1(ra.f26895a);
                s3Var = new s3(iB12, i47);
            } else {
                iB13 = t1Var2.b1(ra.f26895a);
                iB12 = (i14 - iB13) - i13;
                s3Var = new s3(iB12, i47);
            }
        }
        int i48 = i20;
        List<g2.k0> listF04 = t1Var2.F0(sa.f26972e, new f1.b(-2146438447, true, new oa(this.f26720f)));
        ArrayList arrayList6 = new ArrayList(listF04.size());
        int size4 = listF04.size();
        int i49 = 0;
        while (i49 < size4) {
            arrayList6.add(listF04.get(i49).P(jB));
            i49++;
            listF04 = listF04;
        }
        if (arrayList6.isEmpty()) {
            arrayList2 = arrayList6;
            obj4 = null;
        } else {
            Object obj16 = arrayList6.get(0);
            int i50 = ((g2.g1) obj16).f11383b;
            int i51 = qg.p.i(arrayList6);
            Object obj17 = obj16;
            if (1 <= i51) {
                int i52 = i50;
                int i53 = 1;
                while (true) {
                    Object obj18 = arrayList6.get(i53);
                    arrayList2 = arrayList6;
                    int i54 = ((g2.g1) obj18).f11383b;
                    if (i52 < i54) {
                        i52 = i54;
                        obj17 = obj18;
                    }
                    if (i53 == i51) {
                        break;
                    }
                    i53++;
                    arrayList6 = arrayList2;
                }
            } else {
                arrayList2 = arrayList6;
            }
            obj4 = obj17;
        }
        g2.g1 g1Var4 = (g2.g1) obj4;
        Integer numValueOf2 = g1Var4 != null ? Integer.valueOf(g1Var4.f11383b) : null;
        if (s3Var != null) {
            int i55 = s3Var.f26938b;
            if (numValueOf2 == null || i36 == 3) {
                iB1 = t1Var2.b1(ra.f26895a) + i55;
                iC = u1Var.c(t1Var2);
            } else {
                iB1 = numValueOf2.intValue() + i55;
                iC = t1Var2.b1(ra.f26895a);
            }
            numValueOf = Integer.valueOf(iC + iB1);
        } else {
            numValueOf = null;
        }
        if (i10 != 0) {
            int iIntValue = i10 + (numValueOf != null ? numValueOf.intValue() : numValueOf2 != null ? numValueOf2.intValue() : u1Var.c(t1Var2));
            i11 = i14;
            i12 = iIntValue;
        } else {
            i11 = i14;
            i12 = 0;
        }
        s3 s3Var2 = s3Var;
        ArrayList arrayList7 = arrayList;
        ArrayList arrayList8 = arrayList2;
        List<g2.k0> listF05 = t1Var2.F0(sa.f26969b, new f1.b(-1213360416, true, new na(this.f26719e, t1Var2, arrayList7, i48, arrayList8, numValueOf2, this.f26721g)));
        ArrayList arrayList9 = new ArrayList(listF05.size());
        int size5 = listF05.size();
        int i56 = 0;
        while (i56 < size5) {
            arrayList9.add(listF05.get(i56).P(jB));
            i56++;
            listF05 = listF05;
        }
        int i57 = i33;
        Integer num = numValueOf2;
        int i58 = i11;
        return t1Var2.i0(i58, iH, qg.a0.f22708a, new ma(arrayList9, arrayList7, arrayList4, arrayList8, s3Var2, i58, i57, this.f26719e, t1Var2, iH, i12, num, arrayList5, numValueOf));
    }
}
