package qh;

import android.os.Looper;
import kotlinx.coroutines.internal.MainDispatcherFactory;

/* loaded from: classes2.dex */
public final class a implements MainDispatcherFactory {
    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    public final f a() {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new f(h.a(mainLooper));
        }
        throw new IllegalStateException("The main looper is not available");
    }
}
