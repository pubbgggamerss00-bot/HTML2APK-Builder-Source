package okhttp3;

import hi.d0;
import hi.j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.jvm.internal.r;
import okhttp3.MediaType;

/* loaded from: classes2.dex */
public final class MultipartBody extends RequestBody {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f19278b = 0;

    public static final class Builder {
        public Builder() {
            String string = UUID.randomUUID().toString();
            r.d(string, "randomUUID().toString()");
            j jVar = j.f13075d;
            j.a.b(string);
            int i10 = MultipartBody.f19278b;
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

    public static final class Part {

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
    }

    static {
        new Companion(0);
        MediaType.f19273c.getClass();
        MediaType.Companion.a("multipart/mixed");
        MediaType.Companion.a("multipart/alternative");
        MediaType.Companion.a("multipart/digest");
        MediaType.Companion.a("multipart/parallel");
        MediaType.Companion.a("multipart/form-data");
    }

    @Override // okhttp3.RequestBody
    public final long a() throws IOException {
        throw null;
    }

    @Override // okhttp3.RequestBody
    public final MediaType b() {
        return null;
    }

    @Override // okhttp3.RequestBody
    public final void c(d0 d0Var) throws IOException {
        throw null;
    }
}
