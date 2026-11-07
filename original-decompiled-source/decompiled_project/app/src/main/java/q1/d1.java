package q1;

import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d1 extends c1 {

    /* renamed from: b, reason: collision with root package name */
    public float[] f21683b;

    public final float[] a() {
        float[] fArr = this.f21683b;
        if (fArr != null) {
            return fArr;
        }
        ColorFilter colorFilter = this.f21658a;
        if (!(colorFilter instanceof ColorMatrixColorFilter)) {
            throw new IllegalArgumentException("Unable to obtain ColorMatrix from Android ColorMatrixColorFilter. This method was invoked on an unsupported Android version");
        }
        ColorMatrix colorMatrix = new ColorMatrix();
        ((ColorMatrixColorFilter) colorFilter).getColorMatrix(colorMatrix);
        float[] array = colorMatrix.getArray();
        this.f21683b = array;
        return array;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d1) && Arrays.equals(a(), ((d1) obj).a());
    }

    public final int hashCode() {
        float[] fArr = this.f21683b;
        if (fArr != null) {
            return Arrays.hashCode(fArr);
        }
        return 0;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ColorMatrixColorFilter(colorMatrix=");
        float[] fArr = this.f21683b;
        if (fArr == null) {
            str = "null";
        } else {
            str = "ColorMatrix(values=" + Arrays.toString(fArr) + ')';
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }
}
