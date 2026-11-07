package h9;

import com.basitce.htmltoapk.data.licenses.OpenSourceLicenses;
import java.util.List;

/* loaded from: classes.dex */
public final class c1 implements eh.q<b0.e, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List<OpenSourceLicenses.a> f12571a;

    public c1(List<OpenSourceLicenses.a> list) {
        this.f12571a = list;
    }

    @Override // eh.q
    public final pg.f0 b(b0.e eVar, x0.j jVar, Integer num) {
        b0.e item = eVar;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(item, "$this$item");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            s0.d(this.f12571a.size(), 0, jVar2);
        }
        return pg.f0.f21461a;
    }
}
