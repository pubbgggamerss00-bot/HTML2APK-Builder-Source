package rd;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.internal.GenericIdpActivity;

/* loaded from: classes2.dex */
public final /* synthetic */ class x implements Continuation {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Uri f23434a;

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        Uri uri = this.f23434a;
        int i10 = GenericIdpActivity.f6867h;
        Uri.Builder builderBuildUpon = uri.buildUpon();
        if (task.isSuccessful()) {
            kd.c cVar = (kd.c) task.getResult();
            if (cVar.a() != null) {
                Log.w("GenericIdpActivity", "Error getting App Check token; using placeholder token instead. Error: ".concat(String.valueOf(cVar.a())));
            }
            builderBuildUpon.fragment("fac=" + cVar.b());
        } else {
            Log.e("GenericIdpActivity", "Unexpected error getting App Check token: " + task.getException().getMessage());
        }
        return builderBuildUpon.build();
    }
}
