package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class u51 implements p81 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9463a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9464b;

    public /* synthetic */ u51(int i6, Object obj) {
        this.f9463a = i6;
        this.f9464b = obj;
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final /* bridge */ /* synthetic */ void a(Object obj) throws JSONException {
        switch (this.f9463a) {
            case 0:
                lc1.c(((ck0) obj).f3610a, "android_permissions", (ArrayList) this.f9464b);
                break;
            case 1:
                lc1.b("key_schema", ((ck0) obj).f3610a, (String) this.f9464b);
                break;
            case 2:
                Integer num = (Integer) this.f9464b;
                ck0 ck0Var = (ck0) obj;
                if (num != null) {
                    ck0Var.f3610a.putInt("dspct", Math.min(num.intValue(), 20));
                    break;
                }
                break;
            default:
                try {
                    ((JSONObject) obj).put("cache_state", (JSONObject) this.f9464b);
                    break;
                } catch (JSONException unused) {
                    zze.zza("Unable to get cache_state");
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final /* synthetic */ void zza(Object obj) {
        int i6 = this.f9463a;
    }

    private final /* synthetic */ void b(Object obj) {
    }

    private final /* synthetic */ void c(Object obj) {
    }

    private final /* synthetic */ void d(Object obj) {
    }

    private final /* synthetic */ void e(Object obj) {
    }
}
