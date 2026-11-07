package com.google.android.gms.ads.internal.util.client;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import c3.h;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.search.SearchAdView;
import com.google.android.gms.internal.ads.aq;
import com.google.android.gms.internal.ads.uj1;
import com.google.android.gms.internal.ads.zn;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzf {
    public static final Handler zza = new uj1(Looper.getMainLooper());
    private static final String zzb = AdView.class.getName();
    private static final String zzc = InterstitialAd.class.getName();
    private static final String zzd = AdManagerAdView.class.getName();
    private static final String zze = AdManagerInterstitialAd.class.getName();
    private static final String zzf = SearchAdView.class.getName();
    private static final String zzg = AdLoader.class.getName();
    private float zzh = -1.0f;

    private final JSONArray zzA(Collection collection) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zzB(jSONArray, it.next());
        }
        return jSONArray;
    }

    private final void zzB(JSONArray jSONArray, Object obj) {
        if (obj instanceof Bundle) {
            jSONArray.put(zzi((Bundle) obj));
            return;
        }
        if (obj instanceof Map) {
            jSONArray.put(zzj((Map) obj));
            return;
        }
        if (obj instanceof Collection) {
            jSONArray.put(zzA((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONArray.put(zzh((Object[]) obj));
        } else {
            jSONArray.put(obj);
        }
    }

    private final void zzC(JSONObject jSONObject, String str, Object obj) throws JSONException {
        if (((Boolean) zzbe.zzc().a(zn.f11446o)).booleanValue()) {
            str = String.valueOf(str);
        }
        if (obj instanceof Bundle) {
            jSONObject.put(str, zzi((Bundle) obj));
            return;
        }
        if (obj instanceof Map) {
            jSONObject.put(str, zzj((Map) obj));
            return;
        }
        if (obj instanceof Collection) {
            jSONObject.put(String.valueOf(str), zzA((Collection) obj));
            return;
        }
        if (obj instanceof Object[]) {
            jSONObject.put(str, zzA(Arrays.asList((Object[]) obj)));
            return;
        }
        int i6 = 0;
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            Integer[] numArr = new Integer[length];
            while (i6 < length) {
                numArr[i6] = Integer.valueOf(iArr[i6]);
                i6++;
            }
            jSONObject.put(str, zzh(numArr));
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length2 = dArr.length;
            Double[] dArr2 = new Double[length2];
            while (i6 < length2) {
                dArr2[i6] = Double.valueOf(dArr[i6]);
                i6++;
            }
            jSONObject.put(str, zzh(dArr2));
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length3 = jArr.length;
            Long[] lArr = new Long[length3];
            while (i6 < length3) {
                lArr[i6] = Long.valueOf(jArr[i6]);
                i6++;
            }
            jSONObject.put(str, zzh(lArr));
            return;
        }
        if (!(obj instanceof boolean[])) {
            jSONObject.put(str, obj);
            return;
        }
        boolean[] zArr = (boolean[]) obj;
        int length4 = zArr.length;
        Boolean[] boolArr = new Boolean[length4];
        while (i6 < length4) {
            boolArr[i6] = Boolean.valueOf(zArr[i6]);
            i6++;
        }
        jSONObject.put(str, zzh(boolArr));
    }

    private static final void zzD(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzs zzsVar, String str, int i6, int i7) {
        if (viewGroup.getChildCount() != 0) {
            return;
        }
        Context context = viewGroup.getContext();
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setText(str);
        textView.setTextColor(i6);
        textView.setBackgroundColor(i7);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(i6);
        int iZzx = zzx(context, 3);
        frameLayout.addView(textView, new FrameLayout.LayoutParams(zzsVar.zzf - iZzx, zzsVar.zzc - iZzx, 17));
        viewGroup.addView(frameLayout, zzsVar.zzf, zzsVar.zzc);
    }

    public static int zza(Context context, int i6) {
        DisplayMetrics displayMetrics;
        Configuration configuration;
        if (context == null) {
            return -1;
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        Resources resources = context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null || (configuration = resources.getConfiguration()) == null) {
            return -1;
        }
        int i7 = configuration.orientation;
        if (i6 == 0) {
            i6 = i7;
        }
        return i6 == i7 ? Math.round(displayMetrics.heightPixels / displayMetrics.density) : Math.round(displayMetrics.widthPixels / displayMetrics.density);
    }

    public static ActivityManager.MemoryInfo zzc(Context context) {
        ActivityManager activityManager;
        if (context == null || (activityManager = (ActivityManager) context.getSystemService("activity")) == null) {
            return null;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        try {
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo;
        } catch (NullPointerException unused) {
            zzo.zzj("Error retrieving the memory information.");
            return memoryInfo;
        }
    }

    public static AdSize zzd(Context context, int i6, int i7, int i8) {
        int iZza = zza(context, i8);
        if (iZza == -1) {
            return AdSize.INVALID;
        }
        return new AdSize(i6, Math.max(Math.min(i6 > 655 ? Math.round((i6 / 728.0f) * 90.0f) : i6 > 632 ? 81 : i6 > 526 ? Math.round((i6 / 468.0f) * 60.0f) : i6 > 432 ? 68 : Math.round((i6 / 320.0f) * 50.0f), Math.min(90, Math.round(iZza * 0.15f))), 50));
    }

    public static String zze() {
        UUID uuidRandomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(uuidRandomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(uuidRandomUUID.getMostSignificantBits()).toByteArray();
        String string = new BigInteger(1, byteArray).toString();
        for (int i6 = 0; i6 < 2; i6++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(byteArray);
                messageDigest.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(messageDigest.digest(), 0, bArr, 0, 8);
                string = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return string;
    }

    public static String zzf(String str) {
        return zzz(str, "MD5");
    }

    public static String zzg(String str) {
        return zzz(str, "SHA-256");
    }

    public static boolean zzo(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith((String) aq.f2821d.c());
    }

    public static final int zzp(DisplayMetrics displayMetrics, int i6) {
        return (int) TypedValue.applyDimension(1, i6, displayMetrics);
    }

    public static final String zzq(StackTraceElement[] stackTraceElementArr, String str) {
        int i6;
        String className;
        int i7 = 0;
        while (true) {
            i6 = i7 + 1;
            if (i6 >= stackTraceElementArr.length) {
                className = null;
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i7];
            String className2 = stackTraceElement.getClassName();
            if ("loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) && (zzb.equalsIgnoreCase(className2) || zzc.equalsIgnoreCase(className2) || zzd.equalsIgnoreCase(className2) || zze.equalsIgnoreCase(className2) || zzf.equalsIgnoreCase(className2) || zzg.equalsIgnoreCase(className2))) {
                break;
            }
            i7 = i6;
        }
        className = stackTraceElementArr[i6].getClassName();
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            StringBuilder sb = new StringBuilder();
            if (stringTokenizer.hasMoreElements()) {
                sb.append(stringTokenizer.nextToken());
                for (int i8 = 2; i8 > 0 && stringTokenizer.hasMoreElements(); i8--) {
                    sb.append(".");
                    sb.append(stringTokenizer.nextToken());
                }
                str = sb.toString();
            }
            if (className != null && !className.contains(str)) {
                return className;
            }
        }
        return null;
    }

    public static final boolean zzr() {
        boolean zBooleanValue = ((Boolean) zzbe.zzc().a(zn.mb)).booleanValue();
        if (Build.VERSION.SDK_INT < 31) {
            return Build.DEVICE.startsWith("generic");
        }
        String str = Build.FINGERPRINT;
        if (str.contains("generic") || str.contains("emulator")) {
            return true;
        }
        return zBooleanValue && Build.HARDWARE.contains("ranchu");
    }

    public static final boolean zzs(Context context, int i6) {
        return h.f2184b.c(context, i6) == 0;
    }

    public static final boolean zzt(Context context) {
        int iC = h.f2184b.c(context, 12451000);
        return iC == 0 || iC == 2;
    }

    public static final boolean zzu() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static final int zzv(DisplayMetrics displayMetrics, int i6) {
        return Math.round(i6 / displayMetrics.density);
    }

    public static final void zzw(Context context, String str, String str2, Bundle bundle, boolean z6, zze zzeVar) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        bundle.putString("os", Build.VERSION.RELEASE);
        bundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
        bundle.putString("appid", applicationContext.getPackageName());
        if (str == null) {
            h.f2184b.getClass();
            str = h.a(context) + ".244410000";
        }
        bundle.putString("js", str);
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps");
        for (String str3 : bundle.keySet()) {
            builderAppendQueryParameter.appendQueryParameter(str3, bundle.getString(str3));
        }
        zzeVar.zza(builderAppendQueryParameter.toString());
    }

    public static final int zzx(Context context, int i6) {
        return zzp(context.getResources().getDisplayMetrics(), i6);
    }

    public static final String zzy(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        String string = contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id");
        if (string == null || zzr()) {
            string = "emulator";
        }
        return zzz(string, "MD5");
    }

    private static String zzz(String str, String str2) throws NoSuchAlgorithmException {
        for (int i6 = 0; i6 < 2; i6++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str2);
                messageDigest.update(str.getBytes());
                return String.format(Locale.US, "%032X", new BigInteger(1, messageDigest.digest()));
            } catch (ArithmeticException unused) {
                return null;
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        return null;
    }

    public final int zzb(Context context, int i6) {
        if (this.zzh < 0.0f) {
            synchronized (this) {
                try {
                    if (this.zzh < 0.0f) {
                        WindowManager windowManager = (WindowManager) context.getSystemService("window");
                        if (windowManager == null) {
                            return 0;
                        }
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        defaultDisplay.getMetrics(displayMetrics);
                        this.zzh = displayMetrics.density;
                    }
                } finally {
                }
            }
        }
        return Math.round(i6 / this.zzh);
    }

    public final JSONArray zzh(Object[] objArr) {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : objArr) {
            zzB(jSONArray, obj);
        }
        return jSONArray;
    }

    public final JSONObject zzi(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            zzC(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    public final JSONObject zzj(Map map) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                zzC(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e6) {
            throw new JSONException("Could not convert map to JSON: ".concat(String.valueOf(e6.getMessage())));
        }
    }

    public final JSONObject zzk(Bundle bundle, JSONObject jSONObject) {
        if (bundle != null) {
            try {
                return zzi(bundle);
            } catch (JSONException e6) {
                zzo.zzh("Error converting Bundle to JSON", e6);
            }
        }
        return null;
    }

    public final void zzl(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzs zzsVar, String str, String str2) {
        if (str2 != null) {
            zzo.zzj(str2);
        }
        zzD(viewGroup, zzsVar, str, -65536, -16777216);
    }

    public final void zzm(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzs zzsVar, String str) {
        zzD(viewGroup, zzsVar, "Ads by Google", -16777216, -1);
    }

    public final void zzn(Context context, String str, String str2, Bundle bundle, boolean z6) {
        zzw(context, str, "gmob-apps", bundle, true, new zze() { // from class: com.google.android.gms.ads.internal.util.client.zzc
            @Override // com.google.android.gms.ads.internal.util.client.zze
            public final zzt zza(String str3) {
                new b(str3).start();
                return zzt.SUCCESS;
            }
        });
    }
}
