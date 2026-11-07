package j9;

import j9.x1;

/* loaded from: classes.dex */
public final class c1 implements eh.a<pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q8.d0 f15313a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q8.e0 f15314b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f15315c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p5.x f15316d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x1.a f15317e;

    public c1(q8.d0 d0Var, q8.e0 e0Var, long j10, p5.x xVar, x1.a aVar) {
        this.f15313a = d0Var;
        this.f15314b = e0Var;
        this.f15315c = j10;
        this.f15316d = xVar;
        this.f15317e = aVar;
    }

    @Override // eh.a
    public final pg.f0 invoke() {
        this.f15313a.a(this.f15314b, this.f15315c, new b1(this.f15317e, this.f15316d));
        return pg.f0.f21461a;
    }
}
