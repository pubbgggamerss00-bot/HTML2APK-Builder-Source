package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.ads.internal.util.zzs;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d extends com.google.android.gms.ads.internal.util.zzb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzm f2330a;

    public /* synthetic */ d(zzm zzmVar) {
        this.f2330a = zzmVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        final BitmapDrawable bitmapDrawable;
        zzbu zzbuVarZzv = com.google.android.gms.ads.internal.zzv.zzv();
        zzm zzmVar = this.f2330a;
        Bitmap bitmapZza = zzbuVarZzv.zza(Integer.valueOf(zzmVar.zzc.zzo.zzf));
        if (bitmapZza != null) {
            com.google.android.gms.ads.internal.zzv.zzq();
            com.google.android.gms.ads.internal.zzl zzlVar = zzmVar.zzc.zzo;
            boolean z6 = zzlVar.zzd;
            float f6 = zzlVar.zze;
            Activity activity = zzmVar.zzb;
            if (!z6 || f6 <= 0.0f || f6 > 25.0f) {
                bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmapZza);
            } else {
                try {
                    Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapZza, bitmapZza.getWidth(), bitmapZza.getHeight(), false);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateScaledBitmap);
                    RenderScript renderScriptCreate = RenderScript.create(activity);
                    ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
                    Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateScaledBitmap);
                    Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
                    scriptIntrinsicBlurCreate.setRadius(f6);
                    scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
                    scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
                    allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
                    bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmapCreateBitmap);
                } catch (RuntimeException unused) {
                    bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmapZza);
                }
            }
            zzs.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzj
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.f2330a.zzb.getWindow().setBackgroundDrawable(bitmapDrawable);
                }
            });
        }
    }
}
