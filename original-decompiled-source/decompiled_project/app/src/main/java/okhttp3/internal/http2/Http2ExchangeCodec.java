package okhttp3.internal.http2;

import hi.j;
import hi.j0;
import hi.l0;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.r;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.http2.Http2Stream;
import pg.f0;

/* loaded from: classes2.dex */
public final class Http2ExchangeCodec implements ExchangeCodec {

    /* renamed from: g, reason: collision with root package name */
    public static final Companion f19675g = new Companion(0);

    /* renamed from: h, reason: collision with root package name */
    public static final List<String> f19676h = Util.k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: i, reason: collision with root package name */
    public static final List<String> f19677i = Util.k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a, reason: collision with root package name */
    public final RealConnection f19678a;

    /* renamed from: b, reason: collision with root package name */
    public final RealInterceptorChain f19679b;

    /* renamed from: c, reason: collision with root package name */
    public final Http2Connection f19680c;

    /* renamed from: d, reason: collision with root package name */
    public volatile Http2Stream f19681d;

    /* renamed from: e, reason: collision with root package name */
    public final Protocol f19682e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f19683f;

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public Http2ExchangeCodec(OkHttpClient okHttpClient, RealConnection realConnection, RealInterceptorChain realInterceptorChain, Http2Connection http2Connection) {
        r.e(http2Connection, "http2Connection");
        this.f19678a = realConnection;
        this.f19679b = realInterceptorChain;
        this.f19680c = http2Connection;
        List<Protocol> list = okHttpClient.f19296t;
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        this.f19682e = list.contains(protocol) ? protocol : Protocol.HTTP_2;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void a() throws IOException {
        Http2Stream http2Stream = this.f19681d;
        r.b(http2Stream);
        http2Stream.f().close();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void b(Request request) throws IOException {
        int i10;
        Http2Stream http2Stream;
        boolean z10;
        r.e(request, "request");
        if (this.f19681d != null) {
            return;
        }
        boolean z11 = request.f19340d != null;
        f19675g.getClass();
        Headers headers = request.f19339c;
        ArrayList arrayList = new ArrayList(headers.size() + 4);
        arrayList.add(new Header(Header.f19584f, request.f19338b));
        j jVar = Header.f19585g;
        RequestLine requestLine = RequestLine.f19542a;
        HttpUrl httpUrl = request.f19337a;
        requestLine.getClass();
        arrayList.add(new Header(jVar, RequestLine.a(httpUrl)));
        String strC = request.f19339c.c("Host");
        if (strC != null) {
            arrayList.add(new Header(Header.f19587i, strC));
        }
        arrayList.add(new Header(Header.f19586h, httpUrl.f19255a));
        int size = headers.size();
        for (int i11 = 0; i11 < size; i11++) {
            String strE = headers.e(i11);
            Locale US = Locale.US;
            r.d(US, "US");
            String lowerCase = strE.toLowerCase(US);
            r.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!f19676h.contains(lowerCase) || (lowerCase.equals("te") && r.a(headers.g(i11), "trailers"))) {
                arrayList.add(new Header(lowerCase, headers.g(i11)));
            }
        }
        Http2Connection http2Connection = this.f19680c;
        http2Connection.getClass();
        boolean z12 = !z11;
        synchronized (http2Connection.A) {
            synchronized (http2Connection) {
                try {
                    if (http2Connection.f19618e > 1073741823) {
                        http2Connection.E(ErrorCode.REFUSED_STREAM);
                    }
                    if (http2Connection.f19619f) {
                        throw new ConnectionShutdownException();
                    }
                    i10 = http2Connection.f19618e;
                    http2Connection.f19618e = i10 + 2;
                    http2Stream = new Http2Stream(i10, http2Connection, z12, false, null);
                    z10 = !z11 || http2Connection.f19634x >= http2Connection.f19635y || http2Stream.f19699e >= http2Stream.f19700f;
                    if (http2Stream.h()) {
                        http2Connection.f19615b.put(Integer.valueOf(i10), http2Stream);
                    }
                    f0 f0Var = f0.f21461a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            http2Connection.A.E(z12, i10, arrayList);
        }
        if (z10) {
            http2Connection.A.flush();
        }
        this.f19681d = http2Stream;
        if (this.f19683f) {
            Http2Stream http2Stream2 = this.f19681d;
            r.b(http2Stream2);
            http2Stream2.e(ErrorCode.CANCEL);
            throw new IOException("Canceled");
        }
        Http2Stream http2Stream3 = this.f19681d;
        r.b(http2Stream3);
        Http2Stream.StreamTimeout streamTimeout = http2Stream3.f19705k;
        long j10 = this.f19679b.f19536g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        streamTimeout.g(j10, timeUnit);
        Http2Stream http2Stream4 = this.f19681d;
        r.b(http2Stream4);
        http2Stream4.f19706l.g(this.f19679b.f19537h, timeUnit);
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final l0 c(Response response) {
        Http2Stream http2Stream = this.f19681d;
        r.b(http2Stream);
        return http2Stream.f19703i;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void cancel() {
        this.f19683f = true;
        Http2Stream http2Stream = this.f19681d;
        if (http2Stream != null) {
            http2Stream.e(ErrorCode.CANCEL);
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final Response.Builder d(boolean z10) throws NumberFormatException, IOException {
        Headers headers;
        Http2Stream http2Stream = this.f19681d;
        if (http2Stream == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (http2Stream) {
            http2Stream.f19705k.h();
            while (http2Stream.f19701g.isEmpty() && http2Stream.f19707m == null) {
                try {
                    try {
                        http2Stream.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th2) {
                    http2Stream.f19705k.k();
                    throw th2;
                }
            }
            http2Stream.f19705k.k();
            if (http2Stream.f19701g.isEmpty()) {
                IOException iOException = http2Stream.f19708n;
                if (iOException != null) {
                    throw iOException;
                }
                ErrorCode errorCode = http2Stream.f19707m;
                r.b(errorCode);
                throw new StreamResetException(errorCode);
            }
            Headers headersRemoveFirst = http2Stream.f19701g.removeFirst();
            r.d(headersRemoveFirst, "headersQueue.removeFirst()");
            headers = headersRemoveFirst;
        }
        Companion companion = f19675g;
        Protocol protocol = this.f19682e;
        companion.getClass();
        r.e(protocol, "protocol");
        Headers.Builder builder = new Headers.Builder();
        int size = headers.size();
        StatusLine statusLineA = null;
        for (int i10 = 0; i10 < size; i10++) {
            String strE = headers.e(i10);
            String strG = headers.g(i10);
            if (r.a(strE, ":status")) {
                StatusLine.f19544d.getClass();
                statusLineA = StatusLine.Companion.a("HTTP/1.1 " + strG);
            } else if (!f19677i.contains(strE)) {
                builder.a(strE, strG);
            }
        }
        if (statusLineA == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        Response.Builder builder2 = new Response.Builder();
        builder2.f19367b = protocol;
        builder2.f19368c = statusLineA.f19546b;
        String message = statusLineA.f19547c;
        r.e(message, "message");
        builder2.f19369d = message;
        builder2.c(builder.b());
        if (z10 && builder2.f19368c == 100) {
            return null;
        }
        return builder2;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final RealConnection e() {
        return this.f19678a;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void f() throws IOException {
        this.f19680c.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final long g(Response response) {
        if (HttpHeaders.a(response)) {
            return Util.j(response);
        }
        return 0L;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final j0 h(Request request, long j10) {
        r.e(request, "request");
        Http2Stream http2Stream = this.f19681d;
        r.b(http2Stream);
        return http2Stream.f();
    }
}
