package okhttp3;

import hi.d0;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class RequestBody$Companion$toRequestBody$2 extends RequestBody {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MediaType f19350b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f19351c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ byte[] f19352d;

    public RequestBody$Companion$toRequestBody$2(MediaType mediaType, int i10, byte[] bArr) {
        this.f19350b = mediaType;
        this.f19351c = i10;
        this.f19352d = bArr;
    }

    @Override // okhttp3.RequestBody
    public final long a() {
        return this.f19351c;
    }

    @Override // okhttp3.RequestBody
    public final MediaType b() {
        return this.f19350b;
    }

    @Override // okhttp3.RequestBody
    public final void c(d0 d0Var) throws IOException {
        if (d0Var.f13053c) {
            throw new IllegalStateException("closed");
        }
        d0Var.f13052b.i0(this.f19351c, this.f19352d);
        d0Var.h();
    }
}
