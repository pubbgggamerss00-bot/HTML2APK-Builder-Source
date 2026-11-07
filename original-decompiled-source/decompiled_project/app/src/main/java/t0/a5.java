package t0;

/* loaded from: classes.dex */
public final class a5 extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f25454a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f25455b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.b f25456c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f25457d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f25458e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(f1.b bVar, f1.b bVar2, f1.b bVar3, f1.b bVar4, f1.b bVar5) {
        super(2);
        this.f25454a = bVar;
        this.f25455b = bVar2;
        this.f25456c = bVar3;
        this.f25457d = bVar4;
        this.f25458e = bVar5;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            h5.b(this.f25454a, this.f25455b, this.f25456c, this.f25457d, this.f25458e, jVar2, 384);
        }
        return pg.f0.f21461a;
    }
}
