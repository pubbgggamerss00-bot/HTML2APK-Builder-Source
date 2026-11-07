package pa;

import android.R;
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
import androidx.core.graphics.drawable.IconCompat;
import c5.c0;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.a0;
import com.google.android.gms.common.internal.b0;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.common.internal.z;
import com.google.android.gms.internal.base.zad;
import com.google.android.gms.internal.base.zae;
import com.google.errorprone.annotations.RestrictedInheritance;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;

@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", allowlistAnnotations = {zad.class, zae.class}, explanation = "Sub classing of GMS Core's APIs are restricted to GMS Core client libs and testing fakes.", link = "go/gmscore-restrictedinheritance")
/* loaded from: classes2.dex */
public final class d extends e {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f21386c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final d f21387d = new d();

    public static AlertDialog e(Activity activity, int i10, b0 b0Var, DialogInterface.OnCancelListener onCancelListener) {
        if (i10 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(y.b(activity, i10));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        String string = i10 != 1 ? i10 != 2 ? i10 != 3 ? resources.getString(R.string.ok) : resources.getString(com.basitce.htmltoapk.R.string.common_google_play_services_enable_button) : resources.getString(com.basitce.htmltoapk.R.string.common_google_play_services_update_button) : resources.getString(com.basitce.htmltoapk.R.string.common_google_play_services_install_button);
        if (string != null) {
            builder.setPositiveButton(string, b0Var);
        }
        String strC = y.c(activity, i10);
        if (strC != null) {
            builder.setTitle(strC);
        }
        Log.w("GoogleApiAvailability", j2.y.a(i10, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    public static void f(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof c5.n) {
                c0 c0Var = ((c5.n) activity).f4962a.f4977a.f4982d;
                k kVar = new k();
                com.google.android.gms.common.internal.p.g(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                kVar.f21399k0 = alertDialog;
                if (onCancelListener != null) {
                    kVar.f21400l0 = onCancelListener;
                }
                kVar.f4851h0 = false;
                kVar.f4852i0 = true;
                c0Var.getClass();
                c5.a aVar = new c5.a(c0Var);
                aVar.f4933o = true;
                aVar.e(0, kVar, str);
                aVar.d(false);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        b bVar = new b();
        com.google.android.gms.common.internal.p.g(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        bVar.f21380a = alertDialog;
        if (onCancelListener != null) {
            bVar.f21381b = onCancelListener;
        }
        bVar.show(fragmentManager, str);
    }

    @Override // pa.e
    @ResultIgnorabilityUnspecified
    public final int b(Context context) {
        return c(context, e.f21388a);
    }

    @ResultIgnorabilityUnspecified
    public final void d(GoogleApiActivity googleApiActivity, int i10, GoogleApiActivity googleApiActivity2) {
        AlertDialog alertDialogE = e(googleApiActivity, i10, new z(super.a(googleApiActivity, "d", i10), googleApiActivity), googleApiActivity2);
        if (alertDialogE == null) {
            return;
        }
        f(googleApiActivity, alertDialogE, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void g(Context context, int i10, PendingIntent pendingIntent) {
        int i11;
        Bundle bundle;
        Log.w("GoogleApiAvailability", ad.b.b(i10, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i10 == 18) {
            new l(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i10 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strE = i10 == 6 ? y.e(context, "common_google_play_services_resolution_required_title") : y.c(context, i10);
        if (strE == null) {
            strE = context.getResources().getString(com.basitce.htmltoapk.R.string.common_google_play_services_notification_ticker);
        }
        String strD = (i10 == 6 || i10 == 19) ? y.d(context, "common_google_play_services_resolution_required_text", y.a(context)) : y.b(context, i10);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        com.google.android.gms.common.internal.p.f(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        o3.j jVar = new o3.j();
        ArrayList<o3.h> arrayList = new ArrayList<>();
        jVar.f18938b = arrayList;
        jVar.f18939c = new ArrayList<>();
        jVar.f18940d = new ArrayList<>();
        jVar.f18945i = true;
        jVar.f18947k = false;
        Notification notification = new Notification();
        jVar.f18951o = notification;
        jVar.f18937a = context;
        jVar.f18949m = null;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        jVar.f18944h = 0;
        jVar.f18952p = new ArrayList<>();
        jVar.f18950n = true;
        jVar.f18947k = true;
        notification.flags |= 16;
        jVar.f18941e = o3.j.a(strE);
        o3.i iVar = new o3.i();
        iVar.f18936b = o3.j.a(strD);
        if (jVar.f18946j != iVar) {
            jVar.f18946j = iVar;
            if (iVar.f18953a != jVar) {
                iVar.f18953a = jVar;
                jVar.b(iVar);
            }
        }
        PackageManager packageManager = context.getPackageManager();
        if (wa.b.f31479a == null) {
            wa.b.f31479a = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (wa.b.f31479a.booleanValue()) {
            notification.icon = context.getApplicationInfo().icon;
            jVar.f18944h = 2;
            if (wa.b.a(context)) {
                arrayList.add(new o3.h(IconCompat.a(null, "", com.basitce.htmltoapk.R.drawable.common_full_open_on_phone), resources.getString(com.basitce.htmltoapk.R.string.common_open_on_phone), pendingIntent, new Bundle(), null));
            } else {
                jVar.f18943g = pendingIntent;
            }
        } else {
            notification.icon = R.drawable.stat_sys_warning;
            notification.tickerText = o3.j.a(resources.getString(com.basitce.htmltoapk.R.string.common_google_play_services_notification_ticker));
            notification.when = System.currentTimeMillis();
            jVar.f18943g = pendingIntent;
            jVar.f18942f = o3.j.a(strD);
        }
        synchronized (f21386c) {
        }
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
        String string = context.getResources().getString(com.basitce.htmltoapk.R.string.common_google_play_services_notification_channel_name);
        if (notificationChannel == null) {
            notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
        } else if (!string.contentEquals(notificationChannel.getName())) {
            notificationChannel.setName(string);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        jVar.f18949m = "com.google.android.gms.availability";
        o3.m mVar = new o3.m(jVar);
        o3.j jVar2 = mVar.f18955b;
        o3.l lVar = jVar2.f18946j;
        if (lVar != null) {
            lVar.b(mVar);
        }
        Notification notificationBuild = mVar.f18954a.build();
        if (lVar != null) {
            jVar2.f18946j.getClass();
        }
        if (lVar != null && (bundle = notificationBuild.extras) != null) {
            lVar.a(bundle);
        }
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            i.f21393a.set(false);
            i11 = 10436;
        } else {
            i11 = 39789;
        }
        notificationManager.notify(i11, notificationBuild);
    }

    @ResultIgnorabilityUnspecified
    public final void h(Activity activity, com.google.android.gms.common.api.internal.k kVar, int i10, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialogE = e(activity, i10, new a0(super.a(activity, "d", i10), kVar), onCancelListener);
        if (alertDialogE == null) {
            return;
        }
        f(activity, alertDialogE, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
