package q1;

import android.graphics.Shader;
import android.os.Build;

/* loaded from: classes.dex */
public final class n0 {
    public static final Shader.TileMode a(int i10) {
        if (i10 == 0) {
            return Shader.TileMode.CLAMP;
        }
        if (i10 == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i10 == 2) {
            return Shader.TileMode.MIRROR;
        }
        if (i10 == 3 && Build.VERSION.SDK_INT >= 31) {
            return Shader.TileMode.DECAL;
        }
        return Shader.TileMode.CLAMP;
    }
}
