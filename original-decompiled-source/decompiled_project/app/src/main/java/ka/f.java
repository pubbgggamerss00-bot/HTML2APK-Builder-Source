package ka;

import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Set;
import java.util.concurrent.Semaphore;

/* loaded from: classes2.dex */
public final class f extends n5.a {

    /* renamed from: i, reason: collision with root package name */
    public final Semaphore f16235i;

    /* renamed from: j, reason: collision with root package name */
    public final Set f16236j;

    public f(SignInHubActivity signInHubActivity, Set set) {
        this.f18342b = false;
        this.f18343c = false;
        this.f18344d = true;
        this.f18345e = false;
        signInHubActivity.getApplicationContext();
        this.f16235i = new Semaphore(0);
        this.f16236j = set;
    }
}
