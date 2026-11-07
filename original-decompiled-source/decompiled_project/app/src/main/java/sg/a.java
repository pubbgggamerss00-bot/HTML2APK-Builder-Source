package sg;

import eh.l;
import i0.x1;
import java.util.Comparator;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l[] f24918a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        for (l lVar : this.f24918a) {
            int iB = x1.b((Comparable) lVar.invoke(obj), (Comparable) lVar.invoke(obj2));
            if (iB != 0) {
                return iB;
            }
        }
        return 0;
    }
}
