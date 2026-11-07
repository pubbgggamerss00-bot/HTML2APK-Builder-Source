package e;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import e.a;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c extends a<String[], Uri> {
    @Override // e.a
    public final Intent a(Context context, String[] strArr) {
        String[] strArr2 = strArr;
        j.e("input", strArr2);
        Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", strArr2).setType("*/*");
        j.d("Intent(Intent.ACTION_OPE…          .setType(\"*/*\")", type);
        return type;
    }

    @Override // e.a
    public final a.C0049a<Uri> b(Context context, String[] strArr) {
        j.e("input", strArr);
        return null;
    }

    @Override // e.a
    public final Object c(Intent intent, int i6) {
        if (i6 != -1) {
            intent = null;
        }
        if (intent != null) {
            return intent.getData();
        }
        return null;
    }
}
