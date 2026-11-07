package s2;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.ListenableWorker;
import com.google.android.gms.internal.ads.sf0;
import java.util.UUID;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class o implements Runnable {

    /* renamed from: y, reason: collision with root package name */
    public static final String f14374y = androidx.work.k.e("WorkForegroundRunnable");
    public final t2.c<Void> s = new t2.c<>();

    /* renamed from: t, reason: collision with root package name */
    public final Context f14375t;

    /* renamed from: u, reason: collision with root package name */
    public final r2.l f14376u;

    /* renamed from: v, reason: collision with root package name */
    public final ListenableWorker f14377v;

    /* renamed from: w, reason: collision with root package name */
    public final p f14378w;

    /* renamed from: x, reason: collision with root package name */
    public final u2.a f14379x;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a implements Runnable {
        public final /* synthetic */ t2.c s;

        public a(t2.c cVar) {
            this.s = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.s.j(o.this.f14377v.getForegroundInfoAsync());
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class b implements Runnable {
        public final /* synthetic */ t2.c s;

        public b(t2.c cVar) {
            this.s = cVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            o oVar = o.this;
            t2.c<Void> cVar = oVar.s;
            ListenableWorker listenableWorker = oVar.f14377v;
            r2.l lVar = oVar.f14376u;
            try {
                androidx.work.h hVar = (androidx.work.h) this.s.get();
                if (hVar == null) {
                    throw new IllegalStateException("Worker was marked important (" + lVar.f14282c + ") but did not provide ForegroundInfo");
                }
                androidx.work.k.c().a(o.f14374y, "Updating notification for " + lVar.f14282c, new Throwable[0]);
                listenableWorker.setRunInForeground(true);
                p pVar = oVar.f14378w;
                Context context = oVar.f14375t;
                UUID id = listenableWorker.getId();
                pVar.getClass();
                t2.c cVar2 = new t2.c();
                ((u2.b) pVar.f14382a).a(new sf0(pVar, cVar2, id, hVar, context));
                cVar.j(cVar2);
            } catch (Throwable th) {
                cVar.i(th);
            }
        }
    }

    @SuppressLint({"LambdaLast"})
    public o(Context context, r2.l lVar, ListenableWorker listenableWorker, p pVar, u2.b bVar) {
        this.f14375t = context;
        this.f14376u = lVar;
        this.f14377v = listenableWorker;
        this.f14378w = pVar;
        this.f14379x = bVar;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"UnsafeExperimentalUsageError"})
    public final void run() {
        if (!this.f14376u.f14295q || q0.a.a()) {
            this.s.h(null);
            return;
        }
        t2.c cVar = new t2.c();
        u2.b bVar = (u2.b) this.f14379x;
        bVar.f14595c.execute(new a(cVar));
        cVar.addListener(new b(cVar), bVar.f14595c);
    }
}
