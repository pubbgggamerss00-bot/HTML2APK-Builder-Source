package d0;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class u<T> implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j0 f7279a;

    public u(j0 j0Var) {
        this.f7279a = j0Var;
    }

    @Override // java.util.Comparator
    public final int compare(T t3, T t10) {
        Object key = ((s0) t3).getKey();
        j0 j0Var = this.f7279a;
        return i0.x1.b(Integer.valueOf(j0Var.c(key)), Integer.valueOf(j0Var.c(((s0) t10).getKey())));
    }
}
