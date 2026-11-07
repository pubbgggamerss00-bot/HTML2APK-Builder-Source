package okhttp3.internal.http1;

import hi.i;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
public final class HeadersReader {

    /* renamed from: a, reason: collision with root package name */
    public final i f19548a;

    /* renamed from: b, reason: collision with root package name */
    public long f19549b;

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    static {
        new Companion(0);
    }

    public HeadersReader(i source) {
        r.e(source, "source");
        this.f19548a = source;
        this.f19549b = 262144L;
    }
}
