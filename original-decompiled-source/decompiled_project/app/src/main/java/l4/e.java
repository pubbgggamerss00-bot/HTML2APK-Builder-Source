package l4;

import android.app.job.JobParameters;
import androidx.credentials.playservices.controllers.blockstore.getrestorecredential.CredentialProviderGetRestoreCredentialController;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import d4.t;
import kotlin.jvm.internal.g0;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16710a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16711b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16712c;

    public /* synthetic */ e(int i10, Object obj, Object obj2) {
        this.f16710a = i10;
        this.f16711b = obj;
        this.f16712c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f16710a;
        Object obj = this.f16712c;
        Object obj2 = this.f16711b;
        switch (i10) {
            case 0:
                CredentialProviderGetRestoreCredentialController.invokePlayServices$lambda$2$0$0((t) obj2, (g0) obj);
                break;
            default:
                int i11 = JobInfoSchedulerService.f5837a;
                ((JobInfoSchedulerService) obj2).jobFinished((JobParameters) obj, false);
                break;
        }
    }
}
