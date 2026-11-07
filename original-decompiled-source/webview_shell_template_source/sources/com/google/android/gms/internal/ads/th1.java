package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class th1 implements Comparable {

    /* renamed from: u, reason: collision with root package name */
    public long f9286u;

    /* renamed from: t, reason: collision with root package name */
    public long f9285t = -9223372036854775807L;
    public final ex0 s = new ex0();

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        th1 th1Var = (th1) obj;
        int iCompare = Long.compare(this.f9285t, th1Var.f9285t);
        return iCompare != 0 ? iCompare : Long.compare(this.f9286u, th1Var.f9286u);
    }
}
