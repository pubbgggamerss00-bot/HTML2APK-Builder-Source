package n5;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class c<Result> {

    /* renamed from: e, reason: collision with root package name */
    public static Handler f18346e;

    /* renamed from: b, reason: collision with root package name */
    public volatile d f18348b = d.f18355a;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f18349c = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f18350d = new AtomicBoolean();

    /* renamed from: a, reason: collision with root package name */
    public final b f18347a = new b(new a());

    public class a implements Callable<Result> {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        public final Result call() {
            c cVar = c.this;
            cVar.f18350d.set(true);
            try {
                Process.setThreadPriority(10);
                cVar.a();
                Binder.flushPendingCommands();
                return null;
            } finally {
            }
        }
    }

    public class b extends FutureTask<Result> {
        public b(a aVar) {
            super(aVar);
        }

        @Override // java.util.concurrent.FutureTask
        public final void done() {
            c cVar = c.this;
            AtomicBoolean atomicBoolean = cVar.f18350d;
            try {
                Result result = get();
                if (atomicBoolean.get()) {
                    return;
                }
                cVar.d(result);
            } catch (InterruptedException e10) {
                Log.w("AsyncTask", e10);
            } catch (CancellationException unused) {
                if (atomicBoolean.get()) {
                    return;
                }
                cVar.d(null);
            } catch (ExecutionException e11) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e11.getCause());
            } catch (Throwable th2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th2);
            }
        }
    }

    /* renamed from: n5.c$c, reason: collision with other inner class name */
    public class RunnableC0184c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f18353a;

        public RunnableC0184c(Object obj) {
            this.f18353a = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            c cVar = c.this;
            Object obj = this.f18353a;
            if (cVar.f18349c.get()) {
                cVar.b(obj);
            } else {
                cVar.c(obj);
            }
            cVar.f18348b = d.f18357c;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public static final d f18355a;

        /* renamed from: b, reason: collision with root package name */
        public static final d f18356b;

        /* renamed from: c, reason: collision with root package name */
        public static final d f18357c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ d[] f18358d;

        static {
            d dVar = new d("PENDING", 0);
            f18355a = dVar;
            d dVar2 = new d("RUNNING", 1);
            f18356b = dVar2;
            d dVar3 = new d("FINISHED", 2);
            f18357c = dVar3;
            f18358d = new d[]{dVar, dVar2, dVar3};
        }

        public d() {
            throw null;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f18358d.clone();
        }
    }

    public abstract void a();

    public void b(Result result) {
    }

    public void c(Result result) {
    }

    public final void d(Result result) {
        Handler handler;
        synchronized (c.class) {
            try {
                if (f18346e == null) {
                    f18346e = new Handler(Looper.getMainLooper());
                }
                handler = f18346e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        handler.post(new RunnableC0184c(result));
    }
}
