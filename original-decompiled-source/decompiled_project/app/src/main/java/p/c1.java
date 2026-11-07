package p;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class c1<E> implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f20582a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ int[] f20583b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f20584c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f20585d;

    public c1() {
        this(0);
    }

    public final void a(int i10, E e10) {
        int i11 = this.f20585d;
        if (i11 != 0 && i10 <= this.f20583b[i11 - 1]) {
            e(i10, e10);
            return;
        }
        if (this.f20582a && i11 >= this.f20583b.length) {
            d1.a(this);
        }
        int i12 = this.f20585d;
        if (i12 >= this.f20583b.length) {
            int i13 = (i12 + 1) * 4;
            int i14 = 4;
            while (true) {
                if (i14 >= 32) {
                    break;
                }
                int i15 = (1 << i14) - 12;
                if (i13 <= i15) {
                    i13 = i15;
                    break;
                }
                i14++;
            }
            int i16 = i13 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f20583b, i16);
            kotlin.jvm.internal.r.d(iArrCopyOf, "copyOf(...)");
            this.f20583b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f20584c, i16);
            kotlin.jvm.internal.r.d(objArrCopyOf, "copyOf(...)");
            this.f20584c = objArrCopyOf;
        }
        this.f20583b[i12] = i10;
        this.f20584c[i12] = e10;
        this.f20585d = i12 + 1;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final c1<E> clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        kotlin.jvm.internal.r.c(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        c1<E> c1Var = (c1) objClone;
        c1Var.f20583b = (int[]) this.f20583b.clone();
        c1Var.f20584c = (Object[]) this.f20584c.clone();
        return c1Var;
    }

    public final E c(int i10) {
        E e10;
        int iA = q.a.a(this.f20585d, i10, this.f20583b);
        if (iA < 0 || (e10 = (E) this.f20584c[iA]) == d1.f20602a) {
            return null;
        }
        return e10;
    }

    public final int d(int i10) {
        if (this.f20582a) {
            d1.a(this);
        }
        return this.f20583b[i10];
    }

    public final void e(int i10, E e10) {
        int iA = q.a.a(this.f20585d, i10, this.f20583b);
        if (iA >= 0) {
            this.f20584c[iA] = e10;
            return;
        }
        int i11 = ~iA;
        int i12 = this.f20585d;
        if (i11 < i12) {
            Object[] objArr = this.f20584c;
            if (objArr[i11] == d1.f20602a) {
                this.f20583b[i11] = i10;
                objArr[i11] = e10;
                return;
            }
        }
        if (this.f20582a && i12 >= this.f20583b.length) {
            d1.a(this);
            i11 = ~q.a.a(this.f20585d, i10, this.f20583b);
        }
        int i13 = this.f20585d;
        if (i13 >= this.f20583b.length) {
            int i14 = (i13 + 1) * 4;
            int i15 = 4;
            while (true) {
                if (i15 >= 32) {
                    break;
                }
                int i16 = (1 << i15) - 12;
                if (i14 <= i16) {
                    i14 = i16;
                    break;
                }
                i15++;
            }
            int i17 = i14 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f20583b, i17);
            kotlin.jvm.internal.r.d(iArrCopyOf, "copyOf(...)");
            this.f20583b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f20584c, i17);
            kotlin.jvm.internal.r.d(objArrCopyOf, "copyOf(...)");
            this.f20584c = objArrCopyOf;
        }
        int i18 = this.f20585d;
        if (i18 - i11 != 0) {
            int[] iArr = this.f20583b;
            int i19 = i11 + 1;
            qg.m.d(i19, iArr, i11, i18, iArr);
            Object[] objArr2 = this.f20584c;
            qg.m.g(objArr2, i19, objArr2, i11, this.f20585d);
        }
        this.f20583b[i11] = i10;
        this.f20584c[i11] = e10;
        this.f20585d++;
    }

    public final int f() {
        if (this.f20582a) {
            d1.a(this);
        }
        return this.f20585d;
    }

    public final E g(int i10) {
        if (this.f20582a) {
            d1.a(this);
        }
        Object[] objArr = this.f20584c;
        if (i10 < objArr.length) {
            return (E) objArr[i10];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final String toString() {
        if (f() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f20585d * 28);
        sb.append('{');
        int i10 = this.f20585d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb.append(", ");
            }
            sb.append(d(i11));
            sb.append('=');
            E eG = g(i11);
            if (eG != this) {
                sb.append(eG);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        kotlin.jvm.internal.r.d(string, "toString(...)");
        return string;
    }

    public c1(int i10) {
        int i11;
        int i12 = 4;
        while (true) {
            i11 = 40;
            if (i12 >= 32) {
                break;
            }
            int i13 = (1 << i12) - 12;
            if (40 <= i13) {
                i11 = i13;
                break;
            }
            i12++;
        }
        int i14 = i11 / 4;
        this.f20583b = new int[i14];
        this.f20584c = new Object[i14];
    }
}
