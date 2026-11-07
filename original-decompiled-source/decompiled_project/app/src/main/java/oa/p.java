package oa;

import android.os.Bundle;
import android.util.Log;

/* loaded from: classes2.dex */
public final class p extends n<Bundle> {
    @Override // oa.n
    public final void a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(this);
            String strValueOf2 = String.valueOf(bundle2);
            StringBuilder sb = new StringBuilder(strValueOf2.length() + strValueOf.length() + 16);
            sb.append("Finishing ");
            sb.append(strValueOf);
            sb.append(" with ");
            sb.append(strValueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f19099b.setResult(bundle2);
    }
}
