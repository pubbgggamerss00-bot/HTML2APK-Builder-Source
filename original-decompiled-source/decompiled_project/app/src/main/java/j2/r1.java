package j2;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Rect;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class r1 implements p1 {

    /* renamed from: a, reason: collision with root package name */
    public static final r1 f14888a = new r1();

    @Override // j2.p1
    public final Rect a(Activity activity) throws Exception {
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
            kotlin.jvm.internal.r.c(objInvoke, "null cannot be cast to non-null type android.graphics.Rect");
            return new Rect((Rect) objInvoke);
        } catch (Exception e10) {
            if (e10 instanceof NoSuchFieldException ? true : e10 instanceof NoSuchMethodException ? true : e10 instanceof IllegalAccessException ? true : e10 instanceof InvocationTargetException) {
                return q1.f14865a.a(activity);
            }
            throw e10;
        }
    }
}
