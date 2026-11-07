package w2;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ t f14968t;

    public /* synthetic */ p(t tVar, int i6) {
        this.s = i6;
        this.f14968t = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.s) {
            case 0:
                t tVar = this.f14968t;
                if (!tVar.K) {
                    tVar.t();
                    p5.a<d5.j> aVar = tVar.f15018k0;
                    if (aVar != null) {
                        aVar.a();
                        break;
                    }
                }
                break;
            default:
                this.f14968t.V.animate().alpha(0.0f).setDuration(250L).start();
                break;
        }
    }
}
