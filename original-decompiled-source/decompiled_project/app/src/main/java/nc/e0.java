package nc;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class e0 extends e1<Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f18674a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object[] f18675b;

    public e0(Object[] objArr) {
        this.f18675b = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18674a < this.f18675b.length;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f18674a;
        Object[] objArr = this.f18675b;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f18674a = i10 + 1;
        return obj;
    }
}
