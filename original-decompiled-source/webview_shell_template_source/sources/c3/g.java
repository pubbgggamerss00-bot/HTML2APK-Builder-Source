package c3;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import androidx.camera.camera2.internal.s0;
import androidx.core.graphics.drawable.IconCompat;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.api.GoogleApiActivity;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class g extends h {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f2181c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final g f2182d = new g();

    public static AlertDialog e(Activity activity, int i6, com.google.android.gms.common.internal.v vVar, DialogInterface.OnCancelListener onCancelListener) {
        if (i6 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(com.google.android.gms.common.internal.s.b(activity, i6));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        String string = i6 != 1 ? i6 != 2 ? i6 != 3 ? resources.getString(R.string.ok) : resources.getString(com.htmltoapk.template.R.string.common_google_play_services_enable_button) : resources.getString(com.htmltoapk.template.R.string.common_google_play_services_update_button) : resources.getString(com.htmltoapk.template.R.string.common_google_play_services_install_button);
        if (string != null) {
            builder.setPositiveButton(string, vVar);
        }
        String strC = com.google.android.gms.common.internal.s.c(activity, i6);
        if (strC != null) {
            builder.setTitle(strC);
        }
        Log.w("GoogleApiAvailability", androidx.camera.camera2.internal.compat.workaround.c.d(i6, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    public static void f(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof FragmentActivity) {
                androidx.fragment.app.z zVar = ((FragmentActivity) activity).s.f1220a.f1224v;
                o oVar = new o();
                com.google.android.gms.common.internal.l.g("Cannot display null dialog", alertDialog);
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                oVar.B0 = alertDialog;
                if (onCancelListener != null) {
                    oVar.C0 = onCancelListener;
                }
                oVar.f1156y0 = false;
                oVar.f1157z0 = true;
                zVar.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(zVar);
                aVar.f1122o = true;
                aVar.e(0, oVar, str, 1);
                aVar.d(false);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        c cVar = new c();
        com.google.android.gms.common.internal.l.g("Cannot display null dialog", alertDialog);
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        cVar.s = alertDialog;
        if (onCancelListener != null) {
            cVar.f2173t = onCancelListener;
        }
        cVar.show(fragmentManager, str);
    }

    public final void d(GoogleApiActivity googleApiActivity, int i6, GoogleApiActivity googleApiActivity2) {
        AlertDialog alertDialogE = e(googleApiActivity, i6, new com.google.android.gms.common.internal.t(super.b(googleApiActivity, "d", i6), googleApiActivity), googleApiActivity2);
        if (alertDialogE == null) {
            return;
        }
        f(googleApiActivity, alertDialogE, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    @TargetApi(20)
    public final void g(Context context, int i6, PendingIntent pendingIntent) throws Resources.NotFoundException {
        int i7;
        Log.w("GoogleApiAvailability", s0.a(i6, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i6 == 18) {
            new p(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i6 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strE = i6 == 6 ? com.google.android.gms.common.internal.s.e(context, "common_google_play_services_resolution_required_title") : com.google.android.gms.common.internal.s.c(context, i6);
        if (strE == null) {
            strE = context.getResources().getString(com.htmltoapk.template.R.string.common_google_play_services_notification_ticker);
        }
        String strD = (i6 == 6 || i6 == 19) ? com.google.android.gms.common.internal.s.d(context, "common_google_play_services_resolution_required_text", com.google.android.gms.common.internal.s.a(context)) : com.google.android.gms.common.internal.s.b(context, i6);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        com.google.android.gms.common.internal.l.f(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        i0.m mVar = new i0.m(context, null);
        mVar.f13327l = true;
        mVar.c();
        mVar.f13321e = i0.m.b(strE);
        i0.l lVar = new i0.l();
        lVar.f13316b = i0.m.b(strD);
        mVar.e(lVar);
        PackageManager packageManager = context.getPackageManager();
        if (i3.d.f13364a == null) {
            i3.d.f13364a = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (i3.d.f13364a.booleanValue()) {
            mVar.f13331p.icon = context.getApplicationInfo().icon;
            mVar.f13324i = 2;
            if (i3.d.b(context)) {
                mVar.f13318b.add(new i0.j(IconCompat.b(null, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, com.htmltoapk.template.R.drawable.common_full_open_on_phone), resources.getString(com.htmltoapk.template.R.string.common_open_on_phone), pendingIntent, new Bundle(), null, null));
            } else {
                mVar.f13323g = pendingIntent;
            }
        } else {
            mVar.f13331p.icon = R.drawable.stat_sys_warning;
            mVar.f13331p.tickerText = i0.m.b(resources.getString(com.htmltoapk.template.R.string.common_google_play_services_notification_ticker));
            mVar.f13331p.when = System.currentTimeMillis();
            mVar.f13323g = pendingIntent;
            mVar.f13322f = i0.m.b(strD);
        }
        if (i3.g.a()) {
            if (!i3.g.a()) {
                throw new IllegalStateException();
            }
            synchronized (f2181c) {
            }
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(com.htmltoapk.template.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(f.a(string));
            } else if (!string.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(string);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            mVar.f13329n = "com.google.android.gms.availability";
        }
        Notification notificationA = mVar.a();
        if (i6 == 1 || i6 == 2 || i6 == 3) {
            k.f2186a.set(false);
            i7 = 10436;
        } else {
            i7 = 39789;
        }
        notificationManager.notify(i7, notificationA);
    }

    public final void h(Activity activity, e3.e eVar, int i6, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialogE = e(activity, i6, new com.google.android.gms.common.internal.u(super.b(activity, "d", i6), eVar), onCancelListener);
        if (alertDialogE == null) {
            return;
        }
        f(activity, alertDialogE, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
