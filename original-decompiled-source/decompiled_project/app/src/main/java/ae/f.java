package ae;

import android.util.Log;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* loaded from: classes2.dex */
public final /* synthetic */ class f implements SuccessContinuation {
    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object obj) {
        kd.c result = (kd.c) obj;
        kotlin.jvm.internal.r.e(result, "result");
        if (result.a() != null) {
            Log.w("FirebaseContextProvider", "Error getting App Check token. Error: " + result.a());
        }
        return Tasks.forResult(result.b());
    }
}
