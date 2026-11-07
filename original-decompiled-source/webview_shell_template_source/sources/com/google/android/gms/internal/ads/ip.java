package com.google.android.gms.internal.ads;

import java.util.Locale;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ip {

    /* renamed from: d, reason: collision with root package name */
    public static final ip f5817d = new ip(1.0f, 1.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f5818a;

    /* renamed from: b, reason: collision with root package name */
    public final float f5819b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5820c;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public ip(float f6, float f7) {
        y5.n(f6 > 0.0f);
        y5.n(f7 > 0.0f);
        this.f5818a = f6;
        this.f5819b = f7;
        this.f5820c = Math.round(f6 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ip.class == obj.getClass()) {
            ip ipVar = (ip) obj;
            if (this.f5818a == ipVar.f5818a && this.f5819b == ipVar.f5819b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f5819b) + ((Float.floatToRawIntBits(this.f5818a) + 527) * 31);
    }

    public final String toString() {
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f5818a), Float.valueOf(this.f5819b));
    }
}
