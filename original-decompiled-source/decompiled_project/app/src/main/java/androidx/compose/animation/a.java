package androidx.compose.animation;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.ui.d;
import eh.l;
import eh.p;
import eh.q;
import h1.u;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.s;
import pg.f0;
import r.f;
import r.g;
import r.h;
import r.k;
import r.n0;
import r.u1;
import r.w1;
import s.y1;
import x0.j;
import x0.x1;

/* loaded from: classes.dex */
public final class a extends s implements p<j, Integer, f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y1<Object> f756a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f757b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l<r.p<Object>, n0> f758c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AnimatedContentTransitionScopeImpl<Object> f759d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u<Object> f760e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f1.b f761f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(y1 y1Var, Object obj, l lVar, AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl, u uVar, f1.b bVar) {
        super(2);
        this.f756a = y1Var;
        this.f757b = obj;
        this.f758c = lVar;
        this.f759d = animatedContentTransitionScopeImpl;
        this.f760e = uVar;
        this.f761f = bVar;
    }

    @Override // eh.p
    public final f0 invoke(j jVar, Integer num) {
        j jVar2 = jVar;
        int iIntValue = num.intValue();
        if (jVar2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            n0 n0VarG = jVar2.g();
            l<r.p<Object>, n0> lVar = this.f758c;
            AnimatedContentTransitionScopeImpl<Object> animatedContentTransitionScopeImpl = this.f759d;
            j.a.C0321a c0321a = j.a.f31715a;
            if (n0VarG == c0321a) {
                n0VarG = lVar.invoke(animatedContentTransitionScopeImpl);
                jVar2.C(n0VarG);
            }
            n0 n0Var = (n0) n0VarG;
            y1<Object> y1Var = this.f756a;
            y1.b<Object> bVarF = y1Var.f();
            x1 x1Var = y1Var.f24004d;
            Object objE = bVarF.e();
            Object obj = this.f757b;
            boolean zC = jVar2.c(r.a(objE, obj));
            Object objG = jVar2.g();
            if (zC || objG == c0321a) {
                objG = r.a(y1Var.f().e(), obj) ? w1.f22979a : lVar.invoke(animatedContentTransitionScopeImpl).f22889b;
                jVar2.C(objG);
            }
            w1 w1Var = (w1) objG;
            Object objG2 = jVar2.g();
            if (objG2 == c0321a) {
                objG2 = new AnimatedContentTransitionScopeImpl.a(r.a(obj, x1Var.getValue()));
                jVar2.C(objG2);
            }
            AnimatedContentTransitionScopeImpl.a aVar = (AnimatedContentTransitionScopeImpl.a) objG2;
            u1 u1Var = n0Var.f22888a;
            boolean zL = jVar2.l(n0Var);
            Object objG3 = jVar2.g();
            if (zL || objG3 == c0321a) {
                objG3 = new f(n0Var);
                jVar2.C(objG3);
            }
            androidx.compose.ui.d dVarA = androidx.compose.ui.layout.b.a(d.a.f1143b, (q) objG3);
            aVar.f734b.setValue(Boolean.valueOf(r.a(obj, x1Var.getValue())));
            androidx.compose.ui.d dVarH = dVarA.h(aVar);
            boolean zL2 = jVar2.l(obj);
            Object objG4 = jVar2.g();
            if (zL2 || objG4 == c0321a) {
                objG4 = new g(obj);
                jVar2.C(objG4);
            }
            l lVar2 = (l) objG4;
            boolean zK = jVar2.K(w1Var);
            Object objG5 = jVar2.g();
            if (zK || objG5 == c0321a) {
                objG5 = new h(w1Var);
                jVar2.C(objG5);
            }
            d.a(this.f756a, lVar2, dVarH, u1Var, w1Var, (p) objG5, f1.c.b(-616195562, new k(this.f760e, obj, animatedContentTransitionScopeImpl, this.f761f), jVar2), jVar2, 12582912);
        } else {
            jVar2.v();
        }
        return f0.f21461a;
    }
}
