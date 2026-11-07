package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class qi2 {

    /* renamed from: c, reason: collision with root package name */
    public final aa1 f8397c;

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f8396b = new SparseArray();

    /* renamed from: a, reason: collision with root package name */
    public int f8395a = -1;

    public qi2(aa1 aa1Var) {
        this.f8397c = aa1Var;
    }

    public final Object a(int i6) {
        SparseArray sparseArray;
        if (this.f8395a == -1) {
            this.f8395a = 0;
        }
        while (true) {
            int i7 = this.f8395a;
            sparseArray = this.f8396b;
            if (i7 <= 0 || i6 >= sparseArray.keyAt(i7)) {
                break;
            }
            this.f8395a--;
        }
        while (this.f8395a < sparseArray.size() - 1 && i6 >= sparseArray.keyAt(this.f8395a + 1)) {
            this.f8395a++;
        }
        return sparseArray.valueAt(this.f8395a);
    }
}
