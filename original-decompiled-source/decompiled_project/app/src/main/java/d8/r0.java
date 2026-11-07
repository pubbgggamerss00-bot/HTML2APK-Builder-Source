package d8;

import com.google.android.gms.internal.play_billing.zzbj;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzhv;
import com.google.android.gms.internal.play_billing.zzhx;
import com.google.android.gms.internal.play_billing.zzhz;
import com.google.android.gms.internal.play_billing.zzib;
import com.google.android.gms.internal.play_billing.zzic;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.android.gms.internal.play_billing.zzig;
import com.google.android.gms.internal.play_billing.zzil;

/* loaded from: classes.dex */
public final /* synthetic */ class r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f7549a = 0;

    static {
        int i10 = s0.f7552a;
    }

    public static String a(Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            String str = exc.getClass().getSimpleName() + ":" + zzbj.zzb(exc.getMessage());
            int i10 = zzc.zza;
            return str.length() > 40 ? str.substring(0, 40) : str;
        } catch (Throwable th2) {
            zzc.zzo("BillingLogger", "Unable to get truncated exception info", th2);
            return null;
        }
    }

    public static zzhx b(zzie zzieVar, int i10, com.android.billingclient.api.a aVar, String str, zzil zzilVar) {
        try {
            zzic zzicVarZzc = zzig.zzc();
            zzicVarZzc.zzo(aVar.f5606a);
            zzicVarZzc.zzl(aVar.f5608c);
            int i11 = aVar.f5607b;
            if (i11 != 0) {
                zzicVarZzc.zzm(i11);
            }
            if (zzieVar != null) {
                zzicVarZzc.zzn(zzieVar);
            }
            if (str != null) {
                zzicVarZzc.zza(str);
            }
            zzhv zzhvVarZzc = zzhx.zzc();
            zzhvVarZzc.zzl(zzicVarZzc);
            zzhvVarZzc.zzp(i10);
            if (!zzilVar.equals(zzil.BROADCAST_ACTION_UNSPECIFIED)) {
                zzhvVarZzc.zza(zzilVar);
            }
            return (zzhx) zzhvVarZzc.zze();
        } catch (Throwable th2) {
            zzc.zzo("BillingLogger", "Unable to create logging payload", th2);
            return null;
        }
    }

    public static zzib c(int i10, zzil zzilVar) {
        try {
            zzhz zzhzVarZzc = zzib.zzc();
            zzhzVarZzc.zzo(i10);
            if (!zzilVar.equals(zzil.BROADCAST_ACTION_UNSPECIFIED)) {
                zzhzVarZzc.zza(zzilVar);
            }
            return (zzib) zzhzVarZzc.zze();
        } catch (Exception e10) {
            zzc.zzo("BillingLogger", "Unable to create logging payload", e10);
            return null;
        }
    }
}
