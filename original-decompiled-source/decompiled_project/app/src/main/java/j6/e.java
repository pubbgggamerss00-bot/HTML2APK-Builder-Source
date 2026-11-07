package j6;

import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements eh.a {
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, pg.j] */
    @Override // eh.a
    public final Object invoke() {
        Class<?> returnType;
        try {
            Method method = (Method) f.f15173d.getValue();
            if (method == null || (returnType = method.getReturnType()) == null) {
                return null;
            }
            Class cls = Integer.TYPE;
            return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
        } catch (Throwable unused) {
            return null;
        }
    }
}
