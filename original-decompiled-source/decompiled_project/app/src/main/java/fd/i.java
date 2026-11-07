package fd;

import java.security.GeneralSecurityException;
import sc.o;
import sc.p;
import sc.s;

/* loaded from: classes2.dex */
public final class i implements p<s, s> {

    /* renamed from: a, reason: collision with root package name */
    public static final i f11180a = new i();

    @Override // sc.p
    public final Class<s> a() {
        return s.class;
    }

    @Override // sc.p
    public final s b(o<s> oVar) throws GeneralSecurityException {
        g gVar = new g();
        if (oVar.f24816b == null) {
            throw new GeneralSecurityException("Missing primary primitive.");
        }
        gVar.f11179a = oVar;
        return gVar;
    }

    @Override // sc.p
    public final Class<s> c() {
        return s.class;
    }
}
