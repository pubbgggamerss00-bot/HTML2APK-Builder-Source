package p;

import a.a;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c extends a.AbstractBinderC0000a {
    public final Handler s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p.b f14017t;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a implements Runnable {
        public final /* synthetic */ Bundle s;

        public a(Bundle bundle) {
            this.s = bundle;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c.this.f14017t.j(this.s);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class b implements Runnable {
        public final /* synthetic */ int s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Bundle f14019t;

        public b(int i6, Bundle bundle) {
            this.s = i6;
            this.f14019t = bundle;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c.this.f14017t.g(this.f14019t, this.s);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: p.c$c, reason: collision with other inner class name */
    public class RunnableC0083c implements Runnable {
        public final /* synthetic */ String s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Bundle f14021t;

        public RunnableC0083c(String str, Bundle bundle) {
            this.s = str;
            this.f14021t = bundle;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c.this.f14017t.a(this.s, this.f14021t);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class d implements Runnable {
        public final /* synthetic */ Bundle s;

        public d(Bundle bundle) {
            this.s = bundle;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c.this.f14017t.e(this.s);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class e implements Runnable {
        public final /* synthetic */ String s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Bundle f14024t;

        public e(String str, Bundle bundle) {
            this.s = str;
            this.f14024t = bundle;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c.this.f14017t.h(this.s, this.f14024t);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class f implements Runnable {
        public final /* synthetic */ int s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Uri f14026t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ boolean f14027u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Bundle f14028v;

        public f(int i6, Uri uri, boolean z6, Bundle bundle) {
            this.s = i6;
            this.f14026t = uri;
            this.f14027u = z6;
            this.f14028v = bundle;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c.this.f14017t.i(this.s, this.f14026t, this.f14027u, this.f14028v);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class g implements Runnable {
        public final /* synthetic */ int s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ int f14030t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Bundle f14031u;

        public g(int i6, int i7, Bundle bundle) {
            this.s = i6;
            this.f14030t = i7;
            this.f14031u = bundle;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c.this.f14017t.d(this.s, this.f14030t, this.f14031u);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class h implements Runnable {
        public final /* synthetic */ Bundle s;

        public h(Bundle bundle) {
            this.s = bundle;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c.this.f14017t.k(this.s);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class i implements Runnable {
        public final /* synthetic */ int s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ int f14034t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ int f14035u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ int f14036v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ int f14037w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Bundle f14038x;

        public i(int i6, int i7, int i8, int i9, int i10, Bundle bundle) {
            this.s = i6;
            this.f14034t = i7;
            this.f14035u = i8;
            this.f14036v = i9;
            this.f14037w = i10;
            this.f14038x = bundle;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c.this.f14017t.c(this.s, this.f14034t, this.f14035u, this.f14036v, this.f14037w, this.f14038x);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class j implements Runnable {
        public final /* synthetic */ Bundle s;

        public j(Bundle bundle) {
            this.s = bundle;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c.this.f14017t.f(this.s);
        }
    }

    public c(p.b bVar) {
        this.f14017t = bVar;
        attachInterface(this, a.a.f0a);
        this.s = new Handler(Looper.getMainLooper());
    }

    @Override // a.a
    public final void B0(Bundle bundle) {
        if (this.f14017t == null) {
            return;
        }
        this.s.post(new a(bundle));
    }

    @Override // a.a
    public final void O0(int i6, int i7, Bundle bundle) {
        if (this.f14017t == null) {
            return;
        }
        this.s.post(new g(i6, i7, bundle));
    }

    @Override // a.a
    public final void P1(String str, Bundle bundle) {
        if (this.f14017t == null) {
            return;
        }
        this.s.post(new e(str, bundle));
    }

    @Override // a.a
    public final void R(int i6, int i7, int i8, int i9, int i10, Bundle bundle) {
        if (this.f14017t == null) {
            return;
        }
        this.s.post(new i(i6, i7, i8, i9, i10, bundle));
    }

    @Override // a.a
    public final void W1(Bundle bundle) {
        if (this.f14017t == null) {
            return;
        }
        this.s.post(new d(bundle));
    }

    @Override // a.a
    public final void Y1(int i6, Uri uri, boolean z6, Bundle bundle) {
        if (this.f14017t == null) {
            return;
        }
        this.s.post(new f(i6, uri, z6, bundle));
    }

    @Override // a.a
    public final void f1(String str, Bundle bundle) {
        if (this.f14017t == null) {
            return;
        }
        this.s.post(new RunnableC0083c(str, bundle));
    }

    @Override // a.a
    public final Bundle j0(String str, Bundle bundle) {
        p.b bVar = this.f14017t;
        if (bVar == null) {
            return null;
        }
        return bVar.b(str, bundle);
    }

    @Override // a.a
    public final void l1(Bundle bundle) {
        if (this.f14017t == null) {
            return;
        }
        this.s.post(new h(bundle));
    }

    @Override // a.a
    public final void y0(Bundle bundle) {
        if (this.f14017t == null) {
            return;
        }
        this.s.post(new j(bundle));
    }

    @Override // a.a
    public final void z0(Bundle bundle, int i6) {
        if (this.f14017t == null) {
            return;
        }
        this.s.post(new b(i6, bundle));
    }
}
