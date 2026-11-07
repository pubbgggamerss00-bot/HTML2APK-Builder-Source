package c5;

import android.content.Context;
import android.util.Log;
import c5.m0;
import c5.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class f extends m0 {

    public static class a extends b {

        /* renamed from: c, reason: collision with root package name */
        public boolean f4839c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f4840d;

        /* renamed from: e, reason: collision with root package name */
        public o.a f4841e;

        public final o.a b(Context context) {
            if (this.f4840d) {
                return this.f4841e;
            }
            throw null;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final m0.a f4842a;

        /* renamed from: b, reason: collision with root package name */
        public final u3.e f4843b;

        public b(m0.a aVar, u3.e eVar) {
            this.f4842a = aVar;
            this.f4843b = eVar;
        }

        public final void a() {
            throw null;
        }
    }

    public static class c extends b {
    }

    @Override // c5.m0
    public final void a(ArrayList arrayList, boolean z10) {
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            ((m0.a) it.next()).getClass();
            throw null;
        }
        if (b0.G(2)) {
            Log.v("FragmentManager", "Executing operations from null to null");
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList(arrayList);
        ((m0.a) l.b.b(arrayList, 1)).getClass();
        if (arrayList.size() > 0) {
            ((m0.a) arrayList.get(0)).getClass();
            throw null;
        }
        if (arrayList.size() > 0) {
            m0.a aVar = (m0.a) arrayList.get(0);
            new u3.e();
            aVar.c();
            throw null;
        }
        HashMap map = new HashMap();
        if (arrayList3.size() > 0) {
            m0.a aVar2 = ((c) arrayList3.get(0)).f4842a;
            throw null;
        }
        int size = arrayList3.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            c cVar = (c) obj;
            map.put(cVar.f4842a, Boolean.FALSE);
            cVar.a();
        }
        boolean zContainsValue = map.containsValue(Boolean.TRUE);
        this.f4948a.getContext();
        ArrayList arrayList5 = new ArrayList();
        if (arrayList2.size() > 0) {
            m0.a aVar3 = ((a) arrayList2.get(0)).f4842a;
            throw null;
        }
        int size2 = arrayList5.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList5.get(i11);
            i11++;
            a aVar4 = (a) obj2;
            m0.a aVar5 = aVar4.f4842a;
            if (!zContainsValue) {
                throw null;
            }
            if (b0.G(2)) {
                Log.v("FragmentManager", "Ignoring Animation set on " + ((Object) null) + " as Animations cannot run alongside Transitions.");
            }
            aVar4.a();
        }
        if (arrayList4.size() > 0) {
            ((m0.a) arrayList4.get(0)).getClass();
            throw null;
        }
        arrayList4.clear();
        if (b0.G(2)) {
            Log.v("FragmentManager", "Completed executing operations from null to null");
        }
    }
}
