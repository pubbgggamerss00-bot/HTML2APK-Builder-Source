package androidx.work;

import androidx.work.b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.r;
import t6.k;

/* loaded from: classes.dex */
public final class OverwritingInputMerger extends k {
    @Override // t6.k
    public final b a(ArrayList arrayList) throws IOException {
        b.a aVar = new b.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Map mapUnmodifiableMap = Collections.unmodifiableMap(((b) obj).f3130a);
            r.d(mapUnmodifiableMap, "unmodifiableMap(values)");
            linkedHashMap.putAll(mapUnmodifiableMap);
        }
        aVar.a(linkedHashMap);
        b bVar = new b(aVar.f3131a);
        b.C0046b.b(bVar);
        return bVar;
    }
}
