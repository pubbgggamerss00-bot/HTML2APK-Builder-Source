package d8;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.zzal;
import com.google.android.gms.internal.play_billing.zzam;
import com.google.android.gms.internal.play_billing.zzbi;
import com.google.android.gms.internal.play_billing.zzbl;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzhv;
import com.google.android.gms.internal.play_billing.zzhx;
import com.google.android.gms.internal.play_billing.zzhz;
import com.google.android.gms.internal.play_billing.zzib;
import com.google.android.gms.internal.play_billing.zzic;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.android.gms.internal.play_billing.zzig;
import com.google.android.gms.internal.play_billing.zzij;
import com.google.android.gms.internal.play_billing.zzis;
import com.google.android.gms.internal.play_billing.zzjg;
import com.google.android.gms.internal.play_billing.zzji;
import com.google.android.gms.internal.play_billing.zzjm;
import com.google.android.gms.internal.play_billing.zzjo;
import com.google.android.gms.internal.play_billing.zzjs;
import com.google.android.gms.internal.play_billing.zzjt;
import com.google.android.gms.internal.play_billing.zzjv;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class e0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final f f7474a;

    /* renamed from: b, reason: collision with root package name */
    public final zzbi f7475b;

    /* renamed from: c, reason: collision with root package name */
    public final zzbi f7476c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7477d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f7478e;

    public /* synthetic */ e0(e eVar, f fVar, int i10) {
        this.f7478e = eVar;
        zzbl zzblVar = eVar.B;
        this.f7475b = zzbi.zzc(zzblVar);
        this.f7476c = zzbi.zzc(zzblVar);
        this.f7474a = fVar;
        this.f7477d = i10;
    }

    public final Long a(boolean z10) {
        if (z10) {
            zzbi zzbiVar = this.f7475b;
            if (!zzbiVar.zzg()) {
                return null;
            }
            zzbiVar.zzf();
            return Long.valueOf(zzbiVar.zza(TimeUnit.MILLISECONDS));
        }
        zzbi zzbiVar2 = this.f7476c;
        if (!zzbiVar2.zzg()) {
            return null;
        }
        zzbiVar2.zzf();
        return Long.valueOf(zzbiVar2.zza(TimeUnit.MILLISECONDS));
    }

    public final void b(com.android.billingclient.api.a aVar, zzie zzieVar, String str, boolean z10) {
        try {
            zzic zzicVarZzc = zzig.zzc();
            zzicVarZzc.zzo(aVar.f5606a);
            zzicVarZzc.zzl(aVar.f5608c);
            zzicVarZzc.zzn(zzieVar);
            if (str != null) {
                zzicVarZzc.zza(str);
            }
            Long lA = a(z10);
            e eVar = this.f7478e;
            if (!z10) {
                zzjm zzjmVarZzc = zzjo.zzc();
                zzjmVarZzc.zza(zzicVarZzc);
                if (lA != null) {
                    zzjmVarZzc.zzl(lA.longValue());
                }
                eVar.f7455h.f((zzjo) zzjmVarZzc.zze());
                return;
            }
            zzjt zzjtVarZzc = zzjv.zzc();
            int i10 = this.f7477d;
            zzjtVarZzc.zza(i10 > 0);
            zzjtVarZzc.zzl(i10);
            if (lA != null) {
                zzjtVarZzc.zzm(lA.longValue());
            }
            zzhv zzhvVarZzc = zzhx.zzc();
            zzhvVarZzc.zzl(zzicVarZzc);
            zzhvVarZzc.zzp(6);
            zzhvVarZzc.zzo(zzjtVarZzc);
            eVar.k((zzhx) zzhvVarZzc.zze());
        } catch (Throwable th2) {
            zzc.zzo("BillingClient", "Unable to log.", th2);
        }
    }

    public final void c(com.android.billingclient.api.a aVar) {
        e eVar = this.f7478e;
        synchronized (eVar.f7448a) {
            try {
                if (eVar.f7449b == 3) {
                    return;
                }
                try {
                    this.f7474a.a(aVar);
                } catch (Throwable th2) {
                    zzc.zzo("BillingClient", "Exception while calling onBillingSetupFinished.", th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        boolean z10;
        boolean z11;
        zzc.zzn("BillingClient", "Billing service died.");
        try {
            e eVar = this.f7478e;
            synchronized (eVar.f7448a) {
                z10 = true;
                z11 = eVar.f7449b == 1;
            }
            if (z11) {
                t0 t0Var = eVar.f7455h;
                zzhv zzhvVarZzc = zzhx.zzc();
                zzhvVarZzc.zzp(6);
                zzic zzicVarZzc = zzig.zzc();
                zzicVarZzc.zzn(zzie.BINDING_DIED);
                zzhvVarZzc.zzl(zzicVarZzc);
                zzjt zzjtVarZzc = zzjv.zzc();
                int i10 = this.f7477d;
                if (i10 <= 0) {
                    z10 = false;
                }
                zzjtVarZzc.zza(z10);
                zzjtVarZzc.zzl(i10);
                zzhvVarZzc.zzo(zzjtVarZzc);
                t0Var.b((zzhx) zzhvVarZzc.zze());
            } else {
                t0 t0Var2 = eVar.f7455h;
                zzij zzijVarZzd = zzij.zzd();
                t0Var2.getClass();
                try {
                    zzjg zzjgVarZzc = zzji.zzc();
                    zzjgVarZzc.zzn((zzis) t0Var2.f7555b);
                    zzjgVarZzc.zzm(zzijVarZzd);
                    ((u0) t0Var2.f7556c).a((zzji) zzjgVarZzc.zze());
                } catch (Throwable th2) {
                    zzc.zzo("BillingLogger", "Unable to log.", th2);
                }
            }
        } catch (Throwable th3) {
            zzc.zzo("BillingClient", "Unable to log.", th3);
        }
        e eVar2 = this.f7478e;
        synchronized (eVar2.f7448a) {
            if (eVar2.f7449b != 3 && eVar2.f7449b != 0) {
                eVar2.n(0);
                eVar2.p();
                try {
                    this.f7474a.b();
                } catch (Throwable th4) {
                    zzc.zzo("BillingClient", "Exception while calling onBillingServiceDisconnected.", th4);
                }
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzc.zzm("BillingClient", "Billing service connected.");
        e eVar = this.f7478e;
        synchronized (eVar.f7448a) {
            try {
                if (eVar.f7449b == 3) {
                    return;
                }
                eVar.f7456i = zzal.zzs(iBinder);
                if (e.h(new Callable() { // from class: d8.c0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Bundle bundle;
                        zzam zzamVar;
                        e0 e0Var = this.f7438a;
                        e eVar2 = e0Var.f7478e;
                        synchronized (eVar2.f7448a) {
                            try {
                                if (eVar2.f7449b == 3) {
                                    return null;
                                }
                                boolean z10 = eVar2.f7449b == 1;
                                if (TextUtils.isEmpty(null)) {
                                    bundle = null;
                                } else {
                                    bundle = new Bundle();
                                    bundle.putString("accountName", null);
                                    zzc.zzc(bundle, eVar2.f7450c, eVar2.f7451d, eVar2.A.longValue());
                                }
                                zzie zzieVar = zzie.REASON_UNSPECIFIED;
                                synchronized (eVar2.f7448a) {
                                    zzamVar = eVar2.f7456i;
                                }
                                if (zzamVar == null) {
                                    e eVar3 = e0Var.f7478e;
                                    eVar3.n(0);
                                    int i10 = e0Var.f7477d;
                                    zzie zzieVar2 = zzie.SERVICE_RESET_TO_NULL;
                                    com.android.billingclient.api.a aVar = com.android.billingclient.api.b.f5621j;
                                    eVar3.m(i10, aVar, zzieVar2);
                                    e0Var.c(aVar);
                                    return null;
                                }
                                e eVar4 = e0Var.f7478e;
                                String packageName = eVar4.f7454g.getPackageName();
                                int iZzw = 3;
                                int i11 = 25;
                                while (true) {
                                    if (i11 < 3) {
                                        i11 = 0;
                                        break;
                                    }
                                    if (bundle == null) {
                                        try {
                                            iZzw = zzamVar.zzw(i11, packageName, "subs");
                                        } catch (Exception e10) {
                                            zzc.zzo("BillingClient", "Exception while checking if billing is supported; try to reconnect", e10);
                                            boolean z11 = e10 instanceof DeadObjectException;
                                            zzie zzieVar3 = z11 ? zzie.IS_BILLING_SUPPORTED_DEAD_OBJECT_EXCEPTION : e10 instanceof RemoteException ? zzie.IS_BILLING_SUPPORTED_REMOTE_EXCEPTION : e10 instanceof SecurityException ? zzie.IS_BILLING_SUPPORTED_SECURITY_EXCEPTION : zzie.IS_BILLING_SUPPORTED_SERVICE_CALL_EXCEPTION;
                                            String strA = zzieVar3.equals(zzie.IS_BILLING_SUPPORTED_SERVICE_CALL_EXCEPTION) ? r0.a(e10) : null;
                                            e0Var.f7478e.n(0);
                                            e0Var.b(z11 ? com.android.billingclient.api.b.f5621j : com.android.billingclient.api.b.f5619h, zzieVar3, strA, z10);
                                            e0Var.c(z11 ? com.android.billingclient.api.b.f5621j : com.android.billingclient.api.b.f5619h);
                                        }
                                    } else {
                                        iZzw = zzamVar.zzc(i11, packageName, "subs", bundle);
                                    }
                                    if (iZzw == 0) {
                                        zzc.zzm("BillingClient", "highestLevelSupportedForSubs: " + i11);
                                        break;
                                    }
                                    i11--;
                                }
                                eVar4.f7458k = i11 >= 3;
                                if (i11 < 3) {
                                    zzieVar = zzie.SUBSCRIPTIONS_NOT_SUPPORTED;
                                    zzc.zzm("BillingClient", "In-app billing API does not support subscription on this device.");
                                }
                                int i12 = 25;
                                while (true) {
                                    if (i12 < 3) {
                                        break;
                                    }
                                    iZzw = bundle == null ? zzamVar.zzw(i12, packageName, "inapp") : zzamVar.zzc(i12, packageName, "inapp", bundle);
                                    if (iZzw == 0) {
                                        eVar4.f7459l = i12;
                                        zzc.zzm("BillingClient", "mHighestLevelSupportedForInApp: " + i12);
                                        break;
                                    }
                                    i12--;
                                }
                                int i13 = eVar4.f7459l;
                                eVar4.f7459l = i13;
                                eVar4.f7470w = i13 >= 26;
                                eVar4.f7469v = i13 >= 24;
                                eVar4.f7468u = i13 >= 21;
                                eVar4.f7467t = i13 >= 20;
                                eVar4.f7466s = i13 >= 19;
                                eVar4.f7465r = i13 >= 17;
                                eVar4.f7464q = i13 >= 16;
                                eVar4.f7463p = i13 >= 15;
                                eVar4.f7462o = i13 >= 14;
                                eVar4.f7461n = i13 >= 9;
                                eVar4.f7460m = i13 >= 6;
                                if (i13 < 3) {
                                    zzieVar = zzie.ONE_TIME_PRODUCT_NOT_SUPPORTED;
                                    zzc.zzn("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                }
                                e.s(eVar4, iZzw);
                                if (iZzw != 0) {
                                    com.android.billingclient.api.a aVar2 = com.android.billingclient.api.b.f5613b;
                                    e0Var.b(aVar2, zzieVar, null, z10);
                                    e0Var.c(aVar2);
                                    return null;
                                }
                                try {
                                    Long lA = e0Var.a(z10);
                                    if (z10) {
                                        zzhz zzhzVarZzc = zzib.zzc();
                                        zzhzVarZzc.zzo(6);
                                        zzjt zzjtVarZzc = zzjv.zzc();
                                        int i14 = e0Var.f7477d;
                                        zzjtVarZzc.zza(i14 > 0);
                                        zzjtVarZzc.zzl(i14);
                                        if (lA != null) {
                                            zzjtVarZzc.zzm(lA.longValue());
                                        }
                                        e eVar5 = e0Var.f7478e;
                                        zzhzVarZzc.zzn(zzjtVarZzc);
                                        eVar5.l((zzib) zzhzVarZzc.zze());
                                    } else {
                                        zzjm zzjmVarZzc = zzjo.zzc();
                                        zzic zzicVarZzc = zzig.zzc();
                                        zzicVarZzc.zzo(0);
                                        zzjmVarZzc.zza(zzicVarZzc);
                                        if (lA != null) {
                                            zzjmVarZzc.zzl(lA.longValue());
                                        }
                                        e0Var.f7478e.f7455h.f((zzjo) zzjmVarZzc.zze());
                                    }
                                } catch (Throwable th2) {
                                    zzc.zzo("BillingClient", "Unable to log.", th2);
                                }
                                e0Var.c(com.android.billingclient.api.b.f5620i);
                                return null;
                            } finally {
                            }
                        }
                    }
                }, 30000L, new Runnable() { // from class: d8.d0
                    @Override // java.lang.Runnable
                    public final void run() {
                        e0 e0Var = this.f7444a;
                        e eVar2 = e0Var.f7478e;
                        eVar2.n(0);
                        zzie zzieVar = zzie.EXECUTE_ASYNC_TIMEOUT;
                        com.android.billingclient.api.a aVar = com.android.billingclient.api.b.f5622k;
                        eVar2.m(e0Var.f7477d, aVar, zzieVar);
                        e0Var.c(aVar);
                    }
                }, eVar.t(), eVar.g()) == null) {
                    int i10 = this.f7477d;
                    com.android.billingclient.api.a aVarW = eVar.w();
                    eVar.m(i10, aVarW, zzie.MISSING_RESULT_FROM_EXECUTE_ASYNC);
                    c(aVarW);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        boolean z10;
        boolean z11;
        zzc.zzn("BillingClient", "Billing service disconnected.");
        try {
            e eVar = this.f7478e;
            synchronized (eVar.f7448a) {
                z10 = true;
                z11 = eVar.f7449b == 1;
            }
            if (z11) {
                t0 t0Var = eVar.f7455h;
                zzhv zzhvVarZzc = zzhx.zzc();
                zzhvVarZzc.zzp(6);
                zzic zzicVarZzc = zzig.zzc();
                zzicVarZzc.zzn(zzie.SERVICE_DISCONNECTED);
                zzhvVarZzc.zzl(zzicVarZzc);
                zzjt zzjtVarZzc = zzjv.zzc();
                int i10 = this.f7477d;
                if (i10 <= 0) {
                    z10 = false;
                }
                zzjtVarZzc.zza(z10);
                zzjtVarZzc.zzl(i10);
                zzhvVarZzc.zzo(zzjtVarZzc);
                t0Var.b((zzhx) zzhvVarZzc.zze());
            } else {
                t0 t0Var2 = eVar.f7455h;
                zzjs zzjsVarZzd = zzjs.zzd();
                t0Var2.getClass();
                if (zzjsVarZzd != null) {
                    try {
                        zzjg zzjgVarZzc = zzji.zzc();
                        zzjgVarZzc.zzn((zzis) t0Var2.f7555b);
                        zzjgVarZzc.zzp(zzjsVarZzd);
                        ((u0) t0Var2.f7556c).a((zzji) zzjgVarZzc.zze());
                    } catch (Throwable th2) {
                        zzc.zzo("BillingLogger", "Unable to log.", th2);
                    }
                }
            }
        } catch (Throwable th3) {
            zzc.zzo("BillingClient", "Unable to log.", th3);
        }
        zzbi zzbiVar = this.f7476c;
        zzbiVar.zzd();
        zzbiVar.zze();
        e eVar2 = this.f7478e;
        synchronized (eVar2.f7448a) {
            try {
                if (eVar2.f7449b == 3) {
                    return;
                }
                eVar2.n(0);
                try {
                    this.f7474a.b();
                } catch (Throwable th4) {
                    zzc.zzo("BillingClient", "Exception while calling onBillingServiceDisconnected.", th4);
                }
            } finally {
            }
        }
    }
}
