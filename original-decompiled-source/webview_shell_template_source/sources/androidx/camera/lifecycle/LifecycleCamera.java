package androidx.camera.lifecycle;

import android.annotation.SuppressLint;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.lifecycle.h;
import androidx.lifecycle.l;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
@SuppressLint({"UsesNonDefaultVisibleForTesting"})
/* loaded from: classes.dex */
public final class LifecycleCamera implements l, Camera {
    private final CameraUseCaseAdapter mCameraUseCaseAdapter;
    private final m mLifecycleOwner;
    private final Object mLock = new Object();
    private volatile boolean mIsActive = false;
    private boolean mSuspended = false;
    private boolean mReleased = false;

    public LifecycleCamera(m mVar, CameraUseCaseAdapter cameraUseCaseAdapter) {
        this.mLifecycleOwner = mVar;
        this.mCameraUseCaseAdapter = cameraUseCaseAdapter;
        if (mVar.getLifecycle().b().compareTo(h.b.f1303v) >= 0) {
            cameraUseCaseAdapter.attachUseCases();
        } else {
            cameraUseCaseAdapter.detachUseCases();
        }
        mVar.getLifecycle().a(this);
    }

    public void bind(Collection<UseCase> collection) {
        synchronized (this.mLock) {
            this.mCameraUseCaseAdapter.addUseCases(collection);
        }
    }

    @Override // androidx.camera.core.Camera
    public CameraControl getCameraControl() {
        return this.mCameraUseCaseAdapter.getCameraControl();
    }

    @Override // androidx.camera.core.Camera
    public CameraInfo getCameraInfo() {
        return this.mCameraUseCaseAdapter.getCameraInfo();
    }

    public CameraUseCaseAdapter getCameraUseCaseAdapter() {
        return this.mCameraUseCaseAdapter;
    }

    @Override // androidx.camera.core.Camera
    public CameraConfig getExtendedConfig() {
        return this.mCameraUseCaseAdapter.getExtendedConfig();
    }

    public m getLifecycleOwner() {
        m mVar;
        synchronized (this.mLock) {
            mVar = this.mLifecycleOwner;
        }
        return mVar;
    }

    public CameraInfo getSecondaryCameraInfo() {
        return this.mCameraUseCaseAdapter.getSecondaryCameraInfo();
    }

    public List<UseCase> getUseCases() {
        List<UseCase> listUnmodifiableList;
        synchronized (this.mLock) {
            listUnmodifiableList = Collections.unmodifiableList(this.mCameraUseCaseAdapter.getUseCases());
        }
        return listUnmodifiableList;
    }

    public boolean isActive() {
        boolean z6;
        synchronized (this.mLock) {
            z6 = this.mIsActive;
        }
        return z6;
    }

    public boolean isBound(UseCase useCase) {
        boolean zContains;
        synchronized (this.mLock) {
            zContains = this.mCameraUseCaseAdapter.getUseCases().contains(useCase);
        }
        return zContains;
    }

    @Override // androidx.camera.core.Camera
    public boolean isUseCasesCombinationSupported(boolean z6, UseCase... useCaseArr) {
        return this.mCameraUseCaseAdapter.isUseCasesCombinationSupported(z6, useCaseArr);
    }

    @t(h.a.ON_DESTROY)
    public void onDestroy(m mVar) {
        synchronized (this.mLock) {
            CameraUseCaseAdapter cameraUseCaseAdapter = this.mCameraUseCaseAdapter;
            cameraUseCaseAdapter.removeUseCases(cameraUseCaseAdapter.getUseCases());
        }
    }

    @t(h.a.ON_PAUSE)
    public void onPause(m mVar) {
        this.mCameraUseCaseAdapter.setActiveResumingMode(false);
    }

    @t(h.a.ON_RESUME)
    public void onResume(m mVar) {
        this.mCameraUseCaseAdapter.setActiveResumingMode(true);
    }

    @t(h.a.ON_START)
    public void onStart(m mVar) {
        synchronized (this.mLock) {
            try {
                if (!this.mSuspended && !this.mReleased) {
                    this.mCameraUseCaseAdapter.attachUseCases();
                    this.mIsActive = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @t(h.a.ON_STOP)
    public void onStop(m mVar) {
        synchronized (this.mLock) {
            try {
                if (!this.mSuspended && !this.mReleased) {
                    this.mCameraUseCaseAdapter.detachUseCases();
                    this.mIsActive = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void release() {
        synchronized (this.mLock) {
            this.mReleased = true;
            this.mIsActive = false;
            this.mLifecycleOwner.getLifecycle().c(this);
        }
    }

    public void suspend() {
        synchronized (this.mLock) {
            try {
                if (this.mSuspended) {
                    return;
                }
                onStop(this.mLifecycleOwner);
                this.mSuspended = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void unbind(Collection<UseCase> collection) {
        synchronized (this.mLock) {
            ArrayList arrayList = new ArrayList(collection);
            arrayList.retainAll(this.mCameraUseCaseAdapter.getUseCases());
            this.mCameraUseCaseAdapter.removeUseCases(arrayList);
        }
    }

    public void unbindAll() {
        synchronized (this.mLock) {
            CameraUseCaseAdapter cameraUseCaseAdapter = this.mCameraUseCaseAdapter;
            cameraUseCaseAdapter.removeUseCases(cameraUseCaseAdapter.getUseCases());
        }
    }

    public void unsuspend() {
        synchronized (this.mLock) {
            try {
                if (this.mSuspended) {
                    this.mSuspended = false;
                    if (this.mLifecycleOwner.getLifecycle().b().compareTo(h.b.f1303v) >= 0) {
                        onStart(this.mLifecycleOwner);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
