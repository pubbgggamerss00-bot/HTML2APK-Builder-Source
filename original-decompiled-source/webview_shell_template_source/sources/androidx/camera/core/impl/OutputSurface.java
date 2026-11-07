package androidx.camera.core.impl;

import android.util.Size;
import android.view.Surface;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class OutputSurface {
    public static OutputSurface create(Surface surface, Size size, int i6) {
        return new AutoValue_OutputSurface(surface, size, i6);
    }

    public abstract int getImageFormat();

    public abstract Size getSize();

    public abstract Surface getSurface();
}
