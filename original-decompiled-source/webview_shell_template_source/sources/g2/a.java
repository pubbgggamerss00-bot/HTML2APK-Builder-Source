package g2;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final w.a<String, Method> f13254a;

    /* renamed from: b, reason: collision with root package name */
    public final w.a<String, Method> f13255b;

    /* renamed from: c, reason: collision with root package name */
    public final w.a<String, Class> f13256c;

    public a(w.a<String, Method> aVar, w.a<String, Method> aVar2, w.a<String, Class> aVar3) {
        this.f13254a = aVar;
        this.f13255b = aVar2;
        this.f13256c = aVar3;
    }

    public abstract b a();

    public final Class b(Class<? extends c> cls) throws ClassNotFoundException {
        String name = cls.getName();
        w.a<String, Class> aVar = this.f13256c;
        Class cls2 = aVar.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        aVar.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) throws NoSuchMethodException, SecurityException {
        w.a<String, Method> aVar = this.f13254a;
        Method method = aVar.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, a.class.getClassLoader()).getDeclaredMethod("read", a.class);
        aVar.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        String name = cls.getName();
        w.a<String, Method> aVar = this.f13255b;
        Method method = aVar.get(name);
        if (method != null) {
            return method;
        }
        Class clsB = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsB.getDeclaredMethod("write", cls, a.class);
        aVar.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e();

    public abstract byte[] f();

    public abstract CharSequence g();

    public abstract boolean h(int i6);

    public abstract int i();

    public abstract <T extends Parcelable> T j();

    public abstract String k();

    public final <T extends c> T l() {
        String strK = k();
        if (strK == null) {
            return null;
        }
        try {
            return (T) c(strK).invoke(null, a());
        } catch (ClassNotFoundException e6) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e6);
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e7);
        } catch (NoSuchMethodException e8) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e8);
        } catch (InvocationTargetException e9) {
            if (e9.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e9.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e9);
        }
    }

    public abstract void m(int i6);

    public abstract void n(boolean z6);

    public abstract void o(byte[] bArr);

    public abstract void p(CharSequence charSequence);

    public abstract void q(int i6);

    public abstract void r(Parcelable parcelable);

    public abstract void s(String str);

    /* JADX WARN: Multi-variable type inference failed */
    public final void t(c cVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (cVar == null) {
            s(null);
            return;
        }
        try {
            s(b(cVar.getClass()).getName());
            b bVarA = a();
            try {
                d(cVar.getClass()).invoke(null, cVar, bVarA);
                bVarA.u();
            } catch (ClassNotFoundException e6) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e6);
            } catch (IllegalAccessException e7) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e7);
            } catch (NoSuchMethodException e8) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e8);
            } catch (InvocationTargetException e9) {
                if (!(e9.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e9);
                }
                throw ((RuntimeException) e9.getCause());
            }
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException(cVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e10);
        }
    }
}
