package sd;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import fe.a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class j implements b, ud.a {

    /* renamed from: h, reason: collision with root package name */
    public static final e f24858h = new e();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f24859a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f24860b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f24861c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f24862d;

    /* renamed from: e, reason: collision with root package name */
    public final o f24863e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference<Boolean> f24864f;

    /* renamed from: g, reason: collision with root package name */
    public final oe.b f24865g;

    public j(ArrayList arrayList, ArrayList arrayList2, oe.b bVar) {
        td.v vVar = td.v.f28756a;
        this.f24859a = new HashMap();
        this.f24860b = new HashMap();
        this.f24861c = new HashMap();
        this.f24862d = new HashSet();
        this.f24864f = new AtomicReference<>();
        o oVar = new o();
        this.f24863e = oVar;
        this.f24865g = bVar;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(a.c(oVar, o.class, zd.d.class, zd.c.class));
        int i10 = 0;
        arrayList3.add(a.c(this, ud.a.class, new Class[0]));
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            a aVar = (a) obj;
            if (aVar != null) {
                arrayList3.add(aVar);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList.get(i12);
            i12++;
            arrayList4.add(obj2);
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((fe.b) it.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.f24865g.a(componentRegistrar));
                        it.remove();
                    }
                } catch (p e10) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e10);
                }
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Object[] array = ((a) it2.next()).f24837b.toArray();
                int length = array.length;
                int i13 = 0;
                while (true) {
                    if (i13 < length) {
                        Object obj3 = array[i13];
                        if (obj3.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f24862d.contains(obj3.toString())) {
                                it2.remove();
                                break;
                            }
                            this.f24862d.add(obj3.toString());
                        }
                        i13++;
                    }
                }
            }
            if (this.f24859a.isEmpty()) {
                k.a(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f24859a.keySet());
                arrayList6.addAll(arrayList3);
                k.a(arrayList6);
            }
            int size3 = arrayList3.size();
            int i14 = 0;
            while (i14 < size3) {
                Object obj4 = arrayList3.get(i14);
                i14++;
                final a aVar2 = (a) obj4;
                this.f24859a.put(aVar2, new q(new fe.b() { // from class: sd.f
                    @Override // fe.b
                    public final Object get() {
                        a aVar3 = aVar2;
                        return aVar3.f24841f.b(new z(aVar3, this.f24851a));
                    }
                }));
            }
            arrayList5.addAll(k(arrayList3));
            arrayList5.addAll(l());
            j();
        }
        int size4 = arrayList5.size();
        while (i10 < size4) {
            Object obj5 = arrayList5.get(i10);
            i10++;
            ((Runnable) obj5).run();
        }
        Boolean bool = this.f24864f.get();
        if (bool != null) {
            i(this.f24859a, bool.booleanValue());
        }
    }

    @Override // sd.b
    public final <T> fe.a<T> c(y<T> yVar) {
        fe.b<T> bVarH = h(yVar);
        return bVarH == null ? new w(w.f24883c, w.f24884d) : bVarH instanceof w ? (w) bVarH : new w(null, bVarH);
    }

    @Override // sd.b
    public final synchronized <T> fe.b<Set<T>> f(y<T> yVar) {
        r rVar = (r) this.f24861c.get(yVar);
        if (rVar != null) {
            return rVar;
        }
        return f24858h;
    }

    @Override // sd.b
    public final synchronized <T> fe.b<T> h(y<T> yVar) {
        x.a(yVar, "Null interface requested.");
        return (fe.b) this.f24860b.get(yVar);
    }

    public final void i(HashMap map, boolean z10) {
        ArrayDeque<zd.a> arrayDeque;
        Set<Map.Entry> setEntrySet;
        for (Map.Entry entry : map.entrySet()) {
            a aVar = (a) entry.getKey();
            fe.b bVar = (fe.b) entry.getValue();
            int i10 = aVar.f24839d;
            if (i10 == 1 || (i10 == 2 && z10)) {
                bVar.get();
            }
        }
        o oVar = this.f24863e;
        synchronized (oVar) {
            try {
                arrayDeque = oVar.f24875b;
                if (arrayDeque != null) {
                    oVar.f24875b = null;
                } else {
                    arrayDeque = null;
                }
            } finally {
            }
        }
        if (arrayDeque != null) {
            for (zd.a aVar2 : arrayDeque) {
                aVar2.getClass();
                synchronized (oVar) {
                    try {
                        ArrayDeque arrayDeque2 = oVar.f24875b;
                        if (arrayDeque2 != null) {
                            arrayDeque2.add(aVar2);
                        } else {
                            synchronized (oVar) {
                                try {
                                    Map map2 = (Map) oVar.f24874a.get(null);
                                    setEntrySet = map2 == null ? Collections.EMPTY_SET : map2.entrySet();
                                } finally {
                                }
                            }
                            for (Map.Entry entry2 : setEntrySet) {
                                ((Executor) entry2.getValue()).execute(new androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.d(entry2, aVar2));
                            }
                        }
                    } finally {
                    }
                }
            }
        }
    }

    public final void j() {
        HashMap map = this.f24860b;
        HashMap map2 = this.f24861c;
        for (a aVar : this.f24859a.keySet()) {
            for (l lVar : aVar.f24838c) {
                boolean z10 = lVar.f24872b == 2;
                y<?> yVar = lVar.f24871a;
                if (z10 && !map2.containsKey(yVar)) {
                    Set set = Collections.EMPTY_SET;
                    r rVar = new r();
                    rVar.f24880b = null;
                    rVar.f24879a = Collections.newSetFromMap(new ConcurrentHashMap());
                    rVar.f24879a.addAll(set);
                    map2.put(yVar, rVar);
                } else if (map.containsKey(yVar)) {
                    continue;
                } else {
                    int i10 = lVar.f24872b;
                    if (i10 == 1) {
                        throw new s("Unsatisfied dependency for component " + aVar + ": " + yVar);
                    }
                    if (i10 != 2) {
                        map.put(yVar, new w(w.f24883c, w.f24884d));
                    }
                }
            }
        }
    }

    public final ArrayList k(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            a aVar = (a) obj;
            if (aVar.f24840e == 0) {
                final fe.b bVar = (fe.b) this.f24859a.get(aVar);
                Iterator it = aVar.f24837b.iterator();
                while (it.hasNext()) {
                    y yVar = (y) it.next();
                    HashMap map = this.f24860b;
                    if (map.containsKey(yVar)) {
                        final w wVar = (w) ((fe.b) map.get(yVar));
                        arrayList2.add(new Runnable() { // from class: sd.g
                            @Override // java.lang.Runnable
                            public final void run() {
                                a.InterfaceC0098a<T> interfaceC0098a;
                                w wVar2 = wVar;
                                fe.b<T> bVar2 = bVar;
                                if (wVar2.f24886b != w.f24884d) {
                                    throw new IllegalStateException("provide() can be called only once.");
                                }
                                synchronized (wVar2) {
                                    interfaceC0098a = wVar2.f24885a;
                                    wVar2.f24885a = null;
                                    wVar2.f24886b = bVar2;
                                }
                                interfaceC0098a.a(bVar2);
                            }
                        });
                    } else {
                        map.put(yVar, bVar);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList l() {
        HashMap map = this.f24861c;
        ArrayList arrayList = new ArrayList();
        HashMap map2 = new HashMap();
        for (Map.Entry entry : this.f24859a.entrySet()) {
            a aVar = (a) entry.getKey();
            if (aVar.f24840e != 0) {
                fe.b bVar = (fe.b) entry.getValue();
                Iterator it = aVar.f24837b.iterator();
                while (it.hasNext()) {
                    y yVar = (y) it.next();
                    if (!map2.containsKey(yVar)) {
                        map2.put(yVar, new HashSet());
                    }
                    ((Set) map2.get(yVar)).add(bVar);
                }
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (map.containsKey(entry2.getKey())) {
                final r rVar = (r) map.get(entry2.getKey());
                for (final fe.b bVar2 : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: sd.h
                        @Override // java.lang.Runnable
                        public final void run() {
                            r rVar2 = rVar;
                            fe.b bVar3 = bVar2;
                            synchronized (rVar2) {
                                try {
                                    if (rVar2.f24880b == null) {
                                        rVar2.f24879a.add(bVar3);
                                    } else {
                                        rVar2.f24880b.add(bVar3.get());
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                    });
                }
            } else {
                y yVar2 = (y) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                r rVar2 = new r();
                rVar2.f24880b = null;
                rVar2.f24879a = Collections.newSetFromMap(new ConcurrentHashMap());
                rVar2.f24879a.addAll(set);
                map.put(yVar2, rVar2);
            }
        }
        return arrayList;
    }
}
