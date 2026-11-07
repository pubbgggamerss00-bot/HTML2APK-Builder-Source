package c0;

import d0.a2;

/* loaded from: classes.dex */
public final class j extends d0.o<i> implements p0 {

    /* renamed from: d, reason: collision with root package name */
    public static final a f4400d = a.f4404a;

    /* renamed from: a, reason: collision with root package name */
    public final v0 f4401a = new v0(this);

    /* renamed from: b, reason: collision with root package name */
    public final a2<i> f4402b = new a2<>();

    /* renamed from: c, reason: collision with root package name */
    public boolean f4403c;

    public static final class a extends kotlin.jvm.internal.s implements eh.p<x, Integer, c> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f4404a = new a(2);

        @Override // eh.p
        public final c invoke(x xVar, Integer num) {
            num.intValue();
            return new c(u0.a(1));
        }
    }

    public j(eh.l<? super p0, pg.f0> lVar) {
        lVar.invoke(this);
    }

    @Override // c0.p0
    public final void c(String str, eh.l lVar, f1.b bVar) {
        this.f4402b.a(1, new i(new k(str), new l(lVar), new m(1), new f1.b(-34608120, true, new n(bVar))));
        this.f4403c = true;
    }

    @Override // c0.p0
    public final void e(int i10, eh.l lVar, eh.l lVar2, f1.b bVar) {
        this.f4402b.a(i10, new i(lVar, f4400d, lVar2, bVar));
    }

    @Override // d0.o
    public final a2 f() {
        return this.f4402b;
    }
}
