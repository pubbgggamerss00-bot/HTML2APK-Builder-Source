package x0;

/* loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.s implements eh.a<pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f31808a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y0.a f31809b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z2 f31810c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j1 f31811d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(k kVar, y0.a aVar, z2 z2Var, j1 j1Var) {
        super(0);
        this.f31808a = kVar;
        this.f31809b = aVar;
        this.f31810c = z2Var;
        this.f31811d = j1Var;
    }

    @Override // eh.a
    public final pg.f0 invoke() {
        k kVar = this.f31808a;
        y0.b bVar = kVar.L;
        y0.a aVar = this.f31809b;
        z2 z2Var = this.f31810c;
        j1 j1Var = this.f31811d;
        y0.a aVar2 = bVar.f33614b;
        try {
            bVar.f33614b = aVar;
            z2 z2Var2 = kVar.F;
            int[] iArr = kVar.f31741n;
            p.y<a2> yVar = kVar.f31748u;
            kVar.f31741n = null;
            kVar.f31748u = null;
            try {
                kVar.F = z2Var;
                boolean z10 = bVar.f33617e;
                try {
                    bVar.f33617e = false;
                    k.N(kVar, j1Var.f31718a, j1Var.f31724g, j1Var.f31719b);
                    bVar.f33617e = z10;
                    pg.f0 f0Var = pg.f0.f21461a;
                    bVar.f33614b = aVar2;
                    return pg.f0.f21461a;
                } catch (Throwable th2) {
                    bVar.f33617e = z10;
                    throw th2;
                }
            } finally {
                kVar.F = z2Var2;
                kVar.f31741n = iArr;
                kVar.f31748u = yVar;
            }
        } catch (Throwable th3) {
            bVar.f33614b = aVar2;
            throw th3;
        }
    }
}
