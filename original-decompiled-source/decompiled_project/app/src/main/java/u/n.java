package u;

import i0.q0;
import pg.f0;

/* loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.s implements eh.q<g, x0.j, Integer, f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0 f28900a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.s f28901b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n(q0 q0Var, eh.a aVar) {
        super(3);
        this.f28900a = q0Var;
        this.f28901b = (kotlin.jvm.internal.s) aVar;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [eh.a, kotlin.jvm.internal.s] */
    @Override // eh.q
    public final f0 b(g gVar, x0.j jVar, Integer num) {
        g gVar2 = gVar;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= jVar2.K(gVar2) ? 4 : 2;
        }
        if (jVar2.A(iIntValue & 1, (iIntValue & 19) != 18)) {
            String str = (String) this.f28900a.invoke(jVar2, 0);
            if (mh.x.A(str)) {
                y.c.c("Label must not be blank");
            }
            y.b(str, gVar2, this.f28901b, jVar2, (iIntValue << 6) & 896);
        } else {
            jVar2.v();
        }
        return f0.f21461a;
    }
}
