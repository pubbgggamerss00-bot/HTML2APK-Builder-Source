package b9;

import android.graphics.pdf.PdfRenderer;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.preview.PdfThumbnails$pageSizes$2", f = "PdfThumbnails.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class c3 extends vg.i implements eh.p<ph.i0, tg.e<? super List<? extends pg.n<? extends Float, ? extends Float>>>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a3 f3773a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(a3 a3Var, tg.e<? super c3> eVar) {
        super(2, eVar);
        this.f3773a = a3Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new c3(this.f3773a, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super List<? extends pg.n<? extends Float, ? extends Float>>> eVar) {
        return ((c3) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) throws FileNotFoundException {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        if (this.f3773a.f3734f) {
            return qg.z.f22752a;
        }
        a3 a3Var = this.f3773a;
        PdfRenderer pdfRenderer = a3Var.f3733e;
        if (pdfRenderer == null) {
            ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(a3Var.f3729a, 268435456);
            a3Var.f3732d = parcelFileDescriptorOpen;
            PdfRenderer pdfRenderer2 = new PdfRenderer(parcelFileDescriptorOpen);
            a3Var.f3733e = pdfRenderer2;
            pdfRenderer = pdfRenderer2;
        }
        jh.g gVarQ = jh.j.q(0, pdfRenderer.getPageCount());
        ArrayList arrayList = new ArrayList(qg.p.h(gVarQ, 10));
        jh.f it = gVarQ.iterator();
        while (it.f15749c) {
            PdfRenderer.Page pageOpenPage = pdfRenderer.openPage(it.nextInt());
            try {
                pg.n nVar = new pg.n(new Float(pageOpenPage.getWidth()), new Float(pageOpenPage.getHeight()));
                ch.a.a(pageOpenPage, null);
                arrayList.add(nVar);
            } finally {
            }
        }
        return arrayList;
    }
}
