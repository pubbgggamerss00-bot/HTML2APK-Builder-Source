package f9;

import java.io.File;

/* loaded from: classes.dex */
public final /* synthetic */ class dg implements eh.l {
    @Override // eh.l
    public final Object invoke(Object obj) {
        File it = (File) obj;
        mh.k kVar = fg.X0;
        kotlin.jvm.internal.r.e(it, "it");
        return Boolean.valueOf(it.isFile());
    }
}
