package c9;

import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.eac.EACTags;
import org.jf.dexlib2.dexbacked.raw.HeaderItem;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.preview.edit.PdfEditorViewModel$load$1", f = "PdfEditorViewModel.kt", l = {EACTags.HISTORICAL_BYTES, 87, HeaderItem.METHOD_COUNT_OFFSET}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class q1 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public File f5181a;

    /* renamed from: b, reason: collision with root package name */
    public int f5182b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s1 f5183c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f5184d;

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.preview.edit.PdfEditorViewModel$load$1$2", f = "PdfEditorViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ s1 f5185a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s1 s1Var, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f5185a = s1Var;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new a(this.f5185a, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super Boolean> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            pg.q.b(obj);
            List<Integer> list = s1.A;
            return Boolean.valueOf(ah.l.f(new File(this.f5185a.f5270b.getCacheDir(), "pdf_edit")));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(s1 s1Var, long j10, tg.e<? super q1> eVar) {
        super(2, eVar);
        this.f5183c = s1Var;
        this.f5184d = j10;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new q1(this.f5183c, this.f5184d, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((q1) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0086, code lost:
    
        if (r4 != r0) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object byId;
        File file;
        Object objF;
        s1 s1Var = this.f5183c;
        x0.x1 x1Var = s1Var.f5273e;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f5182b;
        Throwable th2 = null;
        try {
            try {
            } catch (Exception e10) {
                if (e10 instanceof CancellationException) {
                    throw e10;
                }
                s1Var.f5274f.setValue(Boolean.TRUE);
            }
            if (i10 == 0) {
                pg.q.b(obj);
                n8.s sVar = s1Var.f5271c;
                long j10 = this.f5184d;
                this.f5182b = 1;
                byId = sVar.f18583a.getById(j10, this);
                if (byId == aVar) {
                }
                return aVar;
            }
            if (i10 == 1) {
                pg.q.b(obj);
                byId = obj;
            } else {
                if (i10 != 2) {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pg.q.b(obj);
                    objF = obj;
                    List list = (List) objF;
                    s1Var.f5292x = list.size();
                    ArrayList arrayList = new ArrayList(qg.p.h(list, 10));
                    int i11 = 0;
                    for (Object obj2 : list) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            Throwable th3 = th2;
                            qg.p.o();
                            throw th3;
                        }
                        pg.n nVar = (pg.n) obj2;
                        float fFloatValue = ((Number) nVar.f21469a).floatValue();
                        float fFloatValue2 = ((Number) nVar.f21470b).floatValue();
                        long j11 = s1Var.f5293y;
                        s1Var.f5293y = j11 + 1;
                        arrayList.add(new b(j11, 0, i11, fFloatValue, fFloatValue2));
                        th2 = th2;
                        i11 = i12;
                    }
                    s1Var.f5276h.setValue(arrayList);
                    return pg.f0.f21461a;
                }
                file = this.f5181a;
                pg.q.b(obj);
                this.f5181a = null;
                this.f5182b = 3;
                objF = s1.f(s1Var, file, this);
            }
            if (byId == null) {
                throw new IllegalArgumentException("Missing project");
            }
            ProjectEntity projectEntity = (ProjectEntity) byId;
            String sourcePath = projectEntity.getSourcePath();
            if (sourcePath == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            File file2 = new File(sourcePath);
            if (!file2.isFile()) {
                throw new IllegalArgumentException("Missing PDF");
            }
            s1Var.f5291w = projectEntity;
            s1Var.f5272d.setValue(projectEntity.getName());
            wh.c cVar = ph.z0.f21632a;
            wh.b bVar = wh.b.f31563c;
            a aVar2 = new a(s1Var, null);
            this.f5181a = file2;
            this.f5182b = 2;
            if (ph.h.e(bVar, aVar2, this) == aVar) {
                return aVar;
            }
            file = file2;
            this.f5181a = null;
            this.f5182b = 3;
            objF = s1.f(s1Var, file, this);
        } finally {
            x1Var.setValue(Boolean.FALSE);
        }
    }
}
