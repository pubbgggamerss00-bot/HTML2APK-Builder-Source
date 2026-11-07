package u4;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public final float f14609a;

    public c(float f6) {
        this.f14609a = f6;
    }

    @Override // u4.d
    public final float a(RectF rectF) {
        return e5.i.a(this.f14609a, 0.0f, Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f14609a == ((c) obj).f14609a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f14609a)});
    }
}
