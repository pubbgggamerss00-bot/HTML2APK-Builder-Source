package com.basitce.htmltoapk.ui.screens.preview;

import b9.d0;
import b9.e0;
import b9.i;
import b9.j0;
import b9.k;
import b9.l;
import b9.m;
import b9.n;
import b9.o;
import b9.o1;
import b9.s;
import b9.y2;
import com.basitce.htmltoapk.ui.screens.preview.PdfPreviewActivity;
import eh.p;
import kh.e;
import kotlin.jvm.internal.r;
import m9.g0;
import m9.v1;
import pg.f0;
import x0.j;

/* loaded from: classes.dex */
public final class b implements p<j, Integer, f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PdfPreviewActivity f5812a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PdfPreviewActivity.b f5813b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v1 f5814c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f5815d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g0 f5816e;

    public b(PdfPreviewActivity pdfPreviewActivity, PdfPreviewActivity.b bVar, v1 v1Var, boolean z10, g0 g0Var) {
        this.f5812a = pdfPreviewActivity;
        this.f5813b = bVar;
        this.f5814c = v1Var;
        this.f5815d = z10;
        this.f5816e = g0Var;
    }

    @Override // eh.p
    public final f0 invoke(j jVar, Integer num) {
        j jVar2 = jVar;
        int iIntValue = num.intValue();
        String str = this.f5814c.f17967c;
        if ((iIntValue & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            PdfPreviewActivity pdfPreviewActivity = this.f5812a;
            y2 y2Var = pdfPreviewActivity.f5800r;
            boolean z10 = r.a(str, "dark") || (r.a(str, "auto") && this.f5815d);
            jVar2.L(-1807243330);
            boolean zL = jVar2.l(pdfPreviewActivity);
            Object objG = jVar2.g();
            if (zL || objG == j.a.f31715a) {
                b9.g0 g0Var = new b9.g0(0, pdfPreviewActivity, PdfPreviewActivity.class, "thumbnails", "thumbnails()Lcom/basitce/htmltoapk/ui/screens/preview/PdfThumbnails;", 0);
                jVar2.C(g0Var);
                objG = g0Var;
            }
            jVar2.B();
            g0 g0Var2 = this.f5816e;
            o1.e(y2Var, this.f5813b, z10, (eh.a) ((e) objG), new j0(new i(pdfPreviewActivity, g0Var2), new l(pdfPreviewActivity, g0Var2), new androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.e(1, g0Var2, pdfPreviewActivity), new m(0, g0Var2, pdfPreviewActivity), new n(g0Var2, 0), new o(g0Var2, 0), new b9.p(g0Var2, 0), new b9.r(g0Var2, 0), new androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.m(g0Var2, 1), new s(pdfPreviewActivity, 0), new b9.j(pdfPreviewActivity, 0), new d0(0, pdfPreviewActivity, PdfPreviewActivity.class, "edit", "edit()V", 0), new e0(1, pdfPreviewActivity, PdfPreviewActivity.class, "rename", "rename(Ljava/lang/String;)V", 0), new k(pdfPreviewActivity, 0)), jVar2, 0);
        }
        return f0.f21461a;
    }
}
