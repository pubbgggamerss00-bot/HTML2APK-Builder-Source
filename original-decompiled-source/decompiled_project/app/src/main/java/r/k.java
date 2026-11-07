package r;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import x0.j;
import x0.r3;

/* loaded from: classes.dex */
public final class k extends kotlin.jvm.internal.s implements eh.q<h0, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h1.u<Object> f22865a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22866b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AnimatedContentTransitionScopeImpl<Object> f22867c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f1.b f22868d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(h1.u uVar, Object obj, AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl, f1.b bVar) {
        super(3);
        this.f22865a = uVar;
        this.f22866b = obj;
        this.f22867c = animatedContentTransitionScopeImpl;
        this.f22868d = bVar;
    }

    @Override // eh.q
    public final pg.f0 b(h0 h0Var, x0.j jVar, Integer num) {
        h0 h0Var2 = h0Var;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= (iIntValue & 8) == 0 ? jVar2.K(h0Var2) : jVar2.l(h0Var2) ? 4 : 2;
        }
        if (jVar2.A(iIntValue & 1, (iIntValue & 19) != 18)) {
            h1.u<Object> uVar = this.f22865a;
            boolean zK = jVar2.K(uVar);
            Object obj = this.f22866b;
            boolean zL = zK | jVar2.l(obj);
            AnimatedContentTransitionScopeImpl<Object> animatedContentTransitionScopeImpl = this.f22867c;
            boolean zL2 = zL | jVar2.l(animatedContentTransitionScopeImpl);
            Object objG = jVar2.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (zL2 || objG == c0321a) {
                objG = new j(uVar, obj, animatedContentTransitionScopeImpl);
                jVar2.C(objG);
            }
            x0.o0.a(h0Var2, (eh.l) objG, jVar2);
            p.l0<Object, r3<f3.p>> l0Var = animatedContentTransitionScopeImpl.f729e;
            kotlin.jvm.internal.r.c(h0Var2, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
            l0Var.l(obj, ((i0) h0Var2).f22852b);
            Object objG2 = jVar2.g();
            if (objG2 == c0321a) {
                objG2 = new o(h0Var2);
                jVar2.C(objG2);
            }
            this.f22868d.f((o) objG2, obj, jVar2, 0);
        } else {
            jVar2.v();
        }
        return pg.f0.f21461a;
    }
}
