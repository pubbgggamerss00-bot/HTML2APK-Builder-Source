package d8;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.billingclient.api.ProxyBillingActivity;
import com.android.billingclient.api.SkuDetails;
import com.basitce.htmltoapk.Hilt_HtmlToApkApplication;
import com.google.android.gms.internal.play_billing.zza;
import com.google.android.gms.internal.play_billing.zzam;
import com.google.android.gms.internal.play_billing.zzaz;
import com.google.android.gms.internal.play_billing.zzbi;
import com.google.android.gms.internal.play_billing.zzbl;
import com.google.android.gms.internal.play_billing.zzbt;
import com.google.android.gms.internal.play_billing.zzby;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzcu;
import com.google.android.gms.internal.play_billing.zzcz;
import com.google.android.gms.internal.play_billing.zzdj;
import com.google.android.gms.internal.play_billing.zzdk;
import com.google.android.gms.internal.play_billing.zzhv;
import com.google.android.gms.internal.play_billing.zzhx;
import com.google.android.gms.internal.play_billing.zzhz;
import com.google.android.gms.internal.play_billing.zzib;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.android.gms.internal.play_billing.zzil;
import com.google.android.gms.internal.play_billing.zziq;
import com.google.android.gms.internal.play_billing.zzis;
import com.google.android.gms.internal.play_billing.zzjt;
import com.google.android.gms.internal.play_billing.zzjv;
import d8.c;
import d8.g;
import d8.k;
import d8.n;
import i8.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e extends c {
    public final Long A;
    public final zzbl B;

    /* renamed from: c, reason: collision with root package name */
    public final String f7450c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7451d;

    /* renamed from: f, reason: collision with root package name */
    public volatile b1 f7453f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f7454g;

    /* renamed from: h, reason: collision with root package name */
    public final t0 f7455h;

    /* renamed from: i, reason: collision with root package name */
    public volatile zzam f7456i;

    /* renamed from: j, reason: collision with root package name */
    public volatile e0 f7457j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f7458k;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7460m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f7461n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f7462o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f7463p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f7464q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f7465r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f7466s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f7467t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f7468u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f7469v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f7470w;

    /* renamed from: x, reason: collision with root package name */
    public final aa.c f7471x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f7472y;

    /* renamed from: z, reason: collision with root package name */
    public ExecutorService f7473z;

    /* renamed from: a, reason: collision with root package name */
    public final Object f7448a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public volatile int f7449b = 0;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f7452e = new Handler(Looper.getMainLooper());

    /* renamed from: l, reason: collision with root package name */
    public int f7459l = 0;

    public e(aa.c cVar, Hilt_HtmlToApkApplication hilt_HtmlToApkApplication, m mVar, c.a aVar) {
        long jNextLong = new Random().nextLong();
        this.A = Long.valueOf(jNextLong);
        this.B = zzaz.zza();
        this.f7450c = "8.0.0";
        String strZ = z();
        this.f7451d = strZ;
        this.f7454g = hilt_HtmlToApkApplication.getApplicationContext();
        zziq zziqVarZzc = zzis.zzc();
        zziqVarZzc.zzs("8.0.0");
        if (strZ != null) {
            zziqVarZzc.zzt(strZ);
        }
        zziqVarZzc.zzq(this.f7454g.getPackageName());
        zziqVarZzc.zzn(jNextLong);
        zziqVarZzc.zzr(false);
        zziqVarZzc.zza(Build.VERSION.SDK_INT);
        zziqVarZzc.zzp(772604006L);
        try {
            zziqVarZzc.zzl(this.f7454g.getPackageManager().getPackageInfo(this.f7454g.getPackageName(), 0).versionCode);
        } catch (Throwable th2) {
            zzc.zzo("BillingClient", "Error getting app version code.", th2);
        }
        this.f7455h = new t0(this.f7454g, (zzis) zziqVarZzc.zze());
        if (mVar == null) {
            zzc.zzn("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f7453f = new b1(this.f7454g, mVar, this.f7455h);
        this.f7471x = cVar;
        this.f7472y = false;
        this.f7454g.getPackageName();
    }

    public static Future h(Callable callable, long j10, final Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            final Future futureSubmit = executorService.submit(callable);
            handler.postDelayed(new Runnable() { // from class: d8.u
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = futureSubmit;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    future.cancel(true);
                    zzc.zzn("BillingClient", "Async task is taking too long, cancel it!");
                    Runnable runnable2 = runnable;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, (long) (j10 * 0.95d));
            return futureSubmit;
        } catch (Exception e10) {
            zzc.zzo("BillingClient", "Async task throws exception!", e10);
            return null;
        }
    }

    public static void s(e eVar, int i10) {
        if (i10 != 0) {
            eVar.n(0);
            return;
        }
        synchronized (eVar.f7448a) {
            try {
                if (eVar.f7449b == 3) {
                    return;
                }
                eVar.n(2);
                b1 b1Var = eVar.f7453f != null ? eVar.f7453f : null;
                if (b1Var != null) {
                    boolean z10 = eVar.f7468u;
                    IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
                    IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
                    intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
                    b1Var.f7434f = z10;
                    a1 a1Var = b1Var.f7433e;
                    Context context = b1Var.f7429a;
                    a1Var.a(context, intentFilter2);
                    if (!b1Var.f7434f) {
                        b1Var.f7432d.a(context, intentFilter);
                        return;
                    }
                    a1 a1Var2 = b1Var.f7432d;
                    synchronized (a1Var2) {
                        try {
                            if (a1Var2.f7423a) {
                                return;
                            }
                            if (Build.VERSION.SDK_INT >= 33) {
                                context.registerReceiver(a1Var2, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != a1Var2.f7424b ? 4 : 2);
                            } else {
                                context.registerReceiver(a1Var2, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                            }
                            a1Var2.f7423a = true;
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }

    public static String z() {
        try {
            return (String) e8.a.class.getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    public final z0 A(com.android.billingclient.api.a aVar, zzie zzieVar, String str, Exception exc) {
        D(zzieVar, 9, aVar, r0.a(exc));
        zzc.zzo("BillingClient", str, exc);
        return new z0(aVar, null);
    }

    public final void B(int i10, com.android.billingclient.api.a aVar, zzie zzieVar) {
        try {
            int i11 = r0.f7549a;
            k(r0.b(zzieVar, i10, aVar, null, zzil.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th2) {
            zzc.zzo("BillingClient", "Unable to log.", th2);
        }
    }

    public final void C(zzie zzieVar, com.android.billingclient.api.a aVar, long j10) {
        try {
            int i10 = r0.f7549a;
            try {
                this.f7455h.c(r0.b(zzieVar, 2, aVar, null, zzil.BROADCAST_ACTION_UNSPECIFIED), this.f7459l, j10);
            } catch (Throwable th2) {
                zzc.zzo("BillingClient", "Unable to log.", th2);
            }
        } catch (Throwable th3) {
            zzc.zzo("BillingClient", "Unable to log.", th3);
        }
    }

    public final void D(zzie zzieVar, int i10, com.android.billingclient.api.a aVar, String str) {
        try {
            int i11 = r0.f7549a;
            k(r0.b(zzieVar, i10, aVar, str, zzil.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th2) {
            zzc.zzo("BillingClient", "Unable to log.", th2);
        }
    }

    public final void E(zzie zzieVar, com.android.billingclient.api.a aVar, long j10, boolean z10) {
        try {
            int i10 = r0.f7549a;
            try {
                this.f7455h.e(r0.b(zzieVar, 2, aVar, null, zzil.BROADCAST_ACTION_UNSPECIFIED), this.f7459l, j10, z10);
            } catch (Throwable th2) {
                zzc.zzo("BillingClient", "Unable to log.", th2);
            }
        } catch (Throwable th3) {
            zzc.zzo("BillingClient", "Unable to log.", th3);
        }
    }

    public final void F(zzie zzieVar, com.android.billingclient.api.a aVar, String str, long j10, boolean z10) {
        try {
            int i10 = r0.f7549a;
            try {
                this.f7455h.e(r0.b(zzieVar, 2, aVar, str, zzil.BROADCAST_ACTION_UNSPECIFIED), this.f7459l, j10, z10);
            } catch (Throwable th2) {
                zzc.zzo("BillingClient", "Unable to log.", th2);
            }
        } catch (Throwable th3) {
            zzc.zzo("BillingClient", "Unable to log.", th3);
        }
    }

    public final void G(final com.android.billingclient.api.a aVar) {
        if (Thread.interrupted()) {
            return;
        }
        this.f7452e.post(new Runnable() { // from class: d8.t
            @Override // java.lang.Runnable
            public final void run() {
                e eVar = this.f7553a;
                com.android.billingclient.api.a aVar2 = aVar;
                if (eVar.f7453f.f7430b != null) {
                    eVar.f7453f.f7430b.a(aVar2, null);
                } else {
                    zzc.zzn("BillingClient", "No valid listener is set in BroadcastManager");
                }
            }
        });
    }

    public void a(final a aVar, final b bVar) {
        if (h(new Callable() { // from class: d8.r
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzam zzamVar;
                e eVar = this.f7546a;
                b bVar2 = bVar;
                a aVar2 = aVar;
                try {
                    if (!eVar.q()) {
                        zzie zzieVar = zzie.SERVICE_CONNECTION_NOT_READY;
                        com.android.billingclient.api.a aVar3 = com.android.billingclient.api.b.f5621j;
                        eVar.B(3, aVar3, zzieVar);
                        bVar2.a(aVar3);
                        return null;
                    }
                    if (TextUtils.isEmpty(aVar2.f7420a)) {
                        zzc.zzn("BillingClient", "Please provide a valid purchase token.");
                        zzie zzieVar2 = zzie.EMPTY_PURCHASE_TOKEN;
                        com.android.billingclient.api.a aVar4 = com.android.billingclient.api.b.f5618g;
                        eVar.B(3, aVar4, zzieVar2);
                        bVar2.a(aVar4);
                        return null;
                    }
                    if (!eVar.f7461n) {
                        zzie zzieVar3 = zzie.API_VERSION_NOT_V9;
                        com.android.billingclient.api.a aVar5 = com.android.billingclient.api.b.f5612a;
                        eVar.B(3, aVar5, zzieVar3);
                        bVar2.a(aVar5);
                        return null;
                    }
                    synchronized (eVar.f7448a) {
                        zzamVar = eVar.f7456i;
                    }
                    if (zzamVar == null) {
                        eVar.i(bVar2, com.android.billingclient.api.b.f5621j, zzie.SERVICE_RESET_TO_NULL, null);
                        return null;
                    }
                    String packageName = eVar.f7454g.getPackageName();
                    String str = aVar2.f7420a;
                    String str2 = eVar.f7450c;
                    String str3 = eVar.f7451d;
                    long jLongValue = eVar.A.longValue();
                    int i10 = zzc.zza;
                    Bundle bundle = new Bundle();
                    zzc.zzc(bundle, str2, str3, jLongValue);
                    Bundle bundleZzd = zzamVar.zzd(9, packageName, str, bundle);
                    bVar2.a(com.android.billingclient.api.b.a(zzc.zzb(bundleZzd, "BillingClient"), zzc.zzj(bundleZzd, "BillingClient")));
                    return null;
                } catch (DeadObjectException e10) {
                    eVar.i(bVar2, com.android.billingclient.api.b.f5621j, zzie.ACKNOWLEDGE_PURCHASE_SERVICE_CALL_EXCEPTION, e10);
                    return null;
                } catch (Exception e11) {
                    eVar.i(bVar2, com.android.billingclient.api.b.f5619h, zzie.ACKNOWLEDGE_PURCHASE_SERVICE_CALL_EXCEPTION, e11);
                    return null;
                }
            }
        }, 30000L, new Runnable() { // from class: d8.s
            @Override // java.lang.Runnable
            public final void run() {
                zzie zzieVar = zzie.EXECUTE_ASYNC_TIMEOUT;
                com.android.billingclient.api.a aVar2 = com.android.billingclient.api.b.f5622k;
                this.f7550a.B(3, aVar2, zzieVar);
                bVar.a(aVar2);
            }
        }, t(), g()) == null) {
            com.android.billingclient.api.a aVarW = w();
            B(3, aVarW, zzie.MISSING_RESULT_FROM_EXECUTE_ASYNC);
            bVar.a(aVarW);
        }
    }

    public void b(final h hVar, final i iVar) {
        if (h(new Callable() { // from class: d8.v
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzam zzamVar;
                int iZza;
                String strZzj;
                e eVar = this.f7561a;
                i iVar2 = iVar;
                h hVar2 = hVar;
                if (!eVar.q()) {
                    zzie zzieVar = zzie.SERVICE_CONNECTION_NOT_READY;
                    com.android.billingclient.api.a aVar = com.android.billingclient.api.b.f5621j;
                    eVar.B(4, aVar, zzieVar);
                    iVar2.a(aVar, hVar2.f7493a);
                    return null;
                }
                String str = hVar2.f7493a;
                try {
                    zzc.zzm("BillingClient", "Consuming purchase with token: ".concat(str));
                    synchronized (eVar.f7448a) {
                        zzamVar = eVar.f7456i;
                    }
                    if (zzamVar == null) {
                        eVar.j(iVar2, str, com.android.billingclient.api.b.f5621j, zzie.SERVICE_RESET_TO_NULL, "Service has been reset to null.", null);
                        return null;
                    }
                    if (eVar.f7461n) {
                        String packageName = eVar.f7454g.getPackageName();
                        boolean z10 = eVar.f7461n;
                        String str2 = eVar.f7450c;
                        String str3 = eVar.f7451d;
                        long jLongValue = eVar.A.longValue();
                        Bundle bundle = new Bundle();
                        if (z10) {
                            zzc.zzc(bundle, str2, str3, jLongValue);
                        }
                        Bundle bundleZze = zzamVar.zze(9, packageName, str, bundle);
                        iZza = bundleZze.getInt("RESPONSE_CODE");
                        strZzj = zzc.zzj(bundleZze, "BillingClient");
                    } else {
                        iZza = zzamVar.zza(3, eVar.f7454g.getPackageName(), str);
                        strZzj = "";
                    }
                    com.android.billingclient.api.a aVarA = com.android.billingclient.api.b.a(iZza, strZzj);
                    if (iZza == 0) {
                        zzc.zzm("BillingClient", "Successfully consumed purchase.");
                        iVar2.a(aVarA, str);
                        return null;
                    }
                    int i10 = iZza;
                    eVar.j(iVar2, str, aVarA, zzie.BILLING_RESULT_RECEIVED_FROM_PHONESKY, "Error consuming purchase with token. Response code: " + i10, null);
                    return null;
                } catch (DeadObjectException e10) {
                    eVar.j(iVar2, str, com.android.billingclient.api.b.f5621j, zzie.CONSUME_PURCHASE_SERVICE_CALL_EXCEPTION, "Error consuming purchase!", e10);
                    return null;
                } catch (Exception e11) {
                    eVar.j(iVar2, str, com.android.billingclient.api.b.f5619h, zzie.CONSUME_PURCHASE_SERVICE_CALL_EXCEPTION, "Error consuming purchase!", e11);
                    return null;
                }
            }
        }, 30000L, new Runnable() { // from class: d8.x
            @Override // java.lang.Runnable
            public final void run() {
                zzie zzieVar = zzie.EXECUTE_ASYNC_TIMEOUT;
                com.android.billingclient.api.a aVar = com.android.billingclient.api.b.f5622k;
                this.f7568a.B(4, aVar, zzieVar);
                iVar.a(aVar, hVar.f7493a);
            }
        }, t(), g()) == null) {
            com.android.billingclient.api.a aVarW = w();
            B(4, aVarW, zzie.MISSING_RESULT_FROM_EXECUTE_ASYNC);
            iVar.a(aVarW, hVar.f7493a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.android.billingclient.api.a c(Activity activity, final g gVar) {
        boolean z10;
        int i10;
        String str;
        String str2;
        long j10;
        boolean z11;
        SkuDetails skuDetails;
        String str3;
        com.android.billingclient.api.a aVarA;
        k.a aVar;
        com.android.billingclient.api.a aVarA2;
        long j11;
        boolean z12;
        Future futureH;
        boolean z13;
        long j12;
        boolean z14;
        long j13;
        boolean z15;
        long j14;
        zzie zzieVarZzb;
        zzie zzieVar;
        boolean z16;
        long j15;
        String str4;
        Object obj;
        String str5;
        boolean z17;
        long j16;
        String str6;
        long j17;
        String str7;
        boolean z18;
        long jNextLong = new Random().nextLong();
        if (this.f7453f == null || this.f7453f.f7430b == null) {
            zzie zzieVar2 = zzie.MISSING_LISTENER;
            com.android.billingclient.api.a aVar2 = com.android.billingclient.api.b.f5628q;
            C(zzieVar2, aVar2, jNextLong);
            return aVar2;
        }
        try {
            int i11 = ((com.android.billingclient.api.a) x(1).get(Build.VERSION.SDK_INT < 29 ? 0L : 3000L, TimeUnit.MILLISECONDS)).f5606a;
            if (i11 == 0) {
                zzc.zzm("BillingClient", "Reconnection succeeded with result: " + i11);
            } else {
                zzc.zzn("BillingClient", "Reconnection failed with result: " + i11);
            }
        } catch (Exception e10) {
            if (e10 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            zzc.zzo("BillingClient", "Error during reconnection attempt: ", e10);
        }
        if (!r()) {
            zzie zzieVar3 = zzie.SERVICE_CONNECTION_NOT_READY;
            com.android.billingclient.api.a aVar3 = com.android.billingclient.api.b.f5621j;
            C(zzieVar3, aVar3, jNextLong);
            G(aVar3);
            return aVar3;
        }
        synchronized (this.f7448a) {
            try {
                z10 = false;
                if (this.f7457j != null) {
                    z10 = this.f7457j.f7477d > 0;
                    i10 = 0;
                } else {
                    i10 = 0;
                }
            } finally {
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(gVar.f7487e);
        zzbt zzbtVar = gVar.f7486d;
        SkuDetails skuDetails2 = (SkuDetails) zzby.zza(arrayList, null);
        g.a aVar4 = (g.a) zzby.zza(zzbtVar, null);
        if (skuDetails2 != null) {
            throw null;
        }
        k kVar = aVar4.f7488a;
        long j18 = jNextLong;
        String str8 = kVar.f7504c;
        String str9 = kVar.f7505d;
        if (str9.equals("subs") && !this.f7458k) {
            zzc.zzn("BillingClient", "Current client doesn't support subscriptions.");
            zzie zzieVar4 = zzie.SUBSCRIPTIONS_NOT_SUPPORTED;
            com.android.billingclient.api.a aVar5 = com.android.billingclient.api.b.f5623l;
            E(zzieVar4, aVar5, j18, z10);
            G(aVar5);
            return aVar5;
        }
        if (gVar.f7484b == null) {
            gVar.f7485c.getClass();
            if (gVar.f7483a) {
                str = null;
                if (!this.f7460m) {
                    zzc.zzn("BillingClient", "Current client doesn't support extra params for buy intent.");
                    zzie zzieVar5 = zzie.EXTRA_PARAMS_NOT_SUPPORTED;
                    com.android.billingclient.api.a aVar6 = com.android.billingclient.api.b.f5617f;
                    E(zzieVar5, aVar6, j18, z10);
                    G(aVar6);
                    return aVar6;
                }
            } else {
                zzbt zzbtVar2 = gVar.f7486d;
                str = null;
                if (zzbtVar2 != null) {
                    int size = zzbtVar2.size();
                    while (i10 < size) {
                        i10++;
                    }
                }
            }
        }
        if (arrayList.size() > 1 && !this.f7464q) {
            zzc.zzn("BillingClient", "Current client doesn't support multi-item purchases.");
            zzie zzieVar6 = zzie.MULTI_ITEM_NOT_SUPPORTED;
            com.android.billingclient.api.a aVar7 = com.android.billingclient.api.b.f5624m;
            E(zzieVar6, aVar7, j18, z10);
            G(aVar7);
            return aVar7;
        }
        if (!zzbtVar.isEmpty() && !this.f7465r) {
            zzc.zzn("BillingClient", "Current client doesn't support purchases with ProductDetails.");
            zzie zzieVar7 = zzie.PRODUCT_DETAILS_NOT_SUPPORTED;
            com.android.billingclient.api.a aVar8 = com.android.billingclient.api.b.f5626o;
            E(zzieVar7, aVar8, j18, z10);
            G(aVar8);
            return aVar8;
        }
        if (gVar.f7486d.isEmpty()) {
            aVarA = com.android.billingclient.api.b.f5620i;
            str2 = str8;
            j10 = j18;
            z11 = z10;
            skuDetails = skuDetails2;
            str3 = str9;
        } else {
            g.a aVar9 = (g.a) gVar.f7486d.get(0);
            str2 = str8;
            int i12 = 1;
            while (true) {
                j10 = j18;
                if (i12 < gVar.f7486d.size()) {
                    g.a aVar10 = (g.a) gVar.f7486d.get(i12);
                    if (!aVar10.f7488a.f7505d.equals(aVar9.f7488a.f7505d) && !aVar10.f7488a.f7505d.equals("play_pass_subs")) {
                        aVarA2 = com.android.billingclient.api.b.a(5, "All products should have same ProductType.");
                        z11 = z10;
                        skuDetails = skuDetails2;
                        str3 = str9;
                        break;
                    }
                    i12++;
                    j18 = j10;
                } else {
                    k kVar2 = aVar9.f7488a;
                    String strOptString = kVar2.f7503b.optString("packageName");
                    HashMap map = new HashMap();
                    HashSet hashSet = new HashSet();
                    zzbt zzbtVar3 = gVar.f7486d;
                    z11 = z10;
                    int size2 = zzbtVar3.size();
                    skuDetails = skuDetails2;
                    int i13 = 0;
                    while (true) {
                        if (i13 < size2) {
                            zzbt zzbtVar4 = zzbtVar3;
                            g.a aVar11 = (g.a) zzbtVar3.get(i13);
                            int i14 = size2;
                            k kVar3 = aVar11.f7488a;
                            int i15 = i13;
                            String str10 = kVar3.f7504c;
                            str3 = str9;
                            String str11 = kVar3.f7504c;
                            if (kVar3.f7509h != null && aVar11.f7489b == null) {
                                aVarA = com.android.billingclient.api.b.a(5, "offerToken is required for constructing ProductDetailsParams for subscriptions. Missing value for product id: " + str10);
                                break;
                            }
                            if (map.containsKey(str10)) {
                                aVarA = com.android.billingclient.api.b.a(5, "ProductId can not be duplicated. Invalid product id: " + str11 + ".");
                                break;
                            }
                            map.put(str11, aVar11);
                            if (!kVar2.f7505d.equals("play_pass_subs") && !kVar3.f7505d.equals("play_pass_subs") && !strOptString.equals(kVar3.f7503b.optString("packageName"))) {
                                aVarA = com.android.billingclient.api.b.a(5, "All products must have the same package name.");
                                break;
                            }
                            i13 = i15 + 1;
                            size2 = i14;
                            zzbtVar3 = zzbtVar4;
                            str9 = str3;
                        } else {
                            str3 = str9;
                            Iterator it = hashSet.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    String str12 = (String) it.next();
                                    if (map.containsKey(str12)) {
                                        aVarA = com.android.billingclient.api.b.a(5, "OldProductId must not be one of the products to be purchased. Invalid old product id: " + str12 + ".");
                                        break;
                                    }
                                } else {
                                    ArrayList arrayList2 = kVar2.f7510i;
                                    String str13 = aVar9.f7489b;
                                    if (str13 == null || arrayList2 == null) {
                                        aVarA = com.android.billingclient.api.b.f5620i;
                                    } else {
                                        int size3 = arrayList2.size();
                                        int i16 = 0;
                                        while (true) {
                                            if (i16 >= size3) {
                                                aVar = str;
                                                break;
                                            }
                                            Object obj2 = arrayList2.get(i16);
                                            i16++;
                                            aVar = (k.a) obj2;
                                            if (str13.equals(aVar.f7512b)) {
                                                break;
                                            }
                                        }
                                        if (aVar != 0 && aVar.f7515e != null) {
                                            aVarA = com.android.billingclient.api.b.a(5, "Both autoPayDetails and autoPayBalanceThreshold is required for constructing ProductDetailsParams for autopay.");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        aVarA2 = aVarA;
        if (aVarA2 != com.android.billingclient.api.b.f5620i) {
            E(zzie.INVALID_BILLING_FLOW_PARAMS, aVarA2, j10, z11);
            G(aVarA2);
            return aVarA2;
        }
        long j19 = j10;
        boolean z19 = z11;
        if (this.f7460m) {
            boolean z20 = this.f7461n;
            this.f7471x.getClass();
            this.f7471x.getClass();
            boolean z21 = this.f7472y;
            String str14 = this.f7450c;
            String str15 = this.f7451d;
            long jLongValue = this.A.longValue();
            this.f7454g.getPackageName();
            int i17 = zzc.zza;
            final Bundle bundle = new Bundle();
            zzc.zzc(bundle, str14, str15, jLongValue);
            bundle.putLong("billingClientTransactionId", j19);
            gVar.f7485c.getClass();
            if (!TextUtils.isEmpty(gVar.f7484b)) {
                bundle.putString("accountId", gVar.f7484b);
            }
            if (TextUtils.isEmpty(str)) {
                str5 = str;
            } else {
                str5 = str;
                bundle.putString("obfuscatedProfileId", str5);
            }
            if (!TextUtils.isEmpty(str5)) {
                bundle.putStringArrayList("skusToReplace", new ArrayList(Arrays.asList(str5)));
            }
            gVar.f7485c.getClass();
            if (!TextUtils.isEmpty(str5)) {
                gVar.f7485c.getClass();
                bundle.putString("oldSkuPurchaseToken", str5);
            }
            if (!TextUtils.isEmpty(str5)) {
                bundle.putString("oldSkuPurchaseId", str5);
            }
            gVar.f7485c.getClass();
            if (!TextUtils.isEmpty(str5)) {
                gVar.f7485c.getClass();
                bundle.putString("originalExternalTransactionId", str5);
            }
            if (!TextUtils.isEmpty(str5)) {
                bundle.putString("paymentsPurchaseParams", str5);
            }
            if (z20) {
                z17 = true;
                bundle.putBoolean("enablePendingPurchases", true);
            } else {
                z17 = true;
            }
            if (z21) {
                bundle.putBoolean("enableAlternativeBilling", z17);
            }
            ArrayList arrayList3 = new ArrayList();
            for (g.a aVar12 : gVar.f7486d) {
            }
            if (!arrayList3.isEmpty()) {
                zzdj zzdjVarZza = zzdk.zza();
                zzdjVarZza.zza(arrayList3);
                bundle.putByteArray("subscriptionProductReplacementParamsList", ((zzdk) zzdjVarZza.zze()).zzM());
            }
            if (arrayList.isEmpty()) {
                ArrayList arrayList4 = new ArrayList(zzbtVar.size() - 1);
                ArrayList arrayList5 = new ArrayList(zzbtVar.size() - 1);
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = new ArrayList();
                int i18 = 0;
                while (i18 < zzbtVar.size()) {
                    g.a aVar13 = (g.a) zzbtVar.get(i18);
                    k kVar4 = aVar13.f7488a;
                    if (!kVar4.f7507f.isEmpty()) {
                        arrayList6.add(kVar4.f7507f);
                    }
                    arrayList7.add(aVar13.f7489b);
                    String str16 = kVar4.f7508g;
                    ArrayList arrayList10 = kVar4.f7510i;
                    if (arrayList10 == null || arrayList10.isEmpty()) {
                        str6 = str16;
                    } else {
                        ArrayList arrayList11 = kVar4.f7510i;
                        int size4 = arrayList11.size();
                        str6 = str16;
                        int i19 = 0;
                        while (i19 < size4) {
                            Object obj3 = arrayList11.get(i19);
                            int i20 = i19 + 1;
                            k.a aVar14 = (k.a) obj3;
                            j17 = j19;
                            if (!TextUtils.isEmpty(aVar14.f7514d)) {
                                str7 = aVar14.f7514d;
                                break;
                            }
                            i19 = i20;
                            j19 = j17;
                        }
                    }
                    j17 = j19;
                    str7 = str6;
                    if (!TextUtils.isEmpty(str7)) {
                        arrayList8.add(str7);
                    }
                    if (i18 > 0) {
                        arrayList4.add(((g.a) zzbtVar.get(i18)).f7488a.f7504c);
                        arrayList5.add(((g.a) zzbtVar.get(i18)).f7488a.f7505d);
                    }
                    i18++;
                    j19 = j17;
                }
                j16 = j19;
                bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList7);
                if (!arrayList9.isEmpty()) {
                    bundle.putIntegerArrayList("autoPayBalanceThresholdList", arrayList9);
                }
                if (!arrayList6.isEmpty()) {
                    bundle.putStringArrayList("skuDetailsTokens", arrayList6);
                }
                if (!arrayList8.isEmpty()) {
                    bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList8);
                }
                if (!arrayList4.isEmpty()) {
                    bundle.putStringArrayList("additionalSkus", arrayList4);
                    bundle.putStringArrayList("additionalSkuTypes", arrayList5);
                }
            } else {
                ArrayList arrayList12 = new ArrayList();
                new ArrayList();
                new ArrayList();
                new ArrayList();
                new ArrayList();
                Iterator it2 = arrayList.iterator();
                if (it2.hasNext()) {
                    ((SkuDetails) it2.next()).getClass();
                    throw null;
                }
                if (!arrayList12.isEmpty()) {
                    bundle.putStringArrayList("skuDetailsTokens", arrayList12);
                }
                if (arrayList.size() > 1) {
                    ArrayList arrayList13 = new ArrayList(arrayList.size() - 1);
                    ArrayList arrayList14 = new ArrayList(arrayList.size() - 1);
                    if (1 < arrayList.size()) {
                        ((SkuDetails) arrayList.get(1)).getClass();
                        throw null;
                    }
                    bundle.putStringArrayList("additionalSkus", arrayList13);
                    bundle.putStringArrayList("additionalSkuTypes", arrayList14);
                }
                j16 = j19;
            }
            if (bundle.containsKey("SKU_OFFER_ID_TOKEN_LIST") && !this.f7462o) {
                zzie zzieVar8 = zzie.OFFER_ID_TOKEN_NOT_SUPPORTED;
                com.android.billingclient.api.a aVar15 = com.android.billingclient.api.b.f5625n;
                E(zzieVar8, aVar15, j16, z19);
                G(aVar15);
                return aVar15;
            }
            z12 = z19;
            j11 = j16;
            if (skuDetails != null) {
                throw null;
            }
            if (TextUtils.isEmpty(aVar4.f7488a.f7503b.optString("packageName"))) {
                z18 = false;
            } else {
                bundle.putString("skuPackageName", aVar4.f7488a.f7503b.optString("packageName"));
                z18 = true;
            }
            if (!TextUtils.isEmpty(null)) {
                bundle.putString("accountName", null);
            }
            Intent intent = activity.getIntent();
            if (intent == null) {
                zzc.zzn("BillingClient", "Activity's intent is null.");
            } else if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                bundle.putString("proxyPackage", stringExtra);
                try {
                    bundle.putString("proxyPackageVersion", this.f7454g.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                } catch (PackageManager.NameNotFoundException unused) {
                    bundle.putString("proxyPackageVersion", "package not found");
                }
            }
            final int i21 = (!this.f7465r || zzbtVar.isEmpty()) ? (this.f7463p && z18) ? 15 : this.f7461n ? 9 : 6 : 17;
            final String str17 = str2;
            final String str18 = str3;
            futureH = h(new Callable(i21, str17, str18, gVar, bundle) { // from class: d8.c1

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ int f7440b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f7441c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ String f7442d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ Bundle f7443e;

                {
                    this.f7443e = bundle;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzam zzamVar;
                    e eVar = this.f7439a;
                    int i22 = this.f7440b;
                    String str19 = this.f7441c;
                    String str20 = this.f7442d;
                    Bundle bundle2 = this.f7443e;
                    try {
                        synchronized (eVar.f7448a) {
                            zzamVar = eVar.f7456i;
                        }
                        return zzamVar == null ? zzc.zzd(com.android.billingclient.api.b.f5621j, zzie.SERVICE_RESET_TO_NULL) : zzamVar.zzg(i22, eVar.f7454g.getPackageName(), str19, str20, null, bundle2);
                    } catch (DeadObjectException e11) {
                        return zzc.zze(com.android.billingclient.api.b.f5621j, zzie.LAUNCH_BILLING_FLOW_EXCEPTION, r0.a(e11));
                    } catch (Exception e12) {
                        return zzc.zze(com.android.billingclient.api.b.f5619h, zzie.LAUNCH_BILLING_FLOW_EXCEPTION, r0.a(e12));
                    }
                }
            }, 5000L, null, this.f7452e, g());
            j12 = str18;
            z13 = bundle;
        } else {
            j11 = j19;
            z12 = z19;
            final String str19 = str2;
            final String str20 = str3;
            futureH = h(new Callable() { // from class: d8.d1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzam zzamVar;
                    e eVar = this.f7445a;
                    String str21 = str19;
                    String str22 = str20;
                    try {
                        synchronized (eVar.f7448a) {
                            zzamVar = eVar.f7456i;
                        }
                        return zzamVar == null ? zzc.zzd(com.android.billingclient.api.b.f5621j, zzie.SERVICE_RESET_TO_NULL) : zzamVar.zzf(3, eVar.f7454g.getPackageName(), str21, str22, null);
                    } catch (DeadObjectException e11) {
                        return zzc.zze(com.android.billingclient.api.b.f5621j, zzie.LAUNCH_BILLING_FLOW_EXCEPTION, r0.a(e11));
                    } catch (Exception e12) {
                        return zzc.zze(com.android.billingclient.api.b.f5619h, zzie.LAUNCH_BILLING_FLOW_EXCEPTION, r0.a(e12));
                    }
                }
            }, 5000L, null, this.f7452e, g());
            j12 = str20;
            z13 = z19;
        }
        try {
            if (futureH == null) {
                try {
                    zzie zzieVar9 = zzie.MISSING_RESULT_FROM_EXECUTE_ASYNC;
                    com.android.billingclient.api.a aVar16 = com.android.billingclient.api.b.f5614c;
                    E(zzieVar9, aVar16, j11, z12);
                    G(aVar16);
                    return aVar16;
                } catch (CancellationException e11) {
                    e = e11;
                    z15 = z12;
                    j14 = j11;
                    zzc.zzo("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                    zzie zzieVar10 = zzie.LAUNCH_BILLING_FLOW_TIMEOUT;
                    com.android.billingclient.api.a aVar17 = com.android.billingclient.api.b.f5622k;
                    F(zzieVar10, aVar17, r0.a(e), j14, z15);
                    G(aVar17);
                    return aVar17;
                } catch (TimeoutException e12) {
                    e = e12;
                    z15 = z12;
                    j14 = j11;
                    zzc.zzo("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                    zzie zzieVar102 = zzie.LAUNCH_BILLING_FLOW_TIMEOUT;
                    com.android.billingclient.api.a aVar172 = com.android.billingclient.api.b.f5622k;
                    F(zzieVar102, aVar172, r0.a(e), j14, z15);
                    G(aVar172);
                    return aVar172;
                } catch (Exception e13) {
                    e = e13;
                    z14 = z12;
                    j13 = j11;
                    zzc.zzo("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                    zzie zzieVar11 = zzie.LAUNCH_BILLING_FLOW_EXCEPTION;
                    com.android.billingclient.api.a aVar18 = com.android.billingclient.api.b.f5621j;
                    F(zzieVar11, aVar18, r0.a(e), j13, z14);
                    G(aVar18);
                    return aVar18;
                }
            }
            boolean z22 = z12;
            long j20 = j11;
            Bundle bundle2 = (Bundle) futureH.get(5000L, TimeUnit.MILLISECONDS);
            int iZzb = zzc.zzb(bundle2, "BillingClient");
            String strZzj = zzc.zzj(bundle2, "BillingClient");
            if (iZzb == 0) {
                Intent intent2 = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
                intent2.putExtra("BUY_INTENT", (PendingIntent) bundle2.getParcelable("BUY_INTENT"));
                intent2.putExtra("billingClientTransactionId", j20);
                intent2.putExtra("wasServiceAutoReconnected", z22);
                activity.startActivity(intent2);
                return com.android.billingclient.api.b.f5620i;
            }
            zzc.zzn("BillingClient", "Unable to buy item, Error response code: " + iZzb);
            com.android.billingclient.api.a aVarA3 = com.android.billingclient.api.b.a(iZzb, strZzj);
            try {
                if (bundle2 == null || (obj = bundle2.get("LOG_REASON")) == null) {
                    zzieVarZzb = zzie.REASON_UNSPECIFIED;
                } else if (obj instanceof Integer) {
                    zzieVarZzb = zzie.zzb(((Integer) obj).intValue());
                } else {
                    zzc.zzn("BillingClient", "Unexpected type for bundle log reason: " + obj.getClass().getName());
                    zzieVarZzb = zzie.REASON_UNSPECIFIED;
                }
            } catch (Throwable th2) {
                zzc.zzn("BillingClient", "Failed to get log reason from bundle: ".concat(String.valueOf(th2.getMessage())));
                zzieVarZzb = zzie.REASON_UNSPECIFIED;
            }
            if (zzieVarZzb == zzie.REASON_UNSPECIFIED) {
                zzieVarZzb = zzie.BILLING_RESULT_RECEIVED_FROM_PHONESKY;
            }
            zzie zzieVar12 = zzieVarZzb;
            try {
                if (bundle2 != null) {
                    try {
                        String string = bundle2.getString("ADDITIONAL_LOG_DETAILS");
                        zzieVar = zzieVar12;
                        z16 = z22;
                        j15 = j20;
                        str4 = string;
                    } catch (Throwable th3) {
                        zzc.zzn("BillingClient", "Failed to get additional log details from bundle: ".concat(String.valueOf(th3.getMessage())));
                    }
                    F(zzieVar, aVarA3, str4, j15, z16);
                    G(aVarA3);
                    return aVarA3;
                }
                F(zzieVar, aVarA3, str4, j15, z16);
                G(aVarA3);
                return aVarA3;
            } catch (CancellationException e14) {
                e = e14;
                j14 = j15;
                z15 = z16;
                zzc.zzo("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                zzie zzieVar1022 = zzie.LAUNCH_BILLING_FLOW_TIMEOUT;
                com.android.billingclient.api.a aVar1722 = com.android.billingclient.api.b.f5622k;
                F(zzieVar1022, aVar1722, r0.a(e), j14, z15);
                G(aVar1722);
                return aVar1722;
            } catch (TimeoutException e15) {
                e = e15;
                j14 = j15;
                z15 = z16;
                zzc.zzo("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                zzie zzieVar10222 = zzie.LAUNCH_BILLING_FLOW_TIMEOUT;
                com.android.billingclient.api.a aVar17222 = com.android.billingclient.api.b.f5622k;
                F(zzieVar10222, aVar17222, r0.a(e), j14, z15);
                G(aVar17222);
                return aVar17222;
            } catch (Exception e16) {
                e = e16;
                j13 = j15;
                z14 = z16;
                zzc.zzo("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                zzie zzieVar112 = zzie.LAUNCH_BILLING_FLOW_EXCEPTION;
                com.android.billingclient.api.a aVar182 = com.android.billingclient.api.b.f5621j;
                F(zzieVar112, aVar182, r0.a(e), j13, z14);
                G(aVar182);
                return aVar182;
            }
            zzieVar = zzieVar12;
            z16 = z22;
            j15 = j20;
            str4 = null;
        } catch (CancellationException e17) {
            e = e17;
        } catch (TimeoutException e18) {
            e = e18;
            j14 = j12;
            z15 = z13;
        } catch (Exception e19) {
            e = e19;
        }
    }

    public void d(final n nVar, final i8.g gVar) {
        if (h(new Callable() { // from class: d8.w
            @Override // java.util.concurrent.Callable
            public final Object call() {
                f0 f0Var;
                zzam zzamVar;
                int i10;
                int i11;
                e eVar = this.f7564a;
                i8.g gVar2 = gVar;
                n nVar2 = nVar;
                Exception exc = null;
                if (!eVar.q()) {
                    zzie zzieVar = zzie.SERVICE_CONNECTION_NOT_READY;
                    com.android.billingclient.api.a aVar = com.android.billingclient.api.b.f5621j;
                    eVar.B(7, aVar, zzieVar);
                    gVar2.a(aVar, new o(zzbt.zzk(), zzbt.zzk()));
                    return null;
                }
                if (!eVar.f7465r) {
                    zzc.zzn("BillingClient", "Querying product details is not supported.");
                    zzie zzieVar2 = zzie.PRODUCT_DETAILS_NOT_SUPPORTED;
                    com.android.billingclient.api.a aVar2 = com.android.billingclient.api.b.f5626o;
                    eVar.B(7, aVar2, zzieVar2);
                    gVar2.a(aVar2, new o(zzbt.zzk(), zzbt.zzk()));
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                String str = ((n.b) nVar2.f7526a.get(0)).f7529b;
                zzbt zzbtVar = nVar2.f7526a;
                int size = zzbtVar.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size) {
                        f0Var = new f0(0, "", arrayList, arrayList2);
                        break;
                    }
                    int i13 = i12 + 20;
                    ArrayList arrayList3 = new ArrayList(zzbtVar.subList(i12, i13 > size ? size : i13));
                    ArrayList<String> arrayList4 = new ArrayList<>();
                    int size2 = arrayList3.size();
                    for (int i14 = 0; i14 < size2; i14++) {
                        arrayList4.add(((n.b) arrayList3.get(i14)).f7528a);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putStringArrayList("ITEM_ID_LIST", arrayList4);
                    String str2 = eVar.f7450c;
                    bundle.putString("playBillingLibraryVersion", str2);
                    try {
                        synchronized (eVar.f7448a) {
                            zzamVar = eVar.f7456i;
                        }
                        if (zzamVar == null) {
                            f0Var = eVar.u(com.android.billingclient.api.b.f5621j, zzie.SERVICE_RESET_TO_NULL, "Service has been reset to null.", exc);
                            break;
                        }
                        if (eVar.f7466s) {
                            eVar.f7471x.getClass();
                        }
                        eVar.y();
                        eVar.y();
                        eVar.y();
                        eVar.y();
                        Bundle bundleZzj = zzamVar.zzj(true != eVar.f7467t ? 17 : 20, eVar.f7454g.getPackageName(), str, bundle, zzc.zzf(str2, eVar.f7451d, arrayList3, null, null, zza.zza(false, true, false, true, false, true), eVar.A.longValue()));
                        if (bundleZzj == null) {
                            f0Var = eVar.u(com.android.billingclient.api.b.f5627p, zzie.NULL_BUNDLE_FROM_GET_SKU_DETAILS_SERVICE_CALL, "queryProductDetailsAsync got empty product details response.", null);
                            break;
                        }
                        if (bundleZzj.containsKey("DETAILS_LIST")) {
                            ArrayList<String> stringArrayList = bundleZzj.getStringArrayList("DETAILS_LIST");
                            if (stringArrayList == null) {
                                f0Var = eVar.u(com.android.billingclient.api.b.f5627p, zzie.NULL_DETAILS_LIST_IN_GET_SKU_DETAILS_RESPONSE, "queryProductDetailsAsync got null response list", null);
                                break;
                            }
                            ArrayList arrayList5 = new ArrayList();
                            int size3 = stringArrayList.size();
                            int i15 = 0;
                            while (i15 < size3) {
                                zzbt zzbtVar2 = zzbtVar;
                                try {
                                    k kVar = new k(stringArrayList.get(i15));
                                    zzc.zzm("BillingClient", "Got product details: ".concat(kVar.toString()));
                                    arrayList5.add(kVar);
                                    i15++;
                                    zzbtVar = zzbtVar2;
                                } catch (JSONException e10) {
                                    f0Var = eVar.u(com.android.billingclient.api.b.a(6, "Error trying to decode SkuDetails."), zzie.ERROR_DECODING_SKU_DETAILS, "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e10);
                                }
                            }
                            zzbt zzbtVar3 = zzbtVar;
                            ArrayList<String> stringArrayList2 = bundleZzj.getStringArrayList("UNFETCHED_PRODUCT_LIST");
                            new ArrayList();
                            try {
                                ArrayList arrayList6 = new ArrayList();
                                if (stringArrayList2 != null) {
                                    int size4 = stringArrayList2.size();
                                    int i16 = 0;
                                    while (i16 < size4) {
                                        String str3 = stringArrayList2.get(i16);
                                        i16++;
                                        q qVar = new q(str3);
                                        zzc.zzm("BillingClient", "Got unfetchedProduct: ".concat(qVar.toString()));
                                        arrayList6.add(qVar);
                                    }
                                } else {
                                    int size5 = arrayList3.size();
                                    int i17 = 0;
                                    while (i17 < size5) {
                                        Object obj = arrayList3.get(i17);
                                        int i18 = i17 + 1;
                                        n.b bVar = (n.b) obj;
                                        int size6 = arrayList5.size();
                                        int i19 = 0;
                                        while (true) {
                                            if (i19 >= size6) {
                                                i10 = size5;
                                                i11 = i18;
                                                arrayList6.add(new q(new JSONObject().put("productId", bVar.f7528a).put("type", bVar.f7529b).put("statusCode", 0).toString()));
                                                break;
                                            }
                                            Object obj2 = arrayList5.get(i19);
                                            i19++;
                                            k kVar2 = (k) obj2;
                                            i10 = size5;
                                            i11 = i18;
                                            if (!bVar.f7528a.equals(kVar2.f7504c) || !bVar.f7529b.equals(kVar2.f7505d)) {
                                                size5 = i10;
                                                i18 = i11;
                                            }
                                        }
                                        size5 = i10;
                                        i17 = i11;
                                    }
                                }
                                arrayList.addAll(arrayList5);
                                arrayList2.addAll(arrayList6);
                                i12 = i13;
                                zzbtVar = zzbtVar3;
                                exc = null;
                            } catch (JSONException e11) {
                                f0Var = eVar.u(com.android.billingclient.api.b.a(6, "Error trying to decode SkuDetails."), zzie.ERROR_DECODING_SKU_DETAILS, "Got a JSON exception trying to decode UnfetchedProduct. \n Exception: ", e11);
                            }
                        } else {
                            int iZzb = zzc.zzb(bundleZzj, "BillingClient");
                            String strZzj = zzc.zzj(bundleZzj, "BillingClient");
                            f0Var = iZzb != 0 ? eVar.u(com.android.billingclient.api.b.a(iZzb, strZzj), zzie.BILLING_RESULT_RECEIVED_FROM_PHONESKY, j2.y.a(iZzb, "getSkuDetails() failed for queryProductDetailsAsync. Response code: "), null) : eVar.u(com.android.billingclient.api.b.a(6, strZzj), zzie.MISSING_DETAILS_LIST_IN_GET_SKU_DETAILS_RESPONSE, "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.", null);
                        }
                    } catch (DeadObjectException e12) {
                        f0Var = eVar.u(com.android.billingclient.api.b.f5621j, zzie.GET_SKU_DETAILS_SERVICE_CALL_EXCEPTION, "queryProductDetailsAsync got a remote exception (try to reconnect).", e12);
                    } catch (Exception e13) {
                        f0Var = eVar.u(com.android.billingclient.api.b.f5619h, zzie.GET_SKU_DETAILS_SERVICE_CALL_EXCEPTION, "queryProductDetailsAsync got a remote exception (try to reconnect).", e13);
                    }
                }
                gVar2.a(com.android.billingclient.api.b.a(f0Var.f7481c, f0Var.f7482d), new o(f0Var.f7479a, f0Var.f7480b));
                return null;
            }
        }, 30000L, new Runnable() { // from class: d8.y
            @Override // java.lang.Runnable
            public final void run() {
                zzie zzieVar = zzie.EXECUTE_ASYNC_TIMEOUT;
                com.android.billingclient.api.a aVar = com.android.billingclient.api.b.f5622k;
                this.f7572a.B(7, aVar, zzieVar);
                gVar.a(aVar, new o(zzbt.zzk(), zzbt.zzk()));
            }
        }, t(), g()) == null) {
            com.android.billingclient.api.a aVarW = w();
            B(7, aVarW, zzie.MISSING_RESULT_FROM_EXECUTE_ASYNC);
            gVar.a(aVarW, new o(zzbt.zzk(), zzbt.zzk()));
        }
    }

    public final void e(p pVar, final l lVar) {
        if (h(new b0(this, lVar, pVar.f7539a), 30000L, new Runnable() { // from class: d8.z
            @Override // java.lang.Runnable
            public final void run() {
                zzie zzieVar = zzie.EXECUTE_ASYNC_TIMEOUT;
                com.android.billingclient.api.a aVar = com.android.billingclient.api.b.f5622k;
                this.f7575a.B(9, aVar, zzieVar);
                lVar.a(aVar, zzbt.zzk());
            }
        }, t(), g()) == null) {
            com.android.billingclient.api.a aVarW = w();
            B(9, aVarW, zzie.MISSING_RESULT_FROM_EXECUTE_ASYNC);
            lVar.a(aVarW, zzbt.zzk());
        }
    }

    public void f(j.c cVar) {
        o(cVar, 0);
    }

    public final synchronized ExecutorService g() {
        try {
            if (this.f7473z == null) {
                this.f7473z = Executors.newFixedThreadPool(zzc.zza, new a0(this));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f7473z;
    }

    public final void i(b bVar, com.android.billingclient.api.a aVar, zzie zzieVar, Exception exc) {
        zzc.zzo("BillingClient", "Error in acknowledge purchase!", exc);
        D(zzieVar, 3, aVar, r0.a(exc));
        bVar.a(aVar);
    }

    public final void j(i iVar, String str, com.android.billingclient.api.a aVar, zzie zzieVar, String str2, Exception exc) {
        zzc.zzo("BillingClient", str2, exc);
        D(zzieVar, 4, aVar, r0.a(exc));
        iVar.a(aVar, str);
    }

    public final void k(zzhx zzhxVar) {
        try {
            t0 t0Var = this.f7455h;
            int i10 = this.f7459l;
            t0Var.getClass();
            try {
                zziq zziqVar = (zziq) ((zzis) t0Var.f7555b).zzm();
                zziqVar.zzm(i10);
                t0Var.f7555b = (zzis) zziqVar.zze();
                t0Var.b(zzhxVar);
            } catch (Throwable th2) {
                zzc.zzo("BillingLogger", "Unable to log.", th2);
            }
        } catch (Throwable th3) {
            zzc.zzo("BillingClient", "Unable to log.", th3);
        }
    }

    public final void l(zzib zzibVar) {
        try {
            t0 t0Var = this.f7455h;
            int i10 = this.f7459l;
            t0Var.getClass();
            try {
                zziq zziqVar = (zziq) ((zzis) t0Var.f7555b).zzm();
                zziqVar.zzm(i10);
                zzis zzisVar = (zzis) zziqVar.zze();
                t0Var.f7555b = zzisVar;
                try {
                    t0Var.h(zzibVar, zzisVar);
                } catch (Throwable th2) {
                    zzc.zzo("BillingLogger", "Unable to log.", th2);
                }
            } catch (Throwable th3) {
                zzc.zzo("BillingLogger", "Unable to log.", th3);
            }
        } catch (Throwable th4) {
            zzc.zzo("BillingClient", "Unable to log.", th4);
        }
    }

    public final void m(int i10, com.android.billingclient.api.a aVar, zzie zzieVar) {
        try {
            int i11 = r0.f7549a;
            zzhv zzhvVar = (zzhv) r0.b(zzieVar, 6, aVar, null, zzil.BROADCAST_ACTION_UNSPECIFIED).zzm();
            zzjt zzjtVarZzc = zzjv.zzc();
            zzjtVarZzc.zza(i10 > 0);
            zzjtVarZzc.zzl(i10);
            zzhvVar.zzo(zzjtVarZzc);
            k((zzhx) zzhvVar.zze());
        } catch (Throwable th2) {
            zzc.zzo("BillingClient", "Unable to log.", th2);
        }
    }

    public final void n(int i10) {
        synchronized (this.f7448a) {
            try {
                if (this.f7449b == 3) {
                    return;
                }
                int i11 = this.f7449b;
                zzc.zzm("BillingClient", "Setting clientState from " + (i11 != 0 ? i11 != 1 ? i11 != 2 ? "CLOSED" : "CONNECTED" : "CONNECTING" : "DISCONNECTED") + " to " + (i10 != 0 ? i10 != 1 ? i10 != 2 ? "CLOSED" : "CONNECTED" : "CONNECTING" : "DISCONNECTED"));
                this.f7449b = i10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void o(f fVar, int i10) {
        zzie zzieVar;
        com.android.billingclient.api.a aVarV;
        com.android.billingclient.api.a aVar;
        synchronized (this.f7448a) {
            try {
                if (r()) {
                    aVarV = v(i10);
                } else {
                    if (this.f7449b == 1) {
                        zzc.zzn("BillingClient", "Client is already in the process of connecting to billing service.");
                        zzie zzieVar2 = zzie.BILLING_CLIENT_CONNECTING;
                        aVar = com.android.billingclient.api.b.f5615d;
                        m(i10, aVar, zzieVar2);
                    } else if (this.f7449b == 3) {
                        zzc.zzn("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                        zzie zzieVar3 = zzie.BILLING_CLIENT_CLOSED;
                        aVar = com.android.billingclient.api.b.f5621j;
                        m(i10, aVar, zzieVar3);
                    } else {
                        n(1);
                        if (i10 == 0) {
                            i10 = 0;
                        }
                        p();
                        zzc.zzm("BillingClient", "Starting in-app billing setup.");
                        this.f7457j = new e0(this, fVar, i10);
                        zzbi zzbiVar = this.f7457j.f7475b;
                        zzbiVar.zzd();
                        zzbiVar.zze();
                        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                        intent.setPackage("com.android.vending");
                        List<ResolveInfo> listQueryIntentServices = this.f7454g.getPackageManager().queryIntentServices(intent, 0);
                        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                            zzieVar = zzie.INTENT_SERVICE_NOT_FOUND;
                        } else {
                            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                            if (serviceInfo != null) {
                                String str = serviceInfo.packageName;
                                String str2 = serviceInfo.name;
                                if (!Objects.equals(str, "com.android.vending") || str2 == null) {
                                    zzieVar = zzie.INVALID_PHONESKY_PACKAGE;
                                    zzc.zzn("BillingClient", "The device doesn't have valid Play Store.");
                                } else {
                                    ComponentName componentName = new ComponentName(str, str2);
                                    Intent intent2 = new Intent(intent);
                                    intent2.setComponent(componentName);
                                    intent2.putExtra("playBillingLibraryVersion", this.f7450c);
                                    synchronized (this.f7448a) {
                                        try {
                                            if (this.f7449b == 2) {
                                                aVarV = v(i10);
                                            } else if (this.f7449b != 1) {
                                                zzc.zzn("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                                zzie zzieVar4 = zzie.BILLING_CLIENT_TRANSITIONED_OUT_OF_CONNECTING;
                                                aVar = com.android.billingclient.api.b.f5621j;
                                                m(i10, aVar, zzieVar4);
                                            } else {
                                                e0 e0Var = this.f7457j;
                                                if ((i10 <= 0 || Build.VERSION.SDK_INT < 29) ? this.f7454g.bindService(intent2, e0Var, 1) : this.f7454g.bindService(intent2, 1, g(), e0Var)) {
                                                    zzc.zzm("BillingClient", "Service was bonded successfully.");
                                                    aVarV = null;
                                                } else {
                                                    zzieVar = zzie.BILLING_SERVICE_BLOCKED;
                                                    zzc.zzn("BillingClient", "Connection to Billing service is blocked.");
                                                }
                                            }
                                        } finally {
                                        }
                                    }
                                }
                            } else {
                                zzieVar = zzie.INVALID_PHONESKY_PACKAGE;
                                zzc.zzn("BillingClient", "The device doesn't have valid Play Store.");
                            }
                        }
                        n(0);
                        zzc.zzm("BillingClient", "Billing service unavailable on device.");
                        com.android.billingclient.api.a aVar2 = com.android.billingclient.api.b.f5613b;
                        m(i10, aVar2, zzieVar);
                        aVarV = aVar2;
                    }
                    aVarV = aVar;
                }
            } finally {
            }
        }
        if (aVarV != null) {
            fVar.a(aVarV);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p() {
        synchronized (this.f7448a) {
            if (this.f7457j != null) {
                try {
                    this.f7454g.unbindService(this.f7457j);
                } catch (Throwable th2) {
                    try {
                        zzc.zzo("BillingClient", "There was an exception while unbinding service!", th2);
                        this.f7456i = null;
                        this.f7457j = null;
                    } finally {
                        this.f7456i = null;
                        this.f7457j = null;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean q() throws InterruptedException {
        long jMax;
        zzbi zzbiVarZzb = zzbi.zzb(this.B);
        long jZza = 30000;
        for (int i10 = 1; i10 <= 3; i10++) {
            try {
                jMax = Math.max(0L, jZza);
            } catch (Exception e10) {
                if (e10 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                zzc.zzo("BillingClient", "Error during reconnection attempt: ", e10);
            }
            if (jMax <= 0) {
                zzc.zzn("BillingClient", "No time remaining for reconnection attempt.");
                return r();
            }
            int i11 = ((com.android.billingclient.api.a) x(i10).get(jMax, TimeUnit.MILLISECONDS)).f5606a;
            if (i11 == 0) {
                zzc.zzm("BillingClient", "Reconnection succeeded with result: " + i11);
                return r();
            }
            zzc.zzn("BillingClient", "Reconnection failed with result: " + i11);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            jZza = 30000 - zzbiVarZzb.zza(timeUnit);
            long jPow = ((long) Math.pow(2.0d, i10 - 1)) * 1000;
            if (jZza < jPow) {
                zzc.zzn("BillingClient", "Reconnection failed due to timeout limit reached.");
                return r();
            }
            if (i10 < 3 && jPow > 0) {
                try {
                    Thread.sleep(jPow);
                    jZza = 30000 - zzbiVarZzb.zza(timeUnit);
                } catch (InterruptedException e11) {
                    Thread.currentThread().interrupt();
                    zzc.zzo("BillingClient", "Error sleeping during reconnection attempt: ", e11);
                }
            }
        }
        zzc.zzn("BillingClient", "Max retries reached.");
        return r();
    }

    public final boolean r() {
        boolean z10;
        synchronized (this.f7448a) {
            try {
                z10 = false;
                if (this.f7449b == 2 && this.f7456i != null && this.f7457j != null) {
                    z10 = true;
                }
            } finally {
            }
        }
        return z10;
    }

    public final Handler t() {
        return Looper.myLooper() == null ? this.f7452e : new Handler(Looper.myLooper());
    }

    public final f0 u(com.android.billingclient.api.a aVar, zzie zzieVar, String str, Exception exc) {
        zzc.zzo("BillingClient", str, exc);
        D(zzieVar, 7, aVar, r0.a(exc));
        return new f0(aVar.f5606a, aVar.f5608c, new ArrayList(), new ArrayList());
    }

    public final com.android.billingclient.api.a v(int i10) {
        zzc.zzm("BillingClient", "Service connection is valid. No need to re-initialize.");
        zzhz zzhzVarZzc = zzib.zzc();
        zzhzVarZzc.zzo(6);
        zzjt zzjtVarZzc = zzjv.zzc();
        zzjtVarZzc.zzn(true);
        zzjtVarZzc.zza(i10 > 0);
        zzjtVarZzc.zzl(i10);
        zzhzVarZzc.zzn(zzjtVarZzc);
        l((zzib) zzhzVarZzc.zze());
        return com.android.billingclient.api.b.f5620i;
    }

    public final com.android.billingclient.api.a w() {
        int[] iArr = {0, 3};
        synchronized (this.f7448a) {
            for (int i10 = 0; i10 < 2; i10++) {
                if (this.f7449b == iArr[i10]) {
                    return com.android.billingclient.api.b.f5621j;
                }
            }
            return com.android.billingclient.api.b.f5619h;
        }
    }

    public final zzcz x(int i10) {
        zzc.zzm("BillingClient", "Already connected or not opted into auto reconnection.");
        return zzcu.zza(com.android.billingclient.api.b.f5620i);
    }

    public final void y() {
        if (TextUtils.isEmpty(null)) {
            this.f7454g.getPackageName();
        }
    }

    public e(aa.c cVar, Hilt_HtmlToApkApplication hilt_HtmlToApkApplication, c.a aVar) {
        long jNextLong = new Random().nextLong();
        this.A = Long.valueOf(jNextLong);
        this.B = zzaz.zza();
        this.f7450c = "8.0.0";
        String strZ = z();
        this.f7451d = strZ;
        this.f7454g = hilt_HtmlToApkApplication.getApplicationContext();
        zziq zziqVarZzc = zzis.zzc();
        zziqVarZzc.zzs("8.0.0");
        if (strZ != null) {
            zziqVarZzc.zzt(strZ);
        }
        zziqVarZzc.zzq(this.f7454g.getPackageName());
        zziqVarZzc.zzn(jNextLong);
        zziqVarZzc.zzr(false);
        zziqVarZzc.zza(Build.VERSION.SDK_INT);
        zziqVarZzc.zzp(772604006L);
        try {
            zziqVarZzc.zzl(this.f7454g.getPackageManager().getPackageInfo(this.f7454g.getPackageName(), 0).versionCode);
        } catch (Throwable th2) {
            zzc.zzo("BillingClient", "Error getting app version code.", th2);
        }
        this.f7455h = new t0(this.f7454g, (zzis) zziqVarZzc.zze());
        zzc.zzn("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f7453f = new b1(this.f7454g, null, this.f7455h);
        this.f7471x = cVar;
        this.f7454g.getPackageName();
    }
}
