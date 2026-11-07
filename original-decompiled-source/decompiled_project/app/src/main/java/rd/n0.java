package rd;

import com.google.android.gms.internal.p002firebaseauthapi.zzae;
import com.google.android.gms.internal.p002firebaseauthapi.zzahk;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaTasksClient;
import com.google.firebase.auth.FirebaseAuth;
import i0.u2;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f23404a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f23405b;

    /* renamed from: c, reason: collision with root package name */
    public zzahk f23406c;

    /* renamed from: d, reason: collision with root package name */
    public final id.e f23407d;

    /* renamed from: e, reason: collision with root package name */
    public final FirebaseAuth f23408e;

    /* renamed from: f, reason: collision with root package name */
    public final u2 f23409f;

    public n0(id.e eVar, FirebaseAuth firebaseAuth) {
        u2 u2Var = new u2();
        this.f23404a = new Object();
        this.f23405b = new HashMap();
        this.f23407d = eVar;
        this.f23408e = firebaseAuth;
        this.f23409f = u2Var;
    }

    public final Task<String> a(String str, Boolean bool, RecaptchaAction recaptchaAction) {
        Task<RecaptchaTasksClient> taskContinueWithTask;
        if (zzae.zzc(str)) {
            str = "*";
        }
        Task<RecaptchaTasksClient> taskB = b(str);
        if (bool.booleanValue() || taskB == null) {
            String str2 = zzae.zzc(str) ? "*" : str;
            if (bool.booleanValue() || (taskContinueWithTask = b(str2)) == null) {
                FirebaseAuth firebaseAuth = this.f23408e;
                taskContinueWithTask = firebaseAuth.f6831e.zza(firebaseAuth.f6835i, "RECAPTCHA_ENTERPRISE").continueWithTask(new m0(this, str2));
            }
            taskB = taskContinueWithTask;
        }
        return taskB.continueWithTask(new p0(recaptchaAction));
    }

    public final Task<RecaptchaTasksClient> b(String str) {
        Task<RecaptchaTasksClient> task;
        synchronized (this.f23404a) {
            task = (Task) this.f23405b.get(str);
        }
        return task;
    }
}
