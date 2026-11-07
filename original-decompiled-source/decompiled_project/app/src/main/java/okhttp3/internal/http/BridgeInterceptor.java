package okhttp3.internal.http;

import hi.x;
import java.io.IOException;
import kotlin.jvm.internal.r;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;

/* loaded from: classes2.dex */
public final class BridgeInterceptor implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    public final CookieJar f19525a;

    public BridgeInterceptor(CookieJar cookieJar) {
        r.e(cookieJar, "cookieJar");
        this.f19525a = cookieJar;
    }

    @Override // okhttp3.Interceptor
    public final Response a(RealInterceptorChain realInterceptorChain) throws IOException, NumberFormatException {
        ResponseBody responseBody;
        Request request = realInterceptorChain.f19534e;
        Request.Builder builderA = request.a();
        Headers headers = request.f19339c;
        HttpUrl httpUrl = request.f19337a;
        RequestBody requestBody = request.f19340d;
        if (requestBody != null) {
            MediaType mediaTypeB = requestBody.b();
            if (mediaTypeB != null) {
                builderA.b("Content-Type", mediaTypeB.f19276a);
            }
            long jA = requestBody.a();
            if (jA != -1) {
                builderA.b("Content-Length", String.valueOf(jA));
                builderA.f19345c.c("Transfer-Encoding");
            } else {
                builderA.b("Transfer-Encoding", "chunked");
                builderA.f19345c.c("Content-Length");
            }
        }
        boolean z10 = false;
        if (headers.c("Host") == null) {
            builderA.b("Host", Util.w(httpUrl, false));
        }
        if (headers.c("Connection") == null) {
            builderA.b("Connection", "Keep-Alive");
        }
        if (headers.c("Accept-Encoding") == null && headers.c("Range") == null) {
            builderA.b("Accept-Encoding", "gzip");
            z10 = true;
        }
        CookieJar cookieJar = this.f19525a;
        cookieJar.b(httpUrl);
        if (headers.c("User-Agent") == null) {
            builderA.b("User-Agent", "okhttp/4.12.0");
        }
        Response responseB = realInterceptorChain.b(builderA.a());
        Headers headers2 = responseB.f19358f;
        HttpHeaders.d(cookieJar, httpUrl, headers2);
        Response.Builder builderL = responseB.l();
        builderL.f19366a = request;
        if (z10 && "gzip".equalsIgnoreCase(Response.h("Content-Encoding", responseB)) && HttpHeaders.a(responseB) && (responseBody = responseB.f19359g) != null) {
            hi.r rVar = new hi.r(responseBody.s0());
            Headers.Builder builderF = headers2.f();
            builderF.c("Content-Encoding");
            builderF.c("Content-Length");
            builderL.c(builderF.b());
            builderL.f19372g = new RealResponseBody(Response.h("Content-Type", responseB), -1L, x.b(rVar));
        }
        return builderL.a();
    }
}
