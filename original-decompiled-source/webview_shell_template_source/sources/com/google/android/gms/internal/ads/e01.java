package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e01 {

    /* renamed from: c, reason: collision with root package name */
    public final String f4069c;

    /* renamed from: d, reason: collision with root package name */
    public vb1 f4070d = null;

    /* renamed from: e, reason: collision with root package name */
    public tb1 f4071e = null;

    /* renamed from: f, reason: collision with root package name */
    public zzw f4072f = null;

    /* renamed from: b, reason: collision with root package name */
    public final Map f4068b = Collections.synchronizedMap(new HashMap());

    /* renamed from: a, reason: collision with root package name */
    public final List f4067a = Collections.synchronizedList(new ArrayList());

    public e01(String str) {
        this.f4069c = str;
    }

    public static String b(tb1 tb1Var) {
        return ((Boolean) zzbe.zzc().a(zn.H3)).booleanValue() ? tb1Var.p0 : tb1Var.f9212w;
    }

    public final void a(tb1 tb1Var) {
        String strB = b(tb1Var);
        Map map = this.f4068b;
        Object obj = map.get(strB);
        List list = this.f4067a;
        int iIndexOf = list.indexOf(obj);
        if (iIndexOf < 0 || iIndexOf >= map.size()) {
            iIndexOf = list.indexOf(this.f4072f);
        }
        if (iIndexOf < 0 || iIndexOf >= map.size()) {
            return;
        }
        this.f4072f = (zzw) list.get(iIndexOf);
        while (true) {
            iIndexOf++;
            if (iIndexOf >= list.size()) {
                return;
            }
            zzw zzwVar = (zzw) list.get(iIndexOf);
            zzwVar.zzb = 0L;
            zzwVar.zzc = null;
        }
    }

    public final synchronized void c(tb1 tb1Var, int i6) {
        Map map = this.f4068b;
        String strB = b(tb1Var);
        if (map.containsKey(strB)) {
            return;
        }
        Bundle bundle = new Bundle();
        Iterator<String> itKeys = tb1Var.f9210v.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                bundle.putString(next, tb1Var.f9210v.getString(next));
            } catch (JSONException unused) {
            }
        }
        zzw zzwVar = new zzw(tb1Var.E, 0L, null, bundle, tb1Var.F, tb1Var.G, tb1Var.H, tb1Var.I);
        try {
            this.f4067a.add(i6, zzwVar);
        } catch (IndexOutOfBoundsException e6) {
            zzv.zzp().h("AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation", e6);
        }
        this.f4068b.put(strB, zzwVar);
    }

    public final void d(tb1 tb1Var, long j6, zze zzeVar, boolean z6) {
        String strB = b(tb1Var);
        Map map = this.f4068b;
        if (map.containsKey(strB)) {
            if (this.f4071e == null) {
                this.f4071e = tb1Var;
            }
            zzw zzwVar = (zzw) map.get(strB);
            zzwVar.zzb = j6;
            zzwVar.zzc = zzeVar;
            if (((Boolean) zzbe.zzc().a(zn.D6)).booleanValue() && z6) {
                this.f4072f = zzwVar;
            }
        }
    }
}
