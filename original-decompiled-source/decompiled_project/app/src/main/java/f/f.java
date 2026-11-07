package f;

import android.content.Context;
import android.content.Intent;
import f.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.r;
import pg.n;
import qg.a0;
import qg.j0;
import qg.k0;
import qg.o;
import qg.p;

/* loaded from: classes.dex */
public final class f extends a<String[], Map<String, Boolean>> {
    @Override // f.a
    public final Intent a(Context context, String[] strArr) {
        String[] input = strArr;
        r.e(input, "input");
        Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input);
        r.d(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
        return intentPutExtra;
    }

    @Override // f.a
    public final a.C0091a<Map<String, Boolean>> b(Context context, String[] strArr) {
        String[] input = strArr;
        r.e(input, "input");
        if (input.length == 0) {
            return new a.C0091a<>(a0.f22708a);
        }
        for (String str : input) {
            if (p3.b.checkSelfPermission(context, str) != 0) {
                return null;
            }
        }
        int iA = j0.a(input.length);
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (String str2 : input) {
            linkedHashMap.put(str2, Boolean.TRUE);
        }
        return new a.C0091a<>(linkedHashMap);
    }

    @Override // f.a
    public final Object c(Intent intent, int i10) {
        if (i10 == -1 && intent != null) {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra != null && stringArrayExtra != null) {
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i11 : intArrayExtra) {
                    arrayList.add(Boolean.valueOf(i11 == 0));
                }
                ArrayList arrayListS = o.s(stringArrayExtra);
                Iterator it = arrayListS.iterator();
                Iterator it2 = arrayList.iterator();
                ArrayList arrayList2 = new ArrayList(Math.min(p.h(arrayListS, 10), p.h(arrayList, 10)));
                while (it.hasNext() && it2.hasNext()) {
                    arrayList2.add(new n(it.next(), it2.next()));
                }
                return k0.i(arrayList2);
            }
        }
        return a0.f22708a;
    }
}
