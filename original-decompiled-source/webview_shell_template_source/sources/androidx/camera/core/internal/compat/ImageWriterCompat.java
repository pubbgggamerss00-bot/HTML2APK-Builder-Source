package androidx.camera.core.internal.compat;

import android.media.Image;
import android.media.ImageWriter;
import android.os.Build;
import android.view.Surface;
import androidx.camera.camera2.internal.s0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ImageWriterCompat {
    private ImageWriterCompat() {
    }

    public static void close(ImageWriter imageWriter) {
        ImageWriterCompatApi23Impl.close(imageWriter);
    }

    public static Image dequeueInputImage(ImageWriter imageWriter) {
        return ImageWriterCompatApi23Impl.dequeueInputImage(imageWriter);
    }

    public static ImageWriter newInstance(Surface surface, int i6, int i7) {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 29) {
            return ImageWriterCompatApi29Impl.newInstance(surface, i6, i7);
        }
        if (i8 >= 26) {
            return ImageWriterCompatApi26Impl.newInstance(surface, i6, i7);
        }
        throw new RuntimeException(s0.a(i8, "Unable to call newInstance(Surface, int, int) on API ", ". Version 26 or higher required."));
    }

    public static void queueInputImage(ImageWriter imageWriter, Image image) {
        ImageWriterCompatApi23Impl.queueInputImage(imageWriter, image);
    }

    public static ImageWriter newInstance(Surface surface, int i6) {
        return ImageWriterCompatApi23Impl.newInstance(surface, i6);
    }
}
