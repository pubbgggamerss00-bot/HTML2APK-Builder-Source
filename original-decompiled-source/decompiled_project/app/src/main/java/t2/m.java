package t2;

import com.yalantis.ucrop.view.CropImageView;
import e9.w0;
import java.util.ArrayList;
import java.util.List;
import t2.b;
import x2.f;

/* loaded from: classes.dex */
public final class m implements q {

    /* renamed from: a, reason: collision with root package name */
    public final t2.b f27855a;

    /* renamed from: b, reason: collision with root package name */
    public final List<b.c<u>> f27856b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f27857c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f27858d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f27859e;

    public static final class a extends kotlin.jvm.internal.s implements eh.a<Float> {
        public a() {
            super(0);
        }

        @Override // eh.a
        public final Float invoke() {
            Object obj;
            ArrayList arrayList = m.this.f27859e;
            if (arrayList.isEmpty()) {
                obj = null;
            } else {
                Object obj2 = arrayList.get(0);
                float fC = ((p) obj2).f27872a.f3544i.c();
                int i10 = qg.p.i(arrayList);
                int i11 = 1;
                if (1 <= i10) {
                    while (true) {
                        Object obj3 = arrayList.get(i11);
                        float fC2 = ((p) obj3).f27872a.f3544i.c();
                        if (Float.compare(fC, fC2) < 0) {
                            obj2 = obj3;
                            fC = fC2;
                        }
                        if (i11 == i10) {
                            break;
                        }
                        i11++;
                    }
                }
                obj = obj2;
            }
            p pVar = (p) obj;
            return Float.valueOf(pVar != null ? pVar.f27872a.f3544i.c() : CropImageView.DEFAULT_ASPECT_RATIO);
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.a<Float> {
        public b() {
            super(0);
        }

        @Override // eh.a
        public final Float invoke() {
            Object obj;
            ArrayList arrayList = m.this.f27859e;
            if (arrayList.isEmpty()) {
                obj = null;
            } else {
                Object obj2 = arrayList.get(0);
                float fB = ((p) obj2).f27872a.b();
                int i10 = qg.p.i(arrayList);
                int i11 = 1;
                if (1 <= i10) {
                    while (true) {
                        Object obj3 = arrayList.get(i11);
                        float fB2 = ((p) obj3).f27872a.b();
                        if (Float.compare(fB, fB2) < 0) {
                            obj2 = obj3;
                            fB = fB2;
                        }
                        if (i11 == i10) {
                            break;
                        }
                        i11++;
                    }
                }
                obj = obj2;
            }
            p pVar = (p) obj;
            return Float.valueOf(pVar != null ? pVar.f27872a.b() : CropImageView.DEFAULT_ASPECT_RATIO);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m(t2.b bVar, l0 l0Var, List<b.c<u>> list, f3.d dVar, f.a aVar) {
        int i10;
        String strSubstring;
        String str;
        List<b.c<u>> list2;
        t2.b bVar2 = bVar;
        l0 l0Var2 = l0Var;
        this.f27855a = bVar2;
        this.f27856b = list;
        pg.k kVar = pg.k.f21467b;
        this.f27857c = w0.a(kVar, new b());
        this.f27858d = w0.a(kVar, new a());
        s sVar = l0Var2.f27853b;
        t2.b bVar3 = e.f27797a;
        ArrayList arrayList = bVar2.f27763d;
        String str2 = bVar2.f27761b;
        List list3 = qg.z.f22752a;
        List listU = arrayList != null ? qg.x.U(new c(), arrayList) : list3;
        ArrayList arrayList2 = new ArrayList();
        qg.l lVar = new qg.l();
        int size = listU.size();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < size) {
            b.c cVar = (b.c) listU.get(i12);
            b.c cVarA = b.c.a(cVar, sVar.a((s) cVar.f27771a), i11, 14);
            Object obj = cVarA.f27771a;
            int i14 = cVarA.f27773c;
            int i15 = cVarA.f27772b;
            while (i13 < i15 && !lVar.isEmpty()) {
                b.c cVar2 = (b.c) lVar.last();
                List list4 = listU;
                int i16 = cVar2.f27773c;
                List list5 = list3;
                Object obj2 = cVar2.f27771a;
                if (i15 < i16) {
                    arrayList2.add(new b.c(obj2, i13, i15));
                    i13 = i15;
                    listU = list4;
                    list3 = list5;
                } else {
                    int i17 = size;
                    arrayList2.add(new b.c(obj2, i13, i16));
                    i13 = cVar2.f27773c;
                    while (!lVar.isEmpty() && i13 == ((b.c) lVar.last()).f27773c) {
                        lVar.removeLast();
                    }
                    listU = list4;
                    list3 = list5;
                    size = i17;
                }
            }
            List list6 = listU;
            List list7 = list3;
            int i18 = size;
            if (i13 < i15) {
                arrayList2.add(new b.c(sVar, i13, i15));
                i13 = i15;
            }
            b.c cVar3 = (b.c) lVar.k();
            if (cVar3 != null) {
                int i19 = cVar3.f27773c;
                Object obj3 = cVar3.f27771a;
                int i20 = cVar3.f27772b;
                if (i20 == i15 && i19 == i14) {
                    lVar.removeLast();
                    lVar.addLast(new b.c(((s) obj3).a((s) obj), i15, i14));
                } else if (i20 == i19) {
                    arrayList2.add(new b.c(obj3, i20, i19));
                    lVar.removeLast();
                    lVar.addLast(new b.c(obj, i15, i14));
                } else {
                    if (i19 < i14) {
                        throw new IllegalArgumentException();
                    }
                    lVar.addLast(new b.c(((s) obj3).a((s) obj), i15, i14));
                }
            } else {
                lVar.addLast(new b.c(obj, i15, i14));
            }
            i12++;
            listU = list6;
            list3 = list7;
            size = i18;
            i11 = 0;
        }
        List list8 = list3;
        while (i13 <= str2.length() && !lVar.isEmpty()) {
            b.c cVar4 = (b.c) lVar.last();
            Object obj4 = cVar4.f27771a;
            int i21 = cVar4.f27773c;
            arrayList2.add(new b.c(obj4, i13, i21));
            while (!lVar.isEmpty() && i21 == ((b.c) lVar.last()).f27773c) {
                lVar.removeLast();
            }
            i13 = i21;
        }
        if (i13 < str2.length()) {
            arrayList2.add(new b.c(sVar, i13, str2.length()));
        }
        if (arrayList2.isEmpty()) {
            i10 = 0;
            arrayList2.add(new b.c(sVar, 0, 0));
        } else {
            i10 = 0;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int size2 = arrayList2.size();
        int i22 = i10;
        while (i22 < size2) {
            b.c cVar5 = (b.c) arrayList2.get(i22);
            int i23 = cVar5.f27772b;
            int i24 = cVar5.f27773c;
            if (i23 != i24) {
                strSubstring = str2.substring(i23, i24);
                kotlin.jvm.internal.r.d(strSubstring, "substring(...)");
            } else {
                strSubstring = "";
            }
            List listA = e.a(bVar2, i23, i24, d.f27792a);
            t2.b bVar4 = new t2.b(strSubstring, (List<? extends b.c<? extends b.a>>) (listA == null ? list8 : listA));
            s sVar2 = (s) cVar5.f27771a;
            if (sVar2.f27876b == Integer.MIN_VALUE) {
                str = str2;
                sVar2 = new s(sVar2.f27875a, sVar.f27876b, sVar2.f27877c, sVar2.f27878d, sVar2.f27879e, sVar2.f27880f, sVar2.f27881g, sVar2.f27882h, sVar2.f27883i);
            } else {
                str = str2;
            }
            l0 l0Var3 = new l0(l0Var2.f27852a, sVar.a(sVar2));
            List list9 = bVar4.f27760a;
            List list10 = list9 == null ? list8 : list9;
            List<b.c<u>> list11 = this.f27856b;
            ArrayList arrayList4 = new ArrayList(list11.size());
            int size3 = list11.size();
            int i25 = 0;
            while (i25 < size3) {
                b.c<u> cVar6 = list11.get(i25);
                s sVar3 = sVar;
                int i26 = cVar6.f27772b;
                l0 l0Var4 = l0Var3;
                int i27 = cVar6.f27773c;
                if (e.b(i23, i24, i26, i27)) {
                    if (i23 > i26 || i27 > i24) {
                        z2.a.a("placeholder can not overlap with paragraph.");
                    }
                    list2 = list11;
                    arrayList4.add(new b.c(cVar6.f27771a, i26 - i23, i27 - i23));
                } else {
                    list2 = list11;
                }
                i25++;
                list11 = list2;
                l0Var3 = l0Var4;
                sVar = sVar3;
            }
            arrayList3.add(new p(new b3.c(strSubstring, l0Var3, list10, arrayList4, aVar, dVar), i23, i24));
            i22++;
            bVar2 = bVar;
            l0Var2 = l0Var;
            str2 = str;
        }
        this.f27859e = arrayList3;
    }

    @Override // t2.q
    public final boolean a() {
        ArrayList arrayList = this.f27859e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((p) arrayList.get(i10)).f27872a.a()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, pg.j] */
    @Override // t2.q
    public final float b() {
        return ((Number) this.f27857c.getValue()).floatValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, pg.j] */
    @Override // t2.q
    public final float c() {
        return ((Number) this.f27858d.getValue()).floatValue();
    }
}
