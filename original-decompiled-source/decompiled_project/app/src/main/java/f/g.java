package f;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class g extends a<Intent, e.a> {
    @Override // f.a
    public final Intent a(Context context, Intent intent) {
        Intent input = intent;
        r.e(input, "input");
        return input;
    }

    @Override // f.a
    public final Object c(Intent intent, int i10) {
        return new e.a(intent, i10);
    }
}
