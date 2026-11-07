package okhttp3.internal.http2;

import eh.a;
import hi.d0;
import hi.f0;
import hi.g;
import hi.i;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.r;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2Reader;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.PushObserver;
import okhttp3.internal.platform.Platform;

/* loaded from: classes2.dex */
public final class Http2Connection implements Closeable {
    public static final Companion D = new Companion(0);
    public static final Settings E;
    public final Http2Writer A;
    public final ReaderRunnable B;
    public final LinkedHashSet C;

    /* renamed from: a, reason: collision with root package name */
    public final Listener f19614a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f19615b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final String f19616c;

    /* renamed from: d, reason: collision with root package name */
    public int f19617d;

    /* renamed from: e, reason: collision with root package name */
    public int f19618e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f19619f;

    /* renamed from: g, reason: collision with root package name */
    public final TaskRunner f19620g;

    /* renamed from: h, reason: collision with root package name */
    public final TaskQueue f19621h;

    /* renamed from: j, reason: collision with root package name */
    public final TaskQueue f19622j;

    /* renamed from: k, reason: collision with root package name */
    public final TaskQueue f19623k;

    /* renamed from: l, reason: collision with root package name */
    public final PushObserver f19624l;

    /* renamed from: m, reason: collision with root package name */
    public long f19625m;

    /* renamed from: n, reason: collision with root package name */
    public long f19626n;

    /* renamed from: p, reason: collision with root package name */
    public long f19627p;

    /* renamed from: q, reason: collision with root package name */
    public long f19628q;

    /* renamed from: r, reason: collision with root package name */
    public long f19629r;

    /* renamed from: s, reason: collision with root package name */
    public final Settings f19630s;

    /* renamed from: t, reason: collision with root package name */
    public Settings f19631t;

    /* renamed from: v, reason: collision with root package name */
    public long f19632v;

    /* renamed from: w, reason: collision with root package name */
    public long f19633w;

    /* renamed from: x, reason: collision with root package name */
    public long f19634x;

    /* renamed from: y, reason: collision with root package name */
    public long f19635y;

    /* renamed from: z, reason: collision with root package name */
    public final Socket f19636z;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final TaskRunner f19665a;

        /* renamed from: b, reason: collision with root package name */
        public Socket f19666b;

        /* renamed from: c, reason: collision with root package name */
        public String f19667c;

        /* renamed from: d, reason: collision with root package name */
        public f0 f19668d;

        /* renamed from: e, reason: collision with root package name */
        public d0 f19669e;

        /* renamed from: f, reason: collision with root package name */
        public Listener f19670f;

        /* renamed from: g, reason: collision with root package name */
        public final PushObserver f19671g;

        public Builder(TaskRunner taskRunner) {
            r.e(taskRunner, "taskRunner");
            this.f19665a = taskRunner;
            this.f19670f = Listener.f19672a;
            this.f19671g = PushObserver.f19733a;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public static abstract class Listener {

        /* renamed from: a, reason: collision with root package name */
        public static final Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1 f19672a;

        public static final class Companion {
            public /* synthetic */ Companion(int i10) {
                this();
            }

            private Companion() {
            }
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [okhttp3.internal.http2.Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1] */
        static {
            new Companion(0);
            f19672a = new Listener() { // from class: okhttp3.internal.http2.Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1
                @Override // okhttp3.internal.http2.Http2Connection.Listener
                public final void b(Http2Stream http2Stream) throws IOException {
                    http2Stream.c(ErrorCode.REFUSED_STREAM, null);
                }
            };
        }

        public void a(Http2Connection http2Connection, Settings settings) {
            r.e(settings, "settings");
        }

        public abstract void b(Http2Stream http2Stream) throws IOException;
    }

    public final class ReaderRunnable implements Http2Reader.Handler, a<pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final Http2Reader f19673a;

        public ReaderRunnable(Http2Reader http2Reader) {
            this.f19673a = http2Reader;
        }

        /* JADX WARN: Code restructure failed: missing block: B:53:0x00e6, code lost:
        
            if (r18 == false) goto L64;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00e8, code lost:
        
            r2.i(okhttp3.internal.Util.f19394b, true);
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x00ed, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void a(final boolean z10, final int i10, i source, final int i11) throws IOException {
            boolean z11;
            long j10;
            boolean z12;
            r.e(source, "source");
            final Http2Connection http2Connection = Http2Connection.this;
            Companion companion = Http2Connection.D;
            long j11 = 0;
            if (i10 != 0 && (i10 & 1) == 0) {
                final g gVar = new g();
                long j12 = i11;
                source.u0(j12);
                source.y(j12, gVar);
                TaskQueue taskQueue = http2Connection.f19622j;
                final String str = http2Connection.f19616c + '[' + i10 + "] onData";
                taskQueue.c(new Task(str, http2Connection, i10, gVar, i11, z10) { // from class: okhttp3.internal.http2.Http2Connection$pushDataLater$$inlined$execute$default$1

                    /* renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ Http2Connection f19646e;

                    /* renamed from: f, reason: collision with root package name */
                    public final /* synthetic */ int f19647f;

                    /* renamed from: g, reason: collision with root package name */
                    public final /* synthetic */ g f19648g;

                    /* renamed from: h, reason: collision with root package name */
                    public final /* synthetic */ int f19649h;

                    @Override // okhttp3.internal.concurrent.Task
                    public final long a() {
                        try {
                            PushObserver pushObserver = this.f19646e.f19624l;
                            g gVar2 = this.f19648g;
                            int i12 = this.f19649h;
                            ((PushObserver.Companion.PushObserverCancel) pushObserver).getClass();
                            gVar2.skip(i12);
                            this.f19646e.A.N(this.f19647f, ErrorCode.CANCEL);
                            synchronized (this.f19646e) {
                                this.f19646e.C.remove(Integer.valueOf(this.f19647f));
                            }
                            return -1L;
                        } catch (IOException unused) {
                            return -1L;
                        }
                    }
                }, 0L);
                return;
            }
            Http2Stream http2StreamP = http2Connection.p(i10);
            if (http2StreamP != null) {
                byte[] bArr = Util.f19393a;
                Http2Stream.FramingSource framingSource = http2StreamP.f19703i;
                long j13 = i11;
                framingSource.getClass();
                long j14 = j13;
                while (true) {
                    boolean z13 = true;
                    if (j14 <= j11) {
                        Http2Stream http2Stream = Http2Stream.this;
                        byte[] bArr2 = Util.f19393a;
                        http2Stream.f19696b.M(j13);
                        break;
                    }
                    synchronized (Http2Stream.this) {
                        z11 = framingSource.f19714b;
                        j10 = j11;
                        z12 = framingSource.f19716d.f13061b + j14 > framingSource.f19713a;
                        pg.f0 f0Var = pg.f0.f21461a;
                    }
                    if (z12) {
                        source.skip(j14);
                        Http2Stream.this.e(ErrorCode.FLOW_CONTROL_ERROR);
                        break;
                    }
                    if (z11) {
                        source.skip(j14);
                        break;
                    }
                    long jY = source.y(j14, framingSource.f19715c);
                    if (jY == -1) {
                        throw new EOFException();
                    }
                    j14 -= jY;
                    Http2Stream http2Stream2 = Http2Stream.this;
                    synchronized (http2Stream2) {
                        try {
                            if (framingSource.f19717e) {
                                g gVar2 = framingSource.f19715c;
                                gVar2.skip(gVar2.f13061b);
                            } else {
                                g gVar3 = framingSource.f19716d;
                                if (gVar3.f13061b != j10) {
                                    z13 = false;
                                }
                                gVar3.l0(framingSource.f19715c);
                                if (z13) {
                                    http2Stream2.notifyAll();
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    j11 = j10;
                }
            } else {
                Http2Connection.this.Z(i10, ErrorCode.PROTOCOL_ERROR);
                long j15 = i11;
                Http2Connection.this.M(j15);
                source.skip(j15);
            }
        }

        public final void c(final int i10, final List list, final boolean z10) {
            final Http2Connection http2Connection = Http2Connection.this;
            Companion companion = Http2Connection.D;
            if (i10 != 0 && (i10 & 1) == 0) {
                TaskQueue taskQueue = http2Connection.f19622j;
                final String str = http2Connection.f19616c + '[' + i10 + "] onHeaders";
                taskQueue.c(new Task(str, http2Connection, i10, list, z10) { // from class: okhttp3.internal.http2.Http2Connection$pushHeadersLater$$inlined$execute$default$1

                    /* renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ Http2Connection f19650e;

                    /* renamed from: f, reason: collision with root package name */
                    public final /* synthetic */ int f19651f;

                    /* renamed from: g, reason: collision with root package name */
                    public final /* synthetic */ List f19652g;

                    @Override // okhttp3.internal.concurrent.Task
                    public final long a() {
                        ((PushObserver.Companion.PushObserverCancel) this.f19650e.f19624l).getClass();
                        try {
                            this.f19650e.A.N(this.f19651f, ErrorCode.CANCEL);
                            synchronized (this.f19650e) {
                                this.f19650e.C.remove(Integer.valueOf(this.f19651f));
                            }
                            return -1L;
                        } catch (IOException unused) {
                            return -1L;
                        }
                    }
                }, 0L);
                return;
            }
            synchronized (http2Connection) {
                Http2Stream http2StreamP = http2Connection.p(i10);
                if (http2StreamP != null) {
                    pg.f0 f0Var = pg.f0.f21461a;
                    http2StreamP.i(Util.v(list), z10);
                    return;
                }
                if (http2Connection.f19619f) {
                    return;
                }
                if (i10 <= http2Connection.f19617d) {
                    return;
                }
                if (i10 % 2 == http2Connection.f19618e % 2) {
                    return;
                }
                final Http2Stream http2Stream = new Http2Stream(i10, http2Connection, false, z10, Util.v(list));
                http2Connection.f19617d = i10;
                http2Connection.f19615b.put(Integer.valueOf(i10), http2Stream);
                TaskQueue taskQueueE = http2Connection.f19620g.e();
                final String str2 = http2Connection.f19616c + '[' + i10 + "] onStream";
                taskQueueE.c(new Task(str2) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$headers$lambda$2$$inlined$execute$default$1
                    @Override // okhttp3.internal.concurrent.Task
                    public final long a() {
                        try {
                            http2Connection.f19614a.b(http2Stream);
                            return -1L;
                        } catch (IOException e10) {
                            Platform.f19768a.getClass();
                            Platform platform = Platform.f19769b;
                            String str3 = "Http2Connection.Listener failure for " + http2Connection.f19616c;
                            platform.getClass();
                            Platform.i(str3, 4, e10);
                            try {
                                http2Stream.c(ErrorCode.PROTOCOL_ERROR, e10);
                                return -1L;
                            } catch (IOException unused) {
                                return -1L;
                            }
                        }
                    }
                }, 0L);
            }
        }

        public final void e(final int i10, final List list) {
            final Http2Connection http2Connection = Http2Connection.this;
            synchronized (http2Connection) {
                if (http2Connection.C.contains(Integer.valueOf(i10))) {
                    http2Connection.Z(i10, ErrorCode.PROTOCOL_ERROR);
                    return;
                }
                http2Connection.C.add(Integer.valueOf(i10));
                TaskQueue taskQueue = http2Connection.f19622j;
                final String str = http2Connection.f19616c + '[' + i10 + "] onRequest";
                taskQueue.c(new Task(str) { // from class: okhttp3.internal.http2.Http2Connection$pushRequestLater$$inlined$execute$default$1
                    @Override // okhttp3.internal.concurrent.Task
                    public final long a() {
                        ((PushObserver.Companion.PushObserverCancel) http2Connection.f19624l).getClass();
                        try {
                            http2Connection.A.N(i10, ErrorCode.CANCEL);
                            synchronized (http2Connection) {
                                http2Connection.C.remove(Integer.valueOf(i10));
                            }
                            return -1L;
                        } catch (IOException unused) {
                            return -1L;
                        }
                    }
                }, 0L);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [okhttp3.internal.http2.Http2Connection] */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v14 */
        /* JADX WARN: Type inference failed for: r3v15 */
        /* JADX WARN: Type inference failed for: r3v4 */
        /* JADX WARN: Type inference failed for: r3v5, types: [okhttp3.internal.http2.ErrorCode] */
        /* JADX WARN: Type inference failed for: r3v6 */
        /* JADX WARN: Type inference failed for: r3v8 */
        @Override // eh.a
        public final pg.f0 invoke() throws Throwable {
            Throwable th2;
            ErrorCode errorCode;
            ?? r02 = Http2Connection.this;
            Http2Reader http2Reader = this.f19673a;
            ErrorCode errorCode2 = ErrorCode.INTERNAL_ERROR;
            ?? r32 = 1;
            IOException e10 = null;
            try {
                try {
                    try {
                    } catch (Throwable th3) {
                        th2 = th3;
                        r02.h(r32, errorCode2, e10);
                        Util.c(http2Reader);
                        throw th2;
                    }
                } catch (IOException e11) {
                    e10 = e11;
                    errorCode = errorCode2;
                }
                if (!http2Reader.h(true, this)) {
                    throw new IOException("Required SETTINGS preface not received");
                }
                do {
                    try {
                    } catch (Throwable th4) {
                        th2 = th4;
                        r32 = errorCode2;
                        r02.h(r32, errorCode2, e10);
                        Util.c(http2Reader);
                        throw th2;
                    }
                } while (http2Reader.h(false, this));
                errorCode = ErrorCode.NO_ERROR;
                try {
                    errorCode2 = ErrorCode.CANCEL;
                    r02.h(errorCode, errorCode2, null);
                    r32 = errorCode;
                } catch (IOException e12) {
                    e10 = e12;
                    errorCode2 = ErrorCode.PROTOCOL_ERROR;
                    r02.h(errorCode2, errorCode2, e10);
                    r32 = errorCode;
                    Util.c(http2Reader);
                    return pg.f0.f21461a;
                }
                Util.c(http2Reader);
                return pg.f0.f21461a;
            } catch (Throwable th5) {
                th2 = th5;
            }
        }
    }

    static {
        Settings settings = new Settings();
        settings.c(7, 65535);
        settings.c(5, 16384);
        E = settings;
    }

    public Http2Connection(Builder builder) {
        this.f19614a = builder.f19670f;
        String str = builder.f19667c;
        if (str == null) {
            r.h("connectionName");
            throw null;
        }
        this.f19616c = str;
        this.f19618e = 3;
        TaskRunner taskRunner = builder.f19665a;
        this.f19620g = taskRunner;
        this.f19621h = taskRunner.e();
        this.f19622j = taskRunner.e();
        this.f19623k = taskRunner.e();
        this.f19624l = builder.f19671g;
        Settings settings = new Settings();
        settings.c(7, 16777216);
        this.f19630s = settings;
        this.f19631t = E;
        this.f19635y = r0.a();
        Socket socket = builder.f19666b;
        if (socket == null) {
            r.h("socket");
            throw null;
        }
        this.f19636z = socket;
        d0 d0Var = builder.f19669e;
        if (d0Var == null) {
            r.h("sink");
            throw null;
        }
        this.A = new Http2Writer(d0Var);
        f0 f0Var = builder.f19668d;
        if (f0Var == null) {
            r.h("source");
            throw null;
        }
        this.B = new ReaderRunnable(new Http2Reader(f0Var));
        this.C = new LinkedHashSet();
    }

    public final void E(ErrorCode errorCode) throws IOException {
        synchronized (this.A) {
            e0 e0Var = new e0();
            synchronized (this) {
                if (this.f19619f) {
                    return;
                }
                this.f19619f = true;
                int i10 = this.f19617d;
                e0Var.f16324a = i10;
                pg.f0 f0Var = pg.f0.f21461a;
                this.A.z(i10, errorCode, Util.f19393a);
            }
        }
    }

    public final synchronized void M(long j10) {
        long j11 = this.f19632v + j10;
        this.f19632v = j11;
        long j12 = j11 - this.f19633w;
        if (j12 >= this.f19630s.a() / 2) {
            d0(0, j12);
            this.f19633w += j12;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.A.f19723c);
        r6 = r2;
        r8.f19634x += r6;
        r4 = pg.f0.f21461a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N(int i10, boolean z10, g gVar, long j10) throws IOException {
        int iMin;
        long j11;
        if (j10 == 0) {
            this.A.l(z10, i10, gVar, 0);
            return;
        }
        while (j10 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j12 = this.f19634x;
                            long j13 = this.f19635y;
                            if (j12 < j13) {
                                break;
                            } else {
                                if (!this.f19615b.containsKey(Integer.valueOf(i10))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            j10 -= j11;
            this.A.l(z10 && j10 == 0, i10, gVar, iMin);
        }
    }

    public final void Z(final int i10, final ErrorCode errorCode) {
        final String str = this.f19616c + '[' + i10 + "] writeSynReset";
        this.f19621h.c(new Task(str) { // from class: okhttp3.internal.http2.Http2Connection$writeSynResetLater$$inlined$execute$default$1
            @Override // okhttp3.internal.concurrent.Task
            public final long a() throws IOException {
                Http2Connection http2Connection = this;
                try {
                    http2Connection.A.N(i10, errorCode);
                    return -1L;
                } catch (IOException e10) {
                    Http2Connection.Companion companion = Http2Connection.D;
                    http2Connection.l(e10);
                    return -1L;
                }
            }
        }, 0L);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        h(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
    }

    public final void d0(final int i10, final long j10) {
        final String str = this.f19616c + '[' + i10 + "] windowUpdate";
        this.f19621h.c(new Task(str) { // from class: okhttp3.internal.http2.Http2Connection$writeWindowUpdateLater$$inlined$execute$default$1
            @Override // okhttp3.internal.concurrent.Task
            public final long a() throws IOException {
                Http2Connection http2Connection = this;
                try {
                    http2Connection.A.Z(i10, j10);
                    return -1L;
                } catch (IOException e10) {
                    Http2Connection.Companion companion = Http2Connection.D;
                    http2Connection.l(e10);
                    return -1L;
                }
            }
        }, 0L);
    }

    public final void flush() throws IOException {
        this.A.flush();
    }

    public final void h(ErrorCode errorCode, ErrorCode errorCode2, IOException iOException) throws IOException {
        int i10;
        Object[] array;
        byte[] bArr = Util.f19393a;
        try {
            E(errorCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (this.f19615b.isEmpty()) {
                    array = null;
                } else {
                    array = this.f19615b.values().toArray(new Http2Stream[0]);
                    this.f19615b.clear();
                }
                pg.f0 f0Var = pg.f0.f21461a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Http2Stream[] http2StreamArr = (Http2Stream[]) array;
        if (http2StreamArr != null) {
            for (Http2Stream http2Stream : http2StreamArr) {
                try {
                    http2Stream.c(errorCode2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.A.close();
        } catch (IOException unused3) {
        }
        try {
            this.f19636z.close();
        } catch (IOException unused4) {
        }
        this.f19621h.f();
        this.f19622j.f();
        this.f19623k.f();
    }

    public final void l(IOException iOException) throws IOException {
        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
        h(errorCode, errorCode, iOException);
    }

    public final synchronized Http2Stream p(int i10) {
        return (Http2Stream) this.f19615b.get(Integer.valueOf(i10));
    }

    public final synchronized Http2Stream z(int i10) {
        Http2Stream http2Stream;
        http2Stream = (Http2Stream) this.f19615b.remove(Integer.valueOf(i10));
        notifyAll();
        return http2Stream;
    }
}
