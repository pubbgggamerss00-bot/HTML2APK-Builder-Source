package tc;

import ad.l;
import com.google.crypto.tink.shaded.protobuf.p0;
import java.lang.reflect.GenericDeclaration;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class d extends zc.q<sc.a, ed.d> {
    @Override // zc.q
    public final sc.a a(p0 p0Var) throws GeneralSecurityException {
        ed.d dVar = (ed.d) p0Var;
        zc.q[] qVarArr = {new f(gd.o.class)};
        HashMap map = new HashMap();
        for (zc.q qVar : qVarArr) {
            Class<PrimitiveT> cls = qVar.f35024a;
            if (map.containsKey(cls)) {
                throw new IllegalArgumentException(androidx.room.f0.b(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            }
            map.put(cls, qVar);
        }
        if (qVarArr.length > 0) {
            GenericDeclaration genericDeclaration = qVarArr[0].f35024a;
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
        ed.i iVarZ = dVar.z();
        zc.q qVar2 = (zc.q) mapUnmodifiableMap.get(gd.o.class);
        if (qVar2 == null) {
            throw new IllegalArgumentException("Requested primitive class " + gd.o.class.getCanonicalName() + " not supported.");
        }
        gd.o oVar = (gd.o) qVar2.a(iVarZ);
        zc.q[] qVarArr2 = {new l.a(sc.n.class)};
        HashMap map2 = new HashMap();
        for (zc.q qVar3 : qVarArr2) {
            Class<PrimitiveT> cls2 = qVar3.f35024a;
            if (map2.containsKey(cls2)) {
                throw new IllegalArgumentException(androidx.room.f0.b(cls2, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            }
            map2.put(cls2, qVar3);
        }
        if (qVarArr2.length > 0) {
            GenericDeclaration genericDeclaration2 = qVarArr2[0].f35024a;
        }
        Map mapUnmodifiableMap2 = Collections.unmodifiableMap(map2);
        ed.b0 b0VarA = dVar.A();
        zc.q qVar4 = (zc.q) mapUnmodifiableMap2.get(sc.n.class);
        if (qVar4 != null) {
            return new gd.j(oVar, (sc.n) qVar4.a(b0VarA), dVar.A().B().A());
        }
        throw new IllegalArgumentException("Requested primitive class " + sc.n.class.getCanonicalName() + " not supported.");
    }
}
