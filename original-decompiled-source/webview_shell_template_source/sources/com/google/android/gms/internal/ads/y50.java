package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.SparseArray;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class y50 implements jo0 {

    /* renamed from: w, reason: collision with root package name */
    public static y50 f10859w;
    public final Object s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f10860t;

    /* renamed from: u, reason: collision with root package name */
    public final Object f10861u;

    /* renamed from: v, reason: collision with root package name */
    public Object f10862v;

    public y50(Context context, i3.a aVar, zzj zzjVar, b60 b60Var) {
        this.s = aVar;
        y92 y92VarA = y92.a(context);
        y92 y92VarA2 = y92.a(zzjVar);
        int i6 = 0;
        this.f10860t = w92.b(new t50(y92VarA, y92VarA2, i6));
        y92 y92VarA3 = y92.a(aVar);
        w92 w92VarB = w92.b(new v50(y92VarA3, y92VarA2, y92.a(b60Var), i6));
        this.f10861u = w92VarB;
        this.f10862v = w92.b(new t50(y92VarA, new x50(y92VarA3, w92VarB), 1));
    }

    public static synchronized y50 b(Context context) {
        try {
            y50 y50Var = f10859w;
            if (y50Var != null) {
                return y50Var;
            }
            Context applicationContext = context.getApplicationContext();
            zn.a(applicationContext);
            zzj zzjVarD = zzv.zzp().d();
            zzjVarD.zzp(applicationContext);
            applicationContext.getClass();
            i3.a aVarZzC = zzv.zzC();
            aVarZzC.getClass();
            b60 b60VarZzo = zzv.zzo();
            ih1.k(b60VarZzo, b60.class);
            y50 y50Var2 = new y50(applicationContext, aVarZzC, zzjVarD, b60VarZzo);
            f10859w = y50Var2;
            s50 s50Var = (s50) ((w92) y50Var2.f10860t).zzb();
            SharedPreferences sharedPreferences = s50Var.f8794b;
            sharedPreferences.registerOnSharedPreferenceChangeListener(s50Var);
            s50Var.onSharedPreferenceChanged(sharedPreferences, "gad_has_consent_for_cookies");
            if (((Boolean) zzbe.zzc().a(zn.L0)).booleanValue()) {
                s50Var.onSharedPreferenceChanged(sharedPreferences, "IABTCF_TCString");
            } else {
                s50Var.onSharedPreferenceChanged(sharedPreferences, "IABTCF_PurposeConsents");
            }
            f60 f60Var = (f60) ((w92) f10859w.f10862v).zzb();
            if (((Boolean) zzbe.zzc().a(zn.E0)).booleanValue()) {
                zzv.zzq();
                Map mapZzw = zzs.zzw((String) zzbe.zzc().a(zn.F0));
                Iterator it = mapZzw.keySet().iterator();
                while (it.hasNext()) {
                    f60Var.a((String) it.next());
                }
                d60 d60Var = new d60(f60Var, mapZzw);
                synchronized (f60Var) {
                    f60Var.f4503b.add(d60Var);
                }
            }
            return f10859w;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void a(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((w.g) this.f10860t).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i6 = 0; i6 < size; i6++) {
                a(arrayList2.get(i6), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    @Override // com.google.android.gms.internal.ads.jo0
    public void c(boolean z6, Context context, vk0 vk0Var) throws io0 {
        boolean zL;
        e00 e00Var = (e00) this.f10860t;
        try {
            AdFormat adFormat = AdFormat.BANNER;
            int iOrdinal = ((AdFormat) this.f10861u).ordinal();
            if (iOrdinal == 1) {
                zL = e00Var.l(new k3.b(context));
            } else {
                if (iOrdinal != 2) {
                    if (iOrdinal == 5) {
                        zL = e00Var.k(new k3.b(context));
                    }
                    throw new io0("Adapter failed to show.");
                }
                zL = e00Var.x0(new k3.b(context));
            }
            if (zL) {
                yk0 yk0Var = (yk0) this.f10862v;
                if (yk0Var == null) {
                    return;
                }
                if (((Boolean) zzbe.zzc().a(zn.E1)).booleanValue() || ((tb1) this.s).Y != 2) {
                    return;
                }
                yk0Var.zza();
                return;
            }
            throw new io0("Adapter failed to show.");
        } catch (Throwable th) {
            throw new io0(th);
        }
    }

    public y50(tb1 tb1Var, e00 e00Var, AdFormat adFormat) {
        this.f10862v = null;
        this.s = tb1Var;
        this.f10860t = e00Var;
        this.f10861u = adFormat;
    }

    public y50(int i6) {
        switch (i6) {
            case 3:
                this.s = new ti(10, 3);
                this.f10860t = new w.g();
                this.f10861u = new ArrayList();
                this.f10862v = new HashSet();
                break;
            default:
                this.s = new w.a();
                this.f10860t = new SparseArray();
                this.f10861u = new w.d();
                this.f10862v = new w.a();
                break;
        }
    }
}
