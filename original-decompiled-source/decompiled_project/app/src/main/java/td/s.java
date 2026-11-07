package td;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final /* synthetic */ class s implements fe.b {
    @Override // fe.b
    public final Object get() {
        sd.q<ScheduledExecutorService> qVar = ExecutorsRegistrar.f6872a;
        return new o(Executors.newCachedThreadPool(new b("Firebase Blocking", 11, null)), ExecutorsRegistrar.f6875d.get());
    }
}
