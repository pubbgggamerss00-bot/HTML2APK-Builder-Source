package n5;

import android.os.AsyncTask;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.api.h;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import ka.f;
import m5.a;
import n5.c;

/* loaded from: classes.dex */
public abstract class a<D> extends b<D> {

    /* renamed from: f, reason: collision with root package name */
    public Executor f18337f;

    /* renamed from: g, reason: collision with root package name */
    public volatile a<D>.RunnableC0183a f18338g;

    /* renamed from: h, reason: collision with root package name */
    public volatile a<D>.RunnableC0183a f18339h;

    /* renamed from: n5.a$a, reason: collision with other inner class name */
    public final class RunnableC0183a extends c<D> implements Runnable {
        public RunnableC0183a() {
        }

        @Override // n5.c
        public final void a() throws InterruptedException {
            a aVar = a.this;
            aVar.getClass();
            f fVar = (f) aVar;
            Iterator it = fVar.f16236j.iterator();
            if (it.hasNext()) {
                ((h) it.next()).getClass();
                throw new UnsupportedOperationException();
            }
            try {
                fVar.f16235i.tryAcquire(0, 5L, TimeUnit.SECONDS);
            } catch (InterruptedException e10) {
                Log.i("GACSignInLoader", "Unexpected InterruptedException", e10);
                Thread.currentThread().interrupt();
            }
        }

        @Override // n5.c
        public final void b(D d10) {
            a aVar = a.this;
            if (aVar.f18339h == this) {
                SystemClock.uptimeMillis();
                aVar.f18339h = null;
                aVar.c();
            }
        }

        @Override // n5.c
        public final void c(D d10) {
            a aVar = a.this;
            if (aVar.f18338g != this) {
                if (aVar.f18339h == this) {
                    SystemClock.uptimeMillis();
                    aVar.f18339h = null;
                    aVar.c();
                    return;
                }
                return;
            }
            if (aVar.f18343c) {
                return;
            }
            SystemClock.uptimeMillis();
            aVar.f18338g = null;
            a.C0174a c0174a = aVar.f18341a;
            if (c0174a != null) {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    c0174a.h(d10);
                } else {
                    c0174a.i(d10);
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            a.this.c();
        }
    }

    public final void c() {
        if (this.f18339h != null || this.f18338g == null) {
            return;
        }
        this.f18338g.getClass();
        if (this.f18337f == null) {
            this.f18337f = AsyncTask.THREAD_POOL_EXECUTOR;
        }
        a<D>.RunnableC0183a runnableC0183a = this.f18338g;
        Executor executor = this.f18337f;
        if (runnableC0183a.f18348b == c.d.f18355a) {
            runnableC0183a.f18348b = c.d.f18356b;
            executor.execute(runnableC0183a.f18347a);
            return;
        }
        int iOrdinal = runnableC0183a.f18348b.ordinal();
        if (iOrdinal == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (iOrdinal == 2) {
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new IllegalStateException("We should never reach this state");
    }
}
