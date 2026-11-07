package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.internal.l;
import com.google.android.gms.internal.ads.pp;
import com.google.android.gms.internal.ads.t20;
import com.google.android.gms.internal.ads.zn;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class BaseAdView extends ViewGroup {
    protected final zzel zza;

    public BaseAdView(Context context, int i6) {
        super(context);
        this.zza = new zzel(this, i6);
    }

    public void destroy() {
        zn.a(getContext());
        if (((Boolean) pp.f8119e.c()).booleanValue()) {
            if (((Boolean) zzbe.zzc().a(zn.Xa)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zze
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = this.zza;
                        try {
                            baseAdView.zza.zzk();
                        } catch (IllegalStateException e6) {
                            t20.a(baseAdView.getContext()).b("BaseAdView.destroy", e6);
                        }
                    }
                });
                return;
            }
        }
        this.zza.zzk();
    }

    public AdListener getAdListener() {
        return this.zza.zza();
    }

    public AdSize getAdSize() {
        return this.zza.zzb();
    }

    public String getAdUnitId() {
        return this.zza.zzj();
    }

    public OnPaidEventListener getOnPaidEventListener() {
        return this.zza.zzc();
    }

    public ResponseInfo getResponseInfo() {
        return this.zza.zzd();
    }

    public boolean isCollapsible() {
        return this.zza.zzA();
    }

    public boolean isLoading() {
        return this.zza.zzB();
    }

    public void loadAd(final AdRequest adRequest) {
        l.d("#008 Must be called on the main UI thread.");
        zn.a(getContext());
        if (((Boolean) pp.f8120f.c()).booleanValue()) {
            if (((Boolean) zzbe.zzc().a(zn.ab)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zzg
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = this.zza;
                        try {
                            baseAdView.zza.zzm(adRequest.zza);
                        } catch (IllegalStateException e6) {
                            t20.a(baseAdView.getContext()).b("BaseAdView.loadAd", e6);
                        }
                    }
                });
                return;
            }
        }
        this.zza.zzm(adRequest.zza);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i6, int i7, int i8, int i9) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i10 = ((i8 - i6) - measuredWidth) / 2;
        int i11 = ((i9 - i7) - measuredHeight) / 2;
        childAt.layout(i10, i11, measuredWidth + i10, measuredHeight + i11);
    }

    @Override // android.view.View
    public void onMeasure(int i6, int i7) {
        AdSize adSize;
        int heightInPixels;
        int measuredWidth = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                adSize = getAdSize();
            } catch (NullPointerException e6) {
                zzo.zzh("Unable to retrieve ad size.", e6);
                adSize = null;
            }
            if (adSize != null) {
                Context context = getContext();
                int widthInPixels = adSize.getWidthInPixels(context);
                heightInPixels = adSize.getHeightInPixels(context);
                measuredWidth = widthInPixels;
            } else {
                heightInPixels = 0;
            }
        } else {
            measureChild(childAt, i6, i7);
            measuredWidth = childAt.getMeasuredWidth();
            heightInPixels = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(measuredWidth, getSuggestedMinimumWidth()), i6), View.resolveSize(Math.max(heightInPixels, getSuggestedMinimumHeight()), i7));
    }

    public void pause() {
        zn.a(getContext());
        if (((Boolean) pp.f8121g.c()).booleanValue()) {
            if (((Boolean) zzbe.zzc().a(zn.Ya)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zzf
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = this.zza;
                        try {
                            baseAdView.zza.zzn();
                        } catch (IllegalStateException e6) {
                            t20.a(baseAdView.getContext()).b("BaseAdView.pause", e6);
                        }
                    }
                });
                return;
            }
        }
        this.zza.zzn();
    }

    public void resume() {
        zn.a(getContext());
        if (((Boolean) pp.h.c()).booleanValue()) {
            if (((Boolean) zzbe.zzc().a(zn.Wa)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zzd
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = this.zza;
                        try {
                            baseAdView.zza.zzp();
                        } catch (IllegalStateException e6) {
                            t20.a(baseAdView.getContext()).b("BaseAdView.resume", e6);
                        }
                    }
                });
                return;
            }
        }
        this.zza.zzp();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setAdListener(AdListener adListener) {
        this.zza.zzr(adListener);
        if (adListener == 0) {
            this.zza.zzq(null);
            return;
        }
        if (adListener instanceof com.google.android.gms.ads.internal.client.zza) {
            this.zza.zzq((com.google.android.gms.ads.internal.client.zza) adListener);
        }
        if (adListener instanceof AppEventListener) {
            this.zza.zzv((AppEventListener) adListener);
        }
    }

    public void setAdSize(AdSize adSize) {
        this.zza.zzs(adSize);
    }

    public void setAdUnitId(String str) {
        this.zza.zzu(str);
    }

    public void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        this.zza.zzx(onPaidEventListener);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet);
        this.zza = new zzel(this, attributeSet, false, i6);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, int i6, int i7) {
        super(context, attributeSet, i6);
        this.zza = new zzel(this, attributeSet, false, i7);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, int i6, int i7, boolean z6) {
        super(context, attributeSet, i6);
        this.zza = new zzel(this, attributeSet, z6, i7);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, boolean z6) {
        super(context, attributeSet);
        this.zza = new zzel(this, attributeSet, z6);
    }
}
