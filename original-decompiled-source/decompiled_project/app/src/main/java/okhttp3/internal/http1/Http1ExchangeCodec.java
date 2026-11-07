package okhttp3.internal.http1;

import hi.d0;
import hi.f0;
import hi.g;
import hi.h;
import hi.i;
import hi.j0;
import hi.l0;
import hi.m0;
import hi.q;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.r;
import mh.t;
import mh.x;
import okhttp3.CookieJar;
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
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;

/* loaded from: classes2.dex */
public final class Http1ExchangeCodec implements ExchangeCodec {

    /* renamed from: a, reason: collision with root package name */
    public final OkHttpClient f19550a;

    /* renamed from: b, reason: collision with root package name */
    public final RealConnection f19551b;

    /* renamed from: c, reason: collision with root package name */
    public final i f19552c;

    /* renamed from: d, reason: collision with root package name */
    public final h f19553d;

    /* renamed from: e, reason: collision with root package name */
    public int f19554e;

    /* renamed from: f, reason: collision with root package name */
    public final HeadersReader f19555f;

    /* renamed from: g, reason: collision with root package name */
    public Headers f19556g;

    public abstract class AbstractSource implements l0 {

        /* renamed from: a, reason: collision with root package name */
        public final q f19557a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f19558b;

        public AbstractSource() {
            this.f19557a = new q(Http1ExchangeCodec.this.f19552c.b());
        }

        @Override // hi.l0
        public final m0 b() {
            return this.f19557a;
        }

        public final void h() {
            Http1ExchangeCodec http1ExchangeCodec = Http1ExchangeCodec.this;
            int i10 = http1ExchangeCodec.f19554e;
            if (i10 == 6) {
                return;
            }
            if (i10 == 5) {
                Http1ExchangeCodec.i(http1ExchangeCodec, this.f19557a);
                http1ExchangeCodec.f19554e = 6;
            } else {
                throw new IllegalStateException("state: " + http1ExchangeCodec.f19554e);
            }
        }

        @Override // hi.l0
        public long y(long j10, g sink) throws IOException {
            Http1ExchangeCodec http1ExchangeCodec = Http1ExchangeCodec.this;
            r.e(sink, "sink");
            try {
                return http1ExchangeCodec.f19552c.y(j10, sink);
            } catch (IOException e10) {
                http1ExchangeCodec.f19551b.k();
                h();
                throw e10;
            }
        }
    }

    public final class ChunkedSink implements j0 {

        /* renamed from: a, reason: collision with root package name */
        public final q f19560a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f19561b;

        public ChunkedSink() {
            this.f19560a = new q(Http1ExchangeCodec.this.f19553d.b());
        }

        @Override // hi.j0
        public final m0 b() {
            return this.f19560a;
        }

        @Override // hi.j0, java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() {
            if (this.f19561b) {
                return;
            }
            this.f19561b = true;
            Http1ExchangeCodec.this.f19553d.O("0\r\n\r\n");
            Http1ExchangeCodec.i(Http1ExchangeCodec.this, this.f19560a);
            Http1ExchangeCodec.this.f19554e = 3;
        }

        @Override // hi.j0, java.io.Flushable
        public final synchronized void flush() {
            if (this.f19561b) {
                return;
            }
            Http1ExchangeCodec.this.f19553d.flush();
        }

        @Override // hi.j0
        public final void j(long j10, g source) throws IOException {
            h hVar = Http1ExchangeCodec.this.f19553d;
            r.e(source, "source");
            if (this.f19561b) {
                throw new IllegalStateException("closed");
            }
            if (j10 == 0) {
                return;
            }
            hVar.V(j10);
            hVar.O("\r\n");
            hVar.j(j10, source);
            hVar.O("\r\n");
        }
    }

    public final class ChunkedSource extends AbstractSource {

        /* renamed from: d, reason: collision with root package name */
        public final HttpUrl f19563d;

        /* renamed from: e, reason: collision with root package name */
        public long f19564e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f19565f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Http1ExchangeCodec f19566g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChunkedSource(Http1ExchangeCodec http1ExchangeCodec, HttpUrl url) {
            super();
            r.e(url, "url");
            this.f19566g = http1ExchangeCodec;
            this.f19563d = url;
            this.f19564e = -1L;
            this.f19565f = true;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            boolean zU;
            if (this.f19558b) {
                return;
            }
            if (this.f19565f) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                byte[] bArr = Util.f19393a;
                r.e(timeUnit, "timeUnit");
                try {
                    zU = Util.u(this, 100);
                } catch (IOException unused) {
                    zU = false;
                }
                if (!zU) {
                    this.f19566g.f19551b.k();
                    h();
                }
            }
            this.f19558b = true;
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, hi.l0
        public final long y(long j10, g sink) throws IOException, NumberFormatException {
            long j11;
            Http1ExchangeCodec http1ExchangeCodec = this.f19566g;
            i iVar = http1ExchangeCodec.f19552c;
            r.e(sink, "sink");
            if (j10 < 0) {
                throw new IllegalArgumentException(m0.r.a("byteCount < 0: ", j10).toString());
            }
            if (this.f19558b) {
                throw new IllegalStateException("closed");
            }
            long j12 = -1;
            if (!this.f19565f) {
                return -1L;
            }
            long j13 = this.f19564e;
            if (j13 == 0 || j13 == -1) {
                if (j13 != -1) {
                    iVar.a0();
                }
                try {
                    this.f19564e = iVar.z0();
                    String string = x.W(iVar.a0()).toString();
                    if (this.f19564e < 0 || (string.length() > 0 && !t.p(string, ";", false))) {
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f19564e + string + '\"');
                    }
                    if (this.f19564e == 0) {
                        this.f19565f = false;
                        HeadersReader headersReader = http1ExchangeCodec.f19555f;
                        headersReader.getClass();
                        Headers.Builder builder = new Headers.Builder();
                        while (true) {
                            String strF = headersReader.f19548a.F(headersReader.f19549b);
                            j11 = j12;
                            headersReader.f19549b -= strF.length();
                            if (strF.length() == 0) {
                                break;
                            }
                            int iX = x.x(strF, ':', 1, 4);
                            if (iX != -1) {
                                String strSubstring = strF.substring(0, iX);
                                r.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                                String strSubstring2 = strF.substring(iX + 1);
                                r.d(strSubstring2, "this as java.lang.String).substring(startIndex)");
                                builder.a(strSubstring, strSubstring2);
                            } else if (strF.charAt(0) == ':') {
                                String strSubstring3 = strF.substring(1);
                                r.d(strSubstring3, "this as java.lang.String).substring(startIndex)");
                                builder.a("", strSubstring3);
                            } else {
                                builder.a("", strF);
                            }
                            j12 = j11;
                        }
                        http1ExchangeCodec.f19556g = builder.b();
                        OkHttpClient okHttpClient = http1ExchangeCodec.f19550a;
                        r.b(okHttpClient);
                        CookieJar cookieJar = okHttpClient.f19288k;
                        Headers headers = http1ExchangeCodec.f19556g;
                        r.b(headers);
                        HttpHeaders.d(cookieJar, this.f19563d, headers);
                        h();
                    } else {
                        j11 = -1;
                    }
                    if (!this.f19565f) {
                        return j11;
                    }
                } catch (NumberFormatException e10) {
                    throw new ProtocolException(e10.getMessage());
                }
            } else {
                j11 = -1;
            }
            long jY = super.y(Math.min(j10, this.f19564e), sink);
            if (jY != j11) {
                this.f19564e -= jY;
                return jY;
            }
            http1ExchangeCodec.f19551b.k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            h();
            throw protocolException;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public final class FixedLengthSource extends AbstractSource {

        /* renamed from: d, reason: collision with root package name */
        public long f19567d;

        public FixedLengthSource(long j10) {
            super();
            this.f19567d = j10;
            if (j10 == 0) {
                h();
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            boolean zU;
            if (this.f19558b) {
                return;
            }
            if (this.f19567d != 0) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                byte[] bArr = Util.f19393a;
                r.e(timeUnit, "timeUnit");
                try {
                    zU = Util.u(this, 100);
                } catch (IOException unused) {
                    zU = false;
                }
                if (!zU) {
                    Http1ExchangeCodec.this.f19551b.k();
                    h();
                }
            }
            this.f19558b = true;
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, hi.l0
        public final long y(long j10, g sink) throws IOException {
            r.e(sink, "sink");
            if (j10 < 0) {
                throw new IllegalArgumentException(m0.r.a("byteCount < 0: ", j10).toString());
            }
            if (this.f19558b) {
                throw new IllegalStateException("closed");
            }
            long j11 = this.f19567d;
            if (j11 == 0) {
                return -1L;
            }
            long jY = super.y(Math.min(j11, j10), sink);
            if (jY == -1) {
                Http1ExchangeCodec.this.f19551b.k();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                h();
                throw protocolException;
            }
            long j12 = this.f19567d - jY;
            this.f19567d = j12;
            if (j12 == 0) {
                h();
            }
            return jY;
        }
    }

    public final class KnownLengthSink implements j0 {

        /* renamed from: a, reason: collision with root package name */
        public final q f19569a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f19570b;

        public KnownLengthSink() {
            this.f19569a = new q(Http1ExchangeCodec.this.f19553d.b());
        }

        @Override // hi.j0
        public final m0 b() {
            return this.f19569a;
        }

        @Override // hi.j0, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f19570b) {
                return;
            }
            this.f19570b = true;
            q qVar = this.f19569a;
            Http1ExchangeCodec http1ExchangeCodec = Http1ExchangeCodec.this;
            Http1ExchangeCodec.i(http1ExchangeCodec, qVar);
            http1ExchangeCodec.f19554e = 3;
        }

        @Override // hi.j0, java.io.Flushable
        public final void flush() throws IOException {
            if (this.f19570b) {
                return;
            }
            Http1ExchangeCodec.this.f19553d.flush();
        }

        @Override // hi.j0
        public final void j(long j10, g source) throws IOException {
            r.e(source, "source");
            if (this.f19570b) {
                throw new IllegalStateException("closed");
            }
            long j11 = source.f13061b;
            byte[] bArr = Util.f19393a;
            if (j10 < 0 || 0 > j11 || j11 < j10) {
                throw new ArrayIndexOutOfBoundsException();
            }
            Http1ExchangeCodec.this.f19553d.j(j10, source);
        }
    }

    public final class UnknownLengthSource extends AbstractSource {

        /* renamed from: d, reason: collision with root package name */
        public boolean f19572d;

        public UnknownLengthSource() {
            throw null;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f19558b) {
                return;
            }
            if (!this.f19572d) {
                h();
            }
            this.f19558b = true;
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, hi.l0
        public final long y(long j10, g sink) throws IOException {
            r.e(sink, "sink");
            if (j10 < 0) {
                throw new IllegalArgumentException(m0.r.a("byteCount < 0: ", j10).toString());
            }
            if (this.f19558b) {
                throw new IllegalStateException("closed");
            }
            if (this.f19572d) {
                return -1L;
            }
            long jY = super.y(j10, sink);
            if (jY != -1) {
                return jY;
            }
            this.f19572d = true;
            h();
            return -1L;
        }
    }

    static {
        new Companion(0);
    }

    public Http1ExchangeCodec(OkHttpClient okHttpClient, RealConnection realConnection, f0 source, d0 sink) {
        r.e(source, "source");
        r.e(sink, "sink");
        this.f19550a = okHttpClient;
        this.f19551b = realConnection;
        this.f19552c = source;
        this.f19553d = sink;
        this.f19555f = new HeadersReader(source);
    }

    public static final void i(Http1ExchangeCodec http1ExchangeCodec, q qVar) {
        m0 m0Var = qVar.f13106e;
        m0.a delegate = m0.f13094d;
        r.e(delegate, "delegate");
        qVar.f13106e = delegate;
        m0Var.a();
        m0Var.b();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void a() {
        this.f19553d.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void b(Request request) {
        r.e(request, "request");
        RequestLine requestLine = RequestLine.f19542a;
        Proxy.Type type = this.f19551b.f19485b.f19383b.type();
        r.d(type, "connection.route().proxy.type()");
        requestLine.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(request.f19338b);
        sb.append(' ');
        HttpUrl httpUrl = request.f19337a;
        if (httpUrl.f19263i || type != Proxy.Type.HTTP) {
            sb.append(RequestLine.a(httpUrl));
        } else {
            sb.append(httpUrl);
        }
        sb.append(" HTTP/1.1");
        String string = sb.toString();
        r.d(string, "StringBuilder().apply(builderAction).toString()");
        l(request.f19339c, string);
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final l0 c(Response response) {
        if (!HttpHeaders.a(response)) {
            return j(0L);
        }
        if ("chunked".equalsIgnoreCase(Response.h("Transfer-Encoding", response))) {
            HttpUrl httpUrl = response.f19353a.f19337a;
            if (this.f19554e == 4) {
                this.f19554e = 5;
                return new ChunkedSource(this, httpUrl);
            }
            throw new IllegalStateException(("state: " + this.f19554e).toString());
        }
        long j10 = Util.j(response);
        if (j10 != -1) {
            return j(j10);
        }
        if (this.f19554e == 4) {
            this.f19554e = 5;
            this.f19551b.k();
            return new UnknownLengthSource();
        }
        throw new IllegalStateException(("state: " + this.f19554e).toString());
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void cancel() {
        Socket socket = this.f19551b.f19486c;
        if (socket != null) {
            Util.d(socket);
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final Response.Builder d(boolean z10) {
        HeadersReader headersReader = this.f19555f;
        int i10 = this.f19554e;
        if (i10 != 1 && i10 != 2 && i10 != 3) {
            throw new IllegalStateException(("state: " + this.f19554e).toString());
        }
        try {
            StatusLine.Companion companion = StatusLine.f19544d;
            String strF = headersReader.f19548a.F(headersReader.f19549b);
            headersReader.f19549b -= strF.length();
            companion.getClass();
            StatusLine statusLineA = StatusLine.Companion.a(strF);
            int i11 = statusLineA.f19546b;
            Response.Builder builder = new Response.Builder();
            Protocol protocol = statusLineA.f19545a;
            r.e(protocol, "protocol");
            builder.f19367b = protocol;
            builder.f19368c = i11;
            String message = statusLineA.f19547c;
            r.e(message, "message");
            builder.f19369d = message;
            Headers.Builder builder2 = new Headers.Builder();
            while (true) {
                String strF2 = headersReader.f19548a.F(headersReader.f19549b);
                headersReader.f19549b -= strF2.length();
                if (strF2.length() == 0) {
                    break;
                }
                int iX = x.x(strF2, ':', 1, 4);
                if (iX != -1) {
                    String strSubstring = strF2.substring(0, iX);
                    r.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    String strSubstring2 = strF2.substring(iX + 1);
                    r.d(strSubstring2, "this as java.lang.String).substring(startIndex)");
                    builder2.a(strSubstring, strSubstring2);
                } else if (strF2.charAt(0) == ':') {
                    String strSubstring3 = strF2.substring(1);
                    r.d(strSubstring3, "this as java.lang.String).substring(startIndex)");
                    builder2.a("", strSubstring3);
                } else {
                    builder2.a("", strF2);
                }
            }
            builder.c(builder2.b());
            if (z10 && i11 == 100) {
                return null;
            }
            if (i11 == 100) {
                this.f19554e = 3;
                return builder;
            }
            if (102 > i11 || i11 >= 200) {
                this.f19554e = 4;
                return builder;
            }
            this.f19554e = 3;
            return builder;
        } catch (EOFException e10) {
            throw new IOException("unexpected end of stream on ".concat(this.f19551b.f19485b.f19382a.f19157h.f()), e10);
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final RealConnection e() {
        return this.f19551b;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void f() throws IOException {
        this.f19553d.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final long g(Response response) {
        if (!HttpHeaders.a(response)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(Response.h("Transfer-Encoding", response))) {
            return -1L;
        }
        return Util.j(response);
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final j0 h(Request request, long j10) {
        r.e(request, "request");
        if ("chunked".equalsIgnoreCase(request.f19339c.c("Transfer-Encoding"))) {
            if (this.f19554e == 1) {
                this.f19554e = 2;
                return new ChunkedSink();
            }
            throw new IllegalStateException(("state: " + this.f19554e).toString());
        }
        if (j10 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f19554e == 1) {
            this.f19554e = 2;
            return new KnownLengthSink();
        }
        throw new IllegalStateException(("state: " + this.f19554e).toString());
    }

    public final l0 j(long j10) {
        if (this.f19554e == 4) {
            this.f19554e = 5;
            return new FixedLengthSource(j10);
        }
        throw new IllegalStateException(("state: " + this.f19554e).toString());
    }

    public final void k(Response response) {
        long j10 = Util.j(response);
        if (j10 == -1) {
            return;
        }
        l0 l0VarJ = j(j10);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Util.u(l0VarJ, Integer.MAX_VALUE);
        ((FixedLengthSource) l0VarJ).close();
    }

    public final void l(Headers headers, String requestLine) {
        r.e(requestLine, "requestLine");
        if (this.f19554e != 0) {
            throw new IllegalStateException(("state: " + this.f19554e).toString());
        }
        h hVar = this.f19553d;
        hVar.O(requestLine).O("\r\n");
        int size = headers.size();
        for (int i10 = 0; i10 < size; i10++) {
            hVar.O(headers.e(i10)).O(": ").O(headers.g(i10)).O("\r\n");
        }
        hVar.O("\r\n");
        this.f19554e = 1;
    }
}
