package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.internal.ads.j00;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: d, reason: collision with root package name */
    public static final x0 f11782d = x0.h(new Object[]{"IABTCF_TCString", "IABGPP_HDR_GppString", "IABGPP_GppSID", "IABUSPrivacy_String"}, 4);

    /* renamed from: a, reason: collision with root package name */
    public final Application f11783a;

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f11784b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f11785c;

    public j(Application application) {
        this.f11783a = application;
        SharedPreferences sharedPreferences = application.getSharedPreferences("__GOOGLE_FUNDING_CHOICE_SDK_INTERNAL__", 0);
        this.f11784b = sharedPreferences;
        this.f11785c = new HashSet(sharedPreferences.getStringSet("written_values", Collections.EMPTY_SET));
    }

    public final HashMap a() {
        String string;
        Set<String> stringSet = this.f11784b.getStringSet("stored_info", a1.A);
        if (stringSet.isEmpty()) {
            stringSet = f11782d;
        }
        HashMap map = new HashMap();
        for (String str : stringSet) {
            Application application = this.f11783a;
            j00 j00VarA = j0.a(application, str);
            if (j00VarA == null) {
                Log.d("UserMessagingPlatform", "Fetching request info: failed for key: ".concat(String.valueOf(str)));
            } else {
                Object obj = application.getSharedPreferences((String) j00VarA.f5891t, 0).getAll().get((String) j00VarA.f5892u);
                if (obj == null) {
                    Log.d("UserMessagingPlatform", "Stored info not exists: ".concat(String.valueOf(str)));
                } else {
                    if (obj instanceof Boolean) {
                        string = true != ((Boolean) obj).booleanValue() ? "0" : "1";
                    } else if (obj instanceof Number) {
                        string = obj.toString();
                    } else if (obj instanceof String) {
                        string = (String) obj;
                    } else {
                        Log.d("UserMessagingPlatform", "Failed to fetch stored info: ".concat(String.valueOf(str)));
                    }
                    map.put(str, string);
                }
            }
        }
        return map;
    }
}
