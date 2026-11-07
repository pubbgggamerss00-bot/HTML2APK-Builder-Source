package k3;

import android.os.IBinder;
import com.google.android.gms.common.internal.l;
import java.lang.reflect.Field;
import k3.a;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b<T> extends a.AbstractBinderC0073a {
    public final Object s;

    public b(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper");
        this.s = obj;
    }

    public static <T> T i1(a aVar) throws SecurityException {
        if (aVar instanceof b) {
            return (T) ((b) aVar).s;
        }
        IBinder iBinderAsBinder = aVar.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i6 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i6++;
                field = field2;
            }
        }
        if (i6 != 1) {
            int length = declaredFields.length;
            StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 53);
            sb.append("Unexpected number of IObjectWrapper declared fields: ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
        l.f(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return (T) field.get(iBinderAsBinder);
        } catch (IllegalAccessException e6) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e6);
        } catch (NullPointerException e7) {
            throw new IllegalArgumentException("Binder object is null.", e7);
        }
    }
}
