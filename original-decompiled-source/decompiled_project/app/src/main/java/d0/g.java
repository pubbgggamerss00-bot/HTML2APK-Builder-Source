package d0;

import d0.o;

/* loaded from: classes.dex */
public final class g<T> {

    /* renamed from: a, reason: collision with root package name */
    public final int f7131a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7132b;

    /* renamed from: c, reason: collision with root package name */
    public final o.a f7133c;

    public g(int i10, int i11, o.a aVar) {
        this.f7131a = i10;
        this.f7132b = i11;
        this.f7133c = aVar;
        if (i10 < 0) {
            y.c.a("startIndex should be >= 0");
        }
        if (i11 > 0) {
            return;
        }
        y.c.a("size should be > 0");
    }
}
