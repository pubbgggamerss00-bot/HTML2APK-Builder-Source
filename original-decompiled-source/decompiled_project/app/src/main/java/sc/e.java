package sc;

import java.security.GeneralSecurityException;
import java.util.Set;
import sc.f;

/* loaded from: classes2.dex */
public final class e implements f.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zc.e f24798a;

    public e(zc.e eVar) {
        this.f24798a = eVar;
    }

    @Override // sc.f.a
    public final d a(Class cls) throws GeneralSecurityException {
        try {
            return new d(this.f24798a, cls);
        } catch (IllegalArgumentException e10) {
            throw new GeneralSecurityException("Primitive type not supported", e10);
        }
    }

    @Override // sc.f.a
    public final d b() {
        zc.e eVar = this.f24798a;
        return new d(eVar, eVar.f35005c);
    }

    @Override // sc.f.a
    public final Class<?> c() {
        return this.f24798a.getClass();
    }

    @Override // sc.f.a
    public final Set<Class<?>> d() {
        return this.f24798a.f35004b.keySet();
    }
}
