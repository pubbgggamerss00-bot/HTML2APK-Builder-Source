package e0;

import g2.g1;
import java.util.ArrayList;
import x0.n1;

/* loaded from: classes.dex */
public final class h0 extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n1<pg.f0> f8193a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f8194b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(ArrayList arrayList, n1 n1Var) {
        super(1);
        this.f8193a = n1Var;
        this.f8194b = arrayList;
    }

    @Override // eh.l
    public final pg.f0 invoke(g1.a aVar) {
        g1.a aVar2 = aVar;
        g0 g0Var = new g0(this.f8194b);
        aVar2.f11387a = true;
        g0Var.invoke(aVar2);
        aVar2.f11387a = false;
        this.f8193a.getValue();
        return pg.f0.f21461a;
    }
}
