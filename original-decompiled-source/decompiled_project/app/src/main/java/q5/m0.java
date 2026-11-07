package q5;

import java.util.List;
import java.util.ListIterator;
import s.z0;
import x0.n1;
import x0.r3;

/* loaded from: classes.dex */
public final class m0 implements eh.r<r.n, p5.s, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z0<p5.s> f22008a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p5.s f22009b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1.d f22010c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n1<Boolean> f22011d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r3<List<p5.s>> f22012e;

    public m0(z0 z0Var, p5.s sVar, g1.e eVar, n1 n1Var, r3 r3Var) {
        this.f22008a = z0Var;
        this.f22009b = sVar;
        this.f22010c = eVar;
        this.f22011d = n1Var;
        this.f22012e = r3Var;
    }

    @Override // eh.r
    public final pg.f0 f(r.n nVar, p5.s sVar, x0.j jVar, Integer num) {
        p5.s sVarPrevious;
        r.n nVar2 = nVar;
        p5.s sVar2 = sVar;
        x0.j jVar2 = jVar;
        num.intValue();
        boolean zA = kotlin.jvm.internal.r.a(this.f22008a.f24049c.getValue(), this.f22009b);
        if (!this.f22011d.getValue().booleanValue() && !zA) {
            List<p5.s> value = this.f22012e.getValue();
            ListIterator<p5.s> listIterator = value.listIterator(value.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    sVarPrevious = null;
                    break;
                }
                sVarPrevious = listIterator.previous();
                if (kotlin.jvm.internal.r.a(sVar2, sVarPrevious)) {
                    break;
                }
            }
            sVar2 = sVarPrevious;
        }
        if (sVar2 == null) {
            jVar2.L(105930796);
        } else {
            jVar2.L(-1520603531);
            di.p0.a(sVar2, this.f22010c, f1.c.b(-1263531443, new l0(sVar2, nVar2), jVar2), jVar2, 384);
        }
        jVar2.B();
        return pg.f0.f21461a;
    }
}
