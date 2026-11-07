package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zze;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class g71 implements p81 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4923a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4924b;

    public /* synthetic */ g71(int i6, Object obj) {
        this.f4923a = i6;
        this.f4924b = obj;
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final /* bridge */ /* synthetic */ void a(Object obj) throws JSONException {
        switch (this.f4923a) {
            case 0:
                Bundle bundle = ((ck0) obj).f3610a;
                Boolean bool = (Boolean) this.f4924b;
                if (bool != null) {
                    if (!bool.booleanValue()) {
                        bundle.putInt("lft", 0);
                        break;
                    } else {
                        bundle.putInt("lft", 1);
                        break;
                    }
                } else {
                    bundle.putInt("lft", -1);
                    break;
                }
            case 1:
                lc1.b("omid_v", ((ck0) obj).f3610a, (String) this.f4924b);
                break;
            default:
                try {
                    ((JSONObject) obj).put("eid", TextUtils.join(",", (List) this.f4924b));
                    break;
                } catch (JSONException unused) {
                    zze.zza("Failed putting experiment ids.");
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final /* synthetic */ void zza(Object obj) {
        int i6 = this.f4923a;
    }

    private final /* synthetic */ void b(Object obj) {
    }

    private final /* synthetic */ void c(Object obj) {
    }

    private final /* synthetic */ void d(Object obj) {
    }
}
