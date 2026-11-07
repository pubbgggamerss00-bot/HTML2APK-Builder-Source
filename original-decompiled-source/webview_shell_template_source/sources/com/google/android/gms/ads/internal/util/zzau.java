package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.h70;
import com.google.android.gms.internal.ads.hs1;
import com.google.android.gms.internal.ads.i70;
import com.google.android.gms.internal.ads.pv0;
import com.google.android.gms.internal.ads.sv0;
import com.google.android.gms.internal.ads.zn;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzau {
    private final Context zza;
    private final sv0 zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private int zzg;
    private int zzh;
    private PointF zzi;
    private PointF zzj;
    private Handler zzk;
    private Runnable zzl;

    public zzau(Context context) {
        this.zzg = 0;
        this.zzl = new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzaf
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzg();
            }
        };
        this.zza = context;
        this.zzh = ViewConfiguration.get(context).getScaledTouchSlop();
        com.google.android.gms.ads.internal.zzv.zzu().zzb();
        this.zzk = com.google.android.gms.ads.internal.zzv.zzu().zza();
        this.zzb = com.google.android.gms.ads.internal.zzv.zzt().zza();
    }

    private final void zzs(Context context) {
        ArrayList arrayList = new ArrayList();
        int iZzu = zzu(arrayList, "None", true);
        final int iZzu2 = zzu(arrayList, "Shake", true);
        final int iZzu3 = zzu(arrayList, "Flick", true);
        int iOrdinal = this.zzb.f9025r.ordinal();
        final int i6 = iOrdinal != 1 ? iOrdinal != 2 ? iZzu : iZzu3 : iZzu2;
        com.google.android.gms.ads.internal.zzv.zzq();
        AlertDialog.Builder builderZzL = zzs.zzL(context);
        final AtomicInteger atomicInteger = new AtomicInteger(i6);
        builderZzL.setTitle("Setup gesture");
        builderZzL.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i6, new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzan
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i7) {
                atomicInteger.set(i7);
            }
        });
        builderZzL.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzao
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i7) {
                this.zza.zzr();
            }
        });
        builderZzL.setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzap
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i7) {
                this.zza.zzh(atomicInteger, i6, iZzu2, iZzu3, dialogInterface, i7);
            }
        });
        builderZzL.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.ads.internal.util.zzaq
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.zza.zzr();
            }
        });
        builderZzL.create().show();
    }

    private final boolean zzt(float f6, float f7, float f8, float f9) {
        return Math.abs(this.zzi.x - f6) < ((float) this.zzh) && Math.abs(this.zzi.y - f7) < ((float) this.zzh) && Math.abs(this.zzj.x - f8) < ((float) this.zzh) && Math.abs(this.zzj.y - f9) < ((float) this.zzh);
    }

    private static final int zzu(List list, String str, boolean z6) {
        if (!z6) {
            return -1;
        }
        list.add(str);
        return list.size() - 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.zzc);
        sb.append(",DebugSignal: ");
        sb.append(this.zzf);
        sb.append(",AFMA Version: ");
        sb.append(this.zze);
        sb.append(",Ad Unit ID: ");
        return androidx.activity.m.e(sb, this.zzd, "}");
    }

    public final /* synthetic */ void zza() {
        zzs(this.zza);
    }

    public final /* synthetic */ void zzb(hs1 hs1Var) {
        if (com.google.android.gms.ads.internal.zzv.zzt().zzj(this.zza, this.zzd, this.zze)) {
            hs1Var.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzak
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzc();
                }
            });
        } else {
            com.google.android.gms.ads.internal.zzv.zzt().zzd(this.zza, this.zzd, this.zze);
        }
    }

    public final /* synthetic */ void zzc() {
        zzs(this.zza);
    }

    public final /* synthetic */ void zzd() {
        com.google.android.gms.ads.internal.zzv.zzt().zzc(this.zza);
    }

    public final /* synthetic */ void zze(hs1 hs1Var) {
        if (com.google.android.gms.ads.internal.zzv.zzt().zzj(this.zza, this.zzd, this.zze)) {
            hs1Var.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzaj
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzf();
                }
            });
        } else {
            com.google.android.gms.ads.internal.zzv.zzt().zzd(this.zza, this.zzd, this.zze);
        }
    }

    public final /* synthetic */ void zzf() {
        com.google.android.gms.ads.internal.zzv.zzt().zzc(this.zza);
    }

    public final /* synthetic */ void zzg() {
        this.zzg = 4;
        zzr();
    }

    public final void zzh(AtomicInteger atomicInteger, int i6, int i7, int i8, DialogInterface dialogInterface, int i9) {
        if (atomicInteger.get() != i6) {
            if (atomicInteger.get() == i7) {
                this.zzb.j(pv0.f8157t, true);
            } else if (atomicInteger.get() == i8) {
                this.zzb.j(pv0.f8158u, true);
            } else {
                this.zzb.j(pv0.s, true);
            }
        }
        zzr();
    }

    public final /* synthetic */ void zzi(String str, DialogInterface dialogInterface, int i6) {
        com.google.android.gms.ads.internal.zzv.zzq();
        zzs.zzT(this.zza, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str), "Share via"));
    }

    public final /* synthetic */ void zzj(int i6, int i7, int i8, int i9, int i10, DialogInterface dialogInterface, int i11) {
        if (i11 != i6) {
            if (i11 == i7) {
                zzo.zze("Debug mode [Creative Preview] selected.");
                i70.f5586a.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzag
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzl();
                    }
                });
                return;
            }
            if (i11 == i8) {
                zzo.zze("Debug mode [Troubleshooting] selected.");
                i70.f5586a.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzat
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzk();
                    }
                });
                return;
            }
            if (i11 == i9) {
                sv0 sv0Var = this.zzb;
                final h70 h70Var = i70.f5591f;
                h70 h70Var2 = i70.f5586a;
                if (sv0Var.f()) {
                    h70Var.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzar
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzd();
                        }
                    });
                    return;
                } else {
                    h70Var2.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzas
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zze(h70Var);
                        }
                    });
                    return;
                }
            }
            if (i11 == i10) {
                sv0 sv0Var2 = this.zzb;
                final h70 h70Var3 = i70.f5591f;
                h70 h70Var4 = i70.f5586a;
                if (sv0Var2.f()) {
                    h70Var3.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzae
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zza();
                        }
                    });
                    return;
                } else {
                    h70Var4.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzal
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzb(h70Var3);
                        }
                    });
                    return;
                }
            }
            return;
        }
        if (!(this.zza instanceof Activity)) {
            zzo.zzi("Can not create dialog without Activity Context");
            return;
        }
        String str = this.zzc;
        final String str2 = "No debug information";
        if (!TextUtils.isEmpty(str)) {
            Uri uriBuild = new Uri.Builder().encodedQuery(str.replaceAll("\\+", "%20")).build();
            StringBuilder sb = new StringBuilder();
            com.google.android.gms.ads.internal.zzv.zzq();
            Map mapZzP = zzs.zzP(uriBuild);
            for (String str3 : mapZzP.keySet()) {
                sb.append(str3);
                sb.append(" = ");
                sb.append((String) mapZzP.get(str3));
                sb.append("\n\n");
            }
            String strTrim = sb.toString().trim();
            if (!TextUtils.isEmpty(strTrim)) {
                str2 = strTrim;
            }
        }
        com.google.android.gms.ads.internal.zzv.zzq();
        AlertDialog.Builder builderZzL = zzs.zzL(this.zza);
        builderZzL.setMessage(str2);
        builderZzL.setTitle("Ad Information");
        builderZzL.setPositiveButton("Share", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzah
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface2, int i12) {
                this.zza.zzi(str2, dialogInterface2, i12);
            }
        });
        builderZzL.setNegativeButton("Close", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzai
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface2, int i12) {
            }
        });
        builderZzL.create().show();
    }

    public final /* synthetic */ void zzk() {
        zzay zzayVarZzt = com.google.android.gms.ads.internal.zzv.zzt();
        String str = this.zzd;
        String str2 = this.zze;
        String str3 = this.zzf;
        boolean zZzm = zzayVarZzt.zzm();
        Context context = this.zza;
        zzayVarZzt.zzh(zzayVarZzt.zzj(context, str, str2));
        if (!zzayVarZzt.zzm()) {
            zzayVarZzt.zzd(context, str, str2);
            return;
        }
        if (!zZzm && !TextUtils.isEmpty(str3)) {
            zzayVarZzt.zze(context, str2, str3, str);
        }
        zzo.zze("Device is linked for debug signals.");
        zzayVarZzt.zzi(context, "The device is successfully linked for troubleshooting.", false, true);
    }

    public final /* synthetic */ void zzl() {
        zzay zzayVarZzt = com.google.android.gms.ads.internal.zzv.zzt();
        Context context = this.zza;
        String str = this.zzd;
        String str2 = this.zze;
        if (!zzayVarZzt.zzk(context, str, str2)) {
            zzayVarZzt.zzi(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
            return;
        }
        if ("2".equals(zzayVarZzt.zza)) {
            zzo.zze("Creative is not pushed for this device.");
            zzayVarZzt.zzi(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if ("1".equals(zzayVarZzt.zza)) {
            zzo.zze("The app is not linked for creative preview.");
            zzayVarZzt.zzd(context, str, str2);
        } else if ("0".equals(zzayVarZzt.zza)) {
            zzo.zze("Device is linked for in app preview.");
            zzayVarZzt.zzi(context, "The device is successfully linked for creative preview.", false, true);
        }
    }

    public final void zzm(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.zzg = 0;
            this.zzi = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i6 = this.zzg;
        if (i6 == -1) {
            return;
        }
        if (i6 == 0) {
            if (actionMasked == 5) {
                this.zzg = 5;
                this.zzj = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                this.zzk.postDelayed(this.zzl, ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.J4)).longValue());
                return;
            }
            return;
        }
        if (i6 == 5) {
            if (pointerCount == 2) {
                if (actionMasked != 2) {
                    return;
                }
                boolean z6 = false;
                for (int i7 = 0; i7 < historySize; i7++) {
                    z6 |= !zzt(motionEvent.getHistoricalX(0, i7), motionEvent.getHistoricalY(0, i7), motionEvent.getHistoricalX(1, i7), motionEvent.getHistoricalY(1, i7));
                }
                if (zzt(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z6) {
                    return;
                }
            }
            this.zzg = -1;
            this.zzk.removeCallbacks(this.zzl);
        }
    }

    public final void zzn(String str) {
        this.zzd = str;
    }

    public final void zzo(String str) {
        this.zze = str;
    }

    public final void zzp(String str) {
        this.zzc = str;
    }

    public final void zzq(String str) {
        this.zzf = str;
    }

    public final void zzr() {
        try {
            if (!(this.zza instanceof Activity)) {
                zzo.zzi("Can not create dialog without Activity Context");
                return;
            }
            String str = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(com.google.android.gms.ads.internal.zzv.zzt().zzb())) {
                str = "Creative preview";
            }
            String str2 = true != com.google.android.gms.ads.internal.zzv.zzt().zzm() ? "Troubleshooting" : "Troubleshooting (enabled)";
            ArrayList arrayList = new ArrayList();
            final int iZzu = zzu(arrayList, "Ad information", true);
            final int iZzu2 = zzu(arrayList, str, true);
            final int iZzu3 = zzu(arrayList, str2, true);
            boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.c9)).booleanValue();
            final int iZzu4 = zzu(arrayList, "Open ad inspector", zBooleanValue);
            final int iZzu5 = zzu(arrayList, "Ad inspector settings", zBooleanValue);
            com.google.android.gms.ads.internal.zzv.zzq();
            AlertDialog.Builder builderZzL = zzs.zzL(this.zza);
            builderZzL.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzam
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i6) {
                    this.zza.zzj(iZzu, iZzu2, iZzu3, iZzu4, iZzu5, dialogInterface, i6);
                }
            });
            builderZzL.create().show();
        } catch (WindowManager.BadTokenException e6) {
            zze.zzb(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
        }
    }

    public zzau(Context context, String str) {
        this(context);
        this.zzc = str;
    }
}
