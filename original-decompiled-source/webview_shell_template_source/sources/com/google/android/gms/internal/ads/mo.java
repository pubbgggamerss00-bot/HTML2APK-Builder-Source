package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class mo {

    /* renamed from: a, reason: collision with root package name */
    public final String f7194a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7195b;

    public /* synthetic */ mo(String str, String str2) {
        this.f7194a = str;
        this.f7195b = str2;
    }

    public static mo a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Name is null or empty");
        }
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("Version is null or empty");
        }
        return new mo(str, str2);
    }
}
