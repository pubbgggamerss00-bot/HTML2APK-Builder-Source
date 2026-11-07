package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class eu1 implements om0 {
    public static final eu1 A;
    public static final eu1 B;
    public static final eu1 C;
    public static final eu1 D;
    public static final eu1 E;
    public static final eu1 F;

    /* renamed from: u, reason: collision with root package name */
    public static final eu1 f4401u;

    /* renamed from: v, reason: collision with root package name */
    public static final eu1 f4402v;

    /* renamed from: w, reason: collision with root package name */
    public static final eu1 f4403w;

    /* renamed from: x, reason: collision with root package name */
    public static final eu1 f4404x;

    /* renamed from: y, reason: collision with root package name */
    public static final eu1 f4405y;

    /* renamed from: z, reason: collision with root package name */
    public static final eu1 f4406z;
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final String f4407t;

    static {
        int i6 = 0;
        f4401u = new eu1("TINK", i6);
        f4402v = new eu1("CRUNCHY", i6);
        f4403w = new eu1("NO_PREFIX", i6);
        int i7 = 1;
        f4404x = new eu1("TINK", i7);
        f4405y = new eu1("CRUNCHY", i7);
        f4406z = new eu1("NO_PREFIX", i7);
        int i8 = 2;
        A = new eu1("ASSUME_AES_GCM", i8);
        B = new eu1("ASSUME_XCHACHA20POLY1305", i8);
        C = new eu1("ASSUME_CHACHA20POLY1305", i8);
        D = new eu1("ASSUME_AES_CTR_HMAC", i8);
        E = new eu1("ASSUME_AES_EAX", i8);
        F = new eu1("ASSUME_AES_GCM_SIV", i8);
    }

    public /* synthetic */ eu1(String str, int i6) {
        this.s = i6;
        this.f4407t = str;
    }

    public String toString() {
        switch (this.s) {
            case 0:
                return this.f4407t;
            case 1:
                return this.f4407t;
            case 2:
                return this.f4407t;
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.om0
    /* renamed from: zza */
    public void mo3zza(Object obj) {
        ((bn0) obj).f(this.f4407t);
    }
}
