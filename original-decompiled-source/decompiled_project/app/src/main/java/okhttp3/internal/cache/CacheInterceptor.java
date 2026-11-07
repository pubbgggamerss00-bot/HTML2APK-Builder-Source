package okhttp3.internal.cache;

import java.io.IOException;
import kotlin.jvm.internal.r;
import mh.t;
import mh.x;
import okhttp3.CacheControl;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.http.RealInterceptorChain;

/* loaded from: classes2.dex */
public final class CacheInterceptor implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    public static final Companion f19402a = new Companion(0);

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        public static final Response a(Companion companion, Response response) {
            companion.getClass();
            if ((response != null ? response.f19359g : null) == null) {
                return response;
            }
            Response.Builder builderL = response.l();
            builderL.f19372g = null;
            return builderL.a();
        }

        public static boolean b(String str) {
            return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Response a(RealInterceptorChain realInterceptorChain) throws NumberFormatException, IOException {
        CacheStrategy cacheStrategy;
        int i10;
        int i11;
        CacheStrategy cacheStrategy2;
        int i12;
        Headers headers;
        String string;
        RealCall realCall = realInterceptorChain.f19530a;
        System.currentTimeMillis();
        Request request = realInterceptorChain.f19534e;
        r.e(request, "request");
        CacheStrategy cacheStrategy3 = new CacheStrategy(request, null);
        CacheControl cacheControl = request.f19342f;
        if (cacheControl == null) {
            CacheControl.Companion companion = CacheControl.f19163n;
            Headers headers2 = request.f19339c;
            companion.getClass();
            int size = headers2.size();
            boolean z10 = true;
            String str = null;
            boolean z11 = true;
            int i13 = 0;
            boolean z12 = false;
            boolean z13 = false;
            int iY = -1;
            int iY2 = -1;
            boolean z14 = false;
            boolean z15 = false;
            boolean z16 = false;
            int iY3 = -1;
            int iY4 = -1;
            boolean z17 = false;
            boolean z18 = false;
            boolean z19 = false;
            while (i13 < size) {
                String strE = headers2.e(i13);
                String strG = headers2.g(i13);
                if (t.j(strE, "Cache-Control", z10)) {
                    if (str == null) {
                        str = strG;
                    }
                    i11 = 0;
                    while (i11 < strG.length()) {
                        int length = strG.length();
                        boolean z20 = z10;
                        int length2 = i11;
                        while (true) {
                            if (length2 >= length) {
                                cacheStrategy2 = cacheStrategy3;
                                i12 = size;
                                length2 = strG.length();
                                break;
                            }
                            cacheStrategy2 = cacheStrategy3;
                            i12 = size;
                            if (x.s("=,;", strG.charAt(length2))) {
                                break;
                            }
                            length2++;
                            cacheStrategy3 = cacheStrategy2;
                            size = i12;
                        }
                        String strSubstring = strG.substring(i11, length2);
                        r.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        String string2 = x.W(strSubstring).toString();
                        if (length2 == strG.length() || strG.charAt(length2) == ',' || strG.charAt(length2) == ';') {
                            headers = headers2;
                            i11 = length2 + 1;
                            string = null;
                        } else {
                            int length3 = length2 + 1;
                            byte[] bArr = Util.f19393a;
                            int length4 = strG.length();
                            while (true) {
                                if (length3 >= length4) {
                                    length3 = strG.length();
                                    break;
                                }
                                char cCharAt = strG.charAt(length3);
                                int i14 = length4;
                                if (cCharAt != ' ' && cCharAt != '\t') {
                                    break;
                                }
                                length3++;
                                length4 = i14;
                            }
                            if (length3 >= strG.length() || strG.charAt(length3) != '\"') {
                                int length5 = strG.length();
                                int length6 = length3;
                                while (true) {
                                    if (length6 >= length5) {
                                        headers = headers2;
                                        length6 = strG.length();
                                        break;
                                    }
                                    int i15 = length5;
                                    headers = headers2;
                                    if (x.s(",;", strG.charAt(length6))) {
                                        break;
                                    }
                                    length6++;
                                    length5 = i15;
                                    headers2 = headers;
                                }
                                String strSubstring2 = strG.substring(length3, length6);
                                r.d(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                string = x.W(strSubstring2).toString();
                                i11 = length6;
                            } else {
                                int i16 = length3 + 1;
                                int iX = x.x(strG, '\"', i16, 4);
                                String strSubstring3 = strG.substring(i16, iX);
                                r.d(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                                i11 = iX + 1;
                                headers = headers2;
                                string = strSubstring3;
                            }
                        }
                        if ("no-cache".equalsIgnoreCase(string2)) {
                            z10 = z20;
                            z12 = z10;
                        } else if ("no-store".equalsIgnoreCase(string2)) {
                            z10 = z20;
                            z13 = z10;
                        } else {
                            if ("max-age".equalsIgnoreCase(string2)) {
                                iY = Util.y(-1, string);
                            } else if ("s-maxage".equalsIgnoreCase(string2)) {
                                iY2 = Util.y(-1, string);
                            } else if ("private".equalsIgnoreCase(string2)) {
                                z10 = z20;
                                z14 = z10;
                            } else if ("public".equalsIgnoreCase(string2)) {
                                z10 = z20;
                                z15 = z10;
                            } else if ("must-revalidate".equalsIgnoreCase(string2)) {
                                z10 = z20;
                                z16 = z10;
                            } else if ("max-stale".equalsIgnoreCase(string2)) {
                                iY3 = Util.y(Integer.MAX_VALUE, string);
                            } else if ("min-fresh".equalsIgnoreCase(string2)) {
                                iY4 = Util.y(-1, string);
                            } else if ("only-if-cached".equalsIgnoreCase(string2)) {
                                z10 = z20;
                                z17 = z10;
                            } else if ("no-transform".equalsIgnoreCase(string2)) {
                                z10 = z20;
                                z18 = z10;
                            } else {
                                z10 = z20;
                                if ("immutable".equalsIgnoreCase(string2)) {
                                    z19 = z10;
                                }
                            }
                            z10 = z20;
                        }
                        cacheStrategy3 = cacheStrategy2;
                        size = i12;
                        headers2 = headers;
                    }
                    i13++;
                    z10 = z10;
                    cacheStrategy3 = cacheStrategy3;
                    size = size;
                    headers2 = headers2;
                } else if (!t.j(strE, "Pragma", z10)) {
                    i13++;
                    z10 = z10;
                    cacheStrategy3 = cacheStrategy3;
                    size = size;
                    headers2 = headers2;
                }
                z11 = false;
                i11 = 0;
                while (i11 < strG.length()) {
                }
                i13++;
                z10 = z10;
                cacheStrategy3 = cacheStrategy3;
                size = size;
                headers2 = headers2;
            }
            cacheStrategy = cacheStrategy3;
            CacheControl cacheControl2 = new CacheControl(z12, z13, iY, iY2, z14, z15, z16, iY3, iY4, z17, z18, z19, !z11 ? null : str);
            request.f19342f = cacheControl2;
            cacheControl = cacheControl2;
        } else {
            cacheStrategy = cacheStrategy3;
        }
        CacheStrategy cacheStrategy4 = cacheControl.f19173j ? new CacheStrategy(null, null) : cacheStrategy;
        Object obj = realCall.f19467d;
        if (obj == null) {
            obj = EventListener.f19241a;
        }
        Request request2 = cacheStrategy4.f19404a;
        Response response = cacheStrategy4.f19405b;
        if (request2 == null && response == null) {
            Response.Builder builder = new Response.Builder();
            Request request3 = realInterceptorChain.f19534e;
            r.e(request3, "request");
            builder.f19366a = request3;
            builder.f19367b = Protocol.HTTP_1_1;
            builder.f19368c = 504;
            builder.f19369d = "Unsatisfiable Request (only-if-cached)";
            builder.f19372g = Util.f19395c;
            builder.f19376k = -1L;
            builder.f19377l = System.currentTimeMillis();
            Response responseA = builder.a();
            obj.getClass();
            return responseA;
        }
        Companion companion2 = f19402a;
        if (request2 == null) {
            r.b(response);
            Response.Builder builderL = response.l();
            Response responseA2 = Companion.a(companion2, response);
            Response.Builder.b("cacheResponse", responseA2);
            builderL.f19374i = responseA2;
            Response responseA3 = builderL.a();
            obj.getClass();
            return responseA3;
        }
        if (response != null) {
            obj.getClass();
        }
        Response responseB = realInterceptorChain.b(request2);
        if (response != null) {
            if (responseB.f19356d == 304) {
                Response.Builder builderL2 = response.l();
                Headers headers3 = response.f19358f;
                Headers headers4 = responseB.f19358f;
                companion2.getClass();
                Headers.Builder builder2 = new Headers.Builder();
                int size2 = headers3.size();
                int i17 = 0;
                while (i17 < size2) {
                    String strE2 = headers3.e(i17);
                    String strG2 = headers3.g(i17);
                    Headers headers5 = headers3;
                    if ("Warning".equalsIgnoreCase(strE2)) {
                        i10 = size2;
                        if (t.p(strG2, "1", false)) {
                        }
                        i17++;
                        size2 = i10;
                        headers3 = headers5;
                    } else {
                        i10 = size2;
                    }
                    if ("Content-Length".equalsIgnoreCase(strE2) || "Content-Encoding".equalsIgnoreCase(strE2) || "Content-Type".equalsIgnoreCase(strE2) || !Companion.b(strE2) || headers4.c(strE2) == null) {
                        builder2.a(strE2, strG2);
                    }
                    i17++;
                    size2 = i10;
                    headers3 = headers5;
                }
                int size3 = headers4.size();
                for (int i18 = 0; i18 < size3; i18++) {
                    String strE3 = headers4.e(i18);
                    if (!"Content-Length".equalsIgnoreCase(strE3) && !"Content-Encoding".equalsIgnoreCase(strE3) && !"Content-Type".equalsIgnoreCase(strE3) && Companion.b(strE3)) {
                        builder2.a(strE3, headers4.g(i18));
                    }
                }
                builderL2.c(builder2.b());
                builderL2.f19376k = responseB.f19363l;
                builderL2.f19377l = responseB.f19364m;
                Response responseA4 = Companion.a(companion2, response);
                Response.Builder.b("cacheResponse", responseA4);
                builderL2.f19374i = responseA4;
                Response responseA5 = Companion.a(companion2, responseB);
                Response.Builder.b("networkResponse", responseA5);
                builderL2.f19373h = responseA5;
                builderL2.a();
                ResponseBody responseBody = responseB.f19359g;
                r.b(responseBody);
                responseBody.close();
                r.b(null);
                throw null;
            }
            ResponseBody responseBody2 = response.f19359g;
            if (responseBody2 != null) {
                Util.c(responseBody2);
            }
        }
        Response.Builder builderL3 = responseB.l();
        Response responseA6 = Companion.a(companion2, response);
        Response.Builder.b("cacheResponse", responseA6);
        builderL3.f19374i = responseA6;
        Response responseA7 = Companion.a(companion2, responseB);
        Response.Builder.b("networkResponse", responseA7);
        builderL3.f19373h = responseA7;
        return builderL3.a();
    }
}
