package androidx.camera.lifecycle;

import androidx.camera.core.CameraEffect;
import androidx.camera.core.UseCase;
import androidx.camera.core.ViewPort;
import androidx.camera.core.concurrent.CameraCoordinator;
import androidx.camera.core.impl.RestrictedCameraInfo;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.lifecycle.h;
import androidx.lifecycle.l;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import androidx.work.j;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
final class LifecycleCameraRepository {
    CameraCoordinator mCameraCoordinator;
    private final Object mLock = new Object();
    private final Map<Key, LifecycleCamera> mCameraMap = new HashMap();
    private final Map<LifecycleCameraRepositoryObserver, Set<Key>> mLifecycleObserverMap = new HashMap();
    private final ArrayDeque<m> mActiveLifecycleOwners = new ArrayDeque<>();

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class Key {
        public static Key create(m mVar, CameraUseCaseAdapter.CameraId cameraId) {
            return new AutoValue_LifecycleCameraRepository_Key(mVar, cameraId);
        }

        public abstract CameraUseCaseAdapter.CameraId getCameraId();

        public abstract m getLifecycleOwner();
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class LifecycleCameraRepositoryObserver implements l {
        private final LifecycleCameraRepository mLifecycleCameraRepository;
        private final m mLifecycleOwner;

        public LifecycleCameraRepositoryObserver(m mVar, LifecycleCameraRepository lifecycleCameraRepository) {
            this.mLifecycleOwner = mVar;
            this.mLifecycleCameraRepository = lifecycleCameraRepository;
        }

        public m getLifecycleOwner() {
            return this.mLifecycleOwner;
        }

        @t(h.a.ON_DESTROY)
        public void onDestroy(m mVar) {
            this.mLifecycleCameraRepository.unregisterLifecycle(mVar);
        }

        @t(h.a.ON_START)
        public void onStart(m mVar) {
            this.mLifecycleCameraRepository.setActive(mVar);
        }

        @t(h.a.ON_STOP)
        public void onStop(m mVar) {
            this.mLifecycleCameraRepository.setInactive(mVar);
        }
    }

    private LifecycleCameraRepositoryObserver getLifecycleCameraRepositoryObserver(m mVar) {
        synchronized (this.mLock) {
            try {
                for (LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver : this.mLifecycleObserverMap.keySet()) {
                    if (mVar.equals(lifecycleCameraRepositoryObserver.getLifecycleOwner())) {
                        return lifecycleCameraRepositoryObserver;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private boolean hasUseCaseBound(m mVar) {
        synchronized (this.mLock) {
            try {
                LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver = getLifecycleCameraRepositoryObserver(mVar);
                if (lifecycleCameraRepositoryObserver == null) {
                    return false;
                }
                Iterator<Key> it = this.mLifecycleObserverMap.get(lifecycleCameraRepositoryObserver).iterator();
                while (it.hasNext()) {
                    LifecycleCamera lifecycleCamera = this.mCameraMap.get(it.next());
                    lifecycleCamera.getClass();
                    if (!lifecycleCamera.getUseCases().isEmpty()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void registerCamera(LifecycleCamera lifecycleCamera) {
        synchronized (this.mLock) {
            try {
                m lifecycleOwner = lifecycleCamera.getLifecycleOwner();
                Key keyCreate = Key.create(lifecycleOwner, CameraUseCaseAdapter.generateCameraId((RestrictedCameraInfo) lifecycleCamera.getCameraInfo(), (RestrictedCameraInfo) lifecycleCamera.getSecondaryCameraInfo()));
                LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver = getLifecycleCameraRepositoryObserver(lifecycleOwner);
                Set<Key> hashSet = lifecycleCameraRepositoryObserver != null ? this.mLifecycleObserverMap.get(lifecycleCameraRepositoryObserver) : new HashSet<>();
                hashSet.add(keyCreate);
                this.mCameraMap.put(keyCreate, lifecycleCamera);
                if (lifecycleCameraRepositoryObserver == null) {
                    LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver2 = new LifecycleCameraRepositoryObserver(lifecycleOwner, this);
                    this.mLifecycleObserverMap.put(lifecycleCameraRepositoryObserver2, hashSet);
                    lifecycleOwner.getLifecycle().a(lifecycleCameraRepositoryObserver2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void suspendUseCases(m mVar) {
        synchronized (this.mLock) {
            try {
                LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver = getLifecycleCameraRepositoryObserver(mVar);
                if (lifecycleCameraRepositoryObserver == null) {
                    return;
                }
                Iterator<Key> it = this.mLifecycleObserverMap.get(lifecycleCameraRepositoryObserver).iterator();
                while (it.hasNext()) {
                    LifecycleCamera lifecycleCamera = this.mCameraMap.get(it.next());
                    lifecycleCamera.getClass();
                    lifecycleCamera.suspend();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void unsuspendUseCases(m mVar) {
        synchronized (this.mLock) {
            try {
                Iterator<Key> it = this.mLifecycleObserverMap.get(getLifecycleCameraRepositoryObserver(mVar)).iterator();
                while (it.hasNext()) {
                    LifecycleCamera lifecycleCamera = this.mCameraMap.get(it.next());
                    lifecycleCamera.getClass();
                    if (!lifecycleCamera.getUseCases().isEmpty()) {
                        lifecycleCamera.unsuspend();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void bindToLifecycleCamera(LifecycleCamera lifecycleCamera, ViewPort viewPort, List<CameraEffect> list, Collection<UseCase> collection, CameraCoordinator cameraCoordinator) {
        synchronized (this.mLock) {
            try {
                boolean z6 = true;
                j.b(!collection.isEmpty());
                this.mCameraCoordinator = cameraCoordinator;
                m lifecycleOwner = lifecycleCamera.getLifecycleOwner();
                LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver = getLifecycleCameraRepositoryObserver(lifecycleOwner);
                if (lifecycleCameraRepositoryObserver == null) {
                    return;
                }
                Set<Key> set = this.mLifecycleObserverMap.get(lifecycleCameraRepositoryObserver);
                CameraCoordinator cameraCoordinator2 = this.mCameraCoordinator;
                if (cameraCoordinator2 == null || cameraCoordinator2.getCameraOperatingMode() != 2) {
                    Iterator<Key> it = set.iterator();
                    while (it.hasNext()) {
                        LifecycleCamera lifecycleCamera2 = this.mCameraMap.get(it.next());
                        lifecycleCamera2.getClass();
                        if (!lifecycleCamera2.equals(lifecycleCamera) && !lifecycleCamera2.getUseCases().isEmpty()) {
                            throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner.");
                        }
                    }
                }
                try {
                    lifecycleCamera.getCameraUseCaseAdapter().setViewPort(viewPort);
                    lifecycleCamera.getCameraUseCaseAdapter().setEffects(list);
                    lifecycleCamera.bind(collection);
                    if (lifecycleOwner.getLifecycle().b().compareTo(h.b.f1303v) < 0) {
                        z6 = false;
                    }
                    if (z6) {
                        setActive(lifecycleOwner);
                    }
                } catch (CameraUseCaseAdapter.CameraException e6) {
                    throw new IllegalArgumentException(e6);
                }
            } finally {
            }
        }
    }

    public void clear() {
        synchronized (this.mLock) {
            try {
                Iterator it = new HashSet(this.mLifecycleObserverMap.keySet()).iterator();
                while (it.hasNext()) {
                    unregisterLifecycle(((LifecycleCameraRepositoryObserver) it.next()).getLifecycleOwner());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public LifecycleCamera createLifecycleCamera(m mVar, CameraUseCaseAdapter cameraUseCaseAdapter) {
        synchronized (this.mLock) {
            try {
                j.a("LifecycleCamera already exists for the given LifecycleOwner and set of cameras", this.mCameraMap.get(Key.create(mVar, cameraUseCaseAdapter.getCameraId())) == null);
                LifecycleCamera lifecycleCamera = new LifecycleCamera(mVar, cameraUseCaseAdapter);
                if (cameraUseCaseAdapter.getUseCases().isEmpty()) {
                    lifecycleCamera.suspend();
                }
                if (mVar.getLifecycle().b() == h.b.s) {
                    return lifecycleCamera;
                }
                registerCamera(lifecycleCamera);
                return lifecycleCamera;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public LifecycleCamera getLifecycleCamera(m mVar, CameraUseCaseAdapter.CameraId cameraId) {
        LifecycleCamera lifecycleCamera;
        synchronized (this.mLock) {
            lifecycleCamera = this.mCameraMap.get(Key.create(mVar, cameraId));
        }
        return lifecycleCamera;
    }

    public Collection<LifecycleCamera> getLifecycleCameras() {
        Collection<LifecycleCamera> collectionUnmodifiableCollection;
        synchronized (this.mLock) {
            collectionUnmodifiableCollection = Collections.unmodifiableCollection(this.mCameraMap.values());
        }
        return collectionUnmodifiableCollection;
    }

    public void setActive(m mVar) {
        synchronized (this.mLock) {
            try {
                if (hasUseCaseBound(mVar)) {
                    if (this.mActiveLifecycleOwners.isEmpty()) {
                        this.mActiveLifecycleOwners.push(mVar);
                    } else {
                        CameraCoordinator cameraCoordinator = this.mCameraCoordinator;
                        if (cameraCoordinator == null || cameraCoordinator.getCameraOperatingMode() != 2) {
                            m mVarPeek = this.mActiveLifecycleOwners.peek();
                            if (!mVar.equals(mVarPeek)) {
                                suspendUseCases(mVarPeek);
                                this.mActiveLifecycleOwners.remove(mVar);
                                this.mActiveLifecycleOwners.push(mVar);
                            }
                        }
                    }
                    unsuspendUseCases(mVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setInactive(m mVar) {
        synchronized (this.mLock) {
            try {
                this.mActiveLifecycleOwners.remove(mVar);
                suspendUseCases(mVar);
                if (!this.mActiveLifecycleOwners.isEmpty()) {
                    unsuspendUseCases(this.mActiveLifecycleOwners.peek());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void unbind(Collection<UseCase> collection) {
        synchronized (this.mLock) {
            try {
                Iterator<Key> it = this.mCameraMap.keySet().iterator();
                while (it.hasNext()) {
                    LifecycleCamera lifecycleCamera = this.mCameraMap.get(it.next());
                    boolean zIsEmpty = lifecycleCamera.getUseCases().isEmpty();
                    lifecycleCamera.unbind(collection);
                    if (!zIsEmpty && lifecycleCamera.getUseCases().isEmpty()) {
                        setInactive(lifecycleCamera.getLifecycleOwner());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void unbindAll() {
        synchronized (this.mLock) {
            try {
                Iterator<Key> it = this.mCameraMap.keySet().iterator();
                while (it.hasNext()) {
                    LifecycleCamera lifecycleCamera = this.mCameraMap.get(it.next());
                    lifecycleCamera.unbindAll();
                    setInactive(lifecycleCamera.getLifecycleOwner());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void unregisterLifecycle(m mVar) {
        synchronized (this.mLock) {
            try {
                LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver = getLifecycleCameraRepositoryObserver(mVar);
                if (lifecycleCameraRepositoryObserver == null) {
                    return;
                }
                setInactive(mVar);
                Iterator<Key> it = this.mLifecycleObserverMap.get(lifecycleCameraRepositoryObserver).iterator();
                while (it.hasNext()) {
                    this.mCameraMap.remove(it.next());
                }
                this.mLifecycleObserverMap.remove(lifecycleCameraRepositoryObserver);
                lifecycleCameraRepositoryObserver.getLifecycleOwner().getLifecycle().c(lifecycleCameraRepositoryObserver);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
