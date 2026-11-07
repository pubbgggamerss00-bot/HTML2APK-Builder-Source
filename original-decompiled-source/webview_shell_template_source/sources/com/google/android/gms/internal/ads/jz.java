package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class jz extends sy {
    public final NativeAdMapper s;

    public jz(NativeAdMapper nativeAdMapper) {
        this.s = nativeAdMapper;
    }

    @Override // com.google.android.gms.internal.ads.ty
    public final void H1(k3.a aVar) {
        this.s.handleClick((View) k3.b.i1(aVar));
    }

    @Override // com.google.android.gms.internal.ads.ty
    public final void T0(k3.a aVar, k3.a aVar2, k3.a aVar3) {
        HashMap map = (HashMap) k3.b.i1(aVar2);
        HashMap map2 = (HashMap) k3.b.i1(aVar3);
        this.s.trackViews((View) k3.b.i1(aVar), map, map2);
    }

    @Override // com.google.android.gms.internal.ads.ty
    public final void b0(k3.a aVar) {
        this.s.untrackView((View) k3.b.i1(aVar));
    }

    @Override // com.google.android.gms.internal.ads.ty
    public final boolean zzA() {
        return this.s.getOverrideClickHandling();
    }

    @Override // com.google.android.gms.internal.ads.ty
    public final boolean zzB() {
        return this.s.getOverrideImpressionRecording();
    }

    @Override // com.google.android.gms.internal.ads.ty
    public final double zze() {
        NativeAdMapper nativeAdMapper = this.s;
        if (nativeAdMapper.getStarRating() != null) {
            return nativeAdMapper.getStarRating().doubleValue();
        }
        return -1.0d;
    }

    @Override // com.google.android.gms.internal.ads.ty
    public final float zzf() {
        return this.s.getMediaContentAspectRatio();
    }

    @Override // com.google.android.gms.internal.ads.ty
    public final float zzg() {
        return this.s.getCurrentTime();
    }

    @Override // com.google.android.gms.internal.ads.ty
    public final float zzh() {
        return this.s.getDuration();
    }

    @Override // com.google.android.gms.internal.ads.ty
    public final Bundle zzi() {
        return this.s.getExtras();
    }

    @Override // com.google.android.gms.internal.ads.ty
    public final zzeb zzj() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ty
    public final sq zzk() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ty
    public final yq zzl() {
        NativeAd.Image icon = this.s.getIcon();
        if (icon != null) {
            return new mq(icon.getDrawable(), icon.getUri(), icon.getScale(), icon.zzb(), icon.zza());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ty
    public final k3.a zzm() {
        View adChoicesContent = this.s.getAdChoicesContent();
        if (adChoicesContent == null) {
            return null;
        }
        return new k3.b(adChoicesContent);
    }

    @Override // com.google.android.gms.internal.ads.ty
    public final k3.a zzn() {
        View viewZza = this.s.zza();
        if (viewZza == null) {
            return null;
        }
        return new k3.b(viewZza);
    }

    @Override // com.google.android.gms.internal.ads.ty
    public final k3.a zzo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ty
    public final String zzp() {
        return this.s.getAdvertiser();
    }

    @Override // com.google.android.gms.internal.ads.ty
    public final String zzq() {
        return this.s.getBody();
    }

    @Override // com.google.android.gms.internal.ads.ty
    public final String zzr() {
        return this.s.getCallToAction();
    }

    @Override // com.google.android.gms.internal.ads.ty
    public final String zzs() {
        return this.s.getHeadline();
    }

    @Override // com.google.android.gms.internal.ads.ty
    public final String zzt() {
        return this.s.getPrice();
    }

    @Override // com.google.android.gms.internal.ads.ty
    public final String zzu() {
        return this.s.getStore();
    }

    @Override // com.google.android.gms.internal.ads.ty
    public final List zzv() {
        List<NativeAd.Image> images = this.s.getImages();
        ArrayList arrayList = new ArrayList();
        if (images != null) {
            for (NativeAd.Image image : images) {
                arrayList.add(new mq(image.getDrawable(), image.getUri(), image.getScale(), image.zzb(), image.zza()));
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.ty
    public final void zzx() {
        this.s.recordImpression();
    }
}
