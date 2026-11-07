package androidx.lifecycle;

import android.os.Looper;
import androidx.lifecycle.l;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.b;

/* loaded from: classes.dex */
public final class v extends l {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2359b = true;

    /* renamed from: c, reason: collision with root package name */
    public o.a<s, a> f2360c = new o.a<>();

    /* renamed from: d, reason: collision with root package name */
    public l.b f2361d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference<t> f2362e;

    /* renamed from: f, reason: collision with root package name */
    public int f2363f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2364g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2365h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList<l.b> f2366i;

    /* renamed from: j, reason: collision with root package name */
    public final sh.z0 f2367j;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public l.b f2368a;

        /* renamed from: b, reason: collision with root package name */
        public r f2369b;

        public final void a(t tVar, l.a aVar) {
            l.b bVarA = aVar.a();
            l.b state1 = this.f2368a;
            kotlin.jvm.internal.r.e(state1, "state1");
            if (bVarA.compareTo(state1) < 0) {
                state1 = bVarA;
            }
            this.f2368a = state1;
            this.f2369b.l(tVar, aVar);
            this.f2368a = bVarA;
        }
    }

    public v(t tVar) {
        l.b bVar = l.b.f2320b;
        this.f2361d = bVar;
        this.f2366i = new ArrayList<>();
        this.f2362e = new WeakReference<>(tVar);
        this.f2367j = sh.a1.a(bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.l
    public final void a(s observer) {
        r g0Var;
        a aVar;
        t tVar;
        kotlin.jvm.internal.r.e(observer, "observer");
        e("addObserver");
        l.b bVar = this.f2361d;
        l.b bVar2 = l.b.f2319a;
        if (bVar != bVar2) {
            bVar2 = l.b.f2320b;
        }
        a aVar2 = new a();
        HashMap map = y.f2374a;
        boolean z10 = observer instanceof r;
        boolean z11 = observer instanceof e;
        if (z10 && z11) {
            g0Var = new f((e) observer, (r) observer);
        } else if (z11) {
            g0Var = new f((e) observer, null);
        } else if (z10) {
            g0Var = (r) observer;
        } else {
            Class<?> cls = observer.getClass();
            if (y.b(cls) == 2) {
                Object obj = y.f2375b.get(cls);
                kotlin.jvm.internal.r.b(obj);
                List list = (List) obj;
                if (list.size() == 1) {
                    g0Var = new v0(y.a((Constructor) list.get(0), observer));
                } else {
                    int size = list.size();
                    h[] hVarArr = new h[size];
                    for (int i10 = 0; i10 < size; i10++) {
                        hVarArr[i10] = y.a((Constructor) list.get(i10), observer);
                    }
                    g0Var = new d(hVarArr);
                }
            } else {
                g0Var = new g0(observer);
            }
        }
        aVar2.f2369b = g0Var;
        aVar2.f2368a = bVar2;
        o.a<s, a> aVar3 = this.f2360c;
        b.c<s, a> cVarA = aVar3.a(observer);
        if (cVarA != null) {
            aVar = cVarA.f18832b;
        } else {
            HashMap<s, b.c<s, a>> map2 = aVar3.f18826e;
            b.c<K, V> cVar = new b.c<>(observer, aVar2);
            aVar3.f18830d++;
            b.c cVar2 = aVar3.f18828b;
            if (cVar2 == null) {
                aVar3.f18827a = cVar;
                aVar3.f18828b = cVar;
            } else {
                cVar2.f18833c = cVar;
                cVar.f18834d = cVar2;
                aVar3.f18828b = cVar;
            }
            map2.put(observer, cVar);
            aVar = null;
        }
        if (aVar == null && (tVar = this.f2362e.get()) != null) {
            boolean z12 = this.f2363f != 0 || this.f2364g;
            l.b bVarD = d(observer);
            this.f2363f++;
            while (aVar2.f2368a.compareTo(bVarD) < 0 && this.f2360c.f18826e.containsKey(observer)) {
                l.b bVar3 = aVar2.f2368a;
                ArrayList<l.b> arrayList = this.f2366i;
                arrayList.add(bVar3);
                l.a.C0033a c0033a = l.a.Companion;
                l.b state = aVar2.f2368a;
                c0033a.getClass();
                kotlin.jvm.internal.r.e(state, "state");
                int iOrdinal = state.ordinal();
                l.a aVar4 = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? null : l.a.ON_RESUME : l.a.ON_START : l.a.ON_CREATE;
                if (aVar4 == null) {
                    throw new IllegalStateException("no event up from " + aVar2.f2368a);
                }
                aVar2.a(tVar, aVar4);
                arrayList.remove(arrayList.size() - 1);
                bVarD = d(observer);
            }
            if (!z12) {
                i();
            }
            this.f2363f--;
        }
    }

    @Override // androidx.lifecycle.l
    public final l.b b() {
        return this.f2361d;
    }

    @Override // androidx.lifecycle.l
    public final void c(s observer) {
        kotlin.jvm.internal.r.e(observer, "observer");
        e("removeObserver");
        this.f2360c.b(observer);
    }

    public final l.b d(s sVar) {
        HashMap<s, b.c<s, a>> map = this.f2360c.f18826e;
        b.c<s, a> cVar = map.containsKey(sVar) ? map.get(sVar).f18834d : null;
        l.b bVar = cVar != null ? cVar.f18832b.f2368a : null;
        ArrayList<l.b> arrayList = this.f2366i;
        l.b bVar2 = arrayList.isEmpty() ? null : (l.b) l.b.b(arrayList, 1);
        l.b state1 = this.f2361d;
        kotlin.jvm.internal.r.e(state1, "state1");
        if (bVar == null || bVar.compareTo(state1) >= 0) {
            bVar = state1;
        }
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    public final void e(String str) {
        if (this.f2359b) {
            n.b.b0().f18285a.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(i8.n.d("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void f(l.a event) {
        kotlin.jvm.internal.r.e(event, "event");
        e("handleLifecycleEvent");
        g(event.a());
    }

    public final void g(l.b next) {
        if (this.f2361d == next) {
            return;
        }
        t tVar = this.f2362e.get();
        l.b current = this.f2361d;
        kotlin.jvm.internal.r.e(current, "current");
        kotlin.jvm.internal.r.e(next, "next");
        if (current == l.b.f2320b && next == l.b.f2319a) {
            throw new IllegalStateException(("State must be at least '" + l.b.f2321c + "' to be moved to '" + next + "' in component " + tVar).toString());
        }
        l.b bVar = l.b.f2319a;
        if (current == bVar && current != next) {
            throw new IllegalStateException(("State is '" + bVar + "' and cannot be moved to `" + next + "` in component " + tVar).toString());
        }
        this.f2361d = next;
        if (this.f2364g || this.f2363f != 0) {
            this.f2365h = true;
            return;
        }
        this.f2364g = true;
        i();
        this.f2364g = false;
        if (this.f2361d == bVar) {
            this.f2360c = new o.a<>();
        }
    }

    public final void h(l.b state) {
        kotlin.jvm.internal.r.e(state, "state");
        e("setCurrentState");
        g(state);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r8.f2365h = false;
        r8.f2367j.setValue(r8.f2361d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i() {
        t tVar = this.f2362e.get();
        if (tVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            o.a<s, a> aVar = this.f2360c;
            if (aVar.f18830d != 0) {
                b.c<s, a> cVar = aVar.f18827a;
                kotlin.jvm.internal.r.b(cVar);
                l.b bVar = cVar.f18832b.f2368a;
                b.c<s, a> cVar2 = this.f2360c.f18828b;
                kotlin.jvm.internal.r.b(cVar2);
                l.b bVar2 = cVar2.f18832b.f2368a;
                if (bVar == bVar2 && this.f2361d == bVar2) {
                    break;
                }
                this.f2365h = false;
                l.b bVar3 = this.f2361d;
                b.c<s, a> cVar3 = this.f2360c.f18827a;
                kotlin.jvm.internal.r.b(cVar3);
                int iCompareTo = bVar3.compareTo(cVar3.f18832b.f2368a);
                ArrayList<l.b> arrayList = this.f2366i;
                if (iCompareTo < 0) {
                    o.a<s, a> aVar2 = this.f2360c;
                    b.C0212b c0212b = new b.C0212b(aVar2.f18828b, aVar2.f18827a);
                    aVar2.f18829c.put(c0212b, Boolean.FALSE);
                    while (c0212b.hasNext() && !this.f2365h) {
                        Map.Entry entry = (Map.Entry) c0212b.next();
                        kotlin.jvm.internal.r.b(entry);
                        s sVar = (s) entry.getKey();
                        a aVar3 = (a) entry.getValue();
                        while (aVar3.f2368a.compareTo(this.f2361d) > 0 && !this.f2365h && this.f2360c.f18826e.containsKey(sVar)) {
                            l.a.C0033a c0033a = l.a.Companion;
                            l.b bVar4 = aVar3.f2368a;
                            c0033a.getClass();
                            l.a aVarA = l.a.C0033a.a(bVar4);
                            if (aVarA == null) {
                                throw new IllegalStateException("no event down from " + aVar3.f2368a);
                            }
                            arrayList.add(aVarA.a());
                            aVar3.a(tVar, aVarA);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
                b.c<s, a> cVar4 = this.f2360c.f18828b;
                if (!this.f2365h && cVar4 != null && this.f2361d.compareTo(cVar4.f18832b.f2368a) > 0) {
                    o.a<s, a> aVar4 = this.f2360c;
                    aVar4.getClass();
                    b.d dVar = new b.d();
                    aVar4.f18829c.put(dVar, Boolean.FALSE);
                    while (dVar.hasNext() && !this.f2365h) {
                        Map.Entry entry2 = (Map.Entry) dVar.next();
                        s sVar2 = (s) entry2.getKey();
                        a aVar5 = (a) entry2.getValue();
                        while (aVar5.f2368a.compareTo(this.f2361d) < 0 && !this.f2365h && this.f2360c.f18826e.containsKey(sVar2)) {
                            arrayList.add(aVar5.f2368a);
                            l.a.C0033a c0033a2 = l.a.Companion;
                            l.b state = aVar5.f2368a;
                            c0033a2.getClass();
                            kotlin.jvm.internal.r.e(state, "state");
                            int iOrdinal = state.ordinal();
                            l.a aVar6 = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? null : l.a.ON_RESUME : l.a.ON_START : l.a.ON_CREATE;
                            if (aVar6 == null) {
                                throw new IllegalStateException("no event up from " + aVar5.f2368a);
                            }
                            aVar5.a(tVar, aVar6);
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
