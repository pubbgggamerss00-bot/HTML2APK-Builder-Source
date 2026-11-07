package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.l;

/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final v f2353a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f2354b = new Handler();

    /* renamed from: c, reason: collision with root package name */
    public a f2355c;

    public static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final v f2356a;

        /* renamed from: b, reason: collision with root package name */
        public final l.a f2357b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f2358c;

        public a(v registry, l.a event) {
            kotlin.jvm.internal.r.e(registry, "registry");
            kotlin.jvm.internal.r.e(event, "event");
            this.f2356a = registry;
            this.f2357b = event;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f2358c) {
                return;
            }
            this.f2356a.f(this.f2357b);
            this.f2358c = true;
        }
    }

    public u0(x xVar) {
        this.f2353a = new v(xVar);
    }

    public final void a(l.a aVar) {
        a aVar2 = this.f2355c;
        if (aVar2 != null) {
            aVar2.run();
        }
        a aVar3 = new a(this.f2353a, aVar);
        this.f2355c = aVar3;
        this.f2354b.postAtFrontOfQueue(aVar3);
    }
}
