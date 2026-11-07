package q1;

import android.graphics.Path;
import q1.u1;

/* loaded from: classes.dex */
public final class l0 {
    public static final j0 a() {
        return new j0(0);
    }

    public static final Path.Direction b(u1.a aVar) {
        int iOrdinal = aVar.ordinal();
        if (iOrdinal == 0) {
            return Path.Direction.CCW;
        }
        if (iOrdinal == 1) {
            return Path.Direction.CW;
        }
        throw new pg.l();
    }

    public static final void c(String str) {
        throw new IllegalStateException(str);
    }
}
