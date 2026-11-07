package com.google.firebase.auth;

import androidx.lifecycle.u;
import ce.g;
import ce.h;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import qd.k0;
import sd.a;
import sd.l;
import sd.y;

/* loaded from: classes2.dex */
public class FirebaseAuthRegistrar implements ComponentRegistrar {
    public static FirebaseAuth lambda$getComponents$0(y yVar, y yVar2, y yVar3, y yVar4, y yVar5, sd.b bVar) {
        id.e eVar = (id.e) bVar.a(id.e.class);
        fe.b bVarD = bVar.d(nd.b.class);
        fe.b bVarD2 = bVar.d(h.class);
        return new rd.e(eVar, bVarD, bVarD2, (Executor) bVar.g(yVar2), (Executor) bVar.g(yVar3), (ScheduledExecutorService) bVar.g(yVar4), (Executor) bVar.g(yVar5));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<sd.a<?>> getComponents() {
        y yVar = new y(jd.a.class, Executor.class);
        y yVar2 = new y(jd.b.class, Executor.class);
        y yVar3 = new y(jd.c.class, Executor.class);
        y yVar4 = new y(jd.c.class, ScheduledExecutorService.class);
        y yVar5 = new y(jd.d.class, Executor.class);
        a.C0274a c0274a = new a.C0274a(FirebaseAuth.class, new Class[]{rd.b.class});
        c0274a.a(l.b(id.e.class));
        c0274a.a(new l(1, 1, h.class));
        c0274a.a(new l((y<?>) yVar, 1, 0));
        c0274a.a(new l((y<?>) yVar2, 1, 0));
        c0274a.a(new l((y<?>) yVar3, 1, 0));
        c0274a.a(new l((y<?>) yVar4, 1, 0));
        c0274a.a(new l((y<?>) yVar5, 1, 0));
        c0274a.a(l.a(nd.b.class));
        k0 k0Var = new k0();
        k0Var.f22683a = yVar;
        k0Var.f22684b = yVar2;
        k0Var.f22685c = yVar3;
        k0Var.f22686d = yVar4;
        k0Var.f22687e = yVar5;
        c0274a.f24848f = k0Var;
        sd.a aVarB = c0274a.b();
        u uVar = new u();
        a.C0274a c0274aA = sd.a.a(g.class);
        c0274aA.f24847e = 1;
        c0274aA.f24848f = new androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.h(uVar);
        return Arrays.asList(aVarB, c0274aA.b(), ne.g.a("fire-auth", "23.2.1"));
    }
}
