package okhttp3.internal.http2;

import b.o;
import hi.c;
import hi.g;
import hi.j0;
import hi.l0;
import hi.m0;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import kotlin.jvm.internal.r;
import okhttp3.Headers;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import pg.f0;

/* loaded from: classes2.dex */
public final class Http2Stream {

    /* renamed from: a, reason: collision with root package name */
    public final int f19695a;

    /* renamed from: b, reason: collision with root package name */
    public final Http2Connection f19696b;

    /* renamed from: c, reason: collision with root package name */
    public long f19697c;

    /* renamed from: d, reason: collision with root package name */
    public long f19698d;

    /* renamed from: e, reason: collision with root package name */
    public long f19699e;

    /* renamed from: f, reason: collision with root package name */
    public long f19700f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque<Headers> f19701g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f19702h;

    /* renamed from: i, reason: collision with root package name */
    public final FramingSource f19703i;

    /* renamed from: j, reason: collision with root package name */
    public final FramingSink f19704j;

    /* renamed from: k, reason: collision with root package name */
    public final StreamTimeout f19705k;

    /* renamed from: l, reason: collision with root package name */
    public final StreamTimeout f19706l;

    /* renamed from: m, reason: collision with root package name */
    public ErrorCode f19707m;

    /* renamed from: n, reason: collision with root package name */
    public IOException f19708n;

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public final class FramingSink implements j0 {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f19709a;

        /* renamed from: b, reason: collision with root package name */
        public final g f19710b = new g();

        /* renamed from: c, reason: collision with root package name */
        public boolean f19711c;

        public FramingSink(boolean z10) {
            this.f19709a = z10;
        }

        @Override // hi.j0
        public final m0 b() {
            return Http2Stream.this.f19706l;
        }

        @Override // hi.j0, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            boolean z10;
            Http2Stream http2Stream = Http2Stream.this;
            byte[] bArr = Util.f19393a;
            synchronized (http2Stream) {
                if (this.f19711c) {
                    return;
                }
                synchronized (http2Stream) {
                    z10 = http2Stream.f19707m == null;
                    f0 f0Var = f0.f21461a;
                }
                Http2Stream http2Stream2 = Http2Stream.this;
                if (!http2Stream2.f19704j.f19709a) {
                    if (this.f19710b.f13061b > 0) {
                        while (this.f19710b.f13061b > 0) {
                            h(true);
                        }
                    } else if (z10) {
                        http2Stream2.f19696b.N(http2Stream2.f19695a, true, null, 0L);
                    }
                }
                synchronized (Http2Stream.this) {
                    this.f19711c = true;
                    f0 f0Var2 = f0.f21461a;
                }
                Http2Stream.this.f19696b.flush();
                Http2Stream.this.a();
            }
        }

        @Override // hi.j0, java.io.Flushable
        public final void flush() throws IOException {
            Http2Stream http2Stream = Http2Stream.this;
            byte[] bArr = Util.f19393a;
            synchronized (http2Stream) {
                http2Stream.b();
                f0 f0Var = f0.f21461a;
            }
            while (this.f19710b.f13061b > 0) {
                h(false);
                Http2Stream.this.f19696b.flush();
            }
        }

        /* JADX WARN: Finally extract failed */
        public final void h(boolean z10) throws IOException {
            long jMin;
            boolean z11;
            Http2Stream http2Stream = Http2Stream.this;
            synchronized (http2Stream) {
                try {
                    http2Stream.f19706l.h();
                    while (http2Stream.f19699e >= http2Stream.f19700f && !this.f19709a && !this.f19711c) {
                        try {
                            synchronized (http2Stream) {
                                ErrorCode errorCode = http2Stream.f19707m;
                                if (errorCode != null) {
                                    break;
                                }
                                try {
                                    http2Stream.wait();
                                } catch (InterruptedException unused) {
                                    Thread.currentThread().interrupt();
                                    throw new InterruptedIOException();
                                }
                            }
                        } catch (Throwable th2) {
                            http2Stream.f19706l.k();
                            throw th2;
                        }
                    }
                    http2Stream.f19706l.k();
                    http2Stream.b();
                    jMin = Math.min(http2Stream.f19700f - http2Stream.f19699e, this.f19710b.f13061b);
                    http2Stream.f19699e += jMin;
                    z11 = z10 && jMin == this.f19710b.f13061b;
                    f0 f0Var = f0.f21461a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            Http2Stream.this.f19706l.h();
            try {
                Http2Stream http2Stream2 = Http2Stream.this;
                http2Stream2.f19696b.N(http2Stream2.f19695a, z11, this.f19710b, jMin);
            } finally {
                Http2Stream.this.f19706l.k();
            }
        }

        @Override // hi.j0
        public final void j(long j10, g source) throws IOException {
            r.e(source, "source");
            byte[] bArr = Util.f19393a;
            g gVar = this.f19710b;
            gVar.j(j10, source);
            while (gVar.f13061b >= 16384) {
                h(false);
            }
        }
    }

    public final class FramingSource implements l0 {

        /* renamed from: a, reason: collision with root package name */
        public final long f19713a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f19714b;

        /* renamed from: c, reason: collision with root package name */
        public final g f19715c = new g();

        /* renamed from: d, reason: collision with root package name */
        public final g f19716d = new g();

        /* renamed from: e, reason: collision with root package name */
        public boolean f19717e;

        public FramingSource(long j10, boolean z10) {
            this.f19713a = j10;
            this.f19714b = z10;
        }

        @Override // hi.l0
        public final m0 b() {
            return Http2Stream.this.f19705k;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            long j10;
            Http2Stream http2Stream = Http2Stream.this;
            synchronized (http2Stream) {
                this.f19717e = true;
                g gVar = this.f19716d;
                j10 = gVar.f13061b;
                gVar.skip(j10);
                http2Stream.notifyAll();
                f0 f0Var = f0.f21461a;
            }
            if (j10 > 0) {
                Http2Stream http2Stream2 = Http2Stream.this;
                byte[] bArr = Util.f19393a;
                http2Stream2.f19696b.M(j10);
            }
            Http2Stream.this.a();
        }

        /* JADX WARN: Removed duplicated region for block: B:47:0x0097 A[LOOP:0: B:4:0x000e->B:47:0x0097, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:76:0x009b A[SYNTHETIC] */
        @Override // hi.l0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final long y(long j10, g sink) throws Throwable {
            ErrorCode errorCode;
            Throwable streamResetException;
            boolean z10;
            long jY;
            r.e(sink, "sink");
            long j11 = 0;
            if (j10 < 0) {
                throw new IllegalArgumentException(m0.r.a("byteCount < 0: ", j10).toString());
            }
            while (true) {
                Http2Stream http2Stream = Http2Stream.this;
                synchronized (http2Stream) {
                    http2Stream.f19705k.h();
                    try {
                        synchronized (http2Stream) {
                            errorCode = http2Stream.f19707m;
                        }
                        if (z10) {
                            if (jY != -1) {
                                return jY;
                            }
                            if (streamResetException == null) {
                                return -1L;
                            }
                            throw streamResetException;
                        }
                        j11 = 0;
                    } catch (Throwable th2) {
                        http2Stream.f19705k.k();
                        throw th2;
                    }
                }
                if (errorCode != null && !this.f19714b) {
                    streamResetException = http2Stream.f19708n;
                    if (streamResetException == null) {
                        synchronized (http2Stream) {
                            ErrorCode errorCode2 = http2Stream.f19707m;
                            r.b(errorCode2);
                            streamResetException = new StreamResetException(errorCode2);
                        }
                    }
                }
                streamResetException = null;
                if (this.f19717e) {
                    throw new IOException("stream closed");
                }
                g gVar = this.f19716d;
                long j12 = gVar.f13061b;
                z10 = false;
                if (j12 > j11) {
                    jY = gVar.y(Math.min(j10, j12), sink);
                    long j13 = http2Stream.f19697c + jY;
                    http2Stream.f19697c = j13;
                    long j14 = j13 - http2Stream.f19698d;
                    if (streamResetException == null && j14 >= http2Stream.f19696b.f19630s.a() / 2) {
                        http2Stream.f19696b.d0(http2Stream.f19695a, j14);
                        http2Stream.f19698d = http2Stream.f19697c;
                    }
                } else {
                    if (!this.f19714b && streamResetException == null) {
                        try {
                            http2Stream.wait();
                            z10 = true;
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    }
                    jY = -1;
                }
                http2Stream.f19705k.k();
                f0 f0Var = f0.f21461a;
                if (z10) {
                }
            }
        }
    }

    public final class StreamTimeout extends c {
        public StreamTimeout() {
        }

        @Override // hi.c
        public final void j() {
            Http2Stream.this.e(ErrorCode.CANCEL);
            final Http2Connection http2Connection = Http2Stream.this.f19696b;
            synchronized (http2Connection) {
                long j10 = http2Connection.f19628q;
                long j11 = http2Connection.f19627p;
                if (j10 < j11) {
                    return;
                }
                http2Connection.f19627p = j11 + 1;
                http2Connection.f19629r = System.nanoTime() + 1000000000;
                f0 f0Var = f0.f21461a;
                TaskQueue taskQueue = http2Connection.f19621h;
                final String strA = o.a(new StringBuilder(), http2Connection.f19616c, " ping");
                taskQueue.c(new Task(strA) { // from class: okhttp3.internal.http2.Http2Connection$sendDegradedPingLater$$inlined$execute$default$1
                    @Override // okhttp3.internal.concurrent.Task
                    public final long a() throws IOException {
                        Http2Connection http2Connection2 = http2Connection;
                        http2Connection2.getClass();
                        try {
                            http2Connection2.A.M(2, 0, false);
                            return -1L;
                        } catch (IOException e10) {
                            http2Connection2.l(e10);
                            return -1L;
                        }
                    }
                }, 0L);
            }
        }

        public final void k() throws IOException {
            if (i()) {
                throw new SocketTimeoutException("timeout");
            }
        }
    }

    static {
        new Companion(0);
    }

    public Http2Stream(int i10, Http2Connection connection, boolean z10, boolean z11, Headers headers) {
        r.e(connection, "connection");
        this.f19695a = i10;
        this.f19696b = connection;
        this.f19700f = connection.f19631t.a();
        ArrayDeque<Headers> arrayDeque = new ArrayDeque<>();
        this.f19701g = arrayDeque;
        this.f19703i = new FramingSource(connection.f19630s.a(), z11);
        this.f19704j = new FramingSink(z10);
        this.f19705k = new StreamTimeout();
        this.f19706l = new StreamTimeout();
        if (headers == null) {
            if (!g()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (g()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(headers);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() throws IOException {
        boolean z10;
        boolean zH;
        byte[] bArr = Util.f19393a;
        synchronized (this) {
            try {
                FramingSource framingSource = this.f19703i;
                if (framingSource.f19714b || !framingSource.f19717e) {
                    z10 = false;
                } else {
                    FramingSink framingSink = this.f19704j;
                    if (framingSink.f19709a || framingSink.f19711c) {
                        z10 = true;
                    }
                }
                zH = h();
                f0 f0Var = f0.f21461a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            c(ErrorCode.CANCEL, null);
        } else {
            if (zH) {
                return;
            }
            this.f19696b.z(this.f19695a);
        }
    }

    public final void b() throws IOException {
        FramingSink framingSink = this.f19704j;
        if (framingSink.f19711c) {
            throw new IOException("stream closed");
        }
        if (framingSink.f19709a) {
            throw new IOException("stream finished");
        }
        if (this.f19707m != null) {
            IOException iOException = this.f19708n;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCode = this.f19707m;
            r.b(errorCode);
            throw new StreamResetException(errorCode);
        }
    }

    public final void c(ErrorCode errorCode, IOException iOException) throws IOException {
        if (d(errorCode, iOException)) {
            this.f19696b.A.N(this.f19695a, errorCode);
        }
    }

    public final boolean d(ErrorCode errorCode, IOException iOException) {
        byte[] bArr = Util.f19393a;
        synchronized (this) {
            if (this.f19707m != null) {
                return false;
            }
            this.f19707m = errorCode;
            this.f19708n = iOException;
            notifyAll();
            if (this.f19703i.f19714b && this.f19704j.f19709a) {
                return false;
            }
            f0 f0Var = f0.f21461a;
            this.f19696b.z(this.f19695a);
            return true;
        }
    }

    public final void e(ErrorCode errorCode) {
        if (d(errorCode, null)) {
            this.f19696b.Z(this.f19695a, errorCode);
        }
    }

    public final FramingSink f() {
        synchronized (this) {
            try {
                if (!this.f19702h && !g()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
                f0 f0Var = f0.f21461a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.f19704j;
    }

    public final boolean g() {
        boolean z10 = (this.f19695a & 1) == 1;
        this.f19696b.getClass();
        return true == z10;
    }

    public final synchronized boolean h() {
        try {
            if (this.f19707m != null) {
                return false;
            }
            FramingSource framingSource = this.f19703i;
            if (framingSource.f19714b || framingSource.f19717e) {
                FramingSink framingSink = this.f19704j;
                if (framingSink.f19709a || framingSink.f19711c) {
                    if (this.f19702h) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void i(Headers headers, boolean z10) {
        boolean zH;
        r.e(headers, "headers");
        byte[] bArr = Util.f19393a;
        synchronized (this) {
            try {
                if (this.f19702h && z10) {
                    this.f19703i.getClass();
                } else {
                    this.f19702h = true;
                    this.f19701g.add(headers);
                }
                if (z10) {
                    this.f19703i.f19714b = true;
                }
                zH = h();
                notifyAll();
                f0 f0Var = f0.f21461a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (zH) {
            return;
        }
        this.f19696b.z(this.f19695a);
    }

    public final synchronized void j(ErrorCode errorCode) {
        if (this.f19707m == null) {
            this.f19707m = errorCode;
            notifyAll();
        }
    }
}
