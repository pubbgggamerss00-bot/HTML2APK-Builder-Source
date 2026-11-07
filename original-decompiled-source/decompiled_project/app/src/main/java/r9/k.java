package r9;

import android.content.Context;
import java.util.concurrent.Executor;
import r9.o;

/* loaded from: classes.dex */
public final class k extends v {

    /* renamed from: a, reason: collision with root package name */
    public og.a<Executor> f23294a;

    /* renamed from: b, reason: collision with root package name */
    public t9.c f23295b;

    /* renamed from: c, reason: collision with root package name */
    public og.a f23296c;

    /* renamed from: d, reason: collision with root package name */
    public y9.t f23297d;

    /* renamed from: e, reason: collision with root package name */
    public og.a<String> f23298e;

    /* renamed from: f, reason: collision with root package name */
    public og.a<y9.l> f23299f;

    /* renamed from: g, reason: collision with root package name */
    public og.a<u> f23300g;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public Context f23301a;

        public final k a() {
            Context context = this.f23301a;
            if (context == null) {
                throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
            }
            k kVar = new k();
            kVar.f23294a = t9.a.a(o.a.f23304a);
            t9.c cVar = new t9.c(context);
            kVar.f23295b = cVar;
            kVar.f23296c = t9.a.a(new s9.k(cVar, new s9.i(cVar)));
            t9.c cVar2 = kVar.f23295b;
            kVar.f23297d = new y9.t(cVar2);
            og.a<String> aVarA = t9.a.a(new y9.e(cVar2));
            kVar.f23298e = aVarA;
            og.a<y9.l> aVarA2 = t9.a.a(new y9.m(kVar.f23297d, aVarA));
            kVar.f23299f = aVarA2;
            w9.f fVar = new w9.f();
            t9.c cVar3 = kVar.f23295b;
            w9.g gVar = new w9.g(cVar3, aVarA2, fVar);
            og.a<Executor> aVar = kVar.f23294a;
            og.a aVar2 = kVar.f23296c;
            kVar.f23300g = t9.a.a(new w(new w9.d(aVar, aVar2, gVar, aVarA2, aVarA2), new x9.r(cVar3, aVar2, aVarA2, gVar, aVar, aVarA2, aVarA2), new x9.v(aVar, aVarA2, gVar, aVarA2)));
            return kVar;
        }
    }
}
