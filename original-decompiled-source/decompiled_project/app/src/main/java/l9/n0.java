package l9;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import p5.e1;

/* loaded from: classes.dex */
public final /* synthetic */ class n0 implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16858a;

    public /* synthetic */ n0(int i10) {
        this.f16858a = i10;
    }

    @Override // eh.l
    public final Object invoke(Object obj) throws UnsupportedEncodingException {
        switch (this.f16858a) {
            case 0:
                String it = (String) obj;
                kotlin.jvm.internal.r.e(it, "it");
                String strEncode = URLEncoder.encode(it, "UTF-8");
                kotlin.jvm.internal.r.d(strEncode, "encode(...)");
                return mh.t.n(strEncode, "+", "%20");
            default:
                e1 popUpTo = (e1) obj;
                kotlin.jvm.internal.r.e(popUpTo, "$this$popUpTo");
                popUpTo.f21207a = true;
                return pg.f0.f21461a;
        }
    }
}
