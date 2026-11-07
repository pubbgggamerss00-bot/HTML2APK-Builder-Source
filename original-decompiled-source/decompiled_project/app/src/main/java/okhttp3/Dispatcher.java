package okhttp3;

import fi.b;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.r;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealCall;
import pg.f0;

/* loaded from: classes2.dex */
public final class Dispatcher {

    /* renamed from: a, reason: collision with root package name */
    public ThreadPoolExecutor f19235a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque<RealCall.AsyncCall> f19236b = new ArrayDeque<>();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque<RealCall.AsyncCall> f19237c = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque<RealCall> f19238d = new ArrayDeque<>();

    public final synchronized void a() {
        try {
            Iterator<RealCall.AsyncCall> it = this.f19236b.iterator();
            while (it.hasNext()) {
                RealCall.this.cancel();
            }
            Iterator<RealCall.AsyncCall> it2 = this.f19237c.iterator();
            while (it2.hasNext()) {
                RealCall.this.cancel();
            }
            Iterator<RealCall> it3 = this.f19238d.iterator();
            while (it3.hasNext()) {
                it3.next().cancel();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void b(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (!arrayDeque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            f0 f0Var = f0.f21461a;
        }
        d();
    }

    public final void c(RealCall.AsyncCall asyncCall) {
        asyncCall.f19481b.decrementAndGet();
        b(this.f19237c, asyncCall);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        int size;
        int i10;
        ThreadPoolExecutor threadPoolExecutor;
        byte[] bArr = Util.f19393a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator<RealCall.AsyncCall> it = this.f19236b.iterator();
                r.d(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    RealCall.AsyncCall next = it.next();
                    if (this.f19237c.size() >= 64) {
                        break;
                    }
                    if (next.f19481b.get() < 5) {
                        it.remove();
                        next.f19481b.incrementAndGet();
                        arrayList.add(next);
                        this.f19237c.add(next);
                    }
                }
                synchronized (this) {
                    this.f19237c.size();
                    this.f19238d.size();
                }
                size = arrayList.size();
                boolean z10 = false;
                for (i10 = 0; i10 < size; i10++) {
                    RealCall.AsyncCall asyncCall = (RealCall.AsyncCall) arrayList.get(i10);
                    synchronized (this) {
                        try {
                            if (this.f19235a == null) {
                                TimeUnit timeUnit = TimeUnit.SECONDS;
                                SynchronousQueue synchronousQueue = new SynchronousQueue();
                                String name = Util.f19399g + " Dispatcher";
                                r.e(name, "name");
                                this.f19235a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new b(name, z10));
                            }
                            threadPoolExecutor = this.f19235a;
                            r.b(threadPoolExecutor);
                        } finally {
                        }
                    }
                    asyncCall.getClass();
                    RealCall realCall = RealCall.this;
                    byte[] bArr2 = Util.f19393a;
                    try {
                        try {
                            threadPoolExecutor.execute(asyncCall);
                        } catch (RejectedExecutionException e10) {
                            InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                            interruptedIOException.initCause(e10);
                            realCall.i(interruptedIOException);
                            asyncCall.f19480a.c(realCall, interruptedIOException);
                            realCall.f19464a.f19279a.c(asyncCall);
                        }
                    } catch (Throwable th2) {
                        realCall.f19464a.f19279a.c(asyncCall);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        f0 f0Var = f0.f21461a;
        size = arrayList.size();
        boolean z102 = false;
        while (i10 < size) {
        }
    }
}
