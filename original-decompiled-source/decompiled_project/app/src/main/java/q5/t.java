package q5;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p5.b1;
import p5.s0;

/* loaded from: classes.dex */
public final /* synthetic */ class t implements eh.p {
    @Override // eh.p
    public final Object invoke(Object obj, Object obj2) {
        Bundle bundleA;
        s0 s0Var = (s0) obj2;
        s5.l lVar = s0Var.f21304b;
        LinkedHashMap linkedHashMap = lVar.f24491m;
        qg.l<p5.s> lVar2 = lVar.f24484f;
        LinkedHashMap linkedHashMap2 = lVar.f24490l;
        ArrayList arrayList = new ArrayList();
        Bundle bundleA2 = u3.d.a((pg.n[]) Arrays.copyOf(new pg.n[0], 0));
        for (Map.Entry entry : qg.k0.j(lVar.f24497s.f21198a).entrySet()) {
            ((b1) entry.getValue()).getClass();
        }
        if (arrayList.isEmpty()) {
            bundleA = null;
        } else {
            bundleA = u3.d.a((pg.n[]) Arrays.copyOf(new pg.n[0], 0));
            b4.a.f(bundleA2, "android-support-nav:controller:navigatorState:names", arrayList);
            b4.a.d(bundleA, "android-support-nav:controller:navigatorState", bundleA2);
        }
        if (!lVar2.isEmpty()) {
            if (bundleA == null) {
                bundleA = u3.d.a((pg.n[]) Arrays.copyOf(new pg.n[0], 0));
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator<p5.s> it = lVar2.iterator();
            while (it.hasNext()) {
                p5.s entry2 = it.next();
                kotlin.jvm.internal.r.e(entry2, "entry");
                int i10 = entry2.f21269b.f21235b.f24511d;
                String str = entry2.f21273f;
                s5.c cVar = entry2.f21275h;
                Bundle bundleA3 = cVar.a();
                Bundle bundleA4 = u3.d.a((pg.n[]) Arrays.copyOf(new pg.n[0], 0));
                cVar.f24450h.b(bundleA4);
                Bundle bundleA5 = u3.d.a((pg.n[]) Arrays.copyOf(new pg.n[0], 0));
                b4.a.e("nav-entry-state:id", str, bundleA5);
                bundleA5.putInt("nav-entry-state:destination-id", i10);
                if (bundleA3 == null) {
                    bundleA3 = u3.d.a((pg.n[]) Arrays.copyOf(new pg.n[0], 0));
                }
                b4.a.d(bundleA5, "nav-entry-state:args", bundleA3);
                b4.a.d(bundleA5, "nav-entry-state:saved-state", bundleA4);
                arrayList2.add(bundleA5);
            }
            bundleA.putParcelableArrayList("android-support-nav:controller:backStack", c6.f.c(arrayList2));
        }
        if (!linkedHashMap2.isEmpty()) {
            if (bundleA == null) {
                bundleA = u3.d.a((pg.n[]) Arrays.copyOf(new pg.n[0], 0));
            }
            int[] iArr = new int[linkedHashMap2.size()];
            ArrayList arrayList3 = new ArrayList();
            int i11 = 0;
            for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                int iIntValue = ((Number) entry3.getKey()).intValue();
                String str2 = (String) entry3.getValue();
                int i12 = i11 + 1;
                iArr[i11] = iIntValue;
                if (str2 == null) {
                    str2 = "";
                }
                arrayList3.add(str2);
                i11 = i12;
            }
            b4.a.b(bundleA, "android-support-nav:controller:backStackDestIds", iArr);
            b4.a.f(bundleA, "android-support-nav:controller:backStackIds", arrayList3);
        }
        if (!linkedHashMap.isEmpty()) {
            if (bundleA == null) {
                bundleA = u3.d.a((pg.n[]) Arrays.copyOf(new pg.n[0], 0));
            }
            ArrayList arrayList4 = new ArrayList();
            for (Map.Entry entry4 : linkedHashMap.entrySet()) {
                String str3 = (String) entry4.getKey();
                qg.l lVar3 = (qg.l) entry4.getValue();
                arrayList4.add(str3);
                ArrayList arrayList5 = new ArrayList();
                Iterator<E> it2 = lVar3.iterator();
                while (it2.hasNext()) {
                    s5.d dVar = ((p5.t) it2.next()).f21276a;
                    dVar.getClass();
                    Bundle bundleA6 = u3.d.a((pg.n[]) Arrays.copyOf(new pg.n[0], 0));
                    b4.a.e("nav-entry-state:id", dVar.f24457a, bundleA6);
                    bundleA6.putInt("nav-entry-state:destination-id", dVar.f24458b);
                    Bundle bundleA7 = dVar.f24459c;
                    if (bundleA7 == null) {
                        bundleA7 = u3.d.a((pg.n[]) Arrays.copyOf(new pg.n[0], 0));
                    }
                    b4.a.d(bundleA6, "nav-entry-state:args", bundleA7);
                    b4.a.d(bundleA6, "nav-entry-state:saved-state", dVar.f24460d);
                    arrayList5.add(bundleA6);
                }
                String key = "android-support-nav:controller:backStackStates:" + str3;
                kotlin.jvm.internal.r.e(key, "key");
                bundleA.putParcelableArrayList(key, c6.f.c(arrayList5));
            }
            b4.a.f(bundleA, "android-support-nav:controller:backStackStates", arrayList4);
        }
        if (s0Var.f21307e) {
            if (bundleA == null) {
                bundleA = u3.d.a((pg.n[]) Arrays.copyOf(new pg.n[0], 0));
            }
            bundleA.putBoolean("android-support-nav:controller:deepLinkHandled", s0Var.f21307e);
        }
        return bundleA;
    }
}
