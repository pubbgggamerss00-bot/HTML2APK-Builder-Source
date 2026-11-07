package b6;

import b6.z;
import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import y5.m0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class y<T extends z & Comparable<? super T>> {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f2055b = AtomicIntegerFieldUpdater.newUpdater(y.class, "_size");
    private volatile int _size;

    /* renamed from: a, reason: collision with root package name */
    public T[] f2056a;

    public final void a(m0.a aVar) {
        aVar.a((m0.b) this);
        T[] tArr = this.f2056a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f2055b;
        if (tArr == null) {
            tArr = (T[]) new z[4];
            this.f2056a = tArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= tArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(tArr, atomicIntegerFieldUpdater.get(this) * 2);
            kotlin.jvm.internal.j.d("copyOf(this, newSize)", objArrCopyOf);
            tArr = (T[]) ((z[]) objArrCopyOf);
            this.f2056a = tArr;
        }
        int i6 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i6 + 1);
        tArr[i6] = aVar;
        aVar.f15366t = i6;
        c(i6);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final T b(int i6) {
        T[] tArr = this.f2056a;
        kotlin.jvm.internal.j.b(tArr);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f2055b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i6 < atomicIntegerFieldUpdater.get(this)) {
            d(i6, atomicIntegerFieldUpdater.get(this));
            int i7 = (i6 - 1) / 2;
            if (i6 > 0) {
                T t6 = tArr[i6];
                kotlin.jvm.internal.j.b(t6);
                T t7 = tArr[i7];
                kotlin.jvm.internal.j.b(t7);
                if (((Comparable) t6).compareTo(t7) < 0) {
                    d(i6, i7);
                    c(i7);
                } else {
                    while (true) {
                        int i8 = i6 * 2;
                        int i9 = i8 + 1;
                        if (i9 >= atomicIntegerFieldUpdater.get(this)) {
                            break;
                        }
                        T[] tArr2 = this.f2056a;
                        kotlin.jvm.internal.j.b(tArr2);
                        int i10 = i8 + 2;
                        if (i10 < atomicIntegerFieldUpdater.get(this)) {
                            T t8 = tArr2[i10];
                            kotlin.jvm.internal.j.b(t8);
                            T t9 = tArr2[i9];
                            kotlin.jvm.internal.j.b(t9);
                            if (((Comparable) t8).compareTo(t9) >= 0) {
                                i10 = i9;
                            }
                            T t10 = tArr2[i6];
                            kotlin.jvm.internal.j.b(t10);
                            T t11 = tArr2[i10];
                            kotlin.jvm.internal.j.b(t11);
                            if (((Comparable) t10).compareTo(t11) <= 0) {
                                break;
                            }
                            d(i6, i10);
                            i6 = i10;
                        }
                    }
                }
            }
        }
        T t12 = tArr[atomicIntegerFieldUpdater.get(this)];
        kotlin.jvm.internal.j.b(t12);
        t12.a(null);
        t12.setIndex(-1);
        tArr[atomicIntegerFieldUpdater.get(this)] = null;
        return t12;
    }

    public final void c(int i6) {
        while (i6 > 0) {
            T[] tArr = this.f2056a;
            kotlin.jvm.internal.j.b(tArr);
            int i7 = (i6 - 1) / 2;
            T t6 = tArr[i7];
            kotlin.jvm.internal.j.b(t6);
            T t7 = tArr[i6];
            kotlin.jvm.internal.j.b(t7);
            if (((Comparable) t6).compareTo(t7) <= 0) {
                return;
            }
            d(i6, i7);
            i6 = i7;
        }
    }

    public final void d(int i6, int i7) {
        T[] tArr = this.f2056a;
        kotlin.jvm.internal.j.b(tArr);
        T t6 = tArr[i7];
        kotlin.jvm.internal.j.b(t6);
        T t7 = tArr[i6];
        kotlin.jvm.internal.j.b(t7);
        tArr[i6] = t6;
        tArr[i7] = t7;
        t6.setIndex(i6);
        t7.setIndex(i7);
    }
}
