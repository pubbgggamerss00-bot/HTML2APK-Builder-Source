package z5;

import android.os.Looper;
import b6.o;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a implements o {
    @Override // b6.o
    public final c a() {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new c(e.a(mainLooper), false);
        }
        throw new IllegalStateException("The main looper is not available");
    }
}
