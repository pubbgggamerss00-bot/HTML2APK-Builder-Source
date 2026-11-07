package u0;

import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f14502a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList<l> f14503b = new CopyOnWriteArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f14504c = new HashMap();

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final androidx.lifecycle.h f14505a;

        /* renamed from: b, reason: collision with root package name */
        public androidx.lifecycle.k f14506b;

        public a(androidx.lifecycle.h hVar, androidx.lifecycle.k kVar) {
            this.f14505a = hVar;
            this.f14506b = kVar;
            hVar.a(kVar);
        }
    }

    public j(Runnable runnable) {
        this.f14502a = runnable;
    }

    public final void a(l lVar) {
        this.f14503b.remove(lVar);
        a aVar = (a) this.f14504c.remove(lVar);
        if (aVar != null) {
            aVar.f14505a.c(aVar.f14506b);
            aVar.f14506b = null;
        }
        this.f14502a.run();
    }
}
