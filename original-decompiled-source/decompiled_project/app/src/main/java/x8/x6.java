package x8;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import com.basitce.htmltoapk.domain.model.ProjectKind;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import lh.e;
import pg.p;
import x8.j6;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.home.HomeViewModel$exportAllProjectsAsAndroidProject$1", f = "HomeViewModel.kt", l = {745, 796}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class x6 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public j6 f33355a;

    /* renamed from: b, reason: collision with root package name */
    public Intent f33356b;

    /* renamed from: c, reason: collision with root package name */
    public File f33357c;

    /* renamed from: d, reason: collision with root package name */
    public int f33358d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j6 f33359e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Context f33360f;

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.home.HomeViewModel$exportAllProjectsAsAndroidProject$1$1", f = "HomeViewModel.kt", l = {746}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.l<tg.e<? super pg.n<? extends Intent, ? extends File>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f33361a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j6 f33362b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f33363c;

        @vg.e(c = "com.basitce.htmltoapk.ui.screens.home.HomeViewModel$exportAllProjectsAsAndroidProject$1$1$1", f = "HomeViewModel.kt", l = {754}, m = "invokeSuspend")
        /* renamed from: x8.x6$a$a, reason: collision with other inner class name */
        public static final class C0334a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.n<? extends Intent, ? extends File>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public ArrayList f33364a;

            /* renamed from: b, reason: collision with root package name */
            public File f33365b;

            /* renamed from: c, reason: collision with root package name */
            public l8.b f33366c;

            /* renamed from: d, reason: collision with root package name */
            public long f33367d;

            /* renamed from: e, reason: collision with root package name */
            public int f33368e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ j6 f33369f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ Context f33370g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0334a(Context context, tg.e eVar, j6 j6Var) {
                super(2, eVar);
                this.f33369f = j6Var;
                this.f33370g = context;
            }

            @Override // vg.a
            public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
                return new C0334a(this.f33370g, eVar, this.f33369f);
            }

            @Override // eh.p
            public final Object invoke(ph.i0 i0Var, tg.e<? super pg.n<? extends Intent, ? extends File>> eVar) {
                return ((C0334a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) throws IOException {
                ArrayList arrayList;
                File file;
                long jCurrentTimeMillis;
                l8.b bVar;
                Object objF;
                ug.a aVar = ug.a.f29706a;
                int i10 = this.f33368e;
                Context context = this.f33370g;
                if (i10 == 0) {
                    pg.q.b(obj);
                    j6 j6Var = this.f33369f;
                    List<ProjectEntity> list = ((m0) j6Var.f32783j.f25021a.getValue()).f32924a;
                    arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (kotlin.jvm.internal.r.a(ProjectKind.INSTANCE.normalize(((ProjectEntity) obj2).getKind()), ProjectKind.APK)) {
                            arrayList.add(obj2);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        throw new IllegalStateException(j6Var.F().getString(R.string.home_export_error));
                    }
                    File file2 = new File(context.getFilesDir(), "exports");
                    file2.mkdirs();
                    file = new File(file2, "htmltoapk_all_android_projects.zip");
                    jCurrentTimeMillis = System.currentTimeMillis();
                    bVar = new l8.b(context);
                    n8.g1 g1Var = j6Var.f32777d.f18530f;
                    this.f33364a = arrayList;
                    this.f33365b = file;
                    this.f33366c = bVar;
                    this.f33367d = jCurrentTimeMillis;
                    this.f33368e = 1;
                    objF = gg.a.f(g1Var, this);
                    if (objF == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j10 = this.f33367d;
                    bVar = this.f33366c;
                    file = this.f33365b;
                    arrayList = this.f33364a;
                    pg.q.b(obj);
                    jCurrentTimeMillis = j10;
                    objF = obj;
                }
                boolean zBooleanValue = ((Boolean) objF).booleanValue();
                ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(file));
                try {
                    File file3 = new File(context.getCacheDir(), "android_export_all");
                    ah.l.f(file3);
                    file3.mkdirs();
                    int size = arrayList.size();
                    int i11 = 0;
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj3 = arrayList.get(i12);
                        i12++;
                        int i13 = i11 + 1;
                        Serializable serializable = null;
                        if (i11 < 0) {
                            qg.p.o();
                            throw null;
                        }
                        ProjectEntity projectEntity = (ProjectEntity) obj3;
                        String input = projectEntity.getName();
                        ArrayList arrayList2 = arrayList;
                        Pattern patternCompile = Pattern.compile("[^a-zA-Z0-9_-]");
                        long j11 = jCurrentTimeMillis;
                        kotlin.jvm.internal.r.d(patternCompile, "compile(...)");
                        kotlin.jvm.internal.r.e(input, "input");
                        String strReplaceAll = patternCompile.matcher(input).replaceAll("_");
                        kotlin.jvm.internal.r.d(strReplaceAll, "replaceAll(...)");
                        String str = i13 + "_" + strReplaceAll;
                        File file4 = new File(file3, "__" + i11);
                        ah.l.f(file4);
                        file4.mkdirs();
                        Serializable serializableF = bVar.f(projectEntity, file4, zBooleanValue);
                        if (!(serializableF instanceof p.a)) {
                            serializable = serializableF;
                        }
                        File file5 = (File) serializable;
                        if (file5 != null) {
                            File file6 = new File(file3, str);
                            file5.renameTo(file6);
                            e.a aVar2 = new e.a(lh.j.i(ah.l.p(file6), new w6()));
                            while (aVar2.hasNext()) {
                                File file7 = (File) aVar2.next();
                                zipOutputStream.putNextEntry(new ZipEntry(ah.l.h(ah.l.l(file7, file3))));
                                FileInputStream fileInputStream = new FileInputStream(file7);
                                try {
                                    ah.b.a(fileInputStream, zipOutputStream, 8192);
                                    fileInputStream.close();
                                    zipOutputStream.closeEntry();
                                } finally {
                                }
                            }
                        }
                        ah.l.f(file4);
                        arrayList = arrayList2;
                        i11 = i13;
                        jCurrentTimeMillis = j11;
                    }
                    byte[] bytes = String.valueOf(jCurrentTimeMillis).getBytes(mh.a.f18238b);
                    kotlin.jvm.internal.r.d(bytes, "getBytes(...)");
                    uh.t.a(zipOutputStream, "exported_at.txt", bytes);
                    ah.l.f(file3);
                    zipOutputStream.close();
                    Uri uriForFile = FileProvider.getUriForFile(context, context.getPackageName() + ".fileprovider", file);
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("application/zip");
                    intent.putExtra("android.intent.extra.STREAM", uriForFile);
                    intent.addFlags(1);
                    return new pg.n(intent, file);
                } finally {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, tg.e eVar, j6 j6Var) {
            super(1, eVar);
            this.f33362b = j6Var;
            this.f33363c = context;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(tg.e<?> eVar) {
            return new a(this.f33363c, eVar, this.f33362b);
        }

        @Override // eh.l
        public final Object invoke(tg.e<? super pg.n<? extends Intent, ? extends File>> eVar) {
            return ((a) create(eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f33361a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
                return obj;
            }
            pg.q.b(obj);
            wh.c cVar = ph.z0.f21632a;
            wh.b bVar = wh.b.f31563c;
            C0334a c0334a = new C0334a(this.f33363c, null, this.f33362b);
            this.f33361a = 1;
            Object objE = ph.h.e(bVar, c0334a, this);
            return objE == aVar ? aVar : objE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x6(Context context, tg.e eVar, j6 j6Var) {
        super(2, eVar);
        this.f33359e = j6Var;
        this.f33360f = context;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new x6(this.f33360f, eVar, this.f33359e);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((x6) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        Object objK;
        Intent intent;
        File file;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f33358d;
        Context context = this.f33360f;
        j6 j6Var = this.f33359e;
        if (i10 == 0) {
            pg.q.b(obj);
            a aVar2 = new a(context, null, j6Var);
            this.f33358d = 1;
            objK = j6.k(j6Var, aVar2, this);
            if (objK != aVar) {
            }
            return aVar;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            file = this.f33357c;
            intent = this.f33356b;
            j6Var = this.f33355a;
            pg.q.b(obj);
            Intent intent2 = intent;
            Uri uri = (Uri) obj;
            String string = j6Var.F().getString(R.string.output_saved_to, m3.a.a("Downloads/HTMLtoAPK/", file.getName()));
            kotlin.jvm.internal.r.d(string, "getString(...)");
            sh.z0 z0Var = j6Var.f32796w;
            j6.b bVar = new j6.b(intent2, uri, string, R.string.home_export_android_title, 16);
            z0Var.getClass();
            z0Var.j(null, bVar);
            return pg.f0.f21461a;
        }
        pg.q.b(obj);
        objK = ((pg.p) obj).f21471a;
        Throwable thA = pg.p.a(objK);
        if (thA != null) {
            sh.z0 z0Var2 = j6Var.f32796w;
            Intent intent3 = new Intent();
            String message = thA.getMessage();
            if (message == null) {
                message = j6Var.F().getString(R.string.home_export_error);
                kotlin.jvm.internal.r.d(message, "getString(...)");
            }
            j6.b bVar2 = new j6.b(intent3, null, message, R.string.home_export_android_title, 2);
            z0Var2.getClass();
            z0Var2.j(null, bVar2);
            return pg.f0.f21461a;
        }
        pg.n nVar = (pg.n) objK;
        intent = (Intent) nVar.f21469a;
        File file2 = (File) nVar.f21470b;
        this.f33355a = j6Var;
        this.f33356b = intent;
        this.f33357c = file2;
        this.f33358d = 2;
        Object objI = j6.i(j6Var, context, file2, this);
        if (objI != aVar) {
            file = file2;
            obj = objI;
            Intent intent22 = intent;
            Uri uri2 = (Uri) obj;
            String string2 = j6Var.F().getString(R.string.output_saved_to, m3.a.a("Downloads/HTMLtoAPK/", file.getName()));
            kotlin.jvm.internal.r.d(string2, "getString(...)");
            sh.z0 z0Var3 = j6Var.f32796w;
            j6.b bVar3 = new j6.b(intent22, uri2, string2, R.string.home_export_android_title, 16);
            z0Var3.getClass();
            z0Var3.j(null, bVar3);
            return pg.f0.f21461a;
        }
        return aVar;
    }
}
