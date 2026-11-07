package g7;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class z implements eh.a {
    @Override // eh.a
    public final Object invoke() {
        List listU = qg.x.U(new c0(), (List) b8.r.f3680b.getValue());
        ArrayList arrayList = new ArrayList();
        int size = listU.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(((b8.d) listU.get(i10)).a());
        }
        return arrayList;
    }
}
