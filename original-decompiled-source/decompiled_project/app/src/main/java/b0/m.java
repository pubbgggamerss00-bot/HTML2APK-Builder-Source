package b0;

import d0.a2;

/* loaded from: classes.dex */
public final class m extends d0.o<i> implements j0 {

    /* renamed from: a, reason: collision with root package name */
    public final a2<i> f3380a = new a2<>();

    public m(eh.l<? super j0, pg.f0> lVar) {
        lVar.invoke(this);
    }

    @Override // b0.j0
    public final void a(Object obj, f1.b bVar) {
        this.f3380a.a(1, new i(obj != null ? new j(obj, 0) : null, new k(1), new f1.b(-1010194746, true, new l(bVar))));
    }

    @Override // b0.j0
    public final void d(int i10, eh.l lVar, eh.l lVar2, f1.b bVar) {
        this.f3380a.a(i10, new i(lVar, lVar2, bVar));
    }

    @Override // d0.o
    public final a2 f() {
        return this.f3380a;
    }
}
