package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a00 {

    /* renamed from: a, reason: collision with root package name */
    public final int f2531a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2532b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2533c;

    /* renamed from: d, reason: collision with root package name */
    public final w[] f2534d;

    /* renamed from: e, reason: collision with root package name */
    public int f2535e;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public a00(String str, w... wVarArr) {
        int length = wVarArr.length;
        int i6 = 1;
        y5.n(length > 0);
        this.f2532b = str;
        this.f2534d = wVarArr;
        this.f2531a = length;
        int iB = bk.b(wVarArr[0].f9978m);
        this.f2533c = iB == -1 ? bk.b(wVarArr[0].f9977l) : iB;
        String str2 = wVarArr[0].f9970d;
        str2 = (str2 == null || str2.equals("und")) ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str2;
        int i7 = wVarArr[0].f9972f | 16384;
        while (true) {
            w[] wVarArr2 = this.f2534d;
            if (i6 >= wVarArr2.length) {
                return;
            }
            String str3 = wVarArr2[i6].f9970d;
            if (!str2.equals((str3 == null || str3.equals("und")) ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str3)) {
                w[] wVarArr3 = this.f2534d;
                a("languages", wVarArr3[0].f9970d, wVarArr3[i6].f9970d, i6);
                return;
            } else {
                w[] wVarArr4 = this.f2534d;
                if (i7 != (wVarArr4[i6].f9972f | 16384)) {
                    a("role flags", Integer.toBinaryString(wVarArr4[0].f9972f), Integer.toBinaryString(this.f2534d[i6].f9972f), i6);
                    return;
                }
                i6++;
            }
        }
    }

    public static void a(String str, String str2, String str3, int i6) {
        StringBuilder sbA = androidx.camera.camera2.internal.i0.a("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        sbA.append(str3);
        sbA.append("' (track ");
        sbA.append(i6);
        sbA.append(")");
        qs0.d("TrackGroup", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, new IllegalStateException(sbA.toString()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a00.class == obj.getClass()) {
            a00 a00Var = (a00) obj;
            if (this.f2532b.equals(a00Var.f2532b) && Arrays.equals(this.f2534d, a00Var.f2534d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i6 = this.f2535e;
        if (i6 != 0) {
            return i6;
        }
        int iHashCode = Arrays.hashCode(this.f2534d) + ((this.f2532b.hashCode() + 527) * 31);
        this.f2535e = iHashCode;
        return iHashCode;
    }
}
