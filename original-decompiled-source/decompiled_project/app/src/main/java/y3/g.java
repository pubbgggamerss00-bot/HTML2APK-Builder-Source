package y3;

import android.os.Build;
import android.view.Display;
import android.view.RoundedCorner;

/* loaded from: classes.dex */
public final class g {
    public static b0 a(Display display, int i10) {
        RoundedCorner roundedCorner;
        int i11;
        if (Build.VERSION.SDK_INT < 31 || (roundedCorner = display.getRoundedCorner(i10)) == null) {
            return null;
        }
        int position = roundedCorner.getPosition();
        if (position != 0) {
            i11 = 1;
            if (position != 1) {
                i11 = 2;
                if (position != 2) {
                    i11 = 3;
                    if (position != 3) {
                        throw new IllegalArgumentException(j2.y.a(position, "Invalid position: "));
                    }
                }
            }
        } else {
            i11 = 0;
        }
        return new b0(i11, roundedCorner.getRadius(), roundedCorner.getCenter());
    }
}
