package okhttp3.internal.connection;

import c9.u1;
import hi.b;
import hi.d0;
import hi.f0;
import hi.j;
import hi.m0;
import hi.x;
import i8.n;
import j2.y;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.r;
import mh.p;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.CertificatePinner;
import okhttp3.Connection;
import okhttp3.ConnectionSpec;
import okhttp3.EventListener;
import okhttp3.EventListener$Companion$NONE$1;
import okhttp3.Handshake;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http1.Http1ExchangeCodec;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2ExchangeCodec;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.Http2Writer;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.tls.OkHostnameVerifier;
import qg.m;

/* loaded from: classes2.dex */
public final class RealConnection extends Http2Connection.Listener implements Connection {

    /* renamed from: b, reason: collision with root package name */
    public final Route f19485b;

    /* renamed from: c, reason: collision with root package name */
    public Socket f19486c;

    /* renamed from: d, reason: collision with root package name */
    public Socket f19487d;

    /* renamed from: e, reason: collision with root package name */
    public Handshake f19488e;

    /* renamed from: f, reason: collision with root package name */
    public Protocol f19489f;

    /* renamed from: g, reason: collision with root package name */
    public Http2Connection f19490g;

    /* renamed from: h, reason: collision with root package name */
    public f0 f19491h;

    /* renamed from: i, reason: collision with root package name */
    public d0 f19492i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f19493j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f19494k;

    /* renamed from: l, reason: collision with root package name */
    public int f19495l;

    /* renamed from: m, reason: collision with root package name */
    public int f19496m;

    /* renamed from: n, reason: collision with root package name */
    public int f19497n;

    /* renamed from: o, reason: collision with root package name */
    public int f19498o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f19499p;

    /* renamed from: q, reason: collision with root package name */
    public long f19500q;

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19501a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f19501a = iArr;
        }
    }

    static {
        new Companion(0);
    }

    public RealConnection(RealConnectionPool connectionPool, Route route) {
        r.e(connectionPool, "connectionPool");
        r.e(route, "route");
        this.f19485b = route;
        this.f19498o = 1;
        this.f19499p = new ArrayList();
        this.f19500q = Long.MAX_VALUE;
    }

    public static void d(OkHttpClient okHttpClient, Route failedRoute, IOException failure) {
        r.e(failedRoute, "failedRoute");
        r.e(failure, "failure");
        if (failedRoute.f19383b.type() != Proxy.Type.DIRECT) {
            Address address = failedRoute.f19382a;
            address.f19156g.connectFailed(address.f19157h.g(), failedRoute.f19383b.address(), failure);
        }
        RouteDatabase routeDatabase = okHttpClient.D;
        synchronized (routeDatabase) {
            routeDatabase.f19511a.add(failedRoute);
        }
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public final synchronized void a(Http2Connection http2Connection, Settings settings) {
        r.e(settings, "settings");
        this.f19498o = (settings.f19735a & 16) != 0 ? settings.f19736b[4] : Integer.MAX_VALUE;
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public final void b(Http2Stream http2Stream) throws IOException {
        http2Stream.c(ErrorCode.REFUSED_STREAM, null);
    }

    public final void c(int i10, int i11, int i12, boolean z10, Call call, EventListener eventListener) throws Throwable {
        Call call2;
        Route route;
        r.e(eventListener, "eventListener");
        if (this.f19489f != null) {
            throw new IllegalStateException("already connected");
        }
        List<ConnectionSpec> list = this.f19485b.f19382a.f19159j;
        ConnectionSpecSelector connectionSpecSelector = new ConnectionSpecSelector(list);
        Address address = this.f19485b.f19382a;
        if (address.f19152c == null) {
            if (!list.contains(ConnectionSpec.f19209f)) {
                throw new RouteException(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.f19485b.f19382a.f19157h.f19258d;
            Platform.f19768a.getClass();
            if (!Platform.f19769b.h(str)) {
                throw new RouteException(new UnknownServiceException(n.d("CLEARTEXT communication to ", str, " not permitted by network security policy")));
            }
        } else if (address.f19158i.contains(Protocol.H2_PRIOR_KNOWLEDGE)) {
            throw new RouteException(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        RouteException routeException = null;
        do {
            try {
                Route route2 = this.f19485b;
                try {
                    if (route2.f19382a.f19152c != null && route2.f19383b.type() == Proxy.Type.HTTP) {
                        call2 = call;
                        f(i10, i11, i12, call2, eventListener);
                        if (this.f19486c == null) {
                        }
                        route = this.f19485b;
                        if (route.f19382a.f19152c == null && route.f19383b.type() == Proxy.Type.HTTP && this.f19486c == null) {
                            throw new RouteException(new ProtocolException("Too many tunnel connections attempted: 21"));
                        }
                        this.f19500q = System.nanoTime();
                        return;
                    }
                    call2 = call;
                    e(i10, i11, call2, eventListener);
                    g(connectionSpecSelector, call2, eventListener);
                    InetSocketAddress inetSocketAddress = this.f19485b.f19384c;
                    EventListener$Companion$NONE$1 eventListener$Companion$NONE$1 = EventListener.f19241a;
                    r.e(inetSocketAddress, "inetSocketAddress");
                    route = this.f19485b;
                    if (route.f19382a.f19152c == null) {
                    }
                    this.f19500q = System.nanoTime();
                    return;
                } catch (IOException e10) {
                    e = e10;
                    Socket socket = this.f19487d;
                    if (socket != null) {
                        Util.d(socket);
                    }
                    Socket socket2 = this.f19486c;
                    if (socket2 != null) {
                        Util.d(socket2);
                    }
                    this.f19487d = null;
                    this.f19486c = null;
                    this.f19491h = null;
                    this.f19492i = null;
                    this.f19488e = null;
                    this.f19489f = null;
                    this.f19490g = null;
                    this.f19498o = 1;
                    InetSocketAddress inetSocketAddress2 = this.f19485b.f19384c;
                    r.e(inetSocketAddress2, "inetSocketAddress");
                    if (routeException == null) {
                        routeException = new RouteException(e);
                    } else {
                        u1.b(routeException.f19512a, e);
                        routeException.f19513b = e;
                    }
                    if (!z10) {
                        throw routeException;
                    }
                    connectionSpecSelector.f19436d = true;
                    if (!connectionSpecSelector.f19435c) {
                        throw routeException;
                    }
                    if (e instanceof ProtocolException) {
                        throw routeException;
                    }
                    if (e instanceof InterruptedIOException) {
                        throw routeException;
                    }
                    if ((e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) {
                        throw routeException;
                    }
                    if (e instanceof SSLPeerUnverifiedException) {
                        throw routeException;
                    }
                }
            } catch (IOException e11) {
                e = e11;
            }
        } while (e instanceof SSLException);
        throw routeException;
    }

    public final void e(int i10, int i11, Call call, EventListener eventListener) throws IOException {
        Socket socketCreateSocket;
        Route route = this.f19485b;
        Proxy proxy = route.f19383b;
        Address address = route.f19382a;
        Proxy.Type type = proxy.type();
        int i12 = type == null ? -1 : WhenMappings.f19501a[type.ordinal()];
        if (i12 == 1 || i12 == 2) {
            socketCreateSocket = address.f19151b.createSocket();
            r.b(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(proxy);
        }
        this.f19486c = socketCreateSocket;
        InetSocketAddress inetSocketAddress = this.f19485b.f19384c;
        eventListener.getClass();
        r.e(inetSocketAddress, "inetSocketAddress");
        socketCreateSocket.setSoTimeout(i11);
        try {
            Platform.f19768a.getClass();
            Platform.f19769b.e(socketCreateSocket, this.f19485b.f19384c, i10);
            try {
                this.f19491h = x.b(x.f(socketCreateSocket));
                this.f19492i = x.a(x.d(socketCreateSocket));
            } catch (NullPointerException e10) {
                if (r.a(e10.getMessage(), "throw with null exception")) {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f19485b.f19384c);
            connectException.initCause(e11);
            throw connectException;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x013d, code lost:
    
        if (r2 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0140, code lost:
    
        r5 = r17.f19486c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0142, code lost:
    
        if (r5 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0144, code lost:
    
        okhttp3.internal.Util.d(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0147, code lost:
    
        r5 = null;
        r17.f19486c = null;
        r17.f19492i = null;
        r17.f19491h = null;
        r7 = r3.f19384c;
        r10 = okhttp3.EventListener.f19241a;
        kotlin.jvm.internal.r.e(r7, "inetSocketAddress");
        r10 = r16 + 1;
        r1 = r19;
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(int i10, int i11, int i12, Call call, EventListener eventListener) throws IOException {
        int i13 = i11;
        Request.Builder builder = new Request.Builder();
        Route route = this.f19485b;
        HttpUrl url = route.f19382a.f19157h;
        r.e(url, "url");
        builder.f19343a = url;
        OkHttpClient okHttpClient = null;
        builder.c("CONNECT", null);
        Address address = route.f19382a;
        boolean z10 = true;
        builder.b("Host", Util.w(address.f19157h, true));
        builder.b("Proxy-Connection", "Keep-Alive");
        builder.b("User-Agent", "okhttp/4.12.0");
        Request requestA = builder.a();
        Response.Builder builder2 = new Response.Builder();
        builder2.f19366a = requestA;
        builder2.f19367b = Protocol.HTTP_1_1;
        builder2.f19368c = 407;
        builder2.f19369d = "Preemptive Authenticate";
        builder2.f19372g = Util.f19395c;
        builder2.f19376k = -1L;
        builder2.f19377l = -1L;
        Headers.Builder builder3 = builder2.f19371f;
        builder3.getClass();
        Headers.f19250b.getClass();
        Headers.Companion.a("Proxy-Authenticate");
        Headers.Companion.b("OkHttp-Preemptive", "Proxy-Authenticate");
        builder3.c("Proxy-Authenticate");
        builder3.a("Proxy-Authenticate", "OkHttp-Preemptive");
        Request requestA2 = address.f19155f.a(route, builder2.a());
        if (requestA2 != null) {
            requestA = requestA2;
        }
        HttpUrl httpUrl = requestA.f19337a;
        int i14 = 0;
        while (i14 < 21) {
            e(i10, i13, call, eventListener);
            String str = "CONNECT " + Util.w(httpUrl, z10) + " HTTP/1.1";
            while (true) {
                f0 f0Var = this.f19491h;
                r.b(f0Var);
                d0 d0Var = this.f19492i;
                r.b(d0Var);
                Http1ExchangeCodec http1ExchangeCodec = new Http1ExchangeCodec(okHttpClient, this, f0Var, d0Var);
                m0 m0VarB = f0Var.f13057a.b();
                int i15 = i14;
                long j10 = i13;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                m0VarB.g(j10, timeUnit);
                d0Var.f13051a.b().g(i12, timeUnit);
                http1ExchangeCodec.l(requestA.f19339c, str);
                http1ExchangeCodec.a();
                Response.Builder builderD = http1ExchangeCodec.d(false);
                r.b(builderD);
                builderD.f19366a = requestA;
                Response responseA = builderD.a();
                int i16 = responseA.f19356d;
                http1ExchangeCodec.k(responseA);
                if (i16 != 200) {
                    if (i16 != 407) {
                        throw new IOException(y.a(i16, "Unexpected response code for CONNECT: "));
                    }
                    Request requestA3 = address.f19155f.a(route, responseA);
                    if (requestA3 == null) {
                        throw new IOException("Failed to authenticate with proxy");
                    }
                    if ("close".equalsIgnoreCase(Response.h("Connection", responseA))) {
                        requestA = requestA3;
                        break;
                    }
                    i13 = i11;
                    requestA = requestA3;
                    i14 = i15;
                    okHttpClient = null;
                } else {
                    if (!f0Var.f13058b.p() || !d0Var.f13052b.p()) {
                        throw new IOException("TLS tunnel buffered too many bytes!");
                    }
                    requestA = null;
                }
            }
        }
    }

    public final void g(ConnectionSpecSelector connectionSpecSelector, Call call, EventListener eventListener) throws Throwable {
        Throwable th2;
        Protocol protocolA;
        Address address = this.f19485b.f19382a;
        if (address.f19152c == null) {
            List<Protocol> list = address.f19158i;
            Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(protocol)) {
                this.f19487d = this.f19486c;
                this.f19489f = Protocol.HTTP_1_1;
                return;
            } else {
                this.f19487d = this.f19486c;
                this.f19489f = protocol;
                l();
                return;
            }
        }
        eventListener.getClass();
        Address address2 = this.f19485b.f19382a;
        SSLSocketFactory sSLSocketFactory = address2.f19152c;
        SSLSocket sSLSocket = null;
        String strF = null;
        try {
            r.b(sSLSocketFactory);
            Socket socket = this.f19486c;
            HttpUrl httpUrl = address2.f19157h;
            Socket socketCreateSocket = sSLSocketFactory.createSocket(socket, httpUrl.f19258d, httpUrl.f19259e, true);
            r.c(socketCreateSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            SSLSocket sSLSocket2 = (SSLSocket) socketCreateSocket;
            try {
                ConnectionSpec connectionSpecA = connectionSpecSelector.a(sSLSocket2);
                if (connectionSpecA.f19211b) {
                    Platform.f19768a.getClass();
                    Platform.f19769b.d(sSLSocket2, address2.f19157h.f19258d, address2.f19158i);
                }
                sSLSocket2.startHandshake();
                SSLSession sslSocketSession = sSLSocket2.getSession();
                Handshake.Companion companion = Handshake.f19243e;
                r.d(sslSocketSession, "sslSocketSession");
                companion.getClass();
                Handshake handshakeA = Handshake.Companion.a(sslSocketSession);
                HostnameVerifier hostnameVerifier = address2.f19153d;
                r.b(hostnameVerifier);
                if (hostnameVerifier.verify(address2.f19157h.f19258d, sslSocketSession)) {
                    CertificatePinner certificatePinner = address2.f19154e;
                    r.b(certificatePinner);
                    this.f19488e = new Handshake(handshakeA.f19244a, handshakeA.f19245b, handshakeA.f19246c, new RealConnection$connectTls$1(certificatePinner, handshakeA, address2));
                    certificatePinner.b(address2.f19157h.f19258d, new RealConnection$connectTls$2(this));
                    if (connectionSpecA.f19211b) {
                        Platform.f19768a.getClass();
                        strF = Platform.f19769b.f(sSLSocket2);
                    }
                    this.f19487d = sSLSocket2;
                    this.f19491h = x.b(x.f(sSLSocket2));
                    this.f19492i = x.a(x.d(sSLSocket2));
                    if (strF != null) {
                        Protocol.f19328b.getClass();
                        protocolA = Protocol.Companion.a(strF);
                    } else {
                        protocolA = Protocol.HTTP_1_1;
                    }
                    this.f19489f = protocolA;
                    Platform.f19768a.getClass();
                    Platform.f19769b.a(sSLSocket2);
                    if (this.f19489f == Protocol.HTTP_2) {
                        l();
                        return;
                    }
                    return;
                }
                List<Certificate> listA = handshakeA.a();
                if (listA.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + address2.f19157h.f19258d + " not verified (no certificates)");
                }
                Certificate certificate = listA.get(0);
                r.c(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                X509Certificate x509Certificate = (X509Certificate) certificate;
                StringBuilder sb = new StringBuilder("\n              |Hostname ");
                sb.append(address2.f19157h.f19258d);
                sb.append(" not verified:\n              |    certificate: ");
                CertificatePinner.f19177c.getClass();
                StringBuilder sb2 = new StringBuilder("sha256/");
                j jVar = j.f13075d;
                byte[] encoded = x509Certificate.getPublicKey().getEncoded();
                r.d(encoded, "publicKey.encoded");
                j jVar2 = j.f13075d;
                int i10 = b.f13032a;
                int length = encoded.length;
                b.b(encoded.length, 0, length);
                sb2.append(new j(m.j(encoded, 0, length)).c("SHA-256").a());
                sb.append(sb2.toString());
                sb.append("\n              |    DN: ");
                sb.append(x509Certificate.getSubjectDN().getName());
                sb.append("\n              |    subjectAltNames: ");
                OkHostnameVerifier.f19809a.getClass();
                sb.append(qg.x.O(OkHostnameVerifier.a(x509Certificate, 2), OkHostnameVerifier.a(x509Certificate, 7)));
                sb.append("\n              ");
                throw new SSLPeerUnverifiedException(p.d(sb.toString()));
            } catch (Throwable th3) {
                th2 = th3;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    Platform.f19768a.getClass();
                    Platform.f19769b.a(sSLSocket);
                }
                if (sSLSocket == null) {
                    throw th2;
                }
                Util.d(sSLSocket);
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(Address address, List<Route> list) {
        Handshake handshake;
        HttpUrl httpUrl = address.f19157h;
        byte[] bArr = Util.f19393a;
        if (this.f19499p.size() < this.f19498o && !this.f19493j) {
            Route route = this.f19485b;
            Address address2 = route.f19382a;
            Address address3 = route.f19382a;
            if (address2.a(address)) {
                String str = httpUrl.f19258d;
                String str2 = httpUrl.f19258d;
                if (r.a(str, address3.f19157h.f19258d)) {
                    return true;
                }
                if (this.f19490g != null && list != null && !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Route route2 = (Route) it.next();
                        Proxy.Type type = route2.f19383b.type();
                        Proxy.Type type2 = Proxy.Type.DIRECT;
                        if (type == type2 && route.f19383b.type() == type2 && r.a(route.f19384c, route2.f19384c)) {
                            HostnameVerifier hostnameVerifier = address.f19153d;
                            OkHostnameVerifier okHostnameVerifier = OkHostnameVerifier.f19809a;
                            if (hostnameVerifier == okHostnameVerifier) {
                                byte[] bArr2 = Util.f19393a;
                                HttpUrl httpUrl2 = address3.f19157h;
                                if (httpUrl.f19259e == httpUrl2.f19259e) {
                                    if (!r.a(str2, httpUrl2.f19258d)) {
                                        if (!this.f19494k && (handshake = this.f19488e) != null) {
                                            List<Certificate> listA = handshake.a();
                                            if (!listA.isEmpty()) {
                                                Certificate certificate = listA.get(0);
                                                r.c(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                                                okHostnameVerifier.getClass();
                                                if (OkHostnameVerifier.c(str2, (X509Certificate) certificate)) {
                                                    try {
                                                        CertificatePinner certificatePinner = address.f19154e;
                                                        r.b(certificatePinner);
                                                        Handshake handshake2 = this.f19488e;
                                                        r.b(handshake2);
                                                        certificatePinner.a(str2, handshake2.a());
                                                        return true;
                                                    } catch (SSLPeerUnverifiedException unused) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean i(boolean z10) throws SocketException {
        long j10;
        byte[] bArr = Util.f19393a;
        long jNanoTime = System.nanoTime();
        Socket socket = this.f19486c;
        r.b(socket);
        Socket socket2 = this.f19487d;
        r.b(socket2);
        r.b(this.f19491h);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        Http2Connection http2Connection = this.f19490g;
        if (http2Connection != null) {
            synchronized (http2Connection) {
                if (http2Connection.f19619f) {
                    return false;
                }
                if (http2Connection.f19628q < http2Connection.f19627p) {
                    if (jNanoTime >= http2Connection.f19629r) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j10 = jNanoTime - this.f19500q;
        }
        if (j10 < 10000000000L || !z10) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                return !r4.h();
            } finally {
                socket2.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final ExchangeCodec j(OkHttpClient okHttpClient, RealInterceptorChain realInterceptorChain) throws SocketException {
        int i10 = realInterceptorChain.f19536g;
        Socket socket = this.f19487d;
        r.b(socket);
        f0 f0Var = this.f19491h;
        r.b(f0Var);
        d0 d0Var = this.f19492i;
        r.b(d0Var);
        Http2Connection http2Connection = this.f19490g;
        if (http2Connection != null) {
            return new Http2ExchangeCodec(okHttpClient, this, realInterceptorChain, http2Connection);
        }
        socket.setSoTimeout(i10);
        m0 m0VarB = f0Var.f13057a.b();
        long j10 = i10;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        m0VarB.g(j10, timeUnit);
        d0Var.f13051a.b().g(realInterceptorChain.f19537h, timeUnit);
        return new Http1ExchangeCodec(okHttpClient, this, f0Var, d0Var);
    }

    public final synchronized void k() {
        this.f19493j = true;
    }

    public final void l() throws IOException {
        Socket socket = this.f19487d;
        r.b(socket);
        f0 f0Var = this.f19491h;
        r.b(f0Var);
        d0 d0Var = this.f19492i;
        r.b(d0Var);
        socket.setSoTimeout(0);
        TaskRunner taskRunner = TaskRunner.f19421i;
        Http2Connection.Builder builder = new Http2Connection.Builder(taskRunner);
        String peerName = this.f19485b.f19382a.f19157h.f19258d;
        r.e(peerName, "peerName");
        builder.f19666b = socket;
        String str = Util.f19399g + ' ' + peerName;
        r.e(str, "<set-?>");
        builder.f19667c = str;
        builder.f19668d = f0Var;
        builder.f19669e = d0Var;
        builder.f19670f = this;
        Http2Connection http2Connection = new Http2Connection(builder);
        this.f19490g = http2Connection;
        Http2Connection.D.getClass();
        Settings settings = Http2Connection.E;
        this.f19498o = (settings.f19735a & 16) != 0 ? settings.f19736b[4] : Integer.MAX_VALUE;
        Http2Writer http2Writer = http2Connection.A;
        synchronized (http2Writer) {
            try {
                if (http2Writer.f19724d) {
                    throw new IOException("closed");
                }
                Logger logger = Http2Writer.f19720f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(Util.h(">> CONNECTION " + Http2.f19610b.e(), new Object[0]));
                }
                http2Writer.f19721a.A(Http2.f19610b);
                http2Writer.f19721a.flush();
            } finally {
            }
        }
        Http2Writer http2Writer2 = http2Connection.A;
        Settings settings2 = http2Connection.f19630s;
        synchronized (http2Writer2) {
            try {
                r.e(settings2, "settings");
                if (http2Writer2.f19724d) {
                    throw new IOException("closed");
                }
                http2Writer2.p(0, Integer.bitCount(settings2.f19735a) * 6, 4, 0);
                int i10 = 0;
                while (i10 < 10) {
                    boolean z10 = true;
                    if (((1 << i10) & settings2.f19735a) == 0) {
                        z10 = false;
                    }
                    if (z10) {
                        http2Writer2.f19721a.writeShort(i10 != 4 ? i10 != 7 ? i10 : 4 : 3);
                        http2Writer2.f19721a.writeInt(settings2.f19736b[i10]);
                    }
                    i10++;
                }
                http2Writer2.f19721a.flush();
            } finally {
            }
        }
        if (http2Connection.f19630s.a() != 65535) {
            http2Connection.A.Z(0, r1 - 65535);
        }
        TaskQueue taskQueueE = taskRunner.e();
        final String str2 = http2Connection.f19616c;
        final Http2Connection.ReaderRunnable readerRunnable = http2Connection.B;
        taskQueueE.c(new Task(str2) { // from class: okhttp3.internal.concurrent.TaskQueue$execute$1
            @Override // okhttp3.internal.concurrent.Task
            public final long a() {
                readerRunnable.invoke();
                return -1L;
            }
        }, 0L);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        Route route = this.f19485b;
        sb.append(route.f19382a.f19157h.f19258d);
        sb.append(':');
        sb.append(route.f19382a.f19157h.f19259e);
        sb.append(", proxy=");
        sb.append(route.f19383b);
        sb.append(" hostAddress=");
        sb.append(route.f19384c);
        sb.append(" cipherSuite=");
        Handshake handshake = this.f19488e;
        if (handshake == null || (obj = handshake.f19245b) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f19489f);
        sb.append('}');
        return sb.toString();
    }
}
