package okhttp3;

import hi.d0;
import hi.t;
import hi.x;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class RequestBody$Companion$asRequestBody$1 extends RequestBody {
    @Override // okhttp3.RequestBody
    public final long a() {
        throw null;
    }

    @Override // okhttp3.RequestBody
    public final MediaType b() {
        return null;
    }

    @Override // okhttp3.RequestBody
    public final void c(d0 d0Var) throws IOException {
        t tVarG = x.g(null);
        while (tVarG.y(8192L, d0Var.f13052b) != -1) {
            try {
                d0Var.h();
            } finally {
            }
        }
        tVarG.close();
    }
}
