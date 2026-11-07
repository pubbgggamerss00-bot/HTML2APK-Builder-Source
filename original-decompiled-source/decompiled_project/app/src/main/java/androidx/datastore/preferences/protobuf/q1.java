package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.x;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class q1 extends r1<x.a<Object>, Object> {
    @Override // androidx.datastore.preferences.protobuf.r1
    public final void i() {
        if (!this.f2138c) {
            for (int i10 = 0; i10 < this.f2136a.size(); i10++) {
                Map.Entry<x.a<Object>, Object> entryF = f(i10);
                if (entryF.getKey().isRepeated()) {
                    entryF.setValue(Collections.unmodifiableList((List) entryF.getValue()));
                }
            }
            for (Map.Entry entry : g()) {
                if (((x.a) entry.getKey()).isRepeated()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.i();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return j((Comparable) obj, obj2);
    }
}
