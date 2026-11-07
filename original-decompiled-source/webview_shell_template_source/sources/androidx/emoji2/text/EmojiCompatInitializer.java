package androidx.emoji2.text;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import androidx.emoji2.text.g;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class EmojiCompatInitializer implements b2.b<Boolean> {

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a extends g.c {
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class b implements g.h {

        /* renamed from: a, reason: collision with root package name */
        public final Context f985a;

        public b(Context context) {
            this.f985a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.g.h
        public final void a(g.i iVar) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new androidx.emoji2.text.a("EmojiCompatInitializer"));
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            threadPoolExecutor.execute(new h(this, iVar, threadPoolExecutor, 0));
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class c implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            try {
                int i6 = q0.j.f14103a;
                Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                if (g.f991k != null) {
                    g.a().c();
                }
                Trace.endSection();
            } catch (Throwable th) {
                int i7 = q0.j.f14103a;
                Trace.endSection();
                throw th;
            }
        }
    }

    @Override // b2.b
    public final List<Class<? extends b2.b<?>>> a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // b2.b
    public final Boolean b(Context context) {
        Object objB;
        a aVar = new a(new b(context));
        aVar.f1004b = 1;
        if (g.f991k == null) {
            synchronized (g.f990j) {
                try {
                    if (g.f991k == null) {
                        g.f991k = new g(aVar);
                    }
                } finally {
                }
            }
        }
        b2.a aVarC = b2.a.c(context);
        aVarC.getClass();
        synchronized (b2.a.f1984e) {
            try {
                objB = aVarC.f1985a.get(ProcessLifecycleInitializer.class);
                if (objB == null) {
                    objB = aVarC.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        final androidx.lifecycle.h lifecycle = ((androidx.lifecycle.m) objB).getLifecycle();
        lifecycle.a(new androidx.lifecycle.c(this) { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.c
            public final void onResume(androidx.lifecycle.m mVar) {
                (Build.VERSION.SDK_INT >= 28 ? androidx.emoji2.text.c.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new c(), 500L);
                lifecycle.c(this);
            }
        });
        return Boolean.TRUE;
    }
}
