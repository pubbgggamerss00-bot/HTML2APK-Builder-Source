package ra;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.api.internal.n;
import com.google.android.gms.common.internal.u;

/* loaded from: classes2.dex */
public final class c extends a.AbstractC0063a {
    @Override // com.google.android.gms.common.api.a.AbstractC0063a
    public final /* synthetic */ a.f buildClient(Context context, Looper looper, com.google.android.gms.common.internal.d dVar, Object obj, f fVar, n nVar) {
        return new e(context, looper, dVar, (u) obj, fVar, nVar);
    }
}
