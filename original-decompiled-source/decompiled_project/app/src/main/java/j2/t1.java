package j2;

import android.view.ViewGroup;
import androidx.compose.ui.d;

/* loaded from: classes.dex */
public final class t1 extends d.c implements n2.a {

    /* renamed from: q, reason: collision with root package name */
    public ViewGroup f14901q;

    @Override // n2.a
    public final Object l1(i2.g1 g1Var, n2.b bVar, vg.c cVar) {
        long jY = g1Var.Y(0L);
        p1.e eVar = (p1.e) bVar.invoke();
        p1.e eVarJ = eVar != null ? eVar.j(jY) : null;
        if (eVarJ != null) {
            this.f14901q.requestRectangleOnScreen(q1.x1.b(eVarJ), false);
        }
        return pg.f0.f21461a;
    }
}
