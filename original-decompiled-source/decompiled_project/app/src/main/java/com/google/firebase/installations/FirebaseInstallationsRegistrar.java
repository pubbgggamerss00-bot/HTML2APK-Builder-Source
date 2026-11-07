package com.google.firebase.installations;

import com.google.firebase.components.ComponentRegistrar;
import ge.g;
import ge.h;
import ge.j;
import id.e;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import jd.a;
import sd.a;
import sd.b;
import sd.l;
import sd.y;
import td.u;

/* loaded from: classes2.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static h lambda$getComponents$0(b bVar) {
        return new g((e) bVar.a(e.class), bVar.d(ce.h.class), (ExecutorService) bVar.g(new y(a.class, ExecutorService.class)), new u((Executor) bVar.g(new y(jd.b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<sd.a<?>> getComponents() {
        a.C0274a c0274aA = sd.a.a(h.class);
        c0274aA.f24843a = LIBRARY_NAME;
        c0274aA.a(l.b(e.class));
        c0274aA.a(l.a(ce.h.class));
        c0274aA.a(new l((y<?>) new y(jd.a.class, ExecutorService.class), 1, 0));
        c0274aA.a(new l((y<?>) new y(jd.b.class, Executor.class), 1, 0));
        c0274aA.f24848f = new j();
        sd.a aVarB = c0274aA.b();
        androidx.lifecycle.u uVar = new androidx.lifecycle.u();
        a.C0274a c0274aA2 = sd.a.a(ce.g.class);
        c0274aA2.f24847e = 1;
        c0274aA2.f24848f = new androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.h(uVar);
        return Arrays.asList(aVarB, c0274aA2.b(), ne.g.a(LIBRARY_NAME, "18.0.0"));
    }
}
