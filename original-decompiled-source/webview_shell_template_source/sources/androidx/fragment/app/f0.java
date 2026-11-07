package androidx.fragment.app;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.Log;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzbs;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.internal.ads.ac;
import com.google.android.gms.internal.ads.ac1;
import com.google.android.gms.internal.ads.b01;
import com.google.android.gms.internal.ads.bo1;
import com.google.android.gms.internal.ads.cb;
import com.google.android.gms.internal.ads.cp1;
import com.google.android.gms.internal.ads.de1;
import com.google.android.gms.internal.ads.fh0;
import com.google.android.gms.internal.ads.he1;
import com.google.android.gms.internal.ads.hm0;
import com.google.android.gms.internal.ads.ia1;
import com.google.android.gms.internal.ads.ie1;
import com.google.android.gms.internal.ads.lo;
import com.google.android.gms.internal.ads.mp;
import com.google.android.gms.internal.ads.ni0;
import com.google.android.gms.internal.ads.o31;
import com.google.android.gms.internal.ads.ob;
import com.google.android.gms.internal.ads.pb;
import com.google.android.gms.internal.ads.qc1;
import com.google.android.gms.internal.ads.qd0;
import com.google.android.gms.internal.ads.qk0;
import com.google.android.gms.internal.ads.r30;
import com.google.android.gms.internal.ads.s70;
import com.google.android.gms.internal.ads.tb1;
import com.google.android.gms.internal.ads.tc1;
import com.google.android.gms.internal.ads.ud1;
import com.google.android.gms.internal.ads.vb1;
import com.google.android.gms.internal.ads.wb1;
import com.google.android.gms.internal.ads.wl0;
import com.google.android.gms.internal.ads.xj1;
import com.google.android.gms.internal.ads.zb1;
import com.google.android.gms.internal.ads.zn;
import com.google.android.gms.internal.ads.zn1;
import com.google.android.gms.internal.ads.zr1;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class f0 implements ob, ud1, zr1 {
    public final Object s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f1102t;

    /* renamed from: u, reason: collision with root package name */
    public final Object f1103u;

    /* renamed from: v, reason: collision with root package name */
    public Object f1104v;

    public /* synthetic */ f0(o31 o31Var, ac1 ac1Var, tb1 tb1Var, b01 b01Var) {
        this.f1102t = o31Var;
        this.s = ac1Var;
        this.f1103u = tb1Var;
        this.f1104v = b01Var;
    }

    public static f0 k(Reader reader, r30 r30Var) throws IOException {
        try {
            try {
                return new f0(new JsonReader(reader), r30Var);
            } finally {
                i3.f.a(reader);
            }
        } catch (IOException | AssertionError | IllegalStateException | NumberFormatException | JSONException e6) {
            throw new wb1("unable to parse ServerResponse", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.zr1
    /* renamed from: a */
    public void mo2a(Object obj) {
        he1 he1Var;
        fh0 fh0Var = (fh0) obj;
        synchronized (((ia1) this.f1104v)) {
            try {
                ia1 ia1Var = (ia1) this.f1104v;
                if (ia1Var.f5648m) {
                    ia1Var.c();
                }
                if (!((Boolean) mp.f7199c.c()).booleanValue() || (he1Var = (he1) this.f1102t) == null) {
                    ie1 ie1Var = ((ia1) this.f1104v).f5644i;
                    de1 de1Var = (de1) this.s;
                    de1Var.d(fh0Var.f9288a.f2648b);
                    de1Var.f(fh0Var.f9293f.s);
                    de1Var.s(true);
                    ie1Var.b(de1Var.zzm());
                } else {
                    he1Var.g(fh0Var.f9288a.f2648b);
                    he1Var.e(fh0Var.f9293f.s);
                    de1 de1Var2 = (de1) this.s;
                    de1Var2.s(true);
                    he1Var.a(de1Var2);
                    he1Var.h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(k kVar) {
        if (((ArrayList) this.f1102t).contains(kVar)) {
            throw new IllegalStateException("Fragment already added: " + kVar);
        }
        synchronized (((ArrayList) this.f1102t)) {
            ((ArrayList) this.f1102t).add(kVar);
        }
        kVar.C = true;
    }

    public k c(String str) {
        e0 e0Var = (e0) ((HashMap) this.s).get(str);
        if (e0Var != null) {
            return e0Var.f1097c;
        }
        return null;
    }

    public k d(String str) {
        for (e0 e0Var : ((HashMap) this.s).values()) {
            if (e0Var != null) {
                k kVarD = e0Var.f1097c;
                if (!str.equals(kVarD.f1196w)) {
                    kVarD = kVarD.L.f1233c.d(str);
                }
                if (kVarD != null) {
                    return kVarD;
                }
            }
        }
        return null;
    }

    public ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (e0 e0Var : ((HashMap) this.s).values()) {
            if (e0Var != null) {
                arrayList.add(e0Var);
            }
        }
        return arrayList;
    }

    public ArrayList f() {
        ArrayList arrayList = new ArrayList();
        for (e0 e0Var : ((HashMap) this.s).values()) {
            if (e0Var != null) {
                arrayList.add(e0Var.f1097c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public List g() {
        ArrayList arrayList;
        if (((ArrayList) this.f1102t).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f1102t)) {
            arrayList = new ArrayList((ArrayList) this.f1102t);
        }
        return arrayList;
    }

    public void h(e0 e0Var) {
        k kVar = e0Var.f1097c;
        String str = kVar.f1196w;
        HashMap map = (HashMap) this.s;
        if (map.get(str) != null) {
            return;
        }
        map.put(kVar.f1196w, e0Var);
        if (y.H(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + kVar);
        }
    }

    public void i(e0 e0Var) {
        k kVar = e0Var.f1097c;
        if (kVar.S) {
            ((b0) this.f1104v).e(kVar);
        }
        if (((e0) ((HashMap) this.s).put(kVar.f1196w, null)) != null && y.H(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + kVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zr1
    public void j(Throwable th) {
        he1 he1Var;
        int i6;
        if (((Boolean) zzbe.zzc().a(zn.G5)).booleanValue()) {
            zze.zzb("Banner ad failed to load", th);
        }
        synchronized (((ia1) this.f1104v)) {
            com.google.android.gms.ads.internal.client.zze zzeVarB = tc1.b(th, ((qd0) this.f1103u).c().f4703l);
            ((ia1) this.f1104v).f5649n = zzeVarB;
            ((qk0) ((qd0) this.f1103u).G.zzb()).k0(zzeVarB);
            qc1.b(zzeVarB.zza, "BannerAdLoader.onFailure", th);
            ia1 ia1Var = (ia1) this.f1104v;
            if (ia1Var.f5648m) {
                ia1Var.d();
                ia1 ia1Var2 = (ia1) this.f1104v;
                wl0 wl0Var = ia1Var2.h;
                hm0 hm0Var = ia1Var2.f5645j;
                synchronized (hm0Var) {
                    i6 = hm0Var.s;
                }
                wl0Var.p0(i6);
            }
            if (!((Boolean) mp.f7199c.c()).booleanValue() || (he1Var = (he1) this.f1102t) == null) {
                ie1 ie1Var = ((ia1) this.f1104v).f5644i;
                de1 de1Var = (de1) this.s;
                de1Var.c(zzeVarB);
                de1Var.g(th);
                de1Var.s(false);
                ie1Var.b(de1Var.zzm());
            } else {
                he1Var.c(zzeVarB);
                de1 de1Var2 = (de1) this.s;
                de1Var2.g(th);
                de1Var2.s(false);
                he1Var.a(de1Var2);
                he1Var.h();
            }
        }
    }

    public synchronized void l(pb pbVar) {
        try {
            HashMap map = (HashMap) this.s;
            String strZzj = pbVar.zzj();
            List list = (List) map.remove(strZzj);
            if (list == null || list.isEmpty()) {
                return;
            }
            if (ac.f2645a) {
                ac.c("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), strZzj);
            }
            pb pbVar2 = (pb) list.remove(0);
            ((HashMap) this.s).put(strZzj, list);
            pbVar2.zzu(this);
            try {
                ((BlockingQueue) this.f1103u).put(pbVar2);
            } catch (InterruptedException e6) {
                ac.b("Couldn't add request to queue. %s", e6.toString());
                Thread.currentThread().interrupt();
                cb cbVar = (cb) this.f1102t;
                cbVar.f3505v = true;
                cbVar.interrupt();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean m(pb pbVar) {
        try {
            HashMap map = (HashMap) this.s;
            String strZzj = pbVar.zzj();
            if (!map.containsKey(strZzj)) {
                ((HashMap) this.s).put(strZzj, null);
                pbVar.zzu(this);
                if (ac.f2645a) {
                    ac.a("new request, sending to network %s", strZzj);
                }
                return false;
            }
            List arrayList = (List) ((HashMap) this.s).get(strZzj);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            pbVar.zzm("waiting-for-response");
            arrayList.add(pbVar);
            ((HashMap) this.s).put(strZzj, arrayList);
            if (ac.f2645a) {
                ac.a("Request for cacheKey=%s is in flight, putting on hold.", strZzj);
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.ud1
    /* renamed from: zza */
    public void mo5zza() {
        o31 o31Var = (o31) this.f1102t;
        o31Var.f7586b.a((ac1) this.s, (tb1) this.f1103u, (b01) this.f1104v);
    }

    public f0(ia1 ia1Var, he1 he1Var, de1 de1Var, qd0 qd0Var) {
        this.f1102t = he1Var;
        this.s = de1Var;
        this.f1103u = qd0Var;
        this.f1104v = ia1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v9 */
    public f0(JsonReader jsonReader, r30 r30Var) throws IOException {
        Bundle bundle;
        Bundle bundle2;
        this.f1104v = r30Var;
        if (((Boolean) zzbe.zzc().a(zn.f11424k2)).booleanValue() && r30Var != null && (bundle2 = r30Var.E) != null) {
            androidx.camera.camera2.internal.compat.workaround.c.f("server-response-parse-start", bundle2);
        }
        ?? arrayList = Collections.EMPTY_LIST;
        ArrayList arrayList2 = new ArrayList();
        jsonReader.beginObject();
        vb1 vb1Var = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if ("responses".equals(strNextName)) {
                jsonReader.beginArray();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if ("ad_configs".equals(strNextName2)) {
                        arrayList = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            arrayList.add(new tb1(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (strNextName2.equals("common")) {
                        vb1Var = new vb1(jsonReader);
                        if (((Boolean) zzbe.zzc().a(zn.f11431l2)).booleanValue() && r30Var != null && (bundle = r30Var.E) != null) {
                            bundle.putLong("normalize-ad-response-start", vb1Var.s);
                            bundle.putLong("normalize-ad-response-end", vb1Var.f9790t);
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                jsonReader.endArray();
            } else if (strNextName.equals("actions")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    String strNextString = null;
                    JSONObject jSONObjectZzi = null;
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        if ("name".equals(strNextName3)) {
                            strNextString = jsonReader.nextString();
                        } else if ("info".equals(strNextName3)) {
                            jSONObjectZzi = zzbs.zzi(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (strNextString != null) {
                        arrayList2.add(new zb1(strNextString, jSONObjectZzi));
                    }
                    jsonReader.endObject();
                }
                jsonReader.endArray();
            }
        }
        this.f1102t = arrayList2;
        this.s = arrayList;
        this.f1103u = vb1Var == null ? new vb1(new JsonReader(new StringReader("{}"))) : vb1Var;
    }

    public f0(cb cbVar, BlockingQueue blockingQueue, xj1 xj1Var) {
        this.s = new HashMap();
        this.f1104v = xj1Var;
        this.f1102t = cbVar;
        this.f1103u = blockingQueue;
    }

    public f0(cp1 cp1Var, ni0 ni0Var, s70 s70Var, lo loVar) {
        Object objL;
        if (cp1Var != null) {
            objL = bo1.l(cp1Var);
        } else {
            zn1 zn1Var = bo1.f3236t;
            objL = cp1.f3636w;
        }
        this.f1102t = objL;
        this.s = ni0Var;
        this.f1103u = s70Var;
        this.f1104v = loVar;
    }

    public f0() {
        this.f1102t = new ArrayList();
        this.s = new HashMap();
        this.f1103u = new HashMap();
    }
}
