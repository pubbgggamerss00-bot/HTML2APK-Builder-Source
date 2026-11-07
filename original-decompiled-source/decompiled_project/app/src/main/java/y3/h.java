package y3;

import android.graphics.Insets;
import android.view.DisplayCutout;
import java.util.Objects;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f33819a;

    public static class a {
        public static Insets a(DisplayCutout displayCutout) {
            return displayCutout.getWaterfallInsets();
        }
    }

    public h(DisplayCutout displayCutout) {
        this.f33819a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f33819a, ((h) obj).f33819a);
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.f33819a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f33819a + "}";
    }
}
