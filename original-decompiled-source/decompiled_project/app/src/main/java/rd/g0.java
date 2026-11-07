package rd;

import com.google.android.gms.internal.p002firebaseauthapi.zzahk;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;

/* loaded from: classes2.dex */
public abstract class g0<T> {
    public final Task a(FirebaseAuth firebaseAuth, String str, RecaptchaAction recaptchaAction) {
        n0 n0Var;
        boolean z10;
        i0 i0Var = new i0();
        i0Var.f23381a = this;
        synchronized (firebaseAuth) {
            n0Var = firebaseAuth.f6836j;
        }
        if (n0Var != null) {
            synchronized (n0Var.f23404a) {
                try {
                    zzahk zzahkVar = n0Var.f23406c;
                    z10 = zzahkVar != null && zzahkVar.zzc("EMAIL_PASSWORD_PROVIDER");
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z10) {
                return n0Var.a(str, Boolean.FALSE, recaptchaAction).continueWithTask(i0Var).continueWithTask(new k0(str, n0Var, recaptchaAction, i0Var));
            }
        }
        Task<T> taskB = b(null);
        j0 j0Var = new j0();
        j0Var.f23383a = recaptchaAction;
        j0Var.f23384b = firebaseAuth;
        j0Var.f23385c = str;
        j0Var.f23386d = i0Var;
        return taskB.continueWithTask(j0Var);
    }

    public abstract Task<T> b(String str);
}
