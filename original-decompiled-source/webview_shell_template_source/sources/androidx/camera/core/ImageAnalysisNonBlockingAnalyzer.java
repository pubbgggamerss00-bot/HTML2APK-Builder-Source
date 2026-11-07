package androidx.camera.core;

import androidx.camera.core.ForwardingImageProxy;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
final class ImageAnalysisNonBlockingAnalyzer extends ImageAnalysisAbstractAnalyzer {
    final Executor mBackgroundExecutor;
    ImageProxy mCachedImage;
    private final Object mLock = new Object();
    private CacheAnalyzingImageProxy mPostedImage;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class CacheAnalyzingImageProxy extends ForwardingImageProxy {
        final WeakReference<ImageAnalysisNonBlockingAnalyzer> mNonBlockingAnalyzerWeakReference;

        public CacheAnalyzingImageProxy(ImageProxy imageProxy, ImageAnalysisNonBlockingAnalyzer imageAnalysisNonBlockingAnalyzer) {
            super(imageProxy);
            this.mNonBlockingAnalyzerWeakReference = new WeakReference<>(imageAnalysisNonBlockingAnalyzer);
            addOnImageCloseListener(new ForwardingImageProxy.OnImageCloseListener() { // from class: androidx.camera.core.o
                @Override // androidx.camera.core.ForwardingImageProxy.OnImageCloseListener
                public final void onImageClose(ImageProxy imageProxy2) {
                    this.f584a.lambda$new$1(imageProxy2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$1(ImageProxy imageProxy) {
            final ImageAnalysisNonBlockingAnalyzer imageAnalysisNonBlockingAnalyzer = this.mNonBlockingAnalyzerWeakReference.get();
            if (imageAnalysisNonBlockingAnalyzer != null) {
                imageAnalysisNonBlockingAnalyzer.mBackgroundExecutor.execute(new Runnable() { // from class: androidx.camera.core.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        imageAnalysisNonBlockingAnalyzer.analyzeCachedImage();
                    }
                });
            }
        }
    }

    public ImageAnalysisNonBlockingAnalyzer(Executor executor) {
        this.mBackgroundExecutor = executor;
    }

    @Override // androidx.camera.core.ImageAnalysisAbstractAnalyzer
    public ImageProxy acquireImage(ImageReaderProxy imageReaderProxy) {
        return imageReaderProxy.acquireLatestImage();
    }

    public void analyzeCachedImage() {
        synchronized (this.mLock) {
            try {
                this.mPostedImage = null;
                ImageProxy imageProxy = this.mCachedImage;
                if (imageProxy != null) {
                    this.mCachedImage = null;
                    onValidImageAvailable(imageProxy);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.ImageAnalysisAbstractAnalyzer
    public void clearCache() {
        synchronized (this.mLock) {
            try {
                ImageProxy imageProxy = this.mCachedImage;
                if (imageProxy != null) {
                    imageProxy.close();
                    this.mCachedImage = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.ImageAnalysisAbstractAnalyzer
    public void onValidImageAvailable(ImageProxy imageProxy) {
        synchronized (this.mLock) {
            try {
                if (!this.mIsAttached) {
                    imageProxy.close();
                    return;
                }
                if (this.mPostedImage == null) {
                    final CacheAnalyzingImageProxy cacheAnalyzingImageProxy = new CacheAnalyzingImageProxy(imageProxy, this);
                    this.mPostedImage = cacheAnalyzingImageProxy;
                    Futures.addCallback(analyzeImage(cacheAnalyzingImageProxy), new FutureCallback<Void>() { // from class: androidx.camera.core.ImageAnalysisNonBlockingAnalyzer.1
                        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                        public void onFailure(Throwable th) {
                            cacheAnalyzingImageProxy.close();
                        }

                        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                        public void onSuccess(Void r12) {
                        }
                    }, CameraXExecutors.directExecutor());
                } else {
                    if (imageProxy.getImageInfo().getTimestamp() <= this.mPostedImage.getImageInfo().getTimestamp()) {
                        imageProxy.close();
                    } else {
                        ImageProxy imageProxy2 = this.mCachedImage;
                        if (imageProxy2 != null) {
                            imageProxy2.close();
                        }
                        this.mCachedImage = imageProxy;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
