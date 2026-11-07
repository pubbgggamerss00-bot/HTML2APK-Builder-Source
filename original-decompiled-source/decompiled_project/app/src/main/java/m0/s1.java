package m0;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class s1<T> implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p.a0 f17507a;

    public s1(p.a0 a0Var) {
        this.f17507a = a0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t3, T t10) {
        long jLongValue = ((Number) t3).longValue();
        p.a0 a0Var = this.f17507a;
        return i0.x1.b(Integer.valueOf(a0Var.c(jLongValue)), Integer.valueOf(a0Var.c(((Number) t10).longValue())));
    }
}
