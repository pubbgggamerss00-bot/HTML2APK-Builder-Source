package f9;

import com.basitce.htmltoapk.domain.model.ProjectFile;

/* loaded from: classes.dex */
public final /* synthetic */ class e8 implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9492a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9493b;

    public /* synthetic */ e8(Object obj, int i10) {
        this.f9492a = i10;
        this.f9493b = obj;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f9492a) {
            case 0:
                eh.l lVar = (eh.l) this.f9493b;
                String it = (String) obj;
                kotlin.jvm.internal.r.e(it, "it");
                StringBuilder sb = new StringBuilder();
                int length = it.length();
                for (int i10 = 0; i10 < length; i10++) {
                    char cCharAt = it.charAt(i10);
                    if (Character.isDigit(cCharAt)) {
                        sb.append(cCharAt);
                    }
                }
                lVar.invoke(sb.toString());
                break;
            case 1:
                String strG = fg.g((fg) this.f9493b, (ProjectFile) obj);
                if (strG != null) {
                }
                break;
            default:
                s.b bVar = (s.b) this.f9493b;
                q1.l1 graphicsLayer = (q1.l1) obj;
                kotlin.jvm.internal.r.e(graphicsLayer, "$this$graphicsLayer");
                graphicsLayer.f(((Number) bVar.d()).floatValue());
                graphicsLayer.c(graphicsLayer.N0(16) * (1.0f - ((Number) bVar.d()).floatValue()));
                break;
        }
        return pg.f0.f21461a;
    }
}
