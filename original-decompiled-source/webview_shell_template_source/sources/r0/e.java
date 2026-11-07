package r0;

import android.util.Base64;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f14225a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14226b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14227c;

    /* renamed from: d, reason: collision with root package name */
    public final List<List<byte[]>> f14228d;

    /* renamed from: e, reason: collision with root package name */
    public final String f14229e;

    public e(String str, String str2, String str3, List<List<byte[]>> list) {
        str.getClass();
        this.f14225a = str;
        str2.getClass();
        this.f14226b = str2;
        this.f14227c = str3;
        list.getClass();
        this.f14228d = list;
        this.f14229e = str + "-" + str2 + "-" + str3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f14225a + ", mProviderPackage: " + this.f14226b + ", mQuery: " + this.f14227c + ", mCertificates:");
        int i6 = 0;
        while (true) {
            List<List<byte[]>> list = this.f14228d;
            if (i6 >= list.size()) {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
            sb.append(" [");
            List<byte[]> list2 = list.get(i6);
            for (int i7 = 0; i7 < list2.size(); i7++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list2.get(i7), 0));
                sb.append("\"");
            }
            sb.append(" ]");
            i6++;
        }
    }
}
