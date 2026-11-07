package qg;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class m0<T> extends c<T> implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f22733a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22734b;

    /* renamed from: c, reason: collision with root package name */
    public int f22735c;

    /* renamed from: d, reason: collision with root package name */
    public int f22736d;

    public static final class a extends b<T> {

        /* renamed from: c, reason: collision with root package name */
        public int f22737c;

        /* renamed from: d, reason: collision with root package name */
        public int f22738d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ m0<T> f22739e;

        public a(m0<T> m0Var) {
            this.f22739e = m0Var;
            this.f22737c = m0Var.f22736d;
            this.f22738d = m0Var.f22735c;
        }

        @Override // qg.b
        public final void c() {
            int i10 = this.f22737c;
            if (i10 == 0) {
                this.f22709a = 2;
                return;
            }
            m0<T> m0Var = this.f22739e;
            Object[] objArr = m0Var.f22733a;
            int i11 = this.f22738d;
            this.f22710b = (T) objArr[i11];
            this.f22709a = 1;
            this.f22738d = (i11 + 1) % m0Var.f22734b;
            this.f22737c = i10 - 1;
        }
    }

    public m0(Object[] objArr, int i10) {
        this.f22733a = objArr;
        if (i10 < 0) {
            throw new IllegalArgumentException(j2.y.a(i10, "ring buffer filled size should not be negative but it is ").toString());
        }
        if (i10 <= objArr.length) {
            this.f22734b = objArr.length;
            this.f22736d = i10;
        } else {
            StringBuilder sbB = p.i0.b(i10, "ring buffer filled size: ", " cannot be larger than the buffer size: ");
            sbB.append(objArr.length);
            throw new IllegalArgumentException(sbB.toString().toString());
        }
    }

    @Override // qg.a
    public final int c() {
        return this.f22736d;
    }

    public final void e() {
        if (20 > this.f22736d) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = 20, size = " + this.f22736d).toString());
        }
        int i10 = this.f22735c;
        int i11 = this.f22734b;
        int i12 = (i10 + 20) % i11;
        Object[] objArr = this.f22733a;
        if (i10 > i12) {
            Arrays.fill(objArr, i10, i11, (Object) null);
            Arrays.fill(objArr, 0, i12, (Object) null);
        } else {
            Arrays.fill(objArr, i10, i12, (Object) null);
        }
        this.f22735c = i12;
        this.f22736d -= 20;
    }

    @Override // java.util.List
    public final T get(int i10) {
        int iC = c();
        if (i10 < 0 || i10 >= iC) {
            throw new IndexOutOfBoundsException(e1.c.a(i10, iC, "index: ", ", size: "));
        }
        return (T) this.f22733a[(this.f22735c + i10) % this.f22734b];
    }

    @Override // qg.c, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<T> iterator() {
        return new a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qg.a, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[c()]);
    }

    @Override // qg.a, java.util.Collection
    public final <T> T[] toArray(T[] array) {
        Object[] objArr;
        kotlin.jvm.internal.r.e(array, "array");
        int length = array.length;
        int i10 = this.f22736d;
        if (length < i10) {
            array = (T[]) Arrays.copyOf(array, i10);
            kotlin.jvm.internal.r.d(array, "copyOf(...)");
        }
        int i11 = this.f22736d;
        int i12 = this.f22735c;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            objArr = this.f22733a;
            if (i14 >= i11 || i12 >= this.f22734b) {
                break;
            }
            array[i14] = objArr[i12];
            i14++;
            i12++;
        }
        while (i14 < i11) {
            array[i14] = objArr[i13];
            i14++;
            i13++;
        }
        if (i11 < array.length) {
            array[i11] = null;
        }
        return array;
    }
}
