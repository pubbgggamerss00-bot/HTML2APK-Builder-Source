package okhttp3;

import java.io.Closeable;
import kotlin.jvm.internal.r;
import okhttp3.Headers;
import okhttp3.internal.connection.Exchange;

/* loaded from: classes2.dex */
public final class Response implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final Request f19353a;

    /* renamed from: b, reason: collision with root package name */
    public final Protocol f19354b;

    /* renamed from: c, reason: collision with root package name */
    public final String f19355c;

    /* renamed from: d, reason: collision with root package name */
    public final int f19356d;

    /* renamed from: e, reason: collision with root package name */
    public final Handshake f19357e;

    /* renamed from: f, reason: collision with root package name */
    public final Headers f19358f;

    /* renamed from: g, reason: collision with root package name */
    public final ResponseBody f19359g;

    /* renamed from: h, reason: collision with root package name */
    public final Response f19360h;

    /* renamed from: j, reason: collision with root package name */
    public final Response f19361j;

    /* renamed from: k, reason: collision with root package name */
    public final Response f19362k;

    /* renamed from: l, reason: collision with root package name */
    public final long f19363l;

    /* renamed from: m, reason: collision with root package name */
    public final long f19364m;

    /* renamed from: n, reason: collision with root package name */
    public final Exchange f19365n;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public Request f19366a;

        /* renamed from: b, reason: collision with root package name */
        public Protocol f19367b;

        /* renamed from: d, reason: collision with root package name */
        public String f19369d;

        /* renamed from: e, reason: collision with root package name */
        public Handshake f19370e;

        /* renamed from: g, reason: collision with root package name */
        public ResponseBody f19372g;

        /* renamed from: h, reason: collision with root package name */
        public Response f19373h;

        /* renamed from: i, reason: collision with root package name */
        public Response f19374i;

        /* renamed from: j, reason: collision with root package name */
        public Response f19375j;

        /* renamed from: k, reason: collision with root package name */
        public long f19376k;

        /* renamed from: l, reason: collision with root package name */
        public long f19377l;

        /* renamed from: m, reason: collision with root package name */
        public Exchange f19378m;

        /* renamed from: c, reason: collision with root package name */
        public int f19368c = -1;

        /* renamed from: f, reason: collision with root package name */
        public Headers.Builder f19371f = new Headers.Builder();

        public static void b(String str, Response response) {
            if (response != null) {
                if (response.f19359g != null) {
                    throw new IllegalArgumentException(str.concat(".body != null").toString());
                }
                if (response.f19360h != null) {
                    throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
                }
                if (response.f19361j != null) {
                    throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
                }
                if (response.f19362k != null) {
                    throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
                }
            }
        }

        public final Response a() {
            int i10 = this.f19368c;
            if (i10 < 0) {
                throw new IllegalStateException(("code < 0: " + this.f19368c).toString());
            }
            Request request = this.f19366a;
            if (request == null) {
                throw new IllegalStateException("request == null");
            }
            Protocol protocol = this.f19367b;
            if (protocol == null) {
                throw new IllegalStateException("protocol == null");
            }
            String str = this.f19369d;
            if (str != null) {
                return new Response(request, protocol, str, i10, this.f19370e, this.f19371f.b(), this.f19372g, this.f19373h, this.f19374i, this.f19375j, this.f19376k, this.f19377l, this.f19378m);
            }
            throw new IllegalStateException("message == null");
        }

        public final void c(Headers headers) {
            r.e(headers, "headers");
            this.f19371f = headers.f();
        }
    }

    public Response(Request request, Protocol protocol, String message, int i10, Handshake handshake, Headers headers, ResponseBody responseBody, Response response, Response response2, Response response3, long j10, long j11, Exchange exchange) {
        r.e(request, "request");
        r.e(protocol, "protocol");
        r.e(message, "message");
        this.f19353a = request;
        this.f19354b = protocol;
        this.f19355c = message;
        this.f19356d = i10;
        this.f19357e = handshake;
        this.f19358f = headers;
        this.f19359g = responseBody;
        this.f19360h = response;
        this.f19361j = response2;
        this.f19362k = response3;
        this.f19363l = j10;
        this.f19364m = j11;
        this.f19365n = exchange;
    }

    public static String h(String str, Response response) {
        response.getClass();
        String strC = response.f19358f.c(str);
        if (strC == null) {
            return null;
        }
        return strC;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ResponseBody responseBody = this.f19359g;
        if (responseBody == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        responseBody.close();
    }

    public final Builder l() {
        Builder builder = new Builder();
        builder.f19366a = this.f19353a;
        builder.f19367b = this.f19354b;
        builder.f19368c = this.f19356d;
        builder.f19369d = this.f19355c;
        builder.f19370e = this.f19357e;
        builder.f19371f = this.f19358f.f();
        builder.f19372g = this.f19359g;
        builder.f19373h = this.f19360h;
        builder.f19374i = this.f19361j;
        builder.f19375j = this.f19362k;
        builder.f19376k = this.f19363l;
        builder.f19377l = this.f19364m;
        builder.f19378m = this.f19365n;
        return builder;
    }

    public final String toString() {
        return "Response{protocol=" + this.f19354b + ", code=" + this.f19356d + ", message=" + this.f19355c + ", url=" + this.f19353a.f19337a + '}';
    }
}
