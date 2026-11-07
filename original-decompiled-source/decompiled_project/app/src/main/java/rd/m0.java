package rd;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzae;
import com.google.android.gms.internal.p002firebaseauthapi.zzahk;
import com.google.android.gms.internal.p002firebaseauthapi.zzv;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.Recaptcha;
import com.google.android.recaptcha.RecaptchaTasksClient;
import i0.u2;
import java.util.List;

/* loaded from: classes2.dex */
public final class m0 implements Continuation<zzahk, Task<RecaptchaTasksClient>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f23402a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n0 f23403b;

    public m0(n0 n0Var, String str) {
        this.f23402a = str;
        this.f23403b = n0Var;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Task<RecaptchaTasksClient> then(Task<zzahk> task) throws Exception {
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            com.google.android.gms.common.internal.p.f(exception);
            String message = exception.getMessage();
            com.google.android.gms.common.internal.p.f(message);
            return Tasks.forException(new l0(message));
        }
        zzahk result = task.getResult();
        String strZza = result.zza();
        if (zzae.zzc(strZza)) {
            return Tasks.forException(new l0(m3.a.a("No Recaptcha Enterprise siteKey configured for tenant/project ", this.f23402a)));
        }
        List<String> listZza = zzv.zza('/').zza((CharSequence) strZza);
        String str = listZza.size() != 4 ? null : listZza.get(3);
        if (TextUtils.isEmpty(str)) {
            return Tasks.forException(new Exception(m3.a.a("Invalid siteKey format ", strZza)));
        }
        if (Log.isLoggable("RecaptchaHandler", 4)) {
            Log.i("RecaptchaHandler", "Successfully obtained site key for tenant " + this.f23402a);
        }
        n0 n0Var = this.f23403b;
        u2 u2Var = n0Var.f23409f;
        id.e eVar = n0Var.f23407d;
        eVar.a();
        Application application = (Application) eVar.f14480a;
        u2Var.getClass();
        Task<RecaptchaTasksClient> taskFetchTaskClient = Recaptcha.fetchTaskClient(application, str);
        n0 n0Var2 = this.f23403b;
        String str2 = this.f23402a;
        synchronized (n0Var2.f23404a) {
            n0Var2.f23406c = result;
            n0Var2.f23405b.put(str2, taskFetchTaskClient);
        }
        return taskFetchTaskClient;
    }
}
