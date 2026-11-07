package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class o50 implements r50 {

    /* renamed from: l, reason: collision with root package name */
    public static final List f7603l = Collections.synchronizedList(new ArrayList());

    /* renamed from: a, reason: collision with root package name */
    public final g82 f7604a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f7605b;

    /* renamed from: e, reason: collision with root package name */
    public final Context f7608e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7609f;

    /* renamed from: g, reason: collision with root package name */
    public final p50 f7610g;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f7606c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f7607d = new ArrayList();
    public final Object h = new Object();

    /* renamed from: i, reason: collision with root package name */
    public final HashSet f7611i = new HashSet();

    /* renamed from: j, reason: collision with root package name */
    public boolean f7612j = false;

    /* renamed from: k, reason: collision with root package name */
    public boolean f7613k = false;

    public o50(Context context, VersionInfoParcel versionInfoParcel, p50 p50Var, String str) {
        this.f7608e = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f7605b = new LinkedHashMap();
        this.f7610g = p50Var;
        Iterator it = p50Var.f7943w.iterator();
        while (it.hasNext()) {
            this.f7611i.add(((String) it.next()).toLowerCase(Locale.ENGLISH));
        }
        this.f7611i.remove("cookie".toLowerCase(Locale.ENGLISH));
        g82 g82VarB = h92.B();
        g82VarB.i();
        h92.P((h92) g82VarB.f4126t, 9);
        g82VarB.i();
        h92.O((h92) g82VarB.f4126t, str);
        g82VarB.i();
        h92.M((h92) g82VarB.f4126t, str);
        h82 h82VarB = i82.B();
        String str2 = this.f7610g.s;
        if (str2 != null) {
            h82VarB.i();
            i82.C((i82) h82VarB.f4126t, str2);
        }
        i82 i82Var = (i82) h82VarB.g();
        g82VarB.i();
        h92.L((h92) g82VarB.f4126t, i82Var);
        d92 d92VarB = e92.B();
        boolean zC = j3.d.a(this.f7608e).c();
        d92VarB.i();
        e92.E((e92) d92VarB.f4126t, zC);
        String str3 = versionInfoParcel.afmaVersion;
        if (str3 != null) {
            d92VarB.i();
            e92.C((e92) d92VarB.f4126t, str3);
        }
        c3.h hVar = c3.h.f2184b;
        Context context2 = this.f7608e;
        hVar.getClass();
        long jA = c3.h.a(context2);
        if (jA > 0) {
            d92VarB.i();
            e92.D((e92) d92VarB.f4126t, jA);
        }
        e92 e92Var = (e92) d92VarB.g();
        g82VarB.i();
        h92.K((h92) g82VarB.f4126t, e92Var);
        this.f7604a = g82VarB;
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void a(String str, Map map, int i6) {
        synchronized (this.h) {
            if (i6 == 3) {
                try {
                    this.f7613k = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f7605b.containsKey(str)) {
                if (i6 == 3) {
                    b92 b92Var = (b92) this.f7605b.get(str);
                    b92Var.i();
                    c92.I((c92) b92Var.f4126t, 4);
                }
                return;
            }
            b92 b92VarC = c92.C();
            int i7 = i6 != 0 ? i6 != 1 ? i6 != 2 ? i6 != 3 ? 0 : 4 : 3 : 2 : 1;
            if (i7 != 0) {
                b92VarC.i();
                c92.I((c92) b92VarC.f4126t, i7);
            }
            int size = this.f7605b.size();
            b92VarC.i();
            c92.F((c92) b92VarC.f4126t, size);
            b92VarC.i();
            c92.H((c92) b92VarC.f4126t, str);
            p82 p82VarB = r82.B();
            if (!this.f7611i.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    if (this.f7611i.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        m82 m82VarB = n82.B();
                        e42 e42Var = g42.f4896t;
                        Charset charset = s52.f8801a;
                        e42 e42Var2 = new e42(str2.getBytes(charset));
                        m82VarB.i();
                        n82.C((n82) m82VarB.f4126t, e42Var2);
                        e42 e42Var3 = new e42(str3.getBytes(charset));
                        m82VarB.i();
                        n82.D((n82) m82VarB.f4126t, e42Var3);
                        n82 n82Var = (n82) m82VarB.g();
                        p82VarB.i();
                        r82.C((r82) p82VarB.f4126t, n82Var);
                    }
                }
            }
            r82 r82Var = (r82) p82VarB.g();
            b92VarC.i();
            c92.G((c92) b92VarC.f4126t, r82Var);
            this.f7605b.put(str, b92VarC);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0037 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.r50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view) {
        Bitmap bitmapCreateBitmap;
        boolean zIsDrawingCacheEnabled;
        if (this.f7610g.f7941u && !this.f7612j) {
            zzv.zzq();
            Bitmap bitmap = null;
            if (view != null) {
                try {
                    zIsDrawingCacheEnabled = view.isDrawingCacheEnabled();
                    view.setDrawingCacheEnabled(true);
                    Bitmap drawingCache = view.getDrawingCache();
                    bitmapCreateBitmap = drawingCache != null ? Bitmap.createBitmap(drawingCache) : null;
                } catch (RuntimeException e6) {
                    e = e6;
                    bitmapCreateBitmap = null;
                }
                try {
                    view.setDrawingCacheEnabled(zIsDrawingCacheEnabled);
                } catch (RuntimeException e7) {
                    e = e7;
                    zzo.zzh("Fail to capture the web view", e);
                    if (bitmapCreateBitmap != null) {
                    }
                    if (bitmap != null) {
                    }
                }
                if (bitmapCreateBitmap != null) {
                    try {
                        int width = view.getWidth();
                        int height = view.getHeight();
                        if (width == 0 || height == 0) {
                            zzo.zzj("Width or height of view is zero");
                        } else {
                            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                            Canvas canvas = new Canvas(bitmapCreateBitmap2);
                            view.layout(0, 0, width, height);
                            view.draw(canvas);
                            bitmap = bitmapCreateBitmap2;
                        }
                    } catch (RuntimeException e8) {
                        zzo.zzh("Fail to capture the webview", e8);
                    }
                } else {
                    bitmap = bitmapCreateBitmap;
                }
            }
            if (bitmap != null) {
                me0.h("Failed to capture the webview bitmap.");
            } else {
                this.f7612j = true;
                zzs.zzh(new ow(1, this, bitmap));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final p50 zza() {
        return this.f7610g;
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void zze() {
        synchronized (this.h) {
            this.f7605b.keySet();
            ds1 ds1VarM = bs1.m(Collections.EMPTY_MAP);
            l50 l50Var = new l50(0, this);
            h70 h70Var = i70.f5592g;
            gr1 gr1VarP = bs1.p(ds1VarM, l50Var, h70Var);
            c5.a aVarQ = bs1.q(gr1VarP, 10L, TimeUnit.SECONDS, i70.f5589d);
            gr1VarP.addListener(new as1(0, gr1VarP, new v31(7, aVarQ)), h70Var);
            f7603l.add(aVarQ);
        }
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final void zzh(String str) {
        synchronized (this.h) {
            try {
                if (str == null) {
                    g82 g82Var = this.f7604a;
                    g82Var.i();
                    h92.I((h92) g82Var.f4126t);
                } else {
                    g82 g82Var2 = this.f7604a;
                    g82Var2.i();
                    h92.J((h92) g82Var2.f4126t, str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.r50
    public final boolean zzi() {
        return this.f7610g.f7941u && !this.f7612j;
    }
}
