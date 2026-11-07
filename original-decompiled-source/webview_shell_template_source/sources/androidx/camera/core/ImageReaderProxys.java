package androidx.camera.core;

import android.media.ImageReader;
import androidx.camera.core.impl.ImageReaderProxy;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ImageReaderProxys {
    private ImageReaderProxys() {
    }

    public static ImageReaderProxy createIsolatedReader(int i6, int i7, int i8, int i9) {
        return new AndroidImageReaderProxy(ImageReader.newInstance(i6, i7, i8, i9));
    }
}
