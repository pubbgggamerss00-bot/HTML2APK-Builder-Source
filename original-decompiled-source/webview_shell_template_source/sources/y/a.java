package y;

import androidx.activity.m;
import androidx.camera.camera2.internal.v0;
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

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class a<V> implements c5.a<V> {

    /* renamed from: v, reason: collision with root package name */
    public static final boolean f15168v = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: w, reason: collision with root package name */
    public static final Logger f15169w = Logger.getLogger(a.class.getName());

    /* renamed from: x, reason: collision with root package name */
    public static final AbstractC0104a f15170x;

    /* renamed from: y, reason: collision with root package name */
    public static final Object f15171y;
    public volatile Object s;

    /* renamed from: t, reason: collision with root package name */
    public volatile d f15172t;

    /* renamed from: u, reason: collision with root package name */
    public volatile h f15173u;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: y.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0104a {
        public abstract boolean a(a<?> aVar, d dVar, d dVar2);

        public abstract boolean b(a<?> aVar, Object obj, Object obj2);

        public abstract boolean c(a<?> aVar, h hVar, h hVar2);

        public abstract void d(h hVar, h hVar2);

        public abstract void e(h hVar, Thread thread);
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final b f15174b;

        /* renamed from: c, reason: collision with root package name */
        public static final b f15175c;

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f15176a;

        static {
            if (a.f15168v) {
                f15175c = null;
                f15174b = null;
            } else {
                f15175c = new b(null, false);
                f15174b = new b(null, true);
            }
        }

        public b(Throwable th, boolean z6) {
            this.f15176a = th;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f15177a;

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        /* renamed from: y.a$c$a, reason: collision with other inner class name */
        public class C0105a extends Throwable {
            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        static {
            new c(new C0105a("Failure occurred while trying to finish a future."));
        }

        public c(Throwable th) {
            boolean z6 = a.f15168v;
            th.getClass();
            this.f15177a = th;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class d {

        /* renamed from: d, reason: collision with root package name */
        public static final d f15178d = new d(null, null);

        /* renamed from: a, reason: collision with root package name */
        public final Runnable f15179a;

        /* renamed from: b, reason: collision with root package name */
        public final Executor f15180b;

        /* renamed from: c, reason: collision with root package name */
        public d f15181c;

        public d(Runnable runnable, Executor executor) {
            this.f15179a = runnable;
            this.f15180b = executor;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class e extends AbstractC0104a {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<h, Thread> f15182a;

        /* renamed from: b, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<h, h> f15183b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, h> f15184c;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, d> f15185d;

        /* renamed from: e, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, Object> f15186e;

        public e(AtomicReferenceFieldUpdater<h, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<h, h> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, h> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            this.f15182a = atomicReferenceFieldUpdater;
            this.f15183b = atomicReferenceFieldUpdater2;
            this.f15184c = atomicReferenceFieldUpdater3;
            this.f15185d = atomicReferenceFieldUpdater4;
            this.f15186e = atomicReferenceFieldUpdater5;
        }

        @Override // y.a.AbstractC0104a
        public final boolean a(a<?> aVar, d dVar, d dVar2) {
            AtomicReferenceFieldUpdater<a, d> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f15185d;
                if (atomicReferenceFieldUpdater.compareAndSet(aVar, dVar, dVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(aVar) == dVar);
            return false;
        }

        @Override // y.a.AbstractC0104a
        public final boolean b(a<?> aVar, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f15186e;
                if (atomicReferenceFieldUpdater.compareAndSet(aVar, obj, obj2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(aVar) == obj);
            return false;
        }

        @Override // y.a.AbstractC0104a
        public final boolean c(a<?> aVar, h hVar, h hVar2) {
            AtomicReferenceFieldUpdater<a, h> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f15184c;
                if (atomicReferenceFieldUpdater.compareAndSet(aVar, hVar, hVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(aVar) == hVar);
            return false;
        }

        @Override // y.a.AbstractC0104a
        public final void d(h hVar, h hVar2) {
            this.f15183b.lazySet(hVar, hVar2);
        }

        @Override // y.a.AbstractC0104a
        public final void e(h hVar, Thread thread) {
            this.f15182a.lazySet(hVar, thread);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class f<V> implements Runnable {
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class g extends AbstractC0104a {
        @Override // y.a.AbstractC0104a
        public final boolean a(a<?> aVar, d dVar, d dVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f15172t != dVar) {
                        return false;
                    }
                    aVar.f15172t = dVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // y.a.AbstractC0104a
        public final boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                try {
                    if (aVar.s != obj) {
                        return false;
                    }
                    aVar.s = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // y.a.AbstractC0104a
        public final boolean c(a<?> aVar, h hVar, h hVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f15173u != hVar) {
                        return false;
                    }
                    aVar.f15173u = hVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // y.a.AbstractC0104a
        public final void d(h hVar, h hVar2) {
            hVar.f15189b = hVar2;
        }

        @Override // y.a.AbstractC0104a
        public final void e(h hVar, Thread thread) {
            hVar.f15188a = thread;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class h {

        /* renamed from: c, reason: collision with root package name */
        public static final h f15187c = new h();

        /* renamed from: a, reason: collision with root package name */
        public volatile Thread f15188a;

        /* renamed from: b, reason: collision with root package name */
        public volatile h f15189b;

        public h() {
            a.f15170x.e(this, Thread.currentThread());
        }
    }

    static {
        AbstractC0104a gVar;
        try {
            gVar = new e(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, h.class, "u"), AtomicReferenceFieldUpdater.newUpdater(a.class, d.class, "t"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "s"));
            th = null;
        } catch (Throwable th) {
            th = th;
            gVar = new g();
        }
        f15170x = gVar;
        if (th != null) {
            f15169w.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f15171y = new Object();
    }

    public static void b(a<?> aVar) {
        h hVar;
        d dVar;
        do {
            hVar = aVar.f15173u;
        } while (!f15170x.c(aVar, hVar, h.f15187c));
        while (hVar != null) {
            Thread thread = hVar.f15188a;
            if (thread != null) {
                hVar.f15188a = null;
                LockSupport.unpark(thread);
            }
            hVar = hVar.f15189b;
        }
        do {
            dVar = aVar.f15172t;
        } while (!f15170x.a(aVar, dVar, d.f15178d));
        d dVar2 = null;
        while (dVar != null) {
            d dVar3 = dVar.f15181c;
            dVar.f15181c = dVar2;
            dVar2 = dVar;
            dVar = dVar3;
        }
        while (dVar2 != null) {
            d dVar4 = dVar2.f15181c;
            Runnable runnable = dVar2.f15179a;
            if (runnable instanceof f) {
                throw null;
            }
            c(runnable, dVar2.f15180b);
            dVar2 = dVar4;
        }
    }

    public static void c(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e6) {
            f15169w.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e6);
        }
    }

    public static Object d(Object obj) throws ExecutionException {
        if (obj instanceof b) {
            Throwable th = ((b) obj).f15176a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof c) {
            throw new ExecutionException(((c) obj).f15177a);
        }
        if (obj == f15171y) {
            return null;
        }
        return obj;
    }

    public static <V> V e(Future<V> future) {
        V v2;
        boolean z6 = false;
        while (true) {
            try {
                v2 = future.get();
                break;
            } catch (InterruptedException unused) {
                z6 = true;
            } catch (Throwable th) {
                if (z6) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z6) {
            Thread.currentThread().interrupt();
        }
        return v2;
    }

    public final void a(StringBuilder sb) {
        try {
            Object objE = e(this);
            sb.append("SUCCESS, result=[");
            sb.append(objE == this ? "this future" : String.valueOf(objE));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e6) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e6.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e7) {
            sb.append("FAILURE, cause=[");
            sb.append(e7.getCause());
            sb.append("]");
        }
    }

    @Override // c5.a
    public final void addListener(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        d dVar = this.f15172t;
        d dVar2 = d.f15178d;
        if (dVar != dVar2) {
            d dVar3 = new d(runnable, executor);
            do {
                dVar3.f15181c = dVar;
                if (f15170x.a(this, dVar, dVar3)) {
                    return;
                } else {
                    dVar = this.f15172t;
                }
            } while (dVar != dVar2);
        }
        c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        Object obj = this.s;
        if ((obj == null) | (obj instanceof f)) {
            b bVar = f15168v ? new b(new CancellationException("Future.cancel() was called."), z6) : z6 ? b.f15174b : b.f15175c;
            while (!f15170x.b(this, obj, bVar)) {
                obj = this.s;
                if (!(obj instanceof f)) {
                }
            }
            b(this);
            if (obj instanceof f) {
                throw null;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String f() {
        if (this.s instanceof f) {
            return v0.b("setFuture=[", "null", "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void g(h hVar) {
        hVar.f15188a = null;
        while (true) {
            h hVar2 = this.f15173u;
            if (hVar2 == h.f15187c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.f15189b;
                if (hVar2.f15188a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.f15189b = hVar4;
                    if (hVar3.f15188a == null) {
                        break;
                    }
                } else if (!f15170x.c(this, hVar2, hVar4)) {
                    break;
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final V get(long j6, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        boolean z6;
        h hVar = h.f15187c;
        long nanos = timeUnit.toNanos(j6);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.s;
        if ((obj != null) && (!(obj instanceof f))) {
            return (V) d(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            h hVar2 = this.f15173u;
            if (hVar2 != hVar) {
                h hVar3 = new h();
                z6 = true;
                do {
                    AbstractC0104a abstractC0104a = f15170x;
                    abstractC0104a.d(hVar3, hVar2);
                    if (abstractC0104a.c(this, hVar2, hVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                g(hVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.s;
                            if ((obj2 != null) && (!(obj2 instanceof f))) {
                                return (V) d(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        g(hVar3);
                    } else {
                        hVar2 = this.f15173u;
                    }
                } while (hVar2 != hVar);
            }
            return (V) d(this.s);
        }
        z6 = true;
        while (nanos > 0) {
            Object obj3 = this.s;
            if ((obj3 != null ? z6 : false) && (!(obj3 instanceof f))) {
                return (V) d(obj3);
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
        String strB = "Waited " + j6 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String strB2 = androidx.camera.core.c.b(strB, " (plus ");
            long j7 = -nanos;
            long jConvert = timeUnit.convert(j7, TimeUnit.NANOSECONDS);
            long nanos2 = j7 - timeUnit.toNanos(jConvert);
            boolean z7 = (jConvert == 0 || nanos2 > 1000) ? z6 : false;
            if (jConvert > 0) {
                String strB3 = strB2 + jConvert + " " + lowerCase;
                if (z7) {
                    strB3 = androidx.camera.core.c.b(strB3, ",");
                }
                strB2 = androidx.camera.core.c.b(strB3, " ");
            }
            if (z7) {
                strB2 = strB2 + nanos2 + " nanoseconds ";
            }
            strB = androidx.camera.core.c.b(strB2, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(androidx.camera.core.c.b(strB, " but future completed as timeout expired"));
        }
        throw new TimeoutException(m.d(strB, " for ", string));
    }

    public boolean h(Throwable th) {
        th.getClass();
        if (!f15170x.b(this, null, new c(th))) {
            return false;
        }
        b(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.s instanceof b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof f)) & (this.s != null);
    }

    public final String toString() {
        String strF;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.s instanceof b) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                strF = f();
            } catch (RuntimeException e6) {
                strF = "Exception thrown from implementation: " + e6.getClass();
            }
            if (strF != null && !strF.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strF);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final V get() throws InterruptedException {
        Object obj;
        h hVar = h.f15187c;
        if (!Thread.interrupted()) {
            Object obj2 = this.s;
            if ((obj2 != null) & (!(obj2 instanceof f))) {
                return (V) d(obj2);
            }
            h hVar2 = this.f15173u;
            if (hVar2 != hVar) {
                h hVar3 = new h();
                do {
                    AbstractC0104a abstractC0104a = f15170x;
                    abstractC0104a.d(hVar3, hVar2);
                    if (abstractC0104a.c(this, hVar2, hVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.s;
                            } else {
                                g(hVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return (V) d(obj);
                    }
                    hVar2 = this.f15173u;
                } while (hVar2 != hVar);
            }
            return (V) d(this.s);
        }
        throw new InterruptedException();
    }
}
