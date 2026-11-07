package ig;

import androidx.lifecycle.z0;
import b.k;
import f8.f;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: ig.a$a, reason: collision with other inner class name */
    public interface InterfaceC0137a {
        b a();
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final ng.b f14525a;

        /* renamed from: b, reason: collision with root package name */
        public final f f14526b;

        public b(ng.b bVar, f fVar) {
            this.f14525a = bVar;
            this.f14526b = fVar;
        }
    }

    public static ig.b a(k kVar, z0.c cVar) {
        b bVarA = ((InterfaceC0137a) b3.a.c(InterfaceC0137a.class, kVar)).a();
        ng.b bVar = bVarA.f14525a;
        cVar.getClass();
        return new ig.b(bVar, cVar, bVarA.f14526b);
    }
}
