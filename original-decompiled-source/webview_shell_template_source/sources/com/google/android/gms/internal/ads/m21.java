package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class m21 {

    /* renamed from: a, reason: collision with root package name */
    public final String f6908a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6909b;

    /* renamed from: c, reason: collision with root package name */
    public int f6910c;

    /* renamed from: d, reason: collision with root package name */
    public long f6911d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f6912e;

    public m21(String str, String str2, int i6, long j6, Integer num) {
        this.f6908a = str;
        this.f6909b = str2;
        this.f6910c = i6;
        this.f6911d = j6;
        this.f6912e = num;
    }

    public final String toString() {
        Integer num;
        String strD = this.f6908a + "." + this.f6910c + "." + this.f6911d;
        String str = this.f6909b;
        if (!TextUtils.isEmpty(str)) {
            strD = androidx.activity.m.d(strD, ".", str);
        }
        if (!((Boolean) zzbe.zzc().a(zn.K1)).booleanValue() || (num = this.f6912e) == null || TextUtils.isEmpty(str)) {
            return strD;
        }
        return strD + "." + num;
    }
}
