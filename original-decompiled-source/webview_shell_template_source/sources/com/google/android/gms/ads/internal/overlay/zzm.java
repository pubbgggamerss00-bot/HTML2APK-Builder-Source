package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.Toolbar;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.internal.ads.bu0;
import com.google.android.gms.internal.ads.cc0;
import com.google.android.gms.internal.ads.cf;
import com.google.android.gms.internal.ads.cu0;
import com.google.android.gms.internal.ads.eb0;
import com.google.android.gms.internal.ads.eg1;
import com.google.android.gms.internal.ads.fg1;
import com.google.android.gms.internal.ads.ft;
import com.google.android.gms.internal.ads.ht;
import com.google.android.gms.internal.ads.ib0;
import com.google.android.gms.internal.ads.kk;
import com.google.android.gms.internal.ads.n10;
import com.google.android.gms.internal.ads.nn;
import com.google.android.gms.internal.ads.on0;
import com.google.android.gms.internal.ads.pz0;
import com.google.android.gms.internal.ads.q;
import com.google.android.gms.internal.ads.sz0;
import com.google.android.gms.internal.ads.t10;
import com.google.android.gms.internal.ads.tz0;
import com.google.android.gms.internal.ads.uj1;
import com.google.android.gms.internal.ads.uz0;
import com.google.android.gms.internal.ads.vk0;
import com.google.android.gms.internal.ads.vz0;
import com.google.android.gms.internal.ads.xa0;
import com.google.android.gms.internal.ads.zb0;
import com.google.android.gms.internal.ads.zn;
import com.google.android.gms.internal.ads.zy0;
import java.util.Collections;
import java.util.concurrent.ScheduledFuture;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class zzm extends t10 implements zzag {
    static final int zza = Color.argb(0, 0, 0, 0);
    protected final Activity zzb;
    AdOverlayInfoParcel zzc;
    xa0 zzd;
    zzi zze;
    zzu zzf;
    FrameLayout zzh;
    WebChromeClient.CustomViewCallback zzi;
    c zzl;
    private Runnable zzq;
    private boolean zzr;
    private boolean zzs;
    private Toolbar zzw;
    boolean zzg = false;
    boolean zzj = false;
    boolean zzk = false;
    boolean zzm = false;
    int zzn = 1;
    private final Object zzo = new Object();
    private final View.OnClickListener zzp = new a(this);
    private boolean zzt = false;
    private boolean zzu = false;
    private boolean zzv = true;

    public zzm(Activity activity) {
        this.zzb = activity;
    }

    private final void zzJ(View view) {
        vz0 vz0VarE0;
        uz0 uz0VarP;
        xa0 xa0Var = this.zzd;
        if (xa0Var == null) {
            return;
        }
        if (((Boolean) zzbe.zzc().a(zn.f11394f5)).booleanValue() && (uz0VarP = xa0Var.p()) != null) {
            uz0VarP.a(view);
            return;
        }
        if (((Boolean) zzbe.zzc().a(zn.f11387e5)).booleanValue() && (vz0VarE0 = xa0Var.e0()) != null && vz0VarE0.f9966b.f3932g == eg1.f4279t) {
            tz0 tz0VarZzB = com.google.android.gms.ads.internal.zzv.zzB();
            fg1 fg1Var = vz0VarE0.f9965a;
            ((sz0) tz0VarZzB).getClass();
            sz0.j(new q(8, fg1Var, view));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzK(Configuration configuration) {
        com.google.android.gms.ads.internal.zzl zzlVar;
        com.google.android.gms.ads.internal.zzl zzlVar2;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        boolean z6 = true;
        boolean z7 = false;
        boolean z8 = (adOverlayInfoParcel == null || (zzlVar2 = adOverlayInfoParcel.zzo) == null || !zzlVar2.zzb) ? false : true;
        boolean zZzd = com.google.android.gms.ads.internal.zzv.zzr().zzd(this.zzb, configuration);
        if (!this.zzk || z8) {
            if (zZzd) {
                if (!((Boolean) zzbe.zzc().a(zn.P0)).booleanValue()) {
                    z6 = false;
                }
            }
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
            if (adOverlayInfoParcel2 != null && (zzlVar = adOverlayInfoParcel2.zzo) != null && zzlVar.zzg) {
                z7 = true;
            }
        } else if (((Boolean) zzbe.zzc().a(zn.Q0)).booleanValue()) {
        }
        Window window = this.zzb.getWindow();
        if (((Boolean) zzbe.zzc().a(zn.f11442n1)).booleanValue()) {
            window.getDecorView().setSystemUiVisibility(z6 ? z7 ? 5894 : 5380 : 256);
            return;
        }
        if (!z6) {
            window.addFlags(2048);
            window.clearFlags(1024);
            return;
        }
        window.addFlags(1024);
        window.clearFlags(2048);
        if (z7) {
            window.getDecorView().setSystemUiVisibility(4098);
        }
    }

    private static final void zzL(vz0 vz0Var, View view) {
        if (vz0Var == null || view == null) {
            return;
        }
        if (((Boolean) zzbe.zzc().a(zn.f11387e5)).booleanValue() && vz0Var.f9966b.f3932g == eg1.f4279t) {
            return;
        }
        ((sz0) com.google.android.gms.ads.internal.zzv.zzB()).d(vz0Var.f9965a, view);
    }

    public final void zzA(int i6) {
        if (this.zzb.getApplicationInfo().targetSdkVersion >= ((Integer) zzbe.zzc().a(zn.Q5)).intValue()) {
            if (this.zzb.getApplicationInfo().targetSdkVersion <= ((Integer) zzbe.zzc().a(zn.R5)).intValue()) {
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= ((Integer) zzbe.zzc().a(zn.S5)).intValue()) {
                    if (i7 <= ((Integer) zzbe.zzc().a(zn.T5)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            this.zzb.setRequestedOrientation(i6);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzv.zzp().g("AdOverlay.setRequestedOrientation", th);
        }
    }

    public final void zzB(boolean z6) {
        if (z6) {
            this.zzl.setBackgroundColor(0);
        } else {
            this.zzl.setBackgroundColor(-16777216);
        }
    }

    public final void zzC(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        FrameLayout frameLayout = new FrameLayout(this.zzb);
        this.zzh = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        this.zzh.addView(view, -1, -1);
        this.zzb.setContentView(this.zzh);
        this.zzs = true;
        this.zzi = customViewCallback;
        this.zzg = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzD(boolean z6) throws JSONException, b {
        boolean z7;
        boolean z8;
        boolean z9;
        if (!this.zzs) {
            this.zzb.requestWindowFeature(1);
        }
        Window window = this.zzb.getWindow();
        if (window == null) {
            throw new b("Invalid activity, no window available.");
        }
        xa0 xa0Var = this.zzc.zzd;
        eb0 eb0VarZzN = xa0Var != null ? xa0Var.zzN() : null;
        if (eb0VarZzN != null) {
            synchronized (eb0VarZzN.f4193v) {
                z9 = eb0VarZzN.I;
            }
            z7 = z9;
        }
        this.zzm = false;
        if (z7) {
            int i6 = this.zzc.zzj;
            if (i6 == 6) {
                z8 = this.zzb.getResources().getConfiguration().orientation == 1;
                this.zzm = z8;
            } else if (i6 == 7) {
                z8 = this.zzb.getResources().getConfiguration().orientation == 2;
                this.zzm = z8;
            }
        } else {
            z8 = false;
        }
        com.google.android.gms.ads.internal.util.client.zzo.zze("Delay onShow to next orientation change: " + z8);
        zzA(this.zzc.zzj);
        window.setFlags(16777216, 16777216);
        com.google.android.gms.ads.internal.util.client.zzo.zze("Hardware acceleration on the AdActivity window enabled.");
        if (this.zzk) {
            this.zzl.setBackgroundColor(zza);
        } else {
            this.zzl.setBackgroundColor(-16777216);
        }
        this.zzb.setContentView(this.zzl);
        this.zzs = true;
        if (z6) {
            try {
                com.google.android.gms.ads.internal.zzv.zzA();
                Activity activity = this.zzb;
                xa0 xa0Var2 = this.zzc.zzd;
                cc0 cc0VarZzO = xa0Var2 != null ? xa0Var2.zzO() : null;
                xa0 xa0Var3 = this.zzc.zzd;
                String strF = xa0Var3 != null ? xa0Var3.F() : null;
                AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
                VersionInfoParcel versionInfoParcel = adOverlayInfoParcel.zzm;
                xa0 xa0Var4 = adOverlayInfoParcel.zzd;
                xa0 xa0VarA = ib0.a(activity, cc0VarZzO, strF, true, z7, null, null, versionInfoParcel, null, xa0Var4 != null ? xa0Var4.zzj() : null, new kk(), null, null, null, null);
                this.zzd = xa0VarA;
                eb0 eb0VarZzN2 = xa0VarA.zzN();
                AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
                ft ftVar = adOverlayInfoParcel2.zzp;
                ht htVar = adOverlayInfoParcel2.zze;
                zzac zzacVar = adOverlayInfoParcel2.zzi;
                xa0 xa0Var5 = adOverlayInfoParcel2.zzd;
                eb0VarZzN2.j(null, ftVar, null, htVar, zzacVar, true, null, xa0Var5 != null ? xa0Var5.zzN().O : null, null, null, null, null, null, null, null, null, null, null, null);
                this.zzd.zzN().f4196y = new zb0() { // from class: com.google.android.gms.ads.internal.overlay.zze
                    @Override // com.google.android.gms.internal.ads.zb0
                    public final void zza(boolean z10, int i7, String str, String str2) {
                        xa0 xa0Var6 = this.zza.zzd;
                        if (xa0Var6 != null) {
                            xa0Var6.zzaa();
                        }
                    }
                };
                AdOverlayInfoParcel adOverlayInfoParcel3 = this.zzc;
                String str = adOverlayInfoParcel3.zzl;
                if (str != null) {
                    this.zzd.loadUrl(str);
                } else {
                    String str2 = adOverlayInfoParcel3.zzh;
                    if (str2 == null) {
                        throw new b("No URL or HTML to display in ad overlay.");
                    }
                    this.zzd.loadDataWithBaseURL(adOverlayInfoParcel3.zzf, str2, "text/html", "UTF-8", null);
                }
                xa0 xa0Var6 = this.zzc.zzd;
                if (xa0Var6 != null) {
                    xa0Var6.I(this);
                }
            } catch (Exception e6) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Error obtaining webview.", e6);
                throw new b("Could not obtain webview for the overlay.", e6);
            }
        } else {
            xa0 xa0Var7 = this.zzc.zzd;
            this.zzd = xa0Var7;
            xa0Var7.r(this.zzb);
        }
        if (this.zzc.zzw) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(this.zzd.u(), false);
        }
        this.zzd.d0(this);
        xa0 xa0Var8 = this.zzc.zzd;
        if (xa0Var8 != null) {
            zzL(xa0Var8.e0(), this.zzl);
        }
        if (this.zzc.zzk != 5) {
            ViewParent parent = this.zzd.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(this.zzd.zzF());
            }
            if (this.zzk) {
                this.zzd.T();
            }
            if (this.zzc.zzw) {
                Toolbar toolbar = new Toolbar(this.zzb);
                this.zzw = toolbar;
                toolbar.setId(View.generateViewId());
                this.zzd.zzF().setId(View.generateViewId());
                this.zzw.setBackgroundColor(-12303292);
                this.zzw.setVisibility(0);
                try {
                    this.zzw.setNavigationIcon(com.google.android.gms.ads.internal.zzv.zzp().b().getDrawable(R.drawable.admob_close_button_white_cross, null));
                } catch (Resources.NotFoundException | NullPointerException e7) {
                    com.google.android.gms.ads.internal.util.zze.zzb("Error obtaining close icon.", e7);
                }
                this.zzw.setNavigationOnClickListener(this.zzp);
                this.zzw.setTitleMarginStart(0);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams.addRule(10);
                this.zzl.addView(this.zzw, layoutParams);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams2.addRule(3, this.zzw.getId());
                layoutParams2.addRule(12);
                this.zzl.addView(this.zzd.zzF(), layoutParams2);
                zzJ(this.zzw);
            } else {
                this.zzl.addView(this.zzd.zzF(), -1, -1);
            }
        }
        if (!z6 && !this.zzm) {
            zze();
        }
        AdOverlayInfoParcel adOverlayInfoParcel4 = this.zzc;
        if (adOverlayInfoParcel4.zzk != 5) {
            zzw(z7);
            if (this.zzd.W()) {
                zzy(z7, true);
                return;
            }
            return;
        }
        Activity activity2 = this.zzb;
        if (activity2 == null) {
            throw new NullPointerException("Null activity");
        }
        try {
            zzf(new zy0(activity2, this, adOverlayInfoParcel4.zzq, adOverlayInfoParcel4.zzr));
        } catch (RemoteException | b e8) {
            throw new b(e8.getMessage(), e8);
        }
    }

    public final void zzE() {
        synchronized (this.zzo) {
            try {
                this.zzr = true;
                Runnable runnable = this.zzq;
                if (runnable != null) {
                    uj1 uj1Var = zzs.zza;
                    uj1Var.removeCallbacks(runnable);
                    uj1Var.post(this.zzq);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzF() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        zzr zzrVar;
        if (!this.zzb.isFinishing() || this.zzt) {
            return;
        }
        this.zzt = true;
        xa0 xa0Var = this.zzd;
        if (xa0Var != null) {
            xa0Var.A(this.zzn - 1);
            synchronized (this.zzo) {
                try {
                    if (!this.zzr && this.zzd.B()) {
                        if (((Boolean) zzbe.zzc().a(zn.Q4)).booleanValue() && !this.zzu && (adOverlayInfoParcel = this.zzc) != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
                            zzrVar.zzdo();
                        }
                        Runnable runnable = new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzd
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.zza.zzc();
                            }
                        };
                        this.zzq = runnable;
                        zzs.zza.postDelayed(runnable, ((Long) zzbe.zzc().a(zn.f11397g1)).longValue());
                        return;
                    }
                } finally {
                }
            }
        }
        zzc();
    }

    public final void zzG(String str) {
        Toolbar toolbar = this.zzw;
        if (toolbar != null) {
            toolbar.setSubtitle(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.u10
    public final boolean zzH() {
        this.zzn = 1;
        if (this.zzd == null) {
            return true;
        }
        if (((Boolean) zzbe.zzc().a(zn.N8)).booleanValue() && this.zzd.canGoBack()) {
            this.zzd.goBack();
            return false;
        }
        boolean zN0 = this.zzd.n0();
        if (!zN0) {
            this.zzd.G("onbackblocked", Collections.EMPTY_MAP);
        }
        return zN0;
    }

    public final void zzb() {
        this.zzn = 3;
        this.zzb.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.zzk != 5) {
            return;
        }
        this.zzb.overridePendingTransition(0, 0);
        xa0 xa0Var = this.zzd;
        if (xa0Var != null) {
            xa0Var.d0(null);
        }
    }

    public final void zzc() {
        xa0 xa0Var;
        zzr zzrVar;
        if (this.zzu) {
            return;
        }
        this.zzu = true;
        xa0 xa0Var2 = this.zzd;
        if (xa0Var2 != null) {
            this.zzl.removeView(xa0Var2.zzF());
            zzi zziVar = this.zze;
            if (zziVar != null) {
                this.zzd.r(zziVar.zzd);
                this.zzd.Y(false);
                if (((Boolean) zzbe.zzc().a(zn.zc)).booleanValue() && this.zzd.getParent() != null) {
                    ((ViewGroup) this.zzd.getParent()).removeView(this.zzd.zzF());
                }
                ViewGroup viewGroup = this.zze.zzc;
                View viewZzF = this.zzd.zzF();
                zzi zziVar2 = this.zze;
                viewGroup.addView(viewZzF, zziVar2.zza, zziVar2.zzb);
                this.zze = null;
            } else if (this.zzb.getApplicationContext() != null) {
                this.zzd.r(this.zzb.getApplicationContext());
            }
            this.zzd = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
            zzrVar.zzds(this.zzn);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
        if (adOverlayInfoParcel2 == null || (xa0Var = adOverlayInfoParcel2.zzd) == null) {
            return;
        }
        zzL(xa0Var.e0(), this.zzc.zzd.zzF());
    }

    public final void zzd() {
        this.zzl.f2329t = true;
    }

    public final void zze() {
        this.zzd.zzaa();
    }

    public final void zzf(pz0 pz0Var) throws b {
        n10 n10Var;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || (n10Var = adOverlayInfoParcel.zzv) == null) {
            throw new b("noioou");
        }
        n10Var.t(new k3.b(pz0Var));
    }

    public final void zzg() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && this.zzg) {
            zzA(adOverlayInfoParcel.zzj);
        }
        if (this.zzh != null) {
            this.zzb.setContentView(this.zzl);
            this.zzs = true;
            this.zzh.removeAllViews();
            this.zzh = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.zzi;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.zzi = null;
        }
        this.zzg = false;
    }

    @Override // com.google.android.gms.internal.ads.u10
    public final void zzh(int i6, int i7, Intent intent) {
        cu0 cu0Var;
        AdOverlayInfoParcel adOverlayInfoParcel;
        if (i6 == 236) {
            nn nnVar = zn.Vc;
            if (((Boolean) zzbe.zzc().a(nnVar)).booleanValue()) {
                com.google.android.gms.ads.internal.util.zze.zza("Callback from intent launch with requestCode: 236 and resultCode: " + i7);
                xa0 xa0Var = this.zzd;
                if (xa0Var == null || xa0Var.zzN() == null || (cu0Var = xa0Var.zzN().R) == null || (adOverlayInfoParcel = this.zzc) == null || !((Boolean) zzbe.zzc().a(nnVar)).booleanValue()) {
                    return;
                }
                bu0 bu0VarA = cu0Var.a();
                bu0VarA.a("action", "hilca");
                String str = adOverlayInfoParcel.zzq;
                if (str == null) {
                    str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                }
                bu0VarA.a("gqi", str);
                StringBuilder sb = new StringBuilder();
                sb.append(i7);
                bu0VarA.a("hilr", sb.toString());
                if (i7 == -1 && intent != null) {
                    String stringExtra = intent.getStringExtra("callerPackage");
                    String stringExtra2 = intent.getStringExtra("loadingStage");
                    if (stringExtra != null) {
                        bu0VarA.a("hilcp", stringExtra);
                    }
                    if (stringExtra2 != null) {
                        bu0VarA.a("hills", stringExtra2);
                    }
                }
                bu0VarA.f3292b.f3662b.execute(new cf(7, bu0VarA));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.u10
    public final void zzi() {
        this.zzn = 1;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzag
    public final void zzj() {
        this.zzn = 2;
        this.zzb.finish();
    }

    @Override // com.google.android.gms.internal.ads.u10
    public final void zzk(k3.a aVar) {
        zzK((Configuration) k3.b.i1(aVar));
    }

    @Override // com.google.android.gms.internal.ads.u10
    public void zzl(Bundle bundle) throws JSONException, b {
        if (!this.zzs) {
            this.zzb.requestWindowFeature(1);
        }
        this.zzj = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        try {
            AdOverlayInfoParcel adOverlayInfoParcelZza = AdOverlayInfoParcel.zza(this.zzb.getIntent());
            this.zzc = adOverlayInfoParcelZza;
            if (adOverlayInfoParcelZza == null) {
                throw new b("Could not get info for ad overlay.");
            }
            if (adOverlayInfoParcelZza.zzw) {
                if (Build.VERSION.SDK_INT >= 28) {
                    this.zzb.setShowWhenLocked(true);
                } else {
                    this.zzb.getWindow().addFlags(524288);
                }
            }
            if (this.zzc.zzm.clientJarVersion > 7500000) {
                this.zzn = 4;
            }
            if (this.zzb.getIntent() != null) {
                this.zzv = this.zzb.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
            com.google.android.gms.ads.internal.zzl zzlVar = adOverlayInfoParcel.zzo;
            if (zzlVar != null) {
                boolean z6 = zzlVar.zza;
                this.zzk = z6;
                if (z6) {
                    if (adOverlayInfoParcel.zzk != 5 && zzlVar.zzf != -1) {
                        new d(this).zzb();
                    }
                }
            } else if (adOverlayInfoParcel.zzk == 5) {
                this.zzk = true;
                if (adOverlayInfoParcel.zzk != 5) {
                    new d(this).zzb();
                }
            } else {
                this.zzk = false;
            }
            if (bundle == null) {
                if (this.zzv) {
                    vk0 vk0Var = this.zzc.zzt;
                    if (vk0Var != null) {
                        synchronized (vk0Var) {
                            ScheduledFuture scheduledFuture = vk0Var.f9890u;
                            if (scheduledFuture != null) {
                                scheduledFuture.cancel(true);
                            }
                        }
                    }
                    zzr zzrVar = this.zzc.zzc;
                    if (zzrVar != null) {
                        zzrVar.zzdp();
                    }
                }
                AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
                if (adOverlayInfoParcel2.zzk != 1) {
                    com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel2.zzb;
                    if (zzaVar != null) {
                        zzaVar.onAdClicked();
                    }
                    on0 on0Var = this.zzc.zzu;
                    if (on0Var != null) {
                        on0Var.O();
                    }
                }
            }
            Activity activity = this.zzb;
            AdOverlayInfoParcel adOverlayInfoParcel3 = this.zzc;
            c cVar = new c(activity, adOverlayInfoParcel3.zzn, adOverlayInfoParcel3.zzm.afmaVersion, adOverlayInfoParcel3.zzs);
            this.zzl = cVar;
            cVar.setId(CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL);
            com.google.android.gms.ads.internal.zzv.zzr().zzk(this.zzb);
            AdOverlayInfoParcel adOverlayInfoParcel4 = this.zzc;
            int i6 = adOverlayInfoParcel4.zzk;
            if (i6 == 1) {
                zzD(false);
                return;
            }
            if (i6 == 2) {
                this.zze = new zzi(adOverlayInfoParcel4.zzd);
                zzD(false);
            } else if (i6 == 3) {
                zzD(true);
            } else {
                if (i6 != 5) {
                    throw new b("Could not determine ad overlay type.");
                }
                zzD(false);
            }
        } catch (b e6) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj(e6.getMessage());
            this.zzn = 4;
            this.zzb.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.u10
    public final void zzm() {
        xa0 xa0Var = this.zzd;
        if (xa0Var != null) {
            try {
                this.zzl.removeView(xa0Var.zzF());
            } catch (NullPointerException unused) {
            }
        }
        zzF();
    }

    public final void zzn() {
        if (this.zzm) {
            this.zzm = false;
            zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.u10
    public final void zzo() {
        zzr zzrVar;
        zzg();
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
            zzrVar.zzdi();
        }
        if (!((Boolean) zzbe.zzc().a(zn.S4)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzF();
    }

    @Override // com.google.android.gms.internal.ads.u10
    public final void zzp(int i6, String[] strArr, int[] iArr) {
        if (i6 == 12345) {
            Activity activity = this.zzb;
            if (activity == null) {
                throw new NullPointerException("Null activity");
            }
            String str = null;
            try {
                this.zzc.zzv.X0(strArr, iArr, new k3.b(new zy0(activity, this.zzc.zzk == 5 ? this : null, str, str)));
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.u10
    public final void zzr() {
        zzr zzrVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
            zzrVar.zzdE();
        }
        zzK(this.zzb.getResources().getConfiguration());
        if (((Boolean) zzbe.zzc().a(zn.S4)).booleanValue()) {
            return;
        }
        xa0 xa0Var = this.zzd;
        if (xa0Var == null || xa0Var.o()) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("The webview does not exist. Ignoring action.");
        } else {
            this.zzd.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.u10
    public final void zzs(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.u10
    public final void zzt() {
        if (((Boolean) zzbe.zzc().a(zn.S4)).booleanValue()) {
            xa0 xa0Var = this.zzd;
            if (xa0Var == null || xa0Var.o()) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("The webview does not exist. Ignoring action.");
            } else {
                this.zzd.onResume();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.u10
    public final void zzu() {
        if (((Boolean) zzbe.zzc().a(zn.S4)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzF();
    }

    @Override // com.google.android.gms.internal.ads.u10
    public final void zzv() {
        zzr zzrVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || (zzrVar = adOverlayInfoParcel.zzc) == null) {
            return;
        }
        zzrVar.zzdr();
    }

    public final void zzw(boolean z6) throws JSONException {
        if (this.zzc.zzw) {
            return;
        }
        int iIntValue = ((Integer) zzbe.zzc().a(zn.V4)).intValue();
        boolean z7 = ((Boolean) zzbe.zzc().a(zn.f11416j1)).booleanValue() || z6;
        zzt zztVar = new zzt();
        zztVar.zzd = 50;
        zztVar.zza = true != z7 ? 0 : iIntValue;
        zztVar.zzb = true != z7 ? iIntValue : 0;
        zztVar.zzc = iIntValue;
        this.zzf = new zzu(this.zzb, zztVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z7 ? 9 : 11);
        zzy(z6, this.zzc.zzg);
        this.zzl.addView(this.zzf, layoutParams);
        zzJ(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.u10
    public final void zzx() {
        this.zzs = true;
    }

    public final void zzy(boolean z6, boolean z7) throws JSONException {
        AdOverlayInfoParcel adOverlayInfoParcel;
        com.google.android.gms.ads.internal.zzl zzlVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        com.google.android.gms.ads.internal.zzl zzlVar2;
        boolean z8 = true;
        boolean z9 = ((Boolean) zzbe.zzc().a(zn.f11402h1)).booleanValue() && (adOverlayInfoParcel2 = this.zzc) != null && (zzlVar2 = adOverlayInfoParcel2.zzo) != null && zzlVar2.zzh;
        boolean z10 = ((Boolean) zzbe.zzc().a(zn.f11409i1)).booleanValue() && (adOverlayInfoParcel = this.zzc) != null && (zzlVar = adOverlayInfoParcel.zzo) != null && zzlVar.zzi;
        if (z6 && z7 && z9 && !z10) {
            xa0 xa0Var = this.zzd;
            try {
                JSONObject jSONObjectPut = new JSONObject().put("message", "Custom close has been disabled for interstitial ads in this ad slot.").put("action", "useCustomClose");
                if (xa0Var != null) {
                    xa0Var.j("onError", jSONObjectPut);
                }
            } catch (JSONException e6) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Error occurred while dispatching error event.", e6);
            }
        }
        zzu zzuVar = this.zzf;
        if (zzuVar != null) {
            if (!z10 && (!z7 || z9)) {
                z8 = false;
            }
            zzuVar.zzb(z8);
        }
    }

    public final void zzz() throws JSONException {
        this.zzl.removeView(this.zzf);
        zzw(true);
    }

    @Override // com.google.android.gms.internal.ads.u10
    public final void zzq() {
    }
}
