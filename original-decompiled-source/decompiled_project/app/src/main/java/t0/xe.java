package t0;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class xe extends kotlin.jvm.internal.s implements eh.p<g2.t1, f3.b, g2.m0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f1.b f27423a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f27424b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.b f27425c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xe(f1.b bVar, eh.p pVar, f1.b bVar2) {
        super(2);
        this.f27423a = bVar;
        this.f27424b = pVar;
        this.f27425c = bVar2;
    }

    @Override // eh.p
    public final g2.m0 invoke(g2.t1 t1Var, f3.b bVar) {
        g2.t1 t1Var2 = t1Var;
        long j10 = bVar.f8811a;
        int i10 = f3.b.i(j10);
        List<g2.k0> listF0 = t1Var2.F0(bf.f25554a, this.f27423a);
        int size = listF0.size();
        kotlin.jvm.internal.e0 e0Var = new kotlin.jvm.internal.e0();
        if (size > 0) {
            e0Var.f16324a = i10 / size;
        }
        Integer numValueOf = 0;
        int size2 = listF0.size();
        for (int i11 = 0; i11 < size2; i11++) {
            numValueOf = Integer.valueOf(Math.max(listF0.get(i11).z(e0Var.f16324a), numValueOf.intValue()));
        }
        int iIntValue = numValueOf.intValue();
        ArrayList arrayList = new ArrayList(listF0.size());
        int size3 = listF0.size();
        for (int i12 = 0; i12 < size3; i12++) {
            g2.k0 k0Var = listF0.get(i12);
            int i13 = e0Var.f16324a;
            arrayList.add(k0Var.P(f3.b.a(i13, i13, iIntValue, iIntValue)));
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i14 = 0; i14 < size; i14++) {
            f3.h hVar = new f3.h(t1Var2.u(Math.min(listF0.get(i14).O(iIntValue), e0Var.f16324a)) - (he.f26034c * 2));
            f3.h hVar2 = new f3.h(24);
            if (hVar.compareTo(hVar2) < 0) {
                hVar = hVar2;
            }
            arrayList2.add(new ie(t1Var2.u(e0Var.f16324a) * i14, t1Var2.u(e0Var.f16324a), hVar.f8817a));
        }
        return t1Var2.i0(i10, iIntValue, qg.a0.f22708a, new we(arrayList, t1Var2, this.f27424b, e0Var, j10, iIntValue, this.f27425c, arrayList2, i10));
    }
}
