package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzg;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class q71 implements p81 {

    /* renamed from: a, reason: collision with root package name */
    public final ec1 f8242a;

    /* renamed from: b, reason: collision with root package name */
    public final PackageInfo f8243b;

    /* renamed from: c, reason: collision with root package name */
    public final zzg f8244c;

    public q71(ec1 ec1Var, PackageInfo packageInfo, zzg zzgVar) {
        this.f8242a = ec1Var;
        this.f8243b = packageInfo;
        this.f8244c = zzgVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x00f4  */
    @Override // com.google.android.gms.internal.ads.p81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        JSONArray jSONArrayOptJSONArray;
        int i6;
        ec1 ec1Var = this.f8242a;
        oq oqVar = ec1Var.f4213i;
        ArrayList<String> arrayList = ec1Var.f4212g;
        ck0 ck0Var = (ck0) obj;
        if (arrayList == null) {
            return;
        }
        if (arrayList.isEmpty()) {
            ck0Var.f3610a.putInt("native_version", 0);
            return;
        }
        Bundle bundle = ck0Var.f3610a;
        bundle.putInt("native_version", 3);
        bundle.putStringArrayList("native_templates", arrayList);
        bundle.putStringArrayList("native_custom_templates", ec1Var.h);
        if (oqVar != null) {
            if (oqVar.s > 3) {
                bundle.putBoolean("enable_native_media_orientation", true);
                int i7 = oqVar.f7844z;
                String str = i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? "unknown" : "square" : "portrait" : "landscape" : "any";
                if (!"unknown".equals(str)) {
                    bundle.putString("native_media_orientation", str);
                }
            }
            int i8 = oqVar.f7839u;
            String str2 = i8 != 0 ? i8 != 1 ? i8 != 2 ? "unknown" : "landscape" : "portrait" : "any";
            if (!"unknown".equals(str2)) {
                bundle.putString("native_image_orientation", str2);
            }
            bundle.putBoolean("native_multiple_images", oqVar.f7840v);
            bundle.putBoolean("use_custom_mute", oqVar.f7843y);
            Bundle bundle2 = ck0Var.f3610a;
            oq oqVar2 = ec1Var.f4213i;
            if (oqVar2 != null && (i6 = oqVar2.A) != 0) {
                bundle2.putBoolean("sccg_tap", oqVar2.B);
                bundle2.putInt("sccg_dir", i6);
            }
        }
        PackageInfo packageInfo = this.f8243b;
        int i9 = packageInfo != null ? packageInfo.versionCode : 0;
        zzg zzgVar = this.f8244c;
        if (i9 > zzgVar.zza()) {
            zzgVar.zzq();
            zzgVar.zzt(i9);
        }
        JSONObject jSONObjectZzn = zzgVar.zzn();
        String string = null;
        if (jSONObjectZzn != null && (jSONArrayOptJSONArray = jSONObjectZzn.optJSONArray(ec1Var.f4211f)) != null) {
            string = jSONArrayOptJSONArray.toString();
        }
        if (!TextUtils.isEmpty(string)) {
            bundle.putString("native_advanced_settings", string);
        }
        int i10 = ec1Var.f4215k;
        if (i10 > 1) {
            bundle.putInt("max_num_ads", i10);
        }
        bw bwVar = ec1Var.f4207b;
        if (bwVar != null) {
            String str3 = bwVar.f3309u;
            if (TextUtils.isEmpty(str3)) {
                String str4 = "p";
                if (bwVar.s >= 2) {
                    int i11 = bwVar.f3310v;
                    if (i11 == 2 || i11 != 3) {
                        str4 = "l";
                    }
                    bundle.putString("ia_var", str4);
                } else {
                    int i12 = bwVar.f3308t;
                    if (i12 != 1) {
                        if (i12 != 2) {
                            zzo.zzg("Instream ad video aspect ratio " + i12 + " is wrong.");
                            str4 = "l";
                        }
                        bundle.putString("ia_var", str4);
                    }
                }
            } else {
                bundle.putString("ad_tag", str3);
            }
            bundle.putBoolean("instr", true);
        }
        if (ec1Var.a() != null) {
            bundle.putBoolean("has_delayed_banner_listener", true);
        }
        if (!((Boolean) zzbe.zzc().a(zn.Jb)).booleanValue() || oqVar == null) {
            return;
        }
        if (oqVar.f7842x != null) {
            Bundle bundle3 = new Bundle();
            bundle3.putBoolean("startMuted", oqVar.f7842x.zza);
            bundle3.putBoolean("clickToExpandRequested", oqVar.f7842x.zzc);
            bundle3.putBoolean("customControlsRequested", oqVar.f7842x.zzb);
            bundle.putBundle("video", bundle3);
        }
        bundle.putBoolean("disable_image_loading", oqVar.f7838t);
        bundle.putInt("preferred_ad_choices_position", oqVar.f7841w);
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final void zza(Object obj) {
        int i6;
        ec1 ec1Var = this.f8242a;
        ArrayList arrayList = ec1Var.f4212g;
        ck0 ck0Var = (ck0) obj;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Bundle bundle = ck0Var.f3611b;
        oq oqVar = ec1Var.f4213i;
        if (oqVar == null || (i6 = oqVar.A) == 0) {
            return;
        }
        bundle.putBoolean("sccg_tap", oqVar.B);
        bundle.putInt("sccg_dir", i6);
    }
}
