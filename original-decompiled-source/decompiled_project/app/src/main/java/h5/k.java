package h5;

import androidx.lifecycle.t;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.jvm.internal.r;
import pg.p;
import pg.q;
import x0.e2;
import x0.s3;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final e2<t> f12264a;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        r1 = r1.invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if ((r1 instanceof x0.e2) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        r1 = (x0.e2) r1;
     */
    static {
        Object objA;
        try {
            ClassLoader classLoader = t.class.getClassLoader();
            r.b(classLoader);
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalLifecycleOwner", null);
            Annotation[] annotations = method.getAnnotations();
            int length = annotations.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                } else if (annotations[i10] instanceof pg.d) {
                    break;
                } else {
                    i10++;
                }
            }
            objA = null;
        } catch (Throwable th2) {
            objA = q.a(th2);
        }
        e2<t> s3Var = (e2) (objA instanceof p.a ? null : objA);
        if (s3Var == null) {
            s3Var = new s3(new j());
        }
        f12264a = s3Var;
    }
}
