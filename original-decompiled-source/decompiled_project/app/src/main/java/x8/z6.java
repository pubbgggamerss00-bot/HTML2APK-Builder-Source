package x8;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import java.io.File;
import java.util.regex.Pattern;
import x8.j6;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.home.HomeViewModel$exportProjectAsAndroidProject$1", f = "HomeViewModel.kt", l = {703, 727}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class z6 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public j6 f33444a;

    /* renamed from: b, reason: collision with root package name */
    public Intent f33445b;

    /* renamed from: c, reason: collision with root package name */
    public File f33446c;

    /* renamed from: d, reason: collision with root package name */
    public int f33447d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j6 f33448e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Context f33449f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ProjectEntity f33450g;

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.home.HomeViewModel$exportProjectAsAndroidProject$1$1", f = "HomeViewModel.kt", l = {704}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.l<tg.e<? super pg.n<? extends Intent, ? extends File>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f33451a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f33452b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ProjectEntity f33453c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ j6 f33454d;

        @vg.e(c = "com.basitce.htmltoapk.ui.screens.home.HomeViewModel$exportProjectAsAndroidProject$1$1$1", f = "HomeViewModel.kt", l = {709}, m = "invokeSuspend")
        /* renamed from: x8.z6$a$a, reason: collision with other inner class name */
        public static final class C0336a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.n<? extends Intent, ? extends File>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public File f33455a;

            /* renamed from: b, reason: collision with root package name */
            public l8.b f33456b;

            /* renamed from: c, reason: collision with root package name */
            public ProjectEntity f33457c;

            /* renamed from: d, reason: collision with root package name */
            public File f33458d;

            /* renamed from: e, reason: collision with root package name */
            public int f33459e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ Context f33460f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ ProjectEntity f33461g;

            /* renamed from: h, reason: collision with root package name */
            public final /* synthetic */ j6 f33462h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0336a(Context context, ProjectEntity projectEntity, tg.e eVar, j6 j6Var) {
                super(2, eVar);
                this.f33460f = context;
                this.f33461g = projectEntity;
                this.f33462h = j6Var;
            }

            @Override // vg.a
            public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
                return new C0336a(this.f33460f, this.f33461g, eVar, this.f33462h);
            }

            @Override // eh.p
            public final Object invoke(ph.i0 i0Var, tg.e<? super pg.n<? extends Intent, ? extends File>> eVar) {
                return ((C0336a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                ProjectEntity project;
                File file;
                l8.b bVar;
                File outputFile;
                Object objA;
                ug.a aVar = ug.a.f29706a;
                int i10 = this.f33459e;
                Context context = this.f33460f;
                if (i10 == 0) {
                    pg.q.b(obj);
                    File file2 = new File(context.getFilesDir(), "exports");
                    file2.mkdirs();
                    project = this.f33461g;
                    String input = project.getName();
                    Pattern patternCompile = Pattern.compile("[^a-zA-Z0-9_-]");
                    kotlin.jvm.internal.r.d(patternCompile, "compile(...)");
                    kotlin.jvm.internal.r.e(input, "input");
                    String strReplaceAll = patternCompile.matcher(input).replaceAll("_");
                    kotlin.jvm.internal.r.d(strReplaceAll, "replaceAll(...)");
                    file = new File(file2, strReplaceAll.concat("_android_project.zip"));
                    bVar = new l8.b(context);
                    n8.g1 g1Var = this.f33462h.f32777d.f18530f;
                    this.f33455a = file;
                    this.f33456b = bVar;
                    this.f33457c = project;
                    this.f33458d = file;
                    this.f33459e = 1;
                    obj = gg.a.f(g1Var, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    outputFile = file;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    File file3 = this.f33458d;
                    project = this.f33457c;
                    bVar = this.f33456b;
                    file = this.f33455a;
                    pg.q.b(obj);
                    outputFile = file3;
                }
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                bVar.getClass();
                kotlin.jvm.internal.r.e(project, "project");
                kotlin.jvm.internal.r.e(outputFile, "outputFile");
                try {
                    File parentFile = outputFile.getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                    }
                    String input2 = project.getName();
                    Pattern patternCompile2 = Pattern.compile("[^a-zA-Z0-9_-]");
                    kotlin.jvm.internal.r.d(patternCompile2, "compile(...)");
                    kotlin.jvm.internal.r.e(input2, "input");
                    String strReplaceAll2 = patternCompile2.matcher(input2).replaceAll("_");
                    kotlin.jvm.internal.r.d(strReplaceAll2, "replaceAll(...)");
                    File file4 = new File(bVar.f16765a.getCacheDir(), "android_export/" + project.getId());
                    ah.l.f(file4);
                    file4.mkdirs();
                    File file5 = new File(file4, strReplaceAll2);
                    file5.mkdirs();
                    bVar.g(project, file5, strReplaceAll2, zBooleanValue);
                    l8.b.h(file5, outputFile);
                    ah.l.f(file4);
                    objA = outputFile;
                } catch (Exception e10) {
                    objA = pg.q.a(e10);
                }
                pg.q.b(objA);
                Uri uriForFile = FileProvider.getUriForFile(context, context.getPackageName() + ".fileprovider", file);
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("application/zip");
                intent.putExtra("android.intent.extra.STREAM", uriForFile);
                intent.addFlags(1);
                return new pg.n(intent, file);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, ProjectEntity projectEntity, tg.e eVar, j6 j6Var) {
            super(1, eVar);
            this.f33452b = context;
            this.f33453c = projectEntity;
            this.f33454d = j6Var;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(tg.e<?> eVar) {
            return new a(this.f33452b, this.f33453c, eVar, this.f33454d);
        }

        @Override // eh.l
        public final Object invoke(tg.e<? super pg.n<? extends Intent, ? extends File>> eVar) {
            return ((a) create(eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f33451a;
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
            C0336a c0336a = new C0336a(this.f33452b, this.f33453c, null, this.f33454d);
            this.f33451a = 1;
            Object objE = ph.h.e(bVar, c0336a, this);
            return objE == aVar ? aVar : objE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6(Context context, ProjectEntity projectEntity, tg.e eVar, j6 j6Var) {
        super(2, eVar);
        this.f33448e = j6Var;
        this.f33449f = context;
        this.f33450g = projectEntity;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new z6(this.f33449f, this.f33450g, eVar, this.f33448e);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((z6) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        Object objK;
        Intent intent;
        File file;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f33447d;
        Context context = this.f33449f;
        j6 j6Var = this.f33448e;
        if (i10 == 0) {
            pg.q.b(obj);
            a aVar2 = new a(context, this.f33450g, null, j6Var);
            this.f33447d = 1;
            objK = j6.k(j6Var, aVar2, this);
            if (objK != aVar) {
            }
            return aVar;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            file = this.f33446c;
            intent = this.f33445b;
            j6Var = this.f33444a;
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
        this.f33444a = j6Var;
        this.f33445b = intent;
        this.f33446c = file2;
        this.f33447d = 2;
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
