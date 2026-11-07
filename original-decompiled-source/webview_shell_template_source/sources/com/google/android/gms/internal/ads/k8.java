package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class k8 implements Comparable {
    public final int s;

    /* renamed from: t, reason: collision with root package name */
    public final f8 f6277t;

    public k8(int i6, f8 f8Var) {
        this.s = i6;
        this.f6277t = f8Var;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(this.s, ((k8) obj).s);
    }
}
