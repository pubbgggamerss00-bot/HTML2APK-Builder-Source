package androidx.camera.core.processing.util;

import android.opengl.EGLSurface;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class OutputSurface {
    public static OutputSurface of(EGLSurface eGLSurface, int i6, int i7) {
        return new AutoValue_OutputSurface(eGLSurface, i6, i7);
    }

    public abstract EGLSurface getEglSurface();

    public abstract int getHeight();

    public abstract int getWidth();
}
