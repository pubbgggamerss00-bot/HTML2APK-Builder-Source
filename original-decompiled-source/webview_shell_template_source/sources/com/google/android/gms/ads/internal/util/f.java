package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.jc;
import com.google.android.gms.internal.ads.lb;
import com.google.android.gms.internal.ads.pb;
import com.google.android.gms.internal.ads.ub;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class f extends pb {
    public final Object s;

    /* renamed from: t, reason: collision with root package name */
    public final g f2359t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ byte[] f2360u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Map f2361v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzl f2362w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i6, String str, g gVar, e eVar, byte[] bArr, Map map, com.google.android.gms.ads.internal.util.client.zzl zzlVar) {
        super(i6, str, eVar);
        this.f2360u = bArr;
        this.f2361v = map;
        this.f2362w = zzlVar;
        this.s = new Object();
        this.f2359t = gVar;
    }

    @Override // com.google.android.gms.internal.ads.pb
    public final ub zzh(lb lbVar) {
        String str;
        String str2;
        try {
            byte[] bArr = lbVar.f6646b;
            Map map = lbVar.f6647c;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
                String[] strArrSplit = str2.split(";", 0);
                int i6 = 1;
                while (true) {
                    if (i6 >= strArrSplit.length) {
                        break;
                    }
                    String[] strArrSplit2 = strArrSplit[i6].trim().split("=", 0);
                    if (strArrSplit2.length == 2 && strArrSplit2[0].equals("charset")) {
                        str3 = strArrSplit2[1];
                        break;
                    }
                    i6++;
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(lbVar.f6646b);
        }
        return new ub(str, jc.b(lbVar));
    }

    @Override // com.google.android.gms.internal.ads.pb
    public final Map zzl() {
        Map map = this.f2361v;
        return map == null ? Collections.EMPTY_MAP : map;
    }

    @Override // com.google.android.gms.internal.ads.pb
    public final void zzo(Object obj) throws IOException {
        g gVar;
        String str = (String) obj;
        this.f2362w.zzg(str);
        synchronized (this.s) {
            gVar = this.f2359t;
        }
        gVar.a(str);
    }

    @Override // com.google.android.gms.internal.ads.pb
    public final byte[] zzx() {
        byte[] bArr = this.f2360u;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }
}
