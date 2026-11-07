package l8;

import eh.l;
import java.io.File;
import kotlin.jvm.internal.r;
import pg.f0;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16764a;

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f16764a) {
            case 0:
                File it = (File) obj;
                r.e(it, "it");
                return Boolean.valueOf(it.isFile());
            default:
                p5.r navArgument = (p5.r) obj;
                r.e(navArgument, "$this$navArgument");
                navArgument.a("chat");
                return f0.f21461a;
        }
    }
}
