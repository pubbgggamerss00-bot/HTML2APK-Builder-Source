package t0;

import g2.g1;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class re implements g2.u0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ se f26916a;

    public static final class a extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f26917a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f26918b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ArrayList f26919c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.e0 f26920d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f26921e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, kotlin.jvm.internal.e0 e0Var, int i10) {
            super(1);
            this.f26917a = arrayList;
            this.f26918b = arrayList2;
            this.f26919c = arrayList3;
            this.f26920d = e0Var;
            this.f26921e = i10;
        }

        @Override // eh.l
        public final pg.f0 invoke(g1.a aVar) {
            int i10;
            g1.a aVar2 = aVar;
            ArrayList arrayList = this.f26917a;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                g1.a.g(aVar2, (g2.g1) arrayList.get(i11), this.f26920d.f16324a * i11, 0);
            }
            ArrayList arrayList2 = this.f26918b;
            int size2 = arrayList2.size();
            int i12 = 0;
            while (true) {
                i10 = this.f26921e;
                if (i12 >= size2) {
                    break;
                }
                g2.g1 g1Var = (g2.g1) arrayList2.get(i12);
                g1.a.g(aVar2, g1Var, 0, i10 - g1Var.f11383b);
                i12++;
            }
            ArrayList arrayList3 = this.f26919c;
            int size3 = arrayList3.size();
            for (int i13 = 0; i13 < size3; i13++) {
                g2.g1 g1Var2 = (g2.g1) arrayList3.get(i13);
                g1.a.g(aVar2, g1Var2, 0, i10 - g1Var2.f11383b);
            }
            return pg.f0.f21461a;
        }
    }

    public re(se seVar) {
        this.f26916a = seVar;
    }

    @Override // g2.u0
    public final g2.m0 h(g2.o0 o0Var, List<? extends List<? extends g2.k0>> list, long j10) {
        ArrayList arrayList = (ArrayList) list;
        List list2 = (List) arrayList.get(0);
        List list3 = (List) arrayList.get(1);
        List list4 = (List) arrayList.get(2);
        int i10 = f3.b.i(j10);
        int size = list2.size();
        kotlin.jvm.internal.e0 e0Var = new kotlin.jvm.internal.e0();
        if (size > 0) {
            e0Var.f16324a = i10 / size;
        }
        Integer numValueOf = 0;
        int size2 = list2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            numValueOf = Integer.valueOf(Math.max(((g2.k0) list2.get(i11)).z(e0Var.f16324a), numValueOf.intValue()));
        }
        int iIntValue = numValueOf.intValue();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            f3.h hVar = new f3.h(o0Var.u(Math.min(((g2.k0) list2.get(i12)).O(iIntValue), e0Var.f16324a)) - (he.f26034c * 2));
            f3.h hVar2 = new f3.h(24);
            if (hVar.compareTo(hVar2) < 0) {
                hVar = hVar2;
            }
            arrayList2.add(new ie(o0Var.u(e0Var.f16324a) * i12, o0Var.u(e0Var.f16324a), hVar.f8817a));
        }
        this.f26916a.f27002a.setValue(arrayList2);
        ArrayList arrayList3 = new ArrayList(list2.size());
        int size3 = list2.size();
        for (int i13 = 0; i13 < size3; i13++) {
            g2.k0 k0Var = (g2.k0) list2.get(i13);
            int i14 = e0Var.f16324a;
            arrayList3.add(k0Var.P(f3.b.a(i14, i14, iIntValue, iIntValue)));
        }
        ArrayList arrayList4 = new ArrayList(list3.size());
        int i15 = 0;
        for (int size4 = list3.size(); i15 < size4; size4 = size4) {
            arrayList4.add(((g2.k0) list3.get(i15)).P(f3.b.b(j10, 0, 0, 0, 0, 11)));
            i15++;
        }
        ArrayList arrayList5 = new ArrayList(list4.size());
        int i16 = 0;
        for (int size5 = list4.size(); i16 < size5; size5 = size5) {
            g2.k0 k0Var2 = (g2.k0) list4.get(i16);
            int i17 = e0Var.f16324a;
            arrayList5.add(k0Var2.P(f3.b.a(i17, i17, 0, iIntValue)));
            i16++;
            list4 = list4;
        }
        return o0Var.i0(i10, iIntValue, qg.a0.f22708a, new a(arrayList3, arrayList4, arrayList5, e0Var, iIntValue));
    }
}
