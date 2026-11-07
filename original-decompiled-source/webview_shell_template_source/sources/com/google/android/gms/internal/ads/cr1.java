package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.Objects;
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
public abstract class cr1<V> extends xs1 implements c5.a<V> {

    /* renamed from: v, reason: collision with root package name */
    public static final boolean f3645v;

    /* renamed from: w, reason: collision with root package name */
    public static final gs1 f3646w;

    /* renamed from: x, reason: collision with root package name */
    public static final rq1 f3647x;

    /* renamed from: y, reason: collision with root package name */
    public static final Object f3648y;
    public volatile Object s;

    /* renamed from: t, reason: collision with root package name */
    public volatile uq1 f3649t;

    /* renamed from: u, reason: collision with root package name */
    public volatile br1 f3650u;

    static {
        boolean z6;
        rq1 xq1Var;
        Throwable th;
        Throwable th2;
        try {
            z6 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z6 = false;
        }
        f3645v = z6;
        f3646w = new gs1(cr1.class);
        try {
            xq1Var = new ar1();
            th = null;
            th2 = null;
        } catch (Error | Exception e6) {
            try {
                th = null;
                th2 = e6;
                xq1Var = new vq1(AtomicReferenceFieldUpdater.newUpdater(br1.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(br1.class, br1.class, "b"), AtomicReferenceFieldUpdater.newUpdater(cr1.class, br1.class, "u"), AtomicReferenceFieldUpdater.newUpdater(cr1.class, uq1.class, "t"), AtomicReferenceFieldUpdater.newUpdater(cr1.class, Object.class, "s"));
            } catch (Error | Exception e7) {
                xq1Var = new xq1();
                th = e7;
                th2 = e6;
            }
        }
        f3647x = xq1Var;
        if (th != null) {
            gs1 gs1Var = f3646w;
            Logger loggerA = gs1Var.a();
            Level level = Level.SEVERE;
            loggerA.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            gs1Var.a().logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        f3648y = new Object();
    }

    public static final Object b(Object obj) throws ExecutionException {
        if (obj instanceof sq1) {
            Throwable th = ((sq1) obj).f8993b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof tq1) {
            throw new ExecutionException(((tq1) obj).f9369a);
        }
        if (obj == f3648y) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object g(c5.a aVar) {
        Object obj;
        Throwable thA;
        if (aVar instanceof yq1) {
            Object sq1Var = ((cr1) aVar).s;
            if (sq1Var instanceof sq1) {
                sq1 sq1Var2 = (sq1) sq1Var;
                if (sq1Var2.f8992a) {
                    Throwable th = sq1Var2.f8993b;
                    sq1Var = th != null ? new sq1(th, false) : sq1.f8991d;
                }
            }
            Objects.requireNonNull(sq1Var);
            return sq1Var;
        }
        if ((aVar instanceof xs1) && (thA = ((xs1) aVar).a()) != null) {
            return new tq1(thA);
        }
        boolean zIsCancelled = aVar.isCancelled();
        boolean z6 = true;
        if ((!f3645v) && zIsCancelled) {
            sq1 sq1Var3 = sq1.f8991d;
            Objects.requireNonNull(sq1Var3);
            return sq1Var3;
        }
        boolean z7 = false;
        while (true) {
            try {
                try {
                    try {
                        obj = aVar.get();
                        break;
                    } catch (Error e6) {
                        e = e6;
                        return new tq1(e);
                    }
                } catch (InterruptedException unused) {
                    z7 = z6;
                } catch (Throwable th2) {
                    if (z7) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            } catch (Error | Exception e7) {
                e = e7;
                return new tq1(e);
            } catch (CancellationException e8) {
                return !zIsCancelled ? new tq1(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(aVar)), e8)) : new sq1(e8, false);
            } catch (ExecutionException e9) {
                return zIsCancelled ? new sq1(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(aVar)), e9), false) : new tq1(e9.getCause());
            }
        }
        if (z7) {
            Thread.currentThread().interrupt();
        }
        return zIsCancelled ? new sq1(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(aVar))), false) : obj == null ? f3648y : obj;
    }

    public static void m(cr1 cr1Var, boolean z6) {
        uq1 uq1Var = null;
        while (true) {
            for (br1 br1VarB = f3647x.b(cr1Var); br1VarB != null; br1VarB = br1VarB.f3259b) {
                Thread thread = br1VarB.f3258a;
                if (thread != null) {
                    br1VarB.f3258a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z6) {
                cr1Var.h();
            }
            cr1Var.d();
            uq1 uq1Var2 = uq1Var;
            uq1 uq1VarA = f3647x.a(cr1Var, uq1.f9614d);
            uq1 uq1Var3 = uq1Var2;
            while (uq1VarA != null) {
                uq1 uq1Var4 = uq1VarA.f9617c;
                uq1VarA.f9617c = uq1Var3;
                uq1Var3 = uq1VarA;
                uq1VarA = uq1Var4;
            }
            while (uq1Var3 != null) {
                uq1Var = uq1Var3.f9617c;
                Runnable runnable = uq1Var3.f9615a;
                Objects.requireNonNull(runnable);
                if (runnable instanceof wq1) {
                    wq1 wq1Var = (wq1) runnable;
                    cr1Var = wq1Var.s;
                    if (cr1Var.s == wq1Var) {
                        if (f3647x.f(cr1Var, wq1Var, g(wq1Var.f10254t))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = uq1Var3.f9616b;
                    Objects.requireNonNull(executor);
                    n(runnable, executor);
                }
                uq1Var3 = uq1Var;
            }
            return;
            z6 = false;
        }
    }

    public static void n(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e6) {
            f3646w.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.xs1
    public final Throwable a() {
        if (!(this instanceof yq1)) {
            return null;
        }
        Object obj = this.s;
        if (obj instanceof tq1) {
            return ((tq1) obj).f9369a;
        }
        return null;
    }

    @Override // c5.a
    public void addListener(Runnable runnable, Executor executor) {
        uq1 uq1Var;
        sl1.c("Runnable was null.", runnable);
        sl1.c("Executor was null.", executor);
        if (!isDone() && (uq1Var = this.f3649t) != uq1.f9614d) {
            uq1 uq1Var2 = new uq1(runnable, executor);
            do {
                uq1Var2.f9617c = uq1Var;
                if (f3647x.e(this, uq1Var, uq1Var2)) {
                    return;
                } else {
                    uq1Var = this.f3649t;
                }
            } while (uq1Var != uq1.f9614d);
        }
        n(runnable, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String c() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z6) {
        sq1 sq1Var;
        Object obj = this.s;
        if (!(obj instanceof wq1) && !(obj == null)) {
            return false;
        }
        if (f3645v) {
            sq1Var = new sq1(new CancellationException("Future.cancel() was called."), z6);
        } else {
            sq1Var = z6 ? sq1.f8990c : sq1.f8991d;
            Objects.requireNonNull(sq1Var);
        }
        cr1<V> cr1Var = this;
        boolean z7 = false;
        while (true) {
            if (f3647x.f(cr1Var, obj, sq1Var)) {
                m(cr1Var, z6);
                if (!(obj instanceof wq1)) {
                    break;
                }
                c5.a<? extends V> aVar = ((wq1) obj).f10254t;
                if (!(aVar instanceof yq1)) {
                    aVar.cancel(z6);
                    break;
                }
                cr1Var = (cr1) aVar;
                obj = cr1Var.s;
                if (!(obj == null) && !(obj instanceof wq1)) {
                    break;
                }
                z7 = true;
            } else {
                obj = cr1Var.s;
                if (!(obj instanceof wq1)) {
                    return z7;
                }
            }
        }
        return true;
    }

    public boolean e(Object obj) {
        if (obj == null) {
            obj = f3648y;
        }
        if (!f3647x.f(this, null, obj)) {
            return false;
        }
        m(this, false);
        return true;
    }

    public boolean f(Throwable th) {
        th.getClass();
        if (!f3647x.f(this, null, new tq1(th))) {
            return false;
        }
        m(this, false);
        return true;
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException {
        Object obj;
        br1 br1Var = br1.f3257c;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.s;
        if ((obj2 != null) && (!(obj2 instanceof wq1))) {
            return b(obj2);
        }
        br1 br1Var2 = this.f3650u;
        if (br1Var2 != br1Var) {
            br1 br1Var3 = new br1();
            do {
                rq1 rq1Var = f3647x;
                rq1Var.c(br1Var3, br1Var2);
                if (rq1Var.g(this, br1Var2, br1Var3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            o(br1Var3);
                            throw new InterruptedException();
                        }
                        obj = this.s;
                    } while (!((obj != null) & (!(obj instanceof wq1))));
                    return b(obj);
                }
                br1Var2 = this.f3650u;
            } while (br1Var2 != br1Var);
        }
        Object obj3 = this.s;
        Objects.requireNonNull(obj3);
        return b(obj3);
    }

    public final void i(Future future) {
        if ((future != null) && (this.s instanceof sq1)) {
            future.cancel(k());
        }
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.s instanceof sq1;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (this.s != null) & (!(r0 instanceof wq1));
    }

    public final void j(c5.a aVar) {
        tq1 tq1Var;
        aVar.getClass();
        Object obj = this.s;
        if (obj == null) {
            if (aVar.isDone()) {
                if (f3647x.f(this, null, g(aVar))) {
                    m(this, false);
                    return;
                }
                return;
            }
            wq1 wq1Var = new wq1(this, aVar);
            if (f3647x.f(this, null, wq1Var)) {
                try {
                    aVar.addListener(wq1Var, ur1.s);
                    return;
                } catch (Throwable th) {
                    try {
                        tq1Var = new tq1(th);
                    } catch (Error | Exception unused) {
                        tq1Var = tq1.f9368b;
                    }
                    f3647x.f(this, wq1Var, tq1Var);
                    return;
                }
            }
            obj = this.s;
        }
        if (obj instanceof sq1) {
            aVar.cancel(((sq1) obj).f8992a);
        }
    }

    public final boolean k() {
        Object obj = this.s;
        return (obj instanceof sq1) && ((sq1) obj).f8992a;
    }

    public final void l(StringBuilder sb) {
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
            } catch (ExecutionException e6) {
                sb.append("FAILURE, cause=[");
                sb.append(e6.getCause());
                sb.append("]");
                return;
            } catch (Exception e7) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e7.getClass());
                sb.append(" thrown from get()]");
                return;
            }
        }
        if (z6) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        if (v2 == null) {
            sb.append("null");
        } else if (v2 == this) {
            sb.append("this future");
        } else {
            sb.append(v2.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(v2)));
        }
        sb.append("]");
    }

    public final void o(br1 br1Var) {
        br1Var.f3258a = null;
        while (true) {
            br1 br1Var2 = this.f3650u;
            if (br1Var2 != br1.f3257c) {
                br1 br1Var3 = null;
                while (br1Var2 != null) {
                    br1 br1Var4 = br1Var2.f3259b;
                    if (br1Var2.f3258a != null) {
                        br1Var3 = br1Var2;
                    } else if (br1Var3 != null) {
                        br1Var3.f3259b = br1Var4;
                        if (br1Var3.f3258a == null) {
                            break;
                        }
                    } else if (!f3647x.g(this, br1Var2, br1Var4)) {
                        break;
                    }
                    br1Var2 = br1Var4;
                }
                return;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        String strConcat;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            l(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.s;
            if (obj instanceof wq1) {
                sb.append(", setFuture=[");
                c5.a<? extends V> aVar = ((wq1) obj).f10254t;
                try {
                    if (aVar == this) {
                        sb.append("this future");
                    } else {
                        sb.append(aVar);
                    }
                } catch (Exception e6) {
                    e = e6;
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e.getClass());
                    sb.append("]");
                    if (isDone()) {
                    }
                    sb.append("]");
                    return sb.toString();
                } catch (StackOverflowError e7) {
                    e = e7;
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e.getClass());
                    sb.append("]");
                    if (isDone()) {
                    }
                    sb.append("]");
                    return sb.toString();
                }
                sb.append("]");
            } else {
                try {
                    strConcat = c();
                    if (rj1.j(strConcat)) {
                        strConcat = null;
                    }
                } catch (Exception | StackOverflowError e8) {
                    strConcat = "Exception thrown from implementation: ".concat(String.valueOf(e8.getClass()));
                }
                if (strConcat != null) {
                    sb.append(", info=[");
                    sb.append(strConcat);
                    sb.append("]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                l(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j6, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        boolean z6;
        long j7;
        br1 br1Var = br1.f3257c;
        long nanos = timeUnit.toNanos(j6);
        if (!Thread.interrupted()) {
            Object obj = this.s;
            if ((obj != null) & (!(obj instanceof wq1))) {
                return b(obj);
            }
            long j8 = 0;
            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                br1 br1Var2 = this.f3650u;
                if (br1Var2 != br1Var) {
                    br1 br1Var3 = new br1();
                    z6 = true;
                    while (true) {
                        rq1 rq1Var = f3647x;
                        rq1Var.c(br1Var3, br1Var2);
                        if (rq1Var.g(this, br1Var2, br1Var3)) {
                            j7 = j8;
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.s;
                                    if ((obj2 != null) & (!(obj2 instanceof wq1))) {
                                        return b(obj2);
                                    }
                                    nanos = jNanoTime - System.nanoTime();
                                } else {
                                    o(br1Var3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            o(br1Var3);
                        } else {
                            long j9 = j8;
                            br1Var2 = this.f3650u;
                            if (br1Var2 == br1Var) {
                                break;
                            }
                            j8 = j9;
                        }
                    }
                }
                Object obj3 = this.s;
                Objects.requireNonNull(obj3);
                return b(obj3);
            }
            z6 = true;
            j7 = 0;
            while (nanos > j7) {
                Object obj4 = this.s;
                if ((obj4 != null ? z6 : false) & (!(obj4 instanceof wq1))) {
                    return b(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = jNanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String string = toString();
            String string2 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = string2.toLowerCase(locale);
            String strConcat = "Waited " + j6 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < j7) {
                String strConcat2 = strConcat.concat(" (plus ");
                long j10 = -nanos;
                long jConvert = timeUnit.convert(j10, TimeUnit.NANOSECONDS);
                long nanos2 = j10 - timeUnit.toNanos(jConvert);
                if (jConvert != j7 && nanos2 <= 1000) {
                    z6 = false;
                }
                if (jConvert > j7) {
                    String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
                    if (z6) {
                        strConcat3 = strConcat3.concat(",");
                    }
                    strConcat2 = strConcat3.concat(" ");
                }
                if (z6) {
                    strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
                }
                strConcat = strConcat2.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(androidx.activity.m.d(strConcat, " for ", string));
        }
        throw new InterruptedException();
    }

    public void d() {
    }

    public void h() {
    }
}
