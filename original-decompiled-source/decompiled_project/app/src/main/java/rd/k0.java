package rd;

import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzaei;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;

/* loaded from: classes2.dex */
public final class k0 implements Continuation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f23393a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n0 f23394b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RecaptchaAction f23395c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i0 f23396d;

    public k0(String str, n0 n0Var, RecaptchaAction recaptchaAction, i0 i0Var) {
        this.f23393a = str;
        this.f23394b = n0Var;
        this.f23395c = recaptchaAction;
        this.f23396d = i0Var;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) throws Exception {
        if (task.isSuccessful()) {
            return task;
        }
        Exception exception = task.getException();
        com.google.android.gms.common.internal.p.f(exception);
        if (!zzaei.zzc(exception)) {
            return task;
        }
        boolean zIsLoggable = Log.isLoggable("RecaptchaCallWrapper", 4);
        String str = this.f23393a;
        if (zIsLoggable) {
            Log.i("RecaptchaCallWrapper", "Invalid token - Refreshing Recaptcha Enterprise config and fetching new token for tenant " + str);
        }
        return this.f23394b.a(str, Boolean.TRUE, this.f23395c).continueWithTask(this.f23396d);
    }
}
