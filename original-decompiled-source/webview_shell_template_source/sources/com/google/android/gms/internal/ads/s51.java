package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class s51 extends v61 {

    /* renamed from: b, reason: collision with root package name */
    public final long f8798b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f8799c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f8800d;

    public s51(int i6, long j6) {
        super(i6);
        this.f8798b = j6;
        this.f8799c = new ArrayList();
        this.f8800d = new ArrayList();
    }

    public final s51 b(int i6) {
        ArrayList arrayList = this.f8800d;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            s51 s51Var = (s51) arrayList.get(i7);
            if (s51Var.f9732a == i6) {
                return s51Var;
            }
        }
        return null;
    }

    public final j61 c(int i6) {
        ArrayList arrayList = this.f8799c;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            j61 j61Var = (j61) arrayList.get(i7);
            if (j61Var.f9732a == i6) {
                return j61Var;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.v61
    public final String toString() {
        return v61.a(this.f9732a) + " leaves: " + Arrays.toString(this.f8799c.toArray()) + " containers: " + Arrays.toString(this.f8800d.toArray());
    }
}
