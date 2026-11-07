package f8;

import com.basitce.htmltoapk.MainActivity;
import com.basitce.htmltoapk.ui.crop.CropActivity;
import com.basitce.htmltoapk.ui.screens.preview.PdfPreviewActivity;
import com.basitce.htmltoapk.ui.screens.preview.edit.PdfEditorActivity;
import ig.a;
import nc.s;

/* loaded from: classes.dex */
public final class b extends j {

    /* renamed from: a, reason: collision with root package name */
    public final e f8872a;

    /* renamed from: b, reason: collision with root package name */
    public final d f8873b;

    public b(e eVar, d dVar) {
        this.f8872a = eVar;
        this.f8873b = dVar;
    }

    @Override // ig.a.InterfaceC0137a
    public final a.b a() {
        return new a.b(b(), new f(this.f8872a, this.f8873b));
    }

    @Override // ig.b.c
    public final ng.b b() {
        nc.g.b(17, "expectedSize");
        s.a aVar = new s.a(17);
        Boolean bool = Boolean.TRUE;
        aVar.b("g8.u", bool);
        aVar.b("t8.q0", bool);
        aVar.b("t8.m3", bool);
        aVar.b("e9.s0", bool);
        aVar.b("u8.d1", bool);
        aVar.b("a9.v", bool);
        aVar.b("f9.g", bool);
        aVar.b("x8.j6", bool);
        aVar.b("h9.x", bool);
        aVar.b("z8.e0", bool);
        aVar.b("c9.s1", bool);
        aVar.b("a9.b2", bool);
        aVar.b("f9.fg", bool);
        aVar.b("h9.b4", bool);
        aVar.b("g9.y", bool);
        aVar.b("i9.r", bool);
        aVar.b("j9.x1", bool);
        return new ng.b(aVar.a());
    }

    @Override // r8.c
    public final void c(CropActivity cropActivity) {
        cropActivity.f5746e = this.f8872a.f8880c.get();
    }

    @Override // f8.t
    public final void d(MainActivity mainActivity) {
        cg.a<j8.a> aVar;
        cg.a<h8.a> aVar2;
        e eVar = this.f8872a;
        mainActivity.settingsRepository = eVar.f8880c.get();
        mainActivity.billingManager = eVar.f8881d.get();
        ng.c<j8.a> cVar = eVar.f8883f;
        if (cVar instanceof cg.a) {
            aVar = (cg.a) cVar;
        } else {
            cVar.getClass();
            aVar = new ng.a(cVar);
        }
        mainActivity.creditsRepository = aVar;
        ng.c<h8.a> cVar2 = eVar.f8889l;
        if (cVar2 instanceof cg.a) {
            aVar2 = (cg.a) cVar2;
        } else {
            cVar2.getClass();
            aVar2 = new ng.a(cVar2);
        }
        mainActivity.aiBackgroundTurns = aVar2;
    }

    @Override // b9.i0
    public final void e(PdfPreviewActivity pdfPreviewActivity) {
        e eVar = this.f8872a;
        pdfPreviewActivity.f5789e = eVar.f8890m.get();
        pdfPreviewActivity.f5790f = eVar.f8886i.get();
        pdfPreviewActivity.f5791g = eVar.f8880c.get();
    }

    @Override // c9.i
    public final void f(PdfEditorActivity pdfEditorActivity) {
        pdfEditorActivity.f5824e = this.f8872a.f8880c.get();
    }

    @Override // ig.b.c
    public final f g() {
        return new f(this.f8872a, this.f8873b);
    }
}
