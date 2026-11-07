package sc;

import com.google.crypto.tink.shaded.protobuf.p0;
import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f24799b = Logger.getLogger(f.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f24800a;

    public interface a {
        d a(Class cls) throws GeneralSecurityException;

        d b();

        Class<?> c();

        Set<Class<?>> d();
    }

    public f(f fVar) {
        this.f24800a = new ConcurrentHashMap(fVar.f24800a);
    }

    public final synchronized a a(String str) throws GeneralSecurityException {
        if (!this.f24800a.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return (a) this.f24800a.get(str);
    }

    public final synchronized <KeyProtoT extends p0> void b(zc.e<KeyProtoT> eVar) throws GeneralSecurityException {
        if (!eVar.a().a()) {
            throw new GeneralSecurityException("failed to register key manager " + eVar.getClass() + " as it is not FIPS compatible.");
        }
        c(new e(eVar));
    }

    public final synchronized void c(e eVar) throws GeneralSecurityException {
        try {
            String strB = eVar.b().f24796a.b();
            a aVar = (a) this.f24800a.get(strB);
            if (aVar != null && !aVar.c().equals(eVar.f24798a.getClass())) {
                f24799b.warning("Attempted overwrite of a registered key manager for key type ".concat(strB));
                throw new GeneralSecurityException("typeUrl (" + strB + ") is already registered with " + aVar.c().getName() + ", cannot be re-registered with " + eVar.f24798a.getClass().getName());
            }
            this.f24800a.putIfAbsent(strB, eVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public f() {
        this.f24800a = new ConcurrentHashMap();
    }
}
