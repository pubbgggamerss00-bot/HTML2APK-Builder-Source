package p5;

import android.net.Uri;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f21230a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21231b;

    /* renamed from: c, reason: collision with root package name */
    public final String f21232c;

    public i0(Uri uri, String str, String str2) {
        this.f21230a = uri;
        this.f21231b = str;
        this.f21232c = str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
        Uri uri = this.f21230a;
        if (uri != null) {
            sb.append(" uri=");
            sb.append(String.valueOf(uri));
        }
        String str = this.f21231b;
        if (str != null) {
            sb.append(" action=");
            sb.append(str);
        }
        String str2 = this.f21232c;
        if (str2 != null) {
            sb.append(" mimetype=");
            sb.append(str2);
        }
        sb.append(" }");
        String string = sb.toString();
        kotlin.jvm.internal.r.d(string, "toString(...)");
        return string;
    }
}
