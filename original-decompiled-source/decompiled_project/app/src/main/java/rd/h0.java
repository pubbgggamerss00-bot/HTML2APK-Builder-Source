package rd;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.internal.RecaptchaActivity;

/* loaded from: classes2.dex */
public final /* synthetic */ class h0 implements Continuation {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Uri f23378a;

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        Uri uri = this.f23378a;
        v0 v0Var = RecaptchaActivity.f6870h;
        Uri.Builder builderBuildUpon = uri.buildUpon();
        if (task.isSuccessful()) {
            kd.c cVar = (kd.c) task.getResult();
            if (cVar.a() != null) {
                Log.w("RecaptchaActivity", "Error getting App Check token; using placeholder token instead. Error: ".concat(String.valueOf(cVar.a())));
            }
            builderBuildUpon.fragment("fac=" + cVar.b());
        } else {
            Log.e("RecaptchaActivity", "Unexpected error getting App Check token: " + task.getException().getMessage());
        }
        return builderBuildUpon.build();
    }
}
