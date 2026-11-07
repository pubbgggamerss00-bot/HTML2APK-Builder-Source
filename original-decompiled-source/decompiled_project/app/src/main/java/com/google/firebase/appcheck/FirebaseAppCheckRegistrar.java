package com.google.firebase.appcheck;

import androidx.lifecycle.u;
import ce.g;
import ce.h;
import com.google.firebase.components.ComponentRegistrar;
import id.e;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import jd.b;
import jd.c;
import jd.d;
import ld.i;
import sd.a;
import sd.l;
import sd.y;
import sd.z;

/* loaded from: classes2.dex */
public class FirebaseAppCheckRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<a<?>> getComponents() {
        final y yVar = new y(d.class, Executor.class);
        final y yVar2 = new y(c.class, Executor.class);
        final y yVar3 = new y(jd.a.class, Executor.class);
        final y yVar4 = new y(b.class, ScheduledExecutorService.class);
        a.C0274a c0274a = new a.C0274a(kd.d.class, new Class[]{nd.b.class});
        c0274a.f24843a = "fire-app-check";
        c0274a.a(l.b(e.class));
        c0274a.a(new l((y<?>) yVar, 1, 0));
        c0274a.a(new l((y<?>) yVar2, 1, 0));
        c0274a.a(new l((y<?>) yVar3, 1, 0));
        c0274a.a(new l((y<?>) yVar4, 1, 0));
        c0274a.a(l.a(h.class));
        c0274a.f24848f = new sd.d() { // from class: kd.e
            @Override // sd.d
            public final Object b(z zVar) {
                return new i((id.e) zVar.a(id.e.class), zVar.d(h.class), (Executor) zVar.g(yVar), (Executor) zVar.g(yVar2), (Executor) zVar.g(yVar3), (ScheduledExecutorService) zVar.g(yVar4));
            }
        };
        if (!(c0274a.f24846d == 0)) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        c0274a.f24846d = 1;
        a aVarB = c0274a.b();
        u uVar = new u();
        a.C0274a c0274aA = a.a(g.class);
        c0274aA.f24847e = 1;
        c0274aA.f24848f = new androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.h(uVar);
        return Arrays.asList(aVarB, c0274aA.b(), ne.g.a("fire-app-check", "18.0.0"));
    }
}
