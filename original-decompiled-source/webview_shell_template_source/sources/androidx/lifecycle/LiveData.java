package androidx.lifecycle;

import android.os.Looper;
import androidx.camera.camera2.internal.v0;
import androidx.lifecycle.h;
import java.util.Iterator;
import java.util.Map;
import n.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class LiveData<T> {
    static final Object NOT_SET = new Object();
    static final int START_VERSION = -1;
    int mActiveCount;
    private boolean mChangingActiveState;
    private volatile Object mData;
    final Object mDataLock;
    private boolean mDispatchInvalidated;
    private boolean mDispatchingValue;
    private n.b<s<? super T>, LiveData<T>.c> mObservers;
    volatile Object mPendingData;
    private final Runnable mPostValueRunnable;
    private int mVersion;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class LifecycleBoundObserver extends LiveData<T>.c implements k {

        /* renamed from: w, reason: collision with root package name */
        public final m f1264w;

        public LifecycleBoundObserver(m mVar, s<? super T> sVar) {
            super(sVar);
            this.f1264w = mVar;
        }

        @Override // androidx.lifecycle.k
        public final void a(m mVar, h.a aVar) {
            m mVar2 = this.f1264w;
            h.b bVarB = mVar2.getLifecycle().b();
            if (bVarB == h.b.s) {
                LiveData.this.removeObserver(this.s);
                return;
            }
            h.b bVar = null;
            while (bVar != bVarB) {
                b(e());
                bVar = bVarB;
                bVarB = mVar2.getLifecycle().b();
            }
        }

        @Override // androidx.lifecycle.LiveData.c
        public final void c() {
            this.f1264w.getLifecycle().c(this);
        }

        @Override // androidx.lifecycle.LiveData.c
        public final boolean d(m mVar) {
            return this.f1264w == mVar;
        }

        @Override // androidx.lifecycle.LiveData.c
        public final boolean e() {
            return this.f1264w.getLifecycle().b().compareTo(h.b.f1303v) >= 0;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            Object obj;
            synchronized (LiveData.this.mDataLock) {
                obj = LiveData.this.mPendingData;
                LiveData.this.mPendingData = LiveData.NOT_SET;
            }
            LiveData.this.setValue(obj);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class b extends LiveData<T>.c {
        @Override // androidx.lifecycle.LiveData.c
        public final boolean e() {
            return true;
        }
    }

    public LiveData(T t6) {
        this.mDataLock = new Object();
        this.mObservers = new n.b<>();
        this.mActiveCount = 0;
        this.mPendingData = NOT_SET;
        this.mPostValueRunnable = new a();
        this.mData = t6;
        this.mVersion = 0;
    }

    public static void assertMainThread(String str) {
        m.b.i().s.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(v0.b("Cannot invoke ", str, " on a background thread"));
        }
    }

    private void considerNotify(LiveData<T>.c cVar) {
        if (cVar.f1266t) {
            if (!cVar.e()) {
                cVar.b(false);
                return;
            }
            int i6 = cVar.f1267u;
            int i7 = this.mVersion;
            if (i6 >= i7) {
                return;
            }
            cVar.f1267u = i7;
            cVar.s.onChanged((Object) this.mData);
        }
    }

    public void changeActiveCounter(int i6) {
        int i7 = this.mActiveCount;
        this.mActiveCount = i6 + i7;
        if (this.mChangingActiveState) {
            return;
        }
        this.mChangingActiveState = true;
        while (true) {
            try {
                int i8 = this.mActiveCount;
                if (i7 == i8) {
                    this.mChangingActiveState = false;
                    return;
                }
                boolean z6 = i7 == 0 && i8 > 0;
                boolean z7 = i7 > 0 && i8 == 0;
                if (z6) {
                    onActive();
                } else if (z7) {
                    onInactive();
                }
                i7 = i8;
            } catch (Throwable th) {
                this.mChangingActiveState = false;
                throw th;
            }
        }
    }

    public void dispatchingValue(LiveData<T>.c cVar) {
        if (this.mDispatchingValue) {
            this.mDispatchInvalidated = true;
            return;
        }
        this.mDispatchingValue = true;
        do {
            this.mDispatchInvalidated = false;
            if (cVar != null) {
                considerNotify(cVar);
                cVar = null;
            } else {
                n.b<s<? super T>, LiveData<T>.c> bVar = this.mObservers;
                bVar.getClass();
                b.d dVar = new b.d();
                bVar.f13904u.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    considerNotify((c) ((Map.Entry) dVar.next()).getValue());
                    if (this.mDispatchInvalidated) {
                        break;
                    }
                }
            }
        } while (this.mDispatchInvalidated);
        this.mDispatchingValue = false;
    }

    public T getValue() {
        T t6 = (T) this.mData;
        if (t6 != NOT_SET) {
            return t6;
        }
        return null;
    }

    public int getVersion() {
        return this.mVersion;
    }

    public boolean hasActiveObservers() {
        return this.mActiveCount > 0;
    }

    public boolean hasObservers() {
        return this.mObservers.f13905v > 0;
    }

    public boolean isInitialized() {
        return this.mData != NOT_SET;
    }

    public void observe(m mVar, s<? super T> sVar) {
        assertMainThread("observe");
        if (mVar.getLifecycle().b() == h.b.s) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(mVar, sVar);
        LiveData<T>.c cVarD = this.mObservers.d(sVar, lifecycleBoundObserver);
        if (cVarD != null && !cVarD.d(mVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (cVarD != null) {
            return;
        }
        mVar.getLifecycle().a(lifecycleBoundObserver);
    }

    public void observeForever(s<? super T> sVar) {
        assertMainThread("observeForever");
        b bVar = new b(sVar);
        LiveData<T>.c cVarD = this.mObservers.d(sVar, bVar);
        if (cVarD instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (cVarD != null) {
            return;
        }
        bVar.b(true);
    }

    public void postValue(T t6) {
        boolean z6;
        synchronized (this.mDataLock) {
            z6 = this.mPendingData == NOT_SET;
            this.mPendingData = t6;
        }
        if (z6) {
            m.b bVarI = m.b.i();
            Runnable runnable = this.mPostValueRunnable;
            m.c cVar = bVarI.s;
            if (cVar.f13850u == null) {
                synchronized (cVar.s) {
                    try {
                        if (cVar.f13850u == null) {
                            cVar.f13850u = m.c.i(Looper.getMainLooper());
                        }
                    } finally {
                    }
                }
            }
            cVar.f13850u.post(runnable);
        }
    }

    public void removeObserver(s<? super T> sVar) {
        assertMainThread("removeObserver");
        LiveData<T>.c cVarE = this.mObservers.e(sVar);
        if (cVarE == null) {
            return;
        }
        cVarE.c();
        cVarE.b(false);
    }

    public void removeObservers(m mVar) {
        assertMainThread("removeObservers");
        Iterator<Map.Entry<s<? super T>, LiveData<T>.c>> it = this.mObservers.iterator();
        while (true) {
            b.e eVar = (b.e) it;
            if (!eVar.hasNext()) {
                return;
            }
            Map.Entry entry = (Map.Entry) eVar.next();
            if (((c) entry.getValue()).d(mVar)) {
                removeObserver((s) entry.getKey());
            }
        }
    }

    public void setValue(T t6) {
        assertMainThread("setValue");
        this.mVersion++;
        this.mData = t6;
        dispatchingValue(null);
    }

    public LiveData() {
        this.mDataLock = new Object();
        this.mObservers = new n.b<>();
        this.mActiveCount = 0;
        Object obj = NOT_SET;
        this.mPendingData = obj;
        this.mPostValueRunnable = new a();
        this.mData = obj;
        this.mVersion = -1;
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public abstract class c {
        public final s<? super T> s;

        /* renamed from: t, reason: collision with root package name */
        public boolean f1266t;

        /* renamed from: u, reason: collision with root package name */
        public int f1267u = -1;

        public c(s<? super T> sVar) {
            this.s = sVar;
        }

        public final void b(boolean z6) {
            if (z6 == this.f1266t) {
                return;
            }
            this.f1266t = z6;
            int i6 = z6 ? 1 : -1;
            LiveData liveData = LiveData.this;
            liveData.changeActiveCounter(i6);
            if (this.f1266t) {
                liveData.dispatchingValue(this);
            }
        }

        public boolean d(m mVar) {
            return false;
        }

        public abstract boolean e();

        public void c() {
        }
    }

    public void onActive() {
    }

    public void onInactive() {
    }
}
