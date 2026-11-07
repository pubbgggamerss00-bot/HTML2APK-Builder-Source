package d0;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class x<T> implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j0 f7295a;

    public x(j0 j0Var) {
        this.f7295a = j0Var;
    }

    @Override // java.util.Comparator
    public final int compare(T t3, T t10) {
        Object key = ((s0) t10).getKey();
        j0 j0Var = this.f7295a;
        return i0.x1.b(Integer.valueOf(j0Var.c(key)), Integer.valueOf(j0Var.c(((s0) t3).getKey())));
    }
}
