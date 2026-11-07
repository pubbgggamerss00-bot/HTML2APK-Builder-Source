package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.JsonReader;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ru0 extends wu {

    /* renamed from: t, reason: collision with root package name */
    public final su0 f8704t;

    /* renamed from: u, reason: collision with root package name */
    public final qu0 f8705u;

    /* renamed from: v, reason: collision with root package name */
    public final HashMap f8706v = new HashMap();

    public ru0(su0 su0Var, qu0 qu0Var) {
        this.f8704t = su0Var;
        this.f8705u = qu0Var;
    }

    public static zzm i1(Map map) throws IOException {
        zzn zznVar = new zzn();
        String str = (String) map.get("ad_request");
        if (str == null) {
            return zznVar.zza();
        }
        JsonReader jsonReader = new JsonReader(new StringReader(Uri.decode(str)));
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                switch (strNextName.hashCode()) {
                    case -1289032093:
                        if (!strNextName.equals("extras")) {
                            jsonReader.skipValue();
                            break;
                        } else {
                            jsonReader.beginObject();
                            Bundle bundle = new Bundle();
                            while (jsonReader.hasNext()) {
                                bundle.putString(jsonReader.nextName(), jsonReader.nextString());
                            }
                            jsonReader.endObject();
                            zznVar.zzb(bundle);
                            break;
                        }
                    case -839117230:
                        if (!strNextName.equals("isTestDevice")) {
                            jsonReader.skipValue();
                            break;
                        } else {
                            zznVar.zzd(jsonReader.nextBoolean());
                            break;
                        }
                    case -733436947:
                        if (!strNextName.equals("tagForUnderAgeOfConsent")) {
                            jsonReader.skipValue();
                            break;
                        } else if (!jsonReader.nextBoolean()) {
                            zznVar.zzi(0);
                            break;
                        } else {
                            zznVar.zzi(1);
                            break;
                        }
                    case -99890337:
                        if (!strNextName.equals("httpTimeoutMillis")) {
                            jsonReader.skipValue();
                            break;
                        } else {
                            zznVar.zzc(jsonReader.nextInt());
                            break;
                        }
                    case 523149226:
                        if (!strNextName.equals("keywords")) {
                            jsonReader.skipValue();
                            break;
                        } else {
                            jsonReader.beginArray();
                            ArrayList arrayList = new ArrayList();
                            while (jsonReader.hasNext()) {
                                arrayList.add(jsonReader.nextString());
                            }
                            jsonReader.endArray();
                            zznVar.zze(arrayList);
                            break;
                        }
                    case 597632527:
                        if (!strNextName.equals("maxAdContentRating")) {
                            jsonReader.skipValue();
                            break;
                        } else {
                            String strNextString = jsonReader.nextString();
                            if (!RequestConfiguration.zza.contains(strNextString)) {
                                break;
                            } else {
                                zznVar.zzf(strNextString);
                                break;
                            }
                        }
                    case 1411582723:
                        if (!strNextName.equals("tagForChildDirectedTreatment")) {
                            jsonReader.skipValue();
                            break;
                        } else if (!jsonReader.nextBoolean()) {
                            zznVar.zzh(0);
                            break;
                        } else {
                            zznVar.zzh(1);
                            break;
                        }
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
        } catch (IOException unused) {
            zzo.zze("Ad Request json was malformed, parsing ended early.");
        }
        zzm zzmVarZza = zznVar.zza();
        Bundle bundle2 = zzmVarZza.zzm.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle2 == null) {
            bundle2 = zzmVarZza.zzc;
            zzmVarZza.zzm.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle2);
        }
        return new zzm(zzmVarZza.zza, zzmVarZza.zzb, bundle2, zzmVarZza.zzd, zzmVarZza.zze, zzmVarZza.zzf, zzmVarZza.zzg, zzmVarZza.zzh, zzmVarZza.zzi, zzmVarZza.zzj, zzmVarZza.zzk, zzmVarZza.zzl, zzmVarZza.zzm, zzmVarZza.zzn, zzmVarZza.zzo, zzmVarZza.zzp, zzmVarZza.zzq, zzmVarZza.zzr, zzmVarZza.zzs, zzmVarZza.zzt, zzmVarZza.zzu, zzmVarZza.zzv, zzmVarZza.zzw, zzmVarZza.zzx, zzmVarZza.zzy, zzmVarZza.zzz);
    }

    @Override // com.google.android.gms.internal.ads.xu
    public final void zze() {
        this.f8706v.clear();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.xu
    public final void zzf(String str) throws JSONException, NumberFormatException {
        if (((Boolean) zzbe.zzc().a(zn.N9)).booleanValue()) {
            zze.zza("Received H5 gmsg: ".concat(String.valueOf(str)));
            Uri uri = Uri.parse(str);
            zzv.zzq();
            Map mapZzP = zzs.zzP(uri);
            String str2 = (String) mapZzP.get("action");
            if (TextUtils.isEmpty(str2)) {
                zzo.zze("H5 gmsg did not contain an action");
                return;
            }
            int iHashCode = str2.hashCode();
            qu0 qu0Var = this.f8705u;
            HashMap map = this.f8706v;
            if (iHashCode != 579053441) {
                if (iHashCode == 871091088 && str2.equals("initialize")) {
                    map.clear();
                    qu0Var.getClass();
                    qu0Var.b(new pu0("initialize"));
                    return;
                }
            } else if (str2.equals("dispose_all")) {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((mu0) it.next()).zza();
                }
                map.clear();
                return;
            }
            String str3 = (String) mapZzP.get("obj_id");
            try {
                Objects.requireNonNull(str3);
                long j6 = Long.parseLong(str3);
                int iHashCode2 = str2.hashCode();
                su0 su0Var = this.f8704t;
                switch (iHashCode2) {
                    case -1790951212:
                        if (str2.equals("show_interstitial_ad")) {
                            mu0 mu0Var = (mu0) map.get(Long.valueOf(j6));
                            if (mu0Var != null) {
                                mu0Var.zzc();
                                return;
                            }
                            zzo.zze("Could not show H5 ad, object ID does not exist");
                            qu0Var.getClass();
                            pu0 pu0Var = new pu0("interstitial");
                            pu0Var.f8150a = Long.valueOf(j6);
                            pu0Var.f8152c = "onNativeAdObjectNotAvailable";
                            qu0Var.b(pu0Var);
                            return;
                        }
                        break;
                    case -1266374734:
                        if (str2.equals("show_rewarded_ad")) {
                            mu0 mu0Var2 = (mu0) map.get(Long.valueOf(j6));
                            if (mu0Var2 != null) {
                                mu0Var2.zzc();
                                return;
                            }
                            zzo.zze("Could not show H5 ad, object ID does not exist");
                            qu0Var.getClass();
                            pu0 pu0Var2 = new pu0("rewarded");
                            pu0Var2.f8150a = Long.valueOf(j6);
                            pu0Var2.f8152c = "onNativeAdObjectNotAvailable";
                            qu0Var.b(pu0Var2);
                            return;
                        }
                        break;
                    case -257098725:
                        if (str2.equals("load_rewarded_ad")) {
                            mu0 mu0Var3 = (mu0) map.get(Long.valueOf(j6));
                            if (mu0Var3 != null) {
                                mu0Var3.a(i1(mapZzP));
                                return;
                            }
                            zzo.zze("Could not load H5 ad, object ID does not exist");
                            qu0Var.getClass();
                            pu0 pu0Var3 = new pu0("rewarded");
                            pu0Var3.f8150a = Long.valueOf(j6);
                            pu0Var3.f8152c = "onNativeAdObjectNotAvailable";
                            qu0Var.b(pu0Var3);
                            return;
                        }
                        break;
                    case 393881811:
                        if (str2.equals("create_interstitial_ad")) {
                            if (map.size() >= ((Integer) zzbe.zzc().a(zn.O9)).intValue()) {
                                zzo.zzj("Could not create H5 ad, too many existing objects");
                                qu0Var.a(j6);
                                return;
                            }
                            Long lValueOf = Long.valueOf(j6);
                            if (map.containsKey(lValueOf)) {
                                zzo.zze("Could not create H5 ad, object ID already exists");
                                qu0Var.a(j6);
                                return;
                            }
                            String str4 = (String) mapZzP.get("ad_unit");
                            if (TextUtils.isEmpty(str4)) {
                                zzo.zzj("Could not create H5 ad, missing ad unit id");
                                qu0Var.a(j6);
                                return;
                            }
                            eu euVarZzb = su0Var.zzb();
                            euVarZzb.f4397v = Long.valueOf(j6);
                            str4.getClass();
                            euVarZzb.s = str4;
                            h20 h20VarE = euVarZzb.e();
                            td0 td0Var = (td0) h20VarE.f5218v;
                            map.put(lValueOf, new uu0(((Long) h20VarE.f5216t).longValue(), td0Var.f9231a, new qu0(td0Var.f9232b), (kd0) h20VarE.f5217u, (String) h20VarE.s));
                            qu0Var.getClass();
                            pu0 pu0Var4 = new pu0("creation");
                            pu0Var4.f8150a = Long.valueOf(j6);
                            pu0Var4.f8152c = "nativeObjectCreated";
                            qu0Var.b(pu0Var4);
                            zze.zza("Created H5 interstitial #" + j6 + " with ad unit " + str4);
                            return;
                        }
                        break;
                    case 585513149:
                        if (str2.equals("load_interstitial_ad")) {
                            mu0 mu0Var4 = (mu0) map.get(Long.valueOf(j6));
                            if (mu0Var4 != null) {
                                mu0Var4.a(i1(mapZzP));
                                return;
                            }
                            zzo.zze("Could not load H5 ad, object ID does not exist");
                            qu0Var.getClass();
                            pu0 pu0Var5 = new pu0("interstitial");
                            pu0Var5.f8150a = Long.valueOf(j6);
                            pu0Var5.f8152c = "onNativeAdObjectNotAvailable";
                            qu0Var.b(pu0Var5);
                            return;
                        }
                        break;
                    case 1671767583:
                        if (str2.equals("dispose")) {
                            Long lValueOf2 = Long.valueOf(j6);
                            mu0 mu0Var5 = (mu0) map.get(lValueOf2);
                            if (mu0Var5 == null) {
                                zzo.zze("Could not dispose H5 ad, object ID does not exist");
                                return;
                            }
                            mu0Var5.zza();
                            map.remove(lValueOf2);
                            zze.zza("Disposed H5 ad #" + j6);
                            return;
                        }
                        break;
                    case 2109237041:
                        if (str2.equals("create_rewarded_ad")) {
                            if (map.size() >= ((Integer) zzbe.zzc().a(zn.O9)).intValue()) {
                                zzo.zzj("Could not create H5 ad, too many existing objects");
                                qu0Var.a(j6);
                                return;
                            }
                            Long lValueOf3 = Long.valueOf(j6);
                            if (map.containsKey(lValueOf3)) {
                                zzo.zze("Could not create H5 ad, object ID already exists");
                                qu0Var.a(j6);
                                return;
                            }
                            String str5 = (String) mapZzP.get("ad_unit");
                            if (TextUtils.isEmpty(str5)) {
                                zzo.zzj("Could not create H5 ad, missing ad unit id");
                                qu0Var.a(j6);
                                return;
                            }
                            eu euVarZzb2 = su0Var.zzb();
                            euVarZzb2.f4397v = Long.valueOf(j6);
                            str5.getClass();
                            euVarZzb2.s = str5;
                            h20 h20VarE2 = euVarZzb2.e();
                            td0 td0Var2 = (td0) h20VarE2.f5218v;
                            map.put(lValueOf3, new xu0(((Long) h20VarE2.f5216t).longValue(), td0Var2.f9231a, new qu0(td0Var2.f9232b), (kd0) h20VarE2.f5217u, (String) h20VarE2.s));
                            qu0Var.getClass();
                            pu0 pu0Var6 = new pu0("creation");
                            pu0Var6.f8150a = Long.valueOf(j6);
                            pu0Var6.f8152c = "nativeObjectCreated";
                            qu0Var.b(pu0Var6);
                            zze.zza("Created H5 rewarded #" + j6 + " with ad unit " + str5);
                            return;
                        }
                        break;
                }
                zzo.zze("H5 gmsg contained invalid action: ".concat(str2));
            } catch (NullPointerException | NumberFormatException unused) {
                zzo.zze("H5 gmsg did not contain a valid object id: ".concat(String.valueOf(str3)));
            }
        }
    }
}
