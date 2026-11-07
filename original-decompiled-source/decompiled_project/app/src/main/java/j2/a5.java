package j2;

import m0.z2;

/* loaded from: classes.dex */
public interface a5 {
    void a(p1.e eVar, eh.a<pg.f0> aVar, eh.a<pg.f0> aVar2, eh.a<pg.f0> aVar3, eh.a<pg.f0> aVar4);

    void b();

    default void c(p1.e eVar, eh.a aVar, eh.a aVar2, eh.a aVar3, eh.a aVar4, z2.a aVar5) {
        a(eVar, aVar, aVar2, aVar3, aVar4);
    }

    b5 getStatus();
}
