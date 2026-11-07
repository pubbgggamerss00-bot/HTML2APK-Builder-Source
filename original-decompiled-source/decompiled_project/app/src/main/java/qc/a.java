package qc;

import h1.y;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
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
import lc.v;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public abstract class a<V> extends rc.a implements m<V> {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f22597d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f22598e = Logger.getLogger(a.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final AbstractC0250a f22599f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f22600g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f22601a;

    /* renamed from: b, reason: collision with root package name */
    public volatile d f22602b;

    /* renamed from: c, reason: collision with root package name */
    public volatile k f22603c;

    /* renamed from: qc.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0250a {
        public abstract boolean a(a<?> aVar, d dVar, d dVar2);

        public abstract boolean b(a<?> aVar, Object obj, Object obj2);

        public abstract boolean c(a<?> aVar, k kVar, k kVar2);

        public abstract void d(k kVar, k kVar2);

        public abstract void e(k kVar, Thread thread);
    }

    public static final class b {

        /* renamed from: c, reason: collision with root package name */
        public static final b f22604c;

        /* renamed from: d, reason: collision with root package name */
        public static final b f22605d;

        /* renamed from: a, reason: collision with root package name */
        public final boolean f22606a;

        /* renamed from: b, reason: collision with root package name */
        public final Throwable f22607b;

        static {
            if (a.f22597d) {
                f22605d = null;
                f22604c = null;
            } else {
                f22605d = new b(false, null);
                f22604c = new b(true, null);
            }
        }

        public b(boolean z10, Throwable th2) {
            this.f22606a = z10;
            this.f22607b = th2;
        }
    }

    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f22608b = new c(new C0251a("Failure occurred while trying to finish a future."));

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f22609a;

        /* renamed from: qc.a$c$a, reason: collision with other inner class name */
        public static class C0251a extends Throwable {
            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public c(Throwable th2) {
            th2.getClass();
            this.f22609a = th2;
        }
    }

    public static final class d {

        /* renamed from: d, reason: collision with root package name */
        public static final d f22610d = new d(null, null);

        /* renamed from: a, reason: collision with root package name */
        public final Runnable f22611a;

        /* renamed from: b, reason: collision with root package name */
        public final Executor f22612b;

        /* renamed from: c, reason: collision with root package name */
        public d f22613c;

        public d(Runnable runnable, Executor executor) {
            this.f22611a = runnable;
            this.f22612b = executor;
        }
    }

    public static final class e extends AbstractC0250a {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<k, Thread> f22614a;

        /* renamed from: b, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<k, k> f22615b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, k> f22616c;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, d> f22617d;

        /* renamed from: e, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, Object> f22618e;

        public e(AtomicReferenceFieldUpdater<k, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<k, k> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, k> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            this.f22614a = atomicReferenceFieldUpdater;
            this.f22615b = atomicReferenceFieldUpdater2;
            this.f22616c = atomicReferenceFieldUpdater3;
            this.f22617d = atomicReferenceFieldUpdater4;
            this.f22618e = atomicReferenceFieldUpdater5;
        }

        @Override // qc.a.AbstractC0250a
        public final boolean a(a<?> aVar, d dVar, d dVar2) {
            AtomicReferenceFieldUpdater<a, d> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f22617d;
                if (atomicReferenceFieldUpdater.compareAndSet(aVar, dVar, dVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(aVar) == dVar);
            return false;
        }

        @Override // qc.a.AbstractC0250a
        public final boolean b(a<?> aVar, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f22618e;
                if (atomicReferenceFieldUpdater.compareAndSet(aVar, obj, obj2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(aVar) == obj);
            return false;
        }

        @Override // qc.a.AbstractC0250a
        public final boolean c(a<?> aVar, k kVar, k kVar2) {
            AtomicReferenceFieldUpdater<a, k> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f22616c;
                if (atomicReferenceFieldUpdater.compareAndSet(aVar, kVar, kVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(aVar) == kVar);
            return false;
        }

        @Override // qc.a.AbstractC0250a
        public final void d(k kVar, k kVar2) {
            this.f22615b.lazySet(kVar, kVar2);
        }

        @Override // qc.a.AbstractC0250a
        public final void e(k kVar, Thread thread) {
            this.f22614a.lazySet(kVar, thread);
        }
    }

    public static final class f<V> implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final qc.e f22619a;

        /* renamed from: b, reason: collision with root package name */
        public final m<? extends V> f22620b;

        public f(qc.e eVar, m mVar) {
            this.f22619a = eVar;
            this.f22620b = mVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f22619a.f22601a != this) {
                return;
            }
            if (a.f22599f.b(this.f22619a, this, a.h(this.f22620b))) {
                a.e(this.f22619a);
            }
        }
    }

    public static final class g extends AbstractC0250a {
        @Override // qc.a.AbstractC0250a
        public final boolean a(a<?> aVar, d dVar, d dVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f22602b != dVar) {
                        return false;
                    }
                    aVar.f22602b = dVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // qc.a.AbstractC0250a
        public final boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                try {
                    if (aVar.f22601a != obj) {
                        return false;
                    }
                    aVar.f22601a = obj2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // qc.a.AbstractC0250a
        public final boolean c(a<?> aVar, k kVar, k kVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f22603c != kVar) {
                        return false;
                    }
                    aVar.f22603c = kVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // qc.a.AbstractC0250a
        public final void d(k kVar, k kVar2) {
            kVar.f22629b = kVar2;
        }

        @Override // qc.a.AbstractC0250a
        public final void e(k kVar, Thread thread) {
            kVar.f22628a = thread;
        }
    }

    public interface h<V> extends m<V> {
    }

    public static abstract class i<V> extends a<V> implements h<V> {
        @Override // qc.a, java.util.concurrent.Future
        public final boolean isCancelled() {
            return this.f22601a instanceof b;
        }
    }

    public static final class j extends AbstractC0250a {

        /* renamed from: a, reason: collision with root package name */
        public static final Unsafe f22621a;

        /* renamed from: b, reason: collision with root package name */
        public static final long f22622b;

        /* renamed from: c, reason: collision with root package name */
        public static final long f22623c;

        /* renamed from: d, reason: collision with root package name */
        public static final long f22624d;

        /* renamed from: e, reason: collision with root package name */
        public static final long f22625e;

        /* renamed from: f, reason: collision with root package name */
        public static final long f22626f;

        /* renamed from: qc.a$j$a, reason: collision with other inner class name */
        public static class C0252a implements PrivilegedExceptionAction<Unsafe> {
            public static Unsafe a() throws Exception {
                for (Field field : Unsafe.class.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }

            @Override // java.security.PrivilegedExceptionAction
            public final /* bridge */ /* synthetic */ Unsafe run() throws Exception {
                return a();
            }
        }

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e10) {
                    throw new RuntimeException("Could not initialize intrinsics", e10.getCause());
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new C0252a());
            }
            try {
                f22623c = unsafe.objectFieldOffset(a.class.getDeclaredField("c"));
                f22622b = unsafe.objectFieldOffset(a.class.getDeclaredField("b"));
                f22624d = unsafe.objectFieldOffset(a.class.getDeclaredField("a"));
                f22625e = unsafe.objectFieldOffset(k.class.getDeclaredField("a"));
                f22626f = unsafe.objectFieldOffset(k.class.getDeclaredField("b"));
                f22621a = unsafe;
            } catch (Exception e11) {
                Object obj = v.f16973a;
                if (!(e11 instanceof RuntimeException)) {
                    throw new RuntimeException(e11);
                }
                throw ((RuntimeException) e11);
            }
        }

        @Override // qc.a.AbstractC0250a
        public final boolean a(a<?> aVar, d dVar, d dVar2) {
            return qc.c.a(f22621a, aVar, f22622b, dVar, dVar2);
        }

        @Override // qc.a.AbstractC0250a
        public final boolean b(a<?> aVar, Object obj, Object obj2) {
            return qc.d.a(f22621a, aVar, f22624d, obj, obj2);
        }

        @Override // qc.a.AbstractC0250a
        public final boolean c(a<?> aVar, k kVar, k kVar2) {
            return qc.b.a(f22621a, aVar, f22623c, kVar, kVar2);
        }

        @Override // qc.a.AbstractC0250a
        public final void d(k kVar, k kVar2) {
            f22621a.putObject(kVar, f22626f, kVar2);
        }

        @Override // qc.a.AbstractC0250a
        public final void e(k kVar, Thread thread) {
            f22621a.putObject(kVar, f22625e, thread);
        }
    }

    public static final class k {

        /* renamed from: c, reason: collision with root package name */
        public static final k f22627c = new k();

        /* renamed from: a, reason: collision with root package name */
        public volatile Thread f22628a;

        /* renamed from: b, reason: collision with root package name */
        public volatile k f22629b;

        public k() {
            a.f22599f.e(this, Thread.currentThread());
        }
    }

    static {
        Throwable th2;
        AbstractC0250a gVar;
        Throwable th3 = null;
        try {
            gVar = new j();
            th2 = null;
        } catch (Throwable th4) {
            th2 = th4;
            try {
                gVar = new e(AtomicReferenceFieldUpdater.newUpdater(k.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(k.class, k.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, k.class, "c"), AtomicReferenceFieldUpdater.newUpdater(a.class, d.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "a"));
            } catch (Throwable th5) {
                th3 = th5;
                gVar = new g();
            }
        }
        f22599f = gVar;
        if (th3 != null) {
            Logger logger = f22598e;
            Level level = Level.SEVERE;
            logger.log(level, "UnsafeAtomicHelper is broken!", th2);
            logger.log(level, "SafeAtomicHelper is broken!", th3);
        }
        f22600g = new Object();
    }

    public static void e(a<?> aVar) {
        d dVar;
        d dVar2;
        d dVar3 = null;
        while (true) {
            k kVar = aVar.f22603c;
            if (f22599f.c(aVar, kVar, k.f22627c)) {
                while (kVar != null) {
                    Thread thread = kVar.f22628a;
                    if (thread != null) {
                        kVar.f22628a = null;
                        LockSupport.unpark(thread);
                    }
                    kVar = kVar.f22629b;
                }
                aVar.d();
                do {
                    dVar = aVar.f22602b;
                } while (!f22599f.a(aVar, dVar, d.f22610d));
                while (true) {
                    dVar2 = dVar3;
                    dVar3 = dVar;
                    if (dVar3 == null) {
                        break;
                    }
                    dVar = dVar3.f22613c;
                    dVar3.f22613c = dVar2;
                }
                while (dVar2 != null) {
                    dVar3 = dVar2.f22613c;
                    Runnable runnable = dVar2.f22611a;
                    if (runnable instanceof f) {
                        f fVar = (f) runnable;
                        aVar = fVar.f22619a;
                        if (aVar.f22601a == fVar) {
                            if (f22599f.b(aVar, fVar, h(fVar.f22620b))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        f(runnable, dVar2.f22612b);
                    }
                    dVar2 = dVar3;
                }
                return;
            }
        }
    }

    public static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f22598e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    public static Object g(Object obj) throws ExecutionException {
        if (obj instanceof b) {
            Throwable th2 = ((b) obj).f22607b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (obj instanceof c) {
            throw new ExecutionException(((c) obj).f22609a);
        }
        if (obj == f22600g) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object h(m<?> mVar) {
        Object obj;
        Throwable thB;
        if (mVar instanceof h) {
            Object obj2 = ((a) mVar).f22601a;
            if (!(obj2 instanceof b)) {
                return obj2;
            }
            b bVar = (b) obj2;
            return bVar.f22606a ? bVar.f22607b != null ? new b(false, bVar.f22607b) : b.f22605d : obj2;
        }
        if ((mVar instanceof rc.a) && (thB = ((rc.a) mVar).b()) != null) {
            return new c(thB);
        }
        boolean zIsCancelled = mVar.isCancelled();
        boolean z10 = true;
        if ((!f22597d) && zIsCancelled) {
            return b.f22605d;
        }
        boolean z11 = false;
        while (true) {
            try {
                try {
                    obj = mVar.get();
                    break;
                } catch (InterruptedException unused) {
                    z11 = z10;
                } catch (Throwable th2) {
                    if (z11) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            } catch (CancellationException e10) {
                if (zIsCancelled) {
                    return new b(false, e10);
                }
                return new c(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + mVar, e10));
            } catch (ExecutionException e11) {
                if (!zIsCancelled) {
                    return new c(e11.getCause());
                }
                return new b(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + mVar, e11));
            } catch (Throwable th3) {
                return new c(th3);
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
        if (!zIsCancelled) {
            return obj == null ? f22600g : obj;
        }
        return new b(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + mVar));
    }

    @Override // qc.m
    public void a(Runnable runnable, Executor executor) {
        d dVar;
        d dVar2 = d.f22610d;
        if (!isDone() && (dVar = this.f22602b) != dVar2) {
            d dVar3 = new d(runnable, executor);
            do {
                dVar3.f22613c = dVar;
                if (f22599f.a(this, dVar, dVar3)) {
                    return;
                } else {
                    dVar = this.f22602b;
                }
            } while (dVar != dVar2);
        }
        f(runnable, executor);
    }

    @Override // rc.a
    public final Throwable b() {
        if (!(this instanceof h)) {
            return null;
        }
        Object obj = this.f22601a;
        if (obj instanceof c) {
            return ((c) obj).f22609a;
        }
        return null;
    }

    public final void c(StringBuilder sb) {
        V v10;
        boolean z10 = false;
        while (true) {
            try {
                try {
                    v10 = get();
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                } catch (Throwable th2) {
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (RuntimeException e10) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e10.getClass());
                sb.append(" thrown from get()]");
                return;
            } catch (ExecutionException e11) {
                sb.append("FAILURE, cause=[");
                sb.append(e11.getCause());
                sb.append("]");
                return;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        sb.append(v10 == this ? "this future" : String.valueOf(v10));
        sb.append("]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0053, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean cancel(boolean z10) {
        Object obj = this.f22601a;
        if (!(obj == null) && !(obj instanceof f)) {
            return false;
        }
        b bVar = f22597d ? new b(z10, new CancellationException("Future.cancel() was called.")) : z10 ? b.f22604c : b.f22605d;
        a<V> aVar = this;
        boolean z11 = false;
        while (true) {
            if (f22599f.b(aVar, obj, bVar)) {
                e(aVar);
                if (!(obj instanceof f)) {
                    break;
                }
                m<? extends V> mVar = ((f) obj).f22620b;
                if (!(mVar instanceof h)) {
                    mVar.cancel(z10);
                    break;
                }
                aVar = (a) mVar;
                obj = aVar.f22601a;
                if (!(obj == null) && !(obj instanceof f)) {
                    break;
                }
                z11 = true;
            } else {
                obj = aVar.f22601a;
                if (!(obj instanceof f)) {
                    return z11;
                }
            }
        }
    }

    public void d() {
    }

    @Override // java.util.concurrent.Future
    public V get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        boolean z10;
        k kVar = k.f22627c;
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f22601a;
        if ((obj != null) && (!(obj instanceof f))) {
            return (V) g(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            k kVar2 = this.f22603c;
            if (kVar2 != kVar) {
                k kVar3 = new k();
                z10 = true;
                do {
                    AbstractC0250a abstractC0250a = f22599f;
                    abstractC0250a.d(kVar3, kVar2);
                    if (abstractC0250a.c(this, kVar2, kVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                j(kVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f22601a;
                            if ((obj2 != null) && (!(obj2 instanceof f))) {
                                return (V) g(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        j(kVar3);
                    } else {
                        kVar2 = this.f22603c;
                    }
                } while (kVar2 != kVar);
            }
            return (V) g(this.f22601a);
        }
        z10 = true;
        while (nanos > 0) {
            Object obj3 = this.f22601a;
            if ((obj3 != null ? z10 : false) && (!(obj3 instanceof f))) {
                return (V) g(obj3);
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
    public String i() {
        Object obj = this.f22601a;
        if (obj instanceof f) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            m<? extends V> mVar = ((f) obj).f22620b;
            return b.o.a(sb, mVar == this ? "this future" : String.valueOf(mVar), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f22601a instanceof b;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (!(r0 instanceof f)) & (this.f22601a != null);
    }

    public final void j(k kVar) {
        kVar.f22628a = null;
        while (true) {
            k kVar2 = this.f22603c;
            if (kVar2 == k.f22627c) {
                return;
            }
            k kVar3 = null;
            while (kVar2 != null) {
                k kVar4 = kVar2.f22629b;
                if (kVar2.f22628a != null) {
                    kVar3 = kVar2;
                } else if (kVar3 != null) {
                    kVar3.f22629b = kVar4;
                    if (kVar3.f22628a == null) {
                        break;
                    }
                } else if (!f22599f.c(this, kVar2, kVar4)) {
                    break;
                }
                kVar2 = kVar4;
            }
            return;
        }
    }

    public boolean k(Throwable th2) {
        th2.getClass();
        if (!f22599f.b(this, null, new c(th2))) {
            return false;
        }
        e(this);
        return true;
    }

    public final String toString() {
        String strI;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            c(sb);
        } else {
            try {
                strI = i();
            } catch (RuntimeException e10) {
                strI = "Exception thrown from implementation: " + e10.getClass();
            }
            if (strI != null && !strI.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strI);
                sb.append("]");
            } else if (isDone()) {
                c(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public V get() throws ExecutionException, InterruptedException {
        Object obj;
        k kVar = k.f22627c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f22601a;
            if ((obj2 != null) & (!(obj2 instanceof f))) {
                return (V) g(obj2);
            }
            k kVar2 = this.f22603c;
            if (kVar2 != kVar) {
                k kVar3 = new k();
                do {
                    AbstractC0250a abstractC0250a = f22599f;
                    abstractC0250a.d(kVar3, kVar2);
                    if (abstractC0250a.c(this, kVar2, kVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f22601a;
                            } else {
                                j(kVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return (V) g(obj);
                    }
                    kVar2 = this.f22603c;
                } while (kVar2 != kVar);
            }
            return (V) g(this.f22601a);
        }
        throw new InterruptedException();
    }
}
