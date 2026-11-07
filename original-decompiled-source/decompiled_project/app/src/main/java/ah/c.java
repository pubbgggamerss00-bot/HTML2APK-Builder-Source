package ah;

import c9.u1;
import java.io.Closeable;

/* loaded from: classes2.dex */
public final class c {
    public static final void a(Closeable closeable, Throwable th2) {
        if (closeable != null) {
            if (th2 == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th3) {
                u1.b(th2, th3);
            }
        }
    }
}
