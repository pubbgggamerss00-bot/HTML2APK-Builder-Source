package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class lu1 implements om0 {

    /* renamed from: u, reason: collision with root package name */
    public static final lu1 f6856u;

    /* renamed from: v, reason: collision with root package name */
    public static final lu1 f6857v;

    /* renamed from: w, reason: collision with root package name */
    public static final lu1 f6858w;
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final String f6859t;

    static {
        int i6 = 0;
        f6856u = new lu1("TINK", i6);
        f6857v = new lu1("CRUNCHY", i6);
        f6858w = new lu1("NO_PREFIX", i6);
    }

    public /* synthetic */ lu1(String str, int i6) {
        this.s = i6;
        this.f6859t = str;
    }

    public String toString() {
        switch (this.s) {
            case 0:
                return this.f6859t;
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.om0
    /* renamed from: zza */
    public void mo3zza(Object obj) {
        ((tn0) obj).zzf(this.f6859t);
    }
}
