package b1;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class h<T> extends a<T> {

    /* renamed from: c, reason: collision with root package name */
    public final f<T> f3497c;

    /* renamed from: d, reason: collision with root package name */
    public int f3498d;

    /* renamed from: e, reason: collision with root package name */
    public k<? extends T> f3499e;

    /* renamed from: f, reason: collision with root package name */
    public int f3500f;

    public h(f<T> fVar, int i10) {
        super(i10, fVar.f3493h);
        this.f3497c = fVar;
        this.f3498d = fVar.i();
        this.f3500f = -1;
        e();
    }

    @Override // b1.a, java.util.ListIterator
    public final void add(T t3) {
        c();
        int i10 = this.f3477a;
        f<T> fVar = this.f3497c;
        fVar.add(i10, t3);
        this.f3477a++;
        this.f3478b = fVar.c();
        this.f3498d = fVar.i();
        this.f3500f = -1;
        e();
    }

    public final void c() {
        if (this.f3498d != this.f3497c.i()) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void e() {
        f<T> fVar = this.f3497c;
        Object[] objArr = fVar.f3491f;
        if (objArr == null) {
            this.f3499e = null;
            return;
        }
        int i10 = (fVar.f3493h - 1) & (-32);
        int i11 = this.f3477a;
        if (i11 > i10) {
            i11 = i10;
        }
        int i12 = (fVar.f3489d / 5) + 1;
        k<? extends T> kVar = this.f3499e;
        if (kVar == null) {
            this.f3499e = new k<>(objArr, i11, i10, i12);
            return;
        }
        kVar.f3477a = i11;
        kVar.f3478b = i10;
        kVar.f3504c = i12;
        if (kVar.f3505d.length < i12) {
            kVar.f3505d = new Object[i12];
        }
        kVar.f3505d[0] = objArr;
        ?? r62 = i11 == i10 ? 1 : 0;
        kVar.f3506e = r62;
        kVar.e(i11 - r62, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        c();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f3477a;
        this.f3500f = i10;
        k<? extends T> kVar = this.f3499e;
        f<T> fVar = this.f3497c;
        if (kVar == null) {
            Object[] objArr = fVar.f3492g;
            this.f3477a = i10 + 1;
            return (T) objArr[i10];
        }
        if (kVar.hasNext()) {
            this.f3477a++;
            return kVar.next();
        }
        Object[] objArr2 = fVar.f3492g;
        int i11 = this.f3477a;
        this.f3477a = i11 + 1;
        return (T) objArr2[i11 - kVar.f3478b];
    }

    @Override // java.util.ListIterator
    public final T previous() {
        c();
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f3477a;
        this.f3500f = i10 - 1;
        k<? extends T> kVar = this.f3499e;
        f<T> fVar = this.f3497c;
        if (kVar == null) {
            Object[] objArr = fVar.f3492g;
            int i11 = i10 - 1;
            this.f3477a = i11;
            return (T) objArr[i11];
        }
        int i12 = kVar.f3478b;
        if (i10 <= i12) {
            this.f3477a = i10 - 1;
            return kVar.previous();
        }
        Object[] objArr2 = fVar.f3492g;
        int i13 = i10 - 1;
        this.f3477a = i13;
        return (T) objArr2[i13 - i12];
    }

    @Override // b1.a, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        c();
        int i10 = this.f3500f;
        if (i10 == -1) {
            throw new IllegalStateException();
        }
        f<T> fVar = this.f3497c;
        fVar.e(i10);
        int i11 = this.f3500f;
        if (i11 < this.f3477a) {
            this.f3477a = i11;
        }
        this.f3478b = fVar.c();
        this.f3498d = fVar.i();
        this.f3500f = -1;
        e();
    }

    @Override // b1.a, java.util.ListIterator
    public final void set(T t3) {
        c();
        int i10 = this.f3500f;
        if (i10 == -1) {
            throw new IllegalStateException();
        }
        f<T> fVar = this.f3497c;
        fVar.set(i10, t3);
        this.f3498d = fVar.i();
        e();
    }
}
