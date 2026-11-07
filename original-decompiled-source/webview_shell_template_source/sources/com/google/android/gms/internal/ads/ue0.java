package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzv;
import java.util.Set;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ue0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9544a;

    /* renamed from: b, reason: collision with root package name */
    public final ga2 f9545b;

    public /* synthetic */ ue0(ca2 ca2Var, int i6) {
        this.f9544a = i6;
        this.f9545b = ca2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0092  */
    @Override // com.google.android.gms.internal.ads.ga2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzb() throws JSONException {
        String strValueOf;
        switch (this.f9544a) {
            case 0:
                return new te0(((lc0) this.f9545b).zzb());
            case 1:
                return new rx(((lx) this.f9545b.zzb()).f6871a);
            case 2:
                return new kn0((oj0) this.f9545b.zzb(), i70.f5592g);
            case 3:
                VersionInfoParcel versionInfoParcelA = ((bd0) this.f9545b).a();
                zzv.zzq();
                return new xh(UUID.randomUUID().toString(), versionInfoParcelA, "native", new JSONObject(), true);
            case 4:
                qt0 qt0Var = (qt0) this.f9545b.zzb();
                h70 h70Var = i70.f5586a;
                ih1.j(h70Var);
                return new kn0(qt0Var, h70Var);
            case 5:
                ku0 ku0Var = (ku0) this.f9545b.zzb();
                h70 h70Var2 = i70.f5586a;
                ih1.j(h70Var2);
                Set setI = bq.i(ku0Var, h70Var2);
                ih1.j(setI);
                return setI;
            case 6:
                zzm zzmVar = ((lk0) this.f9545b).a().f4209d;
                if (((Boolean) zzbe.zzc().a(zn.b7)).booleanValue()) {
                    String str = zzmVar.zzx;
                    if (!TextUtils.isEmpty(str)) {
                        try {
                            strValueOf = new JSONObject(str).getString("request_id");
                        } catch (JSONException unused) {
                        }
                        if (TextUtils.isEmpty(strValueOf)) {
                            if (zzmVar.zzs != null) {
                                try {
                                    strValueOf = new JSONObject(zzmVar.zzs.zza).getString("request_id");
                                } catch (JSONException unused2) {
                                }
                                if (TextUtils.isEmpty(strValueOf)) {
                                    strValueOf = String.valueOf(zzbc.zze().nextInt() & Integer.MAX_VALUE);
                                }
                            }
                        }
                    }
                }
                ih1.j(strValueOf);
                return strValueOf;
            case 7:
                return new xj1(16, ((hd0) this.f9545b).zzb());
            case 8:
                h70 h70Var3 = i70.f5586a;
                ih1.j(h70Var3);
                return new b71(h70Var3, ((lk0) this.f9545b).a());
            case 9:
                return new n71(0, (sb1) this.f9545b.zzb());
            default:
                return new he1((ie1) this.f9545b.zzb());
        }
    }
}
