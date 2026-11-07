package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class n21 {

    /* renamed from: a, reason: collision with root package name */
    public final i3.a f7297a;

    /* renamed from: b, reason: collision with root package name */
    public final wv0 f7298b;

    /* renamed from: c, reason: collision with root package name */
    public final cf1 f7299c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f7300d = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final boolean f7301e = ((Boolean) zzbe.zzc().a(zn.G6)).booleanValue();

    /* renamed from: f, reason: collision with root package name */
    public final e01 f7302f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7303g;
    public long h;

    /* renamed from: i, reason: collision with root package name */
    public long f7304i;

    public n21(i3.a aVar, wv0 wv0Var, e01 e01Var, cf1 cf1Var) {
        this.f7297a = aVar;
        this.f7298b = wv0Var;
        this.f7302f = e01Var;
        this.f7299c = cf1Var;
    }

    public final synchronized void a(ac1 ac1Var, tb1 tb1Var, c5.a aVar, af1 af1Var) {
        vb1 vb1Var = (vb1) ac1Var.f2648b.f1103u;
        long jB = this.f7297a.b();
        String str = tb1Var.f9212w;
        if (str != null) {
            this.f7300d.put(tb1Var, new m21(str, tb1Var.f9182f0, 9, 0L, null));
            l21 l21Var = new l21(this, jB, vb1Var, tb1Var, str, af1Var, ac1Var);
            aVar.addListener(new as1(0, aVar, l21Var), i70.f5592g);
        }
    }

    public final synchronized String b() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.f7300d.entrySet().iterator();
            while (it.hasNext()) {
                m21 m21Var = (m21) ((Map.Entry) it.next()).getValue();
                if (m21Var.f6910c != Integer.MAX_VALUE) {
                    arrayList.add(m21Var.toString());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return TextUtils.join("_", arrayList);
    }

    public final synchronized void c(List list) {
        this.f7304i = this.f7297a.b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            tb1 tb1Var = (tb1) it.next();
            if (!TextUtils.isEmpty(tb1Var.f9212w)) {
                this.f7300d.put(tb1Var, new m21(tb1Var.f9212w, tb1Var.f9182f0, Integer.MAX_VALUE, 0L, null));
            }
        }
    }

    public final synchronized void d(tb1 tb1Var) {
        m21 m21Var = (m21) this.f7300d.get(tb1Var);
        if (m21Var == null || this.f7303g) {
            return;
        }
        m21Var.f6910c = 8;
    }
}
