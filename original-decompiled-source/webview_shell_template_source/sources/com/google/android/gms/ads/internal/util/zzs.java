package com.google.android.gms.ads.internal.util;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.internal.ads.am1;
import com.google.android.gms.internal.ads.aq;
import com.google.android.gms.internal.ads.bc0;
import com.google.android.gms.internal.ads.bu0;
import com.google.android.gms.internal.ads.cf;
import com.google.android.gms.internal.ads.cm1;
import com.google.android.gms.internal.ads.cu0;
import com.google.android.gms.internal.ads.ft0;
import com.google.android.gms.internal.ads.ha2;
import com.google.android.gms.internal.ads.i70;
import com.google.android.gms.internal.ads.ml1;
import com.google.android.gms.internal.ads.oa0;
import com.google.android.gms.internal.ads.qb0;
import com.google.android.gms.internal.ads.rj1;
import com.google.android.gms.internal.ads.sn;
import com.google.android.gms.internal.ads.tb1;
import com.google.android.gms.internal.ads.uj1;
import com.google.android.gms.internal.ads.vb1;
import com.google.android.gms.internal.ads.vs1;
import com.google.android.gms.internal.ads.wo;
import com.google.android.gms.internal.ads.xo;
import com.google.android.gms.internal.ads.yh;
import com.google.android.gms.internal.ads.z30;
import com.google.android.gms.internal.ads.zn;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p.e;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzs {
    public static final uj1 zza = new zzf(Looper.getMainLooper());
    private String zzh;
    private volatile String zzi;
    private final AtomicReference zzb = new AtomicReference(null);
    private final AtomicReference zzc = new AtomicReference(null);
    private final AtomicReference zzd = new AtomicReference(new Bundle());
    private final AtomicBoolean zze = new AtomicBoolean();
    private boolean zzf = true;
    private final Object zzg = new Object();
    private boolean zzj = false;
    private boolean zzk = false;
    private final Executor zzl = Executors.newSingleThreadExecutor();

    public static final zzbr zzA(Context context) {
        try {
            Object objNewInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(null).newInstance(null);
            if (!(objNewInstance instanceof IBinder)) {
                zzo.zzg("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) objNewInstance;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            return iInterfaceQueryLocalInterface instanceof zzbr ? (zzbr) iInterfaceQueryLocalInterface : new zzbp(iBinder);
        } catch (Exception e6) {
            com.google.android.gms.ads.internal.zzv.zzp().h("Failed to instantiate WorkManagerUtil", e6);
            return null;
        }
    }

    public static final boolean zzB(Context context, String str) {
        Context contextA = z30.a(context);
        return j3.d.a(contextA).f13494a.getPackageManager().checkPermission(str, contextA.getPackageName()) == 0;
    }

    public static final boolean zzC(Context context) {
        try {
            if (i3.d.f13369f == null) {
                i3.d.f13369f = Boolean.valueOf(i3.g.b() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE"));
            }
            return i3.d.f13369f.booleanValue();
        } catch (NoSuchMethodError unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean zzD(String str) {
        String str2;
        if (com.google.android.gms.ads.internal.util.client.zzl.zzk()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.Y4)).booleanValue()) {
                String str3 = (String) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.f11355a5);
                if (str3.isEmpty()) {
                    str2 = (String) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.Z4);
                    if (!str2.isEmpty()) {
                    }
                } else {
                    for (String str4 : str3.split(";")) {
                        if (str4.equals(str)) {
                            break;
                        }
                    }
                    str2 = (String) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.Z4);
                    if (!str2.isEmpty()) {
                        return true;
                    }
                    for (String str5 : str2.split(";")) {
                        if (str5.equals(str)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final boolean zzE(Context context) {
        KeyguardManager keyguardManagerZzY;
        return (context == null || (keyguardManagerZzY = zzY(context)) == null || !keyguardManagerZzY.isKeyguardLocked()) ? false : true;
    }

    public static final boolean zzF(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            zzo.zzh("Error loading class.", th);
            com.google.android.gms.ads.internal.zzv.zzp().h("AdUtil.isLiteSdk", th);
            return false;
        }
    }

    public static final boolean zzG() {
        int iMyUid = Process.myUid();
        return iMyUid == 0 || iMyUid == 1000;
    }

    public static final boolean zzH(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && (powerManager = (PowerManager) context.getSystemService("power")) != null) {
                        return !powerManager.isScreenOn();
                    }
                    return true;
                }
            }
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    public static final boolean zzI(Context context) {
        try {
            Bundle bundleZzZ = zzZ(context);
            String string = bundleZzZ.getString("com.google.android.gms.ads.INTEGRATION_MANAGER");
            if (TextUtils.isEmpty(zzaa(bundleZzZ))) {
                if (!TextUtils.isEmpty(string)) {
                    return true;
                }
            }
        } catch (RemoteException unused) {
        }
        return false;
    }

    public static final boolean zzJ(Context context) {
        Window window;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && window.getDecorView() != null) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom != 0 && rect2.bottom != 0 && rect.top == rect2.top) {
                return true;
            }
        }
        return false;
    }

    public static final void zzK(View view, int i6, MotionEvent motionEvent) {
        String strA;
        int i7;
        int iHeight;
        int iWidth;
        String str;
        tb1 tb1VarD;
        vb1 vb1VarH;
        View childAt = view;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        try {
            String packageName = childAt.getContext().getPackageName();
            if (childAt instanceof ft0) {
                childAt = ((ft0) childAt).getChildAt(0);
            }
            if ((childAt instanceof com.google.android.gms.ads.formats.zzj) || (childAt instanceof NativeAdView)) {
                strA = "NATIVE";
                i7 = 1;
            } else {
                strA = "UNKNOWN";
                i7 = 0;
            }
            if (childAt.getLocalVisibleRect(rect)) {
                iWidth = rect.width();
                iHeight = rect.height();
            } else {
                iHeight = 0;
                iWidth = 0;
            }
            com.google.android.gms.ads.internal.zzv.zzq();
            long jZzx = zzx(childAt);
            childAt.getLocationOnScreen(iArr);
            int i8 = iArr[0];
            int i9 = iArr[1];
            String str2 = "none";
            if (!(childAt instanceof qb0) || (vb1VarH = ((qb0) childAt).h()) == null) {
                str = "none";
            } else {
                str = vb1VarH.f9774b;
                childAt.setContentDescription(str + ":" + childAt.hashCode());
            }
            if ((childAt instanceof oa0) && (tb1VarD = ((oa0) childAt).d()) != null) {
                strA = tb1.a(tb1VarD.f9173b);
                i7 = tb1VarD.f9179e;
                str2 = tb1VarD.E;
            }
            Locale locale = Locale.US;
            zzo.zzi("<Ad hashCode=" + childAt.hashCode() + ", package=" + packageName + ", adNetCls=" + str2 + ", gwsQueryId=" + str + ", format=" + strA + ", impType=" + i7 + ", class=" + childAt.getClass().getName() + ", x=" + i8 + ", y=" + i9 + ", width=" + childAt.getWidth() + ", height=" + childAt.getHeight() + ", vWidth=" + iWidth + ", vHeight=" + iHeight + ", alpha=" + jZzx + ", state=" + Integer.toString(i6, 2) + ">");
        } catch (Exception e6) {
            zzo.zzh("Failure getting view location.", e6);
        }
    }

    public static final AlertDialog.Builder zzL(Context context) {
        com.google.android.gms.ads.internal.zzv.zzr();
        return new AlertDialog.Builder(context, R.style.Theme.Material.Dialog.Alert);
    }

    public static final void zzM(Context context, String str, String str2) {
        new zzbw(context, str, str2, null, null).zzb();
    }

    public static final void zzN(Context context, Throwable th) {
        if (context == null) {
            return;
        }
        try {
            if (((Boolean) aq.f2819b.c()).booleanValue()) {
                i3.b.a(context, th);
            }
        } catch (IllegalStateException unused) {
        }
    }

    public static final int zzO(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e6) {
            zzo.zzj("Could not parse value:".concat(e6.toString()));
            return 0;
        }
    }

    public static final Map zzP(Uri uri) {
        String encodedQuery;
        if (uri == null) {
            return null;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.f11453p)).booleanValue()) {
            HashMap map = new HashMap();
            for (String str : uri.getQueryParameterNames()) {
                if (!TextUtils.isEmpty(str)) {
                    map.put(str, uri.getQueryParameter(str));
                }
            }
            return map;
        }
        HashMap map2 = new HashMap();
        if (!uri.isOpaque() && (encodedQuery = uri.getEncodedQuery()) != null) {
            int i6 = 0;
            while (true) {
                int iIndexOf = encodedQuery.indexOf(38, i6);
                int length = encodedQuery.length();
                if (iIndexOf != -1) {
                    length = iIndexOf;
                }
                int iIndexOf2 = encodedQuery.indexOf(61, i6);
                if (iIndexOf2 > length || iIndexOf2 == -1) {
                    iIndexOf2 = length;
                }
                map2.put(Uri.decode(encodedQuery.substring(i6, iIndexOf2)), iIndexOf2 == length ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : Uri.decode(encodedQuery.substring(iIndexOf2 + 1, length)));
                if (iIndexOf == -1) {
                    break;
                }
                i6 = iIndexOf + 1;
            }
        }
        return map2;
    }

    public static final int[] zzQ(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        return (window == null || (viewFindViewById = window.findViewById(R.id.content)) == null) ? zzv() : new int[]{viewFindViewById.getWidth(), viewFindViewById.getHeight()};
    }

    public static final int[] zzR(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        int[] iArrZzv = (window == null || (viewFindViewById = window.findViewById(R.id.content)) == null) ? zzv() : new int[]{viewFindViewById.getTop(), viewFindViewById.getBottom()};
        return new int[]{com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(activity, iArrZzv[0]), com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(activity, iArrZzv[1])};
    }

    public static final boolean zzS(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z6 = com.google.android.gms.ads.internal.zzv.zzq().zzf || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || zzo(view);
        long jZzx = zzx(view);
        if (view.getVisibility() == 0 && view.isShown() && ((powerManager == null || powerManager.isScreenOn()) && z6)) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.u1)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.va)).booleanValue()) {
                    if (jZzx < ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.xa)).intValue()) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static final void zzT(Context context, Intent intent) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.Sa)).booleanValue()) {
            zzad(context, intent);
            return;
        }
        try {
            zzad(context, intent);
        } catch (SecurityException e6) {
            zzo.zzk(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
            com.google.android.gms.ads.internal.zzv.zzp().h("AdUtil.startActivityWithUnknownContext", e6);
        }
    }

    public static final void zzU(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            zzp(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            zzo.zze("Opening " + uri.toString() + " in a new browser.");
        } catch (ActivityNotFoundException e6) {
            zzo.zzh("No browser is found.", e6);
        }
    }

    public static final int[] zzV(Activity activity) {
        int[] iArrZzQ = zzQ(activity);
        return new int[]{com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(activity, iArrZzQ[0]), com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(activity, iArrZzQ[1])};
    }

    public static final boolean zzW(View view, Context context) {
        Context applicationContext = context.getApplicationContext();
        return zzS(view, applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null, zzY(context));
    }

    public static final void zzX(Context context, Intent intent, cu0 cu0Var, String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.Uc)).booleanValue() || !(context instanceof bc0)) {
            zzT(context, intent);
            return;
        }
        try {
            Uri data = intent.getData();
            if (data != null && data.toString() != null) {
                if (data.toString().matches((String) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.Wc))) {
                    ((bc0) context).a(intent);
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.Vc)).booleanValue() || cu0Var == null) {
                        return;
                    }
                    bu0 bu0VarA = cu0Var.a();
                    bu0VarA.a("action", "hila");
                    if (str == null) {
                        str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    }
                    bu0VarA.a("gqi", str);
                    bu0VarA.f3292b.f3662b.execute(new cf(7, bu0VarA));
                    return;
                }
            }
            zzT(context, intent);
        } catch (ActivityNotFoundException e6) {
            e = e6;
            zzo.zzh("Error occurred while starting activity for result", e);
            com.google.android.gms.ads.internal.zzv.zzp().h("AdUtil.startActivityForResult", e);
            zzT(context, intent);
        } catch (SecurityException e7) {
            e = e7;
            zzo.zzh("Error occurred while starting activity for result", e);
            com.google.android.gms.ads.internal.zzv.zzp().h("AdUtil.startActivityForResult", e);
            zzT(context, intent);
        } catch (Exception e8) {
            zzo.zzh("Error occurred while starting activity for result", e8);
            com.google.android.gms.ads.internal.zzv.zzp().h("AdUtil.startActivityForResult", e8);
            zzT(context, intent);
        }
    }

    private static KeyguardManager zzY(Context context) {
        Object systemService = context.getSystemService("keyguard");
        if (systemService == null || !(systemService instanceof KeyguardManager)) {
            return null;
        }
        return (KeyguardManager) systemService;
    }

    private static Bundle zzZ(Context context) {
        try {
            return j3.d.a(context).a(128, context.getPackageName()).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e6) {
            zze.zzb("Error getting metadata", e6);
            return null;
        }
    }

    public static int zza(int i6) {
        if (i6 >= 5000) {
            return i6;
        }
        if (i6 <= 0) {
            return 60000;
        }
        zzo.zzj("HTTP timeout too low: " + i6 + " milliseconds. Reverting to default timeout: 60000 milliseconds.");
        return 60000;
    }

    private static String zzaa(Bundle bundle) {
        if (bundle == null) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        return !TextUtils.isEmpty(string) ? (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) ? string : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    }

    private static boolean zzab(String str, AtomicReference atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern patternCompile = (Pattern) atomicReference.get();
            if (patternCompile == null || !str2.equals(patternCompile.pattern())) {
                patternCompile = Pattern.compile(str2);
                atomicReference.set(patternCompile);
            }
            return patternCompile.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    private static final void zzac(Context context, Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    private static final void zzad(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    private static final String zzae(final Context context, String str) throws PackageManager.NameNotFoundException {
        final Context contextCreatePackageContext;
        if (str == null) {
            return zzr();
        }
        String strZzr = null;
        try {
            zzcg zzcgVarZza = zzcg.zza();
            if (TextUtils.isEmpty(zzcgVarZza.zza)) {
                AtomicBoolean atomicBoolean = c3.k.f2186a;
                try {
                    contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
                } catch (PackageManager.NameNotFoundException unused) {
                    contextCreatePackageContext = null;
                }
                zzcgVarZza.zza = (String) zzcd.zza(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzcf
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        SharedPreferences sharedPreferences;
                        Context context2 = contextCreatePackageContext;
                        Context context3 = context;
                        boolean z6 = false;
                        if (context2 != null) {
                            zze.zza("Attempting to read user agent from Google Play Services.");
                            sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                        } else {
                            zze.zza("Attempting to read user agent from local cache.");
                            sharedPreferences = context3.getSharedPreferences("admob_user_agent", 0);
                            z6 = true;
                        }
                        String string = sharedPreferences.getString("user_agent", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                        if (!TextUtils.isEmpty(string)) {
                            return string;
                        }
                        zze.zza("Reading user agent from WebSettings");
                        String defaultUserAgent = WebSettings.getDefaultUserAgent(context3);
                        if (z6) {
                            sharedPreferences.edit().putString("user_agent", defaultUserAgent).apply();
                            zze.zza("Persisting user agent.");
                        }
                        return defaultUserAgent;
                    }
                });
            }
            strZzr = zzcgVarZza.zza;
        } catch (Exception unused2) {
        }
        if (TextUtils.isEmpty(strZzr)) {
            strZzr = WebSettings.getDefaultUserAgent(context);
        }
        if (TextUtils.isEmpty(strZzr)) {
            strZzr = zzr();
        }
        String strD = androidx.activity.m.d(strZzr, " (Mobile; ", str);
        try {
            if (j3.d.a(context).c()) {
                strD = strD + ";aia";
            }
        } catch (Exception e6) {
            com.google.android.gms.ads.internal.zzv.zzp().h("AdUtil.getUserAgent", e6);
        }
        return strD.concat(")");
    }

    public static List zzd() {
        sn snVar = zn.f11349a;
        ArrayList arrayListB = com.google.android.gms.ads.internal.client.zzbe.zza().b();
        ArrayList arrayList = new ArrayList();
        int size = arrayListB.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayListB.get(i6);
            i6++;
            String str = (String) obj;
            cm1 cm1VarA = cm1.a(new ml1(','));
            str.getClass();
            Iterator itI = cm1VarA.f3618a.i(cm1VarA, str);
            while (true) {
                am1 am1Var = (am1) itI;
                if (am1Var.hasNext()) {
                    try {
                        arrayList.add(Long.valueOf((String) am1Var.next()));
                    } catch (NumberFormatException unused) {
                        zze.zza("Experiment ID is not a number");
                    }
                }
            }
        }
        return arrayList;
    }

    public static void zzh(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            runnable.run();
        } else {
            i70.f5586a.execute(runnable);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0007  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean zzo(View view) {
        Activity activity;
        View rootView = view.getRootView();
        if (rootView == null) {
            activity = null;
        } else {
            Context context = rootView.getContext();
            if (context instanceof Activity) {
                activity = (Activity) context;
            }
        }
        if (activity == null) {
            return false;
        }
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
        return (attributes == null || (attributes.flags & 524288) == 0) ? false : true;
    }

    public static final void zzp(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
        extras.putBinder("android.support.customtabs.extra.SESSION", null);
        extras.putString("com.android.browser.application_id", context.getPackageName());
        intent.putExtras(extras);
    }

    public static final String zzq(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return zzaa(zzZ(context));
    }

    public static final String zzr() {
        StringBuilder sb = new StringBuilder(256);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        String str = Build.VERSION.RELEASE;
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        sb.append("; ");
        sb.append(Locale.getDefault());
        String str2 = Build.DEVICE;
        if (str2 != null) {
            sb.append("; ");
            sb.append(str2);
            String str3 = Build.DISPLAY;
            if (str3 != null) {
                sb.append(" Build/");
                sb.append(str3);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    public static final String zzs() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        return str2.startsWith(str) ? str2 : androidx.activity.m.d(str, " ", str2);
    }

    public static final Integer zzt(Context context) {
        Object systemService = context.getSystemService("display");
        if (systemService instanceof DisplayManager) {
            return Integer.valueOf(((DisplayManager) systemService).getDisplays().length);
        }
        return null;
    }

    public static final DisplayMetrics zzu(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static final int[] zzv() {
        return new int[]{0, 0};
    }

    public static final Map zzw(String str) {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                HashSet hashSet = new HashSet();
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(next);
                if (jSONArrayOptJSONArray != null) {
                    for (int i6 = 0; i6 < jSONArrayOptJSONArray.length(); i6++) {
                        String strOptString = jSONArrayOptJSONArray.optString(i6);
                        if (strOptString != null) {
                            hashSet.add(strOptString);
                        }
                    }
                    map.put(next, hashSet);
                }
            }
            return map;
        } catch (JSONException e6) {
            com.google.android.gms.ads.internal.zzv.zzp().h("AdUtil.getMapOfFileNamesToKeysFromJsonString", e6);
            return map;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.view.ViewParent] */
    public static final long zzx(View view) {
        float fMin = Float.MAX_VALUE;
        do {
            if (!(view instanceof View)) {
                break;
            }
            View view2 = (View) view;
            fMin = Math.min(fMin, view2.getAlpha());
            view = view2.getParent();
        } while (fMin > 0.0f);
        return Math.round((fMin >= 0.0f ? fMin : 0.0f) * 100.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final WebResourceResponse zzy(Context context, String str, String str2) {
        try {
            HashMap map = new HashMap();
            map.put("User-Agent", com.google.android.gms.ads.internal.zzv.zzq().zzc(context, str));
            map.put("Cache-Control", "max-stale=3600");
            String str3 = (String) new zzbo(context).zzb(0, str2, map, null).get(60L, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes("UTF-8")));
            }
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e6) {
            zzo.zzk("Could not fetch MRAID JS.", e6);
        }
        return null;
    }

    public static final String zzz() {
        Resources resourcesB = com.google.android.gms.ads.internal.zzv.zzp().b();
        return resourcesB != null ? resourcesB.getString(com.google.android.gms.ads.impl.R.string.s7) : "Test Ad";
    }

    public final c5.a zzb(final Uri uri) {
        Callable callable = new Callable() { // from class: com.google.android.gms.ads.internal.util.zzn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                uj1 uj1Var = zzs.zza;
                com.google.android.gms.ads.internal.zzv.zzq();
                return zzs.zzP(uri);
            }
        };
        Executor executor = this.zzl;
        vs1 vs1Var = new vs1(callable);
        executor.execute(vs1Var);
        return vs1Var;
    }

    public final String zzc(Context context, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.eb)).booleanValue()) {
            if (this.zzi != null) {
                return this.zzi;
            }
            this.zzi = zzae(context, str);
            return this.zzi;
        }
        synchronized (this.zzg) {
            try {
                String str2 = this.zzh;
                if (str2 != null) {
                    return str2;
                }
                String strZzae = zzae(context, str);
                this.zzh = strZzae;
                return strZzae;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzf(Context context, String str, boolean z6, HttpURLConnection httpURLConnection, boolean z7, int i6) {
        int iZza = zza(i6);
        zzo.zzi("HTTP timeout: " + iZza + " milliseconds.");
        httpURLConnection.setConnectTimeout(iZza);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(iZza);
        if (TextUtils.isEmpty(httpURLConnection.getRequestProperty("User-Agent"))) {
            httpURLConnection.setRequestProperty("User-Agent", zzc(context, str));
        }
        httpURLConnection.setUseCaches(false);
    }

    public final /* synthetic */ void zzg(Context context, String str, SharedPreferences sharedPreferences, String str2) {
        this.zzd.set(zzad.zzb(context, str));
    }

    public final void zzi(final Context context, final String str, String str2, Bundle bundle, boolean z6) {
        com.google.android.gms.ads.internal.zzv.zzq();
        bundle.putString("device", zzs());
        sn snVar = zn.f11349a;
        bundle.putString("eids", TextUtils.join(",", com.google.android.gms.ads.internal.client.zzbe.zza().a()));
        if (bundle.isEmpty()) {
            zzo.zze("Empty or null bundle.");
        } else {
            final String str3 = (String) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.ta);
            if (!this.zze.getAndSet(true)) {
                this.zzd.set(zzad.zza(context, str3, new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.ads.internal.util.zzm
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str4) {
                        this.zza.zzg(context, str3, sharedPreferences, str4);
                    }
                }));
            }
            bundle.putAll((Bundle) this.zzd.get());
        }
        com.google.android.gms.ads.internal.client.zzbc.zzb();
        com.google.android.gms.ads.internal.util.client.zzf.zzw(context, str, "gmob-apps", bundle, true, new com.google.android.gms.ads.internal.util.client.zze() { // from class: com.google.android.gms.ads.internal.util.zzl
            @Override // com.google.android.gms.ads.internal.util.client.zze
            public final com.google.android.gms.ads.internal.util.client.zzt zza(String str4) {
                uj1 uj1Var = zzs.zza;
                com.google.android.gms.ads.internal.zzv.zzq();
                zzs.zzM(context, str, str4);
                return com.google.android.gms.ads.internal.util.client.zzt.SUCCESS;
            }
        });
    }

    public final boolean zzj(String str) {
        return zzab(str, this.zzb, (String) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.f11447o0));
    }

    public final boolean zzk(String str) {
        return zzab(str, this.zzc, (String) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.p0));
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final boolean zzl(Context context) {
        if (this.zzk) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        zn.a(context);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.Ra)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new l(), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new l(), intentFilter, 4);
        }
        this.zzk = true;
        return true;
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final boolean zzm(Context context) {
        if (this.zzj) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        zn.a(context);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.Ra)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new m(0, this), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new m(0, this), intentFilter, 4);
        }
        this.zzj = true;
        return true;
    }

    public final int zzn(Context context, Uri uri) {
        String strE;
        if (context == null) {
            zze.zza("Trying to open chrome custom tab on a null context");
            return 3;
        }
        if (!(context instanceof Activity)) {
            zzac(context, uri);
            return 2;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.G4)).booleanValue()) {
            wo woVarZzf = com.google.android.gms.ads.internal.zzv.zzf();
            if (woVarZzf.f10239e == null) {
                i70.f5586a.execute(new yh(1, woVarZzf));
            }
            p.e eVarA = new e.d(woVarZzf.f10239e).a();
            Intent intent = eVarA.f14043a;
            intent.setPackage(rj1.e(context));
            intent.setData(uri);
            context.startActivity(intent, eVarA.f14044b);
            return 5;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.E4)).booleanValue()) {
            zzac(context, uri);
            return 9;
        }
        xo xoVar = new xo();
        xoVar.f10652d = new k(xoVar, context, uri);
        Activity activity = (Activity) context;
        if (xoVar.f10650b == null && (strE = rj1.e(activity)) != null) {
            ha2 ha2Var = new ha2(xoVar);
            xoVar.f10651c = ha2Var;
            ha2Var.f14051a = activity.getApplicationContext();
            Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
            if (!TextUtils.isEmpty(strE)) {
                intent2.setPackage(strE);
            }
            activity.bindService(intent2, ha2Var, 33);
        }
        return 5;
    }
}
