package d6;

import c6.e;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.jvm.internal.r;
import pg.d;
import pg.p;
import pg.q;
import x0.e2;
import x0.s3;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final e2<e> f7372a;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r1 = r1.invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if ((r1 instanceof x0.e2) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        r1 = (x0.e2) r1;
     */
    static {
        Object objA;
        try {
            ClassLoader classLoader = e.class.getClassLoader();
            r.b(classLoader);
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalSavedStateRegistryOwner", null);
            Annotation[] annotations = method.getAnnotations();
            r.d(annotations, "getAnnotations(...)");
            int length = annotations.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                } else if (annotations[i10] instanceof d) {
                    break;
                } else {
                    i10++;
                }
            }
            objA = null;
        } catch (Throwable th2) {
            objA = q.a(th2);
        }
        e2<e> s3Var = (e2) (objA instanceof p.a ? null : objA);
        if (s3Var == null) {
            s3Var = new s3(new a(0));
        }
        f7372a = s3Var;
    }
}
