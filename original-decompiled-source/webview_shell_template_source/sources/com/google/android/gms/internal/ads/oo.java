package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
@Deprecated
/* loaded from: classes.dex */
public final class oo {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedList f7819a = new LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f7820b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f7821c;

    public oo(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f7820b = linkedHashMap;
        this.f7821c = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str);
    }

    public final mo a() {
        mo moVar;
        boolean zBooleanValue = ((Boolean) zzbe.zzc().a(zn.Y1)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap map = new HashMap();
        synchronized (this.f7821c) {
            try {
                for (ko koVar : this.f7819a) {
                    long j6 = koVar.f6449a;
                    String str = koVar.f6450b;
                    ko koVar2 = koVar.f6451c;
                    if (koVar2 != null && j6 > 0) {
                        long j7 = j6 - koVar2.f6449a;
                        sb.append(str);
                        sb.append('.');
                        sb.append(j7);
                        sb.append(',');
                        if (zBooleanValue) {
                            if (map.containsKey(Long.valueOf(koVar2.f6449a))) {
                                StringBuilder sb2 = (StringBuilder) map.get(Long.valueOf(koVar2.f6449a));
                                sb2.append('+');
                                sb2.append(str);
                            } else {
                                map.put(Long.valueOf(koVar2.f6449a), new StringBuilder(str));
                            }
                        }
                    }
                }
                this.f7819a.clear();
                String string = null;
                if (!TextUtils.isEmpty(null)) {
                    sb.append((String) null);
                } else if (sb.length() > 0) {
                    sb.setLength(sb.length() - 1);
                }
                StringBuilder sb3 = new StringBuilder();
                if (zBooleanValue) {
                    for (Map.Entry entry : map.entrySet()) {
                        sb3.append((CharSequence) entry.getValue());
                        sb3.append('.');
                        sb3.append((((Long) entry.getKey()).longValue() - zzv.zzC().b()) + zzv.zzC().a());
                        sb3.append(',');
                    }
                    if (sb3.length() > 0) {
                        sb3.setLength(sb3.length() - 1);
                    }
                    string = sb3.toString();
                }
                moVar = new mo(sb.toString(), string);
            } catch (Throwable th) {
                throw th;
            }
        }
        return moVar;
    }

    public final void b(String str, String str2) {
        co coVarC;
        if (TextUtils.isEmpty(str2) || (coVarC = zzv.zzp().c()) == null) {
            return;
        }
        synchronized (this.f7821c) {
            jo joVar = (jo) coVarC.f3621c.get(str);
            if (joVar == null) {
                joVar = jo.f6111a;
            }
            LinkedHashMap linkedHashMap = this.f7820b;
            linkedHashMap.put(str, joVar.a((String) linkedHashMap.get(str), str2));
        }
    }

    public final void c(ko koVar, long j6, String... strArr) {
        synchronized (this.f7821c) {
            this.f7819a.add(new ko(j6, strArr[0], koVar));
        }
    }
}
