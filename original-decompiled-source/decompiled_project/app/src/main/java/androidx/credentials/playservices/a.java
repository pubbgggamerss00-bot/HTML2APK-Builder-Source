package androidx.credentials.playservices;

import android.app.Activity;
import android.content.Context;
import java.util.concurrent.Executor;
import pg.f0;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1436a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1437b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1438c;

    public /* synthetic */ a(int i10, Object obj, Object obj2) {
        this.f1436a = i10;
        this.f1437b = obj;
        this.f1438c = obj2;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f1436a) {
            case 0:
                return CredentialProviderPlayServicesImpl.onGetCredential$lambda$0((Executor) this.f1437b, (d4.t) this.f1438c);
            default:
                Context context = (Context) this.f1437b;
                i9.r rVar = (i9.r) this.f1438c;
                Activity activity = context instanceof Activity ? (Activity) context : null;
                if (activity != null) {
                    rVar.f(activity, "support_meal");
                }
                return f0.f21461a;
        }
    }
}
