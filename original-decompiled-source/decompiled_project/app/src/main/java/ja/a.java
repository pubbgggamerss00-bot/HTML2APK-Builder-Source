package ja;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.g;
import com.google.android.gms.dynamite.DynamiteModule;

@Deprecated
/* loaded from: classes2.dex */
public final class a extends g<GoogleSignInOptions> {

    /* renamed from: a, reason: collision with root package name */
    public static int f15673a = 1;

    public final synchronized int a() {
        int i10;
        try {
            i10 = f15673a;
            if (i10 == 1) {
                Context applicationContext = getApplicationContext();
                pa.d dVar = pa.d.f21387d;
                int iC = dVar.c(applicationContext, 12451000);
                if (iC == 0) {
                    i10 = 4;
                    f15673a = 4;
                } else if (dVar.a(applicationContext, null, iC) != null || DynamiteModule.a(applicationContext, "com.google.android.gms.auth.api.fallback") == 0) {
                    i10 = 2;
                    f15673a = 2;
                } else {
                    i10 = 3;
                    f15673a = 3;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return i10;
    }
}
