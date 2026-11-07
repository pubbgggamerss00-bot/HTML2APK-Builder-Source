package okhttp3.internal.cache;

import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes2.dex */
public final class CacheStrategy {

    /* renamed from: a, reason: collision with root package name */
    public final Request f19404a;

    /* renamed from: b, reason: collision with root package name */
    public final Response f19405b;

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public static final class Factory {
    }

    static {
        new Companion(0);
    }

    public CacheStrategy(Request request, Response response) {
        this.f19404a = request;
        this.f19405b = response;
    }
}
