package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.ads.j00;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class h implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public final Application f11758a;

    /* renamed from: b, reason: collision with root package name */
    public final j f11759b;

    /* renamed from: c, reason: collision with root package name */
    public final n4 f11760c;

    /* renamed from: d, reason: collision with root package name */
    public final Executor f11761d;

    public h(Application application, j jVar, n4 n4Var, Executor executor) {
        this.f11758a = application;
        this.f11759b = jVar;
        this.f11761d = executor;
        this.f11760c = n4Var;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:73:0x0217. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x030c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0264  */
    @Override // com.google.android.gms.internal.consent_sdk.n0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(String str, JSONObject jSONObject) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        j jVar;
        HashMap map;
        HashMap map2;
        boolean zBooleanValue;
        String str2;
        String str3;
        String str4;
        String str5;
        Integer num;
        Iterator it;
        int iIntValue;
        Object obj;
        int iHashCode = str.hashCode();
        Application application = this.f11758a;
        if (iHashCode == 94746189) {
            if (!str.equals("clear")) {
                return false;
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("keys");
            if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
                Log.d("UserMessagingPlatform", "Action[clear]: wrong args.".concat(String.valueOf(jSONObject.toString())));
                return true;
            }
            HashSet hashSet = new HashSet();
            int length = jSONArrayOptJSONArray.length();
            for (int i6 = 0; i6 < length; i6++) {
                String strOptString = jSONArrayOptJSONArray.optString(i6);
                if (TextUtils.isEmpty(strOptString)) {
                    Log.d("UserMessagingPlatform", "Action[clear]: empty key at index: " + i6);
                } else {
                    hashSet.add(strOptString);
                }
            }
            j0.b(application, hashSet);
            return true;
        }
        if (iHashCode != 113399775 || !str.equals("write")) {
            return false;
        }
        i0 i0Var = new i0(application);
        Iterator<String> itKeys = jSONObject.keys();
        while (true) {
            boolean zHasNext = itKeys.hasNext();
            jVar = this.f11759b;
            map = i0Var.f11776c;
            map2 = i0Var.f11774a;
            if (!zHasNext) {
                break;
            }
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            Log.d("UserMessagingPlatform", "Writing to storage: [" + next + "] " + String.valueOf(objOpt));
            Context context = i0Var.f11775b;
            j00 j00VarA = j0.a(context, next);
            if (j00VarA != null) {
                String str6 = (String) j00VarA.f5892u;
                String str7 = (String) j00VarA.f5891t;
                if (!map.containsKey(str7)) {
                    map.put(str7, context.getSharedPreferences(str7, 0).edit());
                }
                SharedPreferences.Editor editor = (SharedPreferences.Editor) map.get(str7);
                if (objOpt instanceof Integer) {
                    Integer num2 = (Integer) objOpt;
                    editor.putInt(str6, num2.intValue());
                    if (i0.f11773d.contains(str6)) {
                        map2.put(str6, num2);
                    }
                } else if (objOpt instanceof Long) {
                    editor.putLong(str6, ((Long) objOpt).longValue());
                } else if (objOpt instanceof Double) {
                    editor.putFloat(str6, ((Double) objOpt).floatValue());
                } else if (objOpt instanceof Float) {
                    editor.putFloat(str6, ((Float) objOpt).floatValue());
                } else if (objOpt instanceof Boolean) {
                    editor.putBoolean(str6, ((Boolean) objOpt).booleanValue());
                } else if (objOpt instanceof String) {
                    editor.putString(str6, (String) objOpt);
                }
                jVar.f11785c.add(next);
            }
            Log.d("UserMessagingPlatform", "Failed writing key: ".concat(String.valueOf(next)));
        }
        jVar.f11784b.edit().putStringSet("written_values", jVar.f11785c).commit();
        Iterator it2 = map.values().iterator();
        while (it2.hasNext()) {
            ((SharedPreferences.Editor) it2.next()).commit();
        }
        if (map2.size() <= 1) {
            return true;
        }
        n4 n4Var = this.f11760c;
        g gVar = n4Var.f11844a;
        AtomicReference atomicReference = gVar.f11745g;
        AtomicReference atomicReference2 = gVar.f11744f;
        AtomicReference atomicReference3 = gVar.f11743e;
        AtomicReference atomicReference4 = gVar.f11742d;
        AtomicReference atomicReference5 = gVar.f11741c;
        AtomicReference atomicReference6 = gVar.f11740b;
        if (atomicReference.get() != null) {
            zBooleanValue = ((Boolean) atomicReference.get()).booleanValue();
        } else {
            Context context2 = gVar.f11739a;
            if (context2 == null) {
                atomicReference.set(Boolean.FALSE);
            } else {
                try {
                    Class<?> cls = Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
                    atomicReference6.set(cls.getDeclaredMethod("getInstance", Context.class).invoke(null, context2));
                    atomicReference5.set(cls.getDeclaredMethod("setConsent", Map.class));
                    Class<?> cls2 = Class.forName("com.google.firebase.analytics.FirebaseAnalytics$ConsentStatus");
                    Class<?> cls3 = Class.forName("com.google.firebase.analytics.FirebaseAnalytics$ConsentType");
                    Method declaredMethod = cls2.getDeclaredMethod("valueOf", String.class);
                    Method declaredMethod2 = cls3.getDeclaredMethod("valueOf", String.class);
                    atomicReference4.set(declaredMethod);
                    atomicReference3.set(declaredMethod2);
                    atomicReference.set(Boolean.TRUE);
                    zBooleanValue = true;
                } catch (Exception e6) {
                    Log.w("UserMessagingPlatform", "No Firebase class found. ", e6);
                    atomicReference.set(Boolean.FALSE);
                }
            }
            zBooleanValue = false;
        }
        if (zBooleanValue) {
            Context context3 = n4Var.f11845b;
            if (atomicReference2.get() == null) {
                try {
                    atomicReference2.set(j3.d.a(context3).a(128, context3.getPackageName()).metaData);
                } catch (PackageManager.NameNotFoundException | NullPointerException e7) {
                    Log.w("UserMessagingPlatform", "Failed to get metadata. ", e7);
                }
            }
            String str8 = "IABTCF_gdprApplies";
            Integer num3 = (Integer) map2.get("IABTCF_gdprApplies");
            HashMap map3 = new HashMap();
            Iterator it3 = map2.keySet().iterator();
            while (it3.hasNext()) {
                String str9 = (String) it3.next();
                if (!str9.equals(str8)) {
                    switch (str9.hashCode()) {
                        case -1926457382:
                            if (str9.equals("UMP_CoMoAdPersonalizationPurposeConsentStatus")) {
                                str2 = "google_analytics_default_allow_ad_personalization_signals";
                                str3 = str8;
                                str4 = "AD_PERSONALIZATION";
                                iIntValue = ((Integer) map2.get(str9)).intValue();
                                if (iIntValue == -1) {
                                    num = num3;
                                    if (iIntValue != 1) {
                                        it = it3;
                                        if (iIntValue == 2) {
                                            map3.put(str4, "DENIED");
                                        } else if (iIntValue != 4) {
                                            if (iIntValue != 5) {
                                                Log.w("UserMessagingPlatform", "Invalid CoMo consent status: " + iIntValue);
                                            } else if (atomicReference2.get() != null && (obj = ((Bundle) atomicReference2.get()).get(str2)) != null) {
                                                Object obj2 = obj instanceof Boolean ? (Boolean) obj : obj instanceof String ? (String) obj : null;
                                                if (obj2 == null) {
                                                    Log.w("UserMessagingPlatform", "No default metadata");
                                                } else if (obj2 instanceof Boolean) {
                                                    map3.put(str4, true != ((Boolean) obj2).booleanValue() ? "DENIED" : "GRANTED");
                                                } else if ((obj2 instanceof String) && obj2.equals("eu_consent_policy") && ((str4.equals("AD_PERSONALIZATION") || str4.equals("AD_USER_DATA")) && num != null)) {
                                                    map3.put(str4, num.intValue() == 1 ? "DENIED" : "GRANTED");
                                                } else {
                                                    Log.w("UserMessagingPlatform", "Failed to get the default eu_consent_policy value.");
                                                }
                                            }
                                        }
                                        str8 = str3;
                                        num3 = num;
                                        it3 = it;
                                        break;
                                    } else {
                                        map3.put(str4, "GRANTED");
                                        str8 = str3;
                                        num3 = num;
                                        break;
                                    }
                                } else {
                                    num = num3;
                                    it = it3;
                                    str8 = str3;
                                    num3 = num;
                                    it3 = it;
                                }
                            } else {
                                str3 = str8;
                                num = num3;
                                it = it3;
                                str8 = str3;
                                num3 = num;
                                it3 = it;
                            }
                            break;
                        case -142866440:
                            if (!str9.equals("UMP_CoMoAnalyticsStoragePurposeConsentStatus")) {
                                str3 = str8;
                                num = num3;
                                it = it3;
                                str8 = str3;
                                num3 = num;
                                it3 = it;
                                break;
                            } else {
                                str2 = "google_analytics_default_allow_analytics_storage";
                                str5 = "ANALYTICS_STORAGE";
                                str3 = str8;
                                str4 = str5;
                                iIntValue = ((Integer) map2.get(str9)).intValue();
                                if (iIntValue == -1) {
                                }
                            }
                            break;
                        case 1068702385:
                            if (!str9.equals("UMP_CoMoAdStoragePurposeConsentStatus")) {
                                str3 = str8;
                                num = num3;
                                it = it3;
                                str8 = str3;
                                num3 = num;
                                it3 = it;
                                break;
                            } else {
                                str2 = "google_analytics_default_allow_ad_storage";
                                str5 = "AD_STORAGE";
                                str3 = str8;
                                str4 = str5;
                                iIntValue = ((Integer) map2.get(str9)).intValue();
                                if (iIntValue == -1) {
                                }
                            }
                            break;
                        case 1479307131:
                            if (!str9.equals("UMP_CoMoAdUserDataPurposeConsentStatus")) {
                                str3 = str8;
                                num = num3;
                                it = it3;
                                str8 = str3;
                                num3 = num;
                                it3 = it;
                                break;
                            } else {
                                str2 = "google_analytics_default_allow_ad_user_data";
                                str3 = str8;
                                str4 = "AD_USER_DATA";
                                iIntValue = ((Integer) map2.get(str9)).intValue();
                                if (iIntValue == -1) {
                                }
                            }
                            break;
                        default:
                            str3 = str8;
                            num = num3;
                            it = it3;
                            str8 = str3;
                            num3 = num;
                            it3 = it;
                            break;
                    }
                }
            }
            Log.d("UserMessagingPlatform", "Update Firebase: ".concat(map3.toString()));
            HashMap map4 = new HashMap();
            for (String str10 : map3.keySet()) {
                try {
                } catch (Exception e8) {
                    e = e8;
                }
                try {
                    map4.put((Enum) ((Method) atomicReference3.get()).invoke(null, str10), (Enum) ((Method) atomicReference4.get()).invoke(null, map3.get(str10)));
                } catch (Exception e9) {
                    e = e9;
                    Log.w("UserMessagingPlatform", "Failed to invoke the Firebase static method.", e);
                }
            }
            if (atomicReference5.get() != null && !map4.isEmpty()) {
                try {
                    ((Method) atomicReference5.get()).invoke(atomicReference6.get(), map4);
                } catch (Exception e10) {
                    Log.w("UserMessagingPlatform", "Failed to invoke Firebase method. ", e10);
                }
            }
        }
        map2.clear();
        return true;
    }

    @Override // com.google.android.gms.internal.consent_sdk.n0
    public final Executor zza() {
        return this.f11761d;
    }
}
