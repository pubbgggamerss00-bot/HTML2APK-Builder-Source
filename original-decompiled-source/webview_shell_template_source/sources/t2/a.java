package t2;

import androidx.activity.m;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
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
    public static final boolean f14405v = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: w, reason: collision with root package name */
    public static final Logger f14406w = Logger.getLogger(a.class.getName());

    /* renamed from: x, reason: collision with root package name */
    public static final AbstractC0091a f14407x;

    /* renamed from: y, reason: collision with root package name */
    public static final Object f14408y;
    public volatile Object s;

    /* renamed from: t, reason: collision with root package name */
    public volatile d f14409t;

    /* renamed from: u, reason: collision with root package name */
    public volatile h f14410u;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: t2.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0091a {
        public abstract boolean a(a<?> aVar, d dVar, d dVar2);

        public abstract boolean b(a<?> aVar, Object obj, Object obj2);

        public abstract boolean c(a<?> aVar, h hVar, h hVar2);

        public abstract void d(h hVar, h hVar2);

        public abstract void e(h hVar, Thread thread);
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class b {

        /* renamed from: c, reason: collision with root package name */
        public static final b f14411c;

        /* renamed from: d, reason: collision with root package name */
        public static final b f14412d;

        /* renamed from: a, reason: collision with root package name */
        public final boolean f14413a;

        /* renamed from: b, reason: collision with root package name */
        public final Throwable f14414b;

        static {
            if (a.f14405v) {
                f14412d = null;
                f14411c = null;
            } else {
                f14412d = new b(null, false);
                f14411c = new b(null, true);
            }
        }

        public b(Throwable th, boolean z6) {
            this.f14413a = z6;
            this.f14414b = th;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f14415b = new c(new C0092a("Failure occurred while trying to finish a future."));

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f14416a;

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        /* renamed from: t2.a$c$a, reason: collision with other inner class name */
        public class C0092a extends Throwable {
            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public c(Throwable th) {
            boolean z6 = a.f14405v;
            th.getClass();
            this.f14416a = th;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class d {

        /* renamed from: d, reason: collision with root package name */
        public static final d f14417d = new d(null, null);

        /* renamed from: a, reason: collision with root package name */
        public final Runnable f14418a;

        /* renamed from: b, reason: collision with root package name */
        public final Executor f14419b;

        /* renamed from: c, reason: collision with root package name */
        public d f14420c;

        public d(Runnable runnable, Executor executor) {
            this.f14418a = runnable;
            this.f14419b = executor;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class e extends AbstractC0091a {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<h, Thread> f14421a;

        /* renamed from: b, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<h, h> f14422b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, h> f14423c;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, d> f14424d;

        /* renamed from: e, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, Object> f14425e;

        public e(AtomicReferenceFieldUpdater<h, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<h, h> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, h> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            this.f14421a = atomicReferenceFieldUpdater;
            this.f14422b = atomicReferenceFieldUpdater2;
            this.f14423c = atomicReferenceFieldUpdater3;
            this.f14424d = atomicReferenceFieldUpdater4;
            this.f14425e = atomicReferenceFieldUpdater5;
        }

        @Override // t2.a.AbstractC0091a
        public final boolean a(a<?> aVar, d dVar, d dVar2) {
            AtomicReferenceFieldUpdater<a, d> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f14424d;
                if (atomicReferenceFieldUpdater.compareAndSet(aVar, dVar, dVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(aVar) == dVar);
            return false;
        }

        @Override // t2.a.AbstractC0091a
        public final boolean b(a<?> aVar, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f14425e;
                if (atomicReferenceFieldUpdater.compareAndSet(aVar, obj, obj2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(aVar) == obj);
            return false;
        }

        @Override // t2.a.AbstractC0091a
        public final boolean c(a<?> aVar, h hVar, h hVar2) {
            AtomicReferenceFieldUpdater<a, h> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f14423c;
                if (atomicReferenceFieldUpdater.compareAndSet(aVar, hVar, hVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(aVar) == hVar);
            return false;
        }

        @Override // t2.a.AbstractC0091a
        public final void d(h hVar, h hVar2) {
            this.f14422b.lazySet(hVar, hVar2);
        }

        @Override // t2.a.AbstractC0091a
        public final void e(h hVar, Thread thread) {
            this.f14421a.lazySet(hVar, thread);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class f<V> implements Runnable {
        public final t2.c s;

        /* renamed from: t, reason: collision with root package name */
        public final c5.a<? extends V> f14426t;

        public f(t2.c cVar, c5.a aVar) {
            this.s = cVar;
            this.f14426t = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.s.s != this) {
                return;
            }
            if (a.f14407x.b(this.s, this, a.e(this.f14426t))) {
                a.b(this.s);
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class g extends AbstractC0091a {
        @Override // t2.a.AbstractC0091a
        public final boolean a(a<?> aVar, d dVar, d dVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f14409t != dVar) {
                        return false;
                    }
                    aVar.f14409t = dVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // t2.a.AbstractC0091a
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

        @Override // t2.a.AbstractC0091a
        public final boolean c(a<?> aVar, h hVar, h hVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f14410u != hVar) {
                        return false;
                    }
                    aVar.f14410u = hVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // t2.a.AbstractC0091a
        public final void d(h hVar, h hVar2) {
            hVar.f14429b = hVar2;
        }

        @Override // t2.a.AbstractC0091a
        public final void e(h hVar, Thread thread) {
            hVar.f14428a = thread;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class h {

        /* renamed from: c, reason: collision with root package name */
        public static final h f14427c = new h();

        /* renamed from: a, reason: collision with root package name */
        public volatile Thread f14428a;

        /* renamed from: b, reason: collision with root package name */
        public volatile h f14429b;

        public h() {
            a.f14407x.e(this, Thread.currentThread());
        }
    }

    static {
        AbstractC0091a gVar;
        try {
            gVar = new e(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, h.class, "u"), AtomicReferenceFieldUpdater.newUpdater(a.class, d.class, "t"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "s"));
            th = null;
        } catch (Throwable th) {
            th = th;
            gVar = new g();
        }
        f14407x = gVar;
        if (th != null) {
            f14406w.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f14408y = new Object();
    }

    public static void b(a<?> aVar) {
        d dVar;
        d dVar2;
        d dVar3 = null;
        while (true) {
            h hVar = aVar.f14410u;
            if (f14407x.c(aVar, hVar, h.f14427c)) {
                while (hVar != null) {
                    Thread thread = hVar.f14428a;
                    if (thread != null) {
                        hVar.f14428a = null;
                        LockSupport.unpark(thread);
                    }
                    hVar = hVar.f14429b;
                }
                do {
                    dVar = aVar.f14409t;
                } while (!f14407x.a(aVar, dVar, d.f14417d));
                while (true) {
                    dVar2 = dVar3;
                    dVar3 = dVar;
                    if (dVar3 == null) {
                        break;
                    }
                    dVar = dVar3.f14420c;
                    dVar3.f14420c = dVar2;
                }
                while (dVar2 != null) {
                    dVar3 = dVar2.f14420c;
                    Runnable runnable = dVar2.f14418a;
                    if (runnable instanceof f) {
                        f fVar = (f) runnable;
                        aVar = fVar.s;
                        if (aVar.s == fVar) {
                            if (f14407x.b(aVar, fVar, e(fVar.f14426t))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        c(runnable, dVar2.f14419b);
                    }
                    dVar2 = dVar3;
                }
                return;
            }
        }
    }

    public static void c(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e6) {
            f14406w.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e6);
        }
    }

    public static Object d(Object obj) throws ExecutionException {
        if (obj instanceof b) {
            Throwable th = ((b) obj).f14414b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof c) {
            throw new ExecutionException(((c) obj).f14416a);
        }
        if (obj == f14408y) {
            return null;
        }
        return obj;
    }

    public static Object e(c5.a<?> aVar) {
        Object obj;
        if (aVar instanceof a) {
            Object obj2 = ((a) aVar).s;
            if (!(obj2 instanceof b)) {
                return obj2;
            }
            b bVar = (b) obj2;
            return bVar.f14413a ? bVar.f14414b != null ? new b(bVar.f14414b, false) : b.f14412d : obj2;
        }
        boolean zIsCancelled = aVar.isCancelled();
        boolean z6 = true;
        if ((!f14405v) && zIsCancelled) {
            return b.f14412d;
        }
        boolean z7 = false;
        while (true) {
            try {
                try {
                    obj = aVar.get();
                    break;
                } catch (InterruptedException unused) {
                    z7 = z6;
                } catch (Throwable th) {
                    if (z7) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException e6) {
                if (zIsCancelled) {
                    return new b(e6, false);
                }
                return new c(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + aVar, e6));
            } catch (ExecutionException e7) {
                return new c(e7.getCause());
            } catch (Throwable th2) {
                return new c(th2);
            }
        }
        if (z7) {
            Thread.currentThread().interrupt();
        }
        return obj == null ? f14408y : obj;
    }

    public final void a(StringBuilder sb) {
        V v2;
        boolean z6 = false;
        while (true) {
            try {
                try {
                    v2 = get();
                    break;
                } catch (InterruptedException unused) {
                    z6 = true;
                } catch (Throwable th) {
                    if (z6) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (RuntimeException e6) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e6.getClass());
                sb.append(" thrown from get()]");
                return;
            } catch (ExecutionException e7) {
                sb.append("FAILURE, cause=[");
                sb.append(e7.getCause());
                sb.append("]");
                return;
            }
        }
        if (z6) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        sb.append(v2 == this ? "this future" : String.valueOf(v2));
        sb.append("]");
    }

    @Override // c5.a
    public final void addListener(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        d dVar = this.f14409t;
        d dVar2 = d.f14417d;
        if (dVar != dVar2) {
            d dVar3 = new d(runnable, executor);
            do {
                dVar3.f14420c = dVar;
                if (f14407x.a(this, dVar, dVar3)) {
                    return;
                } else {
                    dVar = this.f14409t;
                }
            } while (dVar != dVar2);
        }
        c(runnable, executor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0053, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean cancel(boolean z6) {
        Object obj = this.s;
        if (!(obj == null) && !(obj instanceof f)) {
            return false;
        }
        b bVar = f14405v ? new b(new CancellationException("Future.cancel() was called."), z6) : z6 ? b.f14411c : b.f14412d;
        a<V> aVar = this;
        boolean z7 = false;
        while (true) {
            if (f14407x.b(aVar, obj, bVar)) {
                b(aVar);
                if (!(obj instanceof f)) {
                    break;
                }
                c5.a<? extends V> aVar2 = ((f) obj).f14426t;
                if (!(aVar2 instanceof a)) {
                    aVar2.cancel(z6);
                    break;
                }
                aVar = (a) aVar2;
                obj = aVar.s;
                if (!(obj == null) && !(obj instanceof f)) {
                    break;
                }
                z7 = true;
            } else {
                obj = aVar.s;
                if (!(obj instanceof f)) {
                    return z7;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String f() {
        Object obj = this.s;
        if (obj instanceof f) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            c5.a<? extends V> aVar = ((f) obj).f14426t;
            return m.e(sb, aVar == this ? "this future" : String.valueOf(aVar), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void g(h hVar) {
        hVar.f14428a = null;
        while (true) {
            h hVar2 = this.f14410u;
            if (hVar2 == h.f14427c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.f14429b;
                if (hVar2.f14428a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.f14429b = hVar4;
                    if (hVar3.f14428a == null) {
                        break;
                    }
                } else if (!f14407x.c(this, hVar2, hVar4)) {
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
        h hVar = h.f14427c;
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
            h hVar2 = this.f14410u;
            if (hVar2 != hVar) {
                h hVar3 = new h();
                z6 = true;
                do {
                    AbstractC0091a abstractC0091a = f14407x;
                    abstractC0091a.d(hVar3, hVar2);
                    if (abstractC0091a.c(this, hVar2, hVar3)) {
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
                        hVar2 = this.f14410u;
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
        h hVar = h.f14427c;
        if (!Thread.interrupted()) {
            Object obj2 = this.s;
            if ((obj2 != null) & (!(obj2 instanceof f))) {
                return (V) d(obj2);
            }
            h hVar2 = this.f14410u;
            if (hVar2 != hVar) {
                h hVar3 = new h();
                do {
                    AbstractC0091a abstractC0091a = f14407x;
                    abstractC0091a.d(hVar3, hVar2);
                    if (abstractC0091a.c(this, hVar2, hVar3)) {
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
                    hVar2 = this.f14410u;
                } while (hVar2 != hVar);
            }
            return (V) d(this.s);
        }
        throw new InterruptedException();
    }
}
