package u5;

import androidx.work.j;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class d extends j {
    public static float o(float f6, float f7, float f8) {
        if (f7 <= f8) {
            return f6 < f7 ? f7 : f6 > f8 ? f8 : f6;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f8 + " is less than minimum " + f7 + '.');
    }

    public static int p(int i6, int i7, int i8) {
        if (i7 <= i8) {
            return i6 < i7 ? i7 : i6 > i8 ? i8 : i6;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i8 + " is less than minimum " + i7 + '.');
    }

    public static c q(int i6, int i7) {
        if (i7 > Integer.MIN_VALUE) {
            return new c(i6, i7 - 1, 1);
        }
        c cVar = c.f14725v;
        return c.f14725v;
    }
}
