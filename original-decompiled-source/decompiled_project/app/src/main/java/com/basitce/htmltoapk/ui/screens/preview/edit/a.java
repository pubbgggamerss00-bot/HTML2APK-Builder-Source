package com.basitce.htmltoapk.ui.screens.preview.edit;

import b9.n0;
import c9.h;
import c9.r0;
import c9.s1;
import eh.l;
import eh.p;
import pg.f0;
import x0.j;

/* loaded from: classes.dex */
public final class a implements p<j, Integer, f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PdfEditorActivity f5830a;

    public a(PdfEditorActivity pdfEditorActivity) {
        this.f5830a = pdfEditorActivity;
    }

    @Override // eh.p
    public final f0 invoke(j jVar, Integer num) {
        j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            int i10 = PdfEditorActivity.f5823g;
            PdfEditorActivity pdfEditorActivity = this.f5830a;
            s1 s1Var = (s1) pdfEditorActivity.f5825f.getValue();
            jVar2.L(1976201396);
            boolean zL = jVar2.l(pdfEditorActivity);
            Object objG = jVar2.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (zL || objG == c0321a) {
                objG = new n0(pdfEditorActivity, 1);
                jVar2.C(objG);
            }
            eh.a aVar = (eh.a) objG;
            jVar2.B();
            jVar2.L(1976202950);
            boolean zL2 = jVar2.l(pdfEditorActivity);
            Object objG2 = jVar2.g();
            int i11 = 0;
            if (zL2 || objG2 == c0321a) {
                objG2 = new h(pdfEditorActivity, i11);
                jVar2.C(objG2);
            }
            jVar2.B();
            r0.l(s1Var, aVar, (l) objG2, jVar2, 0);
        }
        return f0.f21461a;
    }
}
