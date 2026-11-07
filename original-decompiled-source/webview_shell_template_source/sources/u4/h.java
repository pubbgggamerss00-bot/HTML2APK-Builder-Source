package u4;

import android.graphics.RectF;
import androidx.camera.camera2.internal.p0;
import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class h implements d {

    /* renamed from: a, reason: collision with root package name */
    public final float f14634a;

    public h(float f6) {
        this.f14634a = f6;
    }

    @Override // u4.d
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f14634a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f14634a == ((h) obj).f14634a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f14634a)});
    }

    public final String toString() {
        return p0.a(new StringBuilder(), (int) (this.f14634a * 100.0f), "%");
    }
}
