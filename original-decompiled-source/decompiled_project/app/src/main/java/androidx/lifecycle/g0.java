package androidx.lifecycle;

import androidx.lifecycle.c;
import androidx.lifecycle.l;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
public final class g0 implements r {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2277a;

    /* renamed from: b, reason: collision with root package name */
    public final c.a f2278b;

    public g0(s sVar) {
        this.f2277a = sVar;
        c cVar = c.f2251c;
        Class<?> cls = sVar.getClass();
        c.a aVar = (c.a) cVar.f2252a.get(cls);
        this.f2278b = aVar == null ? cVar.a(cls, null) : aVar;
    }

    @Override // androidx.lifecycle.r
    public final void l(t tVar, l.a aVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        HashMap map = this.f2278b.f2254a;
        List list = (List) map.get(aVar);
        Object obj = this.f2277a;
        c.a.a(list, tVar, aVar, obj);
        c.a.a((List) map.get(l.a.ON_ANY), tVar, aVar, obj);
    }
}
