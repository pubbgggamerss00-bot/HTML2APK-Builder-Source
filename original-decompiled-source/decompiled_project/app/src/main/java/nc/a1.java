package nc;

import nc.r;

/* loaded from: classes2.dex */
public final class a1<E> extends v<E> {

    /* renamed from: d, reason: collision with root package name */
    public final transient E f18659d;

    /* renamed from: e, reason: collision with root package name */
    public transient int f18660e;

    public a1(E e10) {
        e10.getClass();
        this.f18659d = e10;
    }

    @Override // nc.p
    public final int b(Object[] objArr) {
        objArr[0] = this.f18659d;
        return 1;
    }

    @Override // nc.p, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f18659d.equals(obj);
    }

    @Override // nc.p
    public final boolean f() {
        return false;
    }

    @Override // nc.p, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: g */
    public final e1<E> iterator() {
        return new i0(this.f18659d);
    }

    @Override // nc.v, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i10 = this.f18660e;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = this.f18659d.hashCode();
        this.f18660e = iHashCode;
        return iHashCode;
    }

    @Override // nc.v
    public final r<E> m() {
        r.a aVar = r.f18735b;
        Object[] objArr = {this.f18659d};
        h1.m.c(1, objArr);
        return r.i(1, objArr);
    }

    @Override // nc.v
    public final boolean n() {
        return this.f18660e != 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f18659d.toString() + ']';
    }

    public a1(E e10, int i10) {
        this.f18659d = e10;
        this.f18660e = i10;
    }
}
