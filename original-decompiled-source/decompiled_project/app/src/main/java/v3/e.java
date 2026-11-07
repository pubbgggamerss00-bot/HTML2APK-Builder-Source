package v3;

import android.util.Base64;
import java.util.List;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f30568a;

    /* renamed from: b, reason: collision with root package name */
    public final String f30569b;

    /* renamed from: c, reason: collision with root package name */
    public final String f30570c;

    /* renamed from: d, reason: collision with root package name */
    public final List<List<byte[]>> f30571d;

    /* renamed from: e, reason: collision with root package name */
    public final String f30572e;

    /* renamed from: f, reason: collision with root package name */
    public final String f30573f;

    /* renamed from: g, reason: collision with root package name */
    public final String f30574g;

    public e() {
        throw null;
    }

    public e(String str, String str2, String str3, List<List<byte[]>> list, String str4, String str5) {
        str.getClass();
        this.f30568a = str;
        str2.getClass();
        this.f30569b = str2;
        this.f30570c = str3;
        list.getClass();
        this.f30571d = list;
        this.f30572e = str4;
        this.f30573f = str5;
        this.f30574g = str + "-" + str2 + "-" + str3 + "-" + str4 + "-" + str5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f30568a + ", mProviderPackage: " + this.f30569b + ", mQuery: " + this.f30570c + ", mSystemFont: " + this.f30572e + ", mVariationSettings: " + this.f30573f + ", mCertificates:");
        int i10 = 0;
        while (true) {
            List<List<byte[]>> list = this.f30571d;
            if (i10 >= list.size()) {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
            sb.append(" [");
            List<byte[]> list2 = list.get(i10);
            for (int i11 = 0; i11 < list2.size(); i11++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list2.get(i11), 0));
                sb.append("\"");
            }
            sb.append(" ]");
            i10++;
        }
    }
}
