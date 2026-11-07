package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class m30 implements pl1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6917a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6918b;

    public /* synthetic */ m30(int i6, Object obj) {
        this.f6917a = i6;
        this.f6918b = obj;
    }

    @Override // com.google.android.gms.internal.ads.pl1
    public final Object apply(Object obj) {
        int i6 = this.f6917a;
        Object obj2 = this.f6918b;
        switch (i6) {
            case 0:
                n30 n30Var = (n30) obj2;
                JSONObject jSONObject = (JSONObject) obj;
                sn snVar = zn.f11349a;
                zzbe.zzb();
                SharedPreferences sharedPreferencesA = vn.a(n30Var.f7306u);
                if (sharedPreferencesA != null) {
                    SharedPreferences.Editor editorEdit = sharedPreferencesA.edit();
                    zzbe.zza();
                    ArrayList arrayList = zzbe.zza().f9587a;
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj3 = arrayList.get(i7);
                        i7++;
                        tn tnVar = (tn) obj3;
                        if (tnVar.f9348a == 1) {
                            tnVar.d(editorEdit, tnVar.a(jSONObject));
                        }
                    }
                    if (jSONObject != null) {
                        editorEdit.putString("flag_configuration", jSONObject.toString());
                    } else {
                        zzo.zzg("Flag Json is null.");
                    }
                    zzbe.zzb();
                    editorEdit.commit();
                    SharedPreferences sharedPreferences = n30Var.f7307v;
                    if (sharedPreferences != null) {
                        sharedPreferences.edit().putLong("js_last_update", zzv.zzC().a()).apply();
                    }
                }
                return null;
            default:
                ((s91) obj2).f8854a.h("TrustlessTokenSignal", (Exception) obj);
                return new f51(null, 2);
        }
    }
}
