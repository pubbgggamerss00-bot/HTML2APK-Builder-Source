package ad;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import sc.o;

/* loaded from: classes2.dex */
public final class i implements sc.p<h, h> {

    /* renamed from: a, reason: collision with root package name */
    public static final i f419a = new i();

    public static class a implements h {
    }

    @Override // sc.p
    public final Class<h> a() {
        return h.class;
    }

    @Override // sc.p
    public final h b(sc.o<h> oVar) throws GeneralSecurityException {
        if (oVar.f24816b == null) {
            throw new GeneralSecurityException("no primary in primitive set");
        }
        Iterator<List<o.b<h>>> it = oVar.f24815a.values().iterator();
        while (it.hasNext()) {
            Iterator<o.b<h>> it2 = it.next().iterator();
            while (it2.hasNext()) {
                h hVar = it2.next().f24822a;
            }
        }
        return new a();
    }

    @Override // sc.p
    public final Class<h> c() {
        return h.class;
    }
}
