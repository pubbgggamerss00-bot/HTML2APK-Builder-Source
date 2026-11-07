package c9;

import com.basitce.htmltoapk.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class f1 extends kotlin.jvm.internal.p implements eh.a<pg.f0> {
    @Override // eh.a
    public final pg.f0 invoke() {
        s1 s1Var = (s1) this.receiver;
        List<b> listJ = s1Var.j();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listJ) {
            if (!s1Var.k().contains(Long.valueOf(((b) obj).f5057a))) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            s1Var.f5285q.setValue(new pg.n(Integer.valueOf(R.string.pdf_edit_cannot_delete_all), null));
        } else {
            s1Var.h(arrayList);
            s1Var.f5277i.setValue(qg.b0.f22711a);
        }
        return pg.f0.f21461a;
    }
}
