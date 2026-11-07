package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class qn1 extends tn1 {
    public static final tn1 f(int i6) {
        return i6 < 0 ? tn1.f9353b : i6 > 0 ? tn1.f9354c : tn1.f9352a;
    }

    @Override // com.google.android.gms.internal.ads.tn1
    public final int a() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.tn1
    public final tn1 b(int i6, int i7) {
        return f(Integer.compare(i6, i7));
    }

    @Override // com.google.android.gms.internal.ads.tn1
    public final tn1 c(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.tn1
    public final tn1 d(boolean z6, boolean z7) {
        return f(Boolean.compare(z6, z7));
    }

    @Override // com.google.android.gms.internal.ads.tn1
    public final tn1 e(boolean z6, boolean z7) {
        return f(Boolean.compare(z7, z6));
    }
}
