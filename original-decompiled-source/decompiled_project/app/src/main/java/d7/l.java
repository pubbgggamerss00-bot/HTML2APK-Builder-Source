package d7;

import android.net.NetworkRequest;
import android.util.Log;
import t6.s;

/* loaded from: classes.dex */
public final class l {
    public static o a(int[] iArr, int[] iArr2) {
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i10 : iArr) {
            try {
                builder.addCapability(i10);
            } catch (IllegalArgumentException e10) {
                t6.s sVarD = t6.s.d();
                String str = o.f7390b;
                String str2 = o.f7390b;
                String str3 = "Ignoring adding capability '" + i10 + '\'';
                if (((s.a) sVarD).f28051c <= 5) {
                    Log.w(str2, str3, e10);
                }
            }
        }
        for (int i11 : iArr2) {
            builder.addTransportType(i11);
        }
        NetworkRequest networkRequestBuild = builder.build();
        kotlin.jvm.internal.r.d(networkRequestBuild, "networkRequest.build()");
        return new o(networkRequestBuild);
    }
}
