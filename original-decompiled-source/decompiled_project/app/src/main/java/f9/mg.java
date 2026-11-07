package f9;

import android.app.Application;
import android.net.Uri;
import android.text.format.Formatter;
import android.widget.Toast;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.data.apkgenerator.BuildLogger;
import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import java.io.File;
import java.util.concurrent.CancellationException;
import l9.f0;
import ph.s1;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.ProjectEditorViewModel$importProjectFolder$1", f = "ProjectEditorViewModel.kt", l = {873, 880, 885, 890}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class mg extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public Object f10068a;

    /* renamed from: b, reason: collision with root package name */
    public f0.c.f f10069b;

    /* renamed from: c, reason: collision with root package name */
    public int f10070c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f10071d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ph.s1 f10072e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fg f10073f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Uri f10074g;

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.ProjectEditorViewModel$importProjectFolder$1$message$1", f = "ProjectEditorViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ fg f10075a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ File f10076b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fg fgVar, File file, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f10075a = fgVar;
            this.f10076b = file;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new a(this.f10075a, this.f10076b, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            pg.q.b(obj);
            mh.k kVar = fg.X0;
            this.f10075a.o(this.f10076b);
            return pg.f0.f21461a;
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.ProjectEditorViewModel$importProjectFolder$1$result$1", f = "ProjectEditorViewModel.kt", l = {881}, m = "invokeSuspend")
    public static final class b extends vg.i implements eh.p<ph.i0, tg.e<? super f0.c>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f10077a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ fg f10078b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Uri f10079c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ File f10080d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(fg fgVar, Uri uri, File file, tg.e<? super b> eVar) {
            super(2, eVar);
            this.f10078b = fgVar;
            this.f10079c = uri;
            this.f10080d = file;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new b(this.f10078b, this.f10079c, this.f10080d, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super f0.c> eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v1, types: [f9.ng] */
        @Override // vg.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f10077a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
                return obj;
            }
            pg.q.b(obj);
            final fg fgVar = this.f10078b;
            l9.f0 f0Var = new l9.f0(fgVar.f9562f);
            ?? r32 = new eh.l() { // from class: f9.ng
                @Override // eh.l
                public final Object invoke(Object obj2) {
                    fgVar.f9559d0.setValue((f0.b) obj2);
                    return pg.f0.f21461a;
                }
            };
            this.f10077a = 1;
            Object objB = f0Var.b(this.f10079c, this.f10080d, r32, this);
            return objB == aVar ? aVar : objB;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mg(ph.s1 s1Var, fg fgVar, Uri uri, tg.e<? super mg> eVar) {
        super(2, eVar);
        this.f10072e = s1Var;
        this.f10073f = fgVar;
        this.f10074g = uri;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        mg mgVar = new mg(this.f10072e, this.f10073f, this.f10074g, eVar);
        mgVar.f10071d = obj;
        return mgVar;
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((mg) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:(1:114)|(1:(2:115|(1:(1:(11:8|9|10|63|(1:65)(1:69)|66|88|89|(1:91)|105|106)(2:17|18))(9:19|20|21|112|54|(1:56)|59|(9:62|63|(0)(0)|66|88|89|(0)|105|106)|61))(5:28|29|30|48|(3:50|(6:53|112|54|(0)|59|(0))|61)(7:70|(1:72)(2:73|(1:75)(2:76|(1:78)(2:79|(1:81)(2:82|(1:84)(2:85|(1:87)(2:92|93))))))|88|89|(0)|105|106)))(1:31))(4:32|(3:34|(0)|61)|105|106)|37|38|(1:40)(1:42)|41|43|44|116|45|(1:47)(2:48|(0)(0))|61) */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0184, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0185, code lost:
    
        r6 = r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ee A[Catch: all -> 0x002f, CancellationException -> 0x0037, Exception -> 0x0184, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x0037, blocks: (B:9:0x0028, B:63:0x015b, B:65:0x0162, B:88:0x022a, B:69:0x0187, B:48:0x00e8, B:50:0x00ee, B:70:0x019d, B:72:0x01a5, B:73:0x01ae, B:75:0x01b6, B:76:0x01be, B:78:0x01c6, B:79:0x01ce, B:81:0x01d2, B:82:0x01ec, B:84:0x01f0, B:85:0x0205, B:87:0x0209, B:92:0x0248, B:93:0x024d, B:38:0x00af, B:40:0x00b9, B:43:0x00c2, B:45:0x00d5), top: B:114:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011f A[Catch: all -> 0x0053, CancellationException -> 0x005a, Exception -> 0x0129, TryCatch #1 {Exception -> 0x0129, blocks: (B:54:0x010c, B:56:0x011f, B:59:0x012d), top: B:112:0x010c }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0162 A[Catch: all -> 0x002f, CancellationException -> 0x0037, Exception -> 0x0184, TryCatch #2 {CancellationException -> 0x0037, blocks: (B:9:0x0028, B:63:0x015b, B:65:0x0162, B:88:0x022a, B:69:0x0187, B:48:0x00e8, B:50:0x00ee, B:70:0x019d, B:72:0x01a5, B:73:0x01ae, B:75:0x01b6, B:76:0x01be, B:78:0x01c6, B:79:0x01ce, B:81:0x01d2, B:82:0x01ec, B:84:0x01f0, B:85:0x0205, B:87:0x0209, B:92:0x0248, B:93:0x024d, B:38:0x00af, B:40:0x00b9, B:43:0x00c2, B:45:0x00d5), top: B:114:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0187 A[Catch: all -> 0x002f, CancellationException -> 0x0037, Exception -> 0x0184, TryCatch #2 {CancellationException -> 0x0037, blocks: (B:9:0x0028, B:63:0x015b, B:65:0x0162, B:88:0x022a, B:69:0x0187, B:48:0x00e8, B:50:0x00ee, B:70:0x019d, B:72:0x01a5, B:73:0x01ae, B:75:0x01b6, B:76:0x01be, B:78:0x01c6, B:79:0x01ce, B:81:0x01d2, B:82:0x01ec, B:84:0x01f0, B:85:0x0205, B:87:0x0209, B:92:0x0248, B:93:0x024d, B:38:0x00af, B:40:0x00b9, B:43:0x00c2, B:45:0x00d5), top: B:114:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019d A[Catch: all -> 0x002f, CancellationException -> 0x0037, Exception -> 0x0184, TryCatch #2 {CancellationException -> 0x0037, blocks: (B:9:0x0028, B:63:0x015b, B:65:0x0162, B:88:0x022a, B:69:0x0187, B:48:0x00e8, B:50:0x00ee, B:70:0x019d, B:72:0x01a5, B:73:0x01ae, B:75:0x01b6, B:76:0x01be, B:78:0x01c6, B:79:0x01ce, B:81:0x01d2, B:82:0x01ec, B:84:0x01f0, B:85:0x0205, B:87:0x0209, B:92:0x0248, B:93:0x024d, B:38:0x00af, B:40:0x00b9, B:43:0x00c2, B:45:0x00d5), top: B:114:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0267  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r6v0, types: [int] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i10;
        Object obj2;
        String message;
        String message2;
        ph.i0 i0Var;
        Object obj3;
        String string;
        Object obj4;
        Object obj5;
        Object obj6;
        File file;
        Object obj7;
        String name;
        lg lgVar;
        File file2;
        Object objE;
        Object obj8;
        fg fgVar = this.f10073f;
        sh.z0 z0Var = fgVar.f9559d0;
        sh.z0 z0Var2 = fgVar.f9557c0;
        Application application = fgVar.f9562f;
        ug.a aVar = ug.a.f29706a;
        ?? r62 = this.f10070c;
        ?? r11 = 2;
        r11 = 2;
        String str = "";
        try {
            try {
                try {
                    try {
                    } catch (CancellationException e10) {
                        throw e10;
                    }
                } catch (Exception e11) {
                    e = e11;
                }
                if (r62 == 0) {
                    pg.q.b(obj);
                    i0Var = (ph.i0) this.f10071d;
                    ph.s1 s1Var = this.f10072e;
                    if (s1Var != null) {
                        this.f10071d = i0Var;
                        this.f10070c = 1;
                        if (ph.v1.c(s1Var, this) != aVar) {
                        }
                        return aVar;
                    }
                    return pg.f0.f21461a;
                }
                if (r62 != 1) {
                    try {
                    } catch (Exception e12) {
                        e = e12;
                        r62 = 2;
                        i10 = 1;
                        obj2 = r62;
                        BuildLogger buildLogger = BuildLogger.INSTANCE;
                        message = e.getMessage();
                        if (message == null) {
                        }
                        buildLogger.error(R.string.build_log_editor_folder_import_error, message);
                        message2 = e.getMessage();
                        if (message2 != null) {
                        }
                        Toast.makeText(application, application.getString(R.string.editor_folder_import_failed, str), i10).show();
                        if (fgVar.f9561e0 == obj2) {
                        }
                        return pg.f0.f21461a;
                    }
                    if (r62 == 2) {
                        File file3 = (File) this.f10068a;
                        Object obj9 = (ph.s1) this.f10071d;
                        pg.q.b(obj);
                        objE = obj;
                        file2 = file3;
                        obj8 = obj9;
                        i10 = 1;
                        obj3 = (f0.c) objE;
                        if (obj3 instanceof f0.c.f) {
                            if (kotlin.jvm.internal.r.a(obj3, f0.c.e.f16807a)) {
                                string = application.getString(R.string.editor_folder_open_failed);
                                obj4 = obj8;
                            } else if (kotlin.jvm.internal.r.a(obj3, f0.c.b.f16804a)) {
                                string = application.getString(R.string.editor_folder_empty);
                                obj4 = obj8;
                            } else if (kotlin.jvm.internal.r.a(obj3, f0.c.C0169c.f16805a)) {
                                string = application.getString(R.string.editor_folder_no_html);
                                obj4 = obj8;
                            } else if (obj3 instanceof f0.c.g) {
                                string = application.getString(R.string.editor_folder_too_large, Formatter.formatShortFileSize(application, 524288000L), new Integer(20000));
                                obj4 = obj8;
                            } else if (obj3 instanceof f0.c.d) {
                                string = application.getString(R.string.editor_folder_no_space, Formatter.formatShortFileSize(application, ((f0.c.d) obj3).f16806a));
                                obj4 = obj8;
                            } else {
                                if (!(obj3 instanceof f0.c.a)) {
                                    throw new pg.l();
                                }
                                BuildLogger.INSTANCE.error(R.string.build_log_editor_folder_import_error, ((f0.c.a) obj3).f16803a);
                                string = application.getString(R.string.editor_folder_copy_failed, ((f0.c.a) obj3).f16803a);
                                obj4 = obj8;
                            }
                            kotlin.jvm.internal.r.b(string);
                            Toast.makeText(application, string, !(obj3 instanceof f0.c.f) ? 1 : 0).show();
                            if (fgVar.f9561e0 == obj4) {
                            }
                            return pg.f0.f21461a;
                        }
                        wh.c cVar = ph.z0.f21632a;
                        wh.b bVar = wh.b.f31563c;
                        a aVar2 = new a(fgVar, file2, null);
                        this.f10071d = obj8;
                        this.f10068a = file2;
                        this.f10069b = (f0.c.f) obj3;
                        this.f10070c = 3;
                        if (ph.h.e(bVar, aVar2, this) != aVar) {
                            r11 = obj8;
                            obj7 = obj3;
                            file = file2;
                            sh.z0 z0Var3 = fgVar.f9600y;
                            z0Var3.getClass();
                            z0Var3.j(null, "folder");
                            sh.z0 z0Var4 = fgVar.C;
                            name = ((f0.c.f) obj7).f16810c;
                            if (name == null) {
                            }
                            z0Var4.getClass();
                            z0Var4.j(null, name);
                            fgVar.F.setValue(Uri.fromFile(file));
                            sh.z0 z0Var5 = fgVar.B;
                            z0Var5.getClass();
                            z0Var5.j(null, "");
                            lgVar = new lg(file, 0);
                            this.f10071d = r11;
                            this.f10068a = obj7;
                            this.f10069b = null;
                            this.f10070c = 4;
                            if (fgVar.G(lgVar, this) != aVar) {
                            }
                        }
                        return aVar;
                    }
                    if (r62 != 3) {
                        if (r62 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Object obj10 = (f0.c) this.f10068a;
                        Object obj11 = (ph.s1) this.f10071d;
                        pg.q.b(obj);
                        obj6 = obj10;
                        obj5 = obj11;
                        string = ((f0.c.f) obj6).f16809b <= 0 ? application.getString(R.string.editor_folder_imported_skipped, new Integer(((f0.c.f) obj6).f16808a), new Integer(((f0.c.f) obj6).f16809b)) : application.getString(R.string.editor_folder_imported_count, new Integer(((f0.c.f) obj6).f16808a));
                        obj3 = obj6;
                        obj4 = obj5;
                        kotlin.jvm.internal.r.b(string);
                        Toast.makeText(application, string, !(obj3 instanceof f0.c.f) ? 1 : 0).show();
                        if (fgVar.f9561e0 == obj4) {
                            Boolean bool = Boolean.FALSE;
                            z0Var2.getClass();
                            z0Var2.j(null, bool);
                            z0Var.setValue(null);
                        }
                        return pg.f0.f21461a;
                    }
                    obj7 = this.f10069b;
                    file = (File) this.f10068a;
                    ph.s1 s1Var2 = (ph.s1) this.f10071d;
                    pg.q.b(obj);
                    i10 = 1;
                    r11 = s1Var2;
                    try {
                        sh.z0 z0Var32 = fgVar.f9600y;
                        z0Var32.getClass();
                        z0Var32.j(null, "folder");
                        sh.z0 z0Var42 = fgVar.C;
                        name = ((f0.c.f) obj7).f16810c;
                        if (name == null) {
                            name = file.getName();
                            kotlin.jvm.internal.r.d(name, "getName(...)");
                        }
                        z0Var42.getClass();
                        z0Var42.j(null, name);
                        fgVar.F.setValue(Uri.fromFile(file));
                        sh.z0 z0Var52 = fgVar.B;
                        z0Var52.getClass();
                        z0Var52.j(null, "");
                        lgVar = new lg(file, 0);
                        this.f10071d = r11;
                        this.f10068a = obj7;
                        this.f10069b = null;
                        this.f10070c = 4;
                    } catch (Exception e13) {
                        e = e13;
                        obj2 = r11;
                        BuildLogger buildLogger2 = BuildLogger.INSTANCE;
                        message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        buildLogger2.error(R.string.build_log_editor_folder_import_error, message);
                        message2 = e.getMessage();
                        if (message2 != null) {
                            str = message2;
                        }
                        Toast.makeText(application, application.getString(R.string.editor_folder_import_failed, str), i10).show();
                        if (fgVar.f9561e0 == obj2) {
                        }
                        return pg.f0.f21461a;
                    }
                    if (fgVar.G(lgVar, this) != aVar) {
                        obj6 = obj7;
                        obj5 = r11;
                        if (((f0.c.f) obj6).f16809b <= 0) {
                        }
                        obj3 = obj6;
                        obj4 = obj5;
                        kotlin.jvm.internal.r.b(string);
                        Toast.makeText(application, string, !(obj3 instanceof f0.c.f) ? 1 : 0).show();
                        if (fgVar.f9561e0 == obj4) {
                        }
                        return pg.f0.f21461a;
                    }
                    return aVar;
                }
                i0Var = (ph.i0) this.f10071d;
                pg.q.b(obj);
                Object obj12 = (ph.s1) i0Var.getCoroutineContext().get(s1.a.f21589a);
                Boolean bool2 = Boolean.TRUE;
                z0Var2.getClass();
                z0Var2.j(null, bool2);
                f0.b bVar2 = new f0.b(0, 0, 0);
                z0Var.getClass();
                z0Var.j(null, bVar2);
                ProjectEntity projectEntity = (ProjectEntity) fgVar.f9566h.getValue();
                file2 = new File(fgVar.w(projectEntity != null ? projectEntity.getId() : 0L), "content");
                wh.c cVar2 = ph.z0.f21632a;
                wh.b bVar3 = wh.b.f31563c;
                i10 = 1;
                b bVar4 = new b(fgVar, this.f10074g, file2, null);
                this.f10071d = obj12;
                this.f10068a = file2;
                this.f10070c = 2;
                objE = ph.h.e(bVar3, bVar4, this);
                obj8 = obj12;
                if (objE != aVar) {
                    obj3 = (f0.c) objE;
                    if (obj3 instanceof f0.c.f) {
                    }
                }
                return aVar;
            } catch (Throwable th2) {
                th = th2;
                if (fgVar.f9561e0 == r62) {
                    Boolean bool3 = Boolean.FALSE;
                    z0Var2.getClass();
                    z0Var2.j(null, bool3);
                    z0Var.setValue(null);
                }
                throw th;
            }
        } catch (CancellationException e14) {
            throw e14;
        } catch (Throwable th3) {
            th = th3;
            r62 = r11;
            if (fgVar.f9561e0 == r62) {
            }
            throw th;
        }
    }
}
