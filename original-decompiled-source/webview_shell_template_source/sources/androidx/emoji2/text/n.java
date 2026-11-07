package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import androidx.camera.camera2.internal.s0;
import androidx.emoji2.text.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class n extends g.c {

    /* renamed from: d, reason: collision with root package name */
    public static final a f1027d = new a();

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a {
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class b implements g.h {

        /* renamed from: a, reason: collision with root package name */
        public final Context f1028a;

        /* renamed from: b, reason: collision with root package name */
        public final r0.e f1029b;

        /* renamed from: c, reason: collision with root package name */
        public final a f1030c;

        /* renamed from: d, reason: collision with root package name */
        public final Object f1031d = new Object();

        /* renamed from: e, reason: collision with root package name */
        public Handler f1032e;

        /* renamed from: f, reason: collision with root package name */
        public ThreadPoolExecutor f1033f;

        /* renamed from: g, reason: collision with root package name */
        public ThreadPoolExecutor f1034g;
        public g.i h;

        public b(Context context, r0.e eVar) {
            androidx.work.j.e("Context cannot be null", context);
            this.f1028a = context.getApplicationContext();
            this.f1029b = eVar;
            this.f1030c = n.f1027d;
        }

        @Override // androidx.emoji2.text.g.h
        public final void a(g.i iVar) {
            synchronized (this.f1031d) {
                this.h = iVar;
            }
            synchronized (this.f1031d) {
                try {
                    if (this.h == null) {
                        return;
                    }
                    if (this.f1033f == null) {
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new androidx.emoji2.text.a("emojiCompat"));
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                        this.f1034g = threadPoolExecutor;
                        this.f1033f = threadPoolExecutor;
                    }
                    this.f1033f.execute(new androidx.camera.core.processing.p(3, this));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void b() {
            synchronized (this.f1031d) {
                try {
                    this.h = null;
                    Handler handler = this.f1032e;
                    if (handler != null) {
                        handler.removeCallbacks(null);
                    }
                    this.f1032e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.f1034g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f1033f = null;
                    this.f1034g = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final r0.l c() {
            try {
                a aVar = this.f1030c;
                Context context = this.f1028a;
                r0.e eVar = this.f1029b;
                aVar.getClass();
                Object[] objArr = {eVar};
                ArrayList arrayList = new ArrayList(1);
                Object obj = objArr[0];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
                r0.k kVarA = r0.d.a(context, Collections.unmodifiableList(arrayList));
                int i6 = kVarA.f14246a;
                if (i6 != 0) {
                    throw new RuntimeException(s0.a(i6, "fetchFonts failed (", ")"));
                }
                r0.l[] lVarArr = kVarA.f14247b.get(0);
                if (lVarArr == null || lVarArr.length == 0) {
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                return lVarArr[0];
            } catch (PackageManager.NameNotFoundException e6) {
                throw new RuntimeException("provider not found", e6);
            }
        }
    }
}
