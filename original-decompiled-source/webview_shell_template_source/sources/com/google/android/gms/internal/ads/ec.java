package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ec {

    /* renamed from: d, reason: collision with root package name */
    public static final dc f4202d = new dc(0);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4203a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f4204b = new ArrayList(64);

    /* renamed from: c, reason: collision with root package name */
    public int f4205c = 0;

    public final synchronized void a(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            if (length <= 4096) {
                this.f4203a.add(bArr);
                int iBinarySearch = Collections.binarySearch(this.f4204b, bArr, f4202d);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                this.f4204b.add(iBinarySearch, bArr);
                this.f4205c += length;
                synchronized (this) {
                    while (this.f4205c > 4096) {
                        byte[] bArr2 = (byte[]) this.f4203a.remove(0);
                        this.f4204b.remove(bArr2);
                        this.f4205c -= bArr2.length;
                    }
                }
            }
        }
    }

    public final synchronized byte[] b(int i6) {
        for (int i7 = 0; i7 < this.f4204b.size(); i7++) {
            byte[] bArr = (byte[]) this.f4204b.get(i7);
            int length = bArr.length;
            if (length >= i6) {
                this.f4205c -= length;
                this.f4204b.remove(i7);
                this.f4203a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i6];
    }
}
