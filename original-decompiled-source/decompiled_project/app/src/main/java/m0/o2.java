package m0;

import com.yalantis.ucrop.view.CropImageView;
import g2.g1;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class o2 implements g2.l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final o2 f17440a = new o2();

    public static final class a extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f17441a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ArrayList arrayList) {
            super(1);
            this.f17441a = arrayList;
        }

        @Override // eh.l
        public final pg.f0 invoke(g1.a aVar) {
            g1.a aVar2 = aVar;
            ArrayList arrayList = this.f17441a;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                aVar2.d((g2.g1) arrayList.get(i10), 0, 0, CropImageView.DEFAULT_ASPECT_RATIO);
            }
            return pg.f0.f21461a;
        }
    }

    @Override // g2.l0
    public final g2.m0 h(g2.o0 o0Var, List<? extends g2.k0> list, long j10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            g2.g1 g1VarP = list.get(i10).P(j10);
            iMax = Math.max(iMax, g1VarP.f11382a);
            iMax2 = Math.max(iMax2, g1VarP.f11383b);
            arrayList.add(g1VarP);
        }
        return o0Var.i0(iMax, iMax2, qg.a0.f22708a, new a(arrayList));
    }
}
