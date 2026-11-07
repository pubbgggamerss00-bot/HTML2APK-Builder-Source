package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzv;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class jv1 implements zr1 {
    public static final jv1 A;
    public static final jv1 B;

    /* renamed from: u, reason: collision with root package name */
    public static final jv1 f6170u;

    /* renamed from: v, reason: collision with root package name */
    public static final jv1 f6171v;

    /* renamed from: w, reason: collision with root package name */
    public static final jv1 f6172w;

    /* renamed from: x, reason: collision with root package name */
    public static final jv1 f6173x;

    /* renamed from: y, reason: collision with root package name */
    public static final jv1 f6174y;

    /* renamed from: z, reason: collision with root package name */
    public static final jv1 f6175z;
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final String f6176t;

    static {
        int i6 = 0;
        f6170u = new jv1("TINK", i6);
        f6171v = new jv1("NO_PREFIX", i6);
        int i7 = 1;
        f6172w = new jv1("TINK", i7);
        f6173x = new jv1("NO_PREFIX", i7);
        int i8 = 2;
        f6174y = new jv1("TINK", i8);
        f6175z = new jv1("CRUNCHY", i8);
        A = new jv1("LEGACY", i8);
        B = new jv1("NO_PREFIX", i8);
    }

    public /* synthetic */ jv1(String str, int i6) {
        this.s = i6;
        this.f6176t = str;
    }

    @Override // com.google.android.gms.internal.ads.zr1
    public void j(Throwable th) {
        zzv.zzp().g(this.f6176t, th);
    }

    public String toString() {
        switch (this.s) {
            case 0:
                return this.f6176t;
            case 1:
                return this.f6176t;
            case 2:
                return this.f6176t;
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.zr1
    /* renamed from: a */
    public void mo2a(Object obj) {
    }
}
