package g1;

import java.util.List;
import java.util.Map;
import p.l0;
import x0.k0;

/* loaded from: classes.dex */
public final class f implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f11292a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11293b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f11294c;

    public f(e eVar, Object obj, i iVar) {
        this.f11292a = eVar;
        this.f11293b = obj;
        this.f11294c = iVar;
    }

    @Override // x0.k0
    public final void a() {
        e eVar = this.f11292a;
        l0<Object, i> l0Var = eVar.f11286b;
        Object obj = this.f11293b;
        i iVarJ = l0Var.j(obj);
        i iVar = this.f11294c;
        if (iVarJ == iVar) {
            Map<Object, Map<String, List<Object>>> map = eVar.f11285a;
            Map<String, List<Object>> mapB = iVar.b();
            if (mapB.isEmpty()) {
                map.remove(obj);
            } else {
                map.put(obj, mapB);
            }
        }
    }
}
