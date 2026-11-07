package u0;

import android.view.DisplayCutout;
import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f14475a;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a {
        public static int a(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        public static int b(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        public static int c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        public static int d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    public e(DisplayCutout displayCutout) {
        this.f14475a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f14475a, ((e) obj).f14475a);
    }

    public final int hashCode() {
        return this.f14475a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f14475a + "}";
    }
}
