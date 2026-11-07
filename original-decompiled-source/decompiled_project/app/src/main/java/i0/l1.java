package i0;

import i0.i2;

/* loaded from: classes.dex */
public final class l1 extends kotlin.jvm.internal.s implements eh.l<p1.c, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i2 f13408a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o1.c0 f13409b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f13410c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f13411d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m0.x2 f13412e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y2.v f13413f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(i2 i2Var, o1.c0 c0Var, boolean z10, boolean z11, m0.x2 x2Var, y2.v vVar) {
        super(1);
        this.f13408a = i2Var;
        this.f13409b = c0Var;
        this.f13410c = z10;
        this.f13411d = z11;
        this.f13412e = x2Var;
        this.f13413f = vVar;
    }

    @Override // eh.l
    public final pg.f0 invoke(p1.c cVar) {
        j2.z4 z4Var;
        long j10 = cVar.f21129a;
        i2 i2Var = this.f13408a;
        if (!i2Var.b()) {
            o1.c0.b(this.f13409b);
        } else if (!this.f13410c && (z4Var = i2Var.f13339c) != null) {
            z4Var.a();
        }
        if (i2Var.b() && this.f13411d) {
            if (i2Var.a() != v1.f13647b) {
                l4 l4VarD = i2Var.d();
                if (l4VarD != null) {
                    y2.j jVar = i2Var.f13340d;
                    i2.b bVar = i2Var.f13358v;
                    int iA = this.f13413f.a(l4VarD.b(j10, true));
                    bVar.invoke(y2.c0.b(jVar.f33734a, null, t2.k0.a(iA, iA), 5));
                    if (i2Var.f13337a.f13725a.f27761b.length() > 0) {
                        i2Var.f13347k.setValue(v1.f13648c);
                    }
                }
            } else {
                this.f13412e.e(new p1.c(j10));
            }
        }
        return pg.f0.f21461a;
    }
}
