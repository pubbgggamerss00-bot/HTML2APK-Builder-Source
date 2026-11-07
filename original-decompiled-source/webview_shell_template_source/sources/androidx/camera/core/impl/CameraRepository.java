package androidx.camera.core.impl;

import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.x;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import y.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class CameraRepository {
    private static final String TAG = "CameraRepository";
    private b.a<Void> mDeinitCompleter;
    private c5.a<Void> mDeinitFuture;
    private final Object mCamerasLock = new Object();
    private final Map<String, CameraInternal> mCameras = new LinkedHashMap();
    private final Set<CameraInternal> mReleasingCameras = new HashSet();

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$deinit$0(b.a aVar) {
        synchronized (this.mCamerasLock) {
            this.mDeinitCompleter = aVar;
        }
        return "CameraRepository-deinit";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$deinit$1(CameraInternal cameraInternal) {
        synchronized (this.mCamerasLock) {
            try {
                this.mReleasingCameras.remove(cameraInternal);
                if (this.mReleasingCameras.isEmpty()) {
                    this.mDeinitCompleter.getClass();
                    this.mDeinitCompleter.a(null);
                    this.mDeinitCompleter = null;
                    this.mDeinitFuture = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public c5.a<Void> deinit() {
        synchronized (this.mCamerasLock) {
            try {
                if (this.mCameras.isEmpty()) {
                    c5.a<Void> aVarImmediateFuture = this.mDeinitFuture;
                    if (aVarImmediateFuture == null) {
                        aVarImmediateFuture = Futures.immediateFuture(null);
                    }
                    return aVarImmediateFuture;
                }
                c5.a<Void> aVarA = this.mDeinitFuture;
                if (aVarA == null) {
                    aVarA = y.b.a(new androidx.camera.camera2.interop.g(2, this));
                    this.mDeinitFuture = aVarA;
                }
                this.mReleasingCameras.addAll(this.mCameras.values());
                for (CameraInternal cameraInternal : this.mCameras.values()) {
                    cameraInternal.release().addListener(new x(2, this, cameraInternal), CameraXExecutors.directExecutor());
                }
                this.mCameras.clear();
                return aVarA;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public CameraInternal getCamera(String str) {
        CameraInternal cameraInternal;
        synchronized (this.mCamerasLock) {
            try {
                cameraInternal = this.mCameras.get(str);
                if (cameraInternal == null) {
                    throw new IllegalArgumentException("Invalid camera: " + str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cameraInternal;
    }

    public Set<String> getCameraIds() {
        LinkedHashSet linkedHashSet;
        synchronized (this.mCamerasLock) {
            linkedHashSet = new LinkedHashSet(this.mCameras.keySet());
        }
        return linkedHashSet;
    }

    public LinkedHashSet<CameraInternal> getCameras() {
        LinkedHashSet<CameraInternal> linkedHashSet;
        synchronized (this.mCamerasLock) {
            linkedHashSet = new LinkedHashSet<>(this.mCameras.values());
        }
        return linkedHashSet;
    }

    public void init(CameraFactory cameraFactory) {
        synchronized (this.mCamerasLock) {
            try {
                for (String str : cameraFactory.getAvailableCameraIds()) {
                    Logger.d(TAG, "Added camera: " + str);
                    this.mCameras.put(str, cameraFactory.getCamera(str));
                }
            } catch (CameraUnavailableException e6) {
                throw new InitializationException(e6);
            }
        }
    }
}
