package androidx.camera.core;

import android.graphics.Bitmap;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.imagecapture.RequestWithCallback;
import androidx.camera.core.imagecapture.TakePictureRequest;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import g5.e;
import g5.f;
import java.util.concurrent.Executor;
import y5.q0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ImageCaptureExtKt {
    public static final TakePictureRequest getTakePictureRequest(ImageCapture imageCapture) {
        kotlin.jvm.internal.j.e("<this>", imageCapture);
        RequestWithCallback capturingRequest = imageCapture.getTakePictureManager().getCapturingRequest();
        if (capturingRequest != null) {
            return capturingRequest.getTakePictureRequest();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2, types: [T, androidx.camera.core.DelegatingImageCapturedCallback] */
    public static final Object takePicture(ImageCapture imageCapture, final p5.a<d5.j> aVar, final p5.l<? super Integer, d5.j> lVar, final p5.l<? super Bitmap, d5.j> lVar2, g5.d<? super ImageProxy> dVar) {
        Executor executorDirectExecutor;
        f.b bVarT = dVar.getContext().t(e.a.s);
        y5.u uVar = bVarT instanceof y5.u ? (y5.u) bVarT : null;
        if (uVar != null) {
            q0 q0Var = uVar instanceof q0 ? (q0) uVar : null;
            if (q0Var == null || (executorDirectExecutor = q0Var.z()) == null) {
                executorDirectExecutor = new com.google.android.gms.internal.consent_sdk.x(2, uVar);
            }
        } else {
            executorDirectExecutor = CameraXExecutors.directExecutor();
            kotlin.jvm.internal.j.d("directExecutor()", executorDirectExecutor);
        }
        final y5.f fVar = new y5.f(a1.a.f(dVar));
        fVar.m();
        final kotlin.jvm.internal.p pVar = new kotlin.jvm.internal.p();
        pVar.s = new DelegatingImageCapturedCallback(new ImageCapture.OnImageCapturedCallback() { // from class: androidx.camera.core.ImageCaptureExtKt$takePicture$2$1
            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public void onCaptureProcessProgressed(int i6) {
                p5.l<Integer, d5.j> lVar3 = lVar;
                if (lVar3 != null) {
                    lVar3.invoke(Integer.valueOf(i6));
                }
            }

            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public void onCaptureStarted() {
                p5.a<d5.j> aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.a();
                }
            }

            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public void onCaptureSuccess(ImageProxy imageProxy) {
                kotlin.jvm.internal.j.e("imageProxy", imageProxy);
                DelegatingImageCapturedCallback delegatingImageCapturedCallback = pVar.s;
                if (delegatingImageCapturedCallback == null) {
                    kotlin.jvm.internal.j.g("delegatingCallback");
                    throw null;
                }
                delegatingImageCapturedCallback.dispose();
                fVar.g(imageProxy);
            }

            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public void onError(ImageCaptureException imageCaptureException) {
                kotlin.jvm.internal.j.e("exception", imageCaptureException);
                DelegatingImageCapturedCallback delegatingImageCapturedCallback = pVar.s;
                if (delegatingImageCapturedCallback == null) {
                    kotlin.jvm.internal.j.g("delegatingCallback");
                    throw null;
                }
                delegatingImageCapturedCallback.dispose();
                fVar.g(d5.e.a(imageCaptureException));
            }

            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public void onPostviewBitmapAvailable(Bitmap bitmap) {
                kotlin.jvm.internal.j.e("bitmap", bitmap);
                p5.l<Bitmap, d5.j> lVar3 = lVar2;
                if (lVar3 != null) {
                    lVar3.invoke(bitmap);
                }
            }
        });
        fVar.o(new ImageCaptureExtKt$takePicture$2$2(pVar));
        T t6 = pVar.s;
        if (t6 != 0) {
            imageCapture.lambda$takePicture$1(executorDirectExecutor, (DelegatingImageCapturedCallback) t6);
            return fVar.l();
        }
        kotlin.jvm.internal.j.g("delegatingCallback");
        throw null;
    }

    public static /* synthetic */ Object takePicture$default(ImageCapture imageCapture, p5.a aVar, p5.l lVar, p5.l lVar2, g5.d dVar, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            aVar = null;
        }
        if ((i6 & 2) != 0) {
            lVar = null;
        }
        if ((i6 & 4) != 0) {
            lVar2 = null;
        }
        return takePicture(imageCapture, aVar, lVar, lVar2, dVar);
    }

    public static /* synthetic */ Object takePicture$default(ImageCapture imageCapture, ImageCapture.OutputFileOptions outputFileOptions, p5.a aVar, p5.l lVar, p5.l lVar2, g5.d dVar, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            aVar = null;
        }
        if ((i6 & 4) != 0) {
            lVar = null;
        }
        if ((i6 & 8) != 0) {
            lVar2 = null;
        }
        return takePicture(imageCapture, outputFileOptions, aVar, lVar, lVar2, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [T, androidx.camera.core.DelegatingImageSavedCallback] */
    public static final Object takePicture(ImageCapture imageCapture, ImageCapture.OutputFileOptions outputFileOptions, final p5.a<d5.j> aVar, final p5.l<? super Integer, d5.j> lVar, final p5.l<? super Bitmap, d5.j> lVar2, g5.d<? super ImageCapture.OutputFileResults> dVar) {
        Executor executorDirectExecutor;
        f.b bVarT = dVar.getContext().t(e.a.s);
        y5.u uVar = bVarT instanceof y5.u ? (y5.u) bVarT : null;
        if (uVar != null) {
            q0 q0Var = uVar instanceof q0 ? (q0) uVar : null;
            if (q0Var == null || (executorDirectExecutor = q0Var.z()) == null) {
                executorDirectExecutor = new com.google.android.gms.internal.consent_sdk.x(2, uVar);
            }
        } else {
            executorDirectExecutor = CameraXExecutors.directExecutor();
            kotlin.jvm.internal.j.d("directExecutor()", executorDirectExecutor);
        }
        final y5.f fVar = new y5.f(a1.a.f(dVar));
        fVar.m();
        final kotlin.jvm.internal.p pVar = new kotlin.jvm.internal.p();
        pVar.s = new DelegatingImageSavedCallback(new ImageCapture.OnImageSavedCallback() { // from class: androidx.camera.core.ImageCaptureExtKt$takePicture$4$1
            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public void onCaptureProcessProgressed(int i6) {
                p5.l<Integer, d5.j> lVar3 = lVar;
                if (lVar3 != null) {
                    lVar3.invoke(Integer.valueOf(i6));
                }
            }

            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public void onCaptureStarted() {
                p5.a<d5.j> aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.a();
                }
            }

            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public void onError(ImageCaptureException imageCaptureException) {
                kotlin.jvm.internal.j.e("exception", imageCaptureException);
                DelegatingImageSavedCallback delegatingImageSavedCallback = pVar.s;
                if (delegatingImageSavedCallback == null) {
                    kotlin.jvm.internal.j.g("delegatingCallback");
                    throw null;
                }
                delegatingImageSavedCallback.dispose();
                fVar.g(d5.e.a(imageCaptureException));
            }

            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public void onImageSaved(ImageCapture.OutputFileResults outputFileResults) {
                kotlin.jvm.internal.j.e("outputFileResults", outputFileResults);
                DelegatingImageSavedCallback delegatingImageSavedCallback = pVar.s;
                if (delegatingImageSavedCallback == null) {
                    kotlin.jvm.internal.j.g("delegatingCallback");
                    throw null;
                }
                delegatingImageSavedCallback.dispose();
                fVar.g(outputFileResults);
            }

            @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
            public void onPostviewBitmapAvailable(Bitmap bitmap) {
                kotlin.jvm.internal.j.e("bitmap", bitmap);
                p5.l<Bitmap, d5.j> lVar3 = lVar2;
                if (lVar3 != null) {
                    lVar3.invoke(bitmap);
                }
            }
        });
        fVar.o(new ImageCaptureExtKt$takePicture$4$2(pVar));
        T t6 = pVar.s;
        if (t6 != 0) {
            imageCapture.lambda$takePicture$2(outputFileOptions, executorDirectExecutor, (DelegatingImageSavedCallback) t6);
            return fVar.l();
        }
        kotlin.jvm.internal.j.g("delegatingCallback");
        throw null;
    }
}
