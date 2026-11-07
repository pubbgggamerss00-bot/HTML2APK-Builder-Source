package androidx.lifecycle;

import androidx.lifecycle.h;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class LegacySavedStateHandleController$tryToAddRecreator$1 implements k {
    public final /* synthetic */ h s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ androidx.savedstate.a f1263t;

    public LegacySavedStateHandleController$tryToAddRecreator$1(h hVar, androidx.savedstate.a aVar) {
        this.s = hVar;
        this.f1263t = aVar;
    }

    @Override // androidx.lifecycle.k
    public final void a(m mVar, h.a aVar) {
        if (aVar == h.a.ON_START) {
            this.s.c(this);
            this.f1263t.d();
        }
    }
}
