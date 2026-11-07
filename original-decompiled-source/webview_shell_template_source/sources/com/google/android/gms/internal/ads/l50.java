package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbo;
import com.google.android.gms.ads.internal.zzv;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class l50 implements pr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6577a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6578b;

    public /* synthetic */ l50(int i6, Object obj) {
        this.f6577a = i6;
        this.f6578b = obj;
    }

    private final c5.a a(Object obj) {
        b92 b92Var;
        hr1 hr1VarO;
        o50 o50Var = (o50) this.f6578b;
        Map map = (Map) obj;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray jSONArrayOptJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (jSONArrayOptJSONArray != null) {
                        synchronized (o50Var.h) {
                            try {
                                int length = jSONArrayOptJSONArray.length();
                                synchronized (o50Var.h) {
                                    b92Var = (b92) o50Var.f7605b.get(str);
                                }
                                if (b92Var == null) {
                                    me0.h("Cannot find the corresponding resource object for " + str);
                                } else {
                                    for (int i6 = 0; i6 < length; i6++) {
                                        String string = jSONArrayOptJSONArray.getJSONObject(i6).getString("threat_type");
                                        b92Var.i();
                                        c92.E((c92) b92Var.f4126t, string);
                                    }
                                    o50Var.f7609f = (length > 0) | o50Var.f7609f;
                                }
                            } finally {
                            }
                        }
                    }
                }
            } catch (JSONException e6) {
                if (((Boolean) zp.f11549a.c()).booleanValue()) {
                    zzo.zzf("Failed to get SafeBrowsing metadata", e6);
                }
                return bs1.l(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (o50Var.f7609f) {
            synchronized (o50Var.h) {
                g82 g82Var = o50Var.f7604a;
                g82Var.i();
                h92.P((h92) g82Var.f4126t, 10);
            }
        }
        boolean z6 = o50Var.f7609f;
        if (!(z6 && o50Var.f7610g.f7945y) && (!(o50Var.f7613k && o50Var.f7610g.f7944x) && (z6 || !o50Var.f7610g.f7942v))) {
            return ds1.f4001t;
        }
        synchronized (o50Var.h) {
            try {
                for (b92 b92Var2 : o50Var.f7605b.values()) {
                    g82 g82Var2 = o50Var.f7604a;
                    c92 c92Var = (c92) b92Var2.g();
                    g82Var2.i();
                    h92.H((h92) g82Var2.f4126t, c92Var);
                }
                g82 g82Var3 = o50Var.f7604a;
                ArrayList arrayList = o50Var.f7606c;
                g82Var3.i();
                h92.F((h92) g82Var3.f4126t, arrayList);
                g82 g82Var4 = o50Var.f7604a;
                ArrayList arrayList2 = o50Var.f7607d;
                g82Var4.i();
                h92.G((h92) g82Var4.f4126t, arrayList2);
                if (((Boolean) zp.f11549a.c()).booleanValue()) {
                    StringBuilder sb = new StringBuilder("Sending SB report\n  url: " + ((h92) o50Var.f7604a.f4126t).D() + "\n  clickUrl: " + ((h92) o50Var.f7604a.f4126t).C() + "\n  resources: \n");
                    for (c92 c92Var2 : Collections.unmodifiableList(((h92) o50Var.f7604a.f4126t).E())) {
                        sb.append("    [");
                        sb.append(c92Var2.B());
                        sb.append("] ");
                        sb.append(c92Var2.D());
                    }
                    me0.h(sb.toString());
                }
                c5.a aVarZzb = new zzbo(o50Var.f7608e).zzb(1, o50Var.f7610g.f7940t, null, ((h92) o50Var.f7604a.g()).i());
                if (((Boolean) zp.f11549a.c()).booleanValue()) {
                    aVarZzb.addListener(new m50(0), i70.f5586a);
                }
                hr1VarO = bs1.o(aVarZzb, new n50(), i70.f5592g);
            } finally {
            }
        }
        return hr1VarO;
    }

    @Override // com.google.android.gms.internal.ads.pr1
    public final c5.a zza(Object obj) throws p21 {
        switch (this.f6577a) {
            case 0:
                return a(obj);
            case 1:
                if (((xa0) obj) != null) {
                    return (gr1) this.f6578b;
                }
                throw new p21(1, "Retrieve Web View from image ad response failed.");
            case 2:
                return bs1.m(new ac1(new v31(13, ((ww0) this.f6578b).f10290d), androidx.fragment.app.f0.k(new StringReader(((JSONObject) obj).toString()), null)));
            case 3:
                s71 s71Var = (s71) this.f6578b;
                Throwable th = (Throwable) obj;
                if (((Boolean) zzbe.zzc().a(zn.f11462q2)).booleanValue()) {
                    q81 q81Var = s71Var.f8825a;
                    zzv.zzp().h("OptionalSignalTimeout:" + q81Var.zza(), th);
                }
                return ds1.f4001t;
            default:
                qd1 qd1Var = (qd1) this.f6578b;
                Exception exc = (Exception) obj;
                synchronized (qd1Var) {
                    qd1Var.f8358d = true;
                    throw exc;
                }
        }
    }

    public /* synthetic */ l50(qd1 qd1Var, l2 l2Var) {
        this.f6577a = 4;
        this.f6578b = qd1Var;
    }
}
