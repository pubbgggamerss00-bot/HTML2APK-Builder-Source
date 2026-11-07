package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ui2 {

    /* renamed from: d, reason: collision with root package name */
    public static final ui2 f9566d = new ui2(new a00[0]);

    /* renamed from: a, reason: collision with root package name */
    public final int f9567a;

    /* renamed from: b, reason: collision with root package name */
    public final cp1 f9568b;

    /* renamed from: c, reason: collision with root package name */
    public int f9569c;

    static {
        Integer.toString(0, 36);
    }

    public ui2(a00... a00VarArr) {
        this.f9568b = bo1.m(a00VarArr);
        this.f9567a = a00VarArr.length;
        int i6 = 0;
        while (i6 < this.f9568b.f3638v) {
            int i7 = i6 + 1;
            int i8 = i7;
            while (true) {
                cp1 cp1Var = this.f9568b;
                if (i8 < cp1Var.f3638v) {
                    if (((a00) cp1Var.get(i6)).equals(this.f9568b.get(i8))) {
                        qs0.d("TrackGroupArray", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                    }
                    i8++;
                }
            }
            i6 = i7;
        }
    }

    public final a00 a(int i6) {
        return (a00) this.f9568b.get(i6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ui2.class != obj.getClass()) {
            return false;
        }
        ui2 ui2Var = (ui2) obj;
        return this.f9567a == ui2Var.f9567a && this.f9568b.equals(ui2Var.f9568b);
    }

    public final int hashCode() {
        int i6 = this.f9569c;
        if (i6 != 0) {
            return i6;
        }
        int iHashCode = this.f9568b.hashCode();
        this.f9569c = iHashCode;
        return iHashCode;
    }
}
