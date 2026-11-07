package rd;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzaem;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.internal.RecaptchaActivity;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class f0 implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ RecaptchaActivity f23363a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ String f23364b;

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        RecaptchaActivity recaptchaActivity = this.f23363a;
        String str = this.f23364b;
        v0 v0Var = RecaptchaActivity.f6870h;
        if (recaptchaActivity.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW"), 0) == null) {
            Log.e("RecaptchaActivity", "Device cannot resolve intent for: android.intent.action.VIEW");
            zzaem.zzb(recaptchaActivity, str);
            return;
        }
        List<ResolveInfo> listQueryIntentServices = recaptchaActivity.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            Intent intent = new Intent("android.intent.action.VIEW", (Uri) task.getResult());
            intent.putExtra("com.android.browser.application_id", str);
            intent.addFlags(1073741824);
            intent.addFlags(268435456);
            recaptchaActivity.startActivity(intent);
            return;
        }
        Intent intent2 = new Intent("android.intent.action.VIEW");
        if (!intent2.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent2.putExtras(bundle);
        }
        intent2.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
        intent2.putExtras(new Bundle());
        intent2.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        intent2.addFlags(1073741824);
        intent2.addFlags(268435456);
        intent2.setData((Uri) task.getResult());
        p3.b.startActivity(recaptchaActivity, intent2, null);
    }
}
