package p8;

import eh.l;
import java.io.File;
import java.util.Set;
import kotlin.jvm.internal.r;
import pg.f0;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21353a;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    @Override // eh.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean z10;
        switch (this.f21353a) {
            case 0:
                File it = (File) obj;
                r.e(it, "it");
                if (it.isFile()) {
                    Set<String> set = c.f21342a;
                    String name = it.getName();
                    r.d(name, "getName(...)");
                    z10 = c.b(name) && it.length() <= 4194304;
                }
                return Boolean.valueOf(z10);
            default:
                ((Long) obj).longValue();
                return f0.f21461a;
        }
    }
}
