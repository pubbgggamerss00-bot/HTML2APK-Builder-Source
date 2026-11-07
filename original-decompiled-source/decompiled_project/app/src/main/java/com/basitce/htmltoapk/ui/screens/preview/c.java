package com.basitce.htmltoapk.ui.screens.preview;

import com.basitce.htmltoapk.ui.screens.preview.PdfPreviewActivity;
import eh.p;
import kotlin.jvm.internal.r;
import m9.g0;
import m9.v1;
import n8.m1;
import pg.f0;
import x0.j;

/* loaded from: classes.dex */
public final class c implements p<j, Integer, f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PdfPreviewActivity f5817a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k9.a f5818b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PdfPreviewActivity.b f5819c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v1 f5820d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f5821e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g0 f5822f;

    public c(PdfPreviewActivity pdfPreviewActivity, k9.a aVar, PdfPreviewActivity.b bVar, v1 v1Var, boolean z10, g0 g0Var) {
        this.f5817a = pdfPreviewActivity;
        this.f5818b = aVar;
        this.f5819c = bVar;
        this.f5820d = v1Var;
        this.f5821e = z10;
        this.f5822f = g0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.p
    public final f0 invoke(j jVar, Integer num) {
        j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            PdfPreviewActivity pdfPreviewActivity = this.f5817a;
            m1 m1Var = pdfPreviewActivity.f5791g;
            if (m1Var == null) {
                r.h("settingsRepository");
                throw null;
            }
            k9.j.a((k9.a) bg.b.a(m1Var.f18529e, this.f5818b, null, jVar2, 0, 2).getValue(), false, f1.c.b(-151302676, new b(pdfPreviewActivity, this.f5819c, this.f5820d, this.f5821e, this.f5822f), jVar2), jVar2, 384);
        }
        return f0.f21461a;
    }
}
