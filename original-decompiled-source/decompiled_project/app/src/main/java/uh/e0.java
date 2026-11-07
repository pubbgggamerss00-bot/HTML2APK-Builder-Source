package uh;

import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import ph.g1;
import uh.f0;

/* loaded from: classes2.dex */
public class e0<T extends f0 & Comparable<? super T>> {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f29730b = AtomicIntegerFieldUpdater.newUpdater(e0.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* renamed from: a, reason: collision with root package name */
    public T[] f29731a;

    public final void a(g1.c cVar) {
        cVar.c((g1.d) this);
        T[] tArr = this.f29731a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f29730b;
        if (tArr == null) {
            tArr = (T[]) new f0[4];
            this.f29731a = tArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= tArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(tArr, atomicIntegerFieldUpdater.get(this) * 2);
            kotlin.jvm.internal.r.d(objArrCopyOf, "copyOf(...)");
            tArr = (T[]) ((f0[]) objArrCopyOf);
            this.f29731a = tArr;
        }
        int i10 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i10 + 1);
        tArr[i10] = cVar;
        cVar.f21543b = i10;
        c(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final T b(int i10) {
        T[] tArr = this.f29731a;
        kotlin.jvm.internal.r.b(tArr);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f29730b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i10 < atomicIntegerFieldUpdater.get(this)) {
            d(i10, atomicIntegerFieldUpdater.get(this));
            int i11 = (i10 - 1) / 2;
            if (i10 > 0) {
                T t3 = tArr[i10];
                kotlin.jvm.internal.r.b(t3);
                T t10 = tArr[i11];
                kotlin.jvm.internal.r.b(t10);
                if (((Comparable) t3).compareTo(t10) < 0) {
                    d(i10, i11);
                    c(i11);
                } else {
                    while (true) {
                        int i12 = i10 * 2;
                        int i13 = i12 + 1;
                        if (i13 >= atomicIntegerFieldUpdater.get(this)) {
                            break;
                        }
                        T[] tArr2 = this.f29731a;
                        kotlin.jvm.internal.r.b(tArr2);
                        int i14 = i12 + 2;
                        if (i14 < atomicIntegerFieldUpdater.get(this)) {
                            T t11 = tArr2[i14];
                            kotlin.jvm.internal.r.b(t11);
                            T t12 = tArr2[i13];
                            kotlin.jvm.internal.r.b(t12);
                            if (((Comparable) t11).compareTo(t12) >= 0) {
                                i14 = i13;
                            }
                            T t13 = tArr2[i10];
                            kotlin.jvm.internal.r.b(t13);
                            T t14 = tArr2[i14];
                            kotlin.jvm.internal.r.b(t14);
                            if (((Comparable) t13).compareTo(t14) <= 0) {
                                break;
                            }
                            d(i10, i14);
                            i10 = i14;
                        }
                    }
                }
            }
        }
        T t15 = tArr[atomicIntegerFieldUpdater.get(this)];
        kotlin.jvm.internal.r.b(t15);
        t15.c(null);
        t15.setIndex(-1);
        tArr[atomicIntegerFieldUpdater.get(this)] = null;
        return t15;
    }

    public final void c(int i10) {
        while (i10 > 0) {
            T[] tArr = this.f29731a;
            kotlin.jvm.internal.r.b(tArr);
            int i11 = (i10 - 1) / 2;
            T t3 = tArr[i11];
            kotlin.jvm.internal.r.b(t3);
            T t10 = tArr[i10];
            kotlin.jvm.internal.r.b(t10);
            if (((Comparable) t3).compareTo(t10) <= 0) {
                return;
            }
            d(i10, i11);
            i10 = i11;
        }
    }

    public final void d(int i10, int i11) {
        T[] tArr = this.f29731a;
        kotlin.jvm.internal.r.b(tArr);
        T t3 = tArr[i11];
        kotlin.jvm.internal.r.b(t3);
        T t10 = tArr[i10];
        kotlin.jvm.internal.r.b(t10);
        tArr[i10] = t3;
        tArr[i11] = t10;
        t3.setIndex(i10);
        t10.setIndex(i11);
    }
}
