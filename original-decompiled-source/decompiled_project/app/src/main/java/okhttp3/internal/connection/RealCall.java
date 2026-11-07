package okhttp3.internal.connection;

import c9.u1;
import hi.c;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.r;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Dispatcher;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheInterceptor;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.http.BridgeInterceptor;
import okhttp3.internal.http.CallServerInterceptor;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.RetryAndFollowUpInterceptor;
import okhttp3.internal.platform.Platform;
import pg.f0;
import qg.t;

/* loaded from: classes2.dex */
public final class RealCall implements Call {

    /* renamed from: a, reason: collision with root package name */
    public final OkHttpClient f19464a;

    /* renamed from: b, reason: collision with root package name */
    public final Request f19465b;

    /* renamed from: c, reason: collision with root package name */
    public final RealConnectionPool f19466c;

    /* renamed from: d, reason: collision with root package name */
    public final EventListener f19467d;

    /* renamed from: e, reason: collision with root package name */
    public final RealCall$timeout$1 f19468e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f19469f;

    /* renamed from: g, reason: collision with root package name */
    public Object f19470g;

    /* renamed from: h, reason: collision with root package name */
    public ExchangeFinder f19471h;

    /* renamed from: j, reason: collision with root package name */
    public RealConnection f19472j;

    /* renamed from: k, reason: collision with root package name */
    public Exchange f19473k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f19474l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f19475m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f19476n;

    /* renamed from: p, reason: collision with root package name */
    public volatile boolean f19477p;

    /* renamed from: q, reason: collision with root package name */
    public volatile Exchange f19478q;

    /* renamed from: r, reason: collision with root package name */
    public volatile RealConnection f19479r;

    public final class AsyncCall implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final Callback f19480a;

        /* renamed from: b, reason: collision with root package name */
        public volatile AtomicInteger f19481b = new AtomicInteger(0);

        public AsyncCall(Callback callback) {
            this.f19480a = callback;
        }

        @Override // java.lang.Runnable
        public final void run() {
            OkHttpClient okHttpClient;
            String strConcat = "OkHttp ".concat(RealCall.this.f19465b.f19337a.f());
            RealCall realCall = RealCall.this;
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            threadCurrentThread.setName(strConcat);
            try {
                realCall.f19468e.h();
                boolean z10 = false;
                try {
                    try {
                    } catch (Throwable th2) {
                        realCall.f19464a.f19279a.c(this);
                        throw th2;
                    }
                } catch (IOException e10) {
                    e = e10;
                } catch (Throwable th3) {
                    th = th3;
                }
                try {
                    this.f19480a.a(realCall, realCall.g());
                    okHttpClient = realCall.f19464a;
                } catch (IOException e11) {
                    e = e11;
                    z10 = true;
                    if (z10) {
                        Platform.f19768a.getClass();
                        Platform platform = Platform.f19769b;
                        String str = "Callback failure for " + RealCall.a(realCall);
                        platform.getClass();
                        Platform.i(str, 4, e);
                    } else {
                        this.f19480a.c(realCall, e);
                    }
                    okHttpClient = realCall.f19464a;
                    okHttpClient.f19279a.c(this);
                } catch (Throwable th4) {
                    th = th4;
                    z10 = true;
                    realCall.cancel();
                    if (!z10) {
                        IOException iOException = new IOException("canceled due to " + th);
                        u1.b(iOException, th);
                        this.f19480a.c(realCall, iOException);
                    }
                    throw th;
                }
                okHttpClient.f19279a.c(this);
            } finally {
                threadCurrentThread.setName(name);
            }
        }
    }

    public static final class CallReference extends WeakReference<RealCall> {

        /* renamed from: a, reason: collision with root package name */
        public final Object f19483a;

        public CallReference(RealCall realCall, Object obj) {
            super(realCall);
            this.f19483a = obj;
        }
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [hi.m0, okhttp3.internal.connection.RealCall$timeout$1] */
    public RealCall(OkHttpClient okHttpClient, Request originalRequest) {
        r.e(originalRequest, "originalRequest");
        this.f19464a = okHttpClient;
        this.f19465b = originalRequest;
        this.f19466c = okHttpClient.f19280b.f19207a;
        EventListener this_asFactory = okHttpClient.f19283e.f11239a;
        byte[] bArr = Util.f19393a;
        r.e(this_asFactory, "$this_asFactory");
        this.f19467d = this_asFactory;
        ?? r42 = new c() { // from class: okhttp3.internal.connection.RealCall$timeout$1
            @Override // hi.c
            public final void j() {
                this.f19484m.cancel();
            }
        };
        r42.g(okHttpClient.f19300y, TimeUnit.MILLISECONDS);
        this.f19468e = r42;
        this.f19469f = new AtomicBoolean();
        this.f19476n = true;
    }

    public static final String a(RealCall realCall) {
        StringBuilder sb = new StringBuilder();
        sb.append(realCall.f19477p ? "canceled " : "");
        sb.append("call");
        sb.append(" to ");
        sb.append(realCall.f19465b.f19337a.f());
        return sb.toString();
    }

    public final void b(RealConnection realConnection) {
        byte[] bArr = Util.f19393a;
        if (this.f19472j != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.f19472j = realConnection;
        realConnection.f19499p.add(new CallReference(this, this.f19470g));
    }

    public final <E extends IOException> E c(E e10) {
        E interruptedIOException;
        Socket socketJ;
        byte[] bArr = Util.f19393a;
        RealConnection realConnection = this.f19472j;
        if (realConnection != null) {
            synchronized (realConnection) {
                socketJ = j();
            }
            if (this.f19472j == null) {
                if (socketJ != null) {
                    Util.d(socketJ);
                }
                this.f19467d.getClass();
            } else if (socketJ != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (i()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (e10 != null) {
                interruptedIOException.initCause(e10);
            }
        } else {
            interruptedIOException = e10;
        }
        if (e10 == null) {
            this.f19467d.getClass();
            return interruptedIOException;
        }
        EventListener eventListener = this.f19467d;
        r.b(interruptedIOException);
        eventListener.getClass();
        return interruptedIOException;
    }

    @Override // okhttp3.Call
    public final void cancel() {
        Socket socket;
        if (this.f19477p) {
            return;
        }
        this.f19477p = true;
        Exchange exchange = this.f19478q;
        if (exchange != null) {
            exchange.f19440d.cancel();
        }
        RealConnection realConnection = this.f19479r;
        if (realConnection != null && (socket = realConnection.f19486c) != null) {
            Util.d(socket);
        }
        this.f19467d.getClass();
    }

    public final Object clone() {
        return new RealCall(this.f19464a, this.f19465b);
    }

    public final void d(Callback callback) {
        AsyncCall next;
        if (!this.f19469f.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        Platform.f19768a.getClass();
        this.f19470g = Platform.f19769b.g();
        this.f19467d.getClass();
        Dispatcher dispatcher = this.f19464a.f19279a;
        AsyncCall asyncCall = new AsyncCall(callback);
        dispatcher.getClass();
        synchronized (dispatcher) {
            dispatcher.f19236b.add(asyncCall);
            String str = this.f19465b.f19337a.f19258d;
            Iterator<AsyncCall> it = dispatcher.f19237c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    Iterator<AsyncCall> it2 = dispatcher.f19236b.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it2.next();
                            if (r.a(RealCall.this.f19465b.f19337a.f19258d, str)) {
                                break;
                            }
                        }
                    }
                } else {
                    next = it.next();
                    if (r.a(RealCall.this.f19465b.f19337a.f19258d, str)) {
                        break;
                    }
                }
            }
            if (next != null) {
                asyncCall.f19481b = next.f19481b;
            }
            f0 f0Var = f0.f21461a;
        }
        dispatcher.d();
    }

    public final Response e() {
        if (!this.f19469f.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        h();
        Platform.f19768a.getClass();
        this.f19470g = Platform.f19769b.g();
        this.f19467d.getClass();
        try {
            Dispatcher dispatcher = this.f19464a.f19279a;
            synchronized (dispatcher) {
                dispatcher.f19238d.add(this);
            }
            return g();
        } finally {
            Dispatcher dispatcher2 = this.f19464a.f19279a;
            dispatcher2.b(dispatcher2.f19238d, this);
        }
    }

    public final void f(boolean z10) {
        Exchange exchange;
        synchronized (this) {
            if (!this.f19476n) {
                throw new IllegalStateException("released");
            }
            f0 f0Var = f0.f21461a;
        }
        if (z10 && (exchange = this.f19478q) != null) {
            exchange.f19440d.cancel();
            exchange.f19437a.h(exchange, true, true, null);
        }
        this.f19473k = null;
    }

    public final Response g() throws IOException {
        ArrayList arrayList = new ArrayList();
        t.p(this.f19464a.f19281c, arrayList);
        arrayList.add(new RetryAndFollowUpInterceptor(this.f19464a));
        arrayList.add(new BridgeInterceptor(this.f19464a.f19288k));
        arrayList.add(new CacheInterceptor());
        arrayList.add(ConnectInterceptor.f19432a);
        t.p(this.f19464a.f19282d, arrayList);
        arrayList.add(new CallServerInterceptor());
        Request request = this.f19465b;
        OkHttpClient okHttpClient = this.f19464a;
        try {
            try {
                Response responseB = new RealInterceptorChain(this, arrayList, 0, null, request, okHttpClient.f19301z, okHttpClient.A, okHttpClient.B).b(this.f19465b);
                if (this.f19477p) {
                    Util.c(responseB);
                    throw new IOException("Canceled");
                }
                i(null);
                return responseB;
            } catch (IOException e10) {
                IOException iOExceptionI = i(e10);
                r.c(iOExceptionI, "null cannot be cast to non-null type kotlin.Throwable");
                throw iOExceptionI;
            }
        } catch (Throwable th2) {
            if (0 == 0) {
                i(null);
            }
            throw th2;
        }
    }

    public final <E extends IOException> E h(Exchange exchange, boolean z10, boolean z11, E e10) {
        boolean z12;
        boolean z13;
        r.e(exchange, "exchange");
        if (exchange.equals(this.f19478q)) {
            synchronized (this) {
                z12 = false;
                if (z10) {
                    try {
                        if (!this.f19474l) {
                            if (z11 || !this.f19475m) {
                                z13 = false;
                            }
                            f0 f0Var = f0.f21461a;
                        }
                        if (z10) {
                            this.f19474l = false;
                        }
                        if (z11) {
                            this.f19475m = false;
                        }
                        boolean z14 = this.f19474l;
                        boolean z15 = (z14 || this.f19475m) ? false : true;
                        if (!z14 && !this.f19475m && !this.f19476n) {
                            z12 = true;
                        }
                        z13 = z12;
                        z12 = z15;
                        f0 f0Var2 = f0.f21461a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } else {
                    if (z11) {
                    }
                    z13 = false;
                    f0 f0Var22 = f0.f21461a;
                }
            }
            if (z12) {
                this.f19478q = null;
                RealConnection realConnection = this.f19472j;
                if (realConnection != null) {
                    synchronized (realConnection) {
                        realConnection.f19496m++;
                    }
                }
            }
            if (z13) {
                return (E) c(e10);
            }
        }
        return e10;
    }

    public final IOException i(IOException iOException) {
        boolean z10;
        synchronized (this) {
            try {
                z10 = false;
                if (this.f19476n) {
                    this.f19476n = false;
                    if (!this.f19474l && !this.f19475m) {
                        z10 = true;
                    }
                }
                f0 f0Var = f0.f21461a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10 ? c(iOException) : iOException;
    }

    @Override // okhttp3.Call
    public final boolean isCanceled() {
        return this.f19477p;
    }

    public final Socket j() {
        RealConnection realConnection = this.f19472j;
        r.b(realConnection);
        byte[] bArr = Util.f19393a;
        ArrayList arrayList = realConnection.f19499p;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                i10 = -1;
                break;
            }
            Object obj = arrayList.get(i11);
            i11++;
            if (r.a(((Reference) obj).get(), this)) {
                break;
            }
            i10++;
        }
        if (i10 == -1) {
            throw new IllegalStateException("Check failed.");
        }
        arrayList.remove(i10);
        this.f19472j = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        realConnection.f19500q = System.nanoTime();
        RealConnectionPool realConnectionPool = this.f19466c;
        ConcurrentLinkedQueue<RealConnection> concurrentLinkedQueue = realConnectionPool.f19509d;
        TaskQueue taskQueue = realConnectionPool.f19507b;
        byte[] bArr2 = Util.f19393a;
        if (!realConnection.f19493j) {
            taskQueue.c(realConnectionPool.f19508c, 0L);
            return null;
        }
        realConnection.f19493j = true;
        concurrentLinkedQueue.remove(realConnection);
        if (concurrentLinkedQueue.isEmpty()) {
            taskQueue.a();
        }
        Socket socket = realConnection.f19487d;
        r.b(socket);
        return socket;
    }
}
