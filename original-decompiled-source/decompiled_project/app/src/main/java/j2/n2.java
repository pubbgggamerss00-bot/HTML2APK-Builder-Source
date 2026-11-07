package j2;

import g1.i;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class n2 implements g1.i {

    /* renamed from: a, reason: collision with root package name */
    public final p2 f14834a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1.j f14835b;

    public n2(g1.j jVar, p2 p2Var) {
        this.f14834a = p2Var;
        this.f14835b = jVar;
    }

    @Override // g1.i
    public final boolean a(Object obj) {
        return this.f14835b.a(obj);
    }

    @Override // g1.i
    public final Map<String, List<Object>> b() {
        return this.f14835b.b();
    }

    @Override // g1.i
    public final Object c(String str) {
        return this.f14835b.c(str);
    }

    @Override // g1.i
    public final i.a d(String str, eh.a<? extends Object> aVar) {
        return this.f14835b.d(str, aVar);
    }
}
