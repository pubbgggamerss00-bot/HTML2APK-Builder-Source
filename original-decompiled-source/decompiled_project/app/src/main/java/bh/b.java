package bh;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f4238a;

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f4239b;

    static {
        byte[] bArr = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        int[] iArr = new int[256];
        int i10 = 0;
        Arrays.fill(iArr, 0, 256, -1);
        iArr[61] = -2;
        int i11 = 0;
        int i12 = 0;
        while (i11 < 64) {
            iArr[bArr[i11]] = i12;
            i11++;
            i12++;
        }
        f4238a = iArr;
        byte[] bArr2 = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
        int[] iArr2 = new int[256];
        Arrays.fill(iArr2, 0, 256, -1);
        iArr2[61] = -2;
        int i13 = 0;
        while (i10 < 64) {
            iArr2[bArr2[i10]] = i13;
            i10++;
            i13++;
        }
        f4239b = iArr2;
    }
}
