package i2;

import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class k {

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final m f13360a = new m(b.f13361a.getWebkitToCompatConverter());
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public static final l f13361a;

        static {
            l dVar;
            try {
                dVar = new com.google.android.gms.ads.nonagon.signalgeneration.d((WebViewProviderFactoryBoundaryInterface) d6.a.a(WebViewProviderFactoryBoundaryInterface.class, k.a()));
            } catch (ClassNotFoundException unused) {
                dVar = new d();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e6) {
                throw new RuntimeException(e6);
            }
            f13361a = dVar;
        }
    }

    public static InvocationHandler a() throws NoSuchMethodException, SecurityException {
        ClassLoader classLoader;
        if (Build.VERSION.SDK_INT >= 28) {
            classLoader = WebView.getWebViewClassLoader();
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", null);
                declaredMethod.setAccessible(true);
                classLoader = declaredMethod.invoke(null, null).getClass().getClassLoader();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e6) {
                throw new RuntimeException(e6);
            }
        }
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, classLoader).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }
}
