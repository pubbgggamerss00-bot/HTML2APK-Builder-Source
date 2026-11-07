package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.client.zzbc;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class h20 implements com.google.android.gms.internal.consent_sdk.z8 {

    /* renamed from: w, reason: collision with root package name */
    public static l60 f5215w;
    public final Object s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f5216t;

    /* renamed from: u, reason: collision with root package name */
    public final Object f5217u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f5218v;

    public /* synthetic */ h20(kd0 kd0Var, td0 td0Var, Long l4, String str) {
        this.f5217u = kd0Var;
        this.f5218v = td0Var;
        this.f5216t = l4;
        this.s = str;
    }

    public static l60 a(Context context) {
        l60 l60Var;
        synchronized (h20.class) {
            try {
                if (f5215w == null) {
                    f5215w = zzbc.zza().zzt(context, new dy());
                }
                l60Var = f5215w;
            } catch (Throwable th) {
                throw th;
            }
        }
        return l60Var;
    }

    public static String g(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        ke keVarB = le.B();
        keVarB.i();
        le.E((le) keVarB.f4126t, 5);
        e42 e42VarS = g42.s(0, bArr.length, bArr);
        keVarB.i();
        le.C((le) keVarB.f4126t, e42VarS);
        return Base64.encodeToString(((le) keVarB.g()).i(), 11);
    }

    @Override // com.google.android.gms.internal.consent_sdk.a9
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public p2.g zzb() {
        return new p2.g((com.google.android.gms.internal.consent_sdk.b1) ((com.google.android.gms.internal.consent_sdk.y8) this.f5216t).zzb(), ((com.google.android.gms.internal.consent_sdk.i) this.f5217u).zzb(), (com.google.android.gms.internal.consent_sdk.j) ((com.google.android.gms.internal.consent_sdk.y8) this.f5218v).zzb(), (com.google.android.gms.internal.consent_sdk.g0) ((com.google.android.gms.internal.consent_sdk.y8) this.s).zzb());
    }

    public synchronized void c(MotionEvent motionEvent) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            HashMap map = new HashMap();
            map.put("t", new Throwable());
            map.put("aid", null);
            map.put("evt", motionEvent);
            this.f5216t.getClass().getDeclaredMethod("he", Map.class).invoke(this.f5216t, map);
            ((xh1) this.s).c(3003, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e6) {
            throw new ej1(2005, e6);
        }
    }

    public synchronized int d() {
        try {
        } catch (Exception e6) {
            throw new ej1(2006, e6);
        }
        return ((Integer) this.f5216t.getClass().getDeclaredMethod("lcs", null).invoke(this.f5216t, null)).intValue();
    }

    public synchronized void e() {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f5216t.getClass().getDeclaredMethod("close", null).invoke(this.f5216t, null);
            ((xh1) this.s).c(3001, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e6) {
            throw new ej1(2003, e6);
        }
    }

    public synchronized boolean f() {
        try {
        } catch (Exception e6) {
            throw new ej1(2001, e6);
        }
        return ((Boolean) this.f5216t.getClass().getDeclaredMethod("init", null).invoke(this.f5216t, null)).booleanValue();
    }

    public synchronized byte[] h(HashMap map) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e6) {
            ((xh1) this.s).b(2007, System.currentTimeMillis() - jCurrentTimeMillis, e6);
            return null;
        }
        return (byte[]) this.f5216t.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(this.f5216t, null, map);
    }

    public h20(ui2 ui2Var, boolean[] zArr) {
        this.f5216t = ui2Var;
        this.f5217u = zArr;
        int i6 = ui2Var.f9567a;
        this.f5218v = new boolean[i6];
        this.s = new boolean[i6];
    }

    public /* synthetic */ h20(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f5216t = obj;
        this.f5217u = obj2;
        this.f5218v = obj3;
        this.s = obj4;
    }
}
