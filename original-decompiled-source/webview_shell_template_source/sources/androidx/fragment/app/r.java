package androidx.fragment.app;

import androidx.camera.camera2.internal.v0;
import androidx.fragment.app.k;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public static final w.g<ClassLoader, w.g<String, Class<?>>> f1221a = new w.g<>();

    public static Class<?> b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        w.g<ClassLoader, w.g<String, Class<?>>> gVar = f1221a;
        w.g<String, Class<?>> gVar2 = gVar.get(classLoader);
        if (gVar2 == null) {
            gVar2 = new w.g<>();
            gVar.put(classLoader, gVar2);
        }
        Class<?> cls = gVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        gVar2.put(str, cls2);
        return cls2;
    }

    public static Class<? extends k> c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e6) {
            throw new k.d(v0.b("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e6);
        } catch (ClassNotFoundException e7) {
            throw new k.d(v0.b("Unable to instantiate fragment ", str, ": make sure class name exists"), e7);
        }
    }

    public k a(String str) {
        throw null;
    }
}
