package f9;

import com.basitce.htmltoapk.domain.model.WebViewSettings;
import com.google.protobuf.DescriptorProtos;

/* loaded from: classes.dex */
public final /* synthetic */ class sd implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10509a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10510b;

    public /* synthetic */ sd(Object obj, int i10) {
        this.f10509a = i10;
        this.f10510b = obj;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        int i10 = this.f10509a;
        Object obj2 = this.f10510b;
        switch (i10) {
            case 0:
                WebViewSettings it = (WebViewSettings) obj;
                kotlin.jvm.internal.r.e(it, "it");
                sh.z0 z0Var = ((fg) obj2).W0;
                z0Var.getClass();
                z0Var.j(null, it);
                break;
            default:
                String it2 = (String) obj;
                kotlin.jvm.internal.r.e(it2, "it");
                String strB0 = mh.y.b0(DescriptorProtos.Edition.EDITION_2023_VALUE, it2);
                mh.k kVar = t8.v2.f28495e;
                ((x0.n1) obj2).setValue(strB0);
                break;
        }
        return pg.f0.f21461a;
    }
}
