package androidx.lifecycle;

import androidx.lifecycle.h;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class SavedStateHandleAttacher implements k {
    public final a0 s;

    public SavedStateHandleAttacher(a0 a0Var) {
        this.s = a0Var;
    }

    @Override // androidx.lifecycle.k
    public final void a(m mVar, h.a aVar) {
        if (aVar == h.a.ON_CREATE) {
            mVar.getLifecycle().c(this);
            this.s.b();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + aVar).toString());
        }
    }
}
