package t0;

import com.yalantis.ucrop.view.CropImageView;
import g2.g1;
import java.util.ArrayList;
import java.util.List;
import z.b;

/* loaded from: classes.dex */
public final class g implements g2.l0 {

    public static final class a extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f25897a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g2.o0 f25898b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f25899c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ArrayList f25900d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ArrayList arrayList, g2.o0 o0Var, int i10, ArrayList arrayList2) {
            super(1);
            float f10 = p.f26649a;
            this.f25897a = arrayList;
            this.f25898b = o0Var;
            this.f25899c = i10;
            this.f25900d = arrayList2;
        }

        @Override // eh.l
        public final pg.f0 invoke(g1.a aVar) {
            g2.o0 o0Var;
            g1.a aVar2 = aVar;
            float f10 = p.f26651c;
            ArrayList arrayList = this.f25897a;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                List list = (List) arrayList.get(i10);
                int size2 = list.size();
                int[] iArr = new int[size2];
                int i11 = 0;
                while (true) {
                    o0Var = this.f25898b;
                    if (i11 >= size2) {
                        break;
                    }
                    iArr[i11] = ((g2.g1) list.get(i11)).f11382a + (i11 < qg.p.i(list) ? o0Var.b1(f10) : 0);
                    i11++;
                }
                b.d dVar = z.b.f34445b;
                int[] iArr2 = new int[size2];
                for (int i12 = 0; i12 < size2; i12++) {
                    iArr2[i12] = 0;
                }
                dVar.b(o0Var, this.f25899c, iArr, o0Var.getLayoutDirection(), iArr2);
                int size3 = list.size();
                for (int i13 = 0; i13 < size3; i13++) {
                    aVar2.d((g2.g1) list.get(i13), iArr2[i13], ((Number) this.f25900d.get(i10)).intValue(), CropImageView.DEFAULT_ASPECT_RATIO);
                }
            }
            return pg.f0.f21461a;
        }
    }

    public static final void a(ArrayList arrayList, kotlin.jvm.internal.e0 e0Var, g2.o0 o0Var, ArrayList arrayList2, ArrayList arrayList3, kotlin.jvm.internal.e0 e0Var2, ArrayList arrayList4, kotlin.jvm.internal.e0 e0Var3, kotlin.jvm.internal.e0 e0Var4) {
        float f10 = p.f26652d;
        if (!arrayList.isEmpty()) {
            e0Var.f16324a = o0Var.b1(f10) + e0Var.f16324a;
        }
        arrayList.add(0, qg.x.c0(arrayList2));
        arrayList3.add(Integer.valueOf(e0Var2.f16324a));
        arrayList4.add(Integer.valueOf(e0Var.f16324a));
        e0Var.f16324a += e0Var2.f16324a;
        e0Var3.f16324a = Math.max(e0Var3.f16324a, e0Var4.f16324a);
        arrayList2.clear();
        e0Var4.f16324a = 0;
        e0Var2.f16324a = 0;
    }

    @Override // g2.l0
    public final g2.m0 h(g2.o0 o0Var, List<? extends g2.k0> list, long j10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        kotlin.jvm.internal.e0 e0Var = new kotlin.jvm.internal.e0();
        kotlin.jvm.internal.e0 e0Var2 = new kotlin.jvm.internal.e0();
        ArrayList arrayList6 = new ArrayList();
        kotlin.jvm.internal.e0 e0Var3 = new kotlin.jvm.internal.e0();
        kotlin.jvm.internal.e0 e0Var4 = new kotlin.jvm.internal.e0();
        float f10 = p.f26651c;
        float f11 = p.f26649a;
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            g2.g1 g1VarP = list.get(i10).P(j10);
            if (!arrayList6.isEmpty()) {
                ArrayList arrayList7 = arrayList3;
                kotlin.jvm.internal.e0 e0Var5 = e0Var2;
                if (o0Var.b1(f10) + e0Var3.f16324a + g1VarP.f11382a <= f3.b.i(j10)) {
                    arrayList3 = arrayList7;
                    e0Var2 = e0Var5;
                } else {
                    arrayList3 = arrayList7;
                    e0Var2 = e0Var5;
                    a(arrayList3, e0Var2, o0Var, arrayList6, arrayList4, e0Var4, arrayList5, e0Var, e0Var3);
                }
            }
            if (arrayList6.isEmpty()) {
                arrayList2 = arrayList3;
            } else {
                arrayList2 = arrayList3;
                e0Var3.f16324a = o0Var.b1(f10) + e0Var3.f16324a;
            }
            arrayList6.add(g1VarP);
            e0Var3.f16324a += g1VarP.f11382a;
            e0Var4.f16324a = Math.max(e0Var4.f16324a, g1VarP.f11383b);
            i10++;
            arrayList3 = arrayList2;
        }
        ArrayList arrayList8 = arrayList3;
        if (arrayList6.isEmpty()) {
            arrayList = arrayList8;
        } else {
            float f12 = p.f26649a;
            arrayList = arrayList8;
            a(arrayList, e0Var2, o0Var, arrayList6, arrayList4, e0Var4, arrayList5, e0Var, e0Var3);
        }
        int iMax = Math.max(e0Var.f16324a, f3.b.k(j10));
        int iMax2 = Math.max(e0Var2.f16324a, f3.b.j(j10));
        float f13 = p.f26649a;
        return o0Var.i0(iMax, iMax2, qg.a0.f22708a, new a(arrayList, o0Var, iMax, arrayList5));
    }
}
