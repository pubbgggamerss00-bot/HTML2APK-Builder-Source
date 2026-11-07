package okhttp3;

import java.util.List;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
public interface CookieJar {

    /* renamed from: a, reason: collision with root package name */
    public static final CookieJar f19232a;

    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f19233a = 0;

        public static final class NoCookies implements CookieJar {
            @Override // okhttp3.CookieJar
            public final void a(HttpUrl url, List<Cookie> list) {
                r.e(url, "url");
            }

            @Override // okhttp3.CookieJar
            public final void b(HttpUrl url) {
                r.e(url, "url");
            }
        }

        static {
            new Companion();
        }

        private Companion() {
        }
    }

    static {
        int i10 = Companion.f19233a;
        f19232a = new Companion.NoCookies();
    }

    void a(HttpUrl httpUrl, List<Cookie> list);

    void b(HttpUrl httpUrl);
}
