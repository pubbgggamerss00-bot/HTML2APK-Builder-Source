package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class jx {

    /* renamed from: a, reason: collision with root package name */
    public Object f6180a;

    /* renamed from: b, reason: collision with root package name */
    public Object f6181b;

    /* renamed from: c, reason: collision with root package name */
    public int f6182c;

    /* renamed from: d, reason: collision with root package name */
    public long f6183d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6184e;

    /* renamed from: f, reason: collision with root package name */
    public dj f6185f = dj.f3948b;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public final long a(int i6, int i7) {
        a aVarA = this.f6185f.a(i6);
        if (aVarA.f2526a != -1) {
            return aVarA.f2530e[i7];
        }
        return -9223372036854775807L;
    }

    public final void b(Object obj, Object obj2, int i6, long j6, boolean z6) {
        dj djVar = dj.f3948b;
        this.f6180a = obj;
        this.f6181b = obj2;
        this.f6182c = i6;
        this.f6183d = j6;
        this.f6185f = djVar;
        this.f6184e = z6;
    }

    public final void c(int i6) {
        this.f6185f.a(i6).getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !jx.class.equals(obj.getClass())) {
            return false;
        }
        jx jxVar = (jx) obj;
        return Objects.equals(this.f6180a, jxVar.f6180a) && Objects.equals(this.f6181b, jxVar.f6181b) && this.f6182c == jxVar.f6182c && this.f6183d == jxVar.f6183d && this.f6184e == jxVar.f6184e && Objects.equals(this.f6185f, jxVar.f6185f);
    }

    public final int hashCode() {
        Object obj = this.f6180a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f6181b;
        int iHashCode2 = ((((iHashCode + 217) * 31) + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f6182c;
        long j6 = this.f6183d;
        return this.f6185f.hashCode() + (((((iHashCode2 * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 961) + (this.f6184e ? 1 : 0)) * 31);
    }
}
