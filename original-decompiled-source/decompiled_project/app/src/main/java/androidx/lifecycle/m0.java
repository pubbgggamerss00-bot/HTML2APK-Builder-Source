package androidx.lifecycle;

import androidx.lifecycle.l;

/* loaded from: classes.dex */
public final class m0 implements r {

    /* renamed from: a, reason: collision with root package name */
    public final q0 f2327a;

    public m0(q0 q0Var) {
        this.f2327a = q0Var;
    }

    @Override // androidx.lifecycle.r
    public final void l(t tVar, l.a aVar) {
        if (aVar == l.a.ON_CREATE) {
            tVar.getLifecycle().c(this);
            this.f2327a.b();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + aVar).toString());
        }
    }
}
