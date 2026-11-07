package x0;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class q3 implements i1.a, Iterable<Object>, fh.a {

    /* renamed from: a, reason: collision with root package name */
    public final a3 f31899a;

    /* renamed from: b, reason: collision with root package name */
    public final int f31900b;

    /* renamed from: c, reason: collision with root package name */
    public final s0 f31901c;

    /* renamed from: d, reason: collision with root package name */
    public final t2 f31902d;

    public q3(a3 a3Var, int i10, s0 s0Var, t2 t2Var) {
        this.f31899a = a3Var;
        this.f31900b = i10;
        this.f31901c = s0Var;
        this.f31902d = t2Var;
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        return new p3(this.f31899a, this.f31900b, this.f31901c, this.f31902d);
    }
}
