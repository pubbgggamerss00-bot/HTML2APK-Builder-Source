package k1;

import androidx.lifecycle.f0;
import androidx.lifecycle.h0;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b implements h0.b {

    /* renamed from: a, reason: collision with root package name */
    public final d<?>[] f13535a;

    public b(d<?>... dVarArr) {
        j.e("initializers", dVarArr);
        this.f13535a = dVarArr;
    }

    @Override // androidx.lifecycle.h0.b
    public final f0 b(Class cls, c cVar) {
        f0 f0Var = null;
        for (d<?> dVar : this.f13535a) {
            if (dVar.f13536a.equals(cls)) {
                Object objInvoke = dVar.f13537b.invoke(cVar);
                f0Var = objInvoke instanceof f0 ? (f0) objInvoke : null;
            }
        }
        if (f0Var != null) {
            return f0Var;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }
}
