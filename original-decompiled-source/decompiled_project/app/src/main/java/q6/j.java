package q6;

import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* loaded from: classes.dex */
public final class j {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final m f22074a = new m(b.f22075a.getWebkitToCompatConverter());
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public static final k f22075a;

        static {
            k eVar;
            try {
                eVar = new l((WebViewProviderFactoryBoundaryInterface) li.a.a(WebViewProviderFactoryBoundaryInterface.class, j.a()));
            } catch (ClassNotFoundException unused) {
                eVar = new e();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
                throw new RuntimeException(e10);
            }
            f22075a = eVar;
        }
    }

    public static InvocationHandler a() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, WebView.getWebViewClassLoader()).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }
}
