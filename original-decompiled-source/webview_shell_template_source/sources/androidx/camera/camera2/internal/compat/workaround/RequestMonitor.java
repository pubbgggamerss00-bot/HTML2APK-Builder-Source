package androidx.camera.camera2.internal.compat.workaround;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Log;
import androidx.camera.camera2.internal.Camera2CaptureCallbacks;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.Futures;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import y.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class RequestMonitor {
    private static final String TAG = "RequestMonitor";
    private final boolean mQuirkEnabled;
    private final List<c5.a<Void>> mRequestTasks = Collections.synchronizedList(new ArrayList());

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class RequestCompleteListener extends CameraCaptureSession.CaptureCallback {
        b.a<Void> mStartRequestCompleter;
        final c5.a<Void> mStartRequestFuture = y.b.a(new b.c() { // from class: androidx.camera.camera2.internal.compat.workaround.d
            @Override // y.b.c
            public final Object attachCompleter(b.a aVar) {
                return this.s.lambda$new$0(aVar);
            }
        });

        private void completeFuture() {
            b.a<Void> aVar = this.mStartRequestCompleter;
            if (aVar != null) {
                aVar.a(null);
                this.mStartRequestCompleter = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$new$0(b.a aVar) {
            this.mStartRequestCompleter = aVar;
            return "RequestCompleteListener[" + this + "]";
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            completeFuture();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            completeFuture();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i6) {
            completeFuture();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i6, long j6) {
            completeFuture();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j6, long j7) {
            completeFuture();
        }
    }

    public RequestMonitor(boolean z6) {
        this.mQuirkEnabled = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createMonitorListener$1(RequestCompleteListener requestCompleteListener, c5.a aVar) {
        Log.d(TAG, "RequestListener " + requestCompleteListener + " done " + this);
        this.mRequestTasks.remove(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void lambda$getRequestsProcessedFuture$0(List list) {
        return null;
    }

    public CameraCaptureSession.CaptureCallback createMonitorListener(CameraCaptureSession.CaptureCallback captureCallback) {
        return shouldMonitorRequest() ? Camera2CaptureCallbacks.createComboCallback(createMonitorListener(), captureCallback) : captureCallback;
    }

    public c5.a<Void> getRequestsProcessedFuture() {
        return this.mRequestTasks.isEmpty() ? Futures.immediateFuture(null) : Futures.nonCancellationPropagating(Futures.transform(Futures.successfulAsList(new ArrayList(this.mRequestTasks)), new c(), CameraXExecutors.directExecutor()));
    }

    public boolean shouldMonitorRequest() {
        return this.mQuirkEnabled;
    }

    public void stop() {
        LinkedList linkedList = new LinkedList(this.mRequestTasks);
        while (!linkedList.isEmpty()) {
            c5.a aVar = (c5.a) linkedList.poll();
            Objects.requireNonNull(aVar);
            aVar.cancel(true);
        }
    }

    private CameraCaptureSession.CaptureCallback createMonitorListener() {
        final RequestCompleteListener requestCompleteListener = new RequestCompleteListener();
        final c5.a<Void> aVar = requestCompleteListener.mStartRequestFuture;
        this.mRequestTasks.add(aVar);
        Log.d(TAG, "RequestListener " + requestCompleteListener + " monitoring " + this);
        aVar.addListener(new Runnable() { // from class: androidx.camera.camera2.internal.compat.workaround.b
            @Override // java.lang.Runnable
            public final void run() {
                this.s.lambda$createMonitorListener$1(requestCompleteListener, aVar);
            }
        }, CameraXExecutors.directExecutor());
        return requestCompleteListener;
    }
}
