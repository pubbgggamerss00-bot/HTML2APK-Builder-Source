package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ea {

    /* renamed from: a, reason: collision with root package name */
    public final String f4178a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4179b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4180c;

    /* renamed from: d, reason: collision with root package name */
    public int f4181d;

    /* renamed from: e, reason: collision with root package name */
    public String f4182e;

    public ea(int i6, int i7, int i8) {
        String str;
        if (i6 != Integer.MIN_VALUE) {
            str = i6 + "/";
        } else {
            str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        this.f4178a = str;
        this.f4179b = i7;
        this.f4180c = i8;
        this.f4181d = Integer.MIN_VALUE;
        this.f4182e = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    }

    public final void a() {
        int i6 = this.f4181d;
        int i7 = i6 == Integer.MIN_VALUE ? this.f4179b : i6 + this.f4180c;
        this.f4181d = i7;
        this.f4182e = this.f4178a + i7;
    }

    public final void b() {
        if (this.f4181d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }
}
