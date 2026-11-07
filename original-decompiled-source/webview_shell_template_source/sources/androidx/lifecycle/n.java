package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.os.Looper;
import androidx.camera.camera2.internal.v0;
import androidx.lifecycle.h;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import n.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class n extends h {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1315a;

    /* renamed from: b, reason: collision with root package name */
    public n.a<l, a> f1316b;

    /* renamed from: c, reason: collision with root package name */
    public h.b f1317c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference<m> f1318d;

    /* renamed from: e, reason: collision with root package name */
    public int f1319e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1320f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1321g;
    public final ArrayList<h.b> h;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public h.b f1322a;

        /* renamed from: b, reason: collision with root package name */
        public k f1323b;

        public final void a(m mVar, h.a aVar) {
            h.b bVarA = aVar.a();
            h.b bVar = this.f1322a;
            kotlin.jvm.internal.j.e("state1", bVar);
            if (bVarA.compareTo(bVar) < 0) {
                bVar = bVarA;
            }
            this.f1322a = bVar;
            this.f1323b.a(mVar, aVar);
            this.f1322a = bVarA;
        }
    }

    public n(m mVar) {
        new AtomicReference();
        this.f1315a = true;
        this.f1316b = new n.a<>();
        this.f1317c = h.b.f1301t;
        this.h = new ArrayList<>();
        this.f1318d = new WeakReference<>(mVar);
    }

    @Override // androidx.lifecycle.h
    public final void a(l lVar) {
        k reflectiveGenericLifecycleObserver;
        m mVar;
        e("addObserver");
        h.b bVar = this.f1317c;
        h.b bVar2 = h.b.s;
        if (bVar != bVar2) {
            bVar2 = h.b.f1301t;
        }
        a aVar = new a();
        HashMap map = p.f1324a;
        boolean z6 = lVar instanceof k;
        boolean z7 = lVar instanceof c;
        if (z6 && z7) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((c) lVar, (k) lVar);
        } else if (z7) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((c) lVar, null);
        } else if (z6) {
            reflectiveGenericLifecycleObserver = (k) lVar;
        } else {
            Class<?> cls = lVar.getClass();
            if (p.b(cls) == 2) {
                Object obj = p.f1325b.get(cls);
                kotlin.jvm.internal.j.b(obj);
                List list = (List) obj;
                if (list.size() == 1) {
                    reflectiveGenericLifecycleObserver = new SingleGeneratedAdapterObserver(p.a((Constructor) list.get(0), lVar));
                } else {
                    int size = list.size();
                    e[] eVarArr = new e[size];
                    for (int i6 = 0; i6 < size; i6++) {
                        eVarArr[i6] = p.a((Constructor) list.get(i6), lVar);
                    }
                    reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(eVarArr);
                }
            } else {
                reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(lVar);
            }
        }
        aVar.f1323b = reflectiveGenericLifecycleObserver;
        aVar.f1322a = bVar2;
        if (this.f1316b.d(lVar, aVar) == null && (mVar = this.f1318d.get()) != null) {
            boolean z8 = this.f1319e != 0 || this.f1320f;
            h.b bVarD = d(lVar);
            this.f1319e++;
            while (aVar.f1322a.compareTo(bVarD) < 0 && this.f1316b.f13902w.containsKey(lVar)) {
                h.b bVar3 = aVar.f1322a;
                ArrayList<h.b> arrayList = this.h;
                arrayList.add(bVar3);
                h.a.C0015a c0015a = h.a.Companion;
                h.b bVar4 = aVar.f1322a;
                c0015a.getClass();
                kotlin.jvm.internal.j.e("state", bVar4);
                int iOrdinal = bVar4.ordinal();
                h.a aVar2 = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? null : h.a.ON_RESUME : h.a.ON_START : h.a.ON_CREATE;
                if (aVar2 == null) {
                    throw new IllegalStateException("no event up from " + aVar.f1322a);
                }
                aVar.a(mVar, aVar2);
                arrayList.remove(arrayList.size() - 1);
                bVarD = d(lVar);
            }
            if (!z8) {
                i();
            }
            this.f1319e--;
        }
    }

    @Override // androidx.lifecycle.h
    public final h.b b() {
        return this.f1317c;
    }

    @Override // androidx.lifecycle.h
    public final void c(l lVar) {
        kotlin.jvm.internal.j.e("observer", lVar);
        e("removeObserver");
        this.f1316b.e(lVar);
    }

    public final h.b d(l lVar) {
        a aVar;
        HashMap<l, b.c<l, a>> map = this.f1316b.f13902w;
        b.c<l, a> cVar = map.containsKey(lVar) ? map.get(lVar).f13908v : null;
        h.b bVar = (cVar == null || (aVar = cVar.f13906t) == null) ? null : aVar.f1322a;
        ArrayList<h.b> arrayList = this.h;
        h.b bVar2 = arrayList.isEmpty() ? null : arrayList.get(arrayList.size() - 1);
        h.b bVar3 = this.f1317c;
        kotlin.jvm.internal.j.e("state1", bVar3);
        if (bVar == null || bVar.compareTo(bVar3) >= 0) {
            bVar = bVar3;
        }
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    @SuppressLint({"RestrictedApi"})
    public final void e(String str) {
        if (this.f1315a) {
            m.b.i().s.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(v0.b("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void f(h.a aVar) {
        kotlin.jvm.internal.j.e("event", aVar);
        e("handleLifecycleEvent");
        g(aVar.a());
    }

    public final void g(h.b bVar) {
        h.b bVar2 = this.f1317c;
        if (bVar2 == bVar) {
            return;
        }
        h.b bVar3 = h.b.f1301t;
        h.b bVar4 = h.b.s;
        if (bVar2 == bVar3 && bVar == bVar4) {
            throw new IllegalStateException(("no event down from " + this.f1317c + " in component " + this.f1318d.get()).toString());
        }
        this.f1317c = bVar;
        if (this.f1320f || this.f1319e != 0) {
            this.f1321g = true;
            return;
        }
        this.f1320f = true;
        i();
        this.f1320f = false;
        if (this.f1317c == bVar4) {
            this.f1316b = new n.a<>();
        }
    }

    public final void h() {
        e("setCurrentState");
        g(h.b.f1302u);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r12.f1321g = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i() {
        m mVar = this.f1318d.get();
        if (mVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            n.a<l, a> aVar = this.f1316b;
            if (aVar.f13905v != 0) {
                b.c<l, a> cVar = aVar.s;
                kotlin.jvm.internal.j.b(cVar);
                h.b bVar = cVar.f13906t.f1322a;
                b.c<l, a> cVar2 = this.f1316b.f13903t;
                kotlin.jvm.internal.j.b(cVar2);
                h.b bVar2 = cVar2.f13906t.f1322a;
                if (bVar == bVar2 && this.f1317c == bVar2) {
                    break;
                }
                this.f1321g = false;
                h.b bVar3 = this.f1317c;
                b.c<l, a> cVar3 = this.f1316b.s;
                kotlin.jvm.internal.j.b(cVar3);
                int iCompareTo = bVar3.compareTo(cVar3.f13906t.f1322a);
                ArrayList<h.b> arrayList = this.h;
                if (iCompareTo < 0) {
                    n.a<l, a> aVar2 = this.f1316b;
                    b.C0080b c0080b = new b.C0080b(aVar2.f13903t, aVar2.s);
                    aVar2.f13904u.put(c0080b, Boolean.FALSE);
                    while (c0080b.hasNext() && !this.f1321g) {
                        Map.Entry entry = (Map.Entry) c0080b.next();
                        kotlin.jvm.internal.j.d("next()", entry);
                        l lVar = (l) entry.getKey();
                        a aVar3 = (a) entry.getValue();
                        while (aVar3.f1322a.compareTo(this.f1317c) > 0 && !this.f1321g && this.f1316b.f13902w.containsKey(lVar)) {
                            h.a.C0015a c0015a = h.a.Companion;
                            h.b bVar4 = aVar3.f1322a;
                            c0015a.getClass();
                            kotlin.jvm.internal.j.e("state", bVar4);
                            int iOrdinal = bVar4.ordinal();
                            h.a aVar4 = iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? null : h.a.ON_PAUSE : h.a.ON_STOP : h.a.ON_DESTROY;
                            if (aVar4 == null) {
                                throw new IllegalStateException("no event down from " + aVar3.f1322a);
                            }
                            arrayList.add(aVar4.a());
                            aVar3.a(mVar, aVar4);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
                b.c<l, a> cVar4 = this.f1316b.f13903t;
                if (!this.f1321g && cVar4 != null && this.f1317c.compareTo(cVar4.f13906t.f1322a) > 0) {
                    n.a<l, a> aVar5 = this.f1316b;
                    aVar5.getClass();
                    b.d dVar = new b.d();
                    aVar5.f13904u.put(dVar, Boolean.FALSE);
                    while (dVar.hasNext() && !this.f1321g) {
                        Map.Entry entry2 = (Map.Entry) dVar.next();
                        l lVar2 = (l) entry2.getKey();
                        a aVar6 = (a) entry2.getValue();
                        while (aVar6.f1322a.compareTo(this.f1317c) < 0 && !this.f1321g && this.f1316b.f13902w.containsKey(lVar2)) {
                            arrayList.add(aVar6.f1322a);
                            h.a.C0015a c0015a2 = h.a.Companion;
                            h.b bVar5 = aVar6.f1322a;
                            c0015a2.getClass();
                            kotlin.jvm.internal.j.e("state", bVar5);
                            int iOrdinal2 = bVar5.ordinal();
                            h.a aVar7 = iOrdinal2 != 1 ? iOrdinal2 != 2 ? iOrdinal2 != 3 ? null : h.a.ON_RESUME : h.a.ON_START : h.a.ON_CREATE;
                            if (aVar7 == null) {
                                throw new IllegalStateException("no event up from " + aVar6.f1322a);
                            }
                            aVar6.a(mVar, aVar7);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
    }
}
