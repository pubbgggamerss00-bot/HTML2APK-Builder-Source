package b1;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class g<T> extends a<T> {

    /* renamed from: c, reason: collision with root package name */
    public final T[] f3495c;

    /* renamed from: d, reason: collision with root package name */
    public final k<T> f3496d;

    /* JADX WARN: Multi-variable type inference failed */
    public g(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        super(i10, i11);
        this.f3495c = objArr2;
        int i13 = (i11 - 1) & (-32);
        this.f3496d = new k<>(objArr, i10 > i13 ? i13 : i10, i13, i12);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        k<T> kVar = this.f3496d;
        if (kVar.hasNext()) {
            this.f3477a++;
            return kVar.next();
        }
        int i10 = this.f3477a;
        this.f3477a = i10 + 1;
        return this.f3495c[i10 - kVar.f3478b];
    }

    @Override // java.util.ListIterator
    public final T previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f3477a;
        k<T> kVar = this.f3496d;
        int i11 = kVar.f3478b;
        if (i10 <= i11) {
            this.f3477a = i10 - 1;
            return kVar.previous();
        }
        int i12 = i10 - 1;
        this.f3477a = i12;
        return this.f3495c[i12 - i11];
    }
}
