package androidx.emoji2.text;

import android.content.Context;
import android.os.Trace;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.d;
import androidx.emoji2.text.g;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.l;
import androidx.lifecycle.t;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import u3.i;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements l6.b<Boolean> {

    public static class a extends d.c {
    }

    public static class b implements d.h {

        /* renamed from: a, reason: collision with root package name */
        public final Context f2193a;

        public b(Context context) {
            this.f2193a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.d.h
        public final void a(final d.i iVar) {
            final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new x4.a("EmojiCompatInitializer"));
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            threadPoolExecutor.execute(new Runnable() { // from class: x4.d
                @Override // java.lang.Runnable
                public final void run() {
                    EmojiCompatInitializer.b bVar = this.f32058a;
                    d.i iVar2 = iVar;
                    ThreadPoolExecutor threadPoolExecutor2 = threadPoolExecutor;
                    try {
                        androidx.emoji2.text.g gVarA = androidx.emoji2.text.a.a(bVar.f2193a);
                        if (gVarA == null) {
                            throw new RuntimeException("EmojiCompat font provider not available on this device.");
                        }
                        g.b bVar2 = (g.b) gVarA.f2211a;
                        synchronized (bVar2.f2237d) {
                            bVar2.f2239f = threadPoolExecutor2;
                        }
                        gVarA.f2211a.a(new androidx.emoji2.text.e(iVar2, threadPoolExecutor2));
                    } catch (Throwable th2) {
                        iVar2.a(th2);
                        threadPoolExecutor2.shutdown();
                    }
                }
            });
        }
    }

    public static class c implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            try {
                int i10 = i.f29248a;
                Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                if (d.d()) {
                    d.a().e();
                }
                Trace.endSection();
            } catch (Throwable th2) {
                int i11 = i.f29248a;
                Trace.endSection();
                throw th2;
            }
        }
    }

    @Override // l6.b
    public final List<Class<? extends l6.b<?>>> a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // l6.b
    public final Boolean b(Context context) {
        Object objB;
        a aVar = new a(new b(context));
        aVar.f2212b = 1;
        if (d.f2198k == null) {
            synchronized (d.f2197j) {
                try {
                    if (d.f2198k == null) {
                        d.f2198k = new d(aVar);
                    }
                } finally {
                }
            }
        }
        l6.a aVarC = l6.a.c(context);
        aVarC.getClass();
        synchronized (l6.a.f16732e) {
            try {
                objB = aVarC.f16733a.get(ProcessLifecycleInitializer.class);
                if (objB == null) {
                    objB = aVarC.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        l lifecycle = ((t) objB).getLifecycle();
        lifecycle.a(new x4.c(this, lifecycle));
        return Boolean.TRUE;
    }
}
