package e;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import e.a;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class g extends a<Uri, Boolean> {
    @Override // e.a
    public final Intent a(Context context, Uri uri) {
        Uri uri2 = uri;
        j.e("input", uri2);
        Intent intentPutExtra = new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", uri2);
        j.d("Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)", intentPutExtra);
        return intentPutExtra;
    }

    @Override // e.a
    public final a.C0049a<Boolean> b(Context context, Uri uri) {
        j.e("input", uri);
        return null;
    }

    @Override // e.a
    public final Object c(Intent intent, int i6) {
        return Boolean.valueOf(i6 == -1);
    }
}
