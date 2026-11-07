package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.overlay.zzaa;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.internal.util.client.zzw;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class iu implements yt {
    public final zzb s;

    /* renamed from: t, reason: collision with root package name */
    public final cu0 f5842t;

    /* renamed from: v, reason: collision with root package name */
    public final w00 f5844v;

    /* renamed from: w, reason: collision with root package name */
    public final dz0 f5845w;

    /* renamed from: x, reason: collision with root package name */
    public final vf0 f5846x;

    /* renamed from: y, reason: collision with root package name */
    public zzaa f5847y = null;

    /* renamed from: z, reason: collision with root package name */
    public final h70 f5848z = i70.f5592g;

    /* renamed from: u, reason: collision with root package name */
    public final zzu f5843u = new zzu(null);

    public iu(zzb zzbVar, w00 w00Var, dz0 dz0Var, cu0 cu0Var, vf0 vf0Var) {
        this.s = zzbVar;
        this.f5844v = w00Var;
        this.f5845w = dz0Var;
        this.f5842t = cu0Var;
        this.f5846x = vf0Var;
    }

    public static int a(Map map) {
        String str = (String) map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return 7;
        }
        if ("l".equalsIgnoreCase(str)) {
            return 6;
        }
        return "c".equalsIgnoreCase(str) ? 14 : -1;
    }

    public static Uri b(Context context, mf mfVar, Uri uri, View view, Activity activity, fc1 fc1Var) {
        if (mfVar != null) {
            try {
                if (!((Boolean) zzbe.zzc().a(zn.Rb)).booleanValue() || fc1Var == null) {
                    if (mfVar.b(uri)) {
                        return mfVar.a(uri, context, view, activity);
                    }
                } else if (mfVar.b(uri)) {
                    return fc1Var.a(uri, context, view, activity);
                }
            } catch (nf unused) {
            } catch (Exception e6) {
                zzv.zzp().h("OpenGmsgHandler.maybeAddClickSignalsToUri", e6);
            }
        }
        return uri;
    }

    public static Uri c(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") == null) {
                return uri;
            }
            return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
        } catch (UnsupportedOperationException e6) {
            zzo.zzh("Error adding click uptime parameter to url: ".concat(String.valueOf(uri.toString())), e6);
            return uri;
        }
    }

    @Override // com.google.android.gms.internal.ads.yt
    public final void d(Object obj, Map map) {
        vf0 vf0Var;
        zza zzaVar = (zza) obj;
        String str = (String) map.get("u");
        Map map2 = new HashMap();
        xa0 xa0Var = (xa0) zzaVar;
        if (xa0Var.d() != null) {
            map2 = xa0Var.d().f9213w0;
        }
        String strB = c60.b(str, xa0Var.getContext(), true, map2);
        String str2 = (String) map.get("a");
        if (str2 == null) {
            zzo.zzj("Action missing from an open GMSG.");
            return;
        }
        zzb zzbVar = this.s;
        if (zzbVar != null && !zzbVar.zzc()) {
            zzbVar.zzb(strB);
            return;
        }
        c5.a aVarA = (((Boolean) zzbe.zzc().a(zn.T9)).booleanValue() && (vf0Var = this.f5846x) != null && vf0.b(strB)) ? vf0Var.a(strB, zzbc.zze()) : bs1.m(strB);
        eu euVar = new eu();
        euVar.f4395t = map;
        euVar.f4396u = zzaVar;
        euVar.s = str2;
        euVar.f4397v = this;
        aVarA.addListener(new as1(0, aVarA, euVar), this.f5848z);
    }

    public final void e(Context context, String str, String str2) {
        this.f5845w.a(str);
        cu0 cu0Var = this.f5842t;
        if (cu0Var != null) {
            en1.b("dialog_not_shown_reason", str2);
            oz0.i1(context, cu0Var, this.f5845w, str, "dialog_not_shown", ip1.e(1, new Object[]{"dialog_not_shown_reason", str2}, null));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0155, code lost:
    
        r6 = r13;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(zza zzaVar, Map map, boolean z6, String str, boolean z7, boolean z8) {
        Intent intent;
        Intent intentA;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ResolveInfo resolveInfoB;
        boolean z9 = true;
        g(true);
        xa0 xa0Var = (xa0) zzaVar;
        Context context = xa0Var.getContext();
        mf mfVarB = xa0Var.b();
        View viewZzF = xa0Var.zzF();
        fc1 fc1VarR = xa0Var.R();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        String str2 = (String) map.get("u");
        if (TextUtils.isEmpty(str2)) {
            intentA = null;
        } else {
            Uri uriC = c(b(context, mfVarB, Uri.parse(str2), viewZzF, null, fc1VarR));
            boolean z10 = Boolean.parseBoolean((String) map.get("use_first_package"));
            boolean z11 = Boolean.parseBoolean((String) map.get("use_running_process"));
            if (!Boolean.parseBoolean((String) map.get("use_custom_tabs"))) {
                if (!((Boolean) zzbe.zzc().a(zn.C4)).booleanValue()) {
                    z9 = false;
                }
            }
            Uri uriBuild = "http".equalsIgnoreCase(uriC.getScheme()) ? uriC.buildUpon().scheme("https").build() : "https".equalsIgnoreCase(uriC.getScheme()) ? uriC.buildUpon().scheme("http").build() : null;
            ArrayList arrayList = new ArrayList();
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.addFlags(268435456);
            intent2.setData(uriC);
            intent2.setAction("android.intent.action.VIEW");
            if (uriBuild == null) {
                intent = null;
            } else {
                Intent intent3 = new Intent("android.intent.action.VIEW");
                intent3.addFlags(268435456);
                intent3.setData(uriBuild);
                intent3.setAction("android.intent.action.VIEW");
                intent = intent3;
            }
            if (z9) {
                zzv.zzq();
                zzs.zzp(context, intent2);
                zzv.zzq();
                zzs.zzp(context, intent);
            }
            ResolveInfo resolveInfoB2 = hu.b(intent2, arrayList, context);
            if (resolveInfoB2 != null) {
                intentA = hu.a(intent2, resolveInfoB2);
            } else if (intent != null && (resolveInfoB = hu.b(intent, new ArrayList(), context)) != null) {
                intentA = hu.a(intent2, resolveInfoB);
                if (hu.b(intentA, new ArrayList(), context) == null) {
                }
            } else if (!arrayList.isEmpty()) {
                if (!z11 || activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                    intentA = !z10 ? hu.a(intent2, (ResolveInfo) arrayList.get(0)) : intent2;
                } else {
                    int size = arrayList.size();
                    int i6 = 0;
                    loop0: while (i6 < size) {
                        ResolveInfo resolveInfo = (ResolveInfo) arrayList.get(i6);
                        Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                        do {
                            int i7 = i6 + 1;
                            if (it.hasNext()) {
                            }
                        } while (!it.next().processName.equals(resolveInfo.activityInfo.packageName));
                        intentA = hu.a(intent2, resolveInfo);
                        break loop0;
                    }
                    if (!z10) {
                    }
                }
            }
        }
        if (!z6 || this.f5845w == null || intentA == null || !h(zzaVar, xa0Var.getContext(), intentA.getData().toString(), str)) {
            try {
                ((ub0) zzaVar).c0(new zzc(intentA, this.f5847y), z7, z8, str);
            } catch (ActivityNotFoundException e6) {
                zzo.zzj(e6.getMessage());
            }
        }
    }

    public final void g(boolean z6) {
        w00 w00Var = this.f5844v;
        if (w00Var != null) {
            w00Var.q(z6);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0070, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(com.google.android.gms.internal.ads.zn.t8)).booleanValue() != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e0, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT < 33 ? ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(com.google.android.gms.internal.ads.zn.o8)).booleanValue() : ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(com.google.android.gms.internal.ads.zn.n8)).booleanValue()) != false) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(zza zzaVar, Context context, String str, String str2) {
        Context context2;
        String str3;
        y10 y10Var;
        zzw zzwVar;
        dz0 dz0Var = this.f5845w;
        cu0 cu0Var = this.f5842t;
        if (cu0Var != null) {
            int i6 = oz0.A;
            context2 = context;
            str3 = str2;
            oz0.i1(context2, cu0Var, dz0Var, str3, "offline_open", new HashMap());
        } else {
            context2 = context;
            str3 = str2;
        }
        if (zzv.zzp().a(context2)) {
            dz0Var.getClass();
            dz0Var.b(new k00(dz0Var, this.f5843u, str3));
            return false;
        }
        xa0 xa0Var = (xa0) zzaVar;
        tb1 tb1VarD = xa0Var.d();
        boolean z6 = (tb1VarD == null || (zzwVar = tb1VarD.f9217y0) == null || zzwVar.zzc()) ? false : true;
        boolean z7 = (tb1VarD == null || (y10Var = tb1VarD.f9178d0) == null || !y10Var.f10777a || y10Var.f10778b == null || !y10Var.f10779c) ? false : true;
        if (!z6) {
            if (z7) {
            }
            zzv.zzq();
            zzbr zzbrVarZzA = zzs.zzA(context2);
            zzv.zzq();
            boolean zAreNotificationsEnabled = new i0.q(context2).f13338a.areNotificationsEnabled();
            boolean zZzi = zzv.zzr().zzi(context2, "offline_notification_channel");
            boolean z8 = xa0Var.zzO().b() && xa0Var.zzi() == null;
            if (!zAreNotificationsEnabled) {
                zzv.zzq();
                if (!new i0.q(context2).f13338a.areNotificationsEnabled()) {
                }
                e(context2, str3, "notifications_disabled");
                return false;
            }
            if (zZzi) {
                e(context2, str3, "notification_channel_disabled");
                return false;
            }
            if (zzbrVarZzA == null) {
                e(context2, str3, "work_manager_unavailable");
                return false;
            }
            if (z8) {
                e(context2, str3, "ad_no_activity");
                return false;
            }
            if (!((Boolean) zzbe.zzc().a(zn.l8)).booleanValue()) {
                e(context2, str3, "notification_flow_disabled");
                return false;
            }
            if (xa0Var.zzL() == null || xa0Var.zzi() == null) {
                ((ub0) zzaVar).n(str3, str);
            } else {
                Activity activityZzi = xa0Var.zzi();
                if (activityZzi == null) {
                    throw new NullPointerException("Null activity");
                }
                try {
                    xa0Var.zzL().zzf(new zy0(activityZzi, null, str3, str));
                } catch (Exception e6) {
                    e(context2, str3, e6.getMessage());
                    return false;
                }
            }
            zzaVar.onAdClicked();
            return true;
        }
        if (cu0Var != null) {
            int i7 = oz0.A;
            oz0.i1(context2, cu0Var, dz0Var, str3, "onfs", new HashMap());
        }
        return false;
    }

    public final void i(int i6) {
        cu0 cu0Var;
        String str;
        if (!((Boolean) zzbe.zzc().a(zn.F4)).booleanValue() || (cu0Var = this.f5842t) == null) {
            return;
        }
        bu0 bu0VarA = cu0Var.a();
        bu0VarA.a("action", "cct_action");
        switch (i6) {
            case 2:
                str = "CONTEXT_NOT_AN_ACTIVITY";
                break;
            case 3:
                str = "CONTEXT_NULL";
                break;
            case 4:
                str = "CCT_NOT_SUPPORTED";
                break;
            case 5:
                str = "CCT_READY_TO_OPEN";
                break;
            case 6:
                str = "ACTIVITY_NOT_FOUND";
                break;
            case 7:
                str = "EMPTY_URL";
                break;
            case 8:
                str = "UNKNOWN";
                break;
            case 9:
                str = "WRONG_EXP_SETUP";
                break;
            default:
                str = "OPT_OUT";
                break;
        }
        bu0VarA.a("cct_open_status", str);
        bu0VarA.c();
    }
}
