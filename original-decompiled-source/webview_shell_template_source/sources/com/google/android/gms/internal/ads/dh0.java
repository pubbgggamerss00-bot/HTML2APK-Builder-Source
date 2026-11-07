package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzg;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.rewarded.RewardItem;
import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class dh0 implements a7, hc, OnH5AdsEventListener, InitializationStatus, ac0, RewardItem, td1, om0, zr1, jk, zzg, p41, or1, qk1, i32, eq0 {

    /* renamed from: u, reason: collision with root package name */
    public static final iu1 f3936u = new iu1(12);
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public Object f3937t;

    public /* synthetic */ dh0(int i6, Object obj) {
        this.s = i6;
        this.f3937t = obj;
    }

    @Override // com.google.android.gms.internal.ads.zr1
    /* renamed from: a */
    public void mo2a(Object obj) {
        o70 o70Var;
        fp0 fp0Var = (fp0) this.f3937t;
        xa0 xa0Var = (xa0) obj;
        jp0 jp0Var = fp0Var.f4749k;
        synchronized (jp0Var) {
            jp0Var.f6132k = xa0Var;
        }
        jp0 jp0Var2 = fp0Var.f4749k;
        synchronized (jp0Var2) {
            o70Var = jp0Var2.f6135n;
        }
        vz0 vz0VarQ = fp0Var.q("Google", true);
        if (vz0VarQ != null && o70Var != null) {
            o70Var.a(vz0VarQ);
        } else if (o70Var != null) {
            o70Var.cancel(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.a7
    public void b(byte[] bArr, int i6, int i7, c7 c7Var) {
        xg0 xg0VarA;
        ex0 ex0Var = (ex0) this.f3937t;
        ex0Var.h(i6 + i7, bArr);
        ex0Var.j(i6);
        ArrayList arrayList = new ArrayList();
        while (ex0Var.o() > 0) {
            y5.p("Incomplete Mp4Webvtt Top Level box header found.", ex0Var.o() >= 8);
            int iQ = ex0Var.q() - 8;
            if (ex0Var.q() == 1987343459) {
                CharSequence charSequenceA = null;
                mf0 mf0VarA = null;
                while (iQ > 0) {
                    y5.p("Incomplete vtt cue box header found.", iQ >= 8);
                    int iQ2 = ex0Var.q();
                    int iQ3 = ex0Var.q();
                    int i8 = iQ - 8;
                    int i9 = iQ2 - 8;
                    byte[] bArr2 = ex0Var.f4416a;
                    int i10 = ex0Var.f4417b;
                    int i11 = j31.f5914a;
                    String str = new String(bArr2, i10, i9, StandardCharsets.UTF_8);
                    ex0Var.k(i9);
                    if (iQ3 == 1937011815) {
                        l8 l8Var = new l8();
                        m8.f(str, l8Var);
                        mf0VarA = l8Var.a();
                    } else if (iQ3 == 1885436268) {
                        charSequenceA = m8.a(null, str.trim(), Collections.EMPTY_LIST);
                    }
                    iQ = i8 - i9;
                }
                if (charSequenceA == null) {
                    charSequenceA = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                }
                if (mf0VarA != null) {
                    mf0VarA.f7111a = charSequenceA;
                    xg0VarA = mf0VarA.a();
                } else {
                    l8 l8Var2 = new l8();
                    l8Var2.f6599c = charSequenceA;
                    xg0VarA = l8Var2.a().a();
                }
                arrayList.add(xg0VarA);
            } else {
                ex0Var.k(iQ);
            }
        }
        c7Var.mo6zza(new v6(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    @Override // com.google.android.gms.internal.ads.jk
    public void c(cn cnVar) {
        pk pkVarR = ((dn) cnVar.f4126t).K().r();
        tm tmVarR = ((dn) cnVar.f4126t).K().D().r();
        String str = ((vb1) ((ac1) this.f3937t).f2648b.f1103u).f9774b;
        tmVarR.i();
        um.B((um) tmVarR.f4126t, str);
        pkVarR.i();
        qk.C((qk) pkVarR.f4126t, tmVarR.g());
        cnVar.i();
        dn.D((dn) cnVar.f4126t, pkVarR.g());
    }

    public void d(long j6, ex0 ex0Var) {
        switch (this.s) {
            case 2:
                f0.i(j6, ex0Var, ((x5) this.f3937t).H);
                break;
            default:
                f0.i(j6, ex0Var, ((x9) this.f3937t).f10443b);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.p41
    public void g(ti0 ti0Var) {
        switch (this.s) {
            case 17:
                fh0 fh0Var = (fh0) ti0Var;
                synchronized (((h41) this.f3937t)) {
                    fh0 fh0Var2 = ((h41) this.f3937t).A;
                    if (fh0Var2 != null) {
                        dl0 dl0Var = fh0Var2.f9290c;
                        dl0Var.getClass();
                        dl0Var.o0(new wg1(null));
                    }
                    ((h41) this.f3937t).A = fh0Var;
                    fh0Var.a();
                }
                return;
            case 18:
                xn0 xn0Var = (xn0) ti0Var;
                synchronized (((m41) this.f3937t)) {
                    ((m41) this.f3937t).B = xn0Var;
                    xn0Var.a();
                }
                return;
            default:
                bh0 bh0Var = (bh0) ti0Var;
                synchronized (((fa1) this.f3937t)) {
                    try {
                        bh0 bh0Var2 = ((fa1) this.f3937t).C;
                        if (bh0Var2 != null) {
                            bh0Var2.b();
                        }
                        fa1 fa1Var = (fa1) this.f3937t;
                        fa1Var.C = bh0Var;
                        xa0 xa0Var = bh0Var.f3172j;
                        if (xa0Var != null) {
                            xa0Var.E(fa1Var);
                        }
                        fa1 fa1Var2 = (fa1) this.f3937t;
                        fa1Var2.f4574x.i(new ch0(bh0Var, fa1Var2, fa1Var2.f4574x, fa1Var2.f4576z));
                        bh0Var.a();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    @Override // com.google.android.gms.ads.initialization.InitializationStatus
    public Map getAdapterStatusMap() {
        return (HashMap) this.f3937t;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public int getAmount() {
        o40 o40Var = (o40) this.f3937t;
        if (o40Var != null) {
            try {
                return o40Var.zze();
            } catch (RemoteException e6) {
                zzo.zzk("Could not forward getAmount to RewardItem", e6);
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public String getType() {
        o40 o40Var = (o40) this.f3937t;
        if (o40Var != null) {
            try {
                return o40Var.zzf();
            } catch (RemoteException e6) {
                zzo.zzk("Could not forward getType to RewardItem", e6);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zr1
    public void j(Throwable th) {
        if (((Boolean) zzbe.zzc().a(zn.f11439m5)).booleanValue()) {
            zzv.zzp().g("omid native display exp", th);
        }
    }

    @Override // com.google.android.gms.ads.h5.OnH5AdsEventListener
    public void onH5AdsEvent(String str) {
        int i6 = cv.f3670d;
        ((WebView) this.f3937t).evaluateJavascript(str, null);
    }

    @Override // com.google.android.gms.internal.ads.hc
    /* renamed from: zza, reason: collision with other method in class */
    public File mo4zza() {
        return (File) this.f3937t;
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public synchronized void zzb() {
        zzg zzgVar = (zzg) this.f3937t;
        if (zzgVar != null) {
            zzgVar.zzb();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public synchronized void zzc() {
        zzg zzgVar = (zzg) this.f3937t;
        if (zzgVar != null) {
            zzgVar.zzc();
        }
    }

    public /* synthetic */ dh0(xc2 xc2Var, w wVar, ra2 ra2Var) {
        this.s = 25;
        this.f3937t = wVar;
    }

    @Override // com.google.android.gms.internal.ads.or1
    public c5.a zza() {
        Bundle bundle;
        HashMap map;
        ip1 ip1VarB;
        f81 f81Var = (f81) this.f3937t;
        String lowerCase = ((Boolean) zzbe.zzc().a(zn.Ma)).booleanValue() ? f81Var.f4549e.f4211f.toLowerCase(Locale.ROOT) : f81Var.f4549e.f4211f;
        if (((Boolean) zzbe.zzc().a(zn.L1)).booleanValue()) {
            gv0 gv0Var = f81Var.h;
            synchronized (gv0Var) {
                bundle = new Bundle(gv0Var.s);
            }
        } else {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        ArrayList arrayList = new ArrayList();
        if (((Boolean) zzbe.zzc().a(zn.U1)).booleanValue()) {
            a41 a41Var = f81Var.f4547c;
            String str = f81Var.f4553j;
            synchronized (a41Var) {
                try {
                    ip1 ip1VarA = a41Var.a(str, lowerCase);
                    ip1 ip1VarC = a41Var.c(lowerCase);
                    map = new HashMap();
                    go1<Map.Entry> go1VarC = ip1VarA.s;
                    if (go1VarC == null) {
                        go1VarC = ip1VarA.c();
                        ip1VarA.s = go1VarC;
                    }
                    for (Map.Entry entry : go1VarC) {
                        String str2 = (String) entry.getKey();
                        if (ip1VarC.containsKey(str2)) {
                            d41 d41Var = (d41) ip1VarC.get(str2);
                            List list = (List) entry.getValue();
                            map.put(str2, new d41(str2, d41Var.f3760b, d41Var.f3761c, d41Var.f3762d, (list == null || list.isEmpty()) ? new Bundle() : (Bundle) list.get(0)));
                        }
                    }
                    go1 go1VarC2 = ip1VarC.s;
                    if (go1VarC2 == null) {
                        go1VarC2 = ip1VarC.c();
                        ip1VarC.s = go1VarC2;
                    }
                    up1 it = go1VarC2.iterator();
                    while (it.hasNext()) {
                        Map.Entry entry2 = (Map.Entry) it.next();
                        String str3 = (String) entry2.getKey();
                        if (!map.containsKey(str3) && ((d41) entry2.getValue()).f3762d) {
                            map.put(str3, (d41) entry2.getValue());
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            f81Var.b(arrayList, map);
        } else {
            ip1 ip1VarA2 = f81Var.f4547c.a(f81Var.f4553j, lowerCase);
            go1<Map.Entry> go1VarC3 = ip1VarA2.s;
            if (go1VarC3 == null) {
                go1VarC3 = ip1VarA2.c();
                ip1VarA2.s = go1VarC3;
            }
            for (Map.Entry entry3 : go1VarC3) {
                String str4 = (String) entry3.getKey();
                List list2 = (List) entry3.getValue();
                Bundle bundle3 = f81Var.f4549e.f4209d.zzm;
                arrayList.add(f81Var.a(str4, list2, bundle3 != null ? bundle3.getBundle(str4) : null, true, true));
            }
            a41 a41Var2 = f81Var.f4547c;
            synchronized (a41Var2) {
                ip1VarB = TextUtils.isEmpty(zzv.zzp().d().zzg().f10066e) ? ip1.f5823y : eo1.b(a41Var2.f2562b);
            }
            f81Var.b(arrayList, ip1VarB);
        }
        bo1 bo1VarL = bo1.l(arrayList);
        vw0 vw0Var = new vw0(1, arrayList, bundle2);
        hs1 hs1Var = f81Var.f4545a;
        tr1 tr1Var = new tr1(bo1VarL, true, false);
        tr1Var.H = new sr1(tr1Var, vw0Var, hs1Var);
        tr1Var.u();
        return tr1Var;
    }

    public dh0(int i6) {
        this.s = i6;
        switch (i6) {
            case 3:
                this.f3937t = new ex0();
                break;
            case 16:
                break;
            default:
                u62 u62Var = u62.f9474c;
                d62 d62Var = new d62(d52.s, f3936u);
                Charset charset = s52.f8801a;
                this.f3937t = d62Var;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.td1
    public Object zza(Object obj) {
        ac1 ac1Var = (ac1) obj;
        ro0 ro0Var = ((fj0) this.f3937t).f4696d;
        Map map = (Map) ro0Var.f8673t;
        Map map2 = (Map) ro0Var.s;
        ArrayList arrayList = (ArrayList) ac1Var.f2648b.f1102t;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj2 = arrayList.get(i6);
            i6++;
            zb1 zb1Var = (zb1) obj2;
            String str = zb1Var.f11249a;
            JSONObject jSONObject = zb1Var.f11250b;
            if (map2.containsKey(str) && jSONObject != null) {
                ((se0) map2.get(str)).c(jSONObject);
            } else if (map.containsKey(str) && jSONObject != null) {
                re0 re0Var = (re0) map.get(str);
                HashMap map3 = new HashMap();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    String strOptString = jSONObject.optString(next);
                    if (strOptString != null) {
                        map3.put(next, strOptString);
                    }
                }
                re0Var.a(map3);
            }
        }
        return ac1Var;
    }

    @Override // com.google.android.gms.internal.ads.i32
    public Object zza(String str) {
        return ((l32) this.f3937t).d(str, null);
    }

    @Override // com.google.android.gms.internal.ads.ac0, com.google.android.gms.internal.ads.p41
    /* renamed from: zza */
    public void mo1zza() {
        switch (this.s) {
            case 8:
                long jA = zzv.zzC().a();
                sw swVar = (sw) this.f3937t;
                final long j6 = swVar.f9035c;
                final ArrayList arrayList = swVar.f9034b;
                arrayList.add(Long.valueOf(jA - j6));
                zze.zza("LoadNewJavascriptEngine(onEngLoaded) latency is " + String.valueOf(arrayList.get(0)) + " ms.");
                uj1 uj1Var = zzs.zza;
                final cx cxVar = swVar.f9033a;
                final bx bxVar = swVar.f9036d;
                final qw qwVar = swVar.f9037e;
                uj1Var.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.tw
                    @Override // java.lang.Runnable
                    public final void run() {
                        cx cxVar2 = cxVar;
                        bx bxVar2 = bxVar;
                        qw qwVar2 = qwVar;
                        ArrayList arrayList2 = arrayList;
                        long j7 = j6;
                        zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Trying to acquire lock");
                        synchronized (cxVar2.f3677a) {
                            try {
                                zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock acquired");
                                if (((AtomicInteger) bxVar2.f8824u).get() != -1 && ((AtomicInteger) bxVar2.f8824u).get() != 1) {
                                    if (((Boolean) zzbe.zzc().a(zn.B7)).booleanValue()) {
                                        bxVar2.b("SdkJavascriptFactory.loadJavascriptEngine.setLoadedListener", new TimeoutException("Unable to receive /jsLoaded GMSG."));
                                    } else {
                                        bxVar2.a();
                                    }
                                    i70.f5591f.execute(new b(6, qwVar2));
                                    zze.zza("Could not receive /jsLoaded in " + String.valueOf(zzbe.zzc().a(zn.f11357b)) + " ms. JS engine session reference status(onEngLoadedTimeout) is " + ((AtomicInteger) bxVar2.f8824u).get() + ". Update status(onEngLoadedTimeout) is " + cxVar2.h + ". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is " + String.valueOf(arrayList2.get(0)) + " ms. Total latency(onEngLoadedTimeout) is " + (zzv.zzC().a() - j7) + " ms. Rejecting.");
                                    zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released");
                                    return;
                                }
                                zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released, the promise is already settled");
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                }, ((Integer) zzbe.zzc().a(zn.f11357b)).intValue());
                return;
            case 14:
                ((n70) this.f3937t).c();
                return;
            case 17:
                synchronized (((h41) this.f3937t)) {
                    ((h41) this.f3937t).A = null;
                }
                return;
            case 18:
                synchronized (((m41) this.f3937t)) {
                    ((m41) this.f3937t).B = null;
                }
                return;
            default:
                synchronized (((fa1) this.f3937t)) {
                    ((fa1) this.f3937t).C = null;
                }
                return;
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public synchronized void zza(View view) {
        zzg zzgVar = (zzg) this.f3937t;
        if (zzgVar != null) {
            zzgVar.zza(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.om0
    /* renamed from: zza */
    public void mo3zza(Object obj) {
        switch (this.s) {
            case 12:
                ((lm0) obj).G((am) this.f3937t);
                break;
            case 23:
                int i6 = gb2.f4973n0;
                boolean z6 = ((ic2) this.f3937t).f5671l;
                ((bs) obj).zzl();
                break;
            default:
                ((yc2) obj).n((w) this.f3937t);
                break;
        }
    }
}
