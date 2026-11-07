package f9;

import java.io.File;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.ProjectEditorViewModel$clearProjectFolder$1", f = "ProjectEditorViewModel.kt", l = {957, 958}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class gg extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f9722a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fg f9723b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f9724c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ File f9725d;

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.ProjectEditorViewModel$clearProjectFolder$1$2", f = "ProjectEditorViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ File f9726a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(File file, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f9726a = file;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new a(this.f9726a, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            pg.q.b(obj);
            ah.l.f(this.f9726a);
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gg(fg fgVar, boolean z10, File file, tg.e<? super gg> eVar) {
        super(2, eVar);
        this.f9723b = fgVar;
        this.f9724c = z10;
        this.f9725d = file;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new gg(this.f9723b, this.f9724c, this.f9725d, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((gg) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        if (ph.h.e(r6, r1, r5) == r0) goto L17;
     */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f9722a;
        if (i10 == 0) {
            pg.q.b(obj);
            com.basitce.htmltoapk.data.apkgenerator.signer.a aVar2 = new com.basitce.htmltoapk.data.apkgenerator.signer.a(1);
            this.f9722a = 1;
            mh.k kVar = fg.X0;
            if (this.f9723b.G(aVar2, this) != aVar) {
            }
            return aVar;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
            return pg.f0.f21461a;
        }
        pg.q.b(obj);
        if (this.f9724c) {
            wh.c cVar = ph.z0.f21632a;
            wh.b bVar = wh.b.f31563c;
            a aVar3 = new a(this.f9725d, null);
            this.f9722a = 2;
        }
        return pg.f0.f21461a;
    }
}
