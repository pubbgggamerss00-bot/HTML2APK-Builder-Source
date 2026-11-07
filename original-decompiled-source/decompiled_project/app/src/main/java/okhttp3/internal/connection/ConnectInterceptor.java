package okhttp3.internal.connection;

import java.io.IOException;
import kotlin.jvm.internal.r;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;
import pg.f0;

/* loaded from: classes2.dex */
public final class ConnectInterceptor implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    public static final ConnectInterceptor f19432a = new ConnectInterceptor();

    private ConnectInterceptor() {
    }

    @Override // okhttp3.Interceptor
    public final Response a(RealInterceptorChain realInterceptorChain) throws IOException {
        RealCall realCall = realInterceptorChain.f19530a;
        synchronized (realCall) {
            if (!realCall.f19476n) {
                throw new IllegalStateException("released");
            }
            if (realCall.f19475m) {
                throw new IllegalStateException("Check failed.");
            }
            if (realCall.f19474l) {
                throw new IllegalStateException("Check failed.");
            }
            f0 f0Var = f0.f21461a;
        }
        ExchangeFinder exchangeFinder = realCall.f19471h;
        r.b(exchangeFinder);
        OkHttpClient okHttpClient = realCall.f19464a;
        try {
            Exchange exchange = new Exchange(realCall, realCall.f19467d, exchangeFinder, exchangeFinder.a(realInterceptorChain.f19535f, realInterceptorChain.f19536g, realInterceptorChain.f19537h, okHttpClient.f19284f, !r.a(realInterceptorChain.f19534e.f19338b, "GET")).j(okHttpClient, realInterceptorChain));
            realCall.f19473k = exchange;
            realCall.f19478q = exchange;
            synchronized (realCall) {
                realCall.f19474l = true;
                realCall.f19475m = true;
            }
            if (realCall.f19477p) {
                throw new IOException("Canceled");
            }
            return RealInterceptorChain.a(realInterceptorChain, 0, exchange, null, 61).b(realInterceptorChain.f19534e);
        } catch (IOException e10) {
            exchangeFinder.c(e10);
            throw new RouteException(e10);
        } catch (RouteException e11) {
            exchangeFinder.c(e11.f19513b);
            throw e11;
        }
    }
}
