package ve;

import java.util.Comparator;

/* loaded from: classes2.dex */
public final class e0 implements Comparator<int[]> {
    @Override // java.util.Comparator
    public final int compare(int[] iArr, int[] iArr2) {
        int i10 = iArr[0];
        int i11 = iArr2[0];
        if (i10 < i11) {
            return -1;
        }
        return i10 == i11 ? 0 : 1;
    }
}
