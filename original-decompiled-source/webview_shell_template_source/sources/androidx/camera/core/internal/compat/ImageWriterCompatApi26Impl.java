package androidx.camera.core.internal.compat;

import android.media.ImageWriter;
import android.os.Build;
import android.util.Log;
import android.view.Surface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
final class ImageWriterCompatApi26Impl {
    private static final String TAG = "ImageWriterCompatApi26";
    private static Method sNewInstanceMethod;

    static {
        try {
            Class cls = Integer.TYPE;
            sNewInstanceMethod = ImageWriter.class.getMethod("newInstance", Surface.class, cls, cls);
        } catch (NoSuchMethodException e6) {
            Log.i(TAG, "Unable to initialize via reflection.", e6);
        }
    }

    private ImageWriterCompatApi26Impl() {
    }

    public static ImageWriter newInstance(Surface surface, int i6, int i7) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Throwable th = null;
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                Object objInvoke = sNewInstanceMethod.invoke(null, surface, Integer.valueOf(i6), Integer.valueOf(i7));
                objInvoke.getClass();
                return (ImageWriter) objInvoke;
            } catch (IllegalAccessException | InvocationTargetException e6) {
                th = e6;
            }
        }
        throw new RuntimeException("Unable to invoke newInstance(Surface, int, int) via reflection.", th);
    }
}
