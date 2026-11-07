package y5;

import com.google.android.gms.internal.ads.hm1;
import y5.x0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class a<T> extends c1 implements g5.d<T>, x {

    /* renamed from: u, reason: collision with root package name */
    public final g5.f f15319u;

    public a(g5.f fVar, boolean z6) {
        super(z6);
        G((x0) fVar.t(x0.b.s));
        this.f15319u = fVar.e(this);
    }

    @Override // y5.c1
    public final void F(hm1 hm1Var) {
        w.a(this.f15319u, hm1Var);
    }

    @Override // y5.c1
    public final void K(Object obj) {
        if (obj instanceof l) {
            l.f15357b.get((l) obj);
        }
    }

    @Override // g5.d
    public final void g(Object obj) {
        Object objO;
        Throwable thA = d5.d.a(obj);
        if (thA != null) {
            obj = new l(thA, false);
        }
        do {
            objO = O(E(), obj);
            if (objO == e1.f15333a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                l lVar = obj instanceof l ? (l) obj : null;
                throw new IllegalStateException(str, lVar != null ? lVar.f15358a : null);
            }
        } while (objO == e1.f15335c);
        if (objO == e1.f15334b) {
            return;
        }
        u(objO);
    }

    @Override // g5.d
    public final g5.f getContext() {
        return this.f15319u;
    }

    @Override // y5.c1
    public final String y() {
        return getClass().getSimpleName().concat(" was cancelled");
    }
}
