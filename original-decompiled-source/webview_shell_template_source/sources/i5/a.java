package i5;

import i5.f;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class a implements g5.d<Object>, d, Serializable {
    public final g5.d<Object> s;

    public a(g5.d<Object> dVar) {
        this.s = dVar;
    }

    public g5.d a(g5.d dVar, Object obj) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @Override // i5.d
    public final d c() {
        g5.d<Object> dVar = this.s;
        if (dVar instanceof d) {
            return (d) dVar;
        }
        return null;
    }

    public abstract Object d(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // g5.d
    public final void g(Object obj) {
        g5.d dVar = this;
        while (true) {
            a aVar = (a) dVar;
            g5.d dVar2 = aVar.s;
            j.b(dVar2);
            try {
                obj = aVar.d(obj);
                if (obj == h5.a.s) {
                    return;
                }
            } catch (Throwable th) {
                obj = d5.e.a(th);
            }
            aVar.e();
            if (!(dVar2 instanceof a)) {
                dVar2.g(obj);
                return;
            }
            dVar = dVar2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.StackTraceElement] */
    public String toString() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        int iIntValue;
        String strC;
        StringBuilder sb = new StringBuilder("Continuation at ");
        e eVar = (e) getClass().getAnnotation(e.class);
        String name = null;
        if (eVar != null) {
            int iV = eVar.v();
            if (iV > 1) {
                throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + iV + ". Please update the Kotlin standard library.").toString());
            }
            try {
                Field declaredField = getClass().getDeclaredField("label");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(this);
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                iIntValue = (num != null ? num.intValue() : 0) - 1;
            } catch (Exception unused) {
                iIntValue = -1;
            }
            int i6 = iIntValue >= 0 ? eVar.l()[iIntValue] : -1;
            f.a aVar = f.f13376b;
            f.a aVar2 = f.f13375a;
            if (aVar == null) {
                try {
                    f.a aVar3 = new f.a(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                    f.f13376b = aVar3;
                    aVar = aVar3;
                } catch (Exception unused2) {
                    f.f13376b = aVar2;
                    aVar = aVar2;
                }
            }
            if (aVar != aVar2) {
                Method method = aVar.f13377a;
                Object objInvoke = method != null ? method.invoke(getClass(), null) : null;
                if (objInvoke != null) {
                    Method method2 = aVar.f13378b;
                    Object objInvoke2 = method2 != null ? method2.invoke(objInvoke, null) : null;
                    if (objInvoke2 != null) {
                        Method method3 = aVar.f13379c;
                        String strInvoke = method3 != null ? method3.invoke(objInvoke2, null) : null;
                        if (strInvoke instanceof String) {
                            name = strInvoke;
                        }
                    }
                }
            }
            if (name == null) {
                strC = eVar.c();
            } else {
                strC = name + '/' + eVar.c();
            }
            name = new StackTraceElement(strC, eVar.m(), eVar.f(), i6);
        }
        if (name == null) {
            name = getClass().getName();
        }
        sb.append((Object) name);
        return sb.toString();
    }

    public void e() {
    }
}
