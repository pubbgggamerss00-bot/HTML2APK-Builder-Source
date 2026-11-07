package androidx.camera.core.impl.utils;

import android.view.Surface;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class SurfaceUtil {
    public static final String JNI_LIB_NAME = "surface_util_jni";
    private static final String TAG = "SurfaceUtil";

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class SurfaceInfo {
        public int format = 0;
        public int width = 0;
        public int height = 0;
    }

    static {
        System.loadLibrary(JNI_LIB_NAME);
    }

    private SurfaceUtil() {
    }

    public static SurfaceInfo getSurfaceInfo(Surface surface) {
        int[] iArrNativeGetSurfaceInfo = nativeGetSurfaceInfo(surface);
        SurfaceInfo surfaceInfo = new SurfaceInfo();
        surfaceInfo.format = iArrNativeGetSurfaceInfo[0];
        surfaceInfo.width = iArrNativeGetSurfaceInfo[1];
        surfaceInfo.height = iArrNativeGetSurfaceInfo[2];
        return surfaceInfo;
    }

    private static native int[] nativeGetSurfaceInfo(Surface surface);
}
