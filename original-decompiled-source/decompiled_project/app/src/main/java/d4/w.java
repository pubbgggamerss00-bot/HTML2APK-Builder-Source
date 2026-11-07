package d4;

import android.content.Context;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public interface w {
    boolean isAvailableOnDevice();

    void onClearCredential(a aVar, CancellationSignal cancellationSignal, Executor executor, t<Void, e4.a> tVar);

    void onGetCredential(Context context, x0 x0Var, CancellationSignal cancellationSignal, Executor executor, t<y0, e4.o> tVar);
}
