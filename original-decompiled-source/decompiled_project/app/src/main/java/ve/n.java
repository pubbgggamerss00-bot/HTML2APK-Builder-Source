package ve;

import java.util.Comparator;
import java.util.List;
import ve.o;

/* loaded from: classes2.dex */
public final class n implements Comparator<o.d> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f30851a;

    public n(List list) {
        this.f30851a = list;
    }

    @Override // java.util.Comparator
    public final int compare(o.d dVar, o.d dVar2) {
        String str = dVar.f30866a;
        List list = this.f30851a;
        int iIndexOf = list.indexOf(str);
        int iIndexOf2 = list.indexOf(dVar2.f30866a);
        if (iIndexOf < iIndexOf2) {
            return -1;
        }
        return iIndexOf == iIndexOf2 ? 0 : 1;
    }
}
