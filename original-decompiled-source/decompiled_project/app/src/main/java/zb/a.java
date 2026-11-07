package zb;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final float f34881a;

    public a(float f10) {
        this.f34881a = f10;
    }

    @Override // zb.d
    public final float a(RectF rectF) {
        return this.f34881a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f34881a == ((a) obj).f34881a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f34881a)});
    }

    public final String toString() {
        return this.f34881a + "px";
    }
}
