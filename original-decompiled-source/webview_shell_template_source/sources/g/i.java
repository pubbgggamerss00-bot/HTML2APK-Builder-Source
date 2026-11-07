package g;

import android.view.ViewGroup;
import u0.f0;
import u0.n0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class i implements Runnable {
    public final /* synthetic */ g s;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a extends f5.b {
        public a() {
        }

        @Override // u0.o0
        public final void a() {
            g gVar = i.this.s;
            gVar.N.setAlpha(1.0f);
            gVar.Q.d(null);
            gVar.Q = null;
        }

        @Override // f5.b, u0.o0
        public final void b() {
            i.this.s.N.setVisibility(0);
        }
    }

    public i(g gVar) {
        this.s = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        g gVar = this.s;
        gVar.O.showAtLocation(gVar.N, 55, 0, 0);
        n0 n0Var = gVar.Q;
        if (n0Var != null) {
            n0Var.b();
        }
        if (!gVar.S || (viewGroup = gVar.T) == null || !viewGroup.isLaidOut()) {
            gVar.N.setAlpha(1.0f);
            gVar.N.setVisibility(0);
            return;
        }
        gVar.N.setAlpha(0.0f);
        n0 n0VarA = f0.a(gVar.N);
        n0VarA.a(1.0f);
        gVar.Q = n0VarA;
        n0VarA.d(new a());
    }
}
