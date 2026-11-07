package zc;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import zc.u;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public static final j f35015b = new j();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference<u> f35016a = new AtomicReference<>(new u(new u.a()));

    public final ci.a a(s sVar) throws GeneralSecurityException {
        AtomicReference<u> atomicReference = this.f35016a;
        u uVar = atomicReference.get();
        uVar.getClass();
        hd.a aVar = sVar.f35032b;
        if (!uVar.f35038b.containsKey(new u.b(s.class, aVar))) {
            try {
                f fVar = new f();
                sVar.f35034d.ordinal();
                return fVar;
            } catch (GeneralSecurityException e10) {
                throw new v("Creating a LegacyProtoKey failed", e10);
            }
        }
        u uVar2 = atomicReference.get();
        uVar2.getClass();
        u.b bVar = new u.b(s.class, aVar);
        HashMap map = uVar2.f35038b;
        if (map.containsKey(bVar)) {
            return ((b) map.get(bVar)).a(sVar);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + bVar + " available");
    }

    public final synchronized <SerializationT> void b(b<SerializationT> bVar) throws GeneralSecurityException {
        u.a aVar = new u.a(this.f35016a.get());
        aVar.a(bVar);
        this.f35016a.set(new u(aVar));
    }

    public final synchronized <KeyT extends ci.a, SerializationT> void c(d<KeyT, SerializationT> dVar) throws GeneralSecurityException {
        u.a aVar = new u.a(this.f35016a.get());
        aVar.b(dVar);
        this.f35016a.set(new u(aVar));
    }

    public final synchronized <SerializationT> void d(l<SerializationT> lVar) throws GeneralSecurityException {
        u.a aVar = new u.a(this.f35016a.get());
        aVar.c(lVar);
        this.f35016a.set(new u(aVar));
    }

    public final synchronized <ParametersT extends c5.p, SerializationT> void e(n<ParametersT, SerializationT> nVar) throws GeneralSecurityException {
        u.a aVar = new u.a(this.f35016a.get());
        aVar.d(nVar);
        this.f35016a.set(new u(aVar));
    }
}
