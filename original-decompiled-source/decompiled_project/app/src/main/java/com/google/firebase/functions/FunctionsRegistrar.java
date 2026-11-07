package com.google.firebase.functions;

import ae.h;
import ae.o;
import ae.p;
import ae.q;
import ae.s;
import android.content.Context;
import be.c;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.functions.FunctionsRegistrar;
import id.l;
import java.util.List;
import java.util.concurrent.Executor;
import jd.d;
import kotlin.jvm.internal.r;
import ne.g;
import sd.a;
import sd.b;
import sd.y;
import sd.z;

/* loaded from: classes2.dex */
public final class FunctionsRegistrar implements ComponentRegistrar {
    private static final a Companion = new a();
    private static final String LIBRARY_NAME = "fire-fn";

    public static final class a {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final q getComponents$lambda$0(y liteExecutor, y uiExecutor, b c10) {
        Object obj = be.a.f4210c;
        r.e(liteExecutor, "$liteExecutor");
        r.e(uiExecutor, "$uiExecutor");
        r.e(c10, "c");
        Object objA = c10.a(Context.class);
        r.d(objA, "c.get(Context::class.java)");
        Object objA2 = c10.a(l.class);
        r.d(objA2, "c.get(FirebaseOptions::class.java)");
        Object objG = c10.g(liteExecutor);
        r.d(objG, "c.get(liteExecutor)");
        Object objG2 = c10.g(uiExecutor);
        r.d(objG2, "c.get(uiExecutor)");
        fe.b bVarD = c10.d(rd.b.class);
        r.d(bVarD, "c.getProvider(InternalAuthProvider::class.java)");
        fe.b bVarD2 = c10.d(ee.a.class);
        r.d(bVarD2, "c.getProvider(FirebaseIn…ceIdInternal::class.java)");
        fe.a aVarE = c10.e();
        r.d(aVarE, "c.getDeferred(InteropApp…okenProvider::class.java)");
        c cVarA = c.a((Context) objA);
        p pVar = new p(c.a((l) objA2));
        c cVarA2 = c.a(bVarD);
        c cVarA3 = c.a(bVarD2);
        c cVarA4 = c.a(aVarE);
        c cVarA5 = c.a((Executor) objG);
        h hVar = new h(cVarA2, cVarA3, cVarA4, cVarA5);
        be.a aVar = new be.a();
        aVar.f4212b = obj;
        aVar.f4211a = hVar;
        ae.r rVar = new ae.r(c.a(new s(new o(cVarA, pVar, aVar, cVarA5, c.a((Executor) objG2)))));
        be.a aVar2 = new be.a();
        aVar2.f4212b = obj;
        aVar2.f4211a = rVar;
        return (q) aVar2.get();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<sd.a<?>> getComponents() {
        final y yVar = new y(jd.c.class, Executor.class);
        final y yVar2 = new y(d.class, Executor.class);
        a.C0274a c0274aA = sd.a.a(q.class);
        c0274aA.f24843a = LIBRARY_NAME;
        c0274aA.a(sd.l.b(Context.class));
        c0274aA.a(sd.l.b(l.class));
        c0274aA.a(sd.l.a(rd.b.class));
        c0274aA.a(new sd.l(1, 1, ee.a.class));
        c0274aA.a(new sd.l(0, 2, nd.b.class));
        c0274aA.a(new sd.l((y<?>) yVar, 1, 0));
        c0274aA.a(new sd.l((y<?>) yVar2, 1, 0));
        c0274aA.f24848f = new sd.d() { // from class: ae.t
            @Override // sd.d
            public final Object b(z zVar) {
                return FunctionsRegistrar.getComponents$lambda$0(yVar, yVar2, zVar);
            }
        };
        return qg.p.j(c0274aA.b(), g.a(LIBRARY_NAME, "21.2.1"));
    }
}
