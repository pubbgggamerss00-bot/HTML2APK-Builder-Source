package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Random;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class oi2 {

    /* renamed from: a, reason: collision with root package name */
    public final Random f7780a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f7781b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f7782c;

    public oi2() {
        this(new Random());
    }

    public final oi2 a(int i6) {
        int[] iArr;
        Random random;
        int[] iArr2 = new int[i6];
        int[] iArr3 = new int[i6];
        int i7 = 0;
        while (true) {
            iArr = this.f7781b;
            random = this.f7780a;
            if (i7 >= i6) {
                break;
            }
            iArr2[i7] = random.nextInt(iArr.length + 1);
            int i8 = i7 + 1;
            int iNextInt = random.nextInt(i8);
            iArr3[i7] = iArr3[iNextInt];
            iArr3[iNextInt] = i7;
            i7 = i8;
        }
        Arrays.sort(iArr2);
        int[] iArr4 = new int[iArr.length + i6];
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < iArr.length + i6; i11++) {
            if (i9 >= i6 || i10 != iArr2[i9]) {
                int i12 = i10 + 1;
                int i13 = iArr[i10];
                iArr4[i11] = i13;
                if (i13 >= 0) {
                    iArr4[i11] = i13 + i6;
                }
                i10 = i12;
            } else {
                iArr4[i11] = iArr3[i9];
                i9++;
            }
        }
        return new oi2(iArr4, new Random(random.nextLong()));
    }

    public oi2(Random random) {
        this(new int[0], random);
    }

    public oi2(int[] iArr, Random random) {
        this.f7781b = iArr;
        this.f7780a = random;
        this.f7782c = new int[iArr.length];
        for (int i6 = 0; i6 < iArr.length; i6++) {
            this.f7782c[iArr[i6]] = i6;
        }
    }
}
