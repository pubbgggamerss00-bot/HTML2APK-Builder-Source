package d8;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.a;
import com.google.android.gms.internal.play_billing.zzbt;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzeu;
import com.google.android.gms.internal.play_billing.zzhx;
import com.google.android.gms.internal.play_billing.zzhz;
import com.google.android.gms.internal.play_billing.zzib;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.android.gms.internal.play_billing.zzil;
import com.google.android.gms.internal.play_billing.zziq;
import com.google.android.gms.internal.play_billing.zzis;
import com.google.android.gms.internal.play_billing.zzja;
import java.util.List;

/* loaded from: classes.dex */
public final class a1 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public boolean f7423a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7424b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f7425c;

    public a1(b1 b1Var, boolean z10) {
        this.f7425c = b1Var;
        this.f7424b = z10;
    }

    public final synchronized void a(Context context, IntentFilter intentFilter) {
        try {
            if (this.f7423a) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.f7424b ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.f7423a = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void b(Bundle bundle, com.android.billingclient.api.a aVar, int i10, zzil zzilVar, long j10, boolean z10) {
        try {
            byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
            b1 b1Var = this.f7425c;
            if (byteArray != null) {
                ((t0) b1Var.f7431c).d(zzhx.zzA(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD"), zzeu.zza()), j10, z10);
            } else {
                ((t0) b1Var.f7431c).d(r0.b(zzie.BILLING_RESULT_RECEIVED_FROM_PHONESKY, i10, aVar, null, zzilVar), j10, z10);
            }
        } catch (Throwable unused) {
            zzc.zzn("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onReceive(Context context, Intent intent) {
        zzil zzilVar;
        int i10;
        com.android.billingclient.api.a aVarZzh;
        zzis zzisVar;
        int iIntValue;
        String action = intent.getAction();
        int iHashCode = action.hashCode();
        if (iHashCode != -1484087650) {
            if (iHashCode != -337612916) {
                zzilVar = (iHashCode == 345207161 && action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) ? zzil.ALTERNATIVE_BILLING_ACTION : zzil.BROADCAST_ACTION_UNSPECIFIED;
            } else if (action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
                zzilVar = zzil.LOCAL_PURCHASES_UPDATED_ACTION;
            }
        } else if (action.equals("com.android.vending.billing.PURCHASES_UPDATED")) {
            zzilVar = zzil.PURCHASES_UPDATED_ACTION;
        }
        zzil zzilVar2 = zzilVar;
        zzil zzilVar3 = zzil.LOCAL_PURCHASES_UPDATED_ACTION;
        if (zzilVar2.equals(zzilVar3) || zzilVar2.equals(zzil.ALTERNATIVE_BILLING_ACTION)) {
            i10 = 2;
        } else {
            i10 = zzilVar2.equals(zzil.PURCHASES_UPDATED_ACTION) ? 32 : 1;
        }
        Bundle extras = intent.getExtras();
        b1 b1Var = this.f7425c;
        if (extras == null) {
            zzc.zzn("BillingBroadcastManager", "Bundle is null.");
            s0 s0Var = b1Var.f7431c;
            zzie zzieVar = zzie.NULL_BUNDLE_IN_BROADCAST_RECEIVER;
            com.android.billingclient.api.a aVar = com.android.billingclient.api.b.f5619h;
            ((t0) s0Var).b(r0.b(zzieVar, i10, aVar, null, zzilVar2));
            m mVar = b1Var.f7430b;
            if (mVar != null) {
                mVar.a(aVar, null);
                return;
            }
            return;
        }
        if (i10 == 2) {
            int i11 = zzc.zza;
            a.C0062a c0062aA = com.android.billingclient.api.a.a();
            c0062aA.f5609a = zzc.zzb(intent.getExtras(), "BillingBroadcastManager");
            Bundle extras2 = intent.getExtras();
            if (extras2 == null) {
                zzc.zzn("BillingBroadcastManager", "Unexpected null bundle received!");
            } else {
                Object obj = extras2.get("SUB_RESPONSE_CODE");
                if (obj == null) {
                    zzc.zzm("BillingBroadcastManager", "getLaunchBillingFlowSubResponseCodeFromBundle() got null response code, assuming OK");
                } else if (obj instanceof Integer) {
                    iIntValue = ((Integer) obj).intValue();
                    c0062aA.f5610b = iIntValue;
                    c0062aA.f5611c = zzc.zzj(intent.getExtras(), "BillingBroadcastManager");
                    aVarZzh = c0062aA.a();
                } else {
                    zzc.zzn("BillingBroadcastManager", "Unexpected type for bundle sub response code: ".concat(obj.getClass().getName()));
                }
            }
            iIntValue = 0;
            c0062aA.f5610b = iIntValue;
            c0062aA.f5611c = zzc.zzj(intent.getExtras(), "BillingBroadcastManager");
            aVarZzh = c0062aA.a();
        } else {
            aVarZzh = zzc.zzh(intent, "BillingBroadcastManager");
        }
        long j10 = extras.getLong("billingClientTransactionId", 0L);
        boolean z10 = extras.getBoolean("wasServiceAutoReconnected", false);
        if (!zzilVar2.equals(zzil.PURCHASES_UPDATED_ACTION) && !zzilVar2.equals(zzilVar3)) {
            if (zzilVar2.equals(zzil.ALTERNATIVE_BILLING_ACTION)) {
                if (aVarZzh.f5606a != 0) {
                    com.android.billingclient.api.a aVar2 = aVarZzh;
                    b(extras, aVar2, i10, zzilVar2, j10, z10);
                    b1Var.f7430b.a(aVar2, zzbt.zzk());
                    return;
                }
                b1Var.getClass();
                zzc.zzn("BillingBroadcastManager", "AlternativeBillingListener and UserChoiceBillingListener is null.");
                s0 s0Var2 = b1Var.f7431c;
                zzie zzieVar2 = zzie.MISSING_USER_CHOICE_BILLING_LISTENER;
                com.android.billingclient.api.a aVar3 = com.android.billingclient.api.b.f5619h;
                ((t0) s0Var2).d(r0.b(zzieVar2, i10, aVar3, null, zzilVar2), j10, z10);
                b1Var.f7430b.a(aVar3, zzbt.zzk());
                return;
            }
            return;
        }
        com.android.billingclient.api.a aVar4 = aVarZzh;
        List<Purchase> listZzl = zzc.zzl(extras);
        if (aVar4.f5606a == 0) {
            s0 s0Var3 = b1Var.f7431c;
            zzib zzibVarC = r0.c(i10, zzilVar2);
            t0 t0Var = (t0) s0Var3;
            t0Var.getClass();
            try {
                zzhz zzhzVar = (zzhz) zzibVarC.zzm();
                zzja zzjaVar = (zzja) zzibVarC.zzA().zzm();
                zzjaVar.zza(z10);
                zzhzVar.zzm(zzjaVar);
                zzib zzibVar = (zzib) zzhzVar.zze();
                if (j10 == 0) {
                    zzisVar = (zzis) t0Var.f7555b;
                } else {
                    zziq zziqVar = (zziq) ((zzis) t0Var.f7555b).zzm();
                    zziqVar.zzo(j10);
                    zzisVar = (zzis) zziqVar.zze();
                }
                t0Var.h(zzibVar, zzisVar);
            } catch (Throwable th2) {
                zzc.zzo("BillingLogger", "Unable to log.", th2);
            }
        } else {
            b(extras, aVar4, i10, zzilVar2, j10, z10);
        }
        b1Var.f7430b.a(aVar4, listZzl);
    }
}
