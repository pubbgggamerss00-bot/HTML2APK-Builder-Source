package b1;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class k<E> extends a<E> {

    /* renamed from: c, reason: collision with root package name */
    public int f3504c;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f3505d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3506e;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public k(Object[] objArr, int i10, int i11, int i12) {
        super(i10, i11);
        this.f3504c = i12;
        Object[] objArr2 = new Object[i12];
        this.f3505d = objArr2;
        ?? r52 = i10 == i11 ? 1 : 0;
        this.f3506e = r52;
        objArr2[0] = objArr;
        e(i10 - r52, 1);
    }

    public final E c() {
        int i10 = this.f3477a & 31;
        Object obj = this.f3505d[this.f3504c - 1];
        r.c(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return (E) ((Object[]) obj)[i10];
    }

    public final void e(int i10, int i11) {
        int i12 = (this.f3504c - i11) * 5;
        while (i11 < this.f3504c) {
            Object[] objArr = this.f3505d;
            Object obj = objArr[i11 - 1];
            r.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i11] = ((Object[]) obj)[l.a(i10, i12)];
            i12 -= 5;
            i11++;
        }
    }

    public final void f(int i10) {
        int i11 = 0;
        while (l.a(this.f3477a, i11) == i10) {
            i11 += 5;
        }
        if (i11 > 0) {
            e(this.f3477a, ((this.f3504c - 1) - (i11 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        E eC = c();
        int i10 = this.f3477a + 1;
        this.f3477a = i10;
        if (i10 == this.f3478b) {
            this.f3506e = true;
            return eC;
        }
        f(0);
        return eC;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.f3477a--;
        if (this.f3506e) {
            this.f3506e = false;
            return c();
        }
        f(31);
        return c();
    }
}
