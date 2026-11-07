package d8;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.basitce.htmltoapk.Hilt_HtmlToApkApplication;
import com.google.android.gms.internal.play_billing.zzau;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzcu;
import com.google.android.gms.internal.play_billing.zzcz;
import com.google.android.gms.internal.play_billing.zzhx;
import com.google.android.gms.internal.play_billing.zzib;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.android.gms.internal.play_billing.zzil;
import com.google.android.gms.internal.play_billing.zzis;
import com.google.android.gms.internal.play_billing.zzp;
import com.google.android.gms.internal.play_billing.zzr;
import com.google.android.gms.internal.play_billing.zzu;
import d8.c;
import i8.j;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class q0 extends e {
    public final Hilt_HtmlToApkApplication C;
    public volatile int D;
    public volatile zzau E;
    public volatile p0 F;
    public volatile ScheduledExecutorService G;

    public q0(aa.c cVar, Hilt_HtmlToApkApplication hilt_HtmlToApkApplication, c.a aVar) {
        super(cVar, hilt_HtmlToApkApplication, aVar);
        this.D = 0;
        this.C = hilt_HtmlToApkApplication;
    }

    public final zzcz H(final int i10) {
        if (N()) {
            return zzu.zza(new zzr() { // from class: d8.k0
                @Override // com.google.android.gms.internal.play_billing.zzr
                public final Object zza(zzp zzpVar) {
                    q0 q0Var = this.f7520a;
                    int i11 = i10;
                    try {
                        if (q0Var.E == null) {
                            throw null;
                        }
                        q0Var.E.zza(q0Var.C.getPackageName(), i11 != 2 ? i11 != 3 ? i11 != 4 ? i11 != 5 ? i11 != 6 ? "QUERY_PRODUCT_DETAILS_ASYNC" : "START_CONNECTION" : "IS_FEATURE_SUPPORTED" : "CONSUME_ASYNC" : "ACKNOWLEDGE_PURCHASE" : "LAUNCH_BILLING_FLOW", new o0(zzpVar));
                        return "billingOverrideService.getBillingOverride";
                    } catch (Exception e10) {
                        q0Var.I(28, com.android.billingclient.api.b.f5629r, zzie.BILLING_OVERRIDE_SERVICE_CALL_EXCEPTION);
                        zzc.zzo("BillingClientTesting", "An error occurred while retrieving billing override.", e10);
                        zzpVar.zzb(0);
                        return "billingOverrideService.getBillingOverride";
                    }
                }
            });
        }
        zzc.zzn("BillingClientTesting", "Billing Override Service is not ready.");
        I(28, com.android.billingclient.api.b.a(-1, "Billing Override Service connection is disconnected."), zzie.BILLING_OVERRIDE_SERVICE_CONNECTION_NOT_READY);
        return zzcu.zza(0);
    }

    public final void I(int i10, com.android.billingclient.api.a aVar, zzie zzieVar) {
        int i11 = r0.f7549a;
        zzhx zzhxVarB = r0.b(zzieVar, i10, aVar, null, zzil.BROADCAST_ACTION_UNSPECIFIED);
        Objects.requireNonNull(zzhxVarB, "ApiFailure should not be null");
        this.f7455h.b(zzhxVarB);
    }

    public final void J(int i10, x3.a aVar, Runnable runnable) {
        ScheduledExecutorService scheduledExecutorService;
        zzcz zzczVarH = H(i10);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        synchronized (this) {
            try {
                if (this.G == null) {
                    this.G = Executors.newSingleThreadScheduledExecutor();
                }
                scheduledExecutorService = this.G;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        zzcu.zzc(zzcu.zzb(zzczVarH, 28500L, timeUnit, scheduledExecutorService), new n0(this, i10, aVar, runnable), g());
    }

    public final synchronized boolean N() {
        if (this.D == 2 && this.E != null) {
            if (this.F != null) {
                return true;
            }
        }
        return false;
    }

    @Override // d8.e
    public final void a(final a aVar, final b bVar) {
        J(3, new x3.a() { // from class: d8.l0
            @Override // x3.a
            public final void accept(Object obj) {
                bVar.a((com.android.billingclient.api.a) obj);
            }
        }, new Runnable() { // from class: d8.m0
            @Override // java.lang.Runnable
            public final void run() {
                super/*d8.e*/.a(aVar, bVar);
            }
        });
    }

    @Override // d8.e
    public final void b(final h hVar, final i iVar) {
        J(4, new x3.a() { // from class: d8.i0
            @Override // x3.a
            public final void accept(Object obj) {
                String str = hVar.f7493a;
                iVar.a((com.android.billingclient.api.a) obj, str);
            }
        }, new Runnable() { // from class: d8.j0
            @Override // java.lang.Runnable
            public final void run() {
                super/*d8.e*/.b(hVar, iVar);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // d8.e
    public final com.android.billingclient.api.a c(Activity activity, g gVar) {
        int iIntValue = 0;
        try {
            iIntValue = ((Integer) H(2).get(28500L, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException e10) {
            I(28, com.android.billingclient.api.b.f5629r, zzie.BILLING_OVERRIDE_SERVICE_CALL_TIMEOUT);
            zzc.zzo("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", e10);
        } catch (Exception e11) {
            if (e11 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            I(28, com.android.billingclient.api.b.f5629r, zzie.BILLING_OVERRIDE_SERVICE_CALL_EXCEPTION);
            zzc.zzo("BillingClientTesting", "An error occurred while retrieving billing override.", e11);
        }
        if (iIntValue > 0) {
            com.android.billingclient.api.a aVarA = com.android.billingclient.api.b.a(iIntValue, "Billing override value was set by a license tester.");
            I(2, aVarA, zzie.LICENSE_TESTER_BILLING_OVERRIDE);
            G(aVarA);
            return aVarA;
        }
        try {
            return super.c(activity, gVar);
        } catch (Exception e12) {
            zzie zzieVar = zzie.BILLING_OVERRIDE_SERVICE_FALLBACK_ERROR;
            com.android.billingclient.api.a aVar = com.android.billingclient.api.b.f5619h;
            I(2, aVar, zzieVar);
            zzc.zzo("BillingClientTesting", "An internal error occurred.", e12);
            return aVar;
        }
    }

    @Override // d8.e
    public final void d(final n nVar, final i8.g gVar) {
        J(7, new x3.a() { // from class: d8.g0
            @Override // x3.a
            public final void accept(Object obj) {
                o oVar = new o(new ArrayList(), new ArrayList());
                gVar.a((com.android.billingclient.api.a) obj, oVar);
            }
        }, new Runnable() { // from class: d8.h0
            @Override // java.lang.Runnable
            public final void run() {
                super/*d8.e*/.d(nVar, gVar);
            }
        });
    }

    @Override // d8.e
    public final void f(j.c cVar) {
        synchronized (this) {
            if (N()) {
                zzc.zzm("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
                int i10 = r0.f7549a;
                zzib zzibVarC = r0.c(26, zzil.BROADCAST_ACTION_UNSPECIFIED);
                Objects.requireNonNull(zzibVarC, "ApiSuccess should not be null");
                t0 t0Var = this.f7455h;
                t0Var.getClass();
                try {
                    t0Var.h(zzibVarC, (zzis) t0Var.f7555b);
                } catch (Throwable th2) {
                    zzc.zzo("BillingLogger", "Unable to log.", th2);
                }
            } else if (this.D == 1) {
                zzc.zzn("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
            } else if (this.D == 3) {
                zzc.zzn("BillingClientTesting", "Billing Override Service Client was already closed and can't be reused. Please create another instance.");
                I(26, com.android.billingclient.api.b.a(-1, "Billing Override Service connection is disconnected."), zzie.BILLING_CLIENT_CLOSED);
            } else {
                this.D = 1;
                zzc.zzm("BillingClientTesting", "Starting Billing Override Service setup.");
                this.F = new p0(this);
                Intent intent = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
                intent.setPackage("com.google.android.apps.play.billingtestcompanion");
                Hilt_HtmlToApkApplication hilt_HtmlToApkApplication = this.C;
                List<ResolveInfo> listQueryIntentServices = hilt_HtmlToApkApplication.getPackageManager().queryIntentServices(intent, 0);
                zzie zzieVar = zzie.REASON_UNSPECIFIED;
                if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                    zzieVar = zzie.INTENT_SERVICE_NOT_FOUND;
                } else {
                    ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                    if (serviceInfo != null) {
                        String str = serviceInfo.packageName;
                        String str2 = serviceInfo.name;
                        if (!Objects.equals(str, "com.google.android.apps.play.billingtestcompanion") || str2 == null) {
                            zzieVar = zzie.BILLING_SERVICE_BLOCKED;
                            zzc.zzn("BillingClientTesting", "The device doesn't have valid Play Billing Lab.");
                        } else {
                            ComponentName componentName = new ComponentName(str, str2);
                            Intent intent2 = new Intent(intent);
                            intent2.setComponent(componentName);
                            if (hilt_HtmlToApkApplication.bindService(intent2, this.F, 1)) {
                                zzc.zzm("BillingClientTesting", "Billing Override Service was bonded successfully.");
                            } else {
                                zzieVar = zzie.BILLING_SERVICE_BLOCKED;
                                zzc.zzn("BillingClientTesting", "Connection to Billing Override Service is blocked.");
                            }
                        }
                    }
                }
                this.D = 0;
                zzc.zzm("BillingClientTesting", "Billing Override Service unavailable on device.");
                I(26, com.android.billingclient.api.b.a(2, "Billing Override Service unavailable on device."), zzieVar);
            }
        }
        o(cVar, 0);
    }

    public q0(aa.c cVar, Hilt_HtmlToApkApplication hilt_HtmlToApkApplication, m mVar, c.a aVar) {
        super(cVar, hilt_HtmlToApkApplication, mVar, aVar);
        this.D = 0;
        this.C = hilt_HtmlToApkApplication;
    }
}
