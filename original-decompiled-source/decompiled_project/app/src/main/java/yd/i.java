package yd;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class i implements vd.g {

    /* renamed from: a, reason: collision with root package name */
    public boolean f34400a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f34401b = false;

    /* renamed from: c, reason: collision with root package name */
    public vd.c f34402c;

    /* renamed from: d, reason: collision with root package name */
    public final f f34403d;

    public i(f fVar) {
        this.f34403d = fVar;
    }

    @Override // vd.g
    public final vd.g add(String str) throws IOException {
        if (this.f34400a) {
            throw new vd.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f34400a = true;
        this.f34403d.d(this.f34402c, str, this.f34401b);
        return this;
    }

    @Override // vd.g
    public final vd.g c(boolean z10) throws IOException {
        if (this.f34400a) {
            throw new vd.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f34400a = true;
        this.f34403d.c(this.f34402c, z10 ? 1 : 0, this.f34401b);
        return this;
    }
}
