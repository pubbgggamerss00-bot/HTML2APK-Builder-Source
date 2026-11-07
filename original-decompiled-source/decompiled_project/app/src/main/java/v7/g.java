package v7;

import hi.d0;
import hi.i;
import hi.j;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pg.n;
import pg.q;
import qg.k0;
import s7.o;
import s7.p;
import s7.r;
import s7.s;

/* loaded from: classes.dex */
public final class g {
    /* JADX WARN: Multi-variable type inference failed */
    public static final r a(Response response) {
        i iVarS0;
        int i10 = response.f19356d;
        long j10 = response.f19363l;
        long j11 = response.f19364m;
        Headers headers = response.f19358f;
        o.a aVar = new o.a();
        Iterator<n<? extends String, ? extends String>> it = headers.iterator();
        while (true) {
            kotlin.jvm.internal.b bVar = (kotlin.jvm.internal.b) it;
            if (!bVar.hasNext()) {
                break;
            }
            n nVar = (n) bVar.next();
            aVar.a((String) nVar.f21469a, (String) nVar.f21470b);
        }
        o oVar = new o(k0.j(aVar.f24579a));
        ResponseBody responseBody = response.f19359g;
        return new r(i10, j10, j11, oVar, (responseBody == null || (iVarS0 = responseBody.s0()) == null) ? null : new s(iVarS0), response);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(p pVar, vg.c cVar) {
        f fVar;
        Request.Builder builder;
        String str;
        Request.Builder builder2;
        Request.Builder builder3;
        p pVar2;
        String str2;
        RequestBody requestBody;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i10 = fVar.f30667f;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                fVar.f30667f = i10 - PKIFailureInfo.systemUnavail;
            } else {
                fVar = new f(cVar);
            }
        }
        Object obj = fVar.f30666e;
        ug.a aVar = ug.a.f29706a;
        int i11 = fVar.f30667f;
        if (i11 == 0) {
            q.b(obj);
            builder = new Request.Builder();
            builder.d(pVar.f24580a);
            String str3 = pVar.f24581b;
            s7.q qVar = pVar.f24583d;
            if (qVar == null) {
                str = str3;
                builder2 = builder;
                requestBody = null;
                String str4 = str;
                pVar2 = pVar;
                str2 = str4;
                builder3 = builder;
                builder3.c(str2, requestBody);
                o oVar = pVar2.f24582c;
                Headers.Builder builder4 = new Headers.Builder();
                for (Map.Entry<String, List<String>> entry : oVar.f24578a.entrySet()) {
                    String name = entry.getKey();
                    for (String value : entry.getValue()) {
                        kotlin.jvm.internal.r.e(name, "name");
                        kotlin.jvm.internal.r.e(value, "value");
                        Headers.f19250b.getClass();
                        Headers.Companion.a(name);
                        builder4.a(name, value);
                    }
                }
                Headers headersB = builder4.b();
                builder2.getClass();
                builder2.f19345c = headersB.f();
                return builder2.a();
            }
            fVar.f30662a = pVar;
            fVar.f30663b = builder;
            fVar.f30664c = builder;
            fVar.f30665d = str3;
            fVar.f30667f = 1;
            Object objC = c(qVar, fVar);
            if (objC == aVar) {
                return aVar;
            }
            builder3 = builder;
            obj = objC;
            pVar2 = pVar;
            str2 = str3;
            builder2 = builder3;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = fVar.f30665d;
            builder3 = fVar.f30664c;
            builder2 = fVar.f30663b;
            pVar2 = fVar.f30662a;
            q.b(obj);
        }
        final j jVar = (j) obj;
        if (jVar != null) {
            RequestBody.f19348a.getClass();
            requestBody = new RequestBody() { // from class: okhttp3.RequestBody$Companion$toRequestBody$1
                @Override // okhttp3.RequestBody
                public final long a() {
                    return jVar.d();
                }

                @Override // okhttp3.RequestBody
                public final MediaType b() {
                    return null;
                }

                @Override // okhttp3.RequestBody
                public final void c(d0 d0Var) throws IOException {
                    d0Var.A(jVar);
                }
            };
            builder3.c(str2, requestBody);
            o oVar2 = pVar2.f24582c;
            Headers.Builder builder42 = new Headers.Builder();
            while (r5.hasNext()) {
            }
            Headers headersB2 = builder42.b();
            builder2.getClass();
            builder2.f19345c = headersB2.f();
            return builder2.a();
        }
        p pVar3 = pVar2;
        str = str2;
        pVar = pVar3;
        builder = builder3;
        requestBody = null;
        String str42 = str;
        pVar2 = pVar;
        str2 = str42;
        builder3 = builder;
        builder3.c(str2, requestBody);
        o oVar22 = pVar2.f24582c;
        Headers.Builder builder422 = new Headers.Builder();
        while (r5.hasNext()) {
        }
        Headers headersB22 = builder422.b();
        builder2.getClass();
        builder2.f19345c = headersB22.f();
        return builder2.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(s7.q qVar, vg.c cVar) {
        e eVar;
        hi.g gVar;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i10 = eVar.f30661c;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                eVar.f30661c = i10 - PKIFailureInfo.systemUnavail;
            } else {
                eVar = new e(cVar);
            }
        }
        Object obj = eVar.f30660b;
        ug.a aVar = ug.a.f29706a;
        int i11 = eVar.f30661c;
        if (i11 == 0) {
            q.b(obj);
            hi.g gVar2 = new hi.g();
            eVar.f30659a = gVar2;
            eVar.f30661c = 1;
            if (qVar.a() == aVar) {
                return aVar;
            }
            gVar = gVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gVar = eVar.f30659a;
            q.b(obj);
        }
        return gVar.m(gVar.f13061b);
    }
}
