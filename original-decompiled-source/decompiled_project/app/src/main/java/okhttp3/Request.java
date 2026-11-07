package okhttp3;

import i8.n;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.r;
import mh.t;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpMethod;
import qg.a0;
import qg.k0;
import qg.p;

/* loaded from: classes2.dex */
public final class Request {

    /* renamed from: a, reason: collision with root package name */
    public final HttpUrl f19337a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19338b;

    /* renamed from: c, reason: collision with root package name */
    public final Headers f19339c;

    /* renamed from: d, reason: collision with root package name */
    public final RequestBody f19340d;

    /* renamed from: e, reason: collision with root package name */
    public final Map<Class<?>, Object> f19341e;

    /* renamed from: f, reason: collision with root package name */
    public CacheControl f19342f;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public HttpUrl f19343a;

        /* renamed from: d, reason: collision with root package name */
        public RequestBody f19346d;

        /* renamed from: e, reason: collision with root package name */
        public LinkedHashMap f19347e = new LinkedHashMap();

        /* renamed from: b, reason: collision with root package name */
        public String f19344b = "GET";

        /* renamed from: c, reason: collision with root package name */
        public Headers.Builder f19345c = new Headers.Builder();

        public final Request a() {
            Map mapUnmodifiableMap;
            HttpUrl httpUrl = this.f19343a;
            if (httpUrl == null) {
                throw new IllegalStateException("url == null");
            }
            String str = this.f19344b;
            Headers headersB = this.f19345c.b();
            RequestBody requestBody = this.f19346d;
            LinkedHashMap linkedHashMap = this.f19347e;
            byte[] bArr = Util.f19393a;
            r.e(linkedHashMap, "<this>");
            if (linkedHashMap.isEmpty()) {
                mapUnmodifiableMap = a0.f22708a;
            } else {
                mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
                r.d(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
            }
            return new Request(httpUrl, str, headersB, requestBody, mapUnmodifiableMap);
        }

        public final void b(String str, String value) {
            r.e(value, "value");
            Headers.Builder builder = this.f19345c;
            builder.getClass();
            Headers.f19250b.getClass();
            Headers.Companion.a(str);
            Headers.Companion.b(value, str);
            builder.c(str);
            builder.a(str, value);
        }

        public final void c(String method, RequestBody requestBody) {
            r.e(method, "method");
            if (method.length() <= 0) {
                throw new IllegalArgumentException("method.isEmpty() == true");
            }
            if (requestBody == null) {
                HttpMethod httpMethod = HttpMethod.f19529a;
                if (method.equals("POST") || method.equals("PUT") || method.equals("PATCH") || method.equals("PROPPATCH") || method.equals("REPORT")) {
                    throw new IllegalArgumentException(n.d("method ", method, " must have a request body.").toString());
                }
            } else if (!HttpMethod.a(method)) {
                throw new IllegalArgumentException(n.d("method ", method, " must not have a request body.").toString());
            }
            this.f19344b = method;
            this.f19346d = requestBody;
        }

        public final void d(String url) {
            r.e(url, "url");
            if (t.p(url, "ws:", true)) {
                String strSubstring = url.substring(3);
                r.d(strSubstring, "this as java.lang.String).substring(startIndex)");
                url = "http:".concat(strSubstring);
            } else if (t.p(url, "wss:", true)) {
                String strSubstring2 = url.substring(4);
                r.d(strSubstring2, "this as java.lang.String).substring(startIndex)");
                url = "https:".concat(strSubstring2);
            }
            HttpUrl.f19253j.getClass();
            this.f19343a = HttpUrl.Companion.c(url);
        }
    }

    public Request(HttpUrl url, String method, Headers headers, RequestBody requestBody, Map<Class<?>, ? extends Object> map) {
        r.e(url, "url");
        r.e(method, "method");
        this.f19337a = url;
        this.f19338b = method;
        this.f19339c = headers;
        this.f19340d = requestBody;
        this.f19341e = map;
    }

    public final Builder a() {
        Builder builder = new Builder();
        builder.f19347e = new LinkedHashMap();
        builder.f19343a = this.f19337a;
        builder.f19344b = this.f19338b;
        builder.f19346d = this.f19340d;
        Map<Class<?>, Object> map = this.f19341e;
        builder.f19347e = map.isEmpty() ? new LinkedHashMap() : k0.k(map);
        builder.f19345c = this.f19339c.f();
        return builder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.f19338b);
        sb.append(", url=");
        sb.append(this.f19337a);
        Headers headers = this.f19339c;
        if (headers.size() != 0) {
            sb.append(", headers=[");
            int i10 = 0;
            for (pg.n<? extends String, ? extends String> nVar : headers) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    p.o();
                    throw null;
                }
                pg.n<? extends String, ? extends String> nVar2 = nVar;
                String str = (String) nVar2.f21469a;
                String str2 = (String) nVar2.f21470b;
                if (i10 > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                i10 = i11;
            }
            sb.append(']');
        }
        Map<Class<?>, Object> map = this.f19341e;
        if (!map.isEmpty()) {
            sb.append(", tags=");
            sb.append(map);
        }
        sb.append('}');
        String string = sb.toString();
        r.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
