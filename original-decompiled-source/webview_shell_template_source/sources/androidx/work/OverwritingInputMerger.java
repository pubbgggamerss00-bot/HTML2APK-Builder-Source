package androidx.work;

import androidx.work.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class OverwritingInputMerger extends i {
    @Override // androidx.work.i
    public final f a(ArrayList arrayList) throws Throwable {
        f.a aVar = new f.a();
        HashMap map = new HashMap();
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            map.putAll(Collections.unmodifiableMap(((f) obj).f1776a));
        }
        aVar.a(map);
        f fVar = new f(aVar.f1777a);
        f.c(fVar);
        return fVar;
    }
}
