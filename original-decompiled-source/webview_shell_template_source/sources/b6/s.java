package b6;

import c6.a;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class s<T> {
    private volatile AtomicReferenceArray<T> array;

    public s(int i6) {
        this.array = new AtomicReferenceArray<>(i6);
    }

    public final int a() {
        return this.array.length();
    }

    public final T b(int i6) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        if (i6 < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i6);
        }
        return null;
    }

    public final void c(int i6, a.C0029a c0029a) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i6 < length) {
            atomicReferenceArray.set(i6, c0029a);
            return;
        }
        int i7 = i6 + 1;
        int i8 = length * 2;
        if (i7 < i8) {
            i7 = i8;
        }
        AtomicReferenceArray<T> atomicReferenceArray2 = new AtomicReferenceArray<>(i7);
        for (int i9 = 0; i9 < length; i9++) {
            atomicReferenceArray2.set(i9, atomicReferenceArray.get(i9));
        }
        atomicReferenceArray2.set(i6, c0029a);
        this.array = atomicReferenceArray2;
    }
}
