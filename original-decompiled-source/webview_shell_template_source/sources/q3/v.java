package q3;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class v extends a0 {
    public final /* synthetic */ e0 A;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f14179w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f14180x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f14181y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ c f14182z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(e0 e0Var, String str, String str2, boolean z6, c cVar) {
        super(e0Var, true);
        this.A = e0Var;
        this.f14179w = str;
        this.f14180x = str2;
        this.f14181y = z6;
        this.f14182z = cVar;
    }

    @Override // q3.a0
    public final void a() {
        f fVar = this.A.h;
        com.google.android.gms.common.internal.l.f(fVar);
        fVar.F1(this.f14179w, this.f14180x, this.f14181y, this.f14182z);
    }

    @Override // q3.a0
    public final void b() {
        this.f14182z.r(null);
    }
}
