package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b21 {

    /* renamed from: c, reason: collision with root package name */
    public final ps1 f2896c;

    /* renamed from: f, reason: collision with root package name */
    public o21 f2899f;
    public final String h;

    /* renamed from: i, reason: collision with root package name */
    public final int f2901i;

    /* renamed from: j, reason: collision with root package name */
    public final n21 f2902j;

    /* renamed from: k, reason: collision with root package name */
    public tb1 f2903k;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2894a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2895b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f2897d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f2898e = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    public int f2900g = Integer.MAX_VALUE;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2904l = false;

    public b21(ac1 ac1Var, n21 n21Var, ps1 ps1Var) {
        this.f2901i = ((vb1) ac1Var.f2648b.f1103u).f9789r;
        this.f2902j = n21Var;
        this.f2896c = ps1Var;
        this.h = r21.a(ac1Var);
        List list = (List) ac1Var.f2648b.s;
        for (int i6 = 0; i6 < list.size(); i6++) {
            this.f2894a.put((tb1) list.get(i6), Integer.valueOf(i6));
        }
        this.f2895b.addAll(list);
    }

    public final synchronized tb1 a() {
        try {
            if (f()) {
                for (int i6 = 0; i6 < this.f2895b.size(); i6++) {
                    tb1 tb1Var = (tb1) this.f2895b.get(i6);
                    String str = tb1Var.f9207t0;
                    if (!this.f2898e.contains(str)) {
                        if (tb1Var.f9211v0) {
                            this.f2904l = true;
                        }
                        if (!TextUtils.isEmpty(str)) {
                            this.f2898e.add(str);
                        }
                        this.f2897d.add(tb1Var);
                        return (tb1) this.f2895b.remove(i6);
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0057 A[Catch: all -> 0x005c, TRY_LEAVE, TryCatch #2 {, blocks: (B:4:0x0002, B:5:0x0010, B:7:0x0017, B:9:0x001a, B:27:0x004f, B:34:0x0057, B:31:0x0053, B:41:0x0060, B:46:0x0065, B:6:0x0011, B:11:0x001c, B:13:0x0022, B:24:0x004c, B:26:0x004e, B:30:0x0052), top: B:53:0x0002, inners: #1, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void b(tb1 tb1Var) {
        boolean z6;
        z6 = false;
        this.f2904l = false;
        this.f2897d.remove(tb1Var);
        this.f2898e.remove(tb1Var.f9207t0);
        synchronized (this) {
        }
        if (!this.f2896c.isDone()) {
            synchronized (this) {
                if (e(true)) {
                    z6 = true;
                    if (!z6) {
                    }
                } else {
                    synchronized (this) {
                        try {
                            ArrayList arrayList = this.f2897d;
                            int size = arrayList.size();
                            int i6 = 0;
                            while (i6 < size) {
                                Object obj = arrayList.get(i6);
                                i6++;
                                Integer num = (Integer) this.f2894a.get((tb1) obj);
                                if ((num != null ? num.intValue() : Integer.MAX_VALUE) < this.f2900g) {
                                    z6 = true;
                                    break;
                                }
                            }
                            if (!z6) {
                                d();
                            }
                        } finally {
                        }
                    }
                }
            }
        }
    }

    public final synchronized void c(o21 o21Var, tb1 tb1Var) {
        boolean z6;
        z6 = false;
        this.f2904l = false;
        this.f2897d.remove(tb1Var);
        synchronized (this) {
        }
        if (this.f2896c.isDone()) {
            o21Var.zzr();
            return;
        }
        Integer num = (Integer) this.f2894a.get(tb1Var);
        int iIntValue = num != null ? num.intValue() : Integer.MAX_VALUE;
        if (iIntValue > this.f2900g) {
            this.f2902j.d(tb1Var);
            return;
        }
        if (this.f2899f != null) {
            this.f2902j.d(this.f2903k);
        }
        this.f2900g = iIntValue;
        this.f2899f = o21Var;
        this.f2903k = tb1Var;
        synchronized (this) {
            if (e(true)) {
                z6 = true;
                break;
            }
            synchronized (this) {
                try {
                    ArrayList arrayList = this.f2897d;
                    int size = arrayList.size();
                    int i6 = 0;
                    while (i6 < size) {
                        Object obj = arrayList.get(i6);
                        i6++;
                        Integer num2 = (Integer) this.f2894a.get((tb1) obj);
                        if ((num2 != null ? num2.intValue() : Integer.MAX_VALUE) < this.f2900g) {
                            z6 = true;
                            break;
                        }
                    }
                } finally {
                }
            }
            if (z6) {
                return;
            }
            d();
        }
    }

    public final synchronized void d() {
        n21 n21Var = this.f2902j;
        tb1 tb1Var = this.f2903k;
        synchronized (n21Var) {
            try {
                n21Var.h = n21Var.f7297a.b() - n21Var.f7304i;
                if (tb1Var != null) {
                    n21Var.f7302f.a(tb1Var);
                }
                n21Var.f7303g = true;
            } catch (Throwable th) {
                throw th;
            }
        }
        o21 o21Var = this.f2899f;
        if (o21Var != null) {
            this.f2896c.e(o21Var);
        } else {
            this.f2896c.f(new p21(3, this.h));
        }
    }

    public final synchronized boolean e(boolean z6) {
        try {
            ArrayList arrayList = this.f2895b;
            int size = arrayList.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayList.get(i6);
                i6++;
                tb1 tb1Var = (tb1) obj;
                Integer num = (Integer) this.f2894a.get(tb1Var);
                int iIntValue = num != null ? num.intValue() : Integer.MAX_VALUE;
                if (z6 || !this.f2898e.contains(tb1Var.f9207t0)) {
                    int i7 = this.f2900g;
                    if (iIntValue < i7) {
                        return true;
                    }
                    if (iIntValue > i7) {
                        break;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean f() {
        if (this.f2904l) {
            return false;
        }
        if (!this.f2895b.isEmpty() && ((tb1) this.f2895b.get(0)).f9211v0 && !this.f2897d.isEmpty()) {
            return false;
        }
        synchronized (this) {
            if (!this.f2896c.isDone()) {
                ArrayList arrayList = this.f2897d;
                if (arrayList.size() < this.f2901i && e(false)) {
                    return true;
                }
            }
            return false;
        }
    }
}
