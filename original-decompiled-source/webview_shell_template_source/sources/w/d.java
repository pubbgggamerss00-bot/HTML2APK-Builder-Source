package w;

import java.util.Arrays;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d<E> implements Cloneable {
    public /* synthetic */ boolean s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ long[] f14839t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object[] f14840u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ int f14841v;

    public d() {
        int i6;
        int i7 = 4;
        while (true) {
            i6 = 80;
            if (i7 >= 32) {
                break;
            }
            int i8 = (1 << i7) - 12;
            if (80 <= i8) {
                i6 = i8;
                break;
            }
            i7++;
        }
        int i9 = i6 / 8;
        this.f14839t = new long[i9];
        this.f14840u = new Object[i9];
    }

    public final void a() {
        int i6 = this.f14841v;
        Object[] objArr = this.f14840u;
        for (int i7 = 0; i7 < i6; i7++) {
            objArr[i7] = null;
        }
        this.f14841v = 0;
        this.s = false;
    }

    public final E b(long j6) {
        E e6;
        int iB = x.a.b(this.f14839t, this.f14841v, j6);
        if (iB < 0 || (e6 = (E) this.f14840u[iB]) == e.f14842a) {
            return null;
        }
        return e6;
    }

    public final long c(int i6) {
        int i7;
        if (i6 < 0 || i6 >= (i7 = this.f14841v)) {
            throw new IllegalArgumentException(androidx.camera.camera2.internal.compat.workaround.c.d(i6, "Expected index to be within 0..size()-1, but was ").toString());
        }
        if (this.s) {
            long[] jArr = this.f14839t;
            Object[] objArr = this.f14840u;
            int i8 = 0;
            for (int i9 = 0; i9 < i7; i9++) {
                Object obj = objArr[i9];
                if (obj != e.f14842a) {
                    if (i9 != i8) {
                        jArr[i8] = jArr[i9];
                        objArr[i8] = obj;
                        objArr[i9] = null;
                    }
                    i8++;
                }
            }
            this.s = false;
            this.f14841v = i8;
        }
        return this.f14839t[i6];
    }

    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        j.c("null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>", objClone);
        d dVar = (d) objClone;
        dVar.f14839t = (long[]) this.f14839t.clone();
        dVar.f14840u = (Object[]) this.f14840u.clone();
        return dVar;
    }

    public final void d(long j6, E e6) {
        int iB = x.a.b(this.f14839t, this.f14841v, j6);
        if (iB >= 0) {
            this.f14840u[iB] = e6;
            return;
        }
        int i6 = ~iB;
        int i7 = this.f14841v;
        Object obj = e.f14842a;
        if (i6 < i7) {
            Object[] objArr = this.f14840u;
            if (objArr[i6] == obj) {
                this.f14839t[i6] = j6;
                objArr[i6] = e6;
                return;
            }
        }
        if (this.s) {
            long[] jArr = this.f14839t;
            if (i7 >= jArr.length) {
                Object[] objArr2 = this.f14840u;
                int i8 = 0;
                for (int i9 = 0; i9 < i7; i9++) {
                    Object obj2 = objArr2[i9];
                    if (obj2 != obj) {
                        if (i9 != i8) {
                            jArr[i8] = jArr[i9];
                            objArr2[i8] = obj2;
                            objArr2[i9] = null;
                        }
                        i8++;
                    }
                }
                this.s = false;
                this.f14841v = i8;
                i6 = ~x.a.b(this.f14839t, i8, j6);
            }
        }
        int i10 = this.f14841v;
        if (i10 >= this.f14839t.length) {
            int i11 = (i10 + 1) * 8;
            int i12 = 4;
            while (true) {
                if (i12 >= 32) {
                    break;
                }
                int i13 = (1 << i12) - 12;
                if (i11 <= i13) {
                    i11 = i13;
                    break;
                }
                i12++;
            }
            int i14 = i11 / 8;
            long[] jArrCopyOf = Arrays.copyOf(this.f14839t, i14);
            j.d("copyOf(this, newSize)", jArrCopyOf);
            this.f14839t = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f14840u, i14);
            j.d("copyOf(this, newSize)", objArrCopyOf);
            this.f14840u = objArrCopyOf;
        }
        int i15 = this.f14841v - i6;
        if (i15 != 0) {
            long[] jArr2 = this.f14839t;
            int i16 = i6 + 1;
            j.e("<this>", jArr2);
            System.arraycopy(jArr2, i6, jArr2, i16, i15);
            Object[] objArr3 = this.f14840u;
            e5.i.c(i16, i6, this.f14841v, objArr3, objArr3);
        }
        this.f14839t[i6] = j6;
        this.f14840u[i6] = e6;
        this.f14841v++;
    }

    public final int e() {
        if (this.s) {
            int i6 = this.f14841v;
            long[] jArr = this.f14839t;
            Object[] objArr = this.f14840u;
            int i7 = 0;
            for (int i8 = 0; i8 < i6; i8++) {
                Object obj = objArr[i8];
                if (obj != e.f14842a) {
                    if (i8 != i7) {
                        jArr[i7] = jArr[i8];
                        objArr[i7] = obj;
                        objArr[i8] = null;
                    }
                    i7++;
                }
            }
            this.s = false;
            this.f14841v = i7;
        }
        return this.f14841v;
    }

    public final E f(int i6) {
        int i7;
        if (i6 < 0 || i6 >= (i7 = this.f14841v)) {
            throw new IllegalArgumentException(androidx.camera.camera2.internal.compat.workaround.c.d(i6, "Expected index to be within 0..size()-1, but was ").toString());
        }
        if (this.s) {
            long[] jArr = this.f14839t;
            Object[] objArr = this.f14840u;
            int i8 = 0;
            for (int i9 = 0; i9 < i7; i9++) {
                Object obj = objArr[i9];
                if (obj != e.f14842a) {
                    if (i9 != i8) {
                        jArr[i8] = jArr[i9];
                        objArr[i8] = obj;
                        objArr[i9] = null;
                    }
                    i8++;
                }
            }
            this.s = false;
            this.f14841v = i8;
        }
        return (E) this.f14840u[i6];
    }

    public final String toString() {
        if (e() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f14841v * 28);
        sb.append('{');
        int i6 = this.f14841v;
        for (int i7 = 0; i7 < i6; i7++) {
            if (i7 > 0) {
                sb.append(", ");
            }
            sb.append(c(i7));
            sb.append('=');
            E eF = f(i7);
            if (eF != sb) {
                sb.append(eF);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        j.d("StringBuilder(capacity).…builderAction).toString()", string);
        return string;
    }
}
