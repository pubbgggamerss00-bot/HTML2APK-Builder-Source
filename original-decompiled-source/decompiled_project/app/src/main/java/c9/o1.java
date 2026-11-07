package c9;

import android.net.Uri;
import com.basitce.htmltoapk.Hilt_HtmlToApkApplication;
import com.basitce.htmltoapk.R;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CancellationException;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.preview.edit.PdfEditorViewModel$addPdf$1", f = "PdfEditorViewModel.kt", l = {209, 212}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class o1 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f5154a;

    /* renamed from: b, reason: collision with root package name */
    public int f5155b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s1 f5156c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Uri f5157d;

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.preview.edit.PdfEditorViewModel$addPdf$1$file$1", f = "PdfEditorViewModel.kt", l = {210}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super File>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f5158a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s1 f5159b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Uri f5160c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f5161d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s1 s1Var, Uri uri, int i10, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f5159b = s1Var;
            this.f5160c = uri;
            this.f5161d = i10;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new a(this.f5159b, this.f5160c, this.f5161d, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super File> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) throws IOException {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f5158a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
                return obj;
            }
            pg.q.b(obj);
            s1 s1Var = this.f5159b;
            Hilt_HtmlToApkApplication hilt_HtmlToApkApplication = s1Var.f5270b;
            File file = new File(new File(s1Var.f5270b.getCacheDir(), "pdf_edit"), j2.y.a(this.f5161d, "source_"));
            this.f5158a = 1;
            File fileA = l9.e0.a(hilt_HtmlToApkApplication, this.f5160c, file, this);
            return fileA == aVar ? aVar : fileA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(s1 s1Var, Uri uri, tg.e<? super o1> eVar) {
        super(2, eVar);
        this.f5156c = s1Var;
        this.f5157d = uri;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new o1(this.f5156c, this.f5157d, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((o1) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075 A[Catch: all -> 0x001a, Exception -> 0x001d, TryCatch #0 {Exception -> 0x001d, blocks: (B:7:0x0013, B:26:0x005d, B:27:0x006f, B:29:0x0075, B:31:0x007d, B:32:0x00a1, B:33:0x00a4, B:34:0x00a5, B:36:0x00c5, B:37:0x00d8, B:16:0x002a, B:22:0x004f, B:19:0x0033), top: B:51:0x000b, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c5 A[Catch: all -> 0x001a, Exception -> 0x001d, LOOP:1: B:35:0x00c3->B:36:0x00c5, LOOP_END, TryCatch #0 {Exception -> 0x001d, blocks: (B:7:0x0013, B:26:0x005d, B:27:0x006f, B:29:0x0075, B:31:0x007d, B:32:0x00a1, B:33:0x00a4, B:34:0x00a5, B:36:0x00c5, B:37:0x00d8, B:16:0x002a, B:22:0x004f, B:19:0x0033), top: B:51:0x000b, outer: #1 }] */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int size;
        Object objE;
        Object objF;
        int i10;
        int size2;
        int i11;
        ug.a aVar = ug.a.f29706a;
        int i12 = this.f5155b;
        s1 s1Var = this.f5156c;
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
            if (i12 == 0) {
                pg.q.b(obj);
                size = s1Var.f5289u.size();
                wh.c cVar = ph.z0.f21632a;
                wh.b bVar = wh.b.f31563c;
                a aVar2 = new a(s1Var, this.f5157d, size, null);
                this.f5154a = size;
                this.f5155b = 1;
                objE = ph.h.e(bVar, aVar2, this);
                if (objE == aVar) {
                }
                return aVar;
            }
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i13 = this.f5154a;
                pg.q.b(obj);
                objF = obj;
                i10 = i13;
                List list = (List) objF;
                ArrayList arrayList = new ArrayList(qg.p.h(list, 10));
                int i14 = 0;
                for (Object obj2 : list) {
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        qg.p.o();
                        throw null;
                    }
                    pg.n nVar = (pg.n) obj2;
                    float fFloatValue = ((Number) nVar.f21469a).floatValue();
                    float fFloatValue2 = ((Number) nVar.f21470b).floatValue();
                    long j10 = s1Var.f5293y;
                    s1Var.f5293y = j10 + 1;
                    arrayList.add(new b(j10, i10, i14, fFloatValue, fFloatValue2));
                    i14 = i15;
                }
                List<Integer> list2 = s1.A;
                int iM = s1Var.m();
                ArrayList arrayListE0 = qg.x.e0(s1Var.j());
                arrayListE0.addAll(iM, arrayList);
                s1Var.h(arrayListE0);
                HashSet hashSet = new HashSet();
                size2 = arrayList.size();
                i11 = 0;
                while (i11 < size2) {
                    Object obj3 = arrayList.get(i11);
                    i11++;
                    hashSet.add(new Long(((b) obj3).f5057a));
                }
                s1Var.f5277i.setValue(hashSet);
                s1Var.f5279k.setValue(new Long(((b) qg.x.B(arrayList)).f5057a));
                s1Var.p(null);
                return pg.f0.f21461a;
            }
            size = this.f5154a;
            pg.q.b(obj);
            objE = obj;
            this.f5154a = size;
            this.f5155b = 2;
            objF = s1.f(s1Var, (File) objE, this);
            if (objF != aVar) {
                i10 = size;
                List list3 = (List) objF;
                ArrayList arrayList2 = new ArrayList(qg.p.h(list3, 10));
                int i142 = 0;
                while (r2.hasNext()) {
                }
                List<Integer> list22 = s1.A;
                int iM2 = s1Var.m();
                ArrayList arrayListE02 = qg.x.e0(s1Var.j());
                arrayListE02.addAll(iM2, arrayList2);
                s1Var.h(arrayListE02);
                HashSet hashSet2 = new HashSet();
                size2 = arrayList2.size();
                i11 = 0;
                while (i11 < size2) {
                }
                s1Var.f5277i.setValue(hashSet2);
                s1Var.f5279k.setValue(new Long(((b) qg.x.B(arrayList2)).f5057a));
                s1Var.p(null);
                return pg.f0.f21461a;
            }
            return aVar;
        } catch (Throwable th2) {
            List<Integer> list4 = s1.A;
            s1Var.p(null);
            throw th2;
        }
    }
}
