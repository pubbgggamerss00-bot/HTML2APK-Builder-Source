package za;

import android.os.IBinder;
import com.google.android.gms.common.internal.p;
import j2.y;
import java.lang.reflect.Field;
import za.a;

/* loaded from: classes2.dex */
public final class b<T> extends a.AbstractBinderC0357a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f34880a;

    public b(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper");
        this.f34880a = obj;
    }

    public static <T> T c(a aVar) throws SecurityException {
        if (aVar instanceof b) {
            return (T) ((b) aVar).f34880a;
        }
        IBinder iBinderAsBinder = aVar.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i10 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i10++;
                field = field2;
            }
        }
        if (i10 != 1) {
            throw new IllegalArgumentException(y.a(declaredFields.length, "Unexpected number of IObjectWrapper declared fields: "));
        }
        p.f(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return (T) field.get(iBinderAsBinder);
        } catch (IllegalAccessException e10) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e10);
        } catch (NullPointerException e11) {
            throw new IllegalArgumentException("Binder object is null.", e11);
        }
    }
}
