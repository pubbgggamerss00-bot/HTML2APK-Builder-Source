package t0;

import g2.g1;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class we extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList f27337a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g2.t1 f27338b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f27339c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.e0 f27340d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f27341e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f27342f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f1.b f27343g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ArrayList f27344h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f27345j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public we(ArrayList arrayList, g2.t1 t1Var, eh.p pVar, kotlin.jvm.internal.e0 e0Var, long j10, int i10, f1.b bVar, ArrayList arrayList2, int i11) {
        super(1);
        this.f27337a = arrayList;
        this.f27338b = t1Var;
        this.f27339c = pVar;
        this.f27340d = e0Var;
        this.f27341e = j10;
        this.f27342f = i10;
        this.f27343g = bVar;
        this.f27344h = arrayList2;
        this.f27345j = i11;
    }

    @Override // eh.l
    public final pg.f0 invoke(g1.a aVar) {
        int i10;
        g1.a aVar2 = aVar;
        ArrayList arrayList = this.f27337a;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            g1.a.g(aVar2, (g2.g1) arrayList.get(i11), this.f27340d.f16324a * i11, 0);
        }
        bf bfVar = bf.f25555b;
        eh.p<x0.j, Integer, pg.f0> pVar = this.f27339c;
        g2.t1 t1Var = this.f27338b;
        List<g2.k0> listF0 = t1Var.F0(bfVar, pVar);
        int size2 = listF0.size();
        int i12 = 0;
        while (true) {
            i10 = this.f27342f;
            if (i12 >= size2) {
                break;
            }
            g2.g1 g1VarP = listF0.get(i12).P(f3.b.b(this.f27341e, 0, 0, 0, 0, 11));
            g1.a.g(aVar2, g1VarP, 0, i10 - g1VarP.f11383b);
            i12++;
        }
        List<g2.k0> listF02 = t1Var.F0(bf.f25556c, new f1.b(1621992604, true, new ve(this.f27343g, this.f27344h)));
        int size3 = listF02.size();
        for (int i13 = 0; i13 < size3; i13++) {
            g2.k0 k0Var = listF02.get(i13);
            int i14 = this.f27345j;
            if (!((i14 >= 0) & (i10 >= 0))) {
                f3.l.a("width and height must be >= 0");
            }
            g1.a.g(aVar2, k0Var.P(f3.c.h(i14, i14, i10, i10)), 0, 0);
        }
        return pg.f0.f21461a;
    }
}
