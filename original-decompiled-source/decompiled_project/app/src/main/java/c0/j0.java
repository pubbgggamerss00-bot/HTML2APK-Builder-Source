package c0;

import g2.g1;
import java.util.ArrayList;
import java.util.List;
import x0.n1;

/* loaded from: classes.dex */
public final class j0 extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n1<pg.f0> f4405a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f4406b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4407c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f4408d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(n1 n1Var, ArrayList arrayList, List list, boolean z10) {
        super(1);
        this.f4405a = n1Var;
        this.f4406b = arrayList;
        this.f4407c = list;
        this.f4408d = z10;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // eh.l
    public final pg.f0 invoke(g1.a aVar) {
        g1.a aVar2 = aVar;
        i0 i0Var = new i0(this.f4406b, this.f4407c, this.f4408d);
        aVar2.f11387a = true;
        i0Var.invoke(aVar2);
        aVar2.f11387a = false;
        this.f4405a.getValue();
        return pg.f0.f21461a;
    }
}
