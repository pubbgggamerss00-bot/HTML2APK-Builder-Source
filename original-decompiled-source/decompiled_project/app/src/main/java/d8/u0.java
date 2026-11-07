package d8;

import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzji;

/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f7559a;

    /* renamed from: b, reason: collision with root package name */
    public r9.t f7560b;

    public final void a(zzji zzjiVar) {
        if (this.f7559a) {
            zzc.zzn("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            this.f7560b.a(new o9.a(zzjiVar));
        } catch (Throwable unused) {
            zzc.zzn("BillingLogger", "logging failed.");
        }
    }
}
