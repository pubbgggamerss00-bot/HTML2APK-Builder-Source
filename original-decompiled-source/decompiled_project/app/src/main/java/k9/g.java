package k9;

import android.os.Build;
import y3.w0;

/* loaded from: classes.dex */
public final class g {
    public static final void a(b.k kVar) {
        w0.a(kVar.getWindow(), false);
        if (Build.VERSION.SDK_INT >= 29) {
            kVar.getWindow().setNavigationBarContrastEnforced(false);
        }
    }
}
