package t0;

/* loaded from: classes.dex */
public final class k6 extends kotlin.jvm.internal.s implements eh.a<pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hb f26231a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ph.i0 f26232b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s.b<Float, s.o> f26233c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f26234d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(hb hbVar, ph.i0 i0Var, s.b<Float, s.o> bVar, eh.a<pg.f0> aVar) {
        super(0);
        this.f26231a = hbVar;
        this.f26232b = i0Var;
        this.f26233c = bVar;
        this.f26234d = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.a
    public final pg.f0 invoke() {
        hb hbVar = this.f26231a;
        ib ibVar = (ib) hbVar.f26015b.f28947g.getValue();
        ib ibVar2 = ib.f26109b;
        ph.i0 i0Var = this.f26232b;
        if (ibVar == ibVar2 && hbVar.f26015b.e().e(ib.f26110c)) {
            ph.h.c(i0Var, null, null, new g6(this.f26233c, null), 3);
            ph.h.c(i0Var, null, null, new h6(hbVar, null), 3);
        } else {
            ph.h.c(i0Var, null, null, new i6(hbVar, null), 3).invokeOnCompletion(new j6(this.f26234d));
        }
        return pg.f0.f21461a;
    }
}
