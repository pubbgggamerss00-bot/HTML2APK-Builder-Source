package r1;

import androidx.camera.camera2.internal.k0;
import androidx.camera.camera2.internal.p0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f14259a;

    /* renamed from: b, reason: collision with root package name */
    public final long f14260b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14261c;

    public c(int i6, long j6, long j7) {
        this.f14259a = j6;
        this.f14260b = j7;
        this.f14261c = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f14259a == cVar.f14259a && this.f14260b == cVar.f14260b && this.f14261c == cVar.f14261c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f14261c) + ((Long.hashCode(this.f14260b) + (Long.hashCode(this.f14259a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TaxonomyVersion=");
        sb.append(this.f14259a);
        sb.append(", ModelVersion=");
        sb.append(this.f14260b);
        sb.append(", TopicCode=");
        return k0.a("Topic { ", p0.a(sb, this.f14261c, " }"));
    }
}
