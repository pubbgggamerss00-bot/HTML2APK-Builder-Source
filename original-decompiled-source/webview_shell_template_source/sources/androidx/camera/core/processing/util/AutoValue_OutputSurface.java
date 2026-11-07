package androidx.camera.core.processing.util;

import android.opengl.EGLSurface;
import androidx.camera.camera2.internal.p0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
final class AutoValue_OutputSurface extends OutputSurface {
    private final EGLSurface eglSurface;
    private final int height;
    private final int width;

    public AutoValue_OutputSurface(EGLSurface eGLSurface, int i6, int i7) {
        if (eGLSurface == null) {
            throw new NullPointerException("Null eglSurface");
        }
        this.eglSurface = eGLSurface;
        this.width = i6;
        this.height = i7;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OutputSurface) {
            OutputSurface outputSurface = (OutputSurface) obj;
            if (this.eglSurface.equals(outputSurface.getEglSurface()) && this.width == outputSurface.getWidth() && this.height == outputSurface.getHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.processing.util.OutputSurface
    public EGLSurface getEglSurface() {
        return this.eglSurface;
    }

    @Override // androidx.camera.core.processing.util.OutputSurface
    public int getHeight() {
        return this.height;
    }

    @Override // androidx.camera.core.processing.util.OutputSurface
    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return ((((this.eglSurface.hashCode() ^ 1000003) * 1000003) ^ this.width) * 1000003) ^ this.height;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("OutputSurface{eglSurface=");
        sb.append(this.eglSurface);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        return p0.a(sb, this.height, "}");
    }
}
