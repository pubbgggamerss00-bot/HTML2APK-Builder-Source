package d8;

import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzcs;
import com.google.android.gms.internal.play_billing.zzie;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class n0 implements zzcs {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x3.a f7532a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f7533b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q0 f7534c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7535d;

    public n0(q0 q0Var, int i10, x3.a aVar, Runnable runnable) {
        this.f7535d = i10;
        this.f7532a = aVar;
        this.f7533b = runnable;
        this.f7534c = q0Var;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcs
    public final void zza(Throwable th2) {
        boolean z10 = th2 instanceof TimeoutException;
        q0 q0Var = this.f7534c;
        if (z10) {
            q0Var.I(28, com.android.billingclient.api.b.f5629r, zzie.BILLING_OVERRIDE_SERVICE_CALL_TIMEOUT);
            zzc.zzo("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th2);
        } else {
            q0Var.I(28, com.android.billingclient.api.b.f5629r, zzie.BILLING_OVERRIDE_SERVICE_CALL_EXCEPTION);
            zzc.zzo("BillingClientTesting", "An error occurred while retrieving billing override.", th2);
        }
        this.f7533b.run();
    }

    @Override // com.google.android.gms.internal.play_billing.zzcs
    public final void zzb(Object obj) {
        Integer num = (Integer) obj;
        if (num.intValue() <= 0) {
            this.f7533b.run();
            return;
        }
        int iIntValue = num.intValue();
        q0 q0Var = this.f7534c;
        q0Var.getClass();
        com.android.billingclient.api.a aVarA = com.android.billingclient.api.b.a(iIntValue, "Billing override value was set by a license tester.");
        q0Var.I(this.f7535d, aVarA, zzie.LICENSE_TESTER_BILLING_OVERRIDE);
        this.f7532a.accept(aVarA);
    }
}
