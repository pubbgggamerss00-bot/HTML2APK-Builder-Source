package androidx.camera.camera2.internal.compat;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.util.ArrayMap;
import androidx.camera.camera2.internal.compat.ApiCompat;
import androidx.camera.core.impl.utils.MainThreadAsyncHandler;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class CameraManagerCompat {
    private final Map<String, CameraCharacteristicsCompat> mCameraCharacteristicsMap = new ArrayMap(4);
    private final CameraManagerCompatImpl mImpl;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class AvailabilityCallbackExecutorWrapper extends CameraManager.AvailabilityCallback {
        private final Executor mExecutor;
        final CameraManager.AvailabilityCallback mWrappedCallback;
        private final Object mLock = new Object();
        private boolean mDisabled = false;

        public AvailabilityCallbackExecutorWrapper(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
            this.mExecutor = executor;
            this.mWrappedCallback = availabilityCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCameraAccessPrioritiesChanged$0() {
            ApiCompat.Api29Impl.onCameraAccessPrioritiesChanged(this.mWrappedCallback);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCameraAvailable$1(String str) {
            this.mWrappedCallback.onCameraAvailable(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCameraUnavailable$2(String str) {
            this.mWrappedCallback.onCameraUnavailable(str);
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAccessPrioritiesChanged() {
            synchronized (this.mLock) {
                try {
                    if (!this.mDisabled) {
                        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.t
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.s.lambda$onCameraAccessPrioritiesChanged$0();
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(String str) {
            synchronized (this.mLock) {
                try {
                    if (!this.mDisabled) {
                        this.mExecutor.execute(new p(1, this, str));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(String str) {
            synchronized (this.mLock) {
                try {
                    if (!this.mDisabled) {
                        this.mExecutor.execute(new k(1, this, str));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void setDisabled() {
            synchronized (this.mLock) {
                this.mDisabled = true;
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface CameraManagerCompatImpl {
        static CameraManagerCompatImpl from(Context context, Handler handler) {
            int i6 = Build.VERSION.SDK_INT;
            return i6 >= 30 ? new CameraManagerCompatApi30Impl(context) : i6 >= 29 ? new CameraManagerCompatApi29Impl(context) : i6 >= 28 ? CameraManagerCompatApi28Impl.create(context) : CameraManagerCompatBaseImpl.create(context, handler);
        }

        CameraCharacteristics getCameraCharacteristics(String str);

        String[] getCameraIdList();

        CameraManager getCameraManager();

        Set<Set<String>> getConcurrentCameraIds();

        void openCamera(String str, Executor executor, CameraDevice.StateCallback stateCallback);

        void registerAvailabilityCallback(Executor executor, CameraManager.AvailabilityCallback availabilityCallback);

        void unregisterAvailabilityCallback(CameraManager.AvailabilityCallback availabilityCallback);
    }

    private CameraManagerCompat(CameraManagerCompatImpl cameraManagerCompatImpl) {
        this.mImpl = cameraManagerCompatImpl;
    }

    public static CameraManagerCompat from(Context context) {
        return from(context, MainThreadAsyncHandler.getInstance());
    }

    public CameraCharacteristicsCompat getCameraCharacteristicsCompat(String str) {
        CameraCharacteristicsCompat cameraCharacteristicsCompat;
        synchronized (this.mCameraCharacteristicsMap) {
            cameraCharacteristicsCompat = this.mCameraCharacteristicsMap.get(str);
            if (cameraCharacteristicsCompat == null) {
                try {
                    cameraCharacteristicsCompat = CameraCharacteristicsCompat.toCameraCharacteristicsCompat(this.mImpl.getCameraCharacteristics(str), str);
                    this.mCameraCharacteristicsMap.put(str, cameraCharacteristicsCompat);
                } catch (AssertionError e6) {
                    throw new CameraAccessExceptionCompat(CameraAccessExceptionCompat.CAMERA_CHARACTERISTICS_CREATION_ERROR, e6.getMessage(), e6);
                }
            }
        }
        return cameraCharacteristicsCompat;
    }

    public String[] getCameraIdList() {
        return this.mImpl.getCameraIdList();
    }

    public Set<Set<String>> getConcurrentCameraIds() {
        return this.mImpl.getConcurrentCameraIds();
    }

    public void openCamera(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        this.mImpl.openCamera(str, executor, stateCallback);
    }

    public void registerAvailabilityCallback(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.mImpl.registerAvailabilityCallback(executor, availabilityCallback);
    }

    public void unregisterAvailabilityCallback(CameraManager.AvailabilityCallback availabilityCallback) {
        this.mImpl.unregisterAvailabilityCallback(availabilityCallback);
    }

    public CameraManager unwrap() {
        return this.mImpl.getCameraManager();
    }

    public static CameraManagerCompat from(Context context, Handler handler) {
        return new CameraManagerCompat(CameraManagerCompatImpl.from(context, handler));
    }

    public static CameraManagerCompat from(CameraManagerCompatImpl cameraManagerCompatImpl) {
        return new CameraManagerCompat(cameraManagerCompatImpl);
    }
}
