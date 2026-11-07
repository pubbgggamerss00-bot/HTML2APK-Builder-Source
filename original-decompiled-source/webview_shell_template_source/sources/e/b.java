package e;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import e.a;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b extends a<String, Uri> {

    /* renamed from: a, reason: collision with root package name */
    public final String f12748a;

    public b(String str) {
        this.f12748a = str;
    }

    @Override // e.a
    public final Intent a(Context context, String str) {
        String str2 = str;
        j.e("input", str2);
        Intent intentPutExtra = new Intent("android.intent.action.CREATE_DOCUMENT").setType(this.f12748a).putExtra("android.intent.extra.TITLE", str2);
        j.d("Intent(Intent.ACTION_CRE…ntent.EXTRA_TITLE, input)", intentPutExtra);
        return intentPutExtra;
    }

    @Override // e.a
    public final a.C0049a<Uri> b(Context context, String str) {
        j.e("input", str);
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
