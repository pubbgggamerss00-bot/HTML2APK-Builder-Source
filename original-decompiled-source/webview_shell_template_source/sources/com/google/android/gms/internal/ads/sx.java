package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzv;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class sx implements pr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9041a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9042b;

    public /* synthetic */ sx(int i6, Object obj) {
        this.f9041a = i6;
        this.f9042b = obj;
    }

    @Override // com.google.android.gms.internal.ads.pr1
    public final c5.a zza(Object obj) throws JSONException {
        switch (this.f9041a) {
            case 0:
                o70 o70Var = new o70();
                zzv.zzq();
                String string = UUID.randomUUID().toString();
                xt.f10680o.a(string, new tx(o70Var));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", string);
                jSONObject.put("args", (JSONObject) this.f9042b);
                ((dx) obj).l0("google.afma.activeView.handleUpdate", jSONObject);
                return o70Var;
            case 1:
                return bs1.m(new jx0((InputStream) obj, (r30) this.f9042b));
            default:
                jx0 jx0Var = (jx0) obj;
                return bs1.m(new ac1(new v31(13, ((tw0) this.f9042b).f9397c), androidx.fragment.app.f0.k(new InputStreamReader(jx0Var.f6186a), jx0Var.f6187b)));
        }
    }

    public /* synthetic */ sx(ux uxVar, Object obj) {
        this.f9041a = 0;
        this.f9042b = obj;
    }
}
