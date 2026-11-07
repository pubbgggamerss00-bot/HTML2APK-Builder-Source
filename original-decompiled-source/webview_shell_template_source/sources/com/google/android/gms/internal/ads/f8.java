package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class f8 {

    /* renamed from: f, reason: collision with root package name */
    public int f4527f;
    public int h;

    /* renamed from: n, reason: collision with root package name */
    public float f4534n;

    /* renamed from: a, reason: collision with root package name */
    public String f4522a = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    /* renamed from: b, reason: collision with root package name */
    public String f4523b = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    /* renamed from: c, reason: collision with root package name */
    public Set f4524c = Collections.EMPTY_SET;

    /* renamed from: d, reason: collision with root package name */
    public String f4525d = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    /* renamed from: e, reason: collision with root package name */
    public String f4526e = null;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4528g = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4529i = false;

    /* renamed from: j, reason: collision with root package name */
    public int f4530j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f4531k = -1;

    /* renamed from: l, reason: collision with root package name */
    public int f4532l = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f4533m = -1;

    /* renamed from: o, reason: collision with root package name */
    public int f4535o = -1;

    /* renamed from: p, reason: collision with root package name */
    public boolean f4536p = false;

    public static int a(String str, int i6, int i7, String str2) {
        if (str.isEmpty() || i6 == -1) {
            return i6;
        }
        if (str.equals(str2)) {
            return i6 + i7;
        }
        return -1;
    }
}
