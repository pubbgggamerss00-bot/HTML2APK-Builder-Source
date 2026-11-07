package com.htmltoapk.template;

import java.io.File;
import java.io.IOException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements p5.a {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f12590t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f12591u;

    public /* synthetic */ o(int i6, Object obj, Object obj2) {
        this.s = i6;
        this.f12590t = obj;
        this.f12591u = obj2;
    }

    @Override // p5.a
    public final Object a() throws IOException {
        switch (this.s) {
            case 0:
                return AdMobBridge.flushLoads$lambda$17$lambda$16((AdMobBridge) this.f12590t, (String) this.f12591u);
            default:
                w2.t tVar = (w2.t) this.f12590t;
                t0 t0Var = (t0) this.f12591u;
                File fileCreateTempFile = File.createTempFile("pdf_document_", ".pdf", tVar.getContext().getCacheDir());
                tVar.J = fileCreateTempFile;
                kotlin.jvm.internal.j.b(fileCreateTempFile);
                tVar.c(t0Var, fileCreateTempFile);
                return fileCreateTempFile;
        }
    }
}
