package ve;

import java.util.Comparator;

/* loaded from: classes2.dex */
public final class u {

    public static class a implements Comparator<int[]> {

        /* renamed from: a, reason: collision with root package name */
        public int[][] f30948a;

        @Override // java.util.Comparator
        public final int compare(int[] iArr, int[] iArr2) {
            int[] iArr3 = iArr;
            int[] iArr4 = iArr2;
            int i10 = iArr3[0];
            int i11 = iArr4[0];
            if (i10 < i11) {
                return -1;
            }
            if (i10 <= i11) {
                int i12 = iArr3[1];
                int i13 = iArr4[1];
                if (i12 < i13) {
                    return -1;
                }
                if (i12 <= i13) {
                    return 0;
                }
            }
            return 1;
        }
    }
}
