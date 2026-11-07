package com.google.firebase.appcheck.playintegrity;

import com.google.firebase.components.ComponentRegistrar;
import id.e;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import jd.b;
import jd.c;
import ne.g;
import pd.h;
import sd.a;
import sd.d;
import sd.l;
import sd.y;
import sd.z;

/* loaded from: classes2.dex */
public class FirebaseAppCheckPlayIntegrityRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<a<?>> getComponents() {
        final y yVar = new y(c.class, Executor.class);
        final y yVar2 = new y(b.class, Executor.class);
        a.C0274a c0274aA = a.a(h.class);
        c0274aA.f24843a = "fire-app-check-play-integrity";
        c0274aA.a(l.b(e.class));
        c0274aA.a(new l((y<?>) yVar, 1, 0));
        c0274aA.a(new l((y<?>) yVar2, 1, 0));
        c0274aA.f24848f = new d() { // from class: od.a
            @Override // sd.d
            public final Object b(z zVar) {
                return new h((e) zVar.a(e.class), (Executor) zVar.g(yVar), (Executor) zVar.g(yVar2));
            }
        };
        return Arrays.asList(c0274aA.b(), g.a("fire-app-check-play-integrity", "18.0.0"));
    }
}
