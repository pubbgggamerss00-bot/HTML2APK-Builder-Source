package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzad;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzv;
import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class s50 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8793a;

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f8794b;

    /* renamed from: c, reason: collision with root package name */
    public final zzg f8795c;

    /* renamed from: d, reason: collision with root package name */
    public String f8796d = "-1";

    /* renamed from: e, reason: collision with root package name */
    public int f8797e = -1;

    public s50(Context context, zzg zzgVar) {
        this.f8794b = PreferenceManager.getDefaultSharedPreferences(context);
        this.f8795c = zzgVar;
        this.f8793a = context;
    }

    public final void a(int i6, String str) {
        Context context;
        boolean z6 = true;
        if (!((Boolean) zzbe.zzc().a(zn.J0)).booleanValue() ? !(str.isEmpty() || str.charAt(0) != '1') : !(i6 == 0 || str.isEmpty() || (str.charAt(0) != '1' && !str.equals("-1")))) {
            z6 = false;
        }
        this.f8795c.zzD(z6);
        if (((Boolean) zzbe.zzc().a(zn.f11364b6)).booleanValue() && z6 && (context = this.f8793a) != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        try {
            if (((Boolean) zzbe.zzc().a(zn.L0)).booleanValue()) {
                boolean zEquals = Objects.equals(str, "gad_has_consent_for_cookies");
                Context context = this.f8793a;
                zzg zzgVar = this.f8795c;
                if (zEquals) {
                    int i6 = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
                    if (i6 != zzgVar.zzb()) {
                        zzgVar.zzD(true);
                        zzad.zzc(context);
                    }
                    zzgVar.zzA(i6);
                    return;
                }
                if (Objects.equals(str, "IABTCF_TCString")) {
                    String string = sharedPreferences.getString(str, "-1");
                    if (!Objects.equals(string, zzgVar.zzm())) {
                        zzgVar.zzD(true);
                        zzad.zzc(context);
                    }
                    zzgVar.zzJ(string);
                    return;
                }
                return;
            }
            String string2 = sharedPreferences.getString("IABTCF_PurposeConsents", "-1");
            int i7 = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
            String strValueOf = String.valueOf(str);
            int iHashCode = strValueOf.hashCode();
            if (iHashCode == -2004976699) {
                if (!strValueOf.equals("IABTCF_PurposeConsents") || string2.equals("-1") || this.f8796d.equals(string2)) {
                    return;
                }
                this.f8796d = string2;
                a(i7, string2);
                return;
            }
            if (iHashCode == -527267622 && strValueOf.equals("gad_has_consent_for_cookies")) {
                if (!((Boolean) zzbe.zzc().a(zn.J0)).booleanValue() || i7 == -1 || this.f8797e == i7) {
                    return;
                }
                this.f8797e = i7;
                a(i7, string2);
            }
        } catch (Throwable th) {
            zzv.zzp().h("AdMobPlusIdlessListener.onSharedPreferenceChanged", th);
            zze.zzb("onSharedPreferenceChanged, errorMessage = ", th);
        }
    }
}
