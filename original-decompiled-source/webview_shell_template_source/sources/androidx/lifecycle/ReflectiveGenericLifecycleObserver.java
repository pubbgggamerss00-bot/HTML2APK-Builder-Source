package androidx.lifecycle;

import androidx.lifecycle.b;
import androidx.lifecycle.h;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
@Deprecated
/* loaded from: classes.dex */
class ReflectiveGenericLifecycleObserver implements k {
    public final l s;

    /* renamed from: t, reason: collision with root package name */
    public final b.a f1269t;

    public ReflectiveGenericLifecycleObserver(l lVar) {
        this.s = lVar;
        b bVar = b.f1276c;
        Class<?> cls = lVar.getClass();
        b.a aVar = (b.a) bVar.f1277a.get(cls);
        this.f1269t = aVar == null ? bVar.a(cls, null) : aVar;
    }

    @Override // androidx.lifecycle.k
    public final void a(m mVar, h.a aVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        HashMap map = this.f1269t.f1279a;
        List list = (List) map.get(aVar);
        l lVar = this.s;
        b.a.a(list, mVar, aVar, lVar);
        b.a.a((List) map.get(h.a.ON_ANY), mVar, aVar, lVar);
    }
}
