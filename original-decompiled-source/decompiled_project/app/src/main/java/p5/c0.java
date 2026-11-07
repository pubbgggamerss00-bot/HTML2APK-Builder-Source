package p5;

import android.net.Uri;
import java.util.ArrayList;
import t8.v2;
import x0.n1;

/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21195a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21196b;

    public /* synthetic */ c0(Object obj, int i10) {
        this.f21195a = i10;
        this.f21196b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f21195a) {
            case 0:
                String str = ((h0) this.f21196b).f21216a;
                Uri uri = Uri.parse(str);
                kotlin.jvm.internal.r.d(uri, "parse(...)");
                if (uri.getFragment() == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                Uri uri2 = Uri.parse(str);
                kotlin.jvm.internal.r.d(uri2, "parse(...)");
                String fragment = uri2.getFragment();
                StringBuilder sb = new StringBuilder();
                kotlin.jvm.internal.r.b(fragment);
                h0.a(fragment, arrayList, sb);
                return new pg.n(arrayList, sb.toString());
            default:
                v2.b((n1) this.f21196b, false);
                return pg.f0.f21461a;
        }
    }
}
