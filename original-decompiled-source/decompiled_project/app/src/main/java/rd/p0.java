package rd;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaTasksClient;

/* loaded from: classes2.dex */
public final class p0 implements Continuation<RecaptchaTasksClient, Task<String>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecaptchaAction f23418a;

    public p0(RecaptchaAction recaptchaAction) {
        this.f23418a = recaptchaAction;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<String> then(Task<RecaptchaTasksClient> task) throws Exception {
        if (task.isSuccessful()) {
            return task.getResult().executeTask(this.f23418a);
        }
        Exception exception = task.getException();
        com.google.android.gms.common.internal.p.f(exception);
        if (!(exception instanceof l0)) {
            return Tasks.forException(exception);
        }
        if (Log.isLoggable("RecaptchaHandler", 4)) {
            Log.i("RecaptchaHandler", "Ignoring error related to fetching recaptcha config - " + exception.getMessage());
        }
        return Tasks.forResult("");
    }
}
