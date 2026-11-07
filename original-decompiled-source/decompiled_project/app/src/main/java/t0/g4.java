package t0;

/* loaded from: classes.dex */
public final class g4 extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f25914a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1.b f25915b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(long j10, f1.b bVar) {
        super(2);
        this.f25914a = j10;
        this.f25915b = bVar;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            u0.v0.a(this.f25914a, of.a(v0.h.f30291a, jVar2), f1.c.b(-1771489750, new f4(this.f25915b), jVar2), jVar2, 384);
        }
        return pg.f0.f21461a;
    }
}
