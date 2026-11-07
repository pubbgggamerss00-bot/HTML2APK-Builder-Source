package x2;

import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
public final class k {
    public static final i a(Context context) {
        a aVar = new a();
        context.getApplicationContext();
        return new i(aVar, new b(Build.VERSION.SDK_INT >= 31 ? q.f32038a.a(context) : 0));
    }
}
