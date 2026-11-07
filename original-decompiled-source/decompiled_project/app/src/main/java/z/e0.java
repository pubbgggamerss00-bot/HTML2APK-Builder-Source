package z;

import g2.g1;

/* loaded from: classes.dex */
public final class e0 extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z0.b<g2.m0> f34494a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(z0.b<g2.m0> bVar) {
        super(1);
        this.f34494a = bVar;
    }

    @Override // eh.l
    public final pg.f0 invoke(g1.a aVar) {
        z0.b<g2.m0> bVar = this.f34494a;
        g2.m0[] m0VarArr = bVar.f34700a;
        int i10 = bVar.f34702c;
        for (int i11 = 0; i11 < i10; i11++) {
            m0VarArr[i11].s();
        }
        return pg.f0.f21461a;
    }
}
