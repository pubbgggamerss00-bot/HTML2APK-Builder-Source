package q3;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class y extends a0 {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f14187w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f14188x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ e0 f14189y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(e0 e0Var, String str, c cVar) {
        super(e0Var, true);
        this.f14189y = e0Var;
        this.f14187w = str;
        this.f14188x = cVar;
    }

    @Override // q3.a0
    public final void a() {
        f fVar = this.f14189y.h;
        com.google.android.gms.common.internal.l.f(fVar);
        fVar.S0(this.f14187w, this.f14188x);
    }

    @Override // q3.a0
    public final void b() {
        this.f14188x.r(null);
    }
}
