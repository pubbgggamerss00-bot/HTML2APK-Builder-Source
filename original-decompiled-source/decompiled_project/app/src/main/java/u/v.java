package u;

import pg.f0;
import x0.j;

/* loaded from: classes.dex */
public final class v extends kotlin.jvm.internal.s implements eh.q<z.r, x0.j, Integer, f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.s f28929a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f28930b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public v(eh.l<? super m, f0> lVar, g gVar) {
        super(3);
        this.f28929a = (kotlin.jvm.internal.s) lVar;
        this.f28930b = gVar;
    }

    /* JADX WARN: Type inference failed for: r6v7, types: [eh.l, kotlin.jvm.internal.s] */
    @Override // eh.q
    public final f0 b(z.r rVar, x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        if (jVar2.A(iIntValue & 1, (iIntValue & 17) != 16)) {
            Object objG = jVar2.g();
            if (objG == j.a.f31715a) {
                objG = new m();
                jVar2.C(objG);
            }
            m mVar = (m) objG;
            mVar.f28897a.clear();
            this.f28929a.invoke(mVar);
            mVar.a(this.f28930b, jVar2, 0);
        } else {
            jVar2.v();
        }
        return f0.f21461a;
    }
}
