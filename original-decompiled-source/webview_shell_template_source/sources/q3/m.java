package q3;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class m extends a0 {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f14150w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f14151x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ c f14152y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ e0 f14153z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(e0 e0Var, String str, String str2, c cVar) {
        super(e0Var, true);
        this.f14153z = e0Var;
        this.f14150w = str;
        this.f14151x = str2;
        this.f14152y = cVar;
    }

    @Override // q3.a0
    public final void a() {
        f fVar = this.f14153z.h;
        com.google.android.gms.common.internal.l.f(fVar);
        fVar.Z1(this.f14150w, this.f14151x, this.f14152y);
    }

    @Override // q3.a0
    public final void b() {
        this.f14152y.r(null);
    }
}
