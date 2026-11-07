package androidx.camera.core.impl;

import androidx.camera.core.Camera;
import androidx.camera.core.Logger;
import androidx.camera.core.concurrent.CameraCoordinator;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.y;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class CameraStateRegistry implements CameraCoordinator.ConcurrentCameraModeListener {
    private static final int MAX_ALLOWED_CONCURRENT_CAMERAS_IN_CONCURRENT_MODE = 2;
    private static final int MAX_ALLOWED_CONCURRENT_CAMERAS_IN_SINGLE_MODE = 1;
    private static final String TAG = "CameraStateRegistry";
    private int mAvailableCameras;
    private final CameraCoordinator mCameraCoordinator;
    private final Map<Camera, CameraRegistration> mCameraStates;
    private final StringBuilder mDebugString = new StringBuilder();
    private final Object mLock;
    private int mMaxAllowedOpenedCameras;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class CameraRegistration {
        private final Executor mNotifyExecutor;
        private final OnConfigureAvailableListener mOnConfigureAvailableListener;
        private final OnOpenAvailableListener mOnOpenAvailableListener;
        private CameraInternal.State mState;

        public CameraRegistration(CameraInternal.State state, Executor executor, OnConfigureAvailableListener onConfigureAvailableListener, OnOpenAvailableListener onOpenAvailableListener) {
            this.mState = state;
            this.mNotifyExecutor = executor;
            this.mOnConfigureAvailableListener = onConfigureAvailableListener;
            this.mOnOpenAvailableListener = onOpenAvailableListener;
        }

        public CameraInternal.State getState() {
            return this.mState;
        }

        public void notifyOnConfigureAvailableListener() {
            try {
                Executor executor = this.mNotifyExecutor;
                OnConfigureAvailableListener onConfigureAvailableListener = this.mOnConfigureAvailableListener;
                Objects.requireNonNull(onConfigureAvailableListener);
                executor.execute(new androidx.camera.camera2.interop.c(1, onConfigureAvailableListener));
            } catch (RejectedExecutionException e6) {
                Logger.e(CameraStateRegistry.TAG, "Unable to notify camera to configure.", e6);
            }
        }

        public void notifyOnOpenAvailableListener() {
            try {
                Executor executor = this.mNotifyExecutor;
                OnOpenAvailableListener onOpenAvailableListener = this.mOnOpenAvailableListener;
                Objects.requireNonNull(onOpenAvailableListener);
                executor.execute(new y(2, onOpenAvailableListener));
            } catch (RejectedExecutionException e6) {
                Logger.e(CameraStateRegistry.TAG, "Unable to notify camera to open.", e6);
            }
        }

        public CameraInternal.State setState(CameraInternal.State state) {
            CameraInternal.State state2 = this.mState;
            this.mState = state;
            return state2;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface OnConfigureAvailableListener {
        void onConfigureAvailable();
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface OnOpenAvailableListener {
        void onOpenAvailable();
    }

    public CameraStateRegistry(CameraCoordinator cameraCoordinator, int i6) {
        Object obj = new Object();
        this.mLock = obj;
        this.mCameraStates = new HashMap();
        this.mMaxAllowedOpenedCameras = i6;
        synchronized (obj) {
            this.mCameraCoordinator = cameraCoordinator;
            this.mAvailableCameras = this.mMaxAllowedOpenedCameras;
        }
    }

    private CameraRegistration getCameraRegistration(String str) {
        for (Camera camera : this.mCameraStates.keySet()) {
            if (str.equals(((CameraInfoInternal) camera.getCameraInfo()).getCameraId())) {
                return this.mCameraStates.get(camera);
            }
        }
        return null;
    }

    private static boolean isOpen(CameraInternal.State state) {
        return state != null && state.holdsCameraSlot();
    }

    private void recalculateAvailableCameras() {
        if (Logger.isDebugEnabled(TAG)) {
            this.mDebugString.setLength(0);
            this.mDebugString.append("Recalculating open cameras:\n");
            this.mDebugString.append(String.format(Locale.US, "%-45s%-22s\n", "Camera", "State"));
            this.mDebugString.append("-------------------------------------------------------------------\n");
        }
        int i6 = 0;
        for (Map.Entry<Camera, CameraRegistration> entry : this.mCameraStates.entrySet()) {
            if (Logger.isDebugEnabled(TAG)) {
                this.mDebugString.append(String.format(Locale.US, "%-45s%-22s\n", entry.getKey().toString(), entry.getValue().getState() != null ? entry.getValue().getState().toString() : "UNKNOWN"));
            }
            if (isOpen(entry.getValue().getState())) {
                i6++;
            }
        }
        if (Logger.isDebugEnabled(TAG)) {
            this.mDebugString.append("-------------------------------------------------------------------\n");
            StringBuilder sb = this.mDebugString;
            Locale locale = Locale.US;
            sb.append("Open count: " + i6 + " (Max allowed: " + this.mMaxAllowedOpenedCameras + ")");
            Logger.d(TAG, this.mDebugString.toString());
        }
        this.mAvailableCameras = Math.max(this.mMaxAllowedOpenedCameras - i6, 0);
    }

    private static void traceState(Camera camera, CameraInternal.State state) {
        if (d2.a.b()) {
            d2.a.c(state.ordinal(), "CX:State[" + camera + "]");
        }
    }

    private CameraInternal.State unregisterCamera(Camera camera) {
        CameraRegistration cameraRegistrationRemove = this.mCameraStates.remove(camera);
        if (cameraRegistrationRemove == null) {
            return null;
        }
        recalculateAvailableCameras();
        return cameraRegistrationRemove.getState();
    }

    private CameraInternal.State updateAndVerifyState(Camera camera, CameraInternal.State state) {
        CameraRegistration cameraRegistration = this.mCameraStates.get(camera);
        androidx.work.j.e("Cannot update state of camera which has not yet been registered. Register with CameraStateRegistry.registerCamera()", cameraRegistration);
        CameraInternal.State state2 = cameraRegistration.setState(state);
        CameraInternal.State state3 = CameraInternal.State.OPENING;
        if (state == state3) {
            androidx.work.j.f("Cannot mark camera as opening until camera was successful at calling CameraStateRegistry.tryOpenCamera()", isOpen(state) || state2 == state3);
        }
        if (state2 != state) {
            traceState(camera, state);
            recalculateAvailableCameras();
        }
        return state2;
    }

    public boolean isCameraClosing() {
        synchronized (this.mLock) {
            try {
                Iterator<Map.Entry<Camera, CameraRegistration>> it = this.mCameraStates.entrySet().iterator();
                while (it.hasNext()) {
                    if (it.next().getValue().getState() == CameraInternal.State.CLOSING) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void markCameraState(Camera camera, CameraInternal.State state) {
        markCameraState(camera, state, true);
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator.ConcurrentCameraModeListener
    public void onCameraOperatingModeUpdated(int i6, int i7) {
        synchronized (this.mLock) {
            boolean z6 = true;
            this.mMaxAllowedOpenedCameras = i7 == 2 ? 2 : 1;
            boolean z7 = i6 != 2 && i7 == 2;
            if (i6 != 2 || i7 == 2) {
                z6 = false;
            }
            if (z7 || z6) {
                recalculateAvailableCameras();
            }
        }
    }

    public void registerCamera(Camera camera, Executor executor, OnConfigureAvailableListener onConfigureAvailableListener, OnOpenAvailableListener onOpenAvailableListener) {
        synchronized (this.mLock) {
            androidx.work.j.f("Camera is already registered: " + camera, !this.mCameraStates.containsKey(camera));
            this.mCameraStates.put(camera, new CameraRegistration(null, executor, onConfigureAvailableListener, onOpenAvailableListener));
        }
    }

    public boolean tryOpenCamera(Camera camera) {
        boolean z6;
        synchronized (this.mLock) {
            try {
                CameraRegistration cameraRegistration = this.mCameraStates.get(camera);
                androidx.work.j.e("Camera must first be registered with registerCamera()", cameraRegistration);
                z6 = false;
                if (Logger.isDebugEnabled(TAG)) {
                    this.mDebugString.setLength(0);
                    this.mDebugString.append(String.format(Locale.US, "tryOpenCamera(%s) [Available Cameras: %d, Already Open: %b (Previous state: %s)]", camera, Integer.valueOf(this.mAvailableCameras), Boolean.valueOf(isOpen(cameraRegistration.getState())), cameraRegistration.getState()));
                }
                if (this.mAvailableCameras > 0 || isOpen(cameraRegistration.getState())) {
                    CameraInternal.State state = CameraInternal.State.OPENING;
                    cameraRegistration.setState(state);
                    traceState(camera, state);
                    z6 = true;
                }
                if (Logger.isDebugEnabled(TAG)) {
                    StringBuilder sb = this.mDebugString;
                    Locale locale = Locale.US;
                    sb.append(" --> ".concat(z6 ? "SUCCESS" : "FAIL"));
                    Logger.d(TAG, this.mDebugString.toString());
                }
                if (z6) {
                    recalculateAvailableCameras();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z6;
    }

    public boolean tryOpenCaptureSession(String str, String str2) {
        synchronized (this.mLock) {
            try {
                boolean z6 = true;
                if (this.mCameraCoordinator.getCameraOperatingMode() != 2) {
                    return true;
                }
                CameraRegistration cameraRegistration = getCameraRegistration(str);
                CameraInternal.State state = cameraRegistration != null ? cameraRegistration.getState() : null;
                CameraRegistration cameraRegistration2 = str2 != null ? getCameraRegistration(str2) : null;
                CameraInternal.State state2 = cameraRegistration2 != null ? cameraRegistration2.getState() : null;
                CameraInternal.State state3 = CameraInternal.State.OPEN;
                boolean z7 = state3.equals(state) || CameraInternal.State.CONFIGURED.equals(state);
                boolean z8 = state3.equals(state2) || CameraInternal.State.CONFIGURED.equals(state2);
                if (!z7 || !z8) {
                    z6 = false;
                }
                return z6;
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void markCameraState(Camera camera, CameraInternal.State state, boolean z6) {
        CameraRegistration cameraRegistration;
        synchronized (this.mLock) {
            try {
                int i6 = this.mAvailableCameras;
                if ((state == CameraInternal.State.RELEASED ? unregisterCamera(camera) : updateAndVerifyState(camera, state)) == state) {
                    return;
                }
                HashMap map = null;
                if (this.mCameraCoordinator.getCameraOperatingMode() == 2 && state == CameraInternal.State.CONFIGURED) {
                    String pairedConcurrentCameraId = this.mCameraCoordinator.getPairedConcurrentCameraId(((CameraInfoInternal) camera.getCameraInfo()).getCameraId());
                    if (pairedConcurrentCameraId != null) {
                        cameraRegistration = getCameraRegistration(pairedConcurrentCameraId);
                    }
                } else {
                    cameraRegistration = null;
                }
                if (i6 < 1 && this.mAvailableCameras > 0) {
                    map = new HashMap();
                    for (Map.Entry<Camera, CameraRegistration> entry : this.mCameraStates.entrySet()) {
                        if (entry.getValue().getState() == CameraInternal.State.PENDING_OPEN) {
                            map.put(entry.getKey(), entry.getValue());
                        }
                    }
                } else if (state == CameraInternal.State.PENDING_OPEN && this.mAvailableCameras > 0) {
                    map = new HashMap();
                    map.put(camera, this.mCameraStates.get(camera));
                }
                if (map != null && !z6) {
                    map.remove(camera);
                }
                if (map != null) {
                    Iterator it = map.values().iterator();
                    while (it.hasNext()) {
                        ((CameraRegistration) it.next()).notifyOnOpenAvailableListener();
                    }
                }
                if (cameraRegistration != null) {
                    cameraRegistration.notifyOnConfigureAvailableListener();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
