package fd;

import androidx.room.f0;
import ed.o;
import ed.p0;
import java.lang.reflect.GenericDeclaration;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import sc.r;
import sc.s;
import zc.q;

/* loaded from: classes2.dex */
public final class f {
    static {
        q[] qVarArr = {new a(s.class)};
        HashMap map = new HashMap();
        for (q qVar : qVarArr) {
            Object obj = qVar.f35024a;
            Class<PrimitiveT> cls = qVar.f35024a;
            if (map.containsKey(obj)) {
                throw new IllegalArgumentException(f0.b(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            }
            map.put(cls, qVar);
        }
        if (qVarArr.length > 0) {
            GenericDeclaration genericDeclaration = qVarArr[0].f35024a;
        }
        Collections.unmodifiableMap(map);
        q[] qVarArr2 = {new c(s.class)};
        HashMap map2 = new HashMap();
        for (q qVar2 : qVarArr2) {
            Object obj2 = qVar2.f35024a;
            Class<PrimitiveT> cls2 = qVar2.f35024a;
            if (map2.containsKey(obj2)) {
                throw new IllegalArgumentException(f0.b(cls2, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            }
            map2.put(cls2, qVar2);
        }
        if (qVarArr2.length > 0) {
            GenericDeclaration genericDeclaration2 = qVarArr2[0].f35024a;
        }
        Collections.unmodifiableMap(map2);
        int i10 = p0.CONFIG_NAME_FIELD_NUMBER;
        try {
            a();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void a() throws GeneralSecurityException {
        r.g(i.f11180a);
        if (wc.a.a()) {
            return;
        }
        r.e(new b(ed.f.class, new a(s.class)), true);
        r.e(new d(o.class, new c(s.class)), true);
    }
}
