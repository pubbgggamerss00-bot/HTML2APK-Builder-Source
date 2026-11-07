package androidx.camera.core.imagecapture;

import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ForwardingImageProxy;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.ImageReaderProxyProvider;
import androidx.camera.core.ImageReaderProxys;
import androidx.camera.core.Logger;
import androidx.camera.core.MetadataImageReader;
import androidx.camera.core.SafeCloseImageReaderProxy;
import androidx.camera.core.imagecapture.ProcessingNode;
import androidx.camera.core.imagecapture.TakePictureManager;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureCallbacks;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.ImmediateSurface;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.processing.Edge;
import androidx.camera.core.processing.Node;
import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
class CaptureNode implements Node<In, ProcessingNode.In> {
    static final int MAX_IMAGES = 4;
    private static final String TAG = "CaptureNode";
    private In mInputEdge;
    private ProcessingNode.In mOutputEdge;
    SafeCloseImageReaderProxy mSafeCloseImageReaderForPostview;
    SafeCloseImageReaderProxy mSafeCloseImageReaderProxy;
    ProcessingRequest mCurrentRequest = null;
    private NoMetadataImageReader mNoMetadataImageReader = null;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: androidx.camera.core.imagecapture.CaptureNode$1, reason: invalid class name */
    public class AnonymousClass1 extends CameraCaptureCallback {
        public AnonymousClass1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCaptureProcessProgressed$1(int i6) {
            ProcessingRequest processingRequest = CaptureNode.this.mCurrentRequest;
            if (processingRequest != null) {
                processingRequest.onCaptureProcessProgressed(i6);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCaptureStarted$0() {
            ProcessingRequest processingRequest = CaptureNode.this.mCurrentRequest;
            if (processingRequest != null) {
                processingRequest.onCaptureStarted();
            }
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureProcessProgressed(int i6, final int i7) {
            CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: androidx.camera.core.imagecapture.h
                @Override // java.lang.Runnable
                public final void run() {
                    this.s.lambda$onCaptureProcessProgressed$1(i7);
                }
            });
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureStarted(int i6) {
            CameraXExecutors.mainThreadExecutor().execute(new i(0, this));
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class In {
        private CameraCaptureCallback mCameraCaptureCallback = new CameraCaptureCallback() { // from class: androidx.camera.core.imagecapture.CaptureNode.In.1
        };
        private DeferrableSurface mPostviewSurface = null;
        private DeferrableSurface mSurface;

        public static In of(Size size, int i6, int i7, boolean z6, ImageReaderProxyProvider imageReaderProxyProvider) {
            return new AutoValue_CaptureNode_In(size, i6, i7, z6, imageReaderProxyProvider, null, 35, new Edge(), new Edge());
        }

        public CameraCaptureCallback getCameraCaptureCallback() {
            return this.mCameraCaptureCallback;
        }

        public abstract Edge<TakePictureManager.CaptureError> getErrorEdge();

        public abstract ImageReaderProxyProvider getImageReaderProxyProvider();

        public abstract int getInputFormat();

        public abstract int getOutputFormat();

        public abstract int getPostviewImageFormat();

        public abstract Size getPostviewSize();

        public DeferrableSurface getPostviewSurface() {
            return this.mPostviewSurface;
        }

        public abstract Edge<ProcessingRequest> getRequestEdge();

        public abstract Size getSize();

        public DeferrableSurface getSurface() {
            DeferrableSurface deferrableSurface = this.mSurface;
            Objects.requireNonNull(deferrableSurface);
            return deferrableSurface;
        }

        public abstract boolean isVirtualCamera();

        public void setCameraCaptureCallback(CameraCaptureCallback cameraCaptureCallback) {
            this.mCameraCaptureCallback = cameraCaptureCallback;
        }

        public void setPostviewSurface(Surface surface, Size size, int i6) {
            this.mPostviewSurface = new ImmediateSurface(surface, size, i6);
        }

        public void setSurface(Surface surface) {
            androidx.work.j.f("The surface is already set.", this.mSurface == null);
            this.mSurface = new ImmediateSurface(surface, getSize(), getInputFormat());
        }

        public static In of(Size size, int i6, int i7, boolean z6, ImageReaderProxyProvider imageReaderProxyProvider, Size size2, int i8) {
            return new AutoValue_CaptureNode_In(size, i6, i7, z6, imageReaderProxyProvider, size2, i8, new Edge(), new Edge());
        }
    }

    private static ImageReaderProxy createImageReaderProxy(ImageReaderProxyProvider imageReaderProxyProvider, int i6, int i7, int i8) {
        return imageReaderProxyProvider != null ? imageReaderProxyProvider.newInstance(i6, i7, i8, 4, 0L) : ImageReaderProxys.createIsolatedReader(i6, i7, i8, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$releaseInputResources$4(SafeCloseImageReaderProxy safeCloseImageReaderProxy) {
        if (safeCloseImageReaderProxy != null) {
            safeCloseImageReaderProxy.safeClose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$transform$0(ProcessingRequest processingRequest) {
        onRequestAvailable(processingRequest);
        this.mNoMetadataImageReader.acceptProcessingRequest(processingRequest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$transform$1(ImageReaderProxy imageReaderProxy) {
        try {
            ImageProxy imageProxyAcquireLatestImage = imageReaderProxy.acquireLatestImage();
            if (imageProxyAcquireLatestImage != null) {
                onImageProxyAvailable(imageProxyAcquireLatestImage);
                return;
            }
            ProcessingRequest processingRequest = this.mCurrentRequest;
            if (processingRequest != null) {
                sendCaptureError(TakePictureManager.CaptureError.of(processingRequest.getRequestId(), new ImageCaptureException(2, "Failed to acquire latest image", null)));
            }
        } catch (IllegalStateException e6) {
            ProcessingRequest processingRequest2 = this.mCurrentRequest;
            if (processingRequest2 != null) {
                sendCaptureError(TakePictureManager.CaptureError.of(processingRequest2.getRequestId(), new ImageCaptureException(2, "Failed to acquire latest image", e6)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$transform$2(ImageReaderProxy imageReaderProxy) {
        try {
            ImageProxy imageProxyAcquireLatestImage = imageReaderProxy.acquireLatestImage();
            if (imageProxyAcquireLatestImage != null) {
                propagatePostviewImage(imageProxyAcquireLatestImage);
            }
        } catch (IllegalStateException e6) {
            Logger.e(TAG, "Failed to acquire latest image of postview", e6);
        }
    }

    private void matchAndPropagateImage(ImageProxy imageProxy) {
        Threads.checkMainThread();
        ProcessingNode.In in = this.mOutputEdge;
        Objects.requireNonNull(in);
        in.getEdge().accept(ProcessingNode.InputPacket.of(this.mCurrentRequest, imageProxy));
        ProcessingRequest processingRequest = this.mCurrentRequest;
        this.mCurrentRequest = null;
        processingRequest.onImageCaptured();
    }

    private void propagatePostviewImage(ImageProxy imageProxy) {
        if (this.mCurrentRequest == null) {
            Logger.w(TAG, "Postview image is closed due to request completed or aborted");
            imageProxy.close();
        } else {
            ProcessingNode.In in = this.mOutputEdge;
            Objects.requireNonNull(in);
            in.getPostviewEdge().accept(ProcessingNode.InputPacket.of(this.mCurrentRequest, imageProxy));
        }
    }

    private void releaseInputResources(In in, final SafeCloseImageReaderProxy safeCloseImageReaderProxy, SafeCloseImageReaderProxy safeCloseImageReaderProxy2) {
        in.getSurface().close();
        in.getSurface().getTerminationFuture().addListener(new Runnable() { // from class: androidx.camera.core.imagecapture.f
            @Override // java.lang.Runnable
            public final void run() {
                safeCloseImageReaderProxy.safeClose();
            }
        }, CameraXExecutors.mainThreadExecutor());
        if (in.getPostviewSurface() != null) {
            in.getPostviewSurface().close();
            in.getPostviewSurface().getTerminationFuture().addListener(new g(0, safeCloseImageReaderProxy2), CameraXExecutors.mainThreadExecutor());
        }
    }

    public int getCapacity() {
        Threads.checkMainThread();
        androidx.work.j.f("The ImageReader is not initialized.", this.mSafeCloseImageReaderProxy != null);
        return this.mSafeCloseImageReaderProxy.getCapacity();
    }

    public In getInputEdge() {
        In in = this.mInputEdge;
        Objects.requireNonNull(in);
        return in;
    }

    public SafeCloseImageReaderProxy getSafeCloseImageReaderProxy() {
        SafeCloseImageReaderProxy safeCloseImageReaderProxy = this.mSafeCloseImageReaderProxy;
        Objects.requireNonNull(safeCloseImageReaderProxy);
        return safeCloseImageReaderProxy;
    }

    public void onImageProxyAvailable(ImageProxy imageProxy) {
        Threads.checkMainThread();
        if (this.mCurrentRequest == null) {
            Logger.w(TAG, "Discarding ImageProxy which was inadvertently acquired: " + imageProxy);
            imageProxy.close();
            return;
        }
        if (((Integer) imageProxy.getImageInfo().getTagBundle().getTag(this.mCurrentRequest.getTagBundleKey())) != null) {
            matchAndPropagateImage(imageProxy);
        } else {
            Logger.w(TAG, "Discarding ImageProxy which was acquired for aborted request");
            imageProxy.close();
        }
    }

    public void onRequestAvailable(final ProcessingRequest processingRequest) {
        Threads.checkMainThread();
        androidx.work.j.f("only one capture stage is supported.", processingRequest.getStageIds().size() == 1);
        androidx.work.j.f("Too many acquire images. Close image to be able to process next.", getCapacity() > 0);
        this.mCurrentRequest = processingRequest;
        Futures.addCallback(processingRequest.getCaptureFuture(), new FutureCallback<Void>() { // from class: androidx.camera.core.imagecapture.CaptureNode.2
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(Throwable th) {
                Threads.checkMainThread();
                if (processingRequest == CaptureNode.this.mCurrentRequest) {
                    Logger.w(CaptureNode.TAG, "request aborted, id=" + CaptureNode.this.mCurrentRequest.getRequestId());
                    if (CaptureNode.this.mNoMetadataImageReader != null) {
                        CaptureNode.this.mNoMetadataImageReader.clearProcessingRequest();
                    }
                    CaptureNode.this.mCurrentRequest = null;
                }
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(Void r12) {
            }
        }, CameraXExecutors.directExecutor());
    }

    @Override // androidx.camera.core.processing.Node
    public void release() {
        Threads.checkMainThread();
        In in = this.mInputEdge;
        Objects.requireNonNull(in);
        SafeCloseImageReaderProxy safeCloseImageReaderProxy = this.mSafeCloseImageReaderProxy;
        Objects.requireNonNull(safeCloseImageReaderProxy);
        releaseInputResources(in, safeCloseImageReaderProxy, this.mSafeCloseImageReaderForPostview);
    }

    public void sendCaptureError(TakePictureManager.CaptureError captureError) {
        Threads.checkMainThread();
        ProcessingRequest processingRequest = this.mCurrentRequest;
        if (processingRequest == null || processingRequest.getRequestId() != captureError.getRequestId()) {
            return;
        }
        this.mCurrentRequest.onCaptureFailure(captureError.getImageCaptureException());
    }

    public void setOnImageCloseListener(ForwardingImageProxy.OnImageCloseListener onImageCloseListener) {
        Threads.checkMainThread();
        androidx.work.j.f("The ImageReader is not initialized.", this.mSafeCloseImageReaderProxy != null);
        this.mSafeCloseImageReaderProxy.setOnImageCloseListener(onImageCloseListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.camera.core.processing.Node
    public ProcessingNode.In transform(In in) {
        t0.a<ProcessingRequest> aVar;
        NoMetadataImageReader noMetadataImageReader;
        int i6 = 0;
        androidx.work.j.f("CaptureNode does not support recreation yet.", this.mInputEdge == null && this.mSafeCloseImageReaderProxy == null);
        this.mInputEdge = in;
        Size size = in.getSize();
        int inputFormat = in.getInputFormat();
        boolean zIsVirtualCamera = in.isVirtualCamera();
        CameraCaptureCallback anonymousClass1 = new AnonymousClass1();
        if (zIsVirtualCamera || in.getImageReaderProxyProvider() != null) {
            NoMetadataImageReader noMetadataImageReader2 = new NoMetadataImageReader(createImageReaderProxy(in.getImageReaderProxyProvider(), size.getWidth(), size.getHeight(), inputFormat));
            this.mNoMetadataImageReader = noMetadataImageReader2;
            aVar = new t0.a() { // from class: androidx.camera.core.imagecapture.b
                @Override // t0.a
                public final void accept(Object obj) {
                    this.f520a.lambda$transform$0((ProcessingRequest) obj);
                }
            };
            noMetadataImageReader = noMetadataImageReader2;
        } else {
            MetadataImageReader metadataImageReader = new MetadataImageReader(size.getWidth(), size.getHeight(), inputFormat, 4);
            anonymousClass1 = CameraCaptureCallbacks.createComboCallback(anonymousClass1, metadataImageReader.getCameraCaptureCallback());
            aVar = new t0.a() { // from class: androidx.camera.core.imagecapture.a
                @Override // t0.a
                public final void accept(Object obj) {
                    this.f519a.onRequestAvailable((ProcessingRequest) obj);
                }
            };
            noMetadataImageReader = metadataImageReader;
        }
        in.setCameraCaptureCallback(anonymousClass1);
        Surface surface = noMetadataImageReader.getSurface();
        Objects.requireNonNull(surface);
        in.setSurface(surface);
        this.mSafeCloseImageReaderProxy = new SafeCloseImageReaderProxy(noMetadataImageReader);
        noMetadataImageReader.setOnImageAvailableListener(new ImageReaderProxy.OnImageAvailableListener() { // from class: androidx.camera.core.imagecapture.c
            @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
            public final void onImageAvailable(ImageReaderProxy imageReaderProxy) {
                this.s.lambda$transform$1(imageReaderProxy);
            }
        }, CameraXExecutors.mainThreadExecutor());
        if (in.getPostviewSize() != null) {
            ImageReaderProxy imageReaderProxyCreateImageReaderProxy = createImageReaderProxy(in.getImageReaderProxyProvider(), in.getPostviewSize().getWidth(), in.getPostviewSize().getHeight(), in.getPostviewImageFormat());
            imageReaderProxyCreateImageReaderProxy.setOnImageAvailableListener(new ImageReaderProxy.OnImageAvailableListener() { // from class: androidx.camera.core.imagecapture.d
                @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
                public final void onImageAvailable(ImageReaderProxy imageReaderProxy) {
                    this.s.lambda$transform$2(imageReaderProxy);
                }
            }, CameraXExecutors.mainThreadExecutor());
            this.mSafeCloseImageReaderForPostview = new SafeCloseImageReaderProxy(imageReaderProxyCreateImageReaderProxy);
            in.setPostviewSurface(imageReaderProxyCreateImageReaderProxy.getSurface(), in.getPostviewSize(), in.getPostviewImageFormat());
        }
        in.getRequestEdge().setListener(aVar);
        in.getErrorEdge().setListener(new e(this, i6));
        ProcessingNode.In inOf = ProcessingNode.In.of(in.getInputFormat(), in.getOutputFormat());
        this.mOutputEdge = inOf;
        return inOf;
    }
}
