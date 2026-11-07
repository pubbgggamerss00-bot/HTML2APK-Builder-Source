package com.google.android.gms.ads.nativead;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.dn;
import com.google.android.gms.internal.ads.tr;
import k3.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class MediaView extends FrameLayout {
    private MediaContent zza;
    private boolean zzb;
    private ImageView.ScaleType zzc;
    private boolean zzd;
    private zzb zze;
    private zzc zzf;

    public MediaView(Context context) {
        super(context);
    }

    public MediaContent getMediaContent() {
        return this.zza;
    }

    public void setImageScaleType(ImageView.ScaleType scaleType) {
        this.zzd = true;
        this.zzc = scaleType;
        zzc zzcVar = this.zzf;
        if (zzcVar != null) {
            zzcVar.zza.zzc(scaleType);
        }
    }

    public void setMediaContent(MediaContent mediaContent) {
        boolean zK;
        this.zzb = true;
        this.zza = mediaContent;
        zzb zzbVar = this.zze;
        if (zzbVar != null) {
            zzbVar.zza.zzb(mediaContent);
        }
        if (mediaContent == null) {
            return;
        }
        try {
            tr trVarZza = mediaContent.zza();
            if (trVarZza != null) {
                if (!mediaContent.hasVideoContent()) {
                    if (mediaContent.zzb()) {
                        zK = trVarZza.k(new b(this));
                    }
                    removeAllViews();
                }
                zK = trVarZza.l(new b(this));
                if (zK) {
                    return;
                }
                removeAllViews();
            }
        } catch (RemoteException e6) {
            removeAllViews();
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
        }
    }

    public final synchronized void zza(zzb zzbVar) {
        this.zze = zzbVar;
        if (this.zzb) {
            zzbVar.zza.zzb(this.zza);
        }
    }

    public final synchronized void zzb(zzc zzcVar) {
        this.zzf = zzcVar;
        if (this.zzd) {
            zzcVar.zza.zzc(this.zzc);
        }
    }

    public MediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaView(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
    }

    @TargetApi(dn.zzm)
    public MediaView(Context context, AttributeSet attributeSet, int i6, int i7) {
        super(context, attributeSet, i6, i7);
    }
}
