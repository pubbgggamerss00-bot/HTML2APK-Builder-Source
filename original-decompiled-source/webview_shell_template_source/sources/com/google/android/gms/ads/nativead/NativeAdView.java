package com.google.android.gms.ads.nativead;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzfd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.dn;
import com.google.android.gms.internal.ads.dr;
import com.google.android.gms.internal.ads.zn;
import k3.a;
import k3.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class NativeAdView extends FrameLayout {
    private final FrameLayout zza;
    private final dr zzb;

    public NativeAdView(Context context) {
        super(context);
        this.zza = zzd(context);
        this.zzb = zze();
    }

    private final FrameLayout zzd(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    private final dr zze() {
        if (isInEditMode()) {
            return null;
        }
        FrameLayout frameLayout = this.zza;
        return zzbc.zza().zzj(frameLayout.getContext(), this, frameLayout);
    }

    private final void zzf(String str, View view) {
        dr drVar = this.zzb;
        if (drVar == null) {
            return;
        }
        try {
            drVar.zzdt(str, new b(view));
        } catch (RemoteException e6) {
            zzo.zzh("Unable to call setAssetView on delegate", e6);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i6, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i6, layoutParams);
        super.bringChildToFront(this.zza);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.zza;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    public void destroy() {
        dr drVar = this.zzb;
        if (drVar == null) {
            return;
        }
        try {
            drVar.zzc();
        } catch (RemoteException e6) {
            zzo.zzh("Unable to destroy native ad view", e6);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.zzb != null) {
            if (((Boolean) zzbe.zzc().a(zn.sb)).booleanValue()) {
                try {
                    this.zzb.zzd(new b(motionEvent));
                } catch (RemoteException e6) {
                    zzo.zzh("Unable to call handleTouchEvent on delegate", e6);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public AdChoicesView getAdChoicesView() {
        View viewZza = zza("3011");
        if (viewZza instanceof AdChoicesView) {
            return (AdChoicesView) viewZza;
        }
        return null;
    }

    public final View getAdvertiserView() {
        return zza("3005");
    }

    public final View getBodyView() {
        return zza("3004");
    }

    public final View getCallToActionView() {
        return zza("3002");
    }

    public final View getHeadlineView() {
        return zza("3001");
    }

    public final View getIconView() {
        return zza("3003");
    }

    public final View getImageView() {
        return zza("3008");
    }

    public final MediaView getMediaView() {
        View viewZza = zza("3010");
        if (viewZza instanceof MediaView) {
            return (MediaView) viewZza;
        }
        if (viewZza == null) {
            return null;
        }
        zzo.zze("View is not an instance of MediaView");
        return null;
    }

    public final View getPriceView() {
        return zza("3007");
    }

    public final View getStarRatingView() {
        return zza("3009");
    }

    public final View getStoreView() {
        return zza("3006");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i6) {
        super.onVisibilityChanged(view, i6);
        dr drVar = this.zzb;
        if (drVar == null) {
            return;
        }
        try {
            drVar.zze(new b(view), i6);
        } catch (RemoteException e6) {
            zzo.zzh("Unable to call onVisibilityChanged on delegate", e6);
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        addView(this.zza);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.zza == view) {
            return;
        }
        super.removeView(view);
    }

    public void setAdChoicesView(AdChoicesView adChoicesView) {
        zzf("3011", adChoicesView);
    }

    public final void setAdvertiserView(View view) {
        zzf("3005", view);
    }

    public final void setBodyView(View view) {
        zzf("3004", view);
    }

    public final void setCallToActionView(View view) {
        zzf("3002", view);
    }

    public final void setClickConfirmingView(View view) {
        dr drVar = this.zzb;
        if (drVar == null) {
            return;
        }
        try {
            drVar.zzdu(new b(view));
        } catch (RemoteException e6) {
            zzo.zzh("Unable to call setClickConfirmingView on delegate", e6);
        }
    }

    public final void setHeadlineView(View view) {
        zzf("3001", view);
    }

    public final void setIconView(View view) {
        zzf("3003", view);
    }

    public final void setImageView(View view) {
        zzf("3008", view);
    }

    public final void setMediaView(MediaView mediaView) {
        zzf("3010", mediaView);
        if (mediaView == null) {
            return;
        }
        mediaView.zza(new zzb(this));
        mediaView.zzb(new zzc(this));
    }

    public void setNativeAd(NativeAd nativeAd) {
        dr drVar = this.zzb;
        if (drVar == null) {
            return;
        }
        try {
            drVar.zzdx((a) nativeAd.zza());
        } catch (RemoteException e6) {
            zzo.zzh("Unable to call setNativeAd on delegate", e6);
        }
    }

    public final void setPriceView(View view) {
        zzf("3007", view);
    }

    public final void setStarRatingView(View view) {
        zzf("3009", view);
    }

    public final void setStoreView(View view) {
        zzf("3006", view);
    }

    public final View zza(String str) {
        dr drVar = this.zzb;
        if (drVar != null) {
            try {
                a aVarZzb = drVar.zzb(str);
                if (aVarZzb != null) {
                    return (View) b.i1(aVarZzb);
                }
            } catch (RemoteException e6) {
                zzo.zzh("Unable to call getAssetView on delegate", e6);
            }
        }
        return null;
    }

    public final /* synthetic */ void zzb(MediaContent mediaContent) {
        dr drVar = this.zzb;
        if (drVar == null) {
            return;
        }
        try {
            if (mediaContent instanceof zzfd) {
                drVar.zzdv(((zzfd) mediaContent).zzc());
            } else if (mediaContent == null) {
                drVar.zzdv(null);
            } else {
                zzo.zze("Use MediaContent provided by NativeAd.getMediaContent");
            }
        } catch (RemoteException e6) {
            zzo.zzh("Unable to call setMediaContent on delegate", e6);
        }
    }

    public final void zzc(ImageView.ScaleType scaleType) {
        dr drVar = this.zzb;
        if (drVar == null || scaleType == null) {
            return;
        }
        try {
            drVar.zzdw(new b(scaleType));
        } catch (RemoteException e6) {
            zzo.zzh("Unable to call setMediaViewImageScaleType on delegate", e6);
        }
    }

    public NativeAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.zza = zzd(context);
        this.zzb = zze();
    }

    public NativeAdView(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        this.zza = zzd(context);
        this.zzb = zze();
    }

    @TargetApi(dn.zzm)
    public NativeAdView(Context context, AttributeSet attributeSet, int i6, int i7) {
        super(context, attributeSet, i6, i7);
        this.zza = zzd(context);
        this.zzb = zze();
    }
}
