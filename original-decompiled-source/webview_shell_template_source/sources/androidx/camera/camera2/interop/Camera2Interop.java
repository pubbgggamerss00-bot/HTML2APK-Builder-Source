package androidx.camera.camera2.interop;

import android.annotation.SuppressLint;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.core.ExtendableBuilder;
import androidx.camera.core.impl.Config;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
@ExperimentalCamera2Interop
/* loaded from: classes.dex */
public final class Camera2Interop {

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class Extender<T> {
        ExtendableBuilder<T> mBaseBuilder;

        public Extender(ExtendableBuilder<T> extendableBuilder) {
            this.mBaseBuilder = extendableBuilder;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public <ValueT> Extender<T> setCaptureRequestOption(CaptureRequest.Key<ValueT> key, ValueT valuet) {
            this.mBaseBuilder.getMutableConfig().insertOption(Camera2ImplConfig.createCaptureRequestOption(key), Config.OptionPriority.ALWAYS_OVERRIDE, valuet);
            return this;
        }

        public Extender<T> setCaptureRequestTemplate(int i6) {
            this.mBaseBuilder.getMutableConfig().insertOption(Camera2ImplConfig.TEMPLATE_TYPE_OPTION, Integer.valueOf(i6));
            return this;
        }

        @SuppressLint({"ExecutorRegistration"})
        public Extender<T> setDeviceStateCallback(CameraDevice.StateCallback stateCallback) {
            this.mBaseBuilder.getMutableConfig().insertOption(Camera2ImplConfig.DEVICE_STATE_CALLBACK_OPTION, stateCallback);
            return this;
        }

        public Extender<T> setPhysicalCameraId(String str) {
            this.mBaseBuilder.getMutableConfig().insertOption(Camera2ImplConfig.SESSION_PHYSICAL_CAMERA_ID_OPTION, str);
            return this;
        }

        @SuppressLint({"ExecutorRegistration"})
        public Extender<T> setSessionCaptureCallback(CameraCaptureSession.CaptureCallback captureCallback) {
            this.mBaseBuilder.getMutableConfig().insertOption(Camera2ImplConfig.SESSION_CAPTURE_CALLBACK_OPTION, captureCallback);
            return this;
        }

        @SuppressLint({"ExecutorRegistration"})
        public Extender<T> setSessionStateCallback(CameraCaptureSession.StateCallback stateCallback) {
            this.mBaseBuilder.getMutableConfig().insertOption(Camera2ImplConfig.SESSION_STATE_CALLBACK_OPTION, stateCallback);
            return this;
        }

        public Extender<T> setStreamUseCase(long j6) {
            this.mBaseBuilder.getMutableConfig().insertOption(Camera2ImplConfig.STREAM_USE_CASE_OPTION, Long.valueOf(j6));
            return this;
        }
    }

    private Camera2Interop() {
    }
}
