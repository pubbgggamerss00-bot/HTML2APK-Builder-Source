package w;

import java.util.Arrays;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class h<E> implements Cloneable {
    public /* synthetic */ int[] s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object[] f14851t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ int f14852u;

    public h() {
        int i6;
        int i7 = 4;
        while (true) {
            i6 = 40;
            if (i7 >= 32) {
                break;
            }
            int i8 = (1 << i7) - 12;
            if (40 <= i8) {
                i6 = i8;
                break;
            }
            i7++;
        }
        int i9 = i6 / 4;
        this.s = new int[i9];
        this.f14851t = new Object[i9];
    }

    public final void a(int i6, E e6) {
        int i7 = this.f14852u;
        if (i7 != 0 && i6 <= this.s[i7 - 1]) {
            c(i6, e6);
            return;
        }
        if (i7 >= this.s.length) {
            int i8 = (i7 + 1) * 4;
            int i9 = 4;
            while (true) {
                if (i9 >= 32) {
                    break;
                }
                int i10 = (1 << i9) - 12;
                if (i8 <= i10) {
                    i8 = i10;
                    break;
                }
                i9++;
            }
            int i11 = i8 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.s, i11);
            j.d("copyOf(this, newSize)", iArrCopyOf);
            this.s = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f14851t, i11);
            j.d("copyOf(this, newSize)", objArrCopyOf);
            this.f14851t = objArrCopyOf;
        }
        this.s[i7] = i6;
        this.f14851t[i7] = e6;
        this.f14852u = i7 + 1;
    }

    public final E b(int i6) {
        E e6;
        int iA = x.a.a(this.f14852u, i6, this.s);
        if (iA < 0 || (e6 = (E) this.f14851t[iA]) == i.f14853a) {
            return null;
        }
        return e6;
    }

    public final void c(int i6, E e6) {
        int iA = x.a.a(this.f14852u, i6, this.s);
        if (iA >= 0) {
            this.f14851t[iA] = e6;
            return;
        }
        int i7 = ~iA;
        int i8 = this.f14852u;
        if (i7 < i8) {
            Object[] objArr = this.f14851t;
            if (objArr[i7] == i.f14853a) {
                this.s[i7] = i6;
                objArr[i7] = e6;
                return;
            }
        }
        if (i8 >= this.s.length) {
            int i9 = (i8 + 1) * 4;
            int i10 = 4;
            while (true) {
                if (i10 >= 32) {
                    break;
                }
                int i11 = (1 << i10) - 12;
                if (i9 <= i11) {
                    i9 = i11;
                    break;
                }
                i10++;
            }
            int i12 = i9 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.s, i12);
            j.d("copyOf(this, newSize)", iArrCopyOf);
            this.s = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f14851t, i12);
            j.d("copyOf(this, newSize)", objArrCopyOf);
            this.f14851t = objArrCopyOf;
        }
        int i13 = this.f14852u;
        if (i13 - i7 != 0) {
            int[] iArr = this.s;
            int i14 = i7 + 1;
            e5.i.d(i14, i7, iArr, iArr, i13);
            Object[] objArr2 = this.f14851t;
            e5.i.c(i14, i7, this.f14852u, objArr2, objArr2);
        }
        this.s[i7] = i6;
        this.f14851t[i7] = e6;
        this.f14852u++;
    }

    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        j.c("null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>", objClone);
        h hVar = (h) objClone;
        hVar.s = (int[]) this.s.clone();
        hVar.f14851t = (Object[]) this.f14851t.clone();
        return hVar;
    }

    public final String toString() {
        int i6 = this.f14852u;
        if (i6 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i6 * 28);
        sb.append('{');
        int i7 = this.f14852u;
        for (int i8 = 0; i8 < i7; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            sb.append(this.s[i8]);
            sb.append('=');
            Object obj = this.f14851t[i8];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        j.d("buffer.toString()", string);
        return string;
    }
}
