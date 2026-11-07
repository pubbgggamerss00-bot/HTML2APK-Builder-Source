package okhttp3.internal.http;

import hi.f0;
import hi.i;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

/* loaded from: classes2.dex */
public final class RealResponseBody extends ResponseBody {

    /* renamed from: b, reason: collision with root package name */
    public final String f19539b;

    /* renamed from: c, reason: collision with root package name */
    public final long f19540c;

    /* renamed from: d, reason: collision with root package name */
    public final f0 f19541d;

    public RealResponseBody(String str, long j10, f0 f0Var) {
        this.f19539b = str;
        this.f19540c = j10;
        this.f19541d = f0Var;
    }

    @Override // okhttp3.ResponseBody
    public final long h() {
        return this.f19540c;
    }

    @Override // okhttp3.ResponseBody
    public final MediaType l() {
        String str = this.f19539b;
        if (str == null) {
            return null;
        }
        MediaType.f19273c.getClass();
        try {
            return MediaType.Companion.a(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // okhttp3.ResponseBody
    public final i s0() {
        return this.f19541d;
    }
}
