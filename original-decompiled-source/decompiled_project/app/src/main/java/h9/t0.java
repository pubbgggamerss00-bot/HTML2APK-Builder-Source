package h9;

import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.data.licenses.OpenSourceLicenses;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class t0 implements eh.q<z.o0, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OpenSourceLicenses.a f12808a;

    public t0(OpenSourceLicenses.a aVar) {
        this.f12808a = aVar;
    }

    @Override // eh.q
    public final pg.f0 b(z.o0 o0Var, x0.j jVar, Integer num) {
        z.o0 FlowRow = o0Var;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(FlowRow, "$this$FlowRow");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            jVar2.L(1089402693);
            OpenSourceLicenses.a aVar = this.f12808a;
            Iterator<T> it = aVar.f5699g.iterator();
            while (it.hasNext()) {
                s0.a(((OpenSourceLicenses.b) it.next()).f5702a, true, jVar2, 48);
            }
            jVar2.B();
            jVar2.L(1089404719);
            if (aVar.f5700h) {
                s0.a(f3.q.c(R.string.licenses_used_in_app, jVar2), false, jVar2, 48);
            }
            jVar2.B();
            if (aVar.f5701i) {
                s0.a(f3.q.c(R.string.licenses_used_in_generated, jVar2), false, jVar2, 48);
            }
        }
        return pg.f0.f21461a;
    }
}
