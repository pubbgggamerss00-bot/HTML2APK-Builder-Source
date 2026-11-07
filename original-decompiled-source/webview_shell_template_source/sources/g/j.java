package g;

import android.view.View;
import java.util.WeakHashMap;
import u0.f0;
import u0.n0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class j extends f5.b {
    public final /* synthetic */ g s;

    public j(g gVar) {
        this.s = gVar;
    }

    @Override // u0.o0
    public final void a() {
        g gVar = this.s;
        gVar.N.setAlpha(1.0f);
        gVar.Q.d(null);
        gVar.Q = null;
    }

    @Override // f5.b, u0.o0
    public final void b() {
        g gVar = this.s;
        gVar.N.setVisibility(0);
        if (gVar.N.getParent() instanceof View) {
            View view = (View) gVar.N.getParent();
            WeakHashMap<View, n0> weakHashMap = f0.f14480a;
            f0.c.c(view);
        }
    }
}
