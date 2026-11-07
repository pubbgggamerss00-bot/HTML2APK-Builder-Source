package td;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final /* synthetic */ class q implements fe.b {
    @Override // fe.b
    public final Object get() {
        sd.q<ScheduledExecutorService> qVar = ExecutorsRegistrar.f6872a;
        StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        builderDetectNetwork.detectResourceMismatches();
        builderDetectNetwork.detectUnbufferedIo();
        return new o(Executors.newFixedThreadPool(4, new b("Firebase Background", 10, builderDetectNetwork.penaltyLog().build())), ExecutorsRegistrar.f6875d.get());
    }
}
