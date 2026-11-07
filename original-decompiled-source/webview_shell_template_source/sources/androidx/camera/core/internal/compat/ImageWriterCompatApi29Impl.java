package androidx.camera.core.internal.compat;

import android.media.ImageWriter;
import android.view.Surface;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
final class ImageWriterCompatApi29Impl {
    private ImageWriterCompatApi29Impl() {
    }

    public static ImageWriter newInstance(Surface surface, int i6, int i7) {
        return ImageWriter.newInstance(surface, i6, i7);
    }
}
