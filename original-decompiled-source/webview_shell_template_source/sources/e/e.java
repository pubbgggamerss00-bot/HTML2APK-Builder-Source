package e;

import android.content.Context;
import android.content.Intent;
import e.a;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e extends a<String, Boolean> {
    @Override // e.a
    public final Intent a(Context context, String str) {
        String str2 = str;
        j.e("input", str2);
        Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{str2});
        j.d("Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)", intentPutExtra);
        return intentPutExtra;
    }

    @Override // e.a
    public final a.C0049a<Boolean> b(Context context, String str) {
        String str2 = str;
        j.e("input", str2);
        if (k0.a.a(context, str2) == 0) {
            return new a.C0049a<>(Boolean.TRUE);
        }
        return null;
    }

    @Override // e.a
    public final Object c(Intent intent, int i6) {
        if (intent == null || i6 != -1) {
            return Boolean.FALSE;
        }
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        boolean z6 = false;
        if (intArrayExtra != null) {
            int length = intArrayExtra.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    break;
                }
                if (intArrayExtra[i7] == 0) {
                    z6 = true;
                    break;
                }
                i7++;
            }
        }
        return Boolean.valueOf(z6);
    }
}
