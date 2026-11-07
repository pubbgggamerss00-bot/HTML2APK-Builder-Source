package x8;

import ah.h;
import ah.h.b;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.data.local.entity.KeystoreEntity;
import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.regex.Pattern;
import java.util.zip.ZipOutputStream;
import pg.p;
import x8.j6;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.home.HomeViewModel$exportProjectZip$1", f = "HomeViewModel.kt", l = {624, 685}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class a7 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public j6 f32227a;

    /* renamed from: b, reason: collision with root package name */
    public Intent f32228b;

    /* renamed from: c, reason: collision with root package name */
    public File f32229c;

    /* renamed from: d, reason: collision with root package name */
    public int f32230d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j6 f32231e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Context f32232f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ProjectEntity f32233g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f32234h;

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.home.HomeViewModel$exportProjectZip$1$1", f = "HomeViewModel.kt", l = {625}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.l<tg.e<? super pg.n<? extends Intent, ? extends File>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f32235a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f32236b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ProjectEntity f32237c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f32238d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ j6 f32239e;

        @vg.e(c = "com.basitce.htmltoapk.ui.screens.home.HomeViewModel$exportProjectZip$1$1$1", f = "HomeViewModel.kt", l = {631}, m = "invokeSuspend")
        /* renamed from: x8.a7$a$a, reason: collision with other inner class name */
        public static final class C0327a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.n<? extends Intent, ? extends File>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f32240a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f32241b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Context f32242c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ ProjectEntity f32243d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ boolean f32244e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ j6 f32245f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0327a(Context context, ProjectEntity projectEntity, tg.e eVar, j6 j6Var, boolean z10) {
                super(2, eVar);
                this.f32242c = context;
                this.f32243d = projectEntity;
                this.f32244e = z10;
                this.f32245f = j6Var;
            }

            @Override // vg.a
            public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
                boolean z10 = this.f32244e;
                C0327a c0327a = new C0327a(this.f32242c, this.f32243d, eVar, this.f32245f, z10);
                c0327a.f32241b = obj;
                return c0327a;
            }

            @Override // eh.p
            public final Object invoke(ph.i0 i0Var, tg.e<? super pg.n<? extends Intent, ? extends File>> eVar) {
                return ((C0327a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:29:0x00a5  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x00d0 A[Catch: all -> 0x0126, TryCatch #0 {all -> 0x0126, blocks: (B:32:0x00b2, B:34:0x00d0, B:36:0x00db, B:39:0x00e3, B:40:0x00ec, B:42:0x00f2, B:44:0x00fe, B:47:0x0129, B:48:0x013c, B:50:0x0142, B:52:0x014d, B:53:0x0165, B:55:0x016b, B:57:0x0176, B:59:0x0190), top: B:66:0x00b2 }] */
            /* JADX WARN: Removed duplicated region for block: B:50:0x0142 A[Catch: all -> 0x0126, TryCatch #0 {all -> 0x0126, blocks: (B:32:0x00b2, B:34:0x00d0, B:36:0x00db, B:39:0x00e3, B:40:0x00ec, B:42:0x00f2, B:44:0x00fe, B:47:0x0129, B:48:0x013c, B:50:0x0142, B:52:0x014d, B:53:0x0165, B:55:0x016b, B:57:0x0176, B:59:0x0190), top: B:66:0x00b2 }] */
            /* JADX WARN: Removed duplicated region for block: B:55:0x016b A[Catch: all -> 0x0126, TryCatch #0 {all -> 0x0126, blocks: (B:32:0x00b2, B:34:0x00d0, B:36:0x00db, B:39:0x00e3, B:40:0x00ec, B:42:0x00f2, B:44:0x00fe, B:47:0x0129, B:48:0x013c, B:50:0x0142, B:52:0x014d, B:53:0x0165, B:55:0x016b, B:57:0x0176, B:59:0x0190), top: B:66:0x00b2 }] */
            /* JADX WARN: Removed duplicated region for block: B:59:0x0190 A[Catch: all -> 0x0126, TRY_LEAVE, TryCatch #0 {all -> 0x0126, blocks: (B:32:0x00b2, B:34:0x00d0, B:36:0x00db, B:39:0x00e3, B:40:0x00ec, B:42:0x00f2, B:44:0x00fe, B:47:0x0129, B:48:0x013c, B:50:0x0142, B:52:0x014d, B:53:0x0165, B:55:0x016b, B:57:0x0176, B:59:0x0190), top: B:66:0x00b2 }] */
            /* JADX WARN: Type inference failed for: r14v10, types: [pg.p$a] */
            @Override // vg.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) throws IOException {
                File file;
                File file2;
                String sourcePath;
                String iconPath;
                String splashPath;
                KeystoreEntity keystoreEntityA;
                ug.a aVar = ug.a.f29706a;
                int i10 = this.f32240a;
                j6 j6Var = this.f32245f;
                Context context = this.f32242c;
                ProjectEntity projectEntity = this.f32243d;
                try {
                    if (i10 == 0) {
                        pg.q.b(obj);
                        File file3 = new File(context.getFilesDir(), "exports");
                        file3.mkdirs();
                        String input = projectEntity.getName();
                        Pattern patternCompile = Pattern.compile("[^a-zA-Z0-9_-]");
                        kotlin.jvm.internal.r.d(patternCompile, "compile(...)");
                        kotlin.jvm.internal.r.e(input, "input");
                        String strReplaceAll = patternCompile.matcher(input).replaceAll("_");
                        kotlin.jvm.internal.r.d(strReplaceAll, "replaceAll(...)");
                        file = new File(file3, strReplaceAll.concat("_project.zip"));
                        if (this.f32244e && projectEntity.getKeystoreId() != null) {
                            try {
                                n8.l lVar = j6Var.f32776c;
                                long jLongValue = projectEntity.getKeystoreId().longValue();
                                this.f32241b = file;
                                this.f32240a = 1;
                                lVar.getClass();
                                wh.c cVar = ph.z0.f21632a;
                                obj = ph.h.e(wh.b.f31563c, new n8.m(lVar, jLongValue, null), this);
                                if (obj == aVar) {
                                    return aVar;
                                }
                                file2 = file;
                            } catch (Throwable th2) {
                                th = th2;
                                file2 = file;
                                keystoreEntityA = pg.q.a(th);
                                file = file2;
                                keystoreEntity = keystoreEntityA instanceof p.a ? null : keystoreEntityA;
                                ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(file));
                                byte[] bytes = j6.g(j6Var, projectEntity, keystoreEntity).toString().getBytes(mh.a.f18238b);
                                kotlin.jvm.internal.r.d(bytes, "getBytes(...)");
                                uh.t.a(zipOutputStream, "metadata.json", bytes);
                                sourcePath = projectEntity.getSourcePath();
                                if (sourcePath != null) {
                                }
                                iconPath = projectEntity.getIconPath();
                                if (iconPath != null) {
                                }
                                splashPath = projectEntity.getSplashPath();
                                if (splashPath != null) {
                                }
                                if (keystoreEntity != null) {
                                }
                                zipOutputStream.close();
                                Uri uriForFile = FileProvider.getUriForFile(context, context.getPackageName() + ".fileprovider", file);
                                Intent intent = new Intent("android.intent.action.SEND");
                                intent.setType("application/zip");
                                intent.putExtra("android.intent.extra.STREAM", uriForFile);
                                intent.addFlags(1);
                                return new pg.n(intent, file);
                            }
                        }
                        ZipOutputStream zipOutputStream2 = new ZipOutputStream(new FileOutputStream(file));
                        byte[] bytes2 = j6.g(j6Var, projectEntity, keystoreEntity).toString().getBytes(mh.a.f18238b);
                        kotlin.jvm.internal.r.d(bytes2, "getBytes(...)");
                        uh.t.a(zipOutputStream2, "metadata.json", bytes2);
                        sourcePath = projectEntity.getSourcePath();
                        if (sourcePath != null) {
                            File file4 = new File(sourcePath);
                            if (file4.exists()) {
                                if (file4.isDirectory()) {
                                    h.b bVar = ah.l.p(file4).new b();
                                    while (bVar.hasNext()) {
                                        File next = bVar.next();
                                        if (next.isFile()) {
                                            String path = ah.l.l(next, file4).getPath();
                                            kotlin.jvm.internal.r.d(path, "getPath(...)");
                                            uh.t.b(zipOutputStream2, "content/" + mh.t.m(path, '\\', '/'), next);
                                        }
                                    }
                                } else {
                                    uh.t.b(zipOutputStream2, "content/" + file4.getName(), file4);
                                }
                            }
                        }
                        iconPath = projectEntity.getIconPath();
                        if (iconPath != null) {
                            File file5 = new File(iconPath);
                            if (file5.exists()) {
                                uh.t.b(zipOutputStream2, "icon/" + file5.getName(), file5);
                            }
                        }
                        splashPath = projectEntity.getSplashPath();
                        if (splashPath != null) {
                            File file6 = new File(splashPath);
                            if (file6.exists()) {
                                uh.t.b(zipOutputStream2, "splash/" + file6.getName(), file6);
                            }
                        }
                        if (keystoreEntity != null) {
                            j6.f(j6Var, zipOutputStream2, keystoreEntity, "keystore");
                            pg.f0 f0Var = pg.f0.f21461a;
                        }
                        zipOutputStream2.close();
                        Uri uriForFile2 = FileProvider.getUriForFile(context, context.getPackageName() + ".fileprovider", file);
                        Intent intent2 = new Intent("android.intent.action.SEND");
                        intent2.setType("application/zip");
                        intent2.putExtra("android.intent.extra.STREAM", uriForFile2);
                        intent2.addFlags(1);
                        return new pg.n(intent2, file);
                    }
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    file2 = (File) this.f32241b;
                    try {
                        pg.q.b(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        keystoreEntityA = pg.q.a(th);
                        file = file2;
                        keystoreEntity = keystoreEntityA instanceof p.a ? null : keystoreEntityA;
                        ZipOutputStream zipOutputStream22 = new ZipOutputStream(new FileOutputStream(file));
                        byte[] bytes22 = j6.g(j6Var, projectEntity, keystoreEntity).toString().getBytes(mh.a.f18238b);
                        kotlin.jvm.internal.r.d(bytes22, "getBytes(...)");
                        uh.t.a(zipOutputStream22, "metadata.json", bytes22);
                        sourcePath = projectEntity.getSourcePath();
                        if (sourcePath != null) {
                        }
                        iconPath = projectEntity.getIconPath();
                        if (iconPath != null) {
                        }
                        splashPath = projectEntity.getSplashPath();
                        if (splashPath != null) {
                        }
                        if (keystoreEntity != null) {
                        }
                        zipOutputStream22.close();
                        Uri uriForFile22 = FileProvider.getUriForFile(context, context.getPackageName() + ".fileprovider", file);
                        Intent intent22 = new Intent("android.intent.action.SEND");
                        intent22.setType("application/zip");
                        intent22.putExtra("android.intent.extra.STREAM", uriForFile22);
                        intent22.addFlags(1);
                        return new pg.n(intent22, file);
                    }
                    byte[] bytes222 = j6.g(j6Var, projectEntity, keystoreEntity).toString().getBytes(mh.a.f18238b);
                    kotlin.jvm.internal.r.d(bytes222, "getBytes(...)");
                    uh.t.a(zipOutputStream22, "metadata.json", bytes222);
                    sourcePath = projectEntity.getSourcePath();
                    if (sourcePath != null) {
                    }
                    iconPath = projectEntity.getIconPath();
                    if (iconPath != null) {
                    }
                    splashPath = projectEntity.getSplashPath();
                    if (splashPath != null) {
                    }
                    if (keystoreEntity != null) {
                    }
                    zipOutputStream22.close();
                    Uri uriForFile222 = FileProvider.getUriForFile(context, context.getPackageName() + ".fileprovider", file);
                    Intent intent222 = new Intent("android.intent.action.SEND");
                    intent222.setType("application/zip");
                    intent222.putExtra("android.intent.extra.STREAM", uriForFile222);
                    intent222.addFlags(1);
                    return new pg.n(intent222, file);
                } finally {
                }
                keystoreEntityA = (KeystoreEntity) obj;
                file = file2;
                keystoreEntity = keystoreEntityA instanceof p.a ? null : keystoreEntityA;
                ZipOutputStream zipOutputStream222 = new ZipOutputStream(new FileOutputStream(file));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, ProjectEntity projectEntity, tg.e eVar, j6 j6Var, boolean z10) {
            super(1, eVar);
            this.f32236b = context;
            this.f32237c = projectEntity;
            this.f32238d = z10;
            this.f32239e = j6Var;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(tg.e<?> eVar) {
            boolean z10 = this.f32238d;
            return new a(this.f32236b, this.f32237c, eVar, this.f32239e, z10);
        }

        @Override // eh.l
        public final Object invoke(tg.e<? super pg.n<? extends Intent, ? extends File>> eVar) {
            return ((a) create(eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f32235a;
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
            C0327a c0327a = new C0327a(this.f32236b, this.f32237c, null, this.f32239e, this.f32238d);
            this.f32235a = 1;
            Object objE = ph.h.e(bVar, c0327a, this);
            return objE == aVar ? aVar : objE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a7(Context context, ProjectEntity projectEntity, tg.e eVar, j6 j6Var, boolean z10) {
        super(2, eVar);
        this.f32231e = j6Var;
        this.f32232f = context;
        this.f32233g = projectEntity;
        this.f32234h = z10;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new a7(this.f32232f, this.f32233g, eVar, this.f32231e, this.f32234h);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((a7) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        Object objK;
        Object objI;
        File file;
        Intent intent;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f32230d;
        j6 j6Var = this.f32231e;
        if (i10 == 0) {
            pg.q.b(obj);
            a aVar2 = new a(this.f32232f, this.f32233g, null, j6Var, this.f32234h);
            this.f32230d = 1;
            objK = j6.k(j6Var, aVar2, this);
            if (objK != aVar) {
            }
            return aVar;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            file = this.f32229c;
            Intent intent2 = this.f32228b;
            j6Var = this.f32227a;
            pg.q.b(obj);
            objI = obj;
            intent = intent2;
            String string = j6Var.F().getString(R.string.output_saved_to, m3.a.a("Downloads/HTMLtoAPK/", file.getName()));
            kotlin.jvm.internal.r.d(string, "getString(...)");
            sh.z0 z0Var = j6Var.f32796w;
            j6.b bVar = new j6.b(intent, (Uri) objI, string, R.string.home_export_title, 16);
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
            j6.b bVar2 = new j6.b(intent3, null, message, R.string.home_export_title, 2);
            z0Var2.getClass();
            z0Var2.j(null, bVar2);
            return pg.f0.f21461a;
        }
        pg.n nVar = (pg.n) objK;
        Intent intent4 = (Intent) nVar.f21469a;
        File file2 = (File) nVar.f21470b;
        this.f32227a = j6Var;
        this.f32228b = intent4;
        this.f32229c = file2;
        this.f32230d = 2;
        objI = j6.i(j6Var, this.f32232f, file2, this);
        if (objI != aVar) {
            file = file2;
            intent = intent4;
            String string2 = j6Var.F().getString(R.string.output_saved_to, m3.a.a("Downloads/HTMLtoAPK/", file.getName()));
            kotlin.jvm.internal.r.d(string2, "getString(...)");
            sh.z0 z0Var3 = j6Var.f32796w;
            j6.b bVar3 = new j6.b(intent, (Uri) objI, string2, R.string.home_export_title, 16);
            z0Var3.getClass();
            z0Var3.j(null, bVar3);
            return pg.f0.f21461a;
        }
        return aVar;
    }
}
