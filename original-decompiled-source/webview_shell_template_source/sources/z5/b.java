package z5;

import android.os.Build;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import y5.v;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b extends g5.a implements v {
    private volatile Object _preHandler;

    public b() {
        super(v.a.s);
        this._preHandler = this;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    @Override // y5.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(Throwable th) {
        Method declaredMethod;
        int i6 = Build.VERSION.SDK_INT;
        if (26 > i6 || i6 >= 28) {
            return;
        }
        Object obj = this._preHandler;
        if (obj != this) {
            declaredMethod = (Method) obj;
        } else {
            try {
                declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", null);
            } catch (Throwable unused) {
            }
            if (Modifier.isPublic(declaredMethod.getModifiers())) {
                if (!Modifier.isStatic(declaredMethod.getModifiers())) {
                    declaredMethod = null;
                }
                this._preHandler = declaredMethod;
            }
        }
        Object objInvoke = declaredMethod != null ? declaredMethod.invoke(null, null) : null;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = objInvoke instanceof Thread.UncaughtExceptionHandler ? (Thread.UncaughtExceptionHandler) objInvoke : null;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
    }
}
