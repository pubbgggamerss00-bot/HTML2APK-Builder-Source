package kotlinx.serialization.json;

import di.o0;
import java.util.Map;
import p5.k0;

/* loaded from: classes2.dex */
public final /* synthetic */ class u implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16456a;

    public /* synthetic */ u(int i10) {
        this.f16456a = i10;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f16456a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                kotlin.jvm.internal.r.e(entry, "<destruct>");
                String str = (String) entry.getKey();
                h hVar = (h) entry.getValue();
                StringBuilder sb = new StringBuilder();
                o0.a(sb, str);
                sb.append(':');
                sb.append(hVar);
                return sb.toString();
            default:
                k0 destination = (k0) obj;
                kotlin.jvm.internal.r.e(destination, "destination");
                p5.o0 o0Var = destination.f21236c;
                if (o0Var == null || o0Var.f21253f.f24519c != destination.f21235b.f24511d) {
                    return null;
                }
                return o0Var;
        }
    }
}
