package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.h;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final n f1291a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f1292b = new Handler();

    /* renamed from: c, reason: collision with root package name */
    public a f1293c;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class a implements Runnable {
        public final n s;

        /* renamed from: t, reason: collision with root package name */
        public final h.a f1294t;

        /* renamed from: u, reason: collision with root package name */
        public boolean f1295u;

        public a(n nVar, h.a aVar) {
            kotlin.jvm.internal.j.e("registry", nVar);
            kotlin.jvm.internal.j.e("event", aVar);
            this.s = nVar;
            this.f1294t = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f1295u) {
                return;
            }
            this.s.f(this.f1294t);
            this.f1295u = true;
        }
    }

    public e0(LifecycleService lifecycleService) {
        this.f1291a = new n(lifecycleService);
    }

    public final void a(h.a aVar) {
        a aVar2 = this.f1293c;
        if (aVar2 != null) {
            aVar2.run();
        }
        a aVar3 = new a(this.f1291a, aVar);
        this.f1293c = aVar3;
        this.f1292b.postAtFrontOfQueue(aVar3);
    }
}
