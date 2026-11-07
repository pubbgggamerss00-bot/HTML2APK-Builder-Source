package s7;

import android.content.Context;
import android.net.ConnectivityManager;

/* loaded from: classes.dex */
public final /* synthetic */ class j extends kotlin.jvm.internal.p implements eh.l<Context, d> {

    /* renamed from: a, reason: collision with root package name */
    public static final j f24537a = new j(1, f.class, "ConnectivityChecker", "ConnectivityChecker(Landroid/content/Context;)Lcoil3/network/ConnectivityChecker;", 1);

    @Override // eh.l
    public final d invoke(Context context) {
        Context applicationContext = context.getApplicationContext();
        ConnectivityManager connectivityManager = (ConnectivityManager) p3.b.getSystemService(applicationContext, ConnectivityManager.class);
        if (connectivityManager != null && p3.b.checkSelfPermission(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            try {
                return new e(connectivityManager);
            } catch (Exception unused) {
            }
        }
        return d.f24532a;
    }
}
