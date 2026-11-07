package okhttp3.internal.http;

import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.internal.r;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;

/* loaded from: classes2.dex */
public final class RealInterceptorChain implements Interceptor.Chain {

    /* renamed from: a, reason: collision with root package name */
    public final RealCall f19530a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f19531b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19532c;

    /* renamed from: d, reason: collision with root package name */
    public final Exchange f19533d;

    /* renamed from: e, reason: collision with root package name */
    public final Request f19534e;

    /* renamed from: f, reason: collision with root package name */
    public final int f19535f;

    /* renamed from: g, reason: collision with root package name */
    public final int f19536g;

    /* renamed from: h, reason: collision with root package name */
    public final int f19537h;

    /* renamed from: i, reason: collision with root package name */
    public int f19538i;

    public RealInterceptorChain(RealCall realCall, ArrayList arrayList, int i10, Exchange exchange, Request request, int i11, int i12, int i13) {
        r.e(request, "request");
        this.f19530a = realCall;
        this.f19531b = arrayList;
        this.f19532c = i10;
        this.f19533d = exchange;
        this.f19534e = request;
        this.f19535f = i11;
        this.f19536g = i12;
        this.f19537h = i13;
    }

    public static RealInterceptorChain a(RealInterceptorChain realInterceptorChain, int i10, Exchange exchange, Request request, int i11) {
        if ((i11 & 1) != 0) {
            i10 = realInterceptorChain.f19532c;
        }
        int i12 = i10;
        if ((i11 & 2) != 0) {
            exchange = realInterceptorChain.f19533d;
        }
        Exchange exchange2 = exchange;
        if ((i11 & 4) != 0) {
            request = realInterceptorChain.f19534e;
        }
        Request request2 = request;
        int i13 = realInterceptorChain.f19535f;
        int i14 = realInterceptorChain.f19536g;
        int i15 = realInterceptorChain.f19537h;
        r.e(request2, "request");
        return new RealInterceptorChain(realInterceptorChain.f19530a, realInterceptorChain.f19531b, i12, exchange2, request2, i13, i14, i15);
    }

    public final Response b(Request request) throws IOException {
        r.e(request, "request");
        ArrayList arrayList = this.f19531b;
        int size = arrayList.size();
        int i10 = this.f19532c;
        if (i10 >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.f19538i++;
        Exchange exchange = this.f19533d;
        if (exchange != null) {
            if (!exchange.f19439c.b(request.f19337a)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i10 - 1) + " must retain the same host and port").toString());
            }
            if (this.f19538i != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i10 - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i11 = i10 + 1;
        RealInterceptorChain realInterceptorChainA = a(this, i11, null, request, 58);
        Interceptor interceptor = (Interceptor) arrayList.get(i10);
        Response responseA = interceptor.a(realInterceptorChainA);
        if (responseA == null) {
            throw new NullPointerException("interceptor " + interceptor + " returned null");
        }
        if (exchange != null && i11 < arrayList.size() && realInterceptorChainA.f19538i != 1) {
            throw new IllegalStateException(("network interceptor " + interceptor + " must call proceed() exactly once").toString());
        }
        if (responseA.f19359g != null) {
            return responseA;
        }
        throw new IllegalStateException(("interceptor " + interceptor + " returned a response with no body").toString());
    }
}
