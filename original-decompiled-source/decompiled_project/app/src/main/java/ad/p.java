package ad;

import ad.l;
import androidx.room.f0;
import ed.b0;
import ed.p0;
import java.lang.reflect.GenericDeclaration;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class p {
    static {
        zc.q[] qVarArr = {new l.a(sc.n.class)};
        HashMap map = new HashMap();
        zc.q qVar = qVarArr[0];
        Class<PrimitiveT> cls = qVar.f35024a;
        if (map.containsKey(cls)) {
            throw new IllegalArgumentException(f0.b(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        map.put(cls, qVar);
        GenericDeclaration genericDeclaration = qVarArr[0].f35024a;
        Collections.unmodifiableMap(map);
        int i10 = p0.CONFIG_NAME_FIELD_NUMBER;
        try {
            a();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void a() throws GeneralSecurityException {
        sc.r.g(s.f451c);
        sc.r.g(i.f419a);
        sc.r.e(new l(b0.class, new l.a(sc.n.class)), true);
        zc.m mVar = o.f445a;
        zc.j jVar = zc.j.f35015b;
        jVar.e(o.f445a);
        jVar.d(o.f446b);
        jVar.c(o.f447c);
        jVar.b(o.f448d);
        zc.i iVar = zc.i.f35013b;
        iVar.a(l.f425d);
        if (wc.a.a()) {
            return;
        }
        sc.r.e(new d(ed.a.class, new c(sc.n.class)), true);
        jVar.e(g.f415a);
        jVar.d(g.f416b);
        jVar.c(g.f417c);
        jVar.b(g.f418d);
        iVar.a(d.f403d);
    }
}
