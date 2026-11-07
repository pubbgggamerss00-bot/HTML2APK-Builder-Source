package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.s;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class i1 extends j1<Object, Object> {
    @Override // com.google.crypto.tink.shaded.protobuf.j1
    public final void i() {
        if (!this.f6707d) {
            for (int i10 = 0; i10 < this.f6705b.size(); i10++) {
                ((s.a) f(i10).getKey()).getClass();
            }
            Iterator<Map.Entry<Object, Object>> it = g().iterator();
            while (it.hasNext()) {
                ((s.a) it.next().getKey()).getClass();
            }
        }
        super.i();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return j((Comparable) obj, obj2);
    }
}
