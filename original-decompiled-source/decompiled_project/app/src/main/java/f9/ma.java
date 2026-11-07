package f9;

import java.util.Locale;

/* loaded from: classes.dex */
public final /* synthetic */ class ma implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10054a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10055b;

    public /* synthetic */ ma(Object obj, int i10) {
        this.f10054a = i10;
        this.f10055b = obj;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f10054a) {
            case 0:
                eh.l lVar = (eh.l) this.f10055b;
                String it = (String) obj;
                kotlin.jvm.internal.r.e(it, "it");
                String lowerCase = it.toLowerCase(Locale.ROOT);
                kotlin.jvm.internal.r.d(lowerCase, "toLowerCase(...)");
                StringBuilder sb = new StringBuilder();
                int length = lowerCase.length();
                for (int i10 = 0; i10 < length; i10++) {
                    char cCharAt = lowerCase.charAt(i10);
                    if (Character.isLetterOrDigit(cCharAt)) {
                        sb.append(cCharAt);
                    }
                }
                lVar.invoke(sb.toString());
                break;
            default:
                s.b bVar = (s.b) this.f10055b;
                q1.l1 graphicsLayer = (q1.l1) obj;
                kotlin.jvm.internal.r.e(graphicsLayer, "$this$graphicsLayer");
                graphicsLayer.f(((Number) bVar.d()).floatValue());
                break;
        }
        return pg.f0.f21461a;
    }
}
