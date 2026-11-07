package j6;

import android.database.sqlite.SQLiteDatabase;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements eh.a {
    @Override // eh.a
    public final Object invoke() {
        try {
            Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }
}
