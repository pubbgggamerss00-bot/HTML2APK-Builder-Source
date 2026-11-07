package androidx.camera.core.imagecapture;

import android.graphics.Bitmap;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Logger;
import androidx.camera.core.imagecapture.Bitmap2JpegBytes;
import androidx.camera.core.imagecapture.Image2JpegBytes;
import androidx.camera.core.imagecapture.JpegBytes2Disk;
import androidx.camera.core.imagecapture.ProcessingNode;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.internal.compat.quirk.DeviceQuirks;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.camera.core.processing.Edge;
import androidx.camera.core.processing.InternalImageProcessor;
import androidx.camera.core.processing.Node;
import androidx.camera.core.processing.Operation;
import androidx.camera.core.processing.Packet;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class ProcessingNode implements Node<In, Void> {
    private static final String TAG = "ProcessingNode";
    private Operation<Bitmap2JpegBytes.In, Packet<byte[]>> mBitmap2JpegBytes;
    private Operation<Packet<Bitmap>, Packet<Bitmap>> mBitmapEffect;
    final Executor mBlockingExecutor;
    private final boolean mHasIncorrectJpegMetadataQuirk;
    private Operation<Packet<ImageProxy>, Bitmap> mImage2Bitmap;
    private Operation<Image2JpegBytes.In, Packet<byte[]>> mImage2JpegBytes;
    final InternalImageProcessor mImageProcessor;
    private Operation<InputPacket, Packet<ImageProxy>> mInput2Packet;
    private In mInputEdge;
    private Operation<Packet<byte[]>, Packet<Bitmap>> mJpegBytes2CroppedBitmap;
    private Operation<JpegBytes2Disk.In, ImageCapture.OutputFileResults> mJpegBytes2Disk;
    private Operation<Packet<byte[]>, Packet<ImageProxy>> mJpegBytes2Image;
    private Operation<Packet<ImageProxy>, ImageProxy> mJpegImage2Result;
    private final Quirks mQuirks;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class In {
        public static In of(int i6, int i7) {
            return new AutoValue_ProcessingNode_In(new Edge(), new Edge(), i6, i7);
        }

        public abstract Edge<InputPacket> getEdge();

        public abstract int getInputFormat();

        public abstract int getOutputFormat();

        public abstract Edge<InputPacket> getPostviewEdge();
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class InputPacket {
        public static InputPacket of(ProcessingRequest processingRequest, ImageProxy imageProxy) {
            return new AutoValue_ProcessingNode_InputPacket(processingRequest, imageProxy);
        }

        public abstract ImageProxy getImageProxy();

        public abstract ProcessingRequest getProcessingRequest();
    }

    public ProcessingNode(Executor executor) {
        this(executor, null, DeviceQuirks.getAll());
    }

    private Packet<byte[]> cropAndMaybeApplyEffect(Packet<byte[]> packet, int i6) {
        androidx.work.j.f(null, ImageUtil.isJpegFormats(packet.getFormat()));
        Packet<Bitmap> packetApply = this.mJpegBytes2CroppedBitmap.apply(packet);
        Operation<Packet<Bitmap>, Packet<Bitmap>> operation = this.mBitmapEffect;
        if (operation != null) {
            packetApply = operation.apply(packetApply);
        }
        return this.mBitmap2JpegBytes.apply(Bitmap2JpegBytes.In.of(packetApply, i6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$transform$1(InputPacket inputPacket) {
        if (inputPacket.getProcessingRequest().isAborted()) {
            inputPacket.getImageProxy().close();
        } else {
            this.mBlockingExecutor.execute(new k(1, this, inputPacket));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$transform$3(InputPacket inputPacket) {
        if (!inputPacket.getProcessingRequest().isAborted()) {
            this.mBlockingExecutor.execute(new k(0, this, inputPacket));
        } else {
            Logger.w(TAG, "The postview image is closed due to request aborted");
            inputPacket.getImageProxy().close();
        }
    }

    private static void sendError(ProcessingRequest processingRequest, ImageCaptureException imageCaptureException) {
        CameraXExecutors.mainThreadExecutor().execute(new m(processingRequest, imageCaptureException, 0));
    }

    public void injectProcessingInput2Packet(Operation<InputPacket, Packet<ImageProxy>> operation) {
        this.mInput2Packet = operation;
    }

    public ImageProxy processInMemoryCapture(InputPacket inputPacket) {
        ProcessingRequest processingRequest = inputPacket.getProcessingRequest();
        Packet<ImageProxy> packetApply = this.mInput2Packet.apply(inputPacket);
        if ((packetApply.getFormat() == 35 || this.mBitmapEffect != null || this.mHasIncorrectJpegMetadataQuirk) && this.mInputEdge.getOutputFormat() == 256) {
            Packet<byte[]> packetApply2 = this.mImage2JpegBytes.apply(Image2JpegBytes.In.of(packetApply, processingRequest.getJpegQuality()));
            if (this.mBitmapEffect != null) {
                packetApply2 = cropAndMaybeApplyEffect(packetApply2, processingRequest.getJpegQuality());
            }
            packetApply = this.mJpegBytes2Image.apply(packetApply2);
        }
        return this.mJpegImage2Result.apply(packetApply);
    }

    /* renamed from: processInputPacket, reason: merged with bridge method [inline-methods] */
    public void lambda$transform$0(InputPacket inputPacket) {
        final ProcessingRequest processingRequest = inputPacket.getProcessingRequest();
        try {
            if (inputPacket.getProcessingRequest().isInMemoryCapture()) {
                CameraXExecutors.mainThreadExecutor().execute(new n(0, processingRequest, processInMemoryCapture(inputPacket)));
            } else {
                final ImageCapture.OutputFileResults outputFileResultsProcessOnDiskCapture = processOnDiskCapture(inputPacket);
                CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: androidx.camera.core.imagecapture.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        processingRequest.onFinalResult(outputFileResultsProcessOnDiskCapture);
                    }
                });
            }
        } catch (ImageCaptureException e6) {
            sendError(processingRequest, e6);
        } catch (OutOfMemoryError e7) {
            sendError(processingRequest, new ImageCaptureException(0, "Processing failed due to low memory.", e7));
        } catch (RuntimeException e8) {
            sendError(processingRequest, new ImageCaptureException(0, "Processing failed.", e8));
        }
    }

    public ImageCapture.OutputFileResults processOnDiskCapture(InputPacket inputPacket) {
        int outputFormat = this.mInputEdge.getOutputFormat();
        androidx.work.j.a("On-disk capture only support JPEG and JPEG/R output formats. Output format: " + outputFormat, ImageUtil.isJpegFormats(outputFormat));
        ProcessingRequest processingRequest = inputPacket.getProcessingRequest();
        Packet<byte[]> packetApply = this.mImage2JpegBytes.apply(Image2JpegBytes.In.of(this.mInput2Packet.apply(inputPacket), processingRequest.getJpegQuality()));
        if (packetApply.hasCropping() || this.mBitmapEffect != null) {
            packetApply = cropAndMaybeApplyEffect(packetApply, processingRequest.getJpegQuality());
        }
        Operation<JpegBytes2Disk.In, ImageCapture.OutputFileResults> operation = this.mJpegBytes2Disk;
        ImageCapture.OutputFileOptions outputFileOptions = processingRequest.getOutputFileOptions();
        Objects.requireNonNull(outputFileOptions);
        return operation.apply(JpegBytes2Disk.In.of(packetApply, outputFileOptions));
    }

    /* renamed from: processPostviewInputPacket, reason: merged with bridge method [inline-methods] */
    public void lambda$transform$2(InputPacket inputPacket) {
        int outputFormat = this.mInputEdge.getOutputFormat();
        androidx.work.j.a("Postview only support YUV and JPEG output formats. Output format: " + outputFormat, outputFormat == 35 || outputFormat == 256);
        try {
            CameraXExecutors.mainThreadExecutor().execute(new p(0, inputPacket.getProcessingRequest(), this.mImage2Bitmap.apply(this.mInput2Packet.apply(inputPacket))));
        } catch (Exception e6) {
            inputPacket.getImageProxy().close();
            Logger.e(TAG, "process postview input packet failed.", e6);
        }
    }

    public ProcessingNode(Executor executor, Quirks quirks) {
        this(executor, null, quirks);
    }

    @Override // androidx.camera.core.processing.Node
    public Void transform(In in) {
        this.mInputEdge = in;
        in.getEdge().setListener(new e(this, 1));
        in.getPostviewEdge().setListener(new t0.a() { // from class: androidx.camera.core.imagecapture.l
            @Override // t0.a
            public final void accept(Object obj) {
                this.f529a.lambda$transform$3((ProcessingNode.InputPacket) obj);
            }
        });
        this.mInput2Packet = new ProcessingInput2Packet();
        this.mImage2JpegBytes = new Image2JpegBytes(this.mQuirks);
        this.mJpegBytes2CroppedBitmap = new JpegBytes2CroppedBitmap();
        this.mBitmap2JpegBytes = new Bitmap2JpegBytes();
        this.mJpegBytes2Disk = new JpegBytes2Disk();
        this.mJpegImage2Result = new JpegImage2Result();
        this.mImage2Bitmap = new Image2Bitmap();
        if (in.getInputFormat() == 35 || this.mImageProcessor != null || this.mHasIncorrectJpegMetadataQuirk) {
            this.mJpegBytes2Image = new JpegBytes2Image();
        }
        InternalImageProcessor internalImageProcessor = this.mImageProcessor;
        if (internalImageProcessor == null) {
            return null;
        }
        this.mBitmapEffect = new BitmapEffect(internalImageProcessor);
        return null;
    }

    public ProcessingNode(Executor executor, InternalImageProcessor internalImageProcessor) {
        this(executor, internalImageProcessor, DeviceQuirks.getAll());
    }

    public ProcessingNode(Executor executor, InternalImageProcessor internalImageProcessor, Quirks quirks) {
        if (DeviceQuirks.get(LowMemoryQuirk.class) != null) {
            this.mBlockingExecutor = CameraXExecutors.newSequentialExecutor(executor);
        } else {
            this.mBlockingExecutor = executor;
        }
        this.mImageProcessor = internalImageProcessor;
        this.mQuirks = quirks;
        this.mHasIncorrectJpegMetadataQuirk = quirks.contains(IncorrectJpegMetadataQuirk.class);
    }

    @Override // androidx.camera.core.processing.Node
    public void release() {
    }
}
