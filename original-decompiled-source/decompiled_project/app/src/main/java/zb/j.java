package zb;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class j implements d {

    /* renamed from: a, reason: collision with root package name */
    public final float f34927a;

    public j(float f10) {
        this.f34927a = f10;
    }

    @Override // zb.d
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f34927a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && this.f34927a == ((j) obj).f34927a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f34927a)});
    }

    public final String toString() {
        return x0.a.a(new StringBuilder(), (int) (this.f34927a * 100.0f), "%");
    }
}
