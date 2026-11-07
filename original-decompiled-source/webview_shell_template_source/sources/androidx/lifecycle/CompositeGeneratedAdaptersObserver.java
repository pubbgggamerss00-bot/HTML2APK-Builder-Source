package androidx.lifecycle;

import androidx.lifecycle.h;
import java.util.HashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class CompositeGeneratedAdaptersObserver implements k {
    public final e[] s;

    public CompositeGeneratedAdaptersObserver(e[] eVarArr) {
        this.s = eVarArr;
    }

    @Override // androidx.lifecycle.k
    public final void a(m mVar, h.a aVar) {
        new HashMap();
        e[] eVarArr = this.s;
        for (e eVar : eVarArr) {
            eVar.a();
        }
        for (e eVar2 : eVarArr) {
            eVar2.a();
        }
    }
}
