package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.internal.ads.dy;
import com.google.android.gms.internal.ads.gi;
import com.google.android.gms.internal.ads.pp;
import com.google.android.gms.internal.ads.zn;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzel {
    final zzbd zza;
    private final dy zzb;
    private final zzr zzc;
    private final AtomicBoolean zzd;
    private final VideoController zze;
    private zza zzf;
    private AdListener zzg;
    private AdSize[] zzh;
    private AppEventListener zzi;
    private zzby zzj;
    private VideoOptions zzk;
    private String zzl;
    private final ViewGroup zzm;
    private int zzn;
    private boolean zzo;
    private OnPaidEventListener zzp;

    public zzel(ViewGroup viewGroup) {
        this(viewGroup, null, false, zzr.zza, null, 0);
    }

    private static zzs zzD(Context context, AdSize[] adSizeArr, int i6) {
        for (AdSize adSize : adSizeArr) {
            if (adSize.equals(AdSize.INVALID)) {
                return new zzs("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
            }
        }
        zzs zzsVar = new zzs(context, adSizeArr);
        zzsVar.zzj = zzE(i6);
        return zzsVar;
    }

    private static boolean zzE(int i6) {
        return i6 == 1;
    }

    public final boolean zzA() {
        try {
            zzby zzbyVar = this.zzj;
            if (zzbyVar != null) {
                return zzbyVar.zzY();
            }
            return false;
        } catch (RemoteException e6) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e6);
            return false;
        }
    }

    public final boolean zzB() {
        try {
            zzby zzbyVar = this.zzj;
            if (zzbyVar != null) {
                return zzbyVar.zzZ();
            }
            return false;
        } catch (RemoteException e6) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e6);
            return false;
        }
    }

    public final AdSize[] zzC() {
        return this.zzh;
    }

    public final AdListener zza() {
        return this.zzg;
    }

    public final AdSize zzb() {
        zzs zzsVarZzg;
        try {
            zzby zzbyVar = this.zzj;
            if (zzbyVar != null && (zzsVarZzg = zzbyVar.zzg()) != null) {
                return com.google.android.gms.ads.zzc.zzc(zzsVarZzg.zze, zzsVarZzg.zzb, zzsVarZzg.zza);
            }
        } catch (RemoteException e6) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e6);
        }
        AdSize[] adSizeArr = this.zzh;
        if (adSizeArr != null) {
            return adSizeArr[0];
        }
        return null;
    }

    public final OnPaidEventListener zzc() {
        return this.zzp;
    }

    public final ResponseInfo zzd() {
        zzdy zzdyVarZzk = null;
        try {
            zzby zzbyVar = this.zzj;
            if (zzbyVar != null) {
                zzdyVarZzk = zzbyVar.zzk();
            }
        } catch (RemoteException e6) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e6);
        }
        return ResponseInfo.zza(zzdyVarZzk);
    }

    public final VideoController zzf() {
        return this.zze;
    }

    public final VideoOptions zzg() {
        return this.zzk;
    }

    public final AppEventListener zzh() {
        return this.zzi;
    }

    public final zzeb zzi() {
        zzby zzbyVar = this.zzj;
        if (zzbyVar != null) {
            try {
                return zzbyVar.zzl();
            } catch (RemoteException e6) {
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e6);
            }
        }
        return null;
    }

    public final String zzj() {
        zzby zzbyVar;
        if (this.zzl == null && (zzbyVar = this.zzj) != null) {
            try {
                this.zzl = zzbyVar.zzr();
            } catch (RemoteException e6) {
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e6);
            }
        }
        return this.zzl;
    }

    public final void zzk() {
        try {
            zzby zzbyVar = this.zzj;
            if (zzbyVar != null) {
                zzbyVar.zzx();
            }
        } catch (RemoteException e6) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    public final /* synthetic */ void zzl(k3.a aVar) {
        this.zzm.addView((View) k3.b.i1(aVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00d7 A[Catch: RemoteException -> 0x00d5, TRY_LEAVE, TryCatch #1 {RemoteException -> 0x00d5, blocks: (B:27:0x00a4, B:29:0x00aa, B:31:0x00b8, B:33:0x00ca, B:36:0x00d7), top: B:53:0x00a4, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzm(zzei zzeiVar) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.zzj == null) {
                if (this.zzh == null || this.zzl == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Context context = this.zzm.getContext();
                zzs zzsVarZzD = zzD(context, this.zzh, this.zzn);
                zzby zzbyVar = "search_v2".equals(zzsVarZzD.zza) ? (zzby) new i(zzbc.zza(), context, zzsVarZzD, this.zzl).d(context, false) : (zzby) new g(zzbc.zza(), context, zzsVarZzD, this.zzl, this.zzb).d(context, false);
                this.zzj = zzbyVar;
                zzbyVar.zzD(new zzg(this.zza));
                zza zzaVar = this.zzf;
                if (zzaVar != null) {
                    this.zzj.zzC(new zzb(zzaVar));
                }
                AppEventListener appEventListener = this.zzi;
                if (appEventListener != null) {
                    this.zzj.zzG(new gi(appEventListener));
                }
                if (this.zzk != null) {
                    this.zzj.zzU(new zzga(this.zzk));
                }
                this.zzj.zzP(new zzfs(this.zzp));
                this.zzj.zzN(this.zzo);
                zzby zzbyVar2 = this.zzj;
                if (zzbyVar2 != null) {
                    try {
                        final k3.a aVarZzn = zzbyVar2.zzn();
                        if (aVarZzn != null) {
                            if (((Boolean) pp.f8120f.c()).booleanValue()) {
                                if (((Boolean) zzbe.zzc().a(zn.ab)).booleanValue()) {
                                    com.google.android.gms.ads.internal.util.client.zzf.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzej
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            this.zza.zzl(aVarZzn);
                                        }
                                    });
                                } else {
                                    this.zzm.addView((View) k3.b.i1(aVarZzn));
                                }
                            }
                        }
                    } catch (RemoteException e6) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e6);
                    }
                }
            }
            if (zzeiVar != null) {
                zzeiVar.zzq(jCurrentTimeMillis);
            }
            zzby zzbyVar3 = this.zzj;
            if (zzbyVar3 == null) {
                throw null;
            }
            zzbyVar3.zzab(this.zzc.zza(this.zzm.getContext(), zzeiVar));
        } catch (RemoteException e7) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e7);
        }
    }

    public final void zzn() {
        try {
            zzby zzbyVar = this.zzj;
            if (zzbyVar != null) {
                zzbyVar.zzz();
            }
        } catch (RemoteException e6) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    public final void zzo() {
        if (this.zzd.getAndSet(true)) {
            return;
        }
        try {
            zzby zzbyVar = this.zzj;
            if (zzbyVar != null) {
                zzbyVar.zzA();
            }
        } catch (RemoteException e6) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    public final void zzp() {
        try {
            zzby zzbyVar = this.zzj;
            if (zzbyVar != null) {
                zzbyVar.zzB();
            }
        } catch (RemoteException e6) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    public final void zzq(zza zzaVar) {
        try {
            this.zzf = zzaVar;
            zzby zzbyVar = this.zzj;
            if (zzbyVar != null) {
                zzbyVar.zzC(zzaVar != null ? new zzb(zzaVar) : null);
            }
        } catch (RemoteException e6) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    public final void zzr(AdListener adListener) {
        this.zzg = adListener;
        this.zza.zza(adListener);
    }

    public final void zzs(AdSize... adSizeArr) {
        if (this.zzh != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        zzt(adSizeArr);
    }

    public final void zzt(AdSize... adSizeArr) {
        this.zzh = adSizeArr;
        try {
            zzby zzbyVar = this.zzj;
            if (zzbyVar != null) {
                zzbyVar.zzF(zzD(this.zzm.getContext(), this.zzh, this.zzn));
            }
        } catch (RemoteException e6) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e6);
        }
        this.zzm.requestLayout();
    }

    public final void zzu(String str) {
        if (this.zzl != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        this.zzl = str;
    }

    public final void zzv(AppEventListener appEventListener) {
        try {
            this.zzi = appEventListener;
            zzby zzbyVar = this.zzj;
            if (zzbyVar != null) {
                zzbyVar.zzG(appEventListener != null ? new gi(appEventListener) : null);
            }
        } catch (RemoteException e6) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    public final void zzw(boolean z6) {
        this.zzo = z6;
        try {
            zzby zzbyVar = this.zzj;
            if (zzbyVar != null) {
                zzbyVar.zzN(z6);
            }
        } catch (RemoteException e6) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    public final void zzx(OnPaidEventListener onPaidEventListener) {
        try {
            this.zzp = onPaidEventListener;
            zzby zzbyVar = this.zzj;
            if (zzbyVar != null) {
                zzbyVar.zzP(new zzfs(onPaidEventListener));
            }
        } catch (RemoteException e6) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    public final void zzy(VideoOptions videoOptions) {
        this.zzk = videoOptions;
        try {
            zzby zzbyVar = this.zzj;
            if (zzbyVar != null) {
                zzbyVar.zzU(videoOptions == null ? null : new zzga(videoOptions));
            }
        } catch (RemoteException e6) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e6);
        }
    }

    public final boolean zzz(zzby zzbyVar) {
        try {
            k3.a aVarZzn = zzbyVar.zzn();
            if (aVarZzn == null || ((View) k3.b.i1(aVarZzn)).getParent() != null) {
                return false;
            }
            this.zzm.addView((View) k3.b.i1(aVarZzn));
            this.zzj = zzbyVar;
            return true;
        } catch (RemoteException e6) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e6);
            return false;
        }
    }

    public zzel(ViewGroup viewGroup, int i6) {
        this(viewGroup, null, false, zzr.zza, null, i6);
    }

    public zzel(ViewGroup viewGroup, AttributeSet attributeSet, boolean z6) {
        this(viewGroup, attributeSet, z6, zzr.zza, null, 0);
    }

    public zzel(ViewGroup viewGroup, AttributeSet attributeSet, boolean z6, int i6) {
        this(viewGroup, attributeSet, z6, zzr.zza, null, i6);
    }

    public zzel(ViewGroup viewGroup, AttributeSet attributeSet, boolean z6, zzr zzrVar, zzby zzbyVar, int i6) {
        zzs zzsVar;
        this.zzb = new dy();
        this.zze = new VideoController();
        this.zza = new q(this);
        this.zzm = viewGroup;
        this.zzc = zzrVar;
        this.zzj = null;
        this.zzd = new AtomicBoolean(false);
        this.zzn = i6;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                zzaa zzaaVar = new zzaa(context, attributeSet);
                this.zzh = zzaaVar.zzb(z6);
                this.zzl = zzaaVar.zza();
                if (viewGroup.isInEditMode()) {
                    com.google.android.gms.ads.internal.util.client.zzf zzfVarZzb = zzbc.zzb();
                    AdSize adSize = this.zzh[0];
                    int i7 = this.zzn;
                    if (adSize.equals(AdSize.INVALID)) {
                        zzsVar = new zzs("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
                    } else {
                        zzsVar = new zzs(context, adSize);
                        zzsVar.zzj = zzE(i7);
                    }
                    zzfVarZzb.zzm(viewGroup, zzsVar, "Ads by Google");
                }
            } catch (IllegalArgumentException e6) {
                zzbc.zzb().zzl(viewGroup, new zzs(context, AdSize.BANNER), e6.getMessage(), e6.getMessage());
            }
        }
    }
}
