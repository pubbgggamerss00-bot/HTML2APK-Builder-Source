package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class du1 {

    /* renamed from: c, reason: collision with root package name */
    public static final du1 f4031c;

    /* renamed from: d, reason: collision with root package name */
    public static final du1 f4032d;

    /* renamed from: e, reason: collision with root package name */
    public static final du1 f4033e;

    /* renamed from: f, reason: collision with root package name */
    public static final du1 f4034f;

    /* renamed from: g, reason: collision with root package name */
    public static final du1 f4035g;
    public static final du1 h;

    /* renamed from: i, reason: collision with root package name */
    public static final du1 f4036i;

    /* renamed from: j, reason: collision with root package name */
    public static final du1 f4037j;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4038a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4039b;

    static {
        int i6 = 0;
        f4031c = new du1("SHA1", i6);
        f4032d = new du1("SHA224", i6);
        f4033e = new du1("SHA256", i6);
        f4034f = new du1("SHA384", i6);
        f4035g = new du1("SHA512", i6);
        int i7 = 1;
        h = new du1("TINK", i7);
        f4036i = new du1("CRUNCHY", i7);
        f4037j = new du1("NO_PREFIX", i7);
    }

    public /* synthetic */ du1(String str, int i6) {
        this.f4038a = i6;
        this.f4039b = str;
    }

    public final String toString() {
        switch (this.f4038a) {
        }
        return this.f4039b;
    }
}
