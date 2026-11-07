package com.google.android.gms.ads.internal.overlay;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.internal.ads.zn;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzu extends FrameLayout implements View.OnClickListener {
    private final ImageButton zza;
    private final zzag zzb;

    public zzu(Context context, zzt zztVar, zzag zzagVar) throws Resources.NotFoundException {
        super(context);
        this.zzb = zzagVar;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.zza = imageButton;
        zzc();
        imageButton.setBackgroundColor(0);
        imageButton.setOnClickListener(this);
        zzbc.zzb();
        int iZzx = zzf.zzx(context, zztVar.zza);
        zzbc.zzb();
        int iZzx2 = zzf.zzx(context, 0);
        zzbc.zzb();
        int iZzx3 = zzf.zzx(context, zztVar.zzb);
        zzbc.zzb();
        imageButton.setPadding(iZzx, iZzx2, iZzx3, zzf.zzx(context, zztVar.zzc));
        imageButton.setContentDescription("Interstitial close button");
        zzbc.zzb();
        int iZzx4 = zzf.zzx(context, zztVar.zzd + zztVar.zza + zztVar.zzb);
        zzbc.zzb();
        addView(imageButton, new FrameLayout.LayoutParams(iZzx4, zzf.zzx(context, zztVar.zzd + zztVar.zzc), 17));
        long jLongValue = ((Long) zzbe.zzc().a(zn.f11430l1)).longValue();
        if (jLongValue <= 0) {
            return;
        }
        h hVar = ((Boolean) zzbe.zzc().a(zn.f11436m1)).booleanValue() ? new h(0, this) : null;
        imageButton.setAlpha(0.0f);
        imageButton.animate().alpha(1.0f).setDuration(jLongValue).setListener(hVar);
    }

    private final void zzc() throws Resources.NotFoundException {
        String str = (String) zzbe.zzc().a(zn.f11423k1);
        if (TextUtils.isEmpty(str) || "default".equals(str)) {
            this.zza.setImageResource(R.drawable.btn_dialog);
            return;
        }
        Resources resourcesB = com.google.android.gms.ads.internal.zzv.zzp().b();
        if (resourcesB == null) {
            this.zza.setImageResource(R.drawable.btn_dialog);
            return;
        }
        Drawable drawable = null;
        try {
            if ("white".equals(str)) {
                drawable = resourcesB.getDrawable(com.google.android.gms.ads.impl.R.drawable.admob_close_button_white_circle_black_cross);
            } else if ("black".equals(str)) {
                drawable = resourcesB.getDrawable(com.google.android.gms.ads.impl.R.drawable.admob_close_button_black_circle_white_cross);
            }
        } catch (Resources.NotFoundException unused) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("Close button resource not found, falling back to default.");
        }
        if (drawable == null) {
            this.zza.setImageResource(R.drawable.btn_dialog);
        } else {
            this.zza.setImageDrawable(drawable);
            this.zza.setScaleType(ImageView.ScaleType.CENTER);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zzag zzagVar = this.zzb;
        if (zzagVar != null) {
            zzagVar.zzj();
        }
    }

    public final void zzb(boolean z6) {
        if (!z6) {
            this.zza.setVisibility(0);
            return;
        }
        this.zza.setVisibility(8);
        if (((Long) zzbe.zzc().a(zn.f11430l1)).longValue() > 0) {
            this.zza.animate().cancel();
            this.zza.clearAnimation();
        }
    }
}
