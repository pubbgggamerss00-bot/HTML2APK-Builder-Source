package com.google.android.gms.internal.consent_sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.ads.j00;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class j0 {
    public static j00 a(Context context, String str) {
        String strConcat;
        String str2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("/", -1);
        int length = strArrSplit.length;
        if (length == 1) {
            String strValueOf = String.valueOf(context.getPackageName());
            str2 = strArrSplit[0];
            strConcat = strValueOf.concat("_preferences");
        } else {
            if (length != 2) {
                return null;
            }
            strConcat = strArrSplit[0];
            str2 = strArrSplit[1];
        }
        if (TextUtils.isEmpty(strConcat) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return new j00(9, strConcat, str2);
    }

    public static void b(Context context, HashSet hashSet) {
        HashMap map;
        i0 i0Var = new i0(context);
        Iterator it = hashSet.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            map = i0Var.f11776c;
            if (!zHasNext) {
                break;
            }
            String str = (String) it.next();
            j00 j00VarA = a(context, str);
            if (j00VarA == null) {
                Log.d("UserMessagingPlatform", "clearKeys: unable to process key: ".concat(String.valueOf(str)));
            } else {
                String str2 = (String) j00VarA.f5891t;
                if (!map.containsKey(str2)) {
                    map.put(str2, i0Var.f11775b.getSharedPreferences(str2, 0).edit());
                }
                ((SharedPreferences.Editor) map.get(str2)).remove((String) j00VarA.f5892u);
            }
        }
        Iterator it2 = map.values().iterator();
        while (it2.hasNext()) {
            ((SharedPreferences.Editor) it2.next()).commit();
        }
    }
}
