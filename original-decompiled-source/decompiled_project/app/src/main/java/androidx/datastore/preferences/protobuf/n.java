package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class n implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public final m f2101a;

    public n(m mVar) {
        Charset charset = d0.f2005a;
        this.f2101a = mVar;
        mVar.f2087a = this;
    }

    public final void a(int i10, Object obj, o1 o1Var) throws IOException {
        m mVar = this.f2101a;
        mVar.B(i10, 3);
        o1Var.c((MessageLite) obj, mVar.f2087a);
        mVar.B(i10, 4);
    }

    public final void b(int i10, Object obj) throws IOException {
        boolean z10 = obj instanceof j;
        m mVar = this.f2101a;
        if (z10) {
            mVar.y(i10, (j) obj);
        } else {
            mVar.x(i10, (MessageLite) obj);
        }
    }
}
