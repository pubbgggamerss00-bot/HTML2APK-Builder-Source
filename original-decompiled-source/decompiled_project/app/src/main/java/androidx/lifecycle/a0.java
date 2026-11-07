package androidx.lifecycle;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.z;

/* loaded from: classes.dex */
public class a0<T> extends z<T> {
    public final void i(T t3) {
        boolean z10;
        synchronized (this.f2382a) {
            z10 = this.f2387f == z.f2381k;
            this.f2387f = t3;
        }
        if (z10) {
            n.b bVarB0 = n.b.b0();
            z.a aVar = this.f2391j;
            n.c cVar = bVarB0.f18285a;
            if (cVar.f18288c == null) {
                synchronized (cVar.f18286a) {
                    try {
                        if (cVar.f18288c == null) {
                            cVar.f18288c = Handler.createAsync(Looper.getMainLooper());
                        }
                    } finally {
                    }
                }
            }
            cVar.f18288c.post(aVar);
        }
    }
}
