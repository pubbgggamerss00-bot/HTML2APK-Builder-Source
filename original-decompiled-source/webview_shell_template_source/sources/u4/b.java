package u4;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final d f14607a;

    /* renamed from: b, reason: collision with root package name */
    public final float f14608b;

    public b(float f6, d dVar) {
        while (dVar instanceof b) {
            dVar = ((b) dVar).f14607a;
            f6 += ((b) dVar).f14608b;
        }
        this.f14607a = dVar;
        this.f14608b = f6;
    }

    @Override // u4.d
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f14607a.a(rectF) + this.f14608b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f14607a.equals(bVar.f14607a) && this.f14608b == bVar.f14608b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14607a, Float.valueOf(this.f14608b)});
    }
}
