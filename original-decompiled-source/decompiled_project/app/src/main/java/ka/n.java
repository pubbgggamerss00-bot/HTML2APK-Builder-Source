package ka;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    public static n f16241b;

    /* renamed from: a, reason: collision with root package name */
    public final b f16242a;

    public n(Context context) {
        String strD;
        b bVarA = b.a(context);
        this.f16242a = bVarA;
        bVarA.b();
        String strD2 = bVarA.d("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strD2) || (strD = bVarA.d(b.f("googleSignInOptions", strD2))) == null) {
            return;
        }
        try {
            GoogleSignInOptions.d(strD);
        } catch (JSONException unused) {
        }
    }

    public static synchronized n a(Context context) {
        n nVar;
        Context applicationContext = context.getApplicationContext();
        synchronized (n.class) {
            nVar = f16241b;
            if (nVar == null) {
                nVar = new n(applicationContext);
                f16241b = nVar;
            }
        }
        return nVar;
        return nVar;
    }

    public final synchronized void b() {
        synchronized (this) {
            b bVar = this.f16242a;
            ReentrantLock reentrantLock = bVar.f16230a;
            reentrantLock.lock();
            try {
                bVar.f16231b.edit().clear().apply();
            } finally {
                reentrantLock.unlock();
            }
        }
    }
}
