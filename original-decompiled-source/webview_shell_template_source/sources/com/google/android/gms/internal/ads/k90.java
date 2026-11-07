package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class k90 implements Iterable {
    public final ArrayList s = new ArrayList();

    public final boolean c(p80 p80Var) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.s;
        int size = arrayList2.size();
        int i6 = 0;
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            j90 j90Var = (j90) obj;
            if (j90Var.f5983a == p80Var) {
                arrayList.add(j90Var);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        int size2 = arrayList.size();
        while (i6 < size2) {
            Object obj2 = arrayList.get(i6);
            i6++;
            ((j90) obj2).f5984b.i();
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.s.iterator();
    }
}
