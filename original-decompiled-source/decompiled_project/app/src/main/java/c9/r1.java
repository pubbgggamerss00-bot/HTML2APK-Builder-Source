package c9;

import android.graphics.pdf.PdfRenderer;
import android.os.ParcelFileDescriptor;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.concurrent.CancellationException;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.preview.edit.PdfEditorViewModel$save$1", f = "PdfEditorViewModel.kt", l = {262, 275}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class r1 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f5259a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s1 f5260b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ProjectEntity f5261c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List<b> f5262d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eh.l<int[], pg.f0> f5263e;

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.preview.edit.PdfEditorViewModel$save$1$1", f = "PdfEditorViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super Path>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ProjectEntity f5264a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s1 f5265b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List<b> f5266c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ProjectEntity projectEntity, s1 s1Var, List<b> list, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f5264a = projectEntity;
            this.f5265b = s1Var;
            this.f5266c = list;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new a(this.f5264a, this.f5265b, this.f5266c, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super Path> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            List<b> list = this.f5266c;
            ug.a aVar = ug.a.f29706a;
            pg.q.b(obj);
            String sourcePath = this.f5264a.getSourcePath();
            if (sourcePath == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            File file = new File(sourcePath);
            File file2 = new File(file.getParentFile(), c2.u.a(".edit_", ".tmp", System.nanoTime()));
            try {
                s1 s1Var = this.f5265b;
                g.h(s1Var.f5270b, qg.x.c0(s1Var.f5289u), list, file2);
                ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(file2, 268435456);
                try {
                    PdfRenderer pdfRenderer = new PdfRenderer(parcelFileDescriptorOpen);
                    try {
                        if (pdfRenderer.getPageCount() != list.size()) {
                            throw new IllegalStateException("Page count mismatch");
                        }
                        pg.f0 f0Var = pg.f0.f21461a;
                        ch.a.a(pdfRenderer, null);
                        ah.c.a(parcelFileDescriptorOpen, null);
                        return Files.move(file2.toPath(), file.toPath(), StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.ATOMIC_MOVE);
                    } finally {
                    }
                } finally {
                }
            } finally {
                file2.delete();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r1(s1 s1Var, ProjectEntity projectEntity, List<b> list, eh.l<? super int[], pg.f0> lVar, tg.e<? super r1> eVar) {
        super(2, eVar);
        this.f5260b = s1Var;
        this.f5261c = projectEntity;
        this.f5262d = list;
        this.f5263e = lVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new r1(this.f5260b, this.f5261c, this.f5262d, this.f5263e, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((r1) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00dd, code lost:
    
        if (r2.c(r8, r84) == r0) goto L22;
     */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f5259a;
        List<b> list = this.f5262d;
        s1 s1Var = this.f5260b;
        try {
            try {
            } catch (Exception e10) {
                if (e10 instanceof CancellationException) {
                    throw e10;
                }
                Integer num = new Integer(R.string.pdf_edit_failed);
                String message = e10.getMessage();
                if (message == null) {
                    message = e10.getClass().getSimpleName();
                }
                s1Var.f5285q.setValue(new pg.n(num, message));
            }
            if (i10 == 0) {
                pg.q.b(obj);
                wh.c cVar = ph.z0.f21632a;
                wh.b bVar = wh.b.f31563c;
                a aVar2 = new a(this.f5261c, s1Var, list, null);
                this.f5259a = 1;
                if (ph.h.e(bVar, aVar2, this) == aVar) {
                }
                return aVar;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
                int i11 = s1Var.f5292x;
                x0.v1 v1Var = s1Var.f5286r;
                int[] iArr = new int[i11];
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    iArr[i13] = -1;
                }
                for (Object obj2 : list) {
                    int i14 = i12 + 1;
                    if (i12 < 0) {
                        qg.p.o();
                        throw null;
                    }
                    b bVar2 = (b) obj2;
                    if (bVar2.f5058b == 0) {
                        int i15 = bVar2.f5059c;
                        if (iArr[i15] < 0) {
                            iArr[i15] = i12;
                        }
                    }
                    i12 = i14;
                }
                s1Var.f5287s.clear();
                s1Var.f5288t.clear();
                v1Var.f(v1Var.g() + 1);
                this.f5263e.invoke(iArr);
                s1Var.p(null);
                return pg.f0.f21461a;
            }
            pg.q.b(obj);
            n8.s sVar = s1Var.f5271c;
            ProjectEntity projectEntityCopy$default = ProjectEntity.copy$default(this.f5261c, 0L, null, null, null, 0, null, 0, 0, null, null, null, null, null, null, null, null, null, false, false, false, false, false, null, null, null, null, false, false, null, false, null, null, null, false, false, false, false, null, 0, null, null, null, false, null, null, null, null, null, false, null, false, false, false, false, false, false, 0, 0, 0, 0, null, false, null, null, null, null, 0L, System.currentTimeMillis(), -1, -1, 7, null);
            this.f5259a = 2;
        } catch (Throwable th2) {
            List<Integer> list2 = s1.A;
            s1Var.p(null);
            throw th2;
        }
    }
}
