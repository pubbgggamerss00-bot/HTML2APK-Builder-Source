package w2;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class s extends RecyclerView.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f14985a;

    public s(t tVar) {
        this.f14985a = tVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void a(RecyclerView recyclerView, int i6) {
        if (i6 == 0) {
            t tVar = this.f14985a;
            tVar.j();
            tVar.i();
            tVar.t();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void b(RecyclerView recyclerView, int i6, int i7) {
        if (i6 == 0 && i7 == 0) {
            return;
        }
        this.f14985a.g();
    }
}
