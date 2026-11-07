package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class hd2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f5342a;

    /* renamed from: b, reason: collision with root package name */
    public final gd2 f5343b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f5344c;

    static {
        if (j31.f5914a < 31) {
            new hd2(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        } else {
            int i6 = gd2.f5001b;
        }
    }

    public hd2(LogSessionId logSessionId, String str) {
        this.f5343b = new gd2(logSessionId);
        this.f5342a = str;
        this.f5344c = new Object();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hd2)) {
            return false;
        }
        hd2 hd2Var = (hd2) obj;
        return Objects.equals(this.f5342a, hd2Var.f5342a) && Objects.equals(this.f5343b, hd2Var.f5343b) && Objects.equals(this.f5344c, hd2Var.f5344c);
    }

    public final int hashCode() {
        return Objects.hash(this.f5342a, this.f5343b, this.f5344c);
    }

    public hd2(String str) {
        y5.r(j31.f5914a < 31);
        this.f5342a = str;
        this.f5343b = null;
        this.f5344c = new Object();
    }
}
