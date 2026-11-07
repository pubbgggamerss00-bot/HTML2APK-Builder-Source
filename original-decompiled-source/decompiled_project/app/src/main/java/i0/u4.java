package i0;

import g2.g1;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class u4 implements g2.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final eh.a<Boolean> f13631a;

    /* renamed from: b, reason: collision with root package name */
    public final eh.a<List<p1.e>> f13632b;

    public static final class a extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List<pg.n<g2.g1, f3.m>> f13633a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List<pg.n<g2.g1, eh.a<f3.m>>> f13634b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ArrayList arrayList, ArrayList arrayList2) {
            super(1);
            this.f13633a = arrayList;
            this.f13634b = arrayList2;
        }

        @Override // eh.l
        public final pg.f0 invoke(g1.a aVar) {
            g1.a aVar2 = aVar;
            List<pg.n<g2.g1, f3.m>> list = this.f13633a;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    pg.n<g2.g1, f3.m> nVar = list.get(i10);
                    g1.a.f(aVar2, nVar.f21469a, nVar.f21470b.f8820a);
                }
            }
            List<pg.n<g2.g1, eh.a<f3.m>>> list2 = this.f13634b;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    pg.n<g2.g1, eh.a<f3.m>> nVar2 = list2.get(i11);
                    g2.g1 g1Var = nVar2.f21469a;
                    eh.a<f3.m> aVar3 = nVar2.f21470b;
                    g1.a.f(aVar2, g1Var, aVar3 != null ? aVar3.invoke().f8820a : 0L);
                }
            }
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u4(eh.a<Boolean> aVar, eh.a<? extends List<p1.e>> aVar2) {
        this.f13631a = aVar;
        this.f13632b = aVar2;
    }

    @Override // g2.l0
    public final g2.m0 h(g2.o0 o0Var, List<? extends g2.k0> list, long j10) {
        ArrayList arrayList;
        pg.n nVar;
        ArrayList arrayList2 = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            g2.k0 k0Var = list.get(i10);
            if (!(k0Var.w() instanceof x4)) {
                arrayList2.add(k0Var);
            }
        }
        List<p1.e> listInvoke = this.f13632b.invoke();
        if (listInvoke != null) {
            ArrayList arrayList3 = new ArrayList(listInvoke.size());
            int size2 = listInvoke.size();
            for (int i11 = 0; i11 < size2; i11++) {
                p1.e eVar = listInvoke.get(i11);
                if (eVar != null) {
                    float f10 = eVar.f21132b;
                    float f11 = eVar.f21131a;
                    nVar = new pg.n(((g2.k0) arrayList2.get(i11)).P(f3.c.b((int) Math.floor(eVar.f21133c - f11), (int) Math.floor(eVar.f21134d - f10), 5)), new f3.m((Math.round(f11) << 32) | (Math.round(f10) & BodyPartID.bodyIdMax)));
                } else {
                    nVar = null;
                }
                if (nVar != null) {
                    arrayList3.add(nVar);
                }
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        ArrayList arrayList4 = new ArrayList(list.size());
        int size3 = list.size();
        for (int i12 = 0; i12 < size3; i12++) {
            g2.k0 k0Var2 = list.get(i12);
            if (k0Var2.w() instanceof x4) {
                arrayList4.add(k0Var2);
            }
        }
        return o0Var.i0(f3.b.i(j10), f3.b.h(j10), qg.a0.f22708a, new a(arrayList, i0.f(arrayList4, this.f13631a)));
    }
}
