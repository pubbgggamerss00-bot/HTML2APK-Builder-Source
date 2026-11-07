package b9;

import android.net.Uri;
import f9.cg;
import f9.fg;
import java.io.File;

/* loaded from: classes.dex */
public final /* synthetic */ class e4 implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3817a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3818b;

    public /* synthetic */ e4(Object obj, int i10) {
        this.f3817a = i10;
        this.f3818b = obj;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        int i10 = this.f3817a;
        Object obj2 = this.f3818b;
        switch (i10) {
            case 0:
                File it = (File) obj;
                kotlin.jvm.internal.r.e(it, "it");
                break;
            case 1:
                fg fgVar = (fg) obj2;
                Uri uri = (Uri) obj;
                if (uri != null) {
                    mh.k kVar = fg.X0;
                    fgVar.t(uri, new cg());
                }
                break;
            default:
                ((eh.l) obj2).invoke(Integer.valueOf((int) ((Float) obj).floatValue()));
                break;
        }
        return pg.f0.f21461a;
    }
}
