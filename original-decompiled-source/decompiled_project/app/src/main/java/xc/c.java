package xc;

import androidx.room.f0;
import ed.p0;
import ed.v;
import java.lang.reflect.GenericDeclaration;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import sc.r;
import zc.q;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f33539a = 0;

    static {
        q[] qVarArr = {new a(sc.c.class)};
        HashMap map = new HashMap();
        q qVar = qVarArr[0];
        Class<PrimitiveT> cls = qVar.f35024a;
        if (map.containsKey(cls)) {
            throw new IllegalArgumentException(f0.b(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        map.put(cls, qVar);
        GenericDeclaration genericDeclaration = qVarArr[0].f35024a;
        Collections.unmodifiableMap(map);
        int i10 = p0.CONFIG_NAME_FIELD_NUMBER;
        try {
            r.g(d.f33541b);
            if (wc.a.a()) {
                return;
            }
            r.e(new b(v.class, new a(sc.c.class)), true);
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }
}
