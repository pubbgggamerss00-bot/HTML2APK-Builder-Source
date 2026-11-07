package okhttp3.internal.http;

import c9.u1;
import hi.d0;
import hi.x;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.r;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http2.ConnectionShutdownException;

/* loaded from: classes2.dex */
public final class CallServerInterceptor implements Interceptor {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0183 A[Catch: IOException -> 0x00dc, TryCatch #12 {IOException -> 0x00dc, blocks: (B:68:0x00ce, B:70:0x00d7, B:73:0x00df, B:81:0x0102, B:83:0x010b, B:84:0x010e, B:85:0x0122, B:87:0x0145, B:89:0x0159, B:96:0x0172, B:98:0x0176, B:102:0x0183, B:104:0x0196, B:106:0x01a0, B:107:0x01aa, B:91:0x0163, B:110:0x01ad, B:111:0x01b3, B:86:0x0129), top: B:139:0x00ce, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01bc A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x010b A[Catch: IOException -> 0x00dc, TryCatch #12 {IOException -> 0x00dc, blocks: (B:68:0x00ce, B:70:0x00d7, B:73:0x00df, B:81:0x0102, B:83:0x010b, B:84:0x010e, B:85:0x0122, B:87:0x0145, B:89:0x0159, B:96:0x0172, B:98:0x0176, B:102:0x0183, B:104:0x0196, B:106:0x01a0, B:107:0x01aa, B:91:0x0163, B:110:0x01ad, B:111:0x01b3, B:86:0x0129), top: B:139:0x00ce, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0159 A[Catch: IOException -> 0x00dc, TryCatch #12 {IOException -> 0x00dc, blocks: (B:68:0x00ce, B:70:0x00d7, B:73:0x00df, B:81:0x0102, B:83:0x010b, B:84:0x010e, B:85:0x0122, B:87:0x0145, B:89:0x0159, B:96:0x0172, B:98:0x0176, B:102:0x0183, B:104:0x0196, B:106:0x01a0, B:107:0x01aa, B:91:0x0163, B:110:0x01ad, B:111:0x01b3, B:86:0x0129), top: B:139:0x00ce, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0163 A[Catch: IOException -> 0x00dc, TryCatch #12 {IOException -> 0x00dc, blocks: (B:68:0x00ce, B:70:0x00d7, B:73:0x00df, B:81:0x0102, B:83:0x010b, B:84:0x010e, B:85:0x0122, B:87:0x0145, B:89:0x0159, B:96:0x0172, B:98:0x0176, B:102:0x0183, B:104:0x0196, B:106:0x01a0, B:107:0x01aa, B:91:0x0163, B:110:0x01ad, B:111:0x01b3, B:86:0x0129), top: B:139:0x00ce, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0172 A[Catch: IOException -> 0x00dc, TryCatch #12 {IOException -> 0x00dc, blocks: (B:68:0x00ce, B:70:0x00d7, B:73:0x00df, B:81:0x0102, B:83:0x010b, B:84:0x010e, B:85:0x0122, B:87:0x0145, B:89:0x0159, B:96:0x0172, B:98:0x0176, B:102:0x0183, B:104:0x0196, B:106:0x01a0, B:107:0x01aa, B:91:0x0163, B:110:0x01ad, B:111:0x01b3, B:86:0x0129), top: B:139:0x00ce, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0176 A[Catch: IOException -> 0x00dc, TryCatch #12 {IOException -> 0x00dc, blocks: (B:68:0x00ce, B:70:0x00d7, B:73:0x00df, B:81:0x0102, B:83:0x010b, B:84:0x010e, B:85:0x0122, B:87:0x0145, B:89:0x0159, B:96:0x0172, B:98:0x0176, B:102:0x0183, B:104:0x0196, B:106:0x01a0, B:107:0x01aa, B:91:0x0163, B:110:0x01ad, B:111:0x01b3, B:86:0x0129), top: B:139:0x00ce, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x017b  */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, okhttp3.EventListener] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Response a(RealInterceptorChain realInterceptorChain) throws Throwable {
        Response.Builder builderC;
        Object obj;
        IOException iOException;
        Long l10;
        boolean z10;
        Response responseA;
        int i10;
        Response responseA2;
        ResponseBody responseBody;
        Response.Builder builder;
        boolean z11;
        Exchange exchange = realInterceptorChain.f19533d;
        r.b(exchange);
        RealCall realCall = exchange.f19437a;
        ExchangeCodec exchangeCodec = exchange.f19440d;
        RealConnection realConnection = exchange.f19442f;
        ?? r82 = exchange.f19438b;
        Request request = realInterceptorChain.f19534e;
        RequestBody requestBody = request.f19340d;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z12 = true;
        try {
            try {
                r82.getClass();
                exchangeCodec.b(request);
                try {
                } catch (IOException e10) {
                    e = e10;
                    obj = r82;
                    r82 = 0;
                    builderC = r82;
                    if (e instanceof ConnectionShutdownException) {
                    }
                }
            } catch (IOException e11) {
                r82.getClass();
                exchange.d(e11);
                throw e11;
            }
        } catch (IOException e12) {
            e = e12;
        }
        try {
            try {
                if (HttpMethod.a(request.f19338b) && requestBody != null) {
                    try {
                    } catch (IOException e13) {
                        e = e13;
                    }
                    try {
                        if ("100-continue".equalsIgnoreCase(request.f19339c.c("Expect"))) {
                            try {
                                exchangeCodec.f();
                                builderC = exchange.c(true);
                                try {
                                    r82.getClass();
                                    builder = builderC;
                                    z11 = false;
                                } catch (IOException e14) {
                                    e = e14;
                                    obj = r82;
                                    r82 = 0;
                                    if (e instanceof ConnectionShutdownException) {
                                    }
                                }
                            } catch (IOException e15) {
                                r82.getClass();
                                exchange.d(e15);
                                throw e15;
                            }
                        } else {
                            z11 = true;
                            builder = null;
                        }
                        if (builder == null) {
                            try {
                                d0 d0VarA = x.a(exchange.b(request));
                                requestBody.c(d0VarA);
                                d0VarA.close();
                                obj = r82;
                                z12 = z11;
                                builderC = builder;
                                r82 = 0;
                            } catch (IOException e16) {
                                e = e16;
                                obj = r82;
                                z12 = z11;
                                builderC = builder;
                                r82 = 0;
                                if (e instanceof ConnectionShutdownException) {
                                    throw e;
                                }
                                throw e;
                            }
                        } else {
                            obj = r82;
                            try {
                                realCall.h(exchange, true, false, null);
                                if (realConnection.f19490g == null) {
                                    z12 = false;
                                }
                                if (!z12) {
                                    exchangeCodec.e().k();
                                }
                                z12 = z11;
                                builderC = builder;
                                r82 = 0;
                            } catch (IOException e17) {
                                e = e17;
                                z12 = z11;
                                builderC = builder;
                                r82 = 0;
                                if ((e instanceof ConnectionShutdownException) || !exchange.f19441e) {
                                    throw e;
                                }
                                iOException = e;
                                l10 = r82;
                                z10 = z12;
                                if (builderC == null) {
                                }
                                builderC.f19366a = request;
                                builderC.f19370e = realConnection.f19488e;
                                builderC.f19376k = jCurrentTimeMillis;
                                builderC.f19377l = System.currentTimeMillis();
                                responseA = builderC.a();
                                i10 = responseA.f19356d;
                                if (i10 == 100) {
                                }
                                obj.getClass();
                                Response.Builder builderL = responseA.l();
                                String strH = Response.h("Content-Type", responseA);
                                long jG = exchangeCodec.g(responseA);
                                builderL.f19372g = new RealResponseBody(strH, jG, x.b(new Exchange.ResponseBodySource(exchange, exchangeCodec.c(responseA), jG)));
                                responseA2 = builderL.a();
                                if ("close".equalsIgnoreCase(responseA2.f19353a.f19339c.c("Connection"))) {
                                }
                                if (i10 == 204) {
                                }
                                return responseA2;
                            }
                        }
                    } catch (IOException e18) {
                        e = e18;
                        obj = r82;
                        r82 = 0;
                        builderC = null;
                        if (e instanceof ConnectionShutdownException) {
                        }
                    }
                    z10 = z12;
                    if (builderC == null) {
                        try {
                            builderC = exchange.c(false);
                            r.b(builderC);
                            if (z10) {
                                obj.getClass();
                                z10 = false;
                            }
                        } catch (IOException e19) {
                            if (iOException == null) {
                                throw e19;
                            }
                            u1.b(iOException, e19);
                            throw iOException;
                        }
                    }
                    builderC.f19366a = request;
                    builderC.f19370e = realConnection.f19488e;
                    builderC.f19376k = jCurrentTimeMillis;
                    builderC.f19377l = System.currentTimeMillis();
                    responseA = builderC.a();
                    i10 = responseA.f19356d;
                    if (i10 == 100 || (102 <= i10 && i10 < 200)) {
                        Response.Builder builderC2 = exchange.c(false);
                        r.b(builderC2);
                        if (z10) {
                            obj.getClass();
                        }
                        builderC2.f19366a = request;
                        builderC2.f19370e = realConnection.f19488e;
                        builderC2.f19376k = jCurrentTimeMillis;
                        builderC2.f19377l = System.currentTimeMillis();
                        responseA = builderC2.a();
                        i10 = responseA.f19356d;
                    }
                    obj.getClass();
                    Response.Builder builderL2 = responseA.l();
                    String strH2 = Response.h("Content-Type", responseA);
                    long jG2 = exchangeCodec.g(responseA);
                    builderL2.f19372g = new RealResponseBody(strH2, jG2, x.b(new Exchange.ResponseBodySource(exchange, exchangeCodec.c(responseA), jG2)));
                    responseA2 = builderL2.a();
                    if ("close".equalsIgnoreCase(responseA2.f19353a.f19339c.c("Connection")) || "close".equalsIgnoreCase(Response.h("Connection", responseA2))) {
                        exchangeCodec.e().k();
                    }
                    if (i10 == 204 || i10 == 205) {
                        responseBody = responseA2.f19359g;
                        if ((responseBody == null ? responseBody.h() : -1L) > 0) {
                            StringBuilder sb = new StringBuilder("HTTP ");
                            sb.append(i10);
                            sb.append(" had non-zero Content-Length: ");
                            ResponseBody responseBody2 = responseA2.f19359g;
                            sb.append(responseBody2 != null ? Long.valueOf(responseBody2.h()) : l10);
                            throw new ProtocolException(sb.toString());
                        }
                    }
                    return responseA2;
                }
                obj = r82;
                r82 = 0;
                realCall.h(exchange, true, false, null);
                builderC = null;
                String strH22 = Response.h("Content-Type", responseA);
                long jG22 = exchangeCodec.g(responseA);
                builderL2.f19372g = new RealResponseBody(strH22, jG22, x.b(new Exchange.ResponseBodySource(exchange, exchangeCodec.c(responseA), jG22)));
                responseA2 = builderL2.a();
                if ("close".equalsIgnoreCase(responseA2.f19353a.f19339c.c("Connection"))) {
                    exchangeCodec.e().k();
                }
                if (i10 == 204) {
                    responseBody = responseA2.f19359g;
                    if ((responseBody == null ? responseBody.h() : -1L) > 0) {
                    }
                }
                return responseA2;
            } catch (IOException e20) {
                obj.getClass();
                exchange.d(e20);
                throw e20;
            }
            exchangeCodec.a();
            iOException = r82;
            l10 = r82;
            z10 = z12;
            if (builderC == null) {
            }
            builderC.f19366a = request;
            builderC.f19370e = realConnection.f19488e;
            builderC.f19376k = jCurrentTimeMillis;
            builderC.f19377l = System.currentTimeMillis();
            responseA = builderC.a();
            i10 = responseA.f19356d;
            if (i10 == 100) {
                Response.Builder builderC22 = exchange.c(false);
                r.b(builderC22);
                if (z10) {
                }
                builderC22.f19366a = request;
                builderC22.f19370e = realConnection.f19488e;
                builderC22.f19376k = jCurrentTimeMillis;
                builderC22.f19377l = System.currentTimeMillis();
                responseA = builderC22.a();
                i10 = responseA.f19356d;
            }
            obj.getClass();
            Response.Builder builderL22 = responseA.l();
        } catch (IOException e21) {
            try {
                exchange.d(e21);
                throw e21;
            } catch (IOException e22) {
                e = e22;
                if (e instanceof ConnectionShutdownException) {
                }
            }
        }
    }
}
