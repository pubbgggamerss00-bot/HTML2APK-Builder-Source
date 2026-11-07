package td;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final /* synthetic */ class r implements fe.b {
    @Override // fe.b
    public final Object get() {
        sd.q<ScheduledExecutorService> qVar = ExecutorsRegistrar.f6872a;
        return new o(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new b("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), ExecutorsRegistrar.f6875d.get());
    }
}
