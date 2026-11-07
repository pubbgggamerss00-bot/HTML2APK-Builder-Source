package t2;

import java.util.ArrayList;
import java.util.List;
import t2.b;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final b f27797a = new b("");

    public static final List<b.c<? extends b.a>> a(b bVar, int i10, int i11, eh.l<? super b.a, Boolean> lVar) {
        List<b.c<? extends b.a>> list;
        if (i10 == i11 || (list = bVar.f27760a) == null) {
            return null;
        }
        if (i10 != 0 || i11 < bVar.f27761b.length()) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                b.c<? extends b.a> cVar = list.get(i12);
                if ((lVar != null ? lVar.invoke(cVar.f27771a).booleanValue() : true) && b(i10, i11, cVar.f27772b, cVar.f27773c)) {
                    arrayList.add(new b.c((b.a) cVar.f27771a, jh.j.m(cVar.f27772b, i10, i11) - i10, jh.j.m(cVar.f27773c, i10, i11) - i10, cVar.f27774d));
                }
            }
            return arrayList;
        }
        if (lVar == null) {
            return list;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            b.c<? extends b.a> cVar2 = list.get(i13);
            if (lVar.invoke(cVar2.f27771a).booleanValue()) {
                arrayList2.add(cVar2);
            }
        }
        return arrayList2;
    }

    public static final boolean b(int i10, int i11, int i12, int i13) {
        return ((i10 < i13) & (i12 < i11)) | (((i10 == i11) | (i12 == i13)) & (i10 == i12));
    }
}
