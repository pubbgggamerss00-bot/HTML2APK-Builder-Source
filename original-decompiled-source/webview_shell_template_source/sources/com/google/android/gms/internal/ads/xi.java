package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class xi {

    /* renamed from: a, reason: collision with root package name */
    public final long f10604a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10605b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10606c;

    public xi(int i6, String str, long j6) {
        this.f10604a = j6;
        this.f10605b = str;
        this.f10606c = i6;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof xi)) {
            xi xiVar = (xi) obj;
            if (xiVar.f10604a == this.f10604a && xiVar.f10606c == this.f10606c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.f10604a;
    }
}
