package f;

import android.content.Context;
import android.content.Intent;
import e.k;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class h extends a<k, e.a> {
    @Override // f.a
    public final Intent a(Context context, k kVar) {
        k input = kVar;
        r.e(input, "input");
        Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", input);
        r.d(intentPutExtra, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
        return intentPutExtra;
    }

    @Override // f.a
    public final Object c(Intent intent, int i10) {
        return new e.a(intent, i10);
    }
}
