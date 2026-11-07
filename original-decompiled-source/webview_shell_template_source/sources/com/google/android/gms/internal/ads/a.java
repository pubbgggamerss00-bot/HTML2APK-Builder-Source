package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f2525f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f2526a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public final Uri[] f2527b;

    /* renamed from: c, reason: collision with root package name */
    public final tc[] f2528c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f2529d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f2530e;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
    }

    public a(int i6, int[] iArr, tc[] tcVarArr, long[] jArr) {
        Uri uri;
        int length = iArr.length;
        int length2 = tcVarArr.length;
        int i7 = 0;
        y5.n(length == length2);
        this.f2526a = i6;
        this.f2529d = iArr;
        this.f2528c = tcVarArr;
        this.f2530e = jArr;
        this.f2527b = new Uri[length2];
        while (true) {
            Uri[] uriArr = this.f2527b;
            if (i7 >= uriArr.length) {
                return;
            }
            tc tcVar = tcVarArr[i7];
            if (tcVar == null) {
                uri = null;
            } else {
                q8 q8Var = tcVar.f9223b;
                q8Var.getClass();
                uri = q8Var.f8246a;
            }
            uriArr[i7] = uri;
            i7++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f2526a == aVar.f2526a && Arrays.equals(this.f2528c, aVar.f2528c) && Arrays.equals(this.f2529d, aVar.f2529d) && Arrays.equals(this.f2530e, aVar.f2530e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f2530e) + ((Arrays.hashCode(this.f2529d) + ((Arrays.hashCode(this.f2528c) + (((this.f2526a * 31) - 1) * 961)) * 31)) * 31)) * 961;
    }
}
