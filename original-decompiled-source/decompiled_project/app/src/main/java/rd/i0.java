package rd;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* loaded from: classes2.dex */
public final /* synthetic */ class i0 implements Continuation {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ g0 f23381a;

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        g0 g0Var = this.f23381a;
        if (task.isSuccessful()) {
            return g0Var.b((String) task.getResult());
        }
        Exception exception = task.getException();
        com.google.android.gms.common.internal.p.f(exception);
        Log.e("RecaptchaCallWrapper", "Failed to get Recaptcha token, error - " + exception.getMessage() + "\n\n Failing open with a fake token.");
        return g0Var.b("NO_RECAPTCHA");
    }
}
