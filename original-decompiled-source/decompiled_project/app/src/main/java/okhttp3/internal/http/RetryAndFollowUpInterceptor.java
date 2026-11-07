package okhttp3.internal.http;

import c9.u1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.r;
import okhttp3.Address;
import okhttp3.CertificatePinner;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.ExchangeFinder;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.RealConnectionPool;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.connection.RouteSelector;
import okhttp3.internal.http2.ConnectionShutdownException;
import pg.f0;
import qg.x;
import qg.z;

/* loaded from: classes2.dex */
public final class RetryAndFollowUpInterceptor implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    public final OkHttpClient f19543a;

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    static {
        new Companion(0);
    }

    public RetryAndFollowUpInterceptor(OkHttpClient okHttpClient) {
        this.f19543a = okHttpClient;
    }

    public static int d(Response response, int i10) throws NumberFormatException {
        String strH = Response.h("Retry-After", response);
        if (strH == null) {
            return i10;
        }
        Pattern patternCompile = Pattern.compile("\\d+");
        r.d(patternCompile, "compile(...)");
        if (!patternCompile.matcher(strH).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strH);
        r.d(numValueOf, "valueOf(header)");
        return numValueOf.intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0085, code lost:
    
        if (r9 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0087, code lost:
    
        r0 = r0.l();
        r4 = r9.l();
        r4.f19372g = null;
        r4 = r4.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0098, code lost:
    
        if (r4.f19359g != null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009a, code lost:
    
        r0.f19375j = r4;
        r0 = r0.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a0, code lost:
    
        r9 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ad, code lost:
    
        throw new java.lang.IllegalArgumentException("priorResponse.body != null");
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b0, code lost:
    
        r4 = b(r9, r3.f19473k);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b6, code lost:
    
        if (r4 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b8, code lost:
    
        r3.f(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bc, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bd, code lost:
    
        r0 = r9.f19359g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bf, code lost:
    
        if (r0 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c1, code lost:
    
        okhttp3.internal.Util.c(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c4, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c8, code lost:
    
        if (r10 > 20) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e6, code lost:
    
        throw new java.net.ProtocolException("Too many follow-up requests: " + r10);
     */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Response a(RealInterceptorChain realInterceptorChain) throws IOException {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        CertificatePinner certificatePinner;
        Request request = realInterceptorChain.f19534e;
        RealCall realCall = realInterceptorChain.f19530a;
        List listP = z.f22752a;
        Response response = null;
        int i10 = 0;
        Request request2 = request;
        while (true) {
            boolean z10 = true;
            while (true) {
                r.e(request2, "request");
                if (realCall.f19473k != null) {
                    throw new IllegalStateException("Check failed.");
                }
                synchronized (realCall) {
                    if (realCall.f19475m) {
                        throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                    }
                    if (realCall.f19474l) {
                        throw new IllegalStateException("Check failed.");
                    }
                    f0 f0Var = f0.f21461a;
                }
                if (z10) {
                    RealConnectionPool realConnectionPool = realCall.f19466c;
                    HttpUrl httpUrl = request2.f19337a;
                    OkHttpClient okHttpClient = realCall.f19464a;
                    if (httpUrl.f19263i) {
                        SSLSocketFactory sSLSocketFactory2 = okHttpClient.f19293q;
                        if (sSLSocketFactory2 == null) {
                            throw new IllegalStateException("CLEARTEXT-only client");
                        }
                        HostnameVerifier hostnameVerifier2 = okHttpClient.f19297v;
                        certificatePinner = okHttpClient.f19298w;
                        sSLSocketFactory = sSLSocketFactory2;
                        hostnameVerifier = hostnameVerifier2;
                    } else {
                        sSLSocketFactory = null;
                        hostnameVerifier = null;
                        certificatePinner = null;
                    }
                    realCall.f19471h = new ExchangeFinder(realConnectionPool, new Address(httpUrl.f19258d, httpUrl.f19259e, okHttpClient.f19289l, okHttpClient.f19292p, sSLSocketFactory, hostnameVerifier, certificatePinner, okHttpClient.f19291n, okHttpClient.f19296t, okHttpClient.f19295s, okHttpClient.f19290m), realCall, realCall.f19467d);
                }
                try {
                    if (realCall.f19477p) {
                        throw new IOException("Canceled");
                    }
                    try {
                        Response responseB = realInterceptorChain.b(request2);
                        break;
                    } catch (IOException e10) {
                        if (!c(e10, realCall, request2, !(e10 instanceof ConnectionShutdownException))) {
                            Iterator it = listP.iterator();
                            while (it.hasNext()) {
                                u1.b(e10, (Exception) it.next());
                            }
                            throw e10;
                        }
                        listP = x.P(e10, listP);
                        realCall.f(true);
                        z10 = false;
                    } catch (RouteException e11) {
                        if (!c(e11.f19513b, realCall, request2, false)) {
                            IOException iOException = e11.f19512a;
                            r.e(iOException, "<this>");
                            Iterator it2 = listP.iterator();
                            while (it2.hasNext()) {
                                u1.b(iOException, (Exception) it2.next());
                            }
                            throw iOException;
                        }
                        listP = x.P(e11.f19512a, listP);
                        realCall.f(true);
                        z10 = false;
                    }
                } catch (Throwable th2) {
                    realCall.f(true);
                    throw th2;
                }
            }
            realCall.f(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Request b(Response response, Exchange exchange) throws IOException {
        HttpUrl.Builder builder;
        Response response2;
        RealConnection realConnection;
        Route route = (exchange == null || (realConnection = exchange.f19442f) == null) ? null : realConnection.f19485b;
        int i10 = response.f19356d;
        String str = response.f19353a.f19338b;
        if (i10 == 307 || i10 == 308) {
            OkHttpClient okHttpClient = this.f19543a;
            if (okHttpClient.f19286h) {
                String strH = Response.h("Location", response);
                Request request = response.f19353a;
                if (strH != null) {
                    HttpUrl httpUrl = request.f19337a;
                    httpUrl.getClass();
                    try {
                        builder = new HttpUrl.Builder();
                        builder.b(httpUrl, strH);
                    } catch (IllegalArgumentException unused) {
                        builder = null;
                    }
                    HttpUrl httpUrlA = builder != null ? builder.a() : null;
                    if (httpUrlA != null && (r.a(httpUrlA.f19255a, request.f19337a.f19255a) || okHttpClient.f19287j)) {
                        Request.Builder builderA = request.a();
                        if (HttpMethod.a(str)) {
                            int i11 = response.f19356d;
                            HttpMethod.f19529a.getClass();
                            boolean z10 = str.equals("PROPFIND") || i11 == 308 || i11 == 307;
                            if (str.equals("PROPFIND") || i11 == 308 || i11 == 307) {
                                builderA.c(str, z10 ? request.f19340d : null);
                            } else {
                                builderA.c("GET", null);
                            }
                            if (!z10) {
                                builderA.f19345c.c("Transfer-Encoding");
                                builderA.f19345c.c("Content-Length");
                                builderA.f19345c.c("Content-Type");
                            }
                        }
                        if (!Util.a(request.f19337a, httpUrlA)) {
                            builderA.f19345c.c("Authorization");
                        }
                        builderA.f19343a = httpUrlA;
                        return builderA.a();
                    }
                }
            }
        } else {
            if (i10 == 401) {
                return this.f19543a.f19285g.a(route, response);
            }
            if (i10 != 421) {
                if (i10 == 503) {
                    Response response3 = response.f19362k;
                    if ((response3 == null || response3.f19356d != 503) && d(response, Integer.MAX_VALUE) == 0) {
                        return response.f19353a;
                    }
                } else {
                    if (i10 == 407) {
                        r.b(route);
                        if (route.f19383b.type() == Proxy.Type.HTTP) {
                            return this.f19543a.f19291n.a(route, response);
                        }
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    }
                    if (i10 != 408) {
                        switch (i10) {
                            case 300:
                            case 301:
                            case 302:
                            case 303:
                                break;
                            default:
                                return null;
                        }
                    } else if (this.f19543a.f19284f && (((response2 = response.f19362k) == null || response2.f19356d != 408) && d(response, 0) <= 0)) {
                        return response.f19353a;
                    }
                }
            } else if (exchange != null && !r.a(exchange.f19439c.f19455b.f19157h.f19258d, exchange.f19442f.f19485b.f19382a.f19157h.f19258d)) {
                RealConnection realConnection2 = exchange.f19442f;
                synchronized (realConnection2) {
                    realConnection2.f19494k = true;
                }
                return response.f19353a;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(IOException iOException, RealCall realCall, Request request, boolean z10) {
        ExchangeFinder exchangeFinder;
        int i10;
        boolean zA;
        RouteSelector routeSelector;
        RealConnection realConnection;
        if (!this.f19543a.f19284f || ((z10 && (iOException instanceof FileNotFoundException)) || (iOException instanceof ProtocolException))) {
            return false;
        }
        if (!(iOException instanceof InterruptedIOException)) {
            if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
                return false;
            }
            exchangeFinder = realCall.f19471h;
            r.b(exchangeFinder);
            i10 = exchangeFinder.f19460g;
            if (i10 != 0) {
                if (exchangeFinder.f19463j == null) {
                }
            }
        } else if ((iOException instanceof SocketTimeoutException) && !z10) {
            exchangeFinder = realCall.f19471h;
            r.b(exchangeFinder);
            i10 = exchangeFinder.f19460g;
            if (i10 != 0 && exchangeFinder.f19461h == 0 && exchangeFinder.f19462i == 0) {
                zA = false;
            } else if (exchangeFinder.f19463j == null) {
                zA = true;
            } else {
                Route route = null;
                if (i10 <= 1 && exchangeFinder.f19461h <= 1 && exchangeFinder.f19462i <= 0 && (realConnection = exchangeFinder.f19456c.f19472j) != null) {
                    synchronized (realConnection) {
                        if (realConnection.f19495l == 0 && Util.a(realConnection.f19485b.f19382a.f19157h, exchangeFinder.f19455b.f19157h)) {
                            route = realConnection.f19485b;
                        }
                    }
                }
                if (route != null) {
                    exchangeFinder.f19463j = route;
                } else {
                    RouteSelector.Selection selection = exchangeFinder.f19458e;
                    if ((selection == null || !selection.a()) && (routeSelector = exchangeFinder.f19459f) != null) {
                        zA = routeSelector.a();
                    }
                }
                zA = true;
            }
            if (zA) {
                return true;
            }
        }
        return false;
    }
}
