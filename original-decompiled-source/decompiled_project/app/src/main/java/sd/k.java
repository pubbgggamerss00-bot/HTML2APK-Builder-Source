package sd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public final class k {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final sd.a<?> f24866a;

        /* renamed from: b, reason: collision with root package name */
        public final HashSet f24867b = new HashSet();

        /* renamed from: c, reason: collision with root package name */
        public final HashSet f24868c = new HashSet();

        public a(sd.a<?> aVar) {
            this.f24866a = aVar;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final y<?> f24869a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f24870b;

        public b(y yVar, boolean z10) {
            this.f24869a = yVar;
            this.f24870b = z10;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (bVar.f24869a.equals(this.f24869a) && bVar.f24870b == this.f24870b) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return ((this.f24869a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f24870b).hashCode();
        }
    }

    public static void a(ArrayList arrayList) {
        HashMap map = new HashMap(arrayList.size());
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            sd.a aVar = (sd.a) obj;
            a aVar2 = new a(aVar);
            Iterator it = aVar.f24837b.iterator();
            while (it.hasNext()) {
                y yVar = (y) it.next();
                boolean z10 = aVar.f24840e == 0;
                b bVar = new b(yVar, !z10);
                if (!map.containsKey(bVar)) {
                    map.put(bVar, new HashSet());
                }
                Set set = (Set) map.get(bVar);
                if (!set.isEmpty() && z10) {
                    throw new IllegalArgumentException("Multiple components provide " + yVar + ".");
                }
                set.add(aVar2);
            }
        }
        Iterator it2 = map.values().iterator();
        while (it2.hasNext()) {
            for (a aVar3 : (Set) it2.next()) {
                for (l lVar : aVar3.f24866a.f24838c) {
                    if (lVar.f24873c == 0) {
                        Set<a> set2 = (Set) map.get(new b(lVar.f24871a, lVar.f24872b == 2));
                        if (set2 != null) {
                            for (a aVar4 : set2) {
                                aVar3.f24867b.add(aVar4);
                                aVar4.f24868c.add(aVar3);
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it3 = map.values().iterator();
        while (it3.hasNext()) {
            hashSet.addAll((Set) it3.next());
        }
        HashSet hashSet2 = new HashSet();
        Iterator it4 = hashSet.iterator();
        while (it4.hasNext()) {
            a aVar5 = (a) it4.next();
            if (aVar5.f24868c.isEmpty()) {
                hashSet2.add(aVar5);
            }
        }
        while (!hashSet2.isEmpty()) {
            a aVar6 = (a) hashSet2.iterator().next();
            hashSet2.remove(aVar6);
            i10++;
            Iterator it5 = aVar6.f24867b.iterator();
            while (it5.hasNext()) {
                a aVar7 = (a) it5.next();
                aVar7.f24868c.remove(aVar6);
                if (aVar7.f24868c.isEmpty()) {
                    hashSet2.add(aVar7);
                }
            }
        }
        if (i10 == arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it6 = hashSet.iterator();
        while (it6.hasNext()) {
            a aVar8 = (a) it6.next();
            if (!aVar8.f24868c.isEmpty() && !aVar8.f24867b.isEmpty()) {
                arrayList2.add(aVar8.f24866a);
            }
        }
        throw new m("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
    }
}
