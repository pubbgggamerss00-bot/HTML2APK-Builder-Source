package c;

import androidx.lifecycle.t;
import b.d0;
import x0.k0;
import x0.l0;

/* loaded from: classes.dex */
public final class q extends kotlin.jvm.internal.s implements eh.l<l0, k0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d0 f4329a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f4330b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f4331c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(d0 d0Var, t tVar, n nVar) {
        super(1);
        this.f4329a = d0Var;
        this.f4330b = tVar;
        this.f4331c = nVar;
    }

    @Override // eh.l
    public final k0 invoke(l0 l0Var) {
        d0 d0Var = this.f4329a;
        t tVar = this.f4330b;
        n nVar = this.f4331c;
        d0Var.a(tVar, nVar);
        return new p(nVar);
    }
}
