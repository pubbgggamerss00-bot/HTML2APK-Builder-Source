package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c implements Runnable {
    public final /* synthetic */ b.d s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ h f155t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ f f156u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ b.c f157v;

    public c(b.c cVar, b.d dVar, h hVar, f fVar) {
        this.f157v = cVar;
        this.s = dVar;
        this.f155t = hVar;
        this.f156u = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b bVar = b.this;
        b.d dVar = this.s;
        if (dVar != null) {
            bVar.S = true;
            dVar.f153b.c(false);
            bVar.S = false;
        }
        h hVar = this.f155t;
        if (hVar.isEnabled() && hVar.hasSubMenu()) {
            this.f156u.q(hVar, null, 4);
        }
    }
}
