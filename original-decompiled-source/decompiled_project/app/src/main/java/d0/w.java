package d0;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class w implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7287a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7288b;

    public /* synthetic */ w(Object obj, int i10) {
        this.f7287a = i10;
        this.f7288b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f7287a) {
            case 0:
                j0 j0Var = (j0) this.f7288b;
                return i0.x1.b(Integer.valueOf(j0Var.c(((s0) obj2).getKey())), Integer.valueOf(j0Var.c(((s0) obj).getKey())));
            default:
                x0.h1 h1Var = (x0.h1) this.f7288b;
                return i0.x1.b((Comparable) h1Var.invoke(obj), (Comparable) h1Var.invoke(obj2));
        }
    }
}
