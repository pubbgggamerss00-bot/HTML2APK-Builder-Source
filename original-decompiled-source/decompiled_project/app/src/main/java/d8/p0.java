package d8;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.play_billing.zzat;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzib;
import com.google.android.gms.internal.play_billing.zzil;
import com.google.android.gms.internal.play_billing.zzis;
import java.util.Objects;

/* loaded from: classes.dex */
public final class p0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0 f7541a;

    public /* synthetic */ p0(q0 q0Var) {
        this.f7541a = q0Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzc.zzm("BillingClientTesting", "Billing Override Service connected.");
        q0 q0Var = this.f7541a;
        q0Var.E = zzat.zzc(iBinder);
        q0Var.D = 2;
        int i10 = r0.f7549a;
        zzib zzibVarC = r0.c(26, zzil.BROADCAST_ACTION_UNSPECIFIED);
        Objects.requireNonNull(zzibVarC, "ApiSuccess should not be null");
        t0 t0Var = q0Var.f7455h;
        t0Var.getClass();
        try {
            t0Var.h(zzibVarC, (zzis) t0Var.f7555b);
        } catch (Throwable th2) {
            zzc.zzo("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzc.zzn("BillingClientTesting", "Billing Override Service disconnected.");
        q0 q0Var = this.f7541a;
        q0Var.E = null;
        q0Var.D = 0;
    }
}
