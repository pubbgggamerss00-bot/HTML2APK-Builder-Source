package x0;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class r0 implements Iterator<Object>, fh.a {

    /* renamed from: a, reason: collision with root package name */
    public final a3 f31903a;

    /* renamed from: b, reason: collision with root package name */
    public final int f31904b;

    /* renamed from: c, reason: collision with root package name */
    public int f31905c;

    /* renamed from: d, reason: collision with root package name */
    public final int f31906d;

    public r0(a3 a3Var, int i10, int i11) {
        this.f31903a = a3Var;
        this.f31904b = i11;
        this.f31905c = i10;
        this.f31906d = a3Var.f31616h;
        if (a3Var.f31615g) {
            c3.f();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f31905c < this.f31904b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        a3 a3Var = this.f31903a;
        int i10 = a3Var.f31616h;
        int i11 = this.f31906d;
        if (i10 != i11) {
            c3.f();
        }
        int i12 = this.f31905c;
        this.f31905c = c3.a(a3Var.f31609a, i12) + i12;
        return new b3(a3Var, i12, i11);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
