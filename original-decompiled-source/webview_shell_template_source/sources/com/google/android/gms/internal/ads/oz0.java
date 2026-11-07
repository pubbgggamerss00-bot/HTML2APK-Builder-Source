package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.ads.AdService;
import com.google.android.gms.ads.NotificationHandlerActivity;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.offline.buffering.zza;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.internal.util.zzaa;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class oz0 extends m10 {
    public static final /* synthetic */ int A = 0;

    /* renamed from: t, reason: collision with root package name */
    public final HashMap f7891t;

    /* renamed from: u, reason: collision with root package name */
    public final Context f7892u;

    /* renamed from: v, reason: collision with root package name */
    public final cu0 f7893v;

    /* renamed from: w, reason: collision with root package name */
    public final zzu f7894w;

    /* renamed from: x, reason: collision with root package name */
    public final dz0 f7895x;

    /* renamed from: y, reason: collision with root package name */
    public String f7896y;

    /* renamed from: z, reason: collision with root package name */
    public String f7897z;

    public oz0(Context context, dz0 dz0Var, zzu zzuVar, cu0 cu0Var) {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        this.f7891t = new HashMap();
        this.f7892u = context;
        this.f7893v = cu0Var;
        this.f7894w = zzuVar;
        this.f7895x = dz0Var;
    }

    public static final PendingIntent f2(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        if (Build.VERSION.SDK_INT < 29 || !str.equals("offline_notification_clicked")) {
            intent.setClassName(context, AdService.CLASS_NAME);
            return PendingIntent.getService(context, 0, fk1.a(intent, 1140850688), 1140850688);
        }
        intent.setClassName(context, NotificationHandlerActivity.CLASS_NAME);
        return PendingIntent.getActivity(context, 0, fk1.a(intent, 201326592), 201326592);
    }

    public static String g2(int i6, String str) {
        Resources resourcesB = zzv.zzp().b();
        if (resourcesB == null) {
            return str;
        }
        try {
            return resourcesB.getString(i6);
        } catch (Resources.NotFoundException unused) {
            return str;
        }
    }

    public static void i1(Context context, cu0 cu0Var, dz0 dz0Var, String str, String str2, Map map) {
        String strGenerateUrl;
        String str3 = true != zzv.zzp().a(context) ? "offline" : "online";
        if (cu0Var != null) {
            bu0 bu0VarA = cu0Var.a();
            bu0VarA.a("gqi", str);
            bu0VarA.a("action", str2);
            bu0VarA.a("device_connectivity", str3);
            bu0VarA.a("event_timestamp", String.valueOf(zzv.zzC().a()));
            for (Map.Entry entry : map.entrySet()) {
                bu0VarA.a((String) entry.getKey(), (String) entry.getValue());
            }
            strGenerateUrl = bu0VarA.f3292b.f3661a.f5488f.generateUrl(bu0VarA.f3291a);
        } else {
            strGenerateUrl = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        fz0 fz0Var = new fz0(zzv.zzC().a(), str, strGenerateUrl, 2);
        dz0Var.getClass();
        dz0Var.b(new ni0(13, dz0Var, fz0Var));
    }

    @Override // com.google.android.gms.internal.ads.n10
    public final void L0(k3.a aVar, zza zzaVar) {
        Bitmap bitmapDecodeStream;
        String str;
        Context context = (Context) k3.b.i1(aVar);
        String str2 = zzaVar.zza;
        String str3 = zzaVar.zzb;
        String str4 = zzaVar.zzc;
        az0 az0Var = (az0) this.f7891t.get(this.f7896y);
        String strB = az0Var == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : az0Var.b();
        zzv.zzr().zzh(context, "offline_notification_channel", "AdMob Offline Notifications");
        PendingIntent pendingIntentF2 = f2(context, "offline_notification_clicked", str3, str2);
        PendingIntent pendingIntentF22 = f2(context, "offline_notification_dismissed", str3, str2);
        i0.m mVar = new i0.m(context, "offline_notification_channel");
        if (TextUtils.isEmpty(strB)) {
            mVar.f13321e = i0.m.b(g2(R.string.offline_notification_title, "You are back online! Let's pick up where we left off"));
        } else {
            mVar.f13321e = i0.m.b(String.format(g2(R.string.offline_notification_title_with_advertiser, "You are back online! Continue learning about %s"), strB));
        }
        mVar.c();
        mVar.f13331p.deleteIntent = pendingIntentF22;
        mVar.f13323g = pendingIntentF2;
        mVar.f13331p.icon = context.getApplicationInfo().icon;
        mVar.f13324i = ((Integer) zzbe.zzc().a(zn.q8)).intValue();
        if (!((Boolean) zzbe.zzc().a(zn.s8)).booleanValue() || str4.isEmpty()) {
            bitmapDecodeStream = null;
        } else {
            try {
                bitmapDecodeStream = BitmapFactory.decodeStream(new URL(str4).openConnection().getInputStream());
            } catch (IOException unused) {
            }
        }
        if (bitmapDecodeStream != null) {
            try {
                mVar.d(bitmapDecodeStream);
                i0.k kVar = new i0.k();
                IconCompat iconCompat = new IconCompat(1);
                iconCompat.f967b = bitmapDecodeStream;
                kVar.f13313b = iconCompat;
                kVar.f13314c = null;
                kVar.f13315d = true;
                mVar.e(kVar);
            } catch (Resources.NotFoundException unused2) {
            }
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        HashMap map = new HashMap();
        try {
            notificationManager.notify(str3, 54321, mVar.a());
            str = "offline_notification_impression";
        } catch (IllegalArgumentException e6) {
            map.put("notification_not_shown_reason", e6.getMessage());
            str = "offline_notification_failed";
        }
        h2(map, str3, str);
    }

    @Override // com.google.android.gms.internal.ads.n10
    public final void X0(String[] strArr, int[] iArr, k3.a aVar) throws Resources.NotFoundException {
        for (int i6 = 0; i6 < strArr.length; i6++) {
            if (strArr[i6].equals("android.permission.POST_NOTIFICATIONS")) {
                pz0 pz0Var = (pz0) k3.b.i1(aVar);
                Activity activityA = pz0Var.a();
                zzm zzmVarB = pz0Var.b();
                HashMap map = new HashMap();
                if (iArr[i6] == 0) {
                    map.put("dialog_action", "confirm");
                    i2();
                    k2(activityA, zzmVarB);
                } else {
                    map.put("dialog_action", "dismiss");
                    if (zzmVarB != null) {
                        zzmVarB.zzb();
                    }
                }
                h2(map, this.f7896y, "asnpdc");
                return;
            }
        }
    }

    public final void e2(String str, jp0 jp0Var) {
        yq yqVar;
        String string = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        String strP = jp0Var.p();
        String strB = jp0Var.b();
        if (TextUtils.isEmpty(strP)) {
            strP = strB != null ? strB : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        yq yqVarK = jp0Var.k();
        if (yqVarK != null) {
            try {
                string = yqVarK.zze().toString();
            } catch (RemoteException unused) {
            }
        }
        synchronized (jp0Var) {
            yqVar = jp0Var.s;
        }
        Drawable drawable = null;
        if (yqVar != null) {
            try {
                k3.a aVarZzf = yqVar.zzf();
                if (aVarZzf != null) {
                    drawable = (Drawable) k3.b.i1(aVarZzf);
                }
            } catch (RemoteException unused2) {
            }
        }
        this.f7891t.put(str, new xy0(strP, string, drawable));
    }

    public final void h2(Map map, String str, String str2) {
        i1(this.f7892u, this.f7893v, this.f7895x, str, str2, map);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i2() {
        boolean zZzg;
        Context context = this.f7892u;
        try {
            zzv.zzq();
            zzbr zzbrVarZzA = zzs.zzA(context);
            k3.b bVar = new k3.b(context);
            String str = this.f7897z;
            String str2 = this.f7896y;
            az0 az0Var = (az0) this.f7891t.get(str2);
            zZzg = zzbrVarZzA.zzg(bVar, new zza(str, str2, az0Var == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : az0Var.c()));
            if (!zZzg) {
                try {
                    zZzg = zzbrVarZzA.zzf(new k3.b(context), this.f7897z, this.f7896y);
                } catch (RemoteException e6) {
                    e = e6;
                    zzo.zzh("Failed to schedule offline notification poster.", e);
                    if (zZzg) {
                    }
                }
            }
        } catch (RemoteException e7) {
            e = e7;
            zZzg = false;
        }
        if (zZzg) {
            this.f7895x.a(this.f7896y);
            h2(ip1.f5823y, this.f7896y, "offline_notification_worker_not_scheduled");
        }
    }

    public final void j2(final Activity activity, final zzm zzmVar) throws Resources.NotFoundException {
        zzv.zzq();
        if (new i0.q(activity).f13338a.areNotificationsEnabled()) {
            i2();
            k2(activity, zzmVar);
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 12345);
            h2(ip1.f5823y, this.f7896y, "asnpdi");
        } else {
            zzv.zzq();
            AlertDialog.Builder builderZzL = zzs.zzL(activity);
            builderZzL.setTitle(g2(R.string.notifications_permission_title, "Allow app to send you notifications?")).setPositiveButton(g2(R.string.notifications_permission_confirm, "Allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.hz0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i6) {
                    HashMap map = new HashMap();
                    map.put("dialog_action", "confirm");
                    oz0 oz0Var = this.s;
                    oz0Var.h2(map, oz0Var.f7896y, "rtsdc");
                    zzaa zzaaVarZzr = zzv.zzr();
                    Activity activity2 = activity;
                    activity2.startActivity(zzaaVarZzr.zzf(activity2));
                    oz0Var.i2();
                    zzm zzmVar2 = zzmVar;
                    if (zzmVar2 != null) {
                        zzmVar2.zzb();
                    }
                }
            }).setNegativeButton(g2(R.string.notifications_permission_decline, "Don't allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.iz0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i6) {
                    oz0 oz0Var = this.s;
                    oz0Var.f7895x.a(oz0Var.f7896y);
                    HashMap map = new HashMap();
                    map.put("dialog_action", "dismiss");
                    oz0Var.h2(map, oz0Var.f7896y, "rtsdc");
                    zzm zzmVar2 = zzmVar;
                    if (zzmVar2 != null) {
                        zzmVar2.zzb();
                    }
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.jz0
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    oz0 oz0Var = this.s;
                    oz0Var.f7895x.a(oz0Var.f7896y);
                    HashMap map = new HashMap();
                    map.put("dialog_action", "dismiss");
                    oz0Var.h2(map, oz0Var.f7896y, "rtsdc");
                    zzm zzmVar2 = zzmVar;
                    if (zzmVar2 != null) {
                        zzmVar2.zzb();
                    }
                }
            });
            builderZzL.create().show();
            h2(ip1.f5823y, this.f7896y, "rtsdi");
        }
    }

    public final void k2(Activity activity, final zzm zzmVar) throws Resources.NotFoundException {
        XmlResourceParser layout;
        AlertDialog alertDialogCreate;
        zzv.zzq();
        AlertDialog.Builder onCancelListener = zzs.zzL(activity).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.gz0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                zzm zzmVar2 = zzmVar;
                if (zzmVar2 != null) {
                    zzmVar2.zzb();
                }
            }
        });
        int i6 = R.layout.offline_ads_dialog;
        Resources resourcesB = zzv.zzp().b();
        if (resourcesB == null) {
            layout = null;
        } else {
            try {
                layout = resourcesB.getLayout(i6);
            } catch (Resources.NotFoundException unused) {
            }
        }
        if (layout == null) {
            onCancelListener.setMessage(g2(R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
            alertDialogCreate = onCancelListener.create();
        } else {
            try {
                View viewInflate = activity.getLayoutInflater().inflate(layout, (ViewGroup) null);
                onCancelListener.setView(viewInflate);
                String str = this.f7896y;
                HashMap map = this.f7891t;
                az0 az0Var = (az0) map.get(str);
                String strB = az0Var == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : az0Var.b();
                if (!TextUtils.isEmpty(strB)) {
                    TextView textView = (TextView) viewInflate.findViewById(R.id.offline_dialog_advertiser_name);
                    textView.setVisibility(0);
                    textView.setText(strB);
                }
                az0 az0Var2 = (az0) map.get(this.f7896y);
                Drawable drawableA = az0Var2 != null ? az0Var2.a() : null;
                if (drawableA != null) {
                    ((ImageView) viewInflate.findViewById(R.id.offline_dialog_image)).setImageDrawable(drawableA);
                }
                alertDialogCreate = onCancelListener.create();
                alertDialogCreate.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            } catch (Resources.NotFoundException unused2) {
                onCancelListener.setMessage(g2(R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
                alertDialogCreate = onCancelListener.create();
            }
        }
        alertDialogCreate.show();
        Timer timer = new Timer();
        timer.schedule(new nz0(alertDialogCreate, timer, zzmVar), 3000L);
    }

    @Override // com.google.android.gms.internal.ads.n10
    public final void t(k3.a aVar) throws Resources.NotFoundException {
        pz0 pz0Var = (pz0) k3.b.i1(aVar);
        final Activity activityA = pz0Var.a();
        final zzm zzmVarB = pz0Var.b();
        this.f7896y = pz0Var.c();
        this.f7897z = pz0Var.d();
        if (((Boolean) zzbe.zzc().a(zn.p8)).booleanValue()) {
            j2(activityA, zzmVarB);
            return;
        }
        h2(ip1.f5823y, this.f7896y, "dialog_impression");
        zzv.zzq();
        AlertDialog.Builder builderZzL = zzs.zzL(activityA);
        builderZzL.setTitle(g2(R.string.offline_opt_in_title, "Open ad when you're back online.")).setMessage(g2(R.string.offline_opt_in_message, "We'll send you a notification with a link to the advertiser site.")).setPositiveButton(g2(R.string.offline_opt_in_confirm, "OK"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.kz0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i6) throws Resources.NotFoundException {
                oz0 oz0Var = this.s;
                oz0Var.getClass();
                HashMap map = new HashMap();
                map.put("dialog_action", "confirm");
                oz0Var.h2(map, oz0Var.f7896y, "dialog_click");
                oz0Var.j2(activityA, zzmVarB);
            }
        }).setNegativeButton(g2(R.string.offline_opt_in_decline, "No thanks"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.lz0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i6) {
                oz0 oz0Var = this.s;
                oz0Var.f7895x.a(oz0Var.f7896y);
                HashMap map = new HashMap();
                map.put("dialog_action", "dismiss");
                oz0Var.h2(map, oz0Var.f7896y, "dialog_click");
                zzm zzmVar = zzmVarB;
                if (zzmVar != null) {
                    zzmVar.zzb();
                }
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.mz0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                oz0 oz0Var = this.s;
                oz0Var.f7895x.a(oz0Var.f7896y);
                HashMap map = new HashMap();
                map.put("dialog_action", "dismiss");
                oz0Var.h2(map, oz0Var.f7896y, "dialog_click");
                zzm zzmVar = zzmVarB;
                if (zzmVar != null) {
                    zzmVar.zzb();
                }
            }
        });
        builderZzL.create().show();
    }

    @Override // com.google.android.gms.internal.ads.n10
    public final void u(Intent intent) {
        dz0 dz0Var = this.f7895x;
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
            String stringExtra2 = intent.getStringExtra("gws_query_id");
            String stringExtra3 = intent.getStringExtra("uri");
            b70 b70VarZzp = zzv.zzp();
            Context context = this.f7892u;
            boolean zA = b70VarZzp.a(context);
            HashMap map = new HashMap();
            if (stringExtra.equals("offline_notification_clicked")) {
                map.put("offline_notification_action", "offline_notification_clicked");
                c = true == zA ? (char) 1 : (char) 2;
                map.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                map.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
                try {
                    Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                    if (launchIntentForPackage == null) {
                        launchIntentForPackage = new Intent("android.intent.action.VIEW");
                        launchIntentForPackage.setData(Uri.parse(stringExtra3));
                    }
                    launchIntentForPackage.addFlags(268435456);
                    context.startActivity(launchIntentForPackage);
                    map.put("olaa", "olas");
                } catch (ActivityNotFoundException unused) {
                    map.put("olaa", "olaf");
                }
            } else {
                map.put("offline_notification_action", "offline_notification_dismissed");
            }
            h2(map, stringExtra2, "offline_notification_action");
            try {
                SQLiteDatabase writableDatabase = dz0Var.getWritableDatabase();
                if (c == 1) {
                    dz0Var.f4062t.execute(new kb0(1, writableDatabase, this.f7894w, stringExtra2));
                } else {
                    writableDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{stringExtra2, Integer.toString(0)});
                }
            } catch (SQLiteException e6) {
                zzo.zzg("Failed to get writable offline buffering database: ".concat(e6.toString()));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.n10
    public final void zzh() {
        this.f7895x.b(new ej0(12, this.f7894w));
    }
}
