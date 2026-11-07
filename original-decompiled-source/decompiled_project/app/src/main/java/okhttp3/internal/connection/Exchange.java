package okhttp3.internal.connection;

import h1.y;
import hi.g;
import hi.j0;
import hi.l0;
import hi.o;
import hi.p;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.r;
import okhttp3.EventListener;
import okhttp3.EventListener$Companion$NONE$1;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;

/* loaded from: classes2.dex */
public final class Exchange {

    /* renamed from: a, reason: collision with root package name */
    public final RealCall f19437a;

    /* renamed from: b, reason: collision with root package name */
    public final EventListener f19438b;

    /* renamed from: c, reason: collision with root package name */
    public final ExchangeFinder f19439c;

    /* renamed from: d, reason: collision with root package name */
    public final ExchangeCodec f19440d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f19441e;

    /* renamed from: f, reason: collision with root package name */
    public final RealConnection f19442f;

    public final class RequestBodySink extends o {

        /* renamed from: b, reason: collision with root package name */
        public final long f19443b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f19444c;

        /* renamed from: d, reason: collision with root package name */
        public long f19445d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f19446e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Exchange f19447f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequestBodySink(Exchange exchange, j0 delegate, long j10) {
            super(delegate);
            r.e(delegate, "delegate");
            this.f19447f = exchange;
            this.f19443b = j10;
        }

        @Override // hi.o, hi.j0, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.f19446e) {
                return;
            }
            this.f19446e = true;
            long j10 = this.f19443b;
            if (j10 != -1 && this.f19445d != j10) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                h(null);
            } catch (IOException e10) {
                throw h(e10);
            }
        }

        @Override // hi.o, hi.j0, java.io.Flushable
        public final void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e10) {
                throw h(e10);
            }
        }

        public final <E extends IOException> E h(E e10) {
            if (this.f19444c) {
                return e10;
            }
            this.f19444c = true;
            return (E) this.f19447f.a(false, true, e10);
        }

        @Override // hi.o, hi.j0
        public final void j(long j10, g source) throws IOException {
            r.e(source, "source");
            if (this.f19446e) {
                throw new IllegalStateException("closed");
            }
            long j11 = this.f19443b;
            if (j11 != -1 && this.f19445d + j10 > j11) {
                StringBuilder sbA = y.a("expected ", " bytes but received ", j11);
                sbA.append(this.f19445d + j10);
                throw new ProtocolException(sbA.toString());
            }
            try {
                super.j(j10, source);
                this.f19445d += j10;
            } catch (IOException e10) {
                throw h(e10);
            }
        }
    }

    public final class ResponseBodySource extends p {

        /* renamed from: b, reason: collision with root package name */
        public final long f19448b;

        /* renamed from: c, reason: collision with root package name */
        public long f19449c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f19450d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f19451e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f19452f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Exchange f19453g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResponseBodySource(Exchange exchange, l0 delegate, long j10) {
            super(delegate);
            r.e(delegate, "delegate");
            this.f19453g = exchange;
            this.f19448b = j10;
            this.f19450d = true;
            if (j10 == 0) {
                h(null);
            }
        }

        @Override // hi.p, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.f19452f) {
                return;
            }
            this.f19452f = true;
            try {
                super.close();
                h(null);
            } catch (IOException e10) {
                throw h(e10);
            }
        }

        public final <E extends IOException> E h(E e10) {
            if (this.f19451e) {
                return e10;
            }
            this.f19451e = true;
            Exchange exchange = this.f19453g;
            if (e10 == null && this.f19450d) {
                this.f19450d = false;
                exchange.f19438b.getClass();
                EventListener$Companion$NONE$1 eventListener$Companion$NONE$1 = EventListener.f19241a;
            }
            return (E) exchange.a(true, false, e10);
        }

        @Override // hi.p, hi.l0
        public final long y(long j10, g sink) throws IOException {
            r.e(sink, "sink");
            if (this.f19452f) {
                throw new IllegalStateException("closed");
            }
            try {
                long jY = this.f13105a.y(j10, sink);
                if (this.f19450d) {
                    this.f19450d = false;
                    this.f19453g.f19438b.getClass();
                    EventListener$Companion$NONE$1 eventListener$Companion$NONE$1 = EventListener.f19241a;
                }
                if (jY == -1) {
                    h(null);
                    return -1L;
                }
                long j11 = this.f19449c + jY;
                long j12 = this.f19448b;
                if (j12 == -1 || j11 <= j12) {
                    this.f19449c = j11;
                    if (j11 == j12) {
                        h(null);
                    }
                    return jY;
                }
                throw new ProtocolException("expected " + j12 + " bytes but received " + j11);
            } catch (IOException e10) {
                throw h(e10);
            }
        }
    }

    public Exchange(RealCall realCall, EventListener eventListener, ExchangeFinder finder, ExchangeCodec exchangeCodec) {
        r.e(eventListener, "eventListener");
        r.e(finder, "finder");
        this.f19437a = realCall;
        this.f19438b = eventListener;
        this.f19439c = finder;
        this.f19440d = exchangeCodec;
        this.f19442f = exchangeCodec.e();
    }

    public final IOException a(boolean z10, boolean z11, IOException iOException) {
        if (iOException != null) {
            d(iOException);
        }
        EventListener eventListener = this.f19438b;
        if (z11) {
            if (iOException != null) {
                eventListener.getClass();
            } else {
                eventListener.getClass();
            }
        }
        if (z10) {
            if (iOException != null) {
                eventListener.getClass();
            } else {
                eventListener.getClass();
            }
        }
        return this.f19437a.h(this, z11, z10, iOException);
    }

    public final j0 b(Request request) throws IOException {
        r.e(request, "request");
        RequestBody requestBody = request.f19340d;
        r.b(requestBody);
        long jA = requestBody.a();
        this.f19438b.getClass();
        return new RequestBodySink(this, this.f19440d.h(request, jA), jA);
    }

    public final Response.Builder c(boolean z10) throws IOException {
        try {
            Response.Builder builderD = this.f19440d.d(z10);
            if (builderD == null) {
                return builderD;
            }
            builderD.f19378m = this;
            return builderD;
        } catch (IOException e10) {
            this.f19438b.getClass();
            d(e10);
            throw e10;
        }
    }

    public final void d(IOException iOException) {
        this.f19441e = true;
        this.f19439c.c(iOException);
        RealConnection realConnectionE = this.f19440d.e();
        RealCall realCall = this.f19437a;
        synchronized (realConnectionE) {
            try {
                if (!(iOException instanceof StreamResetException)) {
                    if (!(realConnectionE.f19490g != null) || (iOException instanceof ConnectionShutdownException)) {
                        realConnectionE.f19493j = true;
                        if (realConnectionE.f19496m == 0) {
                            RealConnection.d(realCall.f19464a, realConnectionE.f19485b, iOException);
                            realConnectionE.f19495l++;
                        }
                    }
                } else if (((StreamResetException) iOException).f19737a == ErrorCode.REFUSED_STREAM) {
                    int i10 = realConnectionE.f19497n + 1;
                    realConnectionE.f19497n = i10;
                    if (i10 > 1) {
                        realConnectionE.f19493j = true;
                        realConnectionE.f19495l++;
                    }
                } else if (((StreamResetException) iOException).f19737a != ErrorCode.CANCEL || !realCall.f19477p) {
                    realConnectionE.f19493j = true;
                    realConnectionE.f19495l++;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
