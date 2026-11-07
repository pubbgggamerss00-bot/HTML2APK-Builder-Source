package r7;

import g7.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import qg.x;
import r7.c;

/* loaded from: classes.dex */
public final class g implements i {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap<c.b, ArrayList<a>> f23234a = new LinkedHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    public int f23235b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<l> f23236a;

        /* renamed from: b, reason: collision with root package name */
        public final Map<String, Object> f23237b;

        /* renamed from: c, reason: collision with root package name */
        public final long f23238c;

        public a(WeakReference<l> weakReference, Map<String, ? extends Object> map, long j10) {
            this.f23236a = weakReference;
            this.f23237b = map;
            this.f23238c = j10;
        }
    }

    @Override // r7.i
    public final c.C0257c a(c.b bVar) {
        ArrayList<a> arrayList = this.f23234a.get(bVar);
        c.C0257c c0257c = null;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            a aVar = arrayList.get(i10);
            l lVar = aVar.f23236a.get();
            c.C0257c c0257c2 = lVar != null ? new c.C0257c(lVar, aVar.f23237b) : null;
            if (c0257c2 != null) {
                c0257c = c0257c2;
                break;
            }
            i10++;
        }
        b();
        return c0257c;
    }

    public final void b() {
        WeakReference<l> weakReference;
        int i10 = this.f23235b;
        this.f23235b = i10 + 1;
        if (i10 >= 10) {
            this.f23235b = 0;
            Iterator<ArrayList<a>> it = this.f23234a.values().iterator();
            while (it.hasNext()) {
                ArrayList<a> next = it.next();
                if (next.size() <= 1) {
                    a aVar = (a) x.D(next);
                    if (((aVar == null || (weakReference = aVar.f23236a) == null) ? null : weakReference.get()) == null) {
                        it.remove();
                    }
                } else {
                    int size = next.size();
                    int i11 = 0;
                    for (int i12 = 0; i12 < size; i12++) {
                        int i13 = i12 - i11;
                        if (next.get(i13).f23236a.get() == null) {
                            next.remove(i13);
                            i11++;
                        }
                    }
                    if (next.isEmpty()) {
                        it.remove();
                    }
                }
            }
        }
    }

    @Override // r7.i
    public final void c(c.b bVar, l lVar, Map<String, ? extends Object> map, long j10) {
        LinkedHashMap<c.b, ArrayList<a>> linkedHashMap = this.f23234a;
        ArrayList<a> arrayList = linkedHashMap.get(bVar);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            linkedHashMap.put(bVar, arrayList);
        }
        ArrayList<a> arrayList2 = arrayList;
        a aVar = new a(new WeakReference(lVar), map, j10);
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                a aVar2 = arrayList2.get(i10);
                if (j10 < aVar2.f23238c) {
                    i10++;
                } else if (aVar2.f23236a.get() == lVar) {
                    arrayList2.set(i10, aVar);
                } else {
                    arrayList2.add(i10, aVar);
                }
            }
        } else {
            arrayList2.add(aVar);
        }
        b();
    }

    @Override // r7.i
    public final void clear() {
        this.f23235b = 0;
        this.f23234a.clear();
    }

    @Override // r7.i
    public final boolean d(c.b bVar) {
        return this.f23234a.remove(bVar) != null;
    }
}
