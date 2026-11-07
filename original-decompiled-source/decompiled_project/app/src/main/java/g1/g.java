package g1;

import kotlin.jvm.internal.s;
import x0.k0;
import x0.l0;

/* loaded from: classes.dex */
public final class g extends s implements eh.l<l0, k0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f11295a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11296b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f11297c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, Object obj, i iVar) {
        super(1);
        this.f11295a = eVar;
        this.f11296b = obj;
        this.f11297c = iVar;
    }

    @Override // eh.l
    public final k0 invoke(l0 l0Var) {
        e eVar = this.f11295a;
        p.l0<Object, i> l0Var2 = eVar.f11286b;
        Object obj = this.f11296b;
        if (l0Var2.a(obj)) {
            throw new IllegalArgumentException(("Key " + obj + " was used multiple times ").toString());
        }
        eVar.f11285a.remove(obj);
        i iVar = this.f11297c;
        l0Var2.l(obj, iVar);
        return new f(eVar, obj, iVar);
    }
}
