package u4;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final float f14606a;

    public a(float f6) {
        this.f14606a = f6;
    }

    @Override // u4.d
    public final float a(RectF rectF) {
        return this.f14606a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f14606a == ((a) obj).f14606a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f14606a)});
    }

    public final String toString() {
        return this.f14606a + "px";
    }
}
