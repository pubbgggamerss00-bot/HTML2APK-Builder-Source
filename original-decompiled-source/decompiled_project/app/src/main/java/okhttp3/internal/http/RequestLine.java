package okhttp3.internal.http;

import kotlin.jvm.internal.r;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class RequestLine {

    /* renamed from: a, reason: collision with root package name */
    public static final RequestLine f19542a = new RequestLine();

    private RequestLine() {
    }

    public static String a(HttpUrl url) {
        r.e(url, "url");
        String strB = url.b();
        String strD = url.d();
        if (strD == null) {
            return strB;
        }
        return strB + '?' + strD;
    }
}
