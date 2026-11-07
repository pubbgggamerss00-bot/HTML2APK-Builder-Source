package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class za0 {

    /* renamed from: e, reason: collision with root package name */
    public static final za0 f11240e = new za0(-1, -1, -1);

    /* renamed from: a, reason: collision with root package name */
    public final int f11241a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11242b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11243c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11244d;

    public za0(int i6, int i7, int i8) {
        this.f11241a = i6;
        this.f11242b = i7;
        this.f11243c = i8;
        this.f11244d = j31.c(i8) ? j31.n(i8) * i7 : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof za0)) {
            return false;
        }
        za0 za0Var = (za0) obj;
        return this.f11241a == za0Var.f11241a && this.f11242b == za0Var.f11242b && this.f11243c == za0Var.f11243c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11241a), Integer.valueOf(this.f11242b), Integer.valueOf(this.f11243c)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioFormat[sampleRate=");
        sb.append(this.f11241a);
        sb.append(", channelCount=");
        sb.append(this.f11242b);
        sb.append(", encoding=");
        return androidx.camera.camera2.internal.p0.a(sb, this.f11243c, "]");
    }
}
