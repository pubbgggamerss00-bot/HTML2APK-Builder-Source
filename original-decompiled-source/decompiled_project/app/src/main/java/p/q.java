package p;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class q<E> implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f20702a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ long[] f20703b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f20704c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f20705d;

    public q() {
        this((Object) null);
    }

    public final void a() {
        int i10 = this.f20705d;
        Object[] objArr = this.f20704c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f20705d = 0;
        this.f20702a = false;
    }

    public final E b(long j10) {
        E e10;
        int iB = q.a.b(this.f20703b, this.f20705d, j10);
        if (iB < 0 || (e10 = (E) this.f20704c[iB]) == r.f20709a) {
            return null;
        }
        return e10;
    }

    public final long c(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f20705d)) {
            q.d.a("Expected index to be within 0..size()-1, but was " + i10);
            throw null;
        }
        if (this.f20702a) {
            long[] jArr = this.f20703b;
            Object[] objArr = this.f20704c;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != r.f20709a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f20702a = false;
            this.f20705d = i12;
        }
        return this.f20703b[i10];
    }

    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        kotlin.jvm.internal.r.c(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        q qVar = (q) objClone;
        qVar.f20703b = (long[]) this.f20703b.clone();
        qVar.f20704c = (Object[]) this.f20704c.clone();
        return qVar;
    }

    public final void d(Object obj, long j10) {
        int iB = q.a.b(this.f20703b, this.f20705d, j10);
        if (iB >= 0) {
            this.f20704c[iB] = obj;
            return;
        }
        int i10 = ~iB;
        int i11 = this.f20705d;
        Object obj2 = r.f20709a;
        if (i10 < i11) {
            Object[] objArr = this.f20704c;
            if (objArr[i10] == obj2) {
                this.f20703b[i10] = j10;
                objArr[i10] = obj;
                return;
            }
        }
        if (this.f20702a) {
            long[] jArr = this.f20703b;
            if (i11 >= jArr.length) {
                Object[] objArr2 = this.f20704c;
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    Object obj3 = objArr2[i13];
                    if (obj3 != obj2) {
                        if (i13 != i12) {
                            jArr[i12] = jArr[i13];
                            objArr2[i12] = obj3;
                            objArr2[i13] = null;
                        }
                        i12++;
                    }
                }
                this.f20702a = false;
                this.f20705d = i12;
                i10 = ~q.a.b(this.f20703b, i12, j10);
            }
        }
        int i14 = this.f20705d;
        if (i14 >= this.f20703b.length) {
            int i15 = (i14 + 1) * 8;
            int i16 = 4;
            while (true) {
                if (i16 >= 32) {
                    break;
                }
                int i17 = (1 << i16) - 12;
                if (i15 <= i17) {
                    i15 = i17;
                    break;
                }
                i16++;
            }
            int i18 = i15 / 8;
            long[] jArrCopyOf = Arrays.copyOf(this.f20703b, i18);
            kotlin.jvm.internal.r.d(jArrCopyOf, "copyOf(...)");
            this.f20703b = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f20704c, i18);
            kotlin.jvm.internal.r.d(objArrCopyOf, "copyOf(...)");
            this.f20704c = objArrCopyOf;
        }
        int i19 = this.f20705d;
        if (i19 - i10 != 0) {
            long[] jArr2 = this.f20703b;
            int i20 = i10 + 1;
            qg.m.e(i20, jArr2, i10, jArr2, i19);
            Object[] objArr3 = this.f20704c;
            qg.m.g(objArr3, i20, objArr3, i10, this.f20705d);
        }
        this.f20703b[i10] = j10;
        this.f20704c[i10] = obj;
        this.f20705d++;
    }

    public final void e(long j10) {
        int iB = q.a.b(this.f20703b, this.f20705d, j10);
        if (iB >= 0) {
            Object[] objArr = this.f20704c;
            Object obj = objArr[iB];
            Object obj2 = r.f20709a;
            if (obj != obj2) {
                objArr[iB] = obj2;
                this.f20702a = true;
            }
        }
    }

    public final int f() {
        if (this.f20702a) {
            int i10 = this.f20705d;
            long[] jArr = this.f20703b;
            Object[] objArr = this.f20704c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != r.f20709a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f20702a = false;
            this.f20705d = i11;
        }
        return this.f20705d;
    }

    public final E g(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f20705d)) {
            q.d.a("Expected index to be within 0..size()-1, but was " + i10);
            throw null;
        }
        if (this.f20702a) {
            long[] jArr = this.f20703b;
            Object[] objArr = this.f20704c;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != r.f20709a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f20702a = false;
            this.f20705d = i12;
        }
        return (E) this.f20704c[i10];
    }

    public final String toString() {
        if (f() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f20705d * 28);
        sb.append('{');
        int i10 = this.f20705d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb.append(", ");
            }
            sb.append(c(i11));
            sb.append('=');
            E eG = g(i11);
            if (eG != sb) {
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

    public q(int i10) {
        if (i10 == 0) {
            this.f20703b = q.a.f21638b;
            this.f20704c = q.a.f21639c;
            return;
        }
        int i11 = i10 * 8;
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
        this.f20703b = new long[i14];
        this.f20704c = new Object[i14];
    }

    public /* synthetic */ q(Object obj) {
        this(10);
    }
}
