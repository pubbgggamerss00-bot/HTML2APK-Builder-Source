package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbv;
import com.google.android.gms.ads.internal.zzv;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class tp0 extends br implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, hq0 {
    public static final cp1 G;
    public ci A;
    public wq C;
    public boolean D;
    public GestureDetector F;
    public final String s;

    /* renamed from: u, reason: collision with root package name */
    public FrameLayout f9359u;

    /* renamed from: v, reason: collision with root package name */
    public FrameLayout f9360v;

    /* renamed from: w, reason: collision with root package name */
    public final h70 f9361w;

    /* renamed from: x, reason: collision with root package name */
    public View f9362x;

    /* renamed from: z, reason: collision with root package name */
    public fp0 f9364z;

    /* renamed from: t, reason: collision with root package name */
    public HashMap f9358t = new HashMap();
    public k3.a B = null;
    public boolean E = false;

    /* renamed from: y, reason: collision with root package name */
    public final int f9363y = 244410000;

    static {
        zn1 zn1Var = bo1.f3236t;
        Object[] objArr = {"2011", "1009", "3010"};
        ap1.a(objArr, 3);
        G = bo1.k(objArr, 3);
    }

    public tp0(FrameLayout frameLayout, FrameLayout frameLayout2) {
        String str;
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2 = null;
        this.f9359u = frameLayout;
        this.f9360v = frameLayout2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.s = str;
        zzv.zzy();
        u70 u70Var = new u70(frameLayout, this);
        View view = (View) ((WeakReference) u70Var.s).get();
        ViewTreeObserver viewTreeObserver3 = (view == null || (viewTreeObserver3 = view.getViewTreeObserver()) == null || !viewTreeObserver3.isAlive()) ? null : viewTreeObserver3;
        if (viewTreeObserver3 != null) {
            u70Var.A(viewTreeObserver3);
        }
        zzv.zzy();
        v70 v70Var = new v70(frameLayout, this);
        View view2 = (View) ((WeakReference) v70Var.s).get();
        if (view2 != null && (viewTreeObserver = view2.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver2 = viewTreeObserver;
        }
        if (viewTreeObserver2 != null) {
            v70Var.A(viewTreeObserver2);
        }
        this.f9361w = i70.f5591f;
        this.A = new ci(this.f9359u.getContext(), this.f9359u);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    public final synchronized void e2() {
        int iZza;
        if (((Boolean) zzbe.zzc().a(zn.sb)).booleanValue()) {
            fp0 fp0Var = this.f9364z;
            synchronized (fp0Var) {
                iZza = fp0Var.f4750l.zza();
            }
            if (iZza != 0) {
                this.F = new GestureDetector(this.f9359u.getContext(), new xp0(this.f9364z, this));
            }
        }
    }

    public final synchronized void i1(String str) {
        DisplayMetrics displayMetrics;
        try {
            View frameLayout = new FrameLayout(this.f9360v.getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            Context context = this.f9360v.getContext();
            frameLayout.setClickable(false);
            frameLayout.setFocusable(false);
            if (!TextUtils.isEmpty(str)) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                Resources resources = context.getResources();
                if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                    try {
                        byte[] bArrDecode = Base64.decode(str, 0);
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
                        bitmapDrawable.setTargetDensity(displayMetrics.densityDpi);
                        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                        bitmapDrawable.setTileModeXY(tileMode, tileMode);
                        frameLayout.setBackground(bitmapDrawable);
                    } catch (IllegalArgumentException e6) {
                        zzo.zzk("Encountered invalid base64 watermark.", e6);
                    }
                }
            }
            this.f9360v.addView(frameLayout);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.hq0
    public final synchronized void n(String str, View view) {
        if (!this.E) {
            if (view == null) {
                this.f9358t.remove(str);
                return;
            }
            this.f9358t.put(str, new WeakReference(view));
            if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
                if (zzbv.zzi(this.f9363y)) {
                    view.setOnTouchListener(this);
                }
                view.setClickable(true);
                view.setOnClickListener(this);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        boolean zZzB;
        fp0 fp0Var = this.f9364z;
        if (fp0Var != null) {
            synchronized (fp0Var) {
                zZzB = fp0Var.f4750l.zzB();
            }
            if (zZzB) {
                fp0 fp0Var2 = this.f9364z;
                synchronized (fp0Var2) {
                    fp0Var2.f4750l.zzi();
                }
                this.f9364z.c(view, this.f9359u, zzl(), zzm(), false);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        fp0 fp0Var = this.f9364z;
        if (fp0Var != null) {
            FrameLayout frameLayout = this.f9359u;
            fp0Var.b(frameLayout, zzl(), zzm(), fp0.h(frameLayout));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        fp0 fp0Var = this.f9364z;
        if (fp0Var != null) {
            FrameLayout frameLayout = this.f9359u;
            fp0Var.b(frameLayout, zzl(), zzm(), fp0.h(frameLayout));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        int iZza;
        fp0 fp0Var = this.f9364z;
        if (fp0Var != null) {
            FrameLayout frameLayout = this.f9359u;
            synchronized (fp0Var) {
                fp0Var.f4750l.o(motionEvent, frameLayout);
            }
            if (((Boolean) zzbe.zzc().a(zn.sb)).booleanValue() && this.F != null) {
                fp0 fp0Var2 = this.f9364z;
                synchronized (fp0Var2) {
                    iZza = fp0Var2.f4750l.zza();
                }
                if (iZza != 0) {
                    this.F.onTouchEvent(motionEvent);
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.dr
    public final synchronized k3.a zzb(String str) {
        return new k3.b(zzg(str));
    }

    @Override // com.google.android.gms.internal.ads.dr
    public final synchronized void zzc() {
        try {
            if (this.E) {
                return;
            }
            fp0 fp0Var = this.f9364z;
            if (fp0Var != null) {
                fp0Var.g(this);
                this.f9364z = null;
            }
            this.f9358t.clear();
            this.f9359u.removeAllViews();
            this.f9360v.removeAllViews();
            this.f9358t = null;
            this.f9359u = null;
            this.f9360v = null;
            this.f9362x = null;
            this.A = null;
            this.E = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.dr
    public final void zzd(k3.a aVar) {
        onTouch(this.f9359u, (MotionEvent) k3.b.i1(aVar));
    }

    @Override // com.google.android.gms.internal.ads.dr
    public final synchronized void zzdt(String str, k3.a aVar) {
        n(str, (View) k3.b.i1(aVar));
    }

    @Override // com.google.android.gms.internal.ads.dr
    public final synchronized void zzdu(k3.a aVar) {
        fp0 fp0Var = this.f9364z;
        View view = (View) k3.b.i1(aVar);
        synchronized (fp0Var) {
            fp0Var.f4750l.b(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.dr
    public final synchronized void zzdv(wq wqVar) {
        if (!this.E) {
            this.D = true;
            this.C = wqVar;
            fp0 fp0Var = this.f9364z;
            if (fp0Var != null) {
                hp0 hp0Var = fp0Var.C;
                synchronized (hp0Var) {
                    hp0Var.f5451a = wqVar;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.dr
    public final synchronized void zzdw(k3.a aVar) {
        if (this.E) {
            return;
        }
        this.B = aVar;
    }

    @Override // com.google.android.gms.internal.ads.dr
    public final synchronized void zzdx(k3.a aVar) {
        if (this.E) {
            return;
        }
        Object objI1 = k3.b.i1(aVar);
        if (!(objI1 instanceof fp0)) {
            zzo.zzj("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        fp0 fp0Var = this.f9364z;
        if (fp0Var != null) {
            fp0Var.g(this);
        }
        synchronized (this) {
            this.f9361w.execute(new b(13, this));
            fp0 fp0Var2 = (fp0) objI1;
            this.f9364z = fp0Var2;
            fp0Var2.f(this);
            this.f9364z.e(this.f9359u);
            fp0 fp0Var3 = this.f9364z;
            FrameLayout frameLayout = this.f9360v;
            vz0 vz0VarO = fp0Var3.f4749k.o();
            if (fp0Var3.f4752n.c() && vz0VarO != null && frameLayout != null) {
                tz0 tz0VarZzB = zzv.zzB();
                fg1 fg1Var = vz0VarO.f9965a;
                ((sz0) tz0VarZzB).getClass();
                sz0.j(new q(8, fg1Var, frameLayout));
            }
            if (this.D) {
                hp0 hp0Var = this.f9364z.C;
                wq wqVar = this.C;
                synchronized (hp0Var) {
                    hp0Var.f5451a = wqVar;
                }
            }
            if (((Boolean) zzbe.zzc().a(zn.Y3)).booleanValue() && !TextUtils.isEmpty(this.f9364z.f4752n.b())) {
                i1(this.f9364z.f4752n.b());
            }
            e2();
        }
    }

    @Override // com.google.android.gms.internal.ads.dr
    public final synchronized void zze(k3.a aVar, int i6) {
    }

    @Override // com.google.android.gms.internal.ads.hq0
    public final /* synthetic */ View zzf() {
        return this.f9359u;
    }

    @Override // com.google.android.gms.internal.ads.hq0
    public final synchronized View zzg(String str) {
        WeakReference weakReference;
        if (!this.E && (weakReference = (WeakReference) this.f9358t.get(str)) != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.hq0
    public final FrameLayout zzh() {
        return this.f9360v;
    }

    @Override // com.google.android.gms.internal.ads.hq0
    public final ci zzi() {
        return this.A;
    }

    @Override // com.google.android.gms.internal.ads.hq0
    public final k3.a zzj() {
        return this.B;
    }

    @Override // com.google.android.gms.internal.ads.hq0
    public final synchronized String zzk() {
        return this.s;
    }

    @Override // com.google.android.gms.internal.ads.hq0
    public final synchronized Map zzl() {
        return this.f9358t;
    }

    @Override // com.google.android.gms.internal.ads.hq0
    public final synchronized Map zzm() {
        return this.f9358t;
    }

    @Override // com.google.android.gms.internal.ads.hq0
    public final synchronized Map zzn() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.hq0
    public final synchronized JSONObject zzo() {
        JSONObject jSONObjectM;
        fp0 fp0Var = this.f9364z;
        if (fp0Var == null) {
            return null;
        }
        FrameLayout frameLayout = this.f9359u;
        Map mapZzl = zzl();
        Map mapZzm = zzm();
        synchronized (fp0Var) {
            jSONObjectM = fp0Var.f4750l.m(frameLayout, mapZzl, mapZzm, fp0Var.j());
        }
        return jSONObjectM;
    }

    @Override // com.google.android.gms.internal.ads.hq0
    public final synchronized JSONObject zzp() {
        JSONObject jSONObjectR;
        fp0 fp0Var = this.f9364z;
        if (fp0Var == null) {
            return null;
        }
        FrameLayout frameLayout = this.f9359u;
        Map mapZzl = zzl();
        Map mapZzm = zzm();
        synchronized (fp0Var) {
            jSONObjectR = fp0Var.f4750l.r(frameLayout, mapZzl, mapZzm, fp0Var.j());
        }
        return jSONObjectR;
    }
}
