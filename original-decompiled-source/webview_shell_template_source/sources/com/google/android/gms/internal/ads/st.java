package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import java.io.IOException;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class st implements yt {
    public final /* synthetic */ int s;

    public /* synthetic */ st(int i6) {
        this.s = i6;
    }

    @Override // com.google.android.gms.internal.ads.yt
    public final void d(Object obj, Map map) {
        JSONObject jSONObjectMo7zza;
        switch (this.s) {
            case 0:
                xa0 xa0Var = (xa0) obj;
                nq nqVarZzK = xa0Var.zzK();
                if (nqVarZzK == null || (jSONObjectMo7zza = nqVarZzK.mo7zza()) == null) {
                    xa0Var.j("nativeAdViewSignalsReady", new JSONObject());
                    return;
                } else {
                    xa0Var.j("nativeAdViewSignalsReady", jSONObjectMo7zza);
                    return;
                }
            case 1:
                xa0 xa0Var2 = (xa0) obj;
                try {
                    ak1 ak1VarF = ak1.f(xa0Var2.getContext());
                    ak1VarF.getClass();
                    synchronized (ak1.class) {
                        ak1VarF.d(false);
                    }
                    bk1.g(xa0Var2.getContext()).h();
                    ck1.e(xa0Var2.getContext()).f();
                    return;
                } catch (IOException e6) {
                    zzv.zzp().h("DefaultGmsgHandlers.ResetPaid", e6);
                    return;
                }
            case 2:
                xa0 xa0Var3 = (xa0) obj;
                String str = (String) map.get("action");
                if ("pause".equals(str)) {
                    xa0Var3.zzde();
                    return;
                } else {
                    if ("resume".equals(str)) {
                        xa0Var3.zzdf();
                        return;
                    }
                    return;
                }
            default:
                zzo.zze("Show native ad policy validator overlay.");
                ((xa0) obj).zzF().setVisibility(0);
                return;
        }
    }
}
