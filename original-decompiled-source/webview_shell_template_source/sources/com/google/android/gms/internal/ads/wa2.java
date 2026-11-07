package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class wa2 extends no {
    public final boolean A;

    /* renamed from: u, reason: collision with root package name */
    public final int f10142u;

    /* renamed from: v, reason: collision with root package name */
    public final String f10143v;

    /* renamed from: w, reason: collision with root package name */
    public final int f10144w;

    /* renamed from: x, reason: collision with root package name */
    public final w f10145x;

    /* renamed from: y, reason: collision with root package name */
    public final int f10146y;

    /* renamed from: z, reason: collision with root package name */
    public final oh2 f10147z;

    static {
        Integer.toString(1001, 36);
        Integer.toString(1002, 36);
        Integer.toString(1003, 36);
        Integer.toString(1004, 36);
        Integer.toString(1005, 36);
        Integer.toString(1006, 36);
    }

    public wa2(int i6, Exception exc, int i7) {
        this(i6, exc, i7, null, -1, null, 4, false);
    }

    public final wa2 a(oh2 oh2Var) {
        String message = getMessage();
        int i6 = j31.f5914a;
        return new wa2(message, getCause(), this.s, this.f10142u, this.f10143v, this.f10144w, this.f10145x, this.f10146y, oh2Var, this.f7478t, this.A);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public wa2(int i6, Exception exc, int i7, String str, int i8, w wVar, int i9, boolean z6) {
        String str2;
        int i10;
        String strE;
        String str3;
        if (i6 == 0) {
            str2 = str;
            i10 = i8;
            strE = "Source error";
        } else if (i6 != 1) {
            strE = "Unexpected runtime error";
            str2 = str;
            i10 = i8;
        } else {
            String strValueOf = String.valueOf(wVar);
            int i11 = j31.f5914a;
            if (i9 == 0) {
                str3 = "NO";
            } else if (i9 == 1) {
                str3 = "NO_UNSUPPORTED_TYPE";
            } else if (i9 == 2) {
                str3 = "NO_UNSUPPORTED_DRM";
            } else if (i9 == 3) {
                str3 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i9 != 4) {
                    throw new IllegalStateException();
                }
                str3 = "YES";
            }
            StringBuilder sb = new StringBuilder();
            str2 = str;
            sb.append(str2);
            sb.append(" error, index=");
            i10 = i8;
            sb.append(i10);
            sb.append(", format=");
            sb.append(strValueOf);
            strE = androidx.activity.m.e(sb, ", format_supported=", str3);
        }
        this(TextUtils.isEmpty(null) ? strE : strE.concat(": null"), exc, i7, i6, str2, i10, wVar, i9, null, SystemClock.elapsedRealtime(), z6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa2(String str, Throwable th, int i6, int i7, String str2, int i8, w wVar, int i9, oh2 oh2Var, long j6, boolean z6) {
        int i10;
        boolean z7;
        super(str, th, i6, j6);
        Bundle bundle = Bundle.EMPTY;
        if (!z6) {
            i10 = i7;
            z7 = true;
        } else if (i7 == 1) {
            i10 = 1;
            z7 = true;
        } else {
            i10 = i7;
            z7 = false;
        }
        y5.n(z7);
        y5.n(th != null);
        this.f10142u = i10;
        this.f10143v = str2;
        this.f10144w = i8;
        this.f10145x = wVar;
        this.f10146y = i9;
        this.f10147z = oh2Var;
        this.A = z6;
    }
}
