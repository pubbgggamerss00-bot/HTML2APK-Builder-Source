package h1;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class c0<T> implements ListIterator<T>, fh.a {

    /* renamed from: a, reason: collision with root package name */
    public final u<T> f12102a;

    /* renamed from: b, reason: collision with root package name */
    public int f12103b;

    /* renamed from: c, reason: collision with root package name */
    public int f12104c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f12105d;

    public c0(u<T> uVar, int i10) {
        this.f12102a = uVar;
        this.f12103b = i10 - 1;
        this.f12105d = uVar.g();
    }

    @Override // java.util.ListIterator
    public final void add(T t3) {
        c();
        int i10 = this.f12103b + 1;
        u<T> uVar = this.f12102a;
        uVar.add(i10, t3);
        this.f12104c = -1;
        this.f12103b++;
        this.f12105d = uVar.g();
    }

    public final void c() {
        if (this.f12102a.g() != this.f12105d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f12103b < this.f12102a.size() - 1;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f12103b >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        c();
        int i10 = this.f12103b + 1;
        this.f12104c = i10;
        u<T> uVar = this.f12102a;
        v.a(i10, uVar.size());
        T t3 = uVar.get(i10);
        this.f12103b = i10;
        return t3;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f12103b + 1;
    }

    @Override // java.util.ListIterator
    public final T previous() {
        c();
        int i10 = this.f12103b;
        u<T> uVar = this.f12102a;
        v.a(i10, uVar.size());
        int i11 = this.f12103b;
        this.f12104c = i11;
        this.f12103b--;
        return uVar.get(i11);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f12103b;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        c();
        int i10 = this.f12103b;
        u<T> uVar = this.f12102a;
        uVar.remove(i10);
        this.f12103b--;
        this.f12104c = -1;
        this.f12105d = uVar.g();
    }

    @Override // java.util.ListIterator
    public final void set(T t3) {
        c();
        int i10 = this.f12104c;
        if (i10 < 0) {
            throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
        }
        u<T> uVar = this.f12102a;
        uVar.set(i10, t3);
        this.f12105d = uVar.g();
    }
}
