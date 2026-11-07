package s5;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p.c1;
import p.d1;
import p5.k0;

/* loaded from: classes.dex */
public final class p implements Iterator<k0>, fh.a {

    /* renamed from: a, reason: collision with root package name */
    public int f24514a = -1;

    /* renamed from: b, reason: collision with root package name */
    public boolean f24515b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f24516c;

    public p(q qVar) {
        this.f24516c = qVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f24514a + 1 < this.f24516c.f24518b.f();
    }

    @Override // java.util.Iterator
    public final k0 next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f24515b = true;
        c1<k0> c1Var = this.f24516c.f24518b;
        int i10 = this.f24514a + 1;
        this.f24514a = i10;
        return c1Var.g(i10);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f24515b) {
            throw new IllegalStateException("You must call next() before you can remove an element");
        }
        c1<k0> c1Var = this.f24516c.f24518b;
        c1Var.g(this.f24514a).f21236c = null;
        int i10 = this.f24514a;
        Object[] objArr = c1Var.f20584c;
        Object obj = objArr[i10];
        Object obj2 = d1.f20602a;
        if (obj != obj2) {
            objArr[i10] = obj2;
            c1Var.f20582a = true;
        }
        this.f24514a = i10 - 1;
        this.f24515b = false;
    }
}
