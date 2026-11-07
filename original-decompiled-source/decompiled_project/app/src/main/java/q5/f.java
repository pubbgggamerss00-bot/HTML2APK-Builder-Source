package q5;

import q5.e;
import r.u1;

/* loaded from: classes.dex */
public final class f extends p5.l0<e.a> {

    /* renamed from: g, reason: collision with root package name */
    public final e f21956g;

    /* renamed from: h, reason: collision with root package name */
    public final f1.b f21957h;

    /* renamed from: i, reason: collision with root package name */
    public eh.l<r.p<p5.s>, u1> f21958i;

    /* renamed from: j, reason: collision with root package name */
    public s8.x f21959j;

    public f(e eVar, String str, f1.b bVar) {
        super(eVar, str);
        this.f21956g = eVar;
        this.f21957h = bVar;
    }

    @Override // p5.l0
    public final p5.k0 a() {
        e.a aVar = (e.a) super.a();
        aVar.f21952g = this.f21958i;
        aVar.f21953h = this.f21959j;
        return aVar;
    }

    @Override // p5.l0
    public final p5.k0 b() {
        return new e.a(this.f21956g, this.f21957h);
    }
}
