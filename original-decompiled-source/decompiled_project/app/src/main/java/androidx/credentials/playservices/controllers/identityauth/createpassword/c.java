package androidx.credentials.playservices.controllers.identityauth.createpassword;

import android.app.job.JobParameters;
import com.basitce.htmltoapk.util.LauncherNameJob;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1487a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1488b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1489c;

    public /* synthetic */ c(int i10, Object obj, Object obj2) {
        this.f1487a = i10;
        this.f1488b = obj;
        this.f1489c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f1487a;
        Object obj = this.f1489c;
        Object obj2 = this.f1488b;
        switch (i10) {
            case 0:
                CredentialProviderCreatePasswordController.handleResponse$lambda$1$0((CredentialProviderCreatePasswordController) obj2, (e4.g) obj);
                break;
            default:
                int i11 = LauncherNameJob.f5831a;
                ((LauncherNameJob) obj2).jobFinished((JobParameters) obj, true);
                break;
        }
    }
}
