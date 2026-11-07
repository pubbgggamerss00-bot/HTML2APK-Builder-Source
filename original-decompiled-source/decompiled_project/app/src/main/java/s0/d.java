package s0;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class d extends r implements k {
    public j B;
    public n C;

    @Override // androidx.compose.ui.d.c
    public final void M1() {
        j jVar = this.B;
        if (jVar != null) {
            u0();
            l lVar = jVar.f24122d;
            n nVar = (n) lVar.f24124a.get(this);
            if (nVar != null) {
                nVar.c();
                LinkedHashMap linkedHashMap = lVar.f24124a;
                n nVar2 = (n) linkedHashMap.get(this);
                if (nVar2 != null) {
                }
                linkedHashMap.remove(this);
                jVar.f24121c.add(nVar);
            }
        }
    }

    @Override // s0.k
    public final void u0() {
        this.C = null;
        i2.s.a(this);
    }
}
