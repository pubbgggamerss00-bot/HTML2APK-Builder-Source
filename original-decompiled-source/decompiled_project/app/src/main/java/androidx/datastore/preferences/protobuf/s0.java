package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.p0;
import java.util.Map;

/* loaded from: classes.dex */
public final class s0 implements r0 {
    @Override // androidx.datastore.preferences.protobuf.r0
    public final q0 a() {
        return q0.f2133b.f();
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final q0 forMapData(Object obj) {
        return (q0) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final p0.a<?, ?> forMapMetadata(Object obj) {
        return ((p0) obj).f2123a;
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final q0 forMutableMapData(Object obj) {
        return (q0) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final int getSerializedSize(int i10, Object obj, Object obj2) {
        q0 q0Var = (q0) obj;
        p0 p0Var = (p0) obj2;
        int iH = 0;
        if (q0Var.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : q0Var.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            p0Var.getClass();
            int iG = m.g(i10);
            int iA = p0.a(p0Var.f2123a, key, value);
            iH += m.h(iA) + iA + iG;
        }
        return iH;
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final boolean isImmutable(Object obj) {
        return !((q0) obj).f2134a;
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final q0 mergeFrom(Object obj, Object obj2) {
        q0 q0VarF = (q0) obj;
        q0 q0Var = (q0) obj2;
        if (!q0Var.isEmpty()) {
            if (!q0VarF.f2134a) {
                q0VarF = q0VarF.f();
            }
            q0VarF.e();
            if (!q0Var.isEmpty()) {
                q0VarF.putAll(q0Var);
            }
        }
        return q0VarF;
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final Object toImmutable(Object obj) {
        ((q0) obj).f2134a = false;
        return obj;
    }
}
