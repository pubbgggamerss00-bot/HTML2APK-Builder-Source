package l5;

import androidx.lifecycle.w0;
import java.lang.reflect.InvocationTargetException;
import java.util.ConcurrentModificationException;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class c implements t6.b {
    public static w0 b(Class cls) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        try {
            Object objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
            r.b(objNewInstance);
            return (w0) objNewInstance;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Cannot create an instance of " + cls, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("Cannot create an instance of " + cls, e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("Cannot create an instance of " + cls, e12);
        }
    }

    public static final int c(p.b bVar, Object obj, int i10) {
        int i11 = bVar.f20570c;
        if (i11 == 0) {
            return -1;
        }
        try {
            int iA = q.a.a(i11, i10, bVar.f20568a);
            if (iA < 0 || r.a(obj, bVar.f20569b[iA])) {
                return iA;
            }
            int i12 = iA + 1;
            while (i12 < i11 && bVar.f20568a[i12] == i10) {
                if (r.a(obj, bVar.f20569b[i12])) {
                    return i12;
                }
                i12++;
            }
            for (int i13 = iA - 1; i13 >= 0 && bVar.f20568a[i13] == i10; i13--) {
                if (r.a(obj, bVar.f20569b[i13])) {
                    return i13;
                }
            }
            return ~i12;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // t6.b
    public long a() {
        return System.currentTimeMillis();
    }
}
