package x4;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class b {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }
}
