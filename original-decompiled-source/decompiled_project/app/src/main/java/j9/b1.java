package j9;

import android.net.Uri;
import j9.x1;
import s8.e2;

/* loaded from: classes.dex */
public final class b1 implements eh.a<pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p5.x f15294a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x1.a f15295b;

    public b1(x1.a aVar, p5.x xVar) {
        this.f15294a = xVar;
        this.f15295b = aVar;
    }

    @Override // eh.a
    public final pg.f0 invoke() {
        e2.y yVar = e2.y.f24655c;
        String templateId = this.f15295b.f15636a;
        yVar.getClass();
        kotlin.jvm.internal.r.e(templateId, "templateId");
        p5.x.c("template_detail/" + Uri.encode(templateId), this.f15294a);
        return pg.f0.f21461a;
    }
}
