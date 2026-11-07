package b0;

import g2.g1;
import java.util.ArrayList;
import java.util.List;
import x0.n1;

/* loaded from: classes.dex */
public final class d0 extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n1<pg.f0> f3312a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f3313b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3314c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f3315d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(n1 n1Var, ArrayList arrayList, List list, boolean z10) {
        super(1);
        this.f3312a = n1Var;
        this.f3313b = arrayList;
        this.f3314c = list;
        this.f3315d = z10;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // eh.l
    public final pg.f0 invoke(g1.a aVar) {
        g1.a aVar2 = aVar;
        c0 c0Var = new c0(this.f3313b, this.f3314c, this.f3315d);
        aVar2.f11387a = true;
        c0Var.invoke(aVar2);
        aVar2.f11387a = false;
        this.f3312a.getValue();
        return pg.f0.f21461a;
    }
}
