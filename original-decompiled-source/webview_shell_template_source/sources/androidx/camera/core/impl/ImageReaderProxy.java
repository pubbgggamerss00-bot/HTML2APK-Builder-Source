package androidx.camera.core.impl;

import android.view.Surface;
import androidx.camera.core.ImageProxy;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public interface ImageReaderProxy {

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface OnImageAvailableListener {
        void onImageAvailable(ImageReaderProxy imageReaderProxy);
    }

    ImageProxy acquireLatestImage();

    ImageProxy acquireNextImage();

    void clearOnImageAvailableListener();

    void close();

    int getHeight();

    int getImageFormat();

    int getMaxImages();

    Surface getSurface();

    int getWidth();

    void setOnImageAvailableListener(OnImageAvailableListener onImageAvailableListener, Executor executor);
}
