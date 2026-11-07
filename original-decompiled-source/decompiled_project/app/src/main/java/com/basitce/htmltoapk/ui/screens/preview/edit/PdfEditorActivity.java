package com.basitce.htmltoapk.ui.screens.preview.edit;

import android.os.Bundle;
import androidx.lifecycle.a1;
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import c9.q1;
import c9.s1;
import eh.p;
import k9.g;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.s;
import n8.f1;
import n8.m1;
import pg.f0;
import ph.h;
import x0.j;

/* loaded from: classes.dex */
public final class PdfEditorActivity extends c9.d {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f5823g = 0;

    /* renamed from: e, reason: collision with root package name */
    public m1 f5824e;

    /* renamed from: f, reason: collision with root package name */
    public final y0 f5825f = new y0(h0.a(s1.class), new c(), new b(), new d());

    public static final class a implements p<j, Integer, f0> {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // eh.p
        public final f0 invoke(j jVar, Integer num) {
            j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                PdfEditorActivity pdfEditorActivity = PdfEditorActivity.this;
                m1 m1Var = pdfEditorActivity.f5824e;
                if (m1Var == null) {
                    r.h("settingsRepository");
                    throw null;
                }
                f1 f1Var = m1Var.f18529e;
                k9.a.f16171c.getClass();
                k9.j.a((k9.a) bg.b.a(f1Var, k9.a.f16172d, null, jVar2, 48, 2).getValue(), false, f1.c.b(-1698342775, new com.basitce.htmltoapk.ui.screens.preview.edit.a(pdfEditorActivity), jVar2), jVar2, 384);
            }
            return f0.f21461a;
        }
    }

    public static final class b extends s implements eh.a<z0.c> {
        public b() {
            super(0);
        }

        @Override // eh.a
        public final z0.c invoke() {
            return PdfEditorActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class c extends s implements eh.a<a1> {
        public c() {
            super(0);
        }

        @Override // eh.a
        public final a1 invoke() {
            return PdfEditorActivity.this.getViewModelStore();
        }
    }

    public static final class d extends s implements eh.a<j5.a> {
        public d() {
            super(0);
        }

        @Override // eh.a
        public final j5.a invoke() {
            return PdfEditorActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    @Override // c9.d, b.k, o3.d, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        g.a(this);
        s1 s1Var = (s1) this.f5825f.getValue();
        long longExtra = getIntent().getLongExtra("pdf_edit_project_id", 0L);
        if (!s1Var.f5294z) {
            s1Var.f5294z = true;
            h.c(x0.a(s1Var), null, null, new q1(s1Var, longExtra, null), 3);
        }
        c.g.a(this, new f1.b(-473535893, true, new a()));
    }
}
