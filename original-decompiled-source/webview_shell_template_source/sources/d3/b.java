package d3;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class b extends Exception {

    @Deprecated
    public final Status s;

    public b(Status status) {
        int i6 = status.s;
        String str = status.f2399t;
        str = str == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str;
        StringBuilder sb = new StringBuilder(String.valueOf(i6).length() + 2 + String.valueOf(str).length());
        sb.append(i6);
        sb.append(": ");
        sb.append(str);
        super(sb.toString());
        this.s = status;
    }
}
