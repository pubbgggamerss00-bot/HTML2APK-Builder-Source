package androidx.camera.core.processing;

import androidx.camera.core.ImageProcessor;
import androidx.camera.core.ImageProxy;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class ImageProcessorRequest implements ImageProcessor.Request {
    private final ImageProxy mImageProxy;
    private final int mOutputFormat;

    public ImageProcessorRequest(ImageProxy imageProxy, int i6) {
        this.mImageProxy = imageProxy;
        this.mOutputFormat = i6;
    }

    @Override // androidx.camera.core.ImageProcessor.Request
    public ImageProxy getInputImage() {
        return this.mImageProxy;
    }

    @Override // androidx.camera.core.ImageProcessor.Request
    public int getOutputFormat() {
        return this.mOutputFormat;
    }
}
