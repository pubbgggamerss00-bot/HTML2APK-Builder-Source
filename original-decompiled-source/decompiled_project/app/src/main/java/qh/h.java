package qh;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.r;
import pg.p;
import pg.q;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f22763a = 0;
    private static volatile Choreographer choreographer;

    static {
        Object objA;
        try {
            objA = new f(a(Looper.getMainLooper()));
        } catch (Throwable th2) {
            objA = q.a(th2);
        }
        if (objA instanceof p.a) {
            objA = null;
        }
    }

    public static final Handler a(Looper looper) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        r.c(objInvoke, "null cannot be cast to non-null type android.os.Handler");
        return (Handler) objInvoke;
    }
}
