package okhttp3;

import fi.a;
import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.r;
import okhttp3.Call;
import okhttp3.WebSocket;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RouteDatabase;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.proxy.NullProxySelector;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.OkHostnameVerifier;

/* loaded from: classes2.dex */
public class OkHttpClient implements Cloneable, Call.Factory, WebSocket.Factory {
    public static final Companion E = new Companion(0);
    public static final List<Protocol> F = Util.k(Protocol.HTTP_2, Protocol.HTTP_1_1);
    public static final List<ConnectionSpec> G = Util.k(ConnectionSpec.f19208e, ConnectionSpec.f19209f);
    public final int A;
    public final int B;
    public final long C;
    public final RouteDatabase D;

    /* renamed from: a, reason: collision with root package name */
    public final Dispatcher f19279a;

    /* renamed from: b, reason: collision with root package name */
    public final ConnectionPool f19280b;

    /* renamed from: c, reason: collision with root package name */
    public final List<Interceptor> f19281c;

    /* renamed from: d, reason: collision with root package name */
    public final List<Interceptor> f19282d;

    /* renamed from: e, reason: collision with root package name */
    public final a f19283e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f19284f;

    /* renamed from: g, reason: collision with root package name */
    public final Authenticator f19285g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f19286h;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f19287j;

    /* renamed from: k, reason: collision with root package name */
    public final CookieJar f19288k;

    /* renamed from: l, reason: collision with root package name */
    public final Dns f19289l;

    /* renamed from: m, reason: collision with root package name */
    public final ProxySelector f19290m;

    /* renamed from: n, reason: collision with root package name */
    public final Authenticator f19291n;

    /* renamed from: p, reason: collision with root package name */
    public final SocketFactory f19292p;

    /* renamed from: q, reason: collision with root package name */
    public final SSLSocketFactory f19293q;

    /* renamed from: r, reason: collision with root package name */
    public final X509TrustManager f19294r;

    /* renamed from: s, reason: collision with root package name */
    public final List<ConnectionSpec> f19295s;

    /* renamed from: t, reason: collision with root package name */
    public final List<Protocol> f19296t;

    /* renamed from: v, reason: collision with root package name */
    public final HostnameVerifier f19297v;

    /* renamed from: w, reason: collision with root package name */
    public final CertificatePinner f19298w;

    /* renamed from: x, reason: collision with root package name */
    public final CertificateChainCleaner f19299x;

    /* renamed from: y, reason: collision with root package name */
    public final int f19300y;

    /* renamed from: z, reason: collision with root package name */
    public final int f19301z;

    public static final class Builder {
        public RouteDatabase A;

        /* renamed from: a, reason: collision with root package name */
        public Dispatcher f19302a = new Dispatcher();

        /* renamed from: b, reason: collision with root package name */
        public ConnectionPool f19303b = new ConnectionPool();

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f19304c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        public final ArrayList f19305d = new ArrayList();

        /* renamed from: e, reason: collision with root package name */
        public a f19306e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f19307f;

        /* renamed from: g, reason: collision with root package name */
        public Authenticator f19308g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f19309h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f19310i;

        /* renamed from: j, reason: collision with root package name */
        public CookieJar f19311j;

        /* renamed from: k, reason: collision with root package name */
        public Dns f19312k;

        /* renamed from: l, reason: collision with root package name */
        public ProxySelector f19313l;

        /* renamed from: m, reason: collision with root package name */
        public Authenticator f19314m;

        /* renamed from: n, reason: collision with root package name */
        public SocketFactory f19315n;

        /* renamed from: o, reason: collision with root package name */
        public SSLSocketFactory f19316o;

        /* renamed from: p, reason: collision with root package name */
        public X509TrustManager f19317p;

        /* renamed from: q, reason: collision with root package name */
        public List<ConnectionSpec> f19318q;

        /* renamed from: r, reason: collision with root package name */
        public List<? extends Protocol> f19319r;

        /* renamed from: s, reason: collision with root package name */
        public HostnameVerifier f19320s;

        /* renamed from: t, reason: collision with root package name */
        public CertificatePinner f19321t;

        /* renamed from: u, reason: collision with root package name */
        public CertificateChainCleaner f19322u;

        /* renamed from: v, reason: collision with root package name */
        public int f19323v;

        /* renamed from: w, reason: collision with root package name */
        public int f19324w;

        /* renamed from: x, reason: collision with root package name */
        public int f19325x;

        /* renamed from: y, reason: collision with root package name */
        public int f19326y;

        /* renamed from: z, reason: collision with root package name */
        public long f19327z;

        public Builder() {
            EventListener$Companion$NONE$1 eventListener$Companion$NONE$1 = EventListener.f19241a;
            byte[] bArr = Util.f19393a;
            r.e(eventListener$Companion$NONE$1, "<this>");
            this.f19306e = new a(eventListener$Companion$NONE$1);
            this.f19307f = true;
            Authenticator authenticator = Authenticator.f19160a;
            this.f19308g = authenticator;
            this.f19309h = true;
            this.f19310i = true;
            this.f19311j = CookieJar.f19232a;
            this.f19312k = Dns.f19239a;
            this.f19314m = authenticator;
            SocketFactory socketFactory = SocketFactory.getDefault();
            r.d(socketFactory, "getDefault()");
            this.f19315n = socketFactory;
            OkHttpClient.E.getClass();
            this.f19318q = OkHttpClient.G;
            this.f19319r = OkHttpClient.F;
            this.f19320s = OkHostnameVerifier.f19809a;
            this.f19321t = CertificatePinner.f19178d;
            this.f19324w = 10000;
            this.f19325x = 10000;
            this.f19326y = 10000;
            this.f19327z = 1024L;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public OkHttpClient(Builder builder) throws NoSuchAlgorithmException, KeyStoreException {
        this.f19279a = builder.f19302a;
        this.f19280b = builder.f19303b;
        this.f19281c = Util.x(builder.f19304c);
        this.f19282d = Util.x(builder.f19305d);
        this.f19283e = builder.f19306e;
        this.f19284f = builder.f19307f;
        this.f19285g = builder.f19308g;
        this.f19286h = builder.f19309h;
        this.f19287j = builder.f19310i;
        this.f19288k = builder.f19311j;
        this.f19289l = builder.f19312k;
        ProxySelector proxySelector = builder.f19313l;
        proxySelector = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
        this.f19290m = proxySelector == null ? NullProxySelector.f19797a : proxySelector;
        this.f19291n = builder.f19314m;
        this.f19292p = builder.f19315n;
        List<ConnectionSpec> list = builder.f19318q;
        this.f19295s = list;
        this.f19296t = builder.f19319r;
        this.f19297v = builder.f19320s;
        this.f19300y = builder.f19323v;
        this.f19301z = builder.f19324w;
        this.A = builder.f19325x;
        this.B = builder.f19326y;
        this.C = builder.f19327z;
        RouteDatabase routeDatabase = builder.A;
        this.D = routeDatabase == null ? new RouteDatabase() : routeDatabase;
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((ConnectionSpec) it.next()).f19210a) {
                    SSLSocketFactory sSLSocketFactory = builder.f19316o;
                    if (sSLSocketFactory != null) {
                        this.f19293q = sSLSocketFactory;
                        CertificateChainCleaner certificateChainCleaner = builder.f19322u;
                        r.b(certificateChainCleaner);
                        this.f19299x = certificateChainCleaner;
                        X509TrustManager x509TrustManager = builder.f19317p;
                        r.b(x509TrustManager);
                        this.f19294r = x509TrustManager;
                        CertificatePinner certificatePinner = builder.f19321t;
                        certificatePinner.getClass();
                        this.f19298w = r.a(certificatePinner.f19180b, certificateChainCleaner) ? certificatePinner : new CertificatePinner(certificatePinner.f19179a, certificateChainCleaner);
                    } else {
                        Platform.f19768a.getClass();
                        X509TrustManager x509TrustManagerM = Platform.f19769b.m();
                        this.f19294r = x509TrustManagerM;
                        this.f19293q = Platform.f19769b.l(x509TrustManagerM);
                        CertificateChainCleaner.f19808a.getClass();
                        CertificateChainCleaner certificateChainCleanerB = Platform.f19769b.b(x509TrustManagerM);
                        this.f19299x = certificateChainCleanerB;
                        CertificatePinner certificatePinner2 = builder.f19321t;
                        certificatePinner2.getClass();
                        this.f19298w = r.a(certificatePinner2.f19180b, certificateChainCleanerB) ? certificatePinner2 : new CertificatePinner(certificatePinner2.f19179a, certificateChainCleanerB);
                    }
                }
            }
            this.f19293q = null;
            this.f19299x = null;
            this.f19294r = null;
            this.f19298w = CertificatePinner.f19178d;
        } else {
            this.f19293q = null;
            this.f19299x = null;
            this.f19294r = null;
            this.f19298w = CertificatePinner.f19178d;
        }
        X509TrustManager x509TrustManager2 = this.f19294r;
        CertificateChainCleaner certificateChainCleaner2 = this.f19299x;
        SSLSocketFactory sSLSocketFactory2 = this.f19293q;
        List<Interceptor> list2 = this.f19282d;
        List<Interceptor> list3 = this.f19281c;
        r.c(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list3.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + list3).toString());
        }
        r.c(list2, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list2.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + list2).toString());
        }
        List<ConnectionSpec> list4 = this.f19295s;
        if (list4 == null || !list4.isEmpty()) {
            Iterator<T> it2 = list4.iterator();
            while (it2.hasNext()) {
                if (((ConnectionSpec) it2.next()).f19210a) {
                    if (sSLSocketFactory2 == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (certificateChainCleaner2 == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (x509TrustManager2 == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (sSLSocketFactory2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (certificateChainCleaner2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (x509TrustManager2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!r.a(this.f19298w, CertificatePinner.f19178d)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    @Override // okhttp3.Call.Factory
    public final RealCall a(Request request) {
        r.e(request, "request");
        return new RealCall(this, request);
    }

    public final Object clone() {
        return super.clone();
    }

    public OkHttpClient() {
        this(new Builder());
    }
}
