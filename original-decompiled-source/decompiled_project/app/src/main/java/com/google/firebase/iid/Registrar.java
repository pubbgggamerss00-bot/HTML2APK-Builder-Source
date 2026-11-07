package com.google.firebase.iid;

import ce.i;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.iid.a;
import de.n;
import de.o;
import de.p;
import id.e;
import java.util.Arrays;
import java.util.List;
import ne.g;
import ne.h;
import sd.a;
import sd.l;

/* loaded from: classes2.dex */
public final class Registrar implements ComponentRegistrar {

    public static class a implements ee.a {

        /* renamed from: a, reason: collision with root package name */
        public final FirebaseInstanceId f6888a;

        public a(FirebaseInstanceId firebaseInstanceId) {
            this.f6888a = firebaseInstanceId;
        }

        @Override // ee.a
        public final String a() {
            FirebaseInstanceId firebaseInstanceId = this.f6888a;
            FirebaseInstanceId.c(firebaseInstanceId.f6881b);
            a.C0074a c0074aE = firebaseInstanceId.e(n.b(firebaseInstanceId.f6881b), "*");
            if (firebaseInstanceId.h(c0074aE)) {
                synchronized (firebaseInstanceId) {
                    if (!firebaseInstanceId.f6886g) {
                        firebaseInstanceId.g(0L);
                    }
                }
            }
            if (c0074aE != null) {
                return c0074aE.f6893a;
            }
            int i10 = a.C0074a.f6892e;
            return null;
        }
    }

    public static final /* synthetic */ FirebaseInstanceId lambda$getComponents$0$Registrar(sd.b bVar) {
        return new FirebaseInstanceId((e) bVar.a(e.class), bVar.d(h.class), bVar.d(i.class), (ge.h) bVar.a(ge.h.class));
    }

    public static final /* synthetic */ ee.a lambda$getComponents$1$Registrar(sd.b bVar) {
        return new a((FirebaseInstanceId) bVar.a(FirebaseInstanceId.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<sd.a<?>> getComponents() {
        a.C0274a c0274aA = sd.a.a(FirebaseInstanceId.class);
        c0274aA.a(l.b(e.class));
        c0274aA.a(l.a(h.class));
        c0274aA.a(l.a(i.class));
        c0274aA.a(l.b(ge.h.class));
        c0274aA.f24848f = o.f7898a;
        if (!(c0274aA.f24846d == 0)) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        c0274aA.f24846d = 1;
        sd.a aVarB = c0274aA.b();
        a.C0274a c0274aA2 = sd.a.a(ee.a.class);
        c0274aA2.a(l.b(FirebaseInstanceId.class));
        c0274aA2.f24848f = p.f7899a;
        return Arrays.asList(aVarB, c0274aA2.b(), g.a("fire-iid", "21.1.0"));
    }
}
