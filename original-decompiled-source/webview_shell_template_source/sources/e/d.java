package e;

import android.content.Context;
import android.content.Intent;
import e.a;
import e5.m;
import e5.t;
import e5.w;
import e5.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d extends a<String[], Map<String, Boolean>> {
    @Override // e.a
    public final Intent a(Context context, String[] strArr) {
        String[] strArr2 = strArr;
        j.e("input", strArr2);
        Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr2);
        j.d("Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)", intentPutExtra);
        return intentPutExtra;
    }

    @Override // e.a
    public final a.C0049a<Map<String, Boolean>> b(Context context, String[] strArr) {
        String[] strArr2 = strArr;
        j.e("input", strArr2);
        if (strArr2.length == 0) {
            return new a.C0049a<>(t.s);
        }
        for (String str : strArr2) {
            if (k0.a.a(context, str) != 0) {
                return null;
            }
        }
        int i6 = w.i(strArr2.length);
        if (i6 < 16) {
            i6 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(i6);
        for (String str2 : strArr2) {
            linkedHashMap.put(str2, Boolean.TRUE);
        }
        return new a.C0049a<>(linkedHashMap);
    }

    @Override // e.a
    public final Object c(Intent intent, int i6) {
        if (i6 == -1 && intent != null) {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra != null && stringArrayExtra != null) {
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i7 : intArrayExtra) {
                    arrayList.add(Boolean.valueOf(i7 == 0));
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str : stringArrayExtra) {
                    if (str != null) {
                        arrayList2.add(str);
                    }
                }
                Iterator it = arrayList2.iterator();
                Iterator it2 = arrayList.iterator();
                ArrayList arrayList3 = new ArrayList(Math.min(m.d(arrayList2), m.d(arrayList)));
                while (it.hasNext() && it2.hasNext()) {
                    arrayList3.add(new d5.c(it.next(), it2.next()));
                }
                return x.k(arrayList3);
            }
        }
        return t.s;
    }
}
