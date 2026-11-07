package g2;

import i2.g;
import java.util.List;

/* loaded from: classes.dex */
public final class a0 extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List<eh.p<x0.j, Integer, pg.f0>> f11313a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a0(List<? extends eh.p<? super x0.j, ? super Integer, pg.f0>> list) {
        super(2);
        this.f11313a = list;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        if (jVar2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            List<eh.p<x0.j, Integer, pg.f0>> list = this.f11313a;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                eh.p<x0.j, Integer, pg.f0> pVar = list.get(i10);
                int iD = jVar2.D();
                i2.g.f13861o.getClass();
                g.a.e eVar = g.a.f13864c;
                if (jVar2.t() == null) {
                    c9.u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(eVar);
                } else {
                    jVar2.z();
                }
                g.a.C0128a c0128a = g.a.f13868g;
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                    l9.i.a(iD, jVar2, iD, c0128a);
                }
                pVar.invoke(jVar2, 0);
                jVar2.H();
            }
        } else {
            jVar2.v();
        }
        return pg.f0.f21461a;
    }
}
