package g7;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class y implements eh.a {
    @Override // eh.a
    public final Object invoke() {
        List listU = qg.x.U(new b0(), (List) b8.r.f3679a.getValue());
        ArrayList arrayList = new ArrayList();
        int size = listU.size();
        for (int i10 = 0; i10 < size; i10++) {
            b8.f fVar = (b8.f) listU.get(i10);
            kotlin.jvm.internal.r.c(fVar, "null cannot be cast to non-null type coil3.util.FetcherServiceLoaderTarget<kotlin.Any>");
            arrayList.add(new pg.n(fVar.a(), fVar.type()));
        }
        return arrayList;
    }
}
