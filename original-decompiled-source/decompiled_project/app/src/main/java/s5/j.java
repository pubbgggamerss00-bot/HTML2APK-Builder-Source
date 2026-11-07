package s5;

import java.io.File;
import p5.w0;
import pg.f0;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24473a;

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f24473a) {
            case 0:
                w0 navOptions = (w0) obj;
                kotlin.jvm.internal.r.e(navOptions, "$this$navOptions");
                navOptions.f21298c = true;
                return f0.f21461a;
            default:
                String absolutePath = ((File) obj).getAbsolutePath();
                kotlin.jvm.internal.r.d(absolutePath, "getAbsolutePath(...)");
                return absolutePath;
        }
    }
}
