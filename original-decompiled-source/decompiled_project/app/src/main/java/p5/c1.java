package p5;

import java.util.LinkedHashMap;
import p5.b1;

/* loaded from: classes.dex */
public final class c1 {

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f21197b = new LinkedHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f21198a = new LinkedHashMap();

    public static final class a {
        public static String a(Class cls) {
            LinkedHashMap linkedHashMap = c1.f21197b;
            String strValue = (String) linkedHashMap.get(cls);
            if (strValue == null) {
                b1.a aVar = (b1.a) cls.getAnnotation(b1.a.class);
                strValue = aVar != null ? aVar.value() : null;
                if (strValue == null || strValue.length() <= 0) {
                    throw new IllegalArgumentException("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()).toString());
                }
                linkedHashMap.put(cls, strValue);
            }
            kotlin.jvm.internal.r.b(strValue);
            return strValue;
        }
    }

    public final void a(b1 navigator) {
        kotlin.jvm.internal.r.e(navigator, "navigator");
        String strA = a.a(navigator.getClass());
        if (strA.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        LinkedHashMap linkedHashMap = this.f21198a;
        b1 b1Var = (b1) linkedHashMap.get(strA);
        if (kotlin.jvm.internal.r.a(b1Var, navigator)) {
            return;
        }
        if (b1Var != null && b1Var.f21194b) {
            throw new IllegalStateException(("Navigator " + navigator + " is replacing an already attached " + b1Var).toString());
        }
        if (!navigator.f21194b) {
            return;
        }
        throw new IllegalStateException(("Navigator " + navigator + " is already attached to another NavController").toString());
    }

    public final <T extends b1<?>> T b(String name) {
        kotlin.jvm.internal.r.e(name, "name");
        if (name.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        T t3 = (T) this.f21198a.get(name);
        if (t3 != null) {
            return t3;
        }
        throw new IllegalStateException(i8.n.d("Could not find Navigator with name \"", name, "\". You must call NavController.addNavigator() for each navigation type."));
    }
}
