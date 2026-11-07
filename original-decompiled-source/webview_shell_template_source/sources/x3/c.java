package x3;

import android.animation.TimeInterpolator;
import androidx.camera.camera2.internal.p0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public long f15151a;

    /* renamed from: c, reason: collision with root package name */
    public TimeInterpolator f15153c = null;

    /* renamed from: d, reason: collision with root package name */
    public int f15154d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f15155e = 1;

    /* renamed from: b, reason: collision with root package name */
    public long f15152b = 150;

    public c(long j6) {
        this.f15151a = j6;
    }

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.f15153c;
        return timeInterpolator != null ? timeInterpolator : a.f15145b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f15151a == cVar.f15151a && this.f15152b == cVar.f15152b && this.f15154d == cVar.f15154d && this.f15155e == cVar.f15155e) {
            return a().getClass().equals(cVar.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f15151a;
        long j7 = this.f15152b;
        return ((((a().getClass().hashCode() + (((((int) (j6 ^ (j6 >>> 32))) * 31) + ((int) ((j7 >>> 32) ^ j7))) * 31)) * 31) + this.f15154d) * 31) + this.f15155e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append(c.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.f15151a);
        sb.append(" duration: ");
        sb.append(this.f15152b);
        sb.append(" interpolator: ");
        sb.append(a().getClass());
        sb.append(" repeatCount: ");
        sb.append(this.f15154d);
        sb.append(" repeatMode: ");
        return p0.a(sb, this.f15155e, "}\n");
    }
}
