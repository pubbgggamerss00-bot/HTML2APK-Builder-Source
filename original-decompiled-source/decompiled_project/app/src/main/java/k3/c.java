package k3;

import h1.y;
import i8.n;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import qc.m;

/* loaded from: classes.dex */
public abstract class c<V> implements m<V> {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f15942d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f15943e = Logger.getLogger(c.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final a f15944f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f15945g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f15946a;

    /* renamed from: b, reason: collision with root package name */
    public volatile d f15947b;

    /* renamed from: c, reason: collision with root package name */
    public volatile h f15948c;

    public static abstract class a {
        public abstract boolean a(c<?> cVar, d dVar, d dVar2);

        public abstract boolean b(c<?> cVar, Object obj, Object obj2);

        public abstract boolean c(c<?> cVar, h hVar, h hVar2);

        public abstract void d(h hVar, h hVar2);

        public abstract void e(h hVar, Thread thread);
    }

    public static final class b {

        /* renamed from: c, reason: collision with root package name */
        public static final b f15949c;

        /* renamed from: d, reason: collision with root package name */
        public static final b f15950d;

        /* renamed from: a, reason: collision with root package name */
        public final boolean f15951a;

        /* renamed from: b, reason: collision with root package name */
        public final Throwable f15952b;

        static {
            if (c.f15942d) {
                f15950d = null;
                f15949c = null;
            } else {
                f15950d = new b(false, null);
                f15949c = new b(true, null);
            }
        }

        public b(boolean z10, Throwable th2) {
            this.f15951a = z10;
            this.f15952b = th2;
        }
    }

    /* renamed from: k3.c$c, reason: collision with other inner class name */
    public static final class C0160c {

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f15953a;

        /* renamed from: k3.c$c$a */
        public class a extends Throwable {
            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        static {
            new C0160c(new a("Failure occurred while trying to finish a future."));
        }

        public C0160c(Throwable th2) {
            boolean z10 = c.f15942d;
            th2.getClass();
            this.f15953a = th2;
        }
    }

    public static final class d {

        /* renamed from: d, reason: collision with root package name */
        public static final d f15954d = new d(null, null);

        /* renamed from: a, reason: collision with root package name */
        public final Runnable f15955a;

        /* renamed from: b, reason: collision with root package name */
        public final Executor f15956b;

        /* renamed from: c, reason: collision with root package name */
        public d f15957c;

        public d(Runnable runnable, Executor executor) {
            this.f15955a = runnable;
            this.f15956b = executor;
        }
    }

    public static final class e extends a {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<h, Thread> f15958a;

        /* renamed from: b, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<h, h> f15959b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<c, h> f15960c;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<c, d> f15961d;

        /* renamed from: e, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<c, Object> f15962e;

        public e(AtomicReferenceFieldUpdater<h, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<h, h> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<c, h> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<c, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<c, Object> atomicReferenceFieldUpdater5) {
            this.f15958a = atomicReferenceFieldUpdater;
            this.f15959b = atomicReferenceFieldUpdater2;
            this.f15960c = atomicReferenceFieldUpdater3;
            this.f15961d = atomicReferenceFieldUpdater4;
            this.f15962e = atomicReferenceFieldUpdater5;
        }

        @Override // k3.c.a
        public final boolean a(c<?> cVar, d dVar, d dVar2) {
            AtomicReferenceFieldUpdater<c, d> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f15961d;
                if (atomicReferenceFieldUpdater.compareAndSet(cVar, dVar, dVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(cVar) == dVar);
            return false;
        }

        @Override // k3.c.a
        public final boolean b(c<?> cVar, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<c, Object> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f15962e;
                if (atomicReferenceFieldUpdater.compareAndSet(cVar, obj, obj2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(cVar) == obj);
            return false;
        }

        @Override // k3.c.a
        public final boolean c(c<?> cVar, h hVar, h hVar2) {
            AtomicReferenceFieldUpdater<c, h> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f15960c;
                if (atomicReferenceFieldUpdater.compareAndSet(cVar, hVar, hVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(cVar) == hVar);
            return false;
        }

        @Override // k3.c.a
        public final void d(h hVar, h hVar2) {
            this.f15959b.lazySet(hVar, hVar2);
        }

        @Override // k3.c.a
        public final void e(h hVar, Thread thread) {
            this.f15958a.lazySet(hVar, thread);
        }
    }

    public static final class f<V> implements Runnable {
    }

    public static final class g extends a {
        @Override // k3.c.a
        public final boolean a(c<?> cVar, d dVar, d dVar2) {
            synchronized (cVar) {
                try {
                    if (cVar.f15947b != dVar) {
                        return false;
                    }
                    cVar.f15947b = dVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // k3.c.a
        public final boolean b(c<?> cVar, Object obj, Object obj2) {
            synchronized (cVar) {
                try {
                    if (cVar.f15946a != obj) {
                        return false;
                    }
                    cVar.f15946a = obj2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // k3.c.a
        public final boolean c(c<?> cVar, h hVar, h hVar2) {
            synchronized (cVar) {
                try {
                    if (cVar.f15948c != hVar) {
                        return false;
                    }
                    cVar.f15948c = hVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // k3.c.a
        public final void d(h hVar, h hVar2) {
            hVar.f15965b = hVar2;
        }

        @Override // k3.c.a
        public final void e(h hVar, Thread thread) {
            hVar.f15964a = thread;
        }
    }

    public static final class h {

        /* renamed from: c, reason: collision with root package name */
        public static final h f15963c = new h();

        /* renamed from: a, reason: collision with root package name */
        public volatile Thread f15964a;

        /* renamed from: b, reason: collision with root package name */
        public volatile h f15965b;

        public h() {
            c.f15944f.e(this, Thread.currentThread());
        }
    }

    static {
        a gVar;
        try {
            gVar = new e(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(c.class, h.class, "c"), AtomicReferenceFieldUpdater.newUpdater(c.class, d.class, "b"), AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "a"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            gVar = new g();
        }
        f15944f = gVar;
        if (th != null) {
            f15943e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f15945g = new Object();
    }

    public static void d(c<?> cVar) {
        h hVar;
        d dVar;
        do {
            hVar = cVar.f15948c;
        } while (!f15944f.c(cVar, hVar, h.f15963c));
        while (hVar != null) {
            Thread thread = hVar.f15964a;
            if (thread != null) {
                hVar.f15964a = null;
                LockSupport.unpark(thread);
            }
            hVar = hVar.f15965b;
        }
        cVar.c();
        do {
            dVar = cVar.f15947b;
        } while (!f15944f.a(cVar, dVar, d.f15954d));
        d dVar2 = null;
        while (dVar != null) {
            d dVar3 = dVar.f15957c;
            dVar.f15957c = dVar2;
            dVar2 = dVar;
            dVar = dVar3;
        }
        while (dVar2 != null) {
            d dVar4 = dVar2.f15957c;
            Runnable runnable = dVar2.f15955a;
            if (runnable instanceof f) {
                throw null;
            }
            e(runnable, dVar2.f15956b);
            dVar2 = dVar4;
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f15943e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    public static Object f(Object obj) throws ExecutionException {
        if (obj instanceof b) {
            Throwable th2 = ((b) obj).f15952b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (obj instanceof C0160c) {
            throw new ExecutionException(((C0160c) obj).f15953a);
        }
        if (obj == f15945g) {
            return null;
        }
        return obj;
    }

    public static <V> V g(Future<V> future) throws ExecutionException {
        V v10;
        boolean z10 = false;
        while (true) {
            try {
                v10 = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return v10;
    }

    @Override // qc.m
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        d dVar = this.f15947b;
        d dVar2 = d.f15954d;
        if (dVar != dVar2) {
            d dVar3 = new d(runnable, executor);
            do {
                dVar3.f15957c = dVar;
                if (f15944f.a(this, dVar, dVar3)) {
                    return;
                } else {
                    dVar = this.f15947b;
                }
            } while (dVar != dVar2);
        }
        e(runnable, executor);
    }

    public final void b(StringBuilder sb) {
        try {
            Object objG = g(this);
            sb.append("SUCCESS, result=[");
            sb.append(objG == this ? "this future" : String.valueOf(objG));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e10) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e10.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e11) {
            sb.append("FAILURE, cause=[");
            sb.append(e11.getCause());
            sb.append("]");
        }
    }

    public void c() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        Object obj = this.f15946a;
        if ((obj == null) | (obj instanceof f)) {
            b bVar = f15942d ? new b(z10, new CancellationException("Future.cancel() was called.")) : z10 ? b.f15949c : b.f15950d;
            while (!f15944f.b(this, obj, bVar)) {
                obj = this.f15946a;
                if (!(obj instanceof f)) {
                }
            }
            d(this);
            if (obj instanceof f) {
                throw null;
            }
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final V get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        boolean z10;
        h hVar = h.f15963c;
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f15946a;
        if ((obj != null) && (!(obj instanceof f))) {
            return (V) f(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            h hVar2 = this.f15948c;
            if (hVar2 != hVar) {
                h hVar3 = new h();
                z10 = true;
                do {
                    a aVar = f15944f;
                    aVar.d(hVar3, hVar2);
                    if (aVar.c(this, hVar2, hVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                i(hVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f15946a;
                            if ((obj2 != null) && (!(obj2 instanceof f))) {
                                return (V) f(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        i(hVar3);
                    } else {
                        hVar2 = this.f15948c;
                    }
                } while (hVar2 != hVar);
            }
            return (V) f(this.f15946a);
        }
        z10 = true;
        while (nanos > 0) {
            Object obj3 = this.f15946a;
            if ((obj3 != null ? z10 : false) && (!(obj3 instanceof f))) {
                return (V) f(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        StringBuilder sbA = y.a("Waited ", " ", j10);
        sbA.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbA.toString();
        if (nanos + 1000 < 0) {
            String strA = k3.a.a(string3, " (plus ");
            long j11 = -nanos;
            long jConvert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
            long nanos2 = j11 - timeUnit.toNanos(jConvert);
            boolean z11 = (jConvert == 0 || nanos2 > 1000) ? z10 : false;
            if (jConvert > 0) {
                String strA2 = strA + jConvert + " " + lowerCase;
                if (z11) {
                    strA2 = k3.a.a(strA2, ",");
                }
                strA = k3.a.a(strA2, " ");
            }
            if (z11) {
                strA = strA + nanos2 + " nanoseconds ";
            }
            string3 = k3.a.a(strA, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(k3.a.a(string3, " but future completed as timeout expired"));
        }
        throw new TimeoutException(k3.b.a(string3, " for ", string));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String h() {
        if (this.f15946a instanceof f) {
            return n.d("setFuture=[", "null", "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void i(h hVar) {
        hVar.f15964a = null;
        while (true) {
            h hVar2 = this.f15948c;
            if (hVar2 == h.f15963c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.f15965b;
                if (hVar2.f15964a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.f15965b = hVar4;
                    if (hVar3.f15964a == null) {
                        break;
                    }
                } else if (!f15944f.c(this, hVar2, hVar4)) {
                    break;
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f15946a instanceof b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof f)) & (this.f15946a != null);
    }

    public boolean j(V v10) {
        if (v10 == null) {
            v10 = (V) f15945g;
        }
        if (!f15944f.b(this, null, v10)) {
            return false;
        }
        d(this);
        return true;
    }

    public boolean k(Throwable th2) {
        if (!f15944f.b(this, null, new C0160c(th2))) {
            return false;
        }
        d(this);
        return true;
    }

    public final String toString() {
        String strH;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f15946a instanceof b) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            try {
                strH = h();
            } catch (RuntimeException e10) {
                strH = "Exception thrown from implementation: " + e10.getClass();
            }
            if (strH != null && !strH.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strH);
                sb.append("]");
            } else if (isDone()) {
                b(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final V get() throws ExecutionException, InterruptedException {
        Object obj;
        h hVar = h.f15963c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f15946a;
            if ((obj2 != null) & (!(obj2 instanceof f))) {
                return (V) f(obj2);
            }
            h hVar2 = this.f15948c;
            if (hVar2 != hVar) {
                h hVar3 = new h();
                do {
                    a aVar = f15944f;
                    aVar.d(hVar3, hVar2);
                    if (aVar.c(this, hVar2, hVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f15946a;
                            } else {
                                i(hVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return (V) f(obj);
                    }
                    hVar2 = this.f15948c;
                } while (hVar2 != hVar);
            }
            return (V) f(this.f15946a);
        }
        throw new InterruptedException();
    }
}
