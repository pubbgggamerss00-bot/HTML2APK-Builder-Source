package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class l0 implements k0 {
    @Override // com.google.crypto.tink.shaded.protobuf.k0
    public final j0 a() {
        j0<?, ?> j0Var = j0.f6701b;
        if (j0Var.isEmpty()) {
            return new j0();
        }
        j0 j0Var2 = new j0(j0Var);
        j0Var2.f6702a = true;
        return j0Var2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k0
    public final j0 forMapData(Object obj) {
        return (j0) obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k0
    public final void forMapMetadata(Object obj) {
        ((i0) obj).getClass();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k0
    public final j0 forMutableMapData(Object obj) {
        return (j0) obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k0
    public final int getSerializedSize(int i10, Object obj, Object obj2) {
        j0 j0Var = (j0) obj;
        i0 i0Var = (i0) obj2;
        if (j0Var.isEmpty()) {
            return 0;
        }
        Iterator it = j0Var.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        i0Var.getClass();
        k.Q(i10);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k0
    public final boolean isImmutable(Object obj) {
        return !((j0) obj).f6702a;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k0
    public final j0 mergeFrom(Object obj, Object obj2) {
        j0 j0Var = (j0) obj;
        j0 j0Var2 = (j0) obj2;
        if (!j0Var2.isEmpty()) {
            if (!j0Var.f6702a) {
                if (j0Var.isEmpty()) {
                    j0Var = new j0();
                } else {
                    j0 j0Var3 = new j0(j0Var);
                    j0Var3.f6702a = true;
                    j0Var = j0Var3;
                }
            }
            j0Var.e();
            if (!j0Var2.isEmpty()) {
                j0Var.putAll(j0Var2);
            }
        }
        return j0Var;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k0
    public final Object toImmutable(Object obj) {
        ((j0) obj).f6702a = false;
        return obj;
    }
}
