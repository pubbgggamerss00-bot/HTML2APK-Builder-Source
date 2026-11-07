package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zh1 extends me {

    /* renamed from: t, reason: collision with root package name */
    public String f11293t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f11294u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f11295v;

    /* renamed from: w, reason: collision with root package name */
    public long f11296w;

    /* renamed from: x, reason: collision with root package name */
    public long f11297x;

    /* renamed from: y, reason: collision with root package name */
    public byte f11298y;

    public final ai1 q() {
        String str;
        if (this.f11298y == 63 && (str = this.f11293t) != null) {
            return new ai1(str, this.f11294u, this.f11295v, this.f11296w, this.f11297x);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f11293t == null) {
            sb.append(" clientVersion");
        }
        if ((this.f11298y & 1) == 0) {
            sb.append(" shouldGetAdvertisingId");
        }
        if ((this.f11298y & 2) == 0) {
            sb.append(" isGooglePlayServicesAvailable");
        }
        if ((this.f11298y & 4) == 0) {
            sb.append(" enableQuerySignalsTimeout");
        }
        if ((this.f11298y & 8) == 0) {
            sb.append(" querySignalsTimeoutMs");
        }
        if ((this.f11298y & 16) == 0) {
            sb.append(" enableQuerySignalsCache");
        }
        if ((this.f11298y & 32) == 0) {
            sb.append(" querySignalsCacheTtlSeconds");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
