package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.d0;
import androidx.datastore.preferences.protobuf.z1;

/* loaded from: classes.dex */
public final class l0 implements k0 {
    @Override // androidx.datastore.preferences.protobuf.k0
    public final <E> void a(Object obj, Object obj2, long j10) {
        z1.e eVar = z1.f2186c;
        d0.j jVarMutableCopyWithCapacity = (d0.j) eVar.k(obj, j10);
        d0.j jVar = (d0.j) eVar.k(obj2, j10);
        int size = jVarMutableCopyWithCapacity.size();
        int size2 = jVar.size();
        if (size > 0 && size2 > 0) {
            if (!jVarMutableCopyWithCapacity.isModifiable()) {
                jVarMutableCopyWithCapacity = jVarMutableCopyWithCapacity.mutableCopyWithCapacity(size2 + size);
            }
            jVarMutableCopyWithCapacity.addAll(jVar);
        }
        if (size > 0) {
            jVar = jVarMutableCopyWithCapacity;
        }
        z1.p(obj, j10, jVar);
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public final void b(Object obj, long j10) {
        ((d0.j) z1.f2186c.k(obj, j10)).makeImmutable();
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public final d0.j c(Object obj, long j10) {
        d0.j jVar = (d0.j) z1.f2186c.k(obj, j10);
        if (jVar.isModifiable()) {
            return jVar;
        }
        int size = jVar.size();
        d0.j jVarMutableCopyWithCapacity = jVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
        z1.p(obj, j10, jVarMutableCopyWithCapacity);
        return jVarMutableCopyWithCapacity;
    }
}
