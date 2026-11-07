package e9;

import android.app.Application;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.data.apkgenerator.ApkGenerator;
import com.basitce.htmltoapk.data.apkgenerator.BuildCoordinator;
import com.basitce.htmltoapk.data.apkgenerator.BuildLogger;
import com.basitce.htmltoapk.data.apkgenerator.CacheManager;
import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import com.basitce.htmltoapk.domain.model.BuildState;
import com.basitce.htmltoapk.domain.model.ProjectKind;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import n8.m1;
import org.jf.dexlib2.dexbacked.raw.CdexHeaderItem;
import org.jf.dexlib2.dexbacked.raw.HeaderItem;
import ph.l2;
import ph.v1;
import sh.a1;

/* loaded from: classes.dex */
public final class s0 extends androidx.lifecycle.a {

    /* renamed from: c, reason: collision with root package name */
    public final n8.s f8516c;

    /* renamed from: d, reason: collision with root package name */
    public final n8.l f8517d;

    /* renamed from: e, reason: collision with root package name */
    public final m1 f8518e;

    /* renamed from: f, reason: collision with root package name */
    public final h8.m f8519f;

    /* renamed from: g, reason: collision with root package name */
    public final ApkGenerator f8520g;

    /* renamed from: h, reason: collision with root package name */
    public final sh.z0 f8521h;

    /* renamed from: i, reason: collision with root package name */
    public final sh.z0 f8522i;

    /* renamed from: j, reason: collision with root package name */
    public final sh.z0 f8523j;

    /* renamed from: k, reason: collision with root package name */
    public final sh.z0 f8524k;

    /* renamed from: l, reason: collision with root package name */
    public final sh.z0 f8525l;

    /* renamed from: m, reason: collision with root package name */
    public final sh.z0 f8526m;

    /* renamed from: n, reason: collision with root package name */
    public final sh.y0<List<String>> f8527n;

    /* renamed from: o, reason: collision with root package name */
    public final sh.y0<List<String>> f8528o;

    /* renamed from: p, reason: collision with root package name */
    public final sh.y0<Integer> f8529p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f8530q;

    /* renamed from: r, reason: collision with root package name */
    public l2 f8531r;

    /* renamed from: s, reason: collision with root package name */
    public l2 f8532s;

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.project.build.BuildViewModel$1", f = "BuildViewModel.kt", l = {83}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f8533a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ androidx.lifecycle.l0 f8535c;

        /* renamed from: e9.s0$a$a, reason: collision with other inner class name */
        public static final class C0085a<T> implements sh.g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ androidx.lifecycle.l0 f8536a;

            public C0085a(androidx.lifecycle.l0 l0Var) {
                this.f8536a = l0Var;
            }

            @Override // sh.g
            public final Object c(Object obj, tg.e eVar) {
                this.f8536a.c((BuildState) obj, "buildState");
                return pg.f0.f21461a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.lifecycle.l0 l0Var, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f8535c = l0Var;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return s0.this.new a(this.f8535c, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
            return ug.a.f29706a;
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f8533a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
                throw new pg.g();
            }
            pg.q.b(obj);
            sh.z0 z0Var = s0.this.f8521h;
            C0085a c0085a = new C0085a(this.f8535c);
            this.f8533a = 1;
            z0Var.b(c0085a, this);
            return aVar;
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.project.build.BuildViewModel$2", f = "BuildViewModel.kt", l = {87}, m = "invokeSuspend")
    public static final class b extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f8537a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.lifecycle.l0 f8538b;

        public static final class a<T> implements sh.g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ androidx.lifecycle.l0 f8539a;

            public a(androidx.lifecycle.l0 l0Var) {
                this.f8539a = l0Var;
            }

            @Override // sh.g
            public final Object c(Object obj, tg.e eVar) {
                List listX = qg.x.X(30, (List) obj);
                ArrayList arrayList = new ArrayList(qg.p.h(listX, 10));
                Iterator<T> it = listX.iterator();
                while (it.hasNext()) {
                    arrayList.add(mh.y.b0(512, (String) it.next()));
                }
                this.f8539a.c(new ArrayList(arrayList), "buildLogs");
                return pg.f0.f21461a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(androidx.lifecycle.l0 l0Var, tg.e<? super b> eVar) {
            super(2, eVar);
            this.f8538b = l0Var;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new b(this.f8538b, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            ((b) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
            return ug.a.f29706a;
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f8537a;
            if (i10 == 0) {
                pg.q.b(obj);
                sh.y0<List<String>> logs = BuildLogger.INSTANCE.getLogs();
                a aVar2 = new a(this.f8538b);
                this.f8537a = 1;
                if (logs.b(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
            }
            throw new pg.g();
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.project.build.BuildViewModel$3", f = "BuildViewModel.kt", l = {HeaderItem.METHOD_START_OFFSET}, m = "invokeSuspend")
    public static final class c extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f8540a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.lifecycle.l0 f8541b;

        public static final class a<T> implements sh.g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ androidx.lifecycle.l0 f8542a;

            public a(androidx.lifecycle.l0 l0Var) {
                this.f8542a = l0Var;
            }

            @Override // sh.g
            public final Object c(Object obj, tg.e eVar) {
                List listX = qg.x.X(30, (List) obj);
                ArrayList arrayList = new ArrayList(qg.p.h(listX, 10));
                Iterator<T> it = listX.iterator();
                while (it.hasNext()) {
                    arrayList.add(mh.y.b0(512, (String) it.next()));
                }
                this.f8542a.c(new ArrayList(arrayList), "buildLogsEn");
                return pg.f0.f21461a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(androidx.lifecycle.l0 l0Var, tg.e<? super c> eVar) {
            super(2, eVar);
            this.f8541b = l0Var;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new c(this.f8541b, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            ((c) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
            return ug.a.f29706a;
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f8540a;
            if (i10 == 0) {
                pg.q.b(obj);
                sh.y0<List<String>> logsEn = BuildLogger.INSTANCE.getLogsEn();
                a aVar2 = new a(this.f8541b);
                this.f8540a = 1;
                if (logsEn.b(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
            }
            throw new pg.g();
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.project.build.BuildViewModel$retryWithCacheClear$1", f = "BuildViewModel.kt", l = {119, CdexHeaderItem.DEBUG_INFO_OFFSETS_TABLE_OFFSET}, m = "invokeSuspend")
    public static final class d extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f8543a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s0 f8544b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f8545c;

        @vg.e(c = "com.basitce.htmltoapk.ui.screens.project.build.BuildViewModel$retryWithCacheClear$1$1", f = "BuildViewModel.kt", l = {}, m = "invokeSuspend")
        public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ s0 f8546a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(s0 s0Var, tg.e<? super a> eVar) {
                super(2, eVar);
                this.f8546a = s0Var;
            }

            @Override // vg.a
            public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
                return new a(this.f8546a, eVar);
            }

            @Override // eh.p
            public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
                return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                Application application = this.f8546a.f2248b;
                ug.a aVar = ug.a.f29706a;
                pg.q.b(obj);
                try {
                    CacheManager cacheManager = CacheManager.INSTANCE;
                    kotlin.jvm.internal.r.c(application, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
                    CacheManager.cleanAllBuildCaches$default(cacheManager, application, 0L, 2, null);
                    kotlin.jvm.internal.r.c(application, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
                    cacheManager.clearAppCache(application);
                } catch (Exception unused) {
                }
                return pg.f0.f21461a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j10, s0 s0Var, tg.e eVar) {
            super(2, eVar);
            this.f8544b = s0Var;
            this.f8545c = j10;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new d(this.f8545c, this.f8544b, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
        
            if (ph.h.e(r7, r1, r6) == r0) goto L17;
         */
        @Override // vg.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f8543a;
            s0 s0Var = this.f8544b;
            if (i10 == 0) {
                pg.q.b(obj);
                l2 l2Var = s0Var.f8531r;
                if (l2Var != null) {
                    this.f8543a = 1;
                    if (v1.c(l2Var, this) != aVar) {
                    }
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pg.q.b(obj);
                    l2 l2Var2 = s0Var.f8531r;
                    if (l2Var2 != null) {
                        l2Var2.cancel((CancellationException) null);
                    }
                    s0Var.f8521h.setValue(BuildState.Idle.INSTANCE);
                    BuildLogger.INSTANCE.reset();
                    s0Var.f8530q = false;
                    s0Var.g(this.f8545c);
                    return pg.f0.f21461a;
                }
                pg.q.b(obj);
            }
            wh.c cVar = ph.z0.f21632a;
            wh.b bVar = wh.b.f31563c;
            a aVar2 = new a(s0Var, null);
            this.f8543a = 2;
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.project.build.BuildViewModel$startBuild$1", f = "BuildViewModel.kt", l = {141}, m = "invokeSuspend")
    public static final class e extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f8547a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s0 f8548b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f8549c;

        @vg.e(c = "com.basitce.htmltoapk.ui.screens.project.build.BuildViewModel$startBuild$1$1", f = "BuildViewModel.kt", l = {142}, m = "invokeSuspend")
        public static final class a extends vg.i implements eh.l<tg.e<? super pg.f0>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f8550a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Application f8551b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ s0 f8552c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ long f8553d;

            @vg.e(c = "com.basitce.htmltoapk.ui.screens.project.build.BuildViewModel$startBuild$1$1$1", f = "BuildViewModel.kt", l = {144, 156, 171}, m = "invokeSuspend")
            /* renamed from: e9.s0$e$a$a, reason: collision with other inner class name */
            public static final class C0086a extends vg.i implements eh.l<tg.e<? super pg.f0>, Object> {

                /* renamed from: a, reason: collision with root package name */
                public ProjectEntity f8554a;

                /* renamed from: b, reason: collision with root package name */
                public int f8555b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ s0 f8556c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ long f8557d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ Application f8558e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0086a(long j10, Application application, s0 s0Var, tg.e eVar) {
                    super(1, eVar);
                    this.f8556c = s0Var;
                    this.f8557d = j10;
                    this.f8558e = application;
                }

                @Override // vg.a
                public final tg.e<pg.f0> create(tg.e<?> eVar) {
                    return new C0086a(this.f8557d, this.f8558e, this.f8556c, eVar);
                }

                @Override // eh.l
                public final Object invoke(tg.e<? super pg.f0> eVar) {
                    return ((C0086a) create(eVar)).invokeSuspend(pg.f0.f21461a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:50:0x01db, code lost:
                
                    if (r0 == r9) goto L51;
                 */
                /* JADX WARN: Removed duplicated region for block: B:37:0x017d  */
                /* JADX WARN: Removed duplicated region for block: B:38:0x0180  */
                /* JADX WARN: Removed duplicated region for block: B:42:0x019c A[Catch: Exception -> 0x0025, CancellationException -> 0x0028, LOOP:0: B:40:0x0191->B:42:0x019c, LOOP_END, TryCatch #2 {CancellationException -> 0x0028, Exception -> 0x0025, blocks: (B:7:0x0020, B:16:0x0035, B:35:0x013c, B:39:0x0182, B:40:0x0191, B:42:0x019c, B:43:0x01b4, B:45:0x01bf, B:46:0x01c2, B:49:0x01d9, B:17:0x003a, B:23:0x004f, B:25:0x0054, B:27:0x0084, B:29:0x0092, B:20:0x0043), top: B:56:0x0018 }] */
                /* JADX WARN: Removed duplicated region for block: B:45:0x01bf A[Catch: Exception -> 0x0025, CancellationException -> 0x0028, TryCatch #2 {CancellationException -> 0x0028, Exception -> 0x0025, blocks: (B:7:0x0020, B:16:0x0035, B:35:0x013c, B:39:0x0182, B:40:0x0191, B:42:0x019c, B:43:0x01b4, B:45:0x01bf, B:46:0x01c2, B:49:0x01d9, B:17:0x003a, B:23:0x004f, B:25:0x0054, B:27:0x0084, B:29:0x0092, B:20:0x0043), top: B:56:0x0018 }] */
                /* JADX WARN: Removed duplicated region for block: B:48:0x01d8  */
                /* JADX WARN: Removed duplicated region for block: B:49:0x01d9 A[Catch: Exception -> 0x0025, CancellationException -> 0x0028, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x0028, Exception -> 0x0025, blocks: (B:7:0x0020, B:16:0x0035, B:35:0x013c, B:39:0x0182, B:40:0x0191, B:42:0x019c, B:43:0x01b4, B:45:0x01bf, B:46:0x01c2, B:49:0x01d9, B:17:0x003a, B:23:0x004f, B:25:0x0054, B:27:0x0084, B:29:0x0092, B:20:0x0043), top: B:56:0x0018 }] */
                @Override // vg.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object byId;
                    ProjectEntity projectEntity;
                    ProjectEntity projectEntity2;
                    File file;
                    String str;
                    File parentFile;
                    Object objE;
                    Application application = this.f8558e;
                    s0 s0Var = this.f8556c;
                    sh.z0 z0Var = s0Var.f8521h;
                    n8.s sVar = s0Var.f8516c;
                    ug.a aVar = ug.a.f29706a;
                    int i10 = this.f8555b;
                    long j10 = this.f8557d;
                    int i11 = 1;
                    try {
                    } catch (CancellationException e10) {
                        throw e10;
                    } catch (Exception e11) {
                        BuildState.Error error = new BuildState.Error(m3.a.a("Failed to start build: ", e11.getMessage()));
                        z0Var.getClass();
                        z0Var.j(null, error);
                    }
                    if (i10 == 0) {
                        pg.q.b(obj);
                        this.f8555b = 1;
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
                            return pg.f0.f21461a;
                        }
                        projectEntity2 = this.f8554a;
                        pg.q.b(obj);
                        projectEntity = projectEntity2;
                        s0Var.f8523j.setValue(projectEntity.getOutputFormat());
                        file = new File(application.getCacheDir(), "apk_output");
                        file.mkdirs();
                        String str2 = l9.m.a(projectEntity.getName()) + "_" + projectEntity.getVersionCode();
                        String str3 = kotlin.jvm.internal.r.a(projectEntity.getOutputFormat(), "aab") ? ".aab" : ".apk";
                        str = str2 + str3;
                        while (new File(file, str).exists()) {
                            str = str2 + "_" + i11 + str3;
                            i11++;
                        }
                        File file2 = new File(file, str);
                        parentFile = file2.getParentFile();
                        if (parentFile != null) {
                            parentFile.mkdirs();
                        }
                        this.f8554a = null;
                        this.f8555b = 3;
                        wh.c cVar = ph.z0.f21632a;
                        objE = ph.h.e(wh.b.f31563c, new v0(application, s0Var, projectEntity, file2, null), this);
                        if (objE != ug.a.f29706a) {
                            objE = pg.f0.f21461a;
                        }
                    }
                    ProjectEntity projectEntity3 = (ProjectEntity) byId;
                    if (projectEntity3 == null) {
                        BuildLogger.INSTANCE.error(R.string.build_log_project_not_found, new Long(j10));
                        BuildState.Error error2 = new BuildState.Error("Project not found (id=" + j10 + ")");
                        z0Var.getClass();
                        z0Var.j(null, error2);
                        return pg.f0.f21461a;
                    }
                    sh.z0 z0Var2 = s0Var.f8525l;
                    z0Var2.getClass();
                    z0Var2.j(null, projectEntity3);
                    if (projectEntity3.getAutoIncrementVersionCode()) {
                        ProjectEntity projectEntityCopy$default = ProjectEntity.copy$default(projectEntity3, 0L, null, null, null, projectEntity3.getVersionCode() + 1, null, 0, 0, null, null, null, null, null, null, null, null, null, false, false, false, false, false, null, null, null, null, false, false, null, false, null, null, null, false, false, false, false, null, 0, null, null, null, false, null, null, null, null, null, false, null, false, false, false, false, false, false, 0, 0, 0, 0, null, false, null, null, null, null, 0L, System.currentTimeMillis(), -17, -1, 7, null);
                        this.f8554a = projectEntityCopy$default;
                        this.f8555b = 2;
                        if (sVar.c(projectEntityCopy$default, this) == aVar) {
                            return aVar;
                        }
                        projectEntity2 = projectEntityCopy$default;
                        projectEntity = projectEntity2;
                        s0Var.f8523j.setValue(projectEntity.getOutputFormat());
                        file = new File(application.getCacheDir(), "apk_output");
                        file.mkdirs();
                        String str22 = l9.m.a(projectEntity.getName()) + "_" + projectEntity.getVersionCode();
                        if (kotlin.jvm.internal.r.a(projectEntity.getOutputFormat(), "aab")) {
                        }
                        str = str22 + str3;
                        while (new File(file, str).exists()) {
                        }
                        File file22 = new File(file, str);
                        parentFile = file22.getParentFile();
                        if (parentFile != null) {
                        }
                        this.f8554a = null;
                        this.f8555b = 3;
                        wh.c cVar2 = ph.z0.f21632a;
                        objE = ph.h.e(wh.b.f31563c, new v0(application, s0Var, projectEntity, file22, null), this);
                        if (objE != ug.a.f29706a) {
                        }
                    } else {
                        projectEntity = projectEntity3;
                        s0Var.f8523j.setValue(projectEntity.getOutputFormat());
                        file = new File(application.getCacheDir(), "apk_output");
                        file.mkdirs();
                        String str222 = l9.m.a(projectEntity.getName()) + "_" + projectEntity.getVersionCode();
                        if (kotlin.jvm.internal.r.a(projectEntity.getOutputFormat(), "aab")) {
                        }
                        str = str222 + str3;
                        while (new File(file, str).exists()) {
                        }
                        File file222 = new File(file, str);
                        parentFile = file222.getParentFile();
                        if (parentFile != null) {
                        }
                        this.f8554a = null;
                        this.f8555b = 3;
                        wh.c cVar22 = ph.z0.f21632a;
                        objE = ph.h.e(wh.b.f31563c, new v0(application, s0Var, projectEntity, file222, null), this);
                        if (objE != ug.a.f29706a) {
                        }
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(long j10, Application application, s0 s0Var, tg.e eVar) {
                super(1, eVar);
                this.f8551b = application;
                this.f8552c = s0Var;
                this.f8553d = j10;
            }

            @Override // vg.a
            public final tg.e<pg.f0> create(tg.e<?> eVar) {
                return new a(this.f8553d, this.f8551b, this.f8552c, eVar);
            }

            @Override // eh.l
            public final Object invoke(tg.e<? super pg.f0> eVar) {
                return ((a) create(eVar)).invokeSuspend(pg.f0.f21461a);
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                ug.a aVar = ug.a.f29706a;
                int i10 = this.f8550a;
                if (i10 == 0) {
                    pg.q.b(obj);
                    long j10 = this.f8553d;
                    Application application = this.f8551b;
                    C0086a c0086a = new C0086a(j10, application, this.f8552c, null);
                    this.f8550a = 1;
                    if (l9.l.f16852a.a(application, "BuildViewModel:startBuild", 1200000L, c0086a, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pg.q.b(obj);
                }
                return pg.f0.f21461a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(long j10, s0 s0Var, tg.e eVar) {
            super(2, eVar);
            this.f8548b = s0Var;
            this.f8549c = j10;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new e(this.f8549c, this.f8548b, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f8547a;
            s0 s0Var = this.f8548b;
            try {
                if (i10 == 0) {
                    pg.q.b(obj);
                    Application application = s0Var.f2248b;
                    kotlin.jvm.internal.r.c(application, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
                    BuildCoordinator buildCoordinator = BuildCoordinator.INSTANCE;
                    a aVar2 = new a(this.f8549c, application, s0Var, null);
                    this.f8547a = 1;
                    if (buildCoordinator.run(aVar2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pg.q.b(obj);
                }
                s0Var.f8530q = false;
                return pg.f0.f21461a;
            } catch (Throwable th2) {
                s0Var.f8530q = false;
                throw th2;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(Application application, n8.s projectRepository, n8.l keystoreRepository, m1 settingsRepository, h8.m aiProjectStore, androidx.lifecycle.l0 savedStateHandle) {
        super(application);
        kotlin.jvm.internal.r.e(projectRepository, "projectRepository");
        kotlin.jvm.internal.r.e(keystoreRepository, "keystoreRepository");
        kotlin.jvm.internal.r.e(settingsRepository, "settingsRepository");
        kotlin.jvm.internal.r.e(aiProjectStore, "aiProjectStore");
        kotlin.jvm.internal.r.e(savedStateHandle, "savedStateHandle");
        this.f8516c = projectRepository;
        this.f8517d = keystoreRepository;
        this.f8518e = settingsRepository;
        this.f8519f = aiProjectStore;
        this.f8520g = new ApkGenerator(application);
        sh.z0 z0VarA = a1.a(BuildState.Idle.INSTANCE);
        this.f8521h = z0VarA;
        this.f8522i = z0VarA;
        sh.z0 z0VarA2 = a1.a(ProjectKind.APK);
        this.f8523j = z0VarA2;
        this.f8524k = z0VarA2;
        sh.z0 z0VarA3 = a1.a(null);
        this.f8525l = z0VarA3;
        this.f8526m = z0VarA3;
        BuildLogger buildLogger = BuildLogger.INSTANCE;
        this.f8527n = buildLogger.getLogs();
        this.f8528o = buildLogger.getLogsEn();
        this.f8529p = buildLogger.getProgress();
        Object error = (BuildState) savedStateHandle.a("buildState");
        if (error != null && !(error instanceof BuildState.Idle)) {
            if (buildLogger.getLogs().getValue().isEmpty()) {
                List<String> list = (List) savedStateHandle.a("buildLogs");
                List<String> list2 = qg.z.f22752a;
                list = list == null ? list2 : list;
                List<String> list3 = (List) savedStateHandle.a("buildLogsEn");
                buildLogger.restore(list, list3 != null ? list3 : list2);
            }
            if (!(error instanceof BuildState.Error) && !(error instanceof BuildState.Success)) {
                buildLogger.error(R.string.build_error_interrupted, new Object[0]);
                String string = application.getString(R.string.build_error_interrupted);
                kotlin.jvm.internal.r.d(string, "getString(...)");
                error = new BuildState.Error(string);
            }
            z0VarA.j(null, error);
        }
        ph.h.c(androidx.lifecycle.x0.a(this), null, null, new a(savedStateHandle, null), 3);
        ph.h.c(androidx.lifecycle.x0.a(this), null, null, new b(savedStateHandle, null), 3);
        ph.h.c(androidx.lifecycle.x0.a(this), null, null, new c(savedStateHandle, null), 3);
    }

    public final void f(long j10) {
        l2 l2Var = this.f8532s;
        if (l2Var == null || !l2Var.isActive()) {
            this.f8532s = ph.h.c(androidx.lifecycle.x0.a(this), null, null, new d(j10, this, null), 3);
        }
    }

    public final void g(long j10) {
        l2 l2Var;
        if (this.f8530q || !((l2Var = this.f8531r) == null || l2Var.isCompleted())) {
            BuildLogger.INSTANCE.detail(R.string.build_log_build_already_running, new Object[0]);
            return;
        }
        this.f8530q = true;
        this.f8521h.setValue(BuildState.Idle.INSTANCE);
        this.f8531r = ph.h.c(androidx.lifecycle.x0.a(this), null, null, new e(j10, this, null), 3);
    }
}
