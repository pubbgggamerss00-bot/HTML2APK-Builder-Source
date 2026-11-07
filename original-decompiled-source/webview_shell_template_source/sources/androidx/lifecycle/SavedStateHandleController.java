package androidx.lifecycle;

import androidx.lifecycle.h;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class SavedStateHandleController implements k {
    public final String s;

    /* renamed from: t, reason: collision with root package name */
    public final y f1270t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1271u;

    public SavedStateHandleController(String str, y yVar) {
        this.s = str;
        this.f1270t = yVar;
    }

    @Override // androidx.lifecycle.k
    public final void a(m mVar, h.a aVar) {
        if (aVar == h.a.ON_DESTROY) {
            this.f1271u = false;
            mVar.getLifecycle().c(this);
        }
    }

    public final void b(h hVar, androidx.savedstate.a aVar) {
        kotlin.jvm.internal.j.e("registry", aVar);
        kotlin.jvm.internal.j.e("lifecycle", hVar);
        if (this.f1271u) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f1271u = true;
        hVar.a(this);
        aVar.c(this.s, this.f1270t.f1344e);
    }
}
