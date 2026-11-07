package rd;

import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzaei;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;

/* loaded from: classes2.dex */
public final /* synthetic */ class j0 implements Continuation {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ RecaptchaAction f23383a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ FirebaseAuth f23384b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ String f23385c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ i0 f23386d;

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        n0 n0Var;
        n0 n0Var2;
        RecaptchaAction recaptchaAction = this.f23383a;
        FirebaseAuth firebaseAuth = this.f23384b;
        String str = this.f23385c;
        i0 i0Var = this.f23386d;
        if (task.isSuccessful()) {
            return Tasks.forResult(task.getResult());
        }
        Exception exception = task.getException();
        com.google.android.gms.common.internal.p.f(exception);
        if (!zzaei.zzd(exception)) {
            Log.e("RecaptchaCallWrapper", "Initial task failed for action " + String.valueOf(recaptchaAction) + "with exception - " + exception.getMessage());
            return Tasks.forException(exception);
        }
        if (Log.isLoggable("RecaptchaCallWrapper", 4)) {
            Log.i("RecaptchaCallWrapper", "Falling back to recaptcha enterprise flow for action ".concat(String.valueOf(recaptchaAction)));
        }
        synchronized (firebaseAuth) {
            n0Var = firebaseAuth.f6836j;
        }
        if (n0Var == null) {
            n0 n0Var3 = new n0(firebaseAuth.f6827a, firebaseAuth);
            synchronized (firebaseAuth) {
                firebaseAuth.f6836j = n0Var3;
            }
        }
        synchronized (firebaseAuth) {
            n0Var2 = firebaseAuth.f6836j;
        }
        return n0Var2.a(str, Boolean.FALSE, recaptchaAction).continueWithTask(i0Var).continueWithTask(new k0(str, n0Var2, recaptchaAction, i0Var));
    }
}
