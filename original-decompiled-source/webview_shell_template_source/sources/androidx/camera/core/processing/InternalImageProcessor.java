package androidx.camera.core.processing;

import androidx.camera.core.CameraEffect;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProcessor;
import androidx.camera.core.ProcessingException;
import androidx.camera.core.b0;
import java.util.Objects;
import java.util.concurrent.Executor;
import y.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class InternalImageProcessor {
    private final t0.a<Throwable> mErrorListener;
    private final Executor mExecutor;
    private final ImageProcessor mImageProcessor;

    public InternalImageProcessor(CameraEffect cameraEffect) {
        androidx.work.j.b(cameraEffect.getTargets() == 4);
        this.mExecutor = cameraEffect.getExecutor();
        ImageProcessor imageProcessor = cameraEffect.getImageProcessor();
        Objects.requireNonNull(imageProcessor);
        this.mImageProcessor = imageProcessor;
        this.mErrorListener = cameraEffect.getErrorListener();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$safeProcess$0(ImageProcessor.Request request, b.a aVar) {
        try {
            aVar.a(this.mImageProcessor.process(request));
        } catch (ProcessingException e6) {
            this.mErrorListener.accept(e6);
            aVar.b(e6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$safeProcess$1(ImageProcessor.Request request, b.a aVar) {
        this.mExecutor.execute(new j(this, request, aVar, 0));
        return "InternalImageProcessor#process " + request.hashCode();
    }

    public ImageProcessor.Response safeProcess(ImageProcessor.Request request) throws ImageCaptureException {
        try {
            return (ImageProcessor.Response) y.b.a(new b0(2, this, request)).f15194t.get();
        } catch (Exception e6) {
            e = e6;
            if (e.getCause() != null) {
                e = e.getCause();
            }
            throw new ImageCaptureException(0, "Failed to invoke ImageProcessor.", e);
        }
    }
}
