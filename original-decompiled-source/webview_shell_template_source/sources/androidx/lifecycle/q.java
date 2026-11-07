package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;
import n.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class q<T> extends r<T> {
    private n.b<LiveData<?>, a<?>> mSources;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a<V> implements s<V> {

        /* renamed from: a, reason: collision with root package name */
        public final LiveData<V> f1326a;

        /* renamed from: b, reason: collision with root package name */
        public final s<? super V> f1327b;

        /* renamed from: c, reason: collision with root package name */
        public int f1328c = -1;

        public a(LiveData<V> liveData, s<? super V> sVar) {
            this.f1326a = liveData;
            this.f1327b = sVar;
        }

        @Override // androidx.lifecycle.s
        public final void onChanged(V v2) {
            int i6 = this.f1328c;
            LiveData<V> liveData = this.f1326a;
            if (i6 != liveData.getVersion()) {
                this.f1328c = liveData.getVersion();
                this.f1327b.onChanged(v2);
            }
        }
    }

    public q() {
        this.mSources = new n.b<>();
    }

    public <S> void addSource(LiveData<S> liveData, s<? super S> sVar) {
        if (liveData == null) {
            throw new NullPointerException("source cannot be null");
        }
        a<?> aVar = new a<>(liveData, sVar);
        a<?> aVarD = this.mSources.d(liveData, aVar);
        if (aVarD != null && aVarD.f1327b != sVar) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (aVarD == null && hasActiveObservers()) {
            liveData.observeForever(aVar);
        }
    }

    @Override // androidx.lifecycle.LiveData
    public void onActive() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.mSources.iterator();
        while (true) {
            b.e eVar = (b.e) it;
            if (!eVar.hasNext()) {
                return;
            }
            a aVar = (a) ((Map.Entry) eVar.next()).getValue();
            aVar.f1326a.observeForever(aVar);
        }
    }

    @Override // androidx.lifecycle.LiveData
    public void onInactive() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.mSources.iterator();
        while (true) {
            b.e eVar = (b.e) it;
            if (!eVar.hasNext()) {
                return;
            }
            a aVar = (a) ((Map.Entry) eVar.next()).getValue();
            aVar.f1326a.removeObserver(aVar);
        }
    }

    public <S> void removeSource(LiveData<S> liveData) {
        a<?> aVarE = this.mSources.e(liveData);
        if (aVarE != null) {
            aVarE.f1326a.removeObserver(aVarE);
        }
    }

    public q(T t6) {
        super(t6);
        this.mSources = new n.b<>();
    }
}
