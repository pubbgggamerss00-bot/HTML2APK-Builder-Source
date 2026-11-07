package okhttp3;

import hi.d0;
import hi.g;
import java.io.IOException;
import java.util.ArrayList;
import okhttp3.MediaType;

/* loaded from: classes2.dex */
public final class FormBody extends RequestBody {

    /* renamed from: b, reason: collision with root package name */
    public static final MediaType f19242b;

    public static final class Builder {
        public Builder() {
            new ArrayList();
            new ArrayList();
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    static {
        new Companion(0);
        MediaType.f19273c.getClass();
        f19242b = MediaType.Companion.a("application/x-www-form-urlencoded");
    }

    @Override // okhttp3.RequestBody
    public final long a() {
        new g();
        throw null;
    }

    @Override // okhttp3.RequestBody
    public final MediaType b() {
        return f19242b;
    }

    @Override // okhttp3.RequestBody
    public final void c(d0 d0Var) throws IOException {
        throw null;
    }
}
